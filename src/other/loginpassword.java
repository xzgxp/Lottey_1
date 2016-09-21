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

import android.R.raw;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class loginpassword extends Activity implements OnClickListener {
	private LinearLayout Lin_back;
	private LinearLayout Lin_ok;
	private LinearLayout lin_info;
	private EditText edit_now_password;
	private EditText edit_new_password;
	private EditText edit_new_password_again;
	private TextView text_inf;
	private int ifok = 0;
	private String nowpassword = "";
	private String newpassword = "";
	private String newpasswordagain = "";
	private SharedPreferences cookiesdetail;
	private String cookies;
	private String msg = "修改失败";
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
		setContentView(R.layout.other_loginpassword);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		Lin_ok = (LinearLayout) findViewById(R.id.Lin_ok);
		lin_info = (LinearLayout) findViewById(R.id.lin_info);
		edit_now_password = (EditText) findViewById(R.id.edit_now_password);
		edit_new_password = (EditText) findViewById(R.id.edit_new_password);
		edit_new_password_again = (EditText) findViewById(R.id.edit_new_password_again);
		text_inf = (TextView) findViewById(R.id.text_inf);
		Lin_back.setOnClickListener(this);
		Lin_ok.setOnClickListener(this);
		lin_info.setVisibility(View.GONE);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.Lin_back:
			finish();
			break;
		case R.id.Lin_ok:
			lin_info.setVisibility(View.GONE);
			nowpassword = edit_now_password.getText().toString();
			newpassword = edit_new_password.getText().toString();
			newpasswordagain = edit_new_password_again.getText().toString();

			if (nowpassword.equals("")) {
				Toast.makeText(loginpassword.this, "请输入当前密码", Toast.LENGTH_SHORT).show();
			} else if (newpassword.equals("")) {
				Toast.makeText(loginpassword.this, "请输入新密码", Toast.LENGTH_SHORT).show();
			} else if (newpasswordagain.equals("")) {
				Toast.makeText(loginpassword.this, "请确认新密码", Toast.LENGTH_SHORT).show();
			} else if (!newpassword.equals(newpasswordagain)) {
				Toast.makeText(loginpassword.this, "两次输入不一致", Toast.LENGTH_SHORT).show();
			} else {
				if (ifok == 0) {
					ifok = 1;
					lin_info.setVisibility(View.VISIBLE);
					text_inf.setText("正在修改，请稍等......");
					getchange(nowpassword, newpassword);
					Log.d("xxxxx", nowpassword);
					Toast.makeText(loginpassword.this, "已提交", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(loginpassword.this, "不要重复点击", Toast.LENGTH_SHORT).show();
				}
			}

			break;
		default:
			break;
		}
	}

	private void getchange(String password, String newpassword) {
		Log.d("xxxxx", "1r");
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("password", password));
		nameValuePairs.add(new BasicNameValuePair("newPassword", newpassword));
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
				Log.d("xxxxx", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/ChangePassword");
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
							msg = json_data.getString("Msg");

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

	private void go() {
		text_inf.setText("" + msg);
		ifok = 0;
	}

	public String getstandard(String str) {
		String t[] = str.split("");
		int temp = 0;
		str = "[" + str + "]";
		return str;
	}
}
