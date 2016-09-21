package lottery;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
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

import android.R.raw;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import other.chongzhi;
import other.kaihuguanli;
import other.message;
import other.setting;
import other.tixian;
import other.zhuanzhang;
import other.zijinmingxi;
import ticketpackage.test;
import trend.chongqing;

public class MineFragment extends BaseFragment implements OnClickListener {
	public MainViewPager viewPager;
	public List<Fragment> fragments = new ArrayList<Fragment>();
	public String hello = "hello ";
	private TextView mTab1, mTab2, mTab3, mTab4;
	// private ImageView mTabImg;
	private SharedPreferences cookiesdetail;
	private SharedPreferences userinfo;
	private String cookies;
	private int currIndex = 0;// 当前页卡编号
	private int zero = 0;// 动画图片偏移量
	private int one;// 单个水平动画位移
	private int two;
	private int three;
	private FragmentManager fragmentManager;
	private int displayWidth, displayHeight;
	private LinearLayout lin_message;
	private TextView text_username;
	private LinearLayout lin_set;
	private TextView text_yue;
	private TextView text_kaihuguanli;
	private LinearLayout lin_chongzhi;
	private LinearLayout lin_tixian;
	private LinearLayout lin_zijinmingxi;
	private LinearLayout lin_zhuanzhang;
	private String username = "";
	private String rmb = "";
	private String sscrmb = "";
	private String SscReturn = "0.0";
	private String Shiyi5Rmb = "0.0";
	private String Shiyi5Return = "0.0";
	private String DipinRmb = "0.0";
	private String DipinReturn = "0.0";
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				getnew();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "hjj6666");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				go();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}

	};
	static int minute = -1;
	static int second = -1;
	final static String tag = "tag";
	// TextView timeView;
	Timer timer;
	TimerTask timerTask;
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			// System.out.println("minute!");
			if (minute == 0) {
				if (second == 0) {
					minute = 0;
					second = 20;
					// timeView.setText("Time out !");
					Message msg1 = new Message();
					// // 便我们做出不同的处理操作
					msg1.what = 1;

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
					if (timer != null) {
						timer.cancel();
						timer = null;
					}
					if (timerTask != null) {
						timerTask = null;
					}
					timerTask = new TimerTask() {

						@Override
						public void run() {
							Message msg = new Message();
							msg.what = 0;
							handler.sendMessage(msg);
						}
					};

					timer = new Timer();
					timer.schedule(timerTask, 0, 1000);
				} else {
					second--;
					if (second >= 10) {
						// timeView.setText("0" + minute + ":" + second);
					} else {
						// timeView.setText("0" + minute + ":0" + second);
					}
				}
			} else {
				if (second == 0) {
					second = 59;
					minute--;
					if (minute >= 10) {
						// timeView.setText(minute + ":" + second);
					} else {
						// timeView.setText("0" + minute + ":" + second);
					}
				} else {
					second--;
					if (second >= 10) {
						if (minute >= 10) {
							// timeView.setText(minute + ":" + second);
						} else {
							// timeView.setText("0" + minute + ":" + second);
						}
					} else {
						if (minute >= 10) {
							// timeView.setText(minute + ":0" + second);
						} else {
							// timeView.setText("0" + minute + ":0" + second);
						}
					}
				}
			}
		};
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.e("gggg", "yyy1");
		View view = inflater.inflate(R.layout.mywonder1, container, false);
		Log.e("gggg", "yyy2");
		Display currDisplay = getActivity().getWindowManager().getDefaultDisplay();// 获取屏幕当前分辨率
		displayWidth = currDisplay.getWidth();
		displayHeight = currDisplay.getHeight();
		one = displayWidth / 4; // 设置水平动画平移大小
		two = one * 2;
		three = one * 3;
		userinfo = getActivity().getSharedPreferences("userinfo", Context.MODE_PRIVATE);
		cookiesdetail = getActivity().getSharedPreferences("cookies", Context.MODE_PRIVATE);
		initViews(view);// 初始化控件
		fragments.clear();
		fragments.add(new TabAFragment());
		fragments.add(new TabBFragment());
		fragments.add(new TabCFragment());
		fragments.add(new TabDFragment());
		Log.e("gggg", "yyy");
		fragmentManager = getActivity().getSupportFragmentManager();

		Log.e("gggg", "yyy3");
		viewPager = (MainViewPager) view.findViewById(R.id.viewPager);
		// // viewPager.setSlipping(false);//设置ViewPager是否可以滑动
		// Log.e("gggg", "yyy4");
		viewPager.setOffscreenPageLimit(4);
		// Log.e("gggg", "yyy5");
		viewPager.setOnPageChangeListener(new MyOnPageChangeListener());
		// Log.e("gggg", "yyy6");
		viewPager.setAdapter(new MyPagerAdapter());
		Log.e("gggg", "yyy7");
		getnew();
		gonot();
		return view;
	}

	private void initViews(View view) {
		// TODO Auto-generated method stub
		final LinearLayout tab1Layout = (LinearLayout) view.findViewById(R.id.tab1Layout);
		mTab1 = (TextView) view.findViewById(R.id.mTab1);
		mTab2 = (TextView) view.findViewById(R.id.mTab2);
		mTab3 = (TextView) view.findViewById(R.id.mTab3);
		mTab4 = (TextView) view.findViewById(R.id.mTab4);
		// mTabImg = (ImageView) view.findViewById(R.id.img_tab_now);
		mTab1.setOnClickListener(new MyOnClickListener(0));
		mTab2.setOnClickListener(new MyOnClickListener(1));
		mTab3.setOnClickListener(new MyOnClickListener(2));
		mTab4.setOnClickListener(new MyOnClickListener(3));
		lin_message = (LinearLayout) view.findViewById(R.id.lin_message);
		text_username = (TextView) view.findViewById(R.id.text_username);
		lin_set = (LinearLayout) view.findViewById(R.id.lin_set);
		text_yue = (TextView) view.findViewById(R.id.text_yue);
		text_kaihuguanli = (TextView) view.findViewById(R.id.text_kaihuguanli);
		lin_chongzhi = (LinearLayout) view.findViewById(R.id.lin_chongzhi);
		lin_tixian = (LinearLayout) view.findViewById(R.id.lin_tixian);
		lin_zijinmingxi = (LinearLayout) view.findViewById(R.id.lin_zijinmingxi);
		lin_zhuanzhang = (LinearLayout) view.findViewById(R.id.lin_zhuanzhang);
		lin_message.setOnClickListener(this);
		lin_set.setOnClickListener(this);
		text_kaihuguanli.setOnClickListener(this);
		lin_chongzhi.setOnClickListener(this);
		lin_tixian.setOnClickListener(this);
		lin_zijinmingxi.setOnClickListener(this);
		lin_zhuanzhang.setOnClickListener(this);
		// 以下是设置移动条的初始位置
		// RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams)
		// mTabImg.getLayoutParams();
		int[] location = new int[2];
		mTab1.getLocationInWindow(location);
		int marginLeft = (displayWidth / 4 - 122) / 2;// 122是tab下面移动条的宽度
		// lp.setMargins(marginLeft, 0, 0, 0);
		// mTabImg.setLayoutParams(lp);
		// mTabImg.setVisibility(View.VISIBLE);
	}

	private void InitData() {
	}

	private void InitView(View view) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		super.onDestroy();
	}

	@Override
	public void onStart() {
		gonot();
		// TODO Auto-generated method stub
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		minute = 0;
		second = 20;
		timerTask = new TimerTask() {

			@Override
			public void run() {
				Message msg = new Message();
				msg.what = 0;
				handler.sendMessage(msg);
			}
		};

		timer = new Timer();
		timer.schedule(timerTask, 0, 1000);
		super.onStart();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// InitLisennner();
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		BaseActivity.curFragmentTag = getString(R.string.word_mine);
	}

	private void InitLisennner() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// viewPager.setCurrentItem(index);
		switch (v.getId()) {
		case R.id.lin_message:
			Intent intent = new Intent(getActivity(), message.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent);
			break;
		case R.id.lin_set:
			Intent intent1 = new Intent(getActivity(), setting.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent1);
			break;
		case R.id.text_kaihuguanli:
			Intent intent2 = new Intent(getActivity(), kaihuguanli.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent2);
			break;
		case R.id.lin_chongzhi:
			Intent intent3 = new Intent(getActivity(), chongzhi.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent3);
			break;
		case R.id.lin_tixian:
			Intent intent4 = new Intent(getActivity(), tixian.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent4);
			break;
		case R.id.lin_zijinmingxi:
			Intent intent5 = new Intent(getActivity(), zijinmingxi.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent5);
			break;
		case R.id.lin_zhuanzhang:
			Intent intent6 = new Intent(getActivity(), zhuanzhang.class);
			// b.putString("ordertype", "baojie");
			startActivity(intent6);
			break;
		default:
			break;
		}
	}

	public class MyOnPageChangeListener implements OnPageChangeListener {
		@Override
		public void onPageSelected(int arg0) {
			Animation animation = null;
			Log.d("ddddd", "rrrr");
			int temp = 0;
			switch (arg0) {
			case 0:
				Log.d("ddddd", "rrttttrr");
				mTab1.setBackgroundColor(0);
				if (currIndex == 1) {
					animation = new TranslateAnimation(one, 0, 0, 0);
					mTab2.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, 0, 0, 0);
					mTab3.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 3) {
					animation = new TranslateAnimation(three, 0, 0, 0);
					mTab4.setBackgroundColor(0XffDEDEDE);
				}
				temp++;
				break;
			case 1:
				Log.d("ddddd", "rrttttrr");
				mTab2.setBackgroundColor(0);
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, one, 0, 0);
					mTab1.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, one, 0, 0);
					mTab3.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 3) {
					animation = new TranslateAnimation(three, one, 0, 0);
					mTab4.setBackgroundColor(0XffDEDEDE);
				}
				temp++;
				break;
			case 2:
				Log.d("ddddd", "rrttttrr");
				mTab3.setBackgroundColor(0);
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, two, 0, 0);
					mTab1.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, two, 0, 0);
					mTab2.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 3) {
					animation = new TranslateAnimation(three, two, 0, 0);
					mTab4.setBackgroundColor(0XffDEDEDE);
				}
				temp++;
				break;
			case 3:
				Log.d("ddddd", "rrttttrr");
				mTab4.setBackgroundColor(0);
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, three, 0, 0);
					mTab1.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, three, 0, 0);
					mTab2.setBackgroundColor(0XffDEDEDE);
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, three, 0, 0);
					mTab3.setBackgroundColor(0XffDEDEDE);
				}
				temp++;
				break;
			default:
				break;
			}

			if (temp == 0) {
			}
			currIndex = arg0;
			animation.setFillAfter(true);// True:图片停在动画结束位置
			animation.setDuration(150);
			// mTabImg.startAnimation(animation);
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
	}

	/**
	 * @ClassName: MyOnClickListener
	 * @Description: TODO头标点击监听
	 * @author Panyy
	 * @date 2013 2013年11月6日 下午2:46:08
	 *
	 */
	private class MyOnClickListener implements View.OnClickListener {
		private int index = 0;

		public MyOnClickListener(int i) {
			index = i;
		}

		@Override
		public void onClick(View v) {
			viewPager.setCurrentItem(index);
		}
	};

	/**
	 * @ClassName: MyPagerAdapter
	 * @Description: TODO填充ViewPager的数据适配器
	 * @author Panyy
	 * @date 2013 2013年11月6日 下午2:37:47
	 *
	 */
	private class MyPagerAdapter extends PagerAdapter {
		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// / Log.e("gggg", "qqq");
			return arg0 == arg1;
		}

		@Override
		public int getCount() {
			// Log.e("gggg", "qqq1");
			return fragments.size();
		}

		@Override
		public void destroyItem(View container, int position, Object object) {
			// Log.e("gggg", "qqq2");
			((ViewPager) container).removeView(fragments.get(position).getView());
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// Log.e("gggg", "qqq3");
			Fragment fragment = fragments.get(position);
			// Log.e("gggg", "qqq4");
			if (!fragment.isAdded()) { // 如果fragment还没有added
				// Log.e("gggg", "qqq5");
				FragmentTransaction ft = fragmentManager.beginTransaction();
				// Log.e("gggg", "qqq6");
				ft.add(fragment, fragment.getClass().getSimpleName());
				// / Log.e("gggg", "qqq7");
				ft.commit();
				/**
				 * 在用FragmentTransaction.commit()方法提交FragmentTransaction对象后
				 * 会在进程的主线程中,用异步的方式来执行。 如果想要立即执行这个等待中的操作,就要调用这个方法(只能在主线程中调用)。
				 * 要注意的是,所有的回调和相关的行为都会在这个调用中被执行完成,因此要仔细确认这个方法的调用位置。
				 */
				// Log.e("gggg", "qqq8");
				fragmentManager.executePendingTransactions();
				// Log.e("gggg", "qqq9");
			}

			if (fragment.getView().getParent() == null) {
				container.addView(fragment.getView()); // 为viewpager增加布局
			}
			return fragment.getView();
		}

	};

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		// getActivity().f
		viewPager.setCurrentItem(0);
		// Log.e("哈哈是", "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		viewPager.setCurrentItem(0);
		// Log.e("挂号费", "onStop");
	}

	public void getnew() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("pagesize", "100"));
		nameValuePairs.add(new BasicNameValuePair("page", "1"));
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
				// Log.d("TabAFragment", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/UserInfo");
				// Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				// Log.d("TabAFragment", "111");
				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					// Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					// Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					// Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = getstandard(jsonString);
					// Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							Log.d("dfsd", "dfs");
							username = json_data.getString("UserName");
							rmb = json_data.getString("Rmb");
							sscrmb = json_data.getString("SscRmb");
							SscReturn = json_data.getString("SscReturn");
							Shiyi5Rmb = json_data.getString("Shiyi5Rmb");
							Shiyi5Return = json_data.getString("Shiyi5Return");
							DipinRmb = json_data.getString("DipinRmb");
							DipinReturn = json_data.getString("DipinReturn");
							// Log.d("username", username);
							// Log.d("rmb", "dfs" + rmb);
							// Log.d("sscrmb", "dfs" + sscrmb);
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

	public String getstandard(String str) {
		String t[] = str.split("");
		int temp = 0;
		str = "[" + str + "]";
		return str;
	}

	private void go() {
		// TODO Auto-generated method stub
		text_username.setText(username);
		text_yue.setText(sscrmb + "元");
		Editor edit = userinfo.edit();// �� cookies �浽����
		edit.putString("rmb", rmb);
		edit.putString("sscrmb", sscrmb);
		edit.putString("username", username);
		edit.putString("SscReturn", SscReturn);
		edit.putString("Shiyi5Rmb", Shiyi5Rmb);
		edit.putString("Shiyi5Return", Shiyi5Return);
		edit.putString("DipinRmb", DipinRmb);
		edit.putString("DipinReturn", DipinReturn);
		edit.commit();
	}

	private void gonot() {
		// TODO Auto-generated method stub
		username = userinfo.getString("username", "username");
		rmb = userinfo.getString("rmb", "00000");
		sscrmb = userinfo.getString("sscrmb", "00000");
		text_username.setText(username);
		text_yue.setText(sscrmb + "元");
	}
}
