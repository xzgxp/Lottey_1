package lottery;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.net.ParseException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import dialog.dialogtwo;
import model.chongqingticketplan;
import other.setting;

/**
 * 项目的主Activity，所有的Fragment都嵌入在这里�?
 * 
 * @author
 */
public class BaseActivity extends FragmentActivity implements OnClickListener, OnTouchListener {

	private static final String TAG = "MainAc�?����tivity";
	public static Activity activity;
	public RecommendFragment RecommendFragment;
	private SharedPreferences cookiesdetail;
	private String cookies;
	private HallFragment HallFragment;

	private TrendFragment TrendFragment;

	private MineFragment MineFragment;

	private View recommendLayout, hallLayout, trendLayout, mineLayout;

	private ImageView recommendImage, hallImage, trendImage, mineImage;
	// private Calendar data;
	private TextView recommendText, hallText, mineText, trendText;
	private SharedPreferences pre;
	private SharedPreferences presymbel;
	private Boolean canuse = true;
	private int fragmentsymble = 0;
	/**
	 * 用于对Fragment进行管理
	 */
	private FragmentManager fragmentManager;
	private FragmentTransaction mFragmentTransaction;
	private LinearLayout lin_loading;
	public static String curFragmentTag;
	private int recommendtouch = 0;
	private int halltouch = 0;
	private int trendtouch = 0;
	private int minetouch = 0;
	private String[] city = { "chongqing", "jiangxi", "tianjin", "xinjiang" };
	private int selindex = 0;
	private int wight;
	private String msg = "网络连接错误";

