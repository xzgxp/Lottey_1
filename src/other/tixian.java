package other;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

import adapter.bankadapter;
import android.R.raw;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import model.bankmodel;

public class tixian extends Activity implements OnClickListener, OnTouchListener {
	private Button btn_binding;
	private TextView text_tikuaninfo;
	private TextView text_bankget;
	private Button btn_tikuan;
	private EditText edit_tikuanmoney;
	private TextView text_tikuanbank;
	private ListView list_tixianbank;
	private ScrollView scro_havedata;
	private LinearLayout LinearLayout_binding;
	private LinearLayout Lin_back;
	private LinearLayout lin_nodata;
	private EditText edit_paypassword;
	private SharedPreferences cookiesdetail;
	private SharedPreferences xinjiang;
	private String cookies;
	private bankadapter mAdapter;
	private int length = 0;
	private String[] bankid = new String[15];
	private String[] bank = new String[15];
	private String[] card = new String[15];
	private String msg = "提款失败";
	private String sendbankid = "";
	private String sendmoneyid = "";
	private String sendpaypassword = "";
	private int tempint = 0;
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				goshow();
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
		setContentView(R.layout.other_tixian);
		btn_binding = (Button) findViewById(R.id.btn_binding);
		text_tikuaninfo = (TextView) findViewById(R.id.text_tikuaninfo);
		btn_tikuan = (Button) findViewById(R.id.btn_tikuan);
		edit_paypassword = (EditText) findViewById(R.id.edit_paypassword);
		edit_tikuanmoney = (EditText) findViewById(R.id.edit_tikuanmoney);
		text_tikuanbank = (TextView) findViewById(R.id.text_tikuanbank);
		text_bankget = (TextView) findViewById(R.id.text_bankget);
		list_tixianbank = (ListView) findViewById(R.id.list_tixianbank);
		scro_havedata = (ScrollView) findViewById(R.id.scro_havedata);
		LinearLayout_binding = (LinearLayout) findViewById(R.id.LinearLayout_binding);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		lin_nodata = (LinearLayout) findViewById(R.id.lin_nodata);
		Lin_back.setOnClickListener(this);
		LinearLayout_binding.setOnClickListener(this);
		btn_tikuan.setOnClickListener(this);
		btn_binding.setOnClickListener(this);
		btn_tikuan.setOnTouchListener(this);
		text_tikuaninfo.setVisibility(View.GONE);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		getbank();
		list_tixianbank.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				sendbankid = bankid[position];
				text_tikuanbank.setText(bank[position]);
				Toast.makeText(tixian.this, "您已选中" + bank[position], Toast.LENGTH_SHORT).show();
			}
		});
		btn_tikuan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendmoneyid = edit_tikuanmoney.getText().toString();
				sendpaypassword = edit_paypassword.getText().toString();
				if (sendmoneyid.equals("")) {
					Toast.makeText(tixian.this, "提款金额不可为空", Toast.LENGTH_SHORT).show();
				} else {
					boolean isNum = sendmoneyid.matches("[0-9]+");
					if (!isNum) {
						Toast.makeText(tixian.this, "请输入纯数字整数", Toast.LENGTH_SHORT).show();
					} else {
						int getnumber = Integer.parseInt(sendmoneyid);
						if (getnumber < 100) {
							Toast.makeText(tixian.this, "提现金额不能少于100", Toast.LENGTH_SHORT).show();
						} else {
							if (sendpaypassword.equals("")) {
								Toast.makeText(tixian.this, "支付密码不可为空", Toast.LENGTH_SHORT).show();
							} else {
								// Toast.makeText(tixian.this, "" + sendbankid +
								// sendmoneyid + sendpaypassword,
								// Toast.LENGTH_SHORT).show();
								if (tempint == 0) {
									text_tikuaninfo.setVisibility(View.GONE);
									send();
									btn_tikuan.setText("正在提款...");
									tempint = 1;
								} else {
									Toast.makeText(tixian.this, "正在提款，请勿重复点击", Toast.LENGTH_SHORT).show();
								}

							}
						}
					}
				}
			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_binding:
			Intent intent = new Intent(tixian.this, bindingbank.class);
			// resultCode---请求码
			startActivityForResult(intent, 1);
			break;
		case R.id.LinearLayout_binding:
			Intent intent1 = new Intent(tixian.this, bindingbank.class);
			// resultCode---请求码
			startActivityForResult(intent1, 1);
			break;
		case R.id.Lin_back:
			finish();
			break;
		case R.id.btn_tikuan:
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_binding:
			int actionbtn_btn_binding = event.getAction();
			if (actionbtn_btn_binding == MotionEvent.ACTION_DOWN) {
				btn_binding.setTextColor(Color.WHITE);
			} else if (actionbtn_btn_binding == MotionEvent.ACTION_UP) {
				btn_binding.setTextColor(Color.BLACK);
			} else if (actionbtn_btn_binding == MotionEvent.ACTION_CANCEL) {
				btn_binding.setTextColor(Color.BLACK);
			}
			break;
		case R.id.btn_tikuan:
			int actionbtn_btn_tikuan = event.getAction();
			if (actionbtn_btn_tikuan == MotionEvent.ACTION_DOWN) {
				btn_tikuan.setTextColor(Color.WHITE);
			} else if (actionbtn_btn_tikuan == MotionEvent.ACTION_UP) {
				btn_tikuan.setTextColor(Color.BLACK);
			} else if (actionbtn_btn_tikuan == MotionEvent.ACTION_CANCEL) {
				btn_tikuan.setTextColor(Color.BLACK);
			}
			break;
		default:
			break;
		}
		return false;
	}

	public void getbank() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
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
				Log.d("TabAFragment", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetCardList");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("TabAFragment", "111");
				try {
					// httpPost.setEntity(new
					// UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					String data = null;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						int temp = 15;
						if (jArray.length() < 15) {
							temp = jArray.length();
						}
						for (int i = 0; i < temp; i++) {

							json_data = jArray.getJSONObject(i);
							bankid[i] = json_data.getString("Id");
							bank[i] = json_data.getString("Bank");
							card[i] = json_data.getString("Card");
							Log.e("log_tag", card[i]);
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("no");
							// value[i] = json_data.getString("value");
							length++;
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
		Log.e("log_tag", "ismethisgooooo");
		mAdapter = new bankadapter(this, getData());
		list_tixianbank.setAdapter(mAdapter);
		text_bankget.setText("");
		if (length == 0) {
			scro_havedata.setVisibility(View.GONE);
			lin_nodata.setVisibility(View.VISIBLE);
		} else {
			Log.e("log_tag", "ismethisgooooo" + length);
			scro_havedata.setVisibility(View.VISIBLE);
			lin_nodata.setVisibility(View.GONE);
		}
		list_tixianbank.setVisibility(View.VISIBLE);
		getbankid();
	}

	private List<bankmodel> getData() {

		List<bankmodel> list = new ArrayList<bankmodel>();

		Log.e("log_tag", "ismethis");
		for (int i = 0; i < length; i++) {

			bankmodel orderinfo = new bankmodel();
			orderinfo.setBank(bank[i]);
			orderinfo.setCard(card[i]);

			list.add(orderinfo);

			Log.e("log_tag", "ismefour");

		}
		return list;
	}

	public void send() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("payPassword", sendpaypassword));
		nameValuePairs.add(new BasicNameValuePair("amount", sendmoneyid));
		nameValuePairs.add(new BasicNameValuePair("bank", sendbankid));
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
				Log.d("TabAFragment", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/Tikuan");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("TabAFragment", "111");
				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					String data = null;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {

							json_data = jArray.getJSONObject(i);
							msg = json_data.getString("Msg");

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

	private void goshow() {
		// TODO Auto-generated method stub
		text_tikuaninfo.setVisibility(View.VISIBLE);
		text_tikuaninfo.setText(msg);
		btn_tikuan.setText("提款");
		tempint = 0;
	}

	private void getbankid() {
		// TODO Auto-generated method stub
		if (length != 0) {
			sendbankid = bankid[0];
			text_tikuanbank.setText(bank[0]);
		}
	}
}
