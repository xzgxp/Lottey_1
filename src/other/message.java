package other;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import adapter.messageadapter;
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
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import model.messagemodel;

public class message extends Activity implements OnClickListener {
	private int tempint = 0;
	private TextView text_gonggao;
	private LinearLayout lin_gonggao;
	private LinearLayout lin_zhanneixin;
	private TextView text_zhanneixin;
	private TextView text;
	private messageadapter mAdapter;
	private ListView list_message;
	private SharedPreferences cookiesdetail;
	private SharedPreferences xinjiang;
	private String cookies;
	private int length = 0;
	private LinearLayout lin_messageloading;
	private String[] gonggao = { "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111", "111",
			"111", "111", "111", "111", "111", "111", "111", "111" };
	private String[] title = { "323", "323", "323", "323", "323", "323", "323", "323", "323", "323", "323", "323",
			"323", "323", "323", "323", "323", "323", "323", "323" };
	private String[] time = { "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr",
			"ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr", "ertrtr",
			"ertrtr" };
	private String[] content = { "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg",
			"gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg", "gsg" };
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
		setContentView(R.layout.other_message);
		text = (TextView) findViewById(R.id.text);
		lin_messageloading = (LinearLayout) findViewById(R.id.lin_messageloading);
		list_message = (ListView) findViewById(R.id.list_message);
		text_gonggao = (TextView) findViewById(R.id.text_gonggao);
		lin_gonggao = (LinearLayout) findViewById(R.id.lin_gonggao);
		lin_zhanneixin = (LinearLayout) findViewById(R.id.lin_zhanneixin);
		text_zhanneixin = (TextView) findViewById(R.id.text_zhanneixin);
		lin_gonggao.setOnClickListener(this);
		lin_zhanneixin.setOnClickListener(this);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		getgonggao();
		list_message.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				if (tempint == 0) {
					Intent intent = new Intent(message.this, othergonggaodetail.class);
					// resultCode---请求码
					Bundle bundle = new Bundle(); // 创建Bundle对象
					bundle.putString("message", gonggao[position]); // 装入数据
					intent.putExtras(bundle);
					startActivityForResult(intent, 1);

				} else {
					Intent intent = new Intent(message.this, otherzhanneixindetail.class);
					// resultCode---请求码
					Bundle bundle = new Bundle(); // 创建Bundle对象
					bundle.putString("title", title[position]); // 装入数据
					bundle.putString("time", time[position]); // 装入数据
					bundle.putString("content", content[position]); // 装入数据
					intent.putExtras(bundle);
					startActivityForResult(intent, 1);
				}
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.lin_gonggao:
			list_message.setVisibility(View.GONE);
			lin_gonggao.setBackgroundColor(0xff66CDAA);
			lin_zhanneixin.setBackgroundColor(0xffffffff);
			text_gonggao.setTextColor(0xffffffff);
			text_zhanneixin.setTextColor(0xff66CDAA);
			tempint = 0;
			lin_messageloading.setVisibility(View.VISIBLE);
			getgonggao();
			break;
		case R.id.lin_zhanneixin:
			list_message.setVisibility(View.GONE);
			lin_zhanneixin.setBackgroundColor(0xff66CDAA);
			lin_gonggao.setBackgroundColor(0xffffffff);
			text_zhanneixin.setTextColor(0xffffffff);
			text_gonggao.setTextColor(0xff66CDAA);
			tempint = 1;
			lin_messageloading.setVisibility(View.VISIBLE);
			getmessage();

			break;
		default:
			break;
		}
	}

	protected void go() {
		// TODO Auto-generated method stub
		Log.e("log_tag", "ismethisgooooo");
		mAdapter = new messageadapter(this, getData());
		list_message.setAdapter(mAdapter);
		if (length == 0) {
			lin_messageloading.setVisibility(View.VISIBLE);
			text.setText("无数据");
		} else {
			lin_messageloading.setVisibility(View.GONE);
		}
		list_message.setVisibility(View.VISIBLE);
	}

	private List<messagemodel> getData() {

		List<messagemodel> list = new ArrayList<messagemodel>();

		Log.e("log_tag", "ismethis");
		for (int i = 0; i < length; i++) {
			if (tempint == 0) {
				messagemodel orderinfo = new messagemodel();
				orderinfo.setMessage(gonggao[i]);
				list.add(orderinfo);
			} else {
				messagemodel orderinfo = new messagemodel();
				orderinfo.setMessage(content[i]);
				list.add(orderinfo);
			}

			Log.e("log_tag", "ismefour");

		}
		return list;
	}

	public void getgonggao() {
		cookies = cookiesdetail.getString("cookies", "");
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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetNoticeList");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("TabAFragment", "111");
				try {
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
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {
							if (i >= 20) {
								i = 19;
								length--;
							}
							json_data = jArray.getJSONObject(i);
							gonggao[i] = json_data.getString("content");
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

	public void getmessage() {
		cookies = cookiesdetail.getString("cookies", "");
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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetMessageList");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("TabAFragment", "111");
				try {
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
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {
							if (i >= 20) {
								i = 19;
								length--;
							}
							json_data = jArray.getJSONObject(i);
							title[i] = json_data.getString("Title");
							time[i] = json_data.getString("CreateTime");
							content[i] = json_data.getString("Content");
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
}
