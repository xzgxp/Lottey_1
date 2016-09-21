package com.example.entertiment;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import lottery.BaseActivity;
import other.bankguanli;
import other.bindingbank;
import other.chongzhi;
import style.DisplayUtil;

public class LoginActivity extends Activity implements OnClickListener, OnTouchListener {
	private EditText loginusername;
	private EditText loginpassword;
	private Button quiklyloginto;
	private LinearLayout lin_cancel;
	private SharedPreferences cookiesdetail;
	private String strusername = "";
	private String strpassword = "";
	private int tempint = 0;
	private int loginint = 0;
	private String err = "";
	private String status = "";
	private SharedPreferences userinfo;
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
		// getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.login);
		DisplayUtil.initSystemBar(this);
		loginusername = (EditText) findViewById(R.id.loginusername);
		loginpassword = (EditText) findViewById(R.id.loginpassword);
		lin_cancel = (LinearLayout) findViewById(R.id.lin_cancel);
		quiklyloginto = (Button) findViewById(R.id.quiklyloginto);
		quiklyloginto.setOnClickListener(this);
		quiklyloginto.setOnTouchListener(this);

		cookiesdetail = getSharedPreferences("cookies", MODE_PRIVATE);
		userinfo = getSharedPreferences("accountlist", MODE_PRIVATE);
		lin_cancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		strpassword = loginpassword.getText().toString();
		strusername = loginusername.getText().toString();
		if (strusername.equals("")) {
			Toast.makeText(LoginActivity.this, "用户名不可为空", Toast.LENGTH_SHORT).show();
		} else if (strpassword.equals("")) {
			Toast.makeText(LoginActivity.this, "密码不可为空", Toast.LENGTH_SHORT).show();
		} else {
			Editor edit = userinfo.edit();// 锟斤拷 cookies 锟芥到锟斤拷锟斤拷
			edit.putString("password", strpassword);
			edit.putString("username", strusername);
			edit.commit();
			if (tempint == 0) {
				login();
				tempint = 1;
				quiklyloginto.setText("正在登录...");
			} else {
				Toast.makeText(LoginActivity.this, "正在登录，请勿重复点击", Toast.LENGTH_SHORT).show();
			}

		}

	}

	private void login() {
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
					HttpGet httpGet = new HttpGet(URLContainer.getLoginUrl(strusername, strpassword));
					HttpResponse httpResponse;
					try {
						httpResponse = httpClient.execute(httpGet);
						is = httpResponse.getEntity().getContent();
						jsonString = Util.convertStreamToString(is);
						jsonString = "[" + jsonString + "]";
						Log.e("jsonString", jsonString);// 鎵撳嵃涓汉淇℃伅
						getCookie(httpClient);// 鑾峰彇cookies

					} catch (ClientProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						Log.d("xxxxx", "jhkk");
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							status = json_data.getString("tz");
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("Value");
							// expect[i] = json_data.getString("No");

						}

					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
				} catch (Exception e) {
					Log.e("LoginNRegisterActivity.login()", e.getMessage() + "");
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
				return 1;
			}
		}.execute();
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
		Editor edit = cookiesdetail.edit();// 锟斤拷 cookies 锟芥到锟斤拷锟斤拷
		edit.putString("cookies", sb.toString());
		edit.commit();
		// cookiesdetail = sb.toString();
		// Log.e("cookie", cookiesdetail);
		// Util.savePreference("cookie", sb.toString());// 淇濆瓨cookies
	}

	private void go() {
		tempint = 0;
		quiklyloginto.setText("登录");
		// TODO Auto-generated method stub
		if (status.equals("")) {
			Toast.makeText(this, "登录失败", Toast.LENGTH_LONG).show();
		} else {
			Intent intent = new Intent(LoginActivity.this, BaseActivity.class);
			// resultCode---请求码
			startActivityForResult(intent, 1);
			finish();

		}
	}
}