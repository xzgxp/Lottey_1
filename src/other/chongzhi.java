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

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Window;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ticketpackage.numberbasket;

public class chongzhi extends Activity implements OnClickListener {
	private EditText edit_pay;
	private LinearLayout lin_info;
	private LinearLayout Lin_back;
	private TextView text_info;
	private TextView text_attach;
	private TextView text_name;
	private TextView text_account;
	private TextView text_amount;
	private TextView text_address;
	private Button btn_attach;
	private Button btn_name;
	private Button btn_account;
	private Button btn_amount;
	private Button btn_address;
	private Button btn_pay;
	private String pay = "";
	private SharedPreferences cookiesdetail;
	private String cookies;
	private String attach = "";
	private String name = "";
	private String account = "";
	private String amount = "";
	private String address = "000";
	private String err = "111";
	private int see = 0;
	private int can = 0;
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
		setContentView(R.layout.other_chongzhi);
		edit_pay = (EditText) findViewById(R.id.edit_pay);
		lin_info = (LinearLayout) findViewById(R.id.lin_info);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		text_info = (TextView) findViewById(R.id.text_info);
		text_attach = (TextView) findViewById(R.id.text_attach);
		text_name = (TextView) findViewById(R.id.text_name);
		text_account = (TextView) findViewById(R.id.text_account);
		text_amount = (TextView) findViewById(R.id.text_amount);
		text_address = (TextView) findViewById(R.id.text_address);
		btn_attach = (Button) findViewById(R.id.btn_attach);
		btn_name = (Button) findViewById(R.id.btn_name);
		btn_account = (Button) findViewById(R.id.btn_account);
		btn_amount = (Button) findViewById(R.id.btn_amount);
		btn_address = (Button) findViewById(R.id.btn_address);
		btn_pay = (Button) findViewById(R.id.btn_pay);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		btn_attach.setOnClickListener(this);
		btn_name.setOnClickListener(this);
		btn_account.setOnClickListener(this);
		btn_amount.setOnClickListener(this);
		btn_address.setOnClickListener(this);
		btn_pay.setOnClickListener(this);
		Lin_back.setOnClickListener(this);
		lin_info.setVisibility(View.GONE);
	}

	@SuppressLint("NewApi")
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_pay:
			int paynumber = 0;
			pay = edit_pay.getText().toString();
			boolean isNum = pay.matches("[0-9]+");
			if (isNum) {
				paynumber = Integer.parseInt(pay);
				if (paynumber < 10) {
					Toast.makeText(chongzhi.this, "请输入100以上的数字", Toast.LENGTH_SHORT).show();
				} else {
					pay = paynumber + "";
					if (can == 0) {
						getnew();
						btn_pay.setText("正在处理...");
						can = 1;
					} else {
						Toast.makeText(chongzhi.this, "请勿重复点击", Toast.LENGTH_SHORT).show();
					}

				}
			} else {
				Toast.makeText(chongzhi.this, "请确定输入整数", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.btn_attach:
			String attachcon = text_attach.getText().toString();
			ClipboardManager copy = (ClipboardManager) chongzhi.this.getSystemService(Context.CLIPBOARD_SERVICE);
			copy.setText(attachcon);
			Toast.makeText(chongzhi.this, "复制成功", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_name:
			String namecon = text_name.getText().toString();
			ClipboardManager copy1 = (ClipboardManager) chongzhi.this.getSystemService(Context.CLIPBOARD_SERVICE);
			copy1.setText(namecon);
			Toast.makeText(chongzhi.this, "复制成功", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_account:
			String accountcon = text_account.getText().toString();
			ClipboardManager copy2 = (ClipboardManager) chongzhi.this.getSystemService(Context.CLIPBOARD_SERVICE);
			copy2.setText(accountcon);
			Toast.makeText(chongzhi.this, "复制成功", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_amount:
			String amountcon = text_amount.getText().toString();
			ClipboardManager copy3 = (ClipboardManager) chongzhi.this.getSystemService(Context.CLIPBOARD_SERVICE);
			copy3.setText(amountcon);
			Toast.makeText(chongzhi.this, "复制成功", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_address:
			String addresscon = text_address.getText().toString();
			ClipboardManager copy4 = (ClipboardManager) chongzhi.this.getSystemService(Context.CLIPBOARD_SERVICE);
			copy4.setText(addresscon);
			Toast.makeText(chongzhi.this, "复制成功", Toast.LENGTH_SHORT).show();
			break;
		case R.id.Lin_back:
			finish();
			break;
		default:
			break;
		}
	}

	public void getnew() {
		Log.d("xxxxx", "1r");
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("amount", pay));

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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/PayBankDeposit");
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
							see = 0;
							json_data = jArray.getJSONObject(i);
							address = "000";
							Log.d("xxxxx", address);
							attach = json_data.getString("Attach");
							name = json_data.getString("Name");
							account = json_data.getString("Account");
							amount = json_data.getString("Amount");
							address = json_data.getString("Address");
							Log.d("xxxxx", address);
							if (address.equals("000")) {
								err = "111";
								see = 1;
								err = json_data.getString("_err");
								if (err.equals("111")) {
									err = "其他原因";
									see = 2;
								}
							}
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
		btn_pay.setText("充值");
		edit_pay.setText("");
		// TODO Auto-generated method stub
		if (see == 0) {
			lin_info.setVisibility(View.VISIBLE);
			text_attach.setText(attach);
			text_name.setText(name);
			text_account.setText(account);
			text_amount.setText(amount);
			text_address.setText(address);
			can = 0;
		} else {
			Toast.makeText(chongzhi.this, "失败,请重试。原因：" + err, Toast.LENGTH_SHORT).show();
		}
	}

	public String getstandard(String str) {
		String t[] = str.split("");
		int temp = 0;
		str = "[" + str + "]";
		return str;
	}
}
