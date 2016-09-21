package other;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.LoginActivity;
import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.ParseException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import lottery.BaseActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

public class setting extends Activity implements OnClickListener, OnTouchListener {
	private Button btn_exit;
	private TextView text_newview;
	private TextView text_kaihu;
	private TextView text_bank;
	private TextView text_paypassword;
	private TextView text_loginpassword;
	private TextView text_online;
	private LinearLayout Lin_back;
	private BaseActivity BaseActivity;
	private SharedPreferences cookiesdetail;
	private SharedPreferences xinjiang;
	private String cookies;
	private String msg = "网络连接错误";
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				// getnew();
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
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.other_setting);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		btn_exit = (Button) findViewById(R.id.btn_exit);
		text_online = (TextView) findViewById(R.id.text_online);
		text_newview = (TextView) findViewById(R.id.text_newview);
		text_kaihu = (TextView) findViewById(R.id.text_kaihu);
		text_bank = (TextView) findViewById(R.id.text_bank);
		text_paypassword = (TextView) findViewById(R.id.text_paypassword);
		text_loginpassword = (TextView) findViewById(R.id.text_loginpassword);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		btn_exit.setOnClickListener(this);
		text_newview.setOnClickListener(this);
		text_kaihu.setOnClickListener(this);
		text_bank.setOnClickListener(this);
		text_paypassword.setOnClickListener(this);
		text_loginpassword.setOnClickListener(this);
		Lin_back.setOnClickListener(this);
		btn_exit.setOnTouchListener(this);
		text_newview.setOnTouchListener(this);
		text_kaihu.setOnTouchListener(this);
		text_bank.setOnTouchListener(this);
		text_paypassword.setOnTouchListener(this);
		text_loginpassword.setOnTouchListener(this);
		Lin_back.setOnTouchListener(this);
		text_online.setOnTouchListener(this);
		text_online.setOnClickListener(this);

	}

	protected void go() {
		// TODO Auto-generated method stub
		if (msg.length() <= 8) {
			Toast.makeText(setting.this, "" + msg, Toast.LENGTH_SHORT).show();
		} else {
			Intent intent = new Intent();
			intent.setAction("android.intent.action.VIEW");
			Uri content_url = Uri.parse(msg);
			intent.setData(content_url);
			startActivity(intent);
		}

	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.text_kaihu:
			int actionbtn_text_kaihu = event.getAction();
			if (actionbtn_text_kaihu == MotionEvent.ACTION_DOWN) {
				text_kaihu.setBackgroundColor(0xffF0F8FF);
			} else if (actionbtn_text_kaihu == MotionEvent.ACTION_UP) {
				text_kaihu.setBackgroundColor(0);
			} else if (actionbtn_text_kaihu == MotionEvent.ACTION_CANCEL) {
				text_kaihu.setBackgroundColor(0);
			}
			break;
		case R.id.text_online:
			int actionbtn_text_online = event.getAction();
			if (actionbtn_text_online == MotionEvent.ACTION_DOWN) {
				text_online.setBackgroundColor(0xffF0F8FF);
			} else if (actionbtn_text_online == MotionEvent.ACTION_UP) {
				text_online.setBackgroundColor(0);
			} else if (actionbtn_text_online == MotionEvent.ACTION_CANCEL) {
				text_online.setBackgroundColor(0);
			}
			break;
		case R.id.text_bank:
			int actionbtn_text_bank = event.getAction();
			if (actionbtn_text_bank == MotionEvent.ACTION_DOWN) {
				text_bank.setBackgroundColor(0xffF0F8FF);
			} else if (actionbtn_text_bank == MotionEvent.ACTION_UP) {
				text_bank.setBackgroundColor(0);
			} else if (actionbtn_text_bank == MotionEvent.ACTION_CANCEL) {
				text_bank.setBackgroundColor(0);
			}
			break;
		case R.id.text_paypassword:
			int actionbtn_text_paypassword = event.getAction();
			if (actionbtn_text_paypassword == MotionEvent.ACTION_DOWN) {
				text_paypassword.setBackgroundColor(0xffF0F8FF);
			} else if (actionbtn_text_paypassword == MotionEvent.ACTION_UP) {
				text_paypassword.setBackgroundColor(0);
			} else if (actionbtn_text_paypassword == MotionEvent.ACTION_CANCEL) {
				text_paypassword.setBackgroundColor(0);
			}
			break;
		case R.id.text_loginpassword:
			int actionbtn_text_loginpassword = event.getAction();
			if (actionbtn_text_loginpassword == MotionEvent.ACTION_DOWN) {
				text_loginpassword.setBackgroundColor(0xffF0F8FF);
			} else if (actionbtn_text_loginpassword == MotionEvent.ACTION_UP) {
				text_loginpassword.setBackgroundColor(0);
			} else if (actionbtn_text_loginpassword == MotionEvent.ACTION_CANCEL) {
				text_loginpassword.setBackgroundColor(0);
			}
			break;
		case R.id.btn_exit:
			int actionbtn_btn_exit = event.getAction();
			if (actionbtn_btn_exit == MotionEvent.ACTION_DOWN) {
				btn_exit.setTextColor(Color.WHITE);
			} else if (actionbtn_btn_exit == MotionEvent.ACTION_UP) {
				btn_exit.setTextColor(Color.BLACK);
			} else if (actionbtn_btn_exit == MotionEvent.ACTION_CANCEL) {
				btn_exit.setTextColor(Color.BLACK);
			}
			break;
		case R.id.text_newview:
			int actionbtn_text_newview = event.getAction();
			if (actionbtn_text_newview == MotionEvent.ACTION_DOWN) {
				text_newview.setBackgroundColor(0xffF0F8FF);
			} else if (actionbtn_text_newview == MotionEvent.ACTION_UP) {
				text_newview.setBackgroundColor(0);
			} else if (actionbtn_text_newview == MotionEvent.ACTION_CANCEL) {
				text_newview.setBackgroundColor(0);
			}
			break;
		default:
			break;
		}
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.text_kaihu:
			Intent intent = new Intent(setting.this, kaihuguanli.class);
			// resultCode---请求码
			startActivityForResult(intent, 1);
			break;
		case R.id.text_online:
			Intent intenttext_online = new Intent();
			intenttext_online.setAction("android.intent.action.VIEW");
			Uri content_url = Uri.parse(
					"http://f18.livechatvalue.com/chat/chatClient/chatbox.jsp?companyID=574598&configID=57216&lan=zh&jid=6189738685");
			intenttext_online.setData(content_url);
			startActivity(intenttext_online);
			break;
		case R.id.text_bank:
			Intent intent1 = new Intent(setting.this, bankguanli.class);
			// resultCode---请求码
			startActivityForResult(intent1, 1);
			break;
		case R.id.text_paypassword:
			Intent intent2 = new Intent(setting.this, paypassword.class);
			// resultCode---请求码
			startActivityForResult(intent2, 1);
			break;
		case R.id.text_loginpassword:
			Intent intent3 = new Intent(setting.this, loginpassword.class);
			// resultCode---请求码
			startActivityForResult(intent3, 1);
			break;
		case R.id.text_newview:
			getnewview();
			Log.e("hh", "jj");
			break;
		case R.id.Lin_back:
			finish();
			break;
		case R.id.btn_exit:
			Intent intent4 = new Intent(setting.this, LoginActivity.class);
			// resultCode---请求码
			startActivityForResult(intent4, 1);
			finish();
			BaseActivity.activity.finish();
			break;
		default:
			break;
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
}
