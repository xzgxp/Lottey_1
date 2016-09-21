package com.example.entertiment;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.URLContainer;
import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;
import android.view.Menu;
import android.view.Window;
import android.widget.Toast;
import lottery.BaseActivity;

public class MainActivity extends Activity {
	private int temp = 0;
	private String tz = "";
	private String err = "";
	private SharedPreferences userinfo;
	private String username = "";
	private String password = "";
	private SharedPreferences cookiesdetail;
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
				showtoast();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "hjj6666");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				StartMainPage();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		userinfo = getSharedPreferences("accountlist", MODE_PRIVATE);
		cookiesdetail = getSharedPreferences("cookies", MODE_PRIVATE);
		username = userinfo.getString("username", "cc");
		password = userinfo.getString("password", "cc");
		StastVizarPage();
		logintest();
		// Intent intent = new Intent();
		// intent.setClass(this, BaseActivity.class);
		// startActivity(intent);
	}

	private void logintest() {
		// TODO Auto-generated method stub
		new AsyncTask<Void, Void, Integer>() {

			@Override
			protected Integer doInBackground(Void... params) {
				// String password_temp = password;
				String jsonString = null;
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String data = null;
				try {
					DefaultHttpClient httpClient = new DefaultHttpClient();
					HttpGet httpGet = new HttpGet(URLContainer.getLoginUrl(username, password));
					HttpResponse httpResponse;
					try {
						httpResponse = httpClient.execute(httpGet);
						is = httpResponse.getEntity().getContent();
						if (is == null) {
							Toast.makeText(getApplicationContext(), "网络未连通，请设置您的网络", Toast.LENGTH_LONG).show();
						}
						jsonString = Util.convertStreamToString(is);
						jsonString = "[" + jsonString + "]";
						SharedPreferences sharedPreferences = getSharedPreferences("accountdetais",
								Context.MODE_PRIVATE);
						String name = sharedPreferences.getString("accountinfodetails", null);
						if (name == null) {
							sharedPreferences.edit().putString("accountinfodetails", jsonString).commit();
						}
						Log.e("jsonString", jsonString);// 打印个人信息
						getCookie(httpClient);// 获取cookies

						try {
							jArray = new JSONArray(jsonString);
							JSONObject json_data = null;
							for (int i = 0; i < jArray.length(); i++) {
								json_data = jArray.getJSONObject(i);
								// game[i] =
								// json_data.getString("game");
								tz = json_data.getString("tz");
								err = jsonString;
								Log.e("tz", tz);
								Log.e("err", err);
							}
						} catch (JSONException e1) {
						} catch (ParseException e1) {
							e1.printStackTrace();
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
					} catch (ClientProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					Log.e("LoginNRegisterActivity.login()", e.getMessage() + "");
				}
				return 1;
			}
		}.execute();

	}

	private void StastVizarPage() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Message msg1 = new Message();
				// // // 便我们做出不同的处理操作
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

			}

		}, 5000);
	}

	private void showtoast() {
		// TODO Auto-generated method stub
		if (temp == 0) {
			Toast.makeText(this, "网络慢，服务器响应慢，请等待", Toast.LENGTH_LONG).show();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void StartMainPage() {
		if (tz.equals("")) {
			temp = 0;
		} else {
			temp = 1;
		}
		Intent intent = new Intent();
		SharedPreferences sharedPreferences = getSharedPreferences("juge", Context.MODE_PRIVATE);
		String name = sharedPreferences.getString("name", null);

		if (temp == 1) {
			intent.setClass(this, BaseActivity.class);
		} else {
			intent.setClass(this, LoginActivity.class);
		}

		startActivity(intent);
		finish();
	}

	private void getCookie(DefaultHttpClient httpClient) {
		List<Cookie> cookies = httpClient.getCookieStore().getCookies();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < cookies.size(); i++) {
			Cookie cookie = cookies.get(i);
			String cookieName = cookie.getName();
			String cookieValue = cookie.getValue();
			if (!TextUtils.isEmpty(cookieName) && !TextUtils.isEmpty(cookieValue)) {
				sb.append(cookieName + "=");
				sb.append(cookieValue + ";");
			}
		}
		Log.e("cookie", sb.toString());
		Editor edit = cookiesdetail.edit();// �� cookies �浽����
		edit.putString("cookies", sb.toString());
		edit.commit();

		if (sb.toString() == "") {
			Toast.makeText(this, "网络无法连接，请检查您的网络是否开启", Toast.LENGTH_LONG).show();
			return;
		} else {

		}
	}

}
