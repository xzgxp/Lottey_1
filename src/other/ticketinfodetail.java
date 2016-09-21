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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ticketinfodetail extends Activity {
	private TextView text_id;
	private TextView text_orderno;
	private TextView text_no;
	private TextView text_con;
	private TextView text_money;
	private TextView text_jiangjin;
	private TextView text_status;
	private LinearLayout Lin_back;
	private String err;
	private String r;
	private String id;
	private String orderno;
	private String no;
	private String con;
	private String money;
	private String jiangjin;
	private String status;
	private SharedPreferences cookiesdetail;
	private String cookies;
	private LinearLayout LinearLayout_stop;
	private LinearLayout lin_loading;
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
		setContentView(R.layout.othet_ticketinfodetail);
		text_id = (TextView) findViewById(R.id.text_id);
		text_orderno = (TextView) findViewById(R.id.text_orderno);
		text_no = (TextView) findViewById(R.id.text_no);
		text_con = (TextView) findViewById(R.id.text_con);
		text_money = (TextView) findViewById(R.id.text_money);
		text_jiangjin = (TextView) findViewById(R.id.text_jiangjin);
		text_status = (TextView) findViewById(R.id.text_status);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		lin_loading = (LinearLayout) findViewById(R.id.lin_loading);
		LinearLayout_stop = (LinearLayout) findViewById(R.id.LinearLayout_stop);
		Intent intent = this.getIntent(); // 获取已有的intent对象
		Bundle bundle = intent.getExtras(); // 获取intent里面的bundle对象
		id = bundle.getString("ticketId");
		orderno = bundle.getString("ticketOrderNo");
		no = bundle.getString("ticketno");
		con = bundle.getString("ticketContent");
		money = bundle.getString("ticketmoney");
		jiangjin = bundle.getString("ticketZhongjiang");
		status = bundle.getString("ticketstatue");
		text_id.setText(id);
		text_orderno.setText(orderno);
		text_no.setText(no);
		text_con.setText(con);
		text_money.setText(money);
		text_jiangjin.setText(jiangjin);
		text_status.setText(status);
		lin_loading.setVisibility(View.GONE);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		Lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		LinearLayout_stop.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lin_loading.setVisibility(View.VISIBLE);
				getnew();
			}
		});

	}

	public void getnew() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList<BasicNameValuePair>();
		nameValuePairs.add(new BasicNameValuePair("id", id));

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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/OrderCancel");
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
					Log.d("xxxxx", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.d("xxxxx", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							// game[i] = json_data.getString("game");
							r = json_data.getString("r");
							err = json_data.getString("err");
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
		// TODO Auto-generated method stub
		lin_loading.setVisibility(View.GONE);
		if (r.equals("true")) {
			Toast.makeText(ticketinfodetail.this, "撤单成功", Toast.LENGTH_SHORT).show();
			finish();
		} else {
			Toast.makeText(ticketinfodetail.this, err, Toast.LENGTH_SHORT).show();
		}

	}
}