	// @Override
	// public boolean onKeyDown(int keyCode, KeyEvent event) {
	// // TODO Auto-generated method stub
	// if (keyCode == KeyEvent.KEYCODE_BACK) {
	// Log.d("jn", "jh");
	// }
	// return false;
	// }

	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 4:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				showuse();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "hjj6666");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				go();
				Log.e("hsdh", "jj");
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_baseactivity);
		pre = getSharedPreferences("fragmentinfo", MODE_PRIVATE);
		presymbel = getSharedPreferences("presymbel", MODE_PRIVATE);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		activity = this;
		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		String DEVICE_ID = tm.getDeviceId();
		Log.e("DEVICE_ID", DEVICE_ID);
		// 初始化布�?元素
		initViews();
		// Date date = new Date();// 取时间BH
		// Calendar calendar = new GregorianCalendar();
		// calendar.setTime(date);
		// calendar.add(calendar.DATE, 1);// 把日期往后增加一天.整数往后推,负数往前移动
		// date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		wight = getWindow().getWindowManager().getDefaultDisplay().getWidth();
		fragmentManager = getSupportFragmentManager();
		// 第一次启动时默认选中第一个tab
		read();
		getnewview();
		if (selindex == 1) {
			RecommendFragment = (RecommendFragment) fragmentManager
					.findFragmentByTag(getString(R.string.word_recommend));
			HallFragment = (HallFragment) fragmentManager.findFragmentByTag(getString(R.string.word_hall));
			TrendFragment = (TrendFragment) fragmentManager.findFragmentByTag(getString(R.string.word_trend));
			MineFragment = (MineFragment) fragmentManager.findFragmentByTag(getString(R.string.word_mine));
			Log.d("selindex", "selindex" + selindex);
			setTabSelection(getString(R.string.word_recommend));
		} else if (selindex == 2) {
			RecommendFragment = (RecommendFragment) fragmentManager
					.findFragmentByTag(getString(R.string.word_recommend));
			HallFragment = (HallFragment) fragmentManager.findFragmentByTag(getString(R.string.word_hall));
			TrendFragment = (TrendFragment) fragmentManager.findFragmentByTag(getString(R.string.word_trend));
			MineFragment = (MineFragment) fragmentManager.findFragmentByTag(getString(R.string.word_mine));
			Log.d("selindex", "selindex" + selindex);
			setTabSelection(getString(R.string.word_hall));
		} else if (selindex == 3) {
			Log.d("selindex", "selindex" + selindex);
			setTabSelection(getString(R.string.word_trend));
		} else if (selindex == 4) {
			Log.d("selindex", "selindex" + selindex);
			setTabSelection(getString(R.string.word_mine));
		} else if (selindex == 0) {
			Log.d("selindex", "selindex" + selindex);
			setCurrentFragment();
		}

	}

	private void readaymbel() {
		// TODO Auto-generated method stub
		fragmentsymble = presymbel.getInt("fragmentsymble", 0);
	}

	private void read() {
		// TODO Auto-generated method stub
		selindex = pre.getInt("fragment", 0);
		Log.d("selindex", "selindex" + "read" + selindex);
	}

	/**
	 * 在这里获取到每个�?要用到的控件的实例，并给它们设置好必要的点击事件�?
	 */
	private void initViews() {
		chongqingticketplan.no[1] = "1111111";
		lin_loading = (LinearLayout) findViewById(R.id.lin_loading);
		recommendLayout = findViewById(R.id.recommend_layout);
		hallLayout = findViewById(R.id.hall_layout);
		trendLayout = findViewById(R.id.trend_layout);
		mineLayout = findViewById(R.id.mine_layout);
		recommendImage = (ImageView) findViewById(R.id.recommend_image);
		hallImage = (ImageView) findViewById(R.id.hall_image);
		trendImage = (ImageView) findViewById(R.id.trend_image);
		mineImage = (ImageView) findViewById(R.id.mine_image);
		recommendText = (TextView) findViewById(R.id.recommend_text);
		hallText = (TextView) findViewById(R.id.hall_text);
		trendText = (TextView) findViewById(R.id.trend_text);
		mineText = (TextView) findViewById(R.id.mine_text);
		recommendLayout.setOnClickListener(this);
		hallLayout.setOnClickListener(this);
		trendLayout.setOnClickListener(this);
		mineLayout.setOnClickListener(this);
		recommendLayout.setOnTouchListener(this);
		hallLayout.setOnTouchListener(this);
		trendLayout.setOnTouchListener(this);
		mineLayout.setOnTouchListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.recommend_layout:
			// 当点击了消息tab时，选中�?1个tab
			write(1);
			setTabSelection(getString(R.string.word_recommend));

			break;
		case R.id.hall_layout:
			// 当点击了联系人tab时，选中�?2个tab
			write(2);
			setTabSelection(getString(R.string.word_hall));
			break;
		case R.id.trend_layout:
			// 当点击了动�?�tab时，选中�?3个tab
			write(3);
			setTabSelection(getString(R.string.word_trend));
			break;
		case R.id.mine_layout:
			// 当点击了设置tab时，选中�?4个tab
			write(4);
			setTabSelection(getString(R.string.word_mine));
			break;
		default:
			break;
		}
	}

	public boolean onTouch(View v, MotionEvent event) {
		switch (v.getId()) {
		case R.id.recommend_layout:
			int action = event.getAction();// �¼�����
			if (recommendtouch == 0) {
				if (action == MotionEvent.ACTION_DOWN) {// ����
					Log.d("hgcjhcj", "jjjjjj");
					recommendLayout.setBackgroundResource(R.drawable.tab_pressed);
				} else if (action == MotionEvent.ACTION_UP) {// �ɿ�
					recommendLayout.setBackgroundResource(R.drawable.bg_basket);
				}
			}

			break;
		case R.id.hall_layout:
			// 当点击了联系人tab时，选中�?2个tab
			int action1 = event.getAction();// �¼�����
			if (halltouch == 0) {
				if (action1 == MotionEvent.ACTION_DOWN) {// ����
					Log.d("hgcjhcj", "jjjjjj");
					hallLayout.setBackgroundResource(R.drawable.tab_pressed);
				} else if (action1 == MotionEvent.ACTION_UP) {// �ɿ�
					hallLayout.setBackgroundResource(R.drawable.bg_basket);
				}
			}

			break;
		case R.id.trend_layout:
			// 当点击了动�?�tab时，选中�?3个tab
			int action2 = event.getAction();// �¼�����
			if (trendtouch == 0) {
				if (action2 == MotionEvent.ACTION_DOWN) {// ����
					Log.d("hgcjhcj", "jjjjjj");
					trendLayout.setBackgroundResource(R.drawable.tab_pressed);
				} else if (action2 == MotionEvent.ACTION_UP) {// �ɿ�
					trendLayout.setBackgroundResource(R.drawable.bg_basket);
				}
			}

			break;
		case R.id.mine_layout:
			// 当点击了设置tab时，选中�?4个tab
			int action3 = event.getAction();// �¼�����
			if (minetouch == 0) {
				if (action3 == MotionEvent.ACTION_DOWN) {// ����
					mineLayout.setBackgroundResource(R.drawable.tab_pressed);
				} else if (action3 == MotionEvent.ACTION_UP) {// �ɿ�
					mineLayout.setBackgroundResource(R.drawable.bg_basket);
				}
			}
			break;
		default:
			break;
		}
		return false;

	}

	private void setCurrentFragment() {
		clearSelection();
		mFragmentTransaction = fragmentManager.beginTransaction();
		recommendImage.setImageResource(R.drawable.recommend_pressed);
		recommendText.setTextColor(Color.WHITE);
		recommendLayout.setBackgroundResource(R.drawable.tab_pressed);
		recommendtouch = 1;
		halltouch = 0;
		trendtouch = 0;
		minetouch = 0;
		write(1);
		if (RecommendFragment == null) {
			// 如果RecommendFragment为空，则创建�?个并添加到界面上
			RecommendFragment = new RecommendFragment();
			// transaction.add(0, RecommendFragment);
			mFragmentTransaction.add(R.id.content, RecommendFragment, getString(R.string.word_recommend));
			commitTransactions();
		}
		curFragmentTag = getString(R.string.word_recommend);
	}

	private void write(int i) {
		// TODO Auto-generated method stub
		Editor edit = pre.edit();
		edit.putInt("fragment", i);
		edit.commit();
	}

	/**
	 * 根据传入的tag参数来设置�?�中的tab页�??
	 * 
	 * @param tag
	 * 
	 */
	public void setTabSelection(String tag) {
		// 每次选中之前先清楚掉上次的�?�中状�??
		clearSelection();
		// �?启一个Fragment事务
		mFragmentTransaction = fragmentManager.beginTransaction();
		Log.e("setTagSele", "currentTag" + curFragmentTag + "-----tag----" + tag);
		if (TextUtils.equals(tag, getString(R.string.word_recommend))) {
			// 当点击了消息tab时，改变控件的图片和文字颜色
			recommendImage.setImageResource(R.drawable.recommend_pressed);
			recommendText.setTextColor(Color.WHITE);
			recommendLayout.setBackgroundResource(R.drawable.tab_pressed);
			recommendtouch = 1;
			halltouch = 0;
			trendtouch = 0;
			minetouch = 0;
			if (RecommendFragment == null) {
				RecommendFragment = new RecommendFragment();
			}

		} else if (TextUtils.equals(tag, getString(R.string.word_hall))) {
			hallImage.setImageResource(R.drawable.hall_pressed);
			hallText.setTextColor(Color.WHITE);
			hallLayout.setBackgroundResource(R.drawable.tab_pressed);
			recommendtouch = 0;
			halltouch = 1;
			trendtouch = 0;
			minetouch = 0;
			Log.e(TAG, "contact");
			if (HallFragment == null) {
				HallFragment = new HallFragment();
			}

		} else if (TextUtils.equals(tag, getString(R.string.word_trend))) {
			trendImage.setImageResource(R.drawable.trend_pressed);
			trendText.setTextColor(Color.WHITE);
			trendLayout.setBackgroundResource(R.drawable.tab_pressed);
			recommendtouch = 0;
			halltouch = 0;
			trendtouch = 1;
			minetouch = 0;
			if (TrendFragment == null) {
				TrendFragment = new TrendFragment();
			}

		} else if (TextUtils.equals(tag, getString(R.string.word_mine))) {
			mineImage.setImageResource(R.drawable.mine_pressed);
			mineText.setTextColor(Color.WHITE);
			mineLayout.setBackgroundResource(R.drawable.tab_pressed);
			recommendtouch = 0;
			halltouch = 0;
			trendtouch = 0;
			minetouch = 1;
			if (MineFragment == null) {
				MineFragment = new MineFragment();
			}
		}
		switchFragment(tag);

	}

	public void switchFragment(String tag) {
		if (TextUtils.equals(tag, curFragmentTag)) {
			Log.e("switchFragment", "curTag == tag");
			return;
		}

		if (curFragmentTag != null) {
			detachFragment(getFragment(curFragmentTag));

		}
		attachFragment(R.id.content, getFragment(tag), tag);
		curFragmentTag = tag;
		Log.e(" after switchFrag", "currenttag--->" + curFragmentTag);
		commitTransactions();
	}

	private void detachFragment(Fragment f) {

		if (f != null && !f.isDetached()) {
			Log.d("detachFragment-->", f.getTag());
			ensureTransaction();
			mFragmentTransaction.detach(f);
		}
	}

	private FragmentTransaction ensureTransaction() {
		if (mFragmentTransaction == null) {
			mFragmentTransaction = fragmentManager.beginTransaction();
			mFragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

		}
		return mFragmentTransaction;

	}

	private void attachFragment(int layout, Fragment f, String tag) {
		if (f != null) {
			if (f.isDetached()) {
				ensureTransaction();
				mFragmentTransaction.attach(f);

			} else if (!f.isAdded()) {
				ensureTransaction();
				mFragmentTransaction.add(layout, f, tag);
			}
		}
	}

	private void commitTransactions() {
		if (mFragmentTransaction != null && !mFragmentTransaction.isEmpty()) {
			mFragmentTransaction.commit();
			mFragmentTransaction = null;
		}
	}

	private Fragment getFragment(String tag) {

		Fragment f = fragmentManager.findFragmentByTag(tag);

		if (f == null) {
			// Toast.makeText(getApplicationContext(), "fragment == null",
			// Toast.LENGTH_SHORT).show();

			f = BaseFragment.newInstance(getApplicationContext(), tag);
		}
		return f;

	}

	/**
	 * 清除掉所有的选中状�?��??
	 */
	private void clearSelection() {
		recommendImage.setImageResource(R.drawable.recommend_normal);
		recommendLayout.setBackgroundResource(R.drawable.bg_basket);
		recommendText.setTextColor(Color.parseColor("#82858b"));
		hallImage.setImageResource(R.drawable.hall_normal);
		hallLayout.setBackgroundResource(R.drawable.bg_basket);
		hallText.setTextColor(Color.parseColor("#82858b"));
		trendImage.setImageResource(R.drawable.trend_normal);
		trendLayout.setBackgroundResource(R.drawable.bg_basket);
		trendText.setTextColor(Color.parseColor("#82858b"));
		mineImage.setImageResource(R.drawable.mine_normal);
		mineLayout.setBackgroundResource(R.drawable.bg_basket);
		mineText.setTextColor(Color.parseColor("#82858b"));
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		endloading();
		readaymbel();
		getuse();
		if (fragmentsymble == 1) {
			setTabSelection(getString(R.string.word_mine));
			Editor edit = presymbel.edit();
			edit.putInt("fragmentsymble", 0);
			edit.commit();
			Log.e(TAG, "presymbelfragmentsymble----->");
		}

		Log.e(TAG, "onStart----->");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		endloading();
		readaymbel();
		Log.e(TAG, "onresume---->");
		if (fragmentsymble == 1) {
			BaseActivity.curFragmentTag = getString(R.string.word_mine);

		} else {
			BaseActivity.curFragmentTag = getString(R.string.word_recommend);
		}

	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG, "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG, "onStop");
		endloading();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		write(0);
		Log.e(TAG, "ondestory");
	}

	public void showloading() {
		lin_loading.setVisibility(View.VISIBLE);

	}

	public void endloading() {
		lin_loading.setVisibility(View.GONE);

	}

	// public void goshowload() {
	// Animation anim = AnimationUtils.loadAnimation(this,
	// R.animator.round_loading);
	//
	// findViewById(R.id.loadingBtn).startAnimation(anim);
	// }
	private void getuse() {
		// TODO Auto-generated method stub
		cookies = cookiesdetail.getString("cookies", "");
		// nameValuePairs.add(new BasicNameValuePair("page", "1"));
		// Log.d("selindex", "selindex" + "read" + selindex);
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;
				DefaultHttpClient httpClient = new DefaultHttpClient();
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/CanUse");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				try {
					HttpResponse httpResponse;
					httpResponse = httpClient.execute(httpPost);
					is = httpResponse.getEntity().getContent();
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							canuse = json_data.getBoolean("r");
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("no");
							// value[i] = json_data.getString("value");
						}
						Message msg1 = new Message();
						// // // 便我们做出不同的处理操作
						msg1.what = 4;

						// 我们可以通过arg1和arg2给Message传入简单的数据
						msg1.arg1 = 123;
						msg1.arg2 = 321;
						// 我们也可以通过给obj赋值Object类型传递向Message传入任意数据
						// msg.obj = null;
						// 我们还可以通过setData方法和getData方法向Message中写入和读取Bundle类型的数据
						// msg.setData(null);
						// Bundle data = msg.getData();

						// 将该Message发送给对应的Handler
						uiHandler.sendMessage(msg1);
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					// getCookie(httpClient);
					return jsonString;

				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return null;
			}

			// protected void onPostExecute(String result) {
			// tvList.setText(result);
			// };

		}.execute();
	}

	private void showuse() {
		// TODO Auto-generated method stub
		if (canuse) {

		} else {
			showAlertDialog("服务器暂停服务，见谅！");
			Stastshowtime();
		}
	}

	private void getnewview() {
		// TODO Auto-generated method stub
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("no", "2.0"));
		// nameValuePairs.add(new BasicNameValuePair("page", "1"));
		// Log.d("selindex", "selindex" + "read" + selindex);
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;
				// TODO Auto-generated method stub
				DefaultHttpClient httpClient = new DefaultHttpClient();
				// /Log.d("TabAFragment", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/PhoneVersion");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				// Log.d("TabAFragment", "111");
				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					// Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					// Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							msg = json_data.getString("msg");
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("no");
							// value[i] = json_data.getString("value");
						}
						Message msg1 = new Message();
						// // // 便我们做出不同的处理操作
						msg1.what = 2;

						// 我们可以通过arg1和arg2给Message传入简单的数据
						msg1.arg1 = 123;
						msg1.arg2 = 321;
						// 我们也可以通过给obj赋值Object类型传递向Message传入任意数据
						// msg.obj = null;
						// 我们还可以通过setData方法和getData方法向Message中写入和读取Bundle类型的数据
						// msg.setData(null);
						// Bundle data = msg.getData();

						// 将该Message发送给对应的Handler
						uiHandler.sendMessage(msg1);
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					// getCookie(httpClient);
					return jsonString;

				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return null;
			}

			// protected void onPostExecute(String result) {
			// tvList.setText(result);
			// };

		}.execute();
	}

	protected void go() {
		// TODO Auto-generated method stub
		if (msg.length() <= 10) {
			// Toast.makeText(BaseActivity.this, "" + msg,
			// Toast.LENGTH_SHORT).show();
		} else {
			showAlertDialognonumber1("有新版本，是否更新？");
		}

	}

	public void showAlertDialognonumber1(String str) {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage(str);
		builder.setTitle("提示");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				// 设置你的操作事项
				Intent intent = new Intent();
				intent.setAction("android.intent.action.VIEW");
				Uri content_url = Uri.parse(msg);
				intent.setData(content_url);
				startActivity(intent);
			}
		});

		builder.setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		builder.create().show();

	}

	public void showAlertDialog(String str) {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage(str);
		builder.setTitle("提示");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				// 设置你的操作事项
				finish();
			}
		});

		builder.setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				finish();
			}
		});

		builder.create().show();

	}

	private void Stastshowtime() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				finish();
			}

		}, 10000);
	}
}
