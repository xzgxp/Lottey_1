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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import adapter.bankadapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import model.bankmodel;

public class bankguanli extends Activity {
	private LinearLayout Lin_back;
	private ListView list_bank;
	private TextView text_bankinfo;
	private TextView text_loading;
	private Button btn_bindbank;
	private SharedPreferences cookiesdetail;
	private SharedPreferences xinjiang;
	private String cookies;
	private bankadapter mAdapter;
	private int length = 0;
	private String[] bankid = new String[15];
	private String[] bank = new String[15];
	private String[] card = new String[15];
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
		setContentView(R.layout.other_bankguanli);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		list_bank = (ListView) findViewById(R.id.list_bank);
		text_bankinfo = (TextView) findViewById(R.id.text_bankinfo);
		text_loading = (TextView) findViewById(R.id.text_loading);
		btn_bindbank = (Button) findViewById(R.id.btn_bindbank);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		getbank();
		Lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		btn_bindbank.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(bankguanli.this, bindingbank.class);
				// resultCode---请求码
				startActivityForResult(intent, 1);
			}
		});
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
		list_bank.setAdapter(mAdapter);
		if (length == 0) {
			text_loading.setVisibility(View.VISIBLE);
			text_bankinfo.setText("您还没有绑定银行卡，快去绑定吧");
		} else {
			text_bankinfo.setText("您已绑定了" + length + "张银行卡");
			text_loading.setVisibility(View.GONE);
		}
		list_bank.setVisibility(View.VISIBLE);
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
}
