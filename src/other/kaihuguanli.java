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

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.R.bool;
import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class kaihuguanli extends Activity {
	private LinearLayout Lin_back;
	private Button btn_littleok;
	private EditText text_dipinreturn;
	private EditText text_11choose5return;
	private EditText text_sscreturn;
	private EditText text_littlepasswordconfirm;
	private EditText text_littlepassword;
	private EditText text_littleusername;
	private TextView text_show;
	private SharedPreferences cookiesdetail;
	private String cookies;
	private String username = "";
	private String password = "";
	private String sscreturn = "";
	private String choose5return = "";
	private String dipinreturn = "";
	private String passwordconfirm = "";
	private boolean r = false;
	private String msg = "";
	private int tempint = 0;
	private String showusername = "";
	private String rmb = "";
	private String sscrmb = "";
	private String SscReturn = "0.1";
	private String Shiyi5Rmb = "0.0";
	private String Shiyi5Return = "0.1";
	private String DipinRmb = "0.0";
	private String DipinReturn = "0.1";
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
				gokaihu();
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
		setContentView(R.layout.other_kaihuguanli);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		btn_littleok = (Button) findViewById(R.id.btn_littleok);
		text_dipinreturn = (EditText) findViewById(R.id.text_dipinreturn);
		text_11choose5return = (EditText) findViewById(R.id.text_11choose5return);
		text_sscreturn = (EditText) findViewById(R.id.text_sscreturn);
		text_littlepasswordconfirm = (EditText) findViewById(R.id.text_littlepasswordconfirm);
		text_littlepassword = (EditText) findViewById(R.id.text_littlepassword);
		text_littleusername = (EditText) findViewById(R.id.text_littleusername);
		text_show = (TextView) findViewById(R.id.text_show);
		userinfo = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
		Lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		btn_littleok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				username = text_littleusername.getText().toString();
				password = text_littlepassword.getText().toString();
				sscreturn = text_sscreturn.getText().toString();
				choose5return = text_11choose5return.getText().toString();
				dipinreturn = text_dipinreturn.getText().toString();
				passwordconfirm = text_littlepasswordconfirm.getText().toString();
				if (username.equals("")) {
					Toast.makeText(kaihuguanli.this, "用户名不可为空", Toast.LENGTH_SHORT).show();
				} else if (password.equals("")) {
					Toast.makeText(kaihuguanli.this, "密码不可为空", Toast.LENGTH_SHORT).show();
				} else if (passwordconfirm.equals("")) {
					Toast.makeText(kaihuguanli.this, "请确认密码", Toast.LENGTH_SHORT).show();
				} else if (sscreturn.equals("")) {
					Toast.makeText(kaihuguanli.this, "请输入时时彩返点", Toast.LENGTH_SHORT).show();
				} else if (dipinreturn.equals("")) {
					Toast.makeText(kaihuguanli.this, "请输入低频彩返点", Toast.LENGTH_SHORT).show();
				} else if (choose5return.equals("")) {
					Toast.makeText(kaihuguanli.this, "请输入11选5返点", Toast.LENGTH_SHORT).show();
				} else if (!password.equals(passwordconfirm)) {
					Toast.makeText(kaihuguanli.this, "两次密码不一致", Toast.LENGTH_SHORT).show();
				} else {
					if (tempint == 0) {
						getchange();
						tempint = 1;
						btn_littleok.setText("正在添加...");
						text_show.setVisibility(View.GONE);
					} else {
						Toast.makeText(kaihuguanli.this, "正在添加，请勿重复点击", Toast.LENGTH_SHORT).show();
					}

				}
			}
		});
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
					 Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							Log.d("dfsd", "dfs");
							showusername = json_data.getString("UserName");
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

	private void getchange() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("username", username));
		nameValuePairs.add(new BasicNameValuePair("password", password));
		Log.d("xxxxx", "1");
		nameValuePairs.add(new BasicNameValuePair("sscReturn", sscreturn));
		nameValuePairs.add(new BasicNameValuePair("shiyi5Return", choose5return));
		nameValuePairs.add(new BasicNameValuePair("dipinReturn", dipinreturn));
		// Log.d("selindex", "selindex" + "read" + selindex);
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;
				String data = null;
				// TODO Auto-generated method stub
				DefaultHttpClient httpClient = new DefaultHttpClient();

				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/AddSubUser");
				Log.d("xxxxx", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("xxxxx", "111");

				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					Log.d("xxxxx", "1111");
					httpResponse = httpClient.execute(httpPost);
					Log.d("xxxxx", "12222");
					is = httpResponse.getEntity().getContent();
					Log.e("xxxxx", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = getstandard(jsonString);
					Log.d("xxxxx", jsonString);
					String t;
					String tz;
					String l;

					try {
						Log.d("xxxxx", "jhkk");
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							r = json_data.getBoolean("r");
							msg = json_data.getString("msg");
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("Value");
							// expect[i] = json_data.getString("No");

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
		if (r) {
			Toast.makeText(kaihuguanli.this, "添加下级成功", Toast.LENGTH_SHORT).show();
			text_show.setVisibility(View.VISIBLE);
			text_show.setText(msg);
		} else {
			Toast.makeText(kaihuguanli.this, "添加下级失败", Toast.LENGTH_SHORT).show();
		}
		tempint = 0;
		btn_littleok.setText("确认添加");
	}

	private void gokaihu() {
		// TODO Auto-generated method stub
		String choosere = userinfo.getString("Shiyi5Return",Shiyi5Return);
		String sscre = userinfo.getString("SscReturn", SscReturn);
		String dipinre = userinfo.getString("DipinReturn",DipinReturn);
		Double choosered = 0.0;
		Double sscred = 0.0;
		Double dipinred = 0.0;
		choosered = Double.valueOf(choosere);
		sscred = Double.valueOf(sscre);
		dipinred = Double.valueOf(dipinre);
		Log.e("return", choosered+"");
		Log.e("return", sscred+"");
		Log.e("return", dipinred+"");
		
		text_sscreturn.setHint("时时彩返点（0到"+(sscred - 0.1) + "）");
		text_11choose5return.setHint("11选5返点（0到"+(choosered - 0.1) + "）");
		text_dipinreturn.setHint("低频彩返点（0到"+(dipinred - 0.1) + "）");
		
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		gokaihu();
		getnew();
		
		super.onStart();
	}
}
