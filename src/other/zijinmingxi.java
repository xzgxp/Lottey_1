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

import adapter.zijinadapter;
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
import android.view.Window;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import model.zijinmodel;

public class zijinmingxi extends Activity implements OnClickListener {
	private LinearLayout lin_zijin;
	private LinearLayout lin_paijiang;
	private LinearLayout lin_tixian;
	private LinearLayout lin_chongzhi;
	private LinearLayout lin_zijinloading;
	private TextView text;
	private TextView text_zijin;
	private TextView text_paijiang;
	private TextView text_tixian;
	private TextView text_chongzhi;
	private ListView list_zijin;
	private int tempint = 0;
	private zijinadapter mAdapter;
	private SharedPreferences cookiesdetail;
	private SharedPreferences xinjiang;
	private String cookies;
	private int length = 0;
	private String[] textid = new String[50];
	private String[] orderno = new String[50];
	private String[] type = new String[50];
	private String[] biandong = new String[50];
	private String[] yue = new String[50];
	private String[] status = new String[50];
	private String[] remark = new String[50];
	private String[] time = new String[50];
	private ArrayList nameValuePairs = new ArrayList();
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
		setContentView(R.layout.other_zijinmingxi);
		lin_zijin = (LinearLayout) findViewById(R.id.lin_zijin);
		lin_paijiang = (LinearLayout) findViewById(R.id.lin_paijiang);
		lin_tixian = (LinearLayout) findViewById(R.id.lin_tixian);
		lin_chongzhi = (LinearLayout) findViewById(R.id.lin_chongzhi);
		lin_zijinloading = (LinearLayout) findViewById(R.id.lin_zijinloading);
		text = (TextView) findViewById(R.id.text);
		text_zijin = (TextView) findViewById(R.id.text_zijin);
		text_paijiang = (TextView) findViewById(R.id.text_paijiang);
		text_tixian = (TextView) findViewById(R.id.text_tixian);
		text_chongzhi = (TextView) findViewById(R.id.text_chongzhi);
		list_zijin = (ListView) findViewById(R.id.list_zijin);
		lin_zijin.setOnClickListener(this);
		lin_paijiang.setOnClickListener(this);
		lin_tixian.setOnClickListener(this);
		lin_chongzhi.setOnClickListener(this);

		nameValuePairs.add(new BasicNameValuePair("pagesize", "50"));
		nameValuePairs.add(new BasicNameValuePair("page", "1"));
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		getzijin();
		list_zijin.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				Intent intent = new Intent(zijinmingxi.this, zijinmingxidetail.class);
				// resultCode---请求码
				Bundle bundle = new Bundle(); // 创建Bundle对象
				bundle.putString("id", textid[position]);
				bundle.putString("orderno", orderno[position]);
				bundle.putString("type", type[position]);
				bundle.putString("biandong", biandong[position]);
				bundle.putString("yue", yue[position]);
				bundle.putString("status", status[position]);
				bundle.putString("remark", remark[position]);
				bundle.putString("time", time[position]);

				intent.putExtras(bundle);
				startActivityForResult(intent, 1);

			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.lin_zijin:
			list_zijin.setVisibility(View.GONE);
			lin_zijin.setBackgroundColor(0xff66CDAA);
			lin_paijiang.setBackgroundColor(0xffffffff);
			lin_tixian.setBackgroundColor(0xffffffff);
			lin_chongzhi.setBackgroundColor(0xffffffff);
			text_zijin.setTextColor(0xffffffff);
			text_paijiang.setTextColor(0xff66CDAA);
			text_tixian.setTextColor(0xff66CDAA);
			text_chongzhi.setTextColor(0xff66CDAA);
			tempint = 0;
			lin_zijinloading.setVisibility(View.VISIBLE);
			getzijin();
			break;
		case R.id.lin_paijiang:
			list_zijin.setVisibility(View.GONE);
			lin_paijiang.setBackgroundColor(0xff66CDAA);
			lin_zijin.setBackgroundColor(0xffffffff);
			lin_tixian.setBackgroundColor(0xffffffff);
			lin_chongzhi.setBackgroundColor(0xffffffff);
			text_paijiang.setTextColor(0xffffffff);
			text_zijin.setTextColor(0xff66CDAA);
			text_tixian.setTextColor(0xff66CDAA);
			text_chongzhi.setTextColor(0xff66CDAA);
			tempint = 1;
			lin_zijinloading.setVisibility(View.VISIBLE);
			getpaijiang();
			break;
		case R.id.lin_tixian:
			list_zijin.setVisibility(View.GONE);
			lin_tixian.setBackgroundColor(0xff66CDAA);
			lin_paijiang.setBackgroundColor(0xffffffff);
			lin_zijin.setBackgroundColor(0xffffffff);
			lin_chongzhi.setBackgroundColor(0xffffffff);
			text_tixian.setTextColor(0xffffffff);
			text_paijiang.setTextColor(0xff66CDAA);
			text_zijin.setTextColor(0xff66CDAA);
			text_chongzhi.setTextColor(0xff66CDAA);
			tempint = 2;
			lin_zijinloading.setVisibility(View.VISIBLE);
			gettixian();
			break;
		case R.id.lin_chongzhi:
			list_zijin.setVisibility(View.GONE);
			lin_chongzhi.setBackgroundColor(0xff66CDAA);
			lin_paijiang.setBackgroundColor(0xffffffff);
			lin_tixian.setBackgroundColor(0xffffffff);
			lin_zijin.setBackgroundColor(0xffffffff);
			text_chongzhi.setTextColor(0xffffffff);
			text_paijiang.setTextColor(0xff66CDAA);
			text_tixian.setTextColor(0xff66CDAA);
			text_zijin.setTextColor(0xff66CDAA);
			tempint = 3;
			lin_zijinloading.setVisibility(View.VISIBLE);
			getchonhzhi();
			break;
		default:
			break;
		}
	}

	protected void go() {
		// TODO Auto-generated method stub
		Log.e("log_tag", "ismethisgooooo");
		mAdapter = new zijinadapter(this, getData());
		list_zijin.setAdapter(mAdapter);
		if (length == 0) {
			lin_zijinloading.setVisibility(View.VISIBLE);
			text.setText("无数据");
		} else {
			lin_zijinloading.setVisibility(View.GONE);
		}
		list_zijin.setVisibility(View.VISIBLE);
	}

	private List<zijinmodel> getData() {

		List<zijinmodel> list = new ArrayList<zijinmodel>();

		Log.e("log_tag", "ismethis");
		for (int i = 0; i < length; i++) {

			zijinmodel orderinfo = new zijinmodel();
			orderinfo.setTime(time[i]);
			orderinfo.setStatus(status[i]);
			orderinfo.setBiandong(biandong[i]);
			list.add(orderinfo);

			Log.e("log_tag", "ismefour");

		}
		return list;
	}

	public void getzijin() {
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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetZijinList");
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
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;

					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							textid[i] = json_data.getString("Id");
							orderno[i] = json_data.getString("OrderNo");
							type[i] = json_data.getString("Type");
							biandong[i] = json_data.getString("Biandong");
							yue[i] = json_data.getString("Yue");
							status[i] = json_data.getString("Status");
							remark[i] = json_data.getString("Remark");
							time[i] = json_data.getString("CreateTime");

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

	public void getpaijiang() {
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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetPaijiangList");
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
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					String data = null;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {

							json_data = jArray.getJSONObject(i);
							textid[i] = json_data.getString("Id");
							orderno[i] = json_data.getString("OrderNo");
							type[i] = json_data.getString("Type");
							biandong[i] = json_data.getString("Biandong");
							yue[i] = json_data.getString("Yue");
							status[i] = json_data.getString("Status");
							remark[i] = json_data.getString("Remark");
							time[i] = json_data.getString("CreateTime");

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

	public void gettixian() {
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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetTixianList");
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
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					String data = null;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {

							json_data = jArray.getJSONObject(i);
							textid[i] = json_data.getString("Id");
							orderno[i] = json_data.getString("OrderNo");
							type[i] = json_data.getString("Type");
							biandong[i] = json_data.getString("Biandong");
							yue[i] = json_data.getString("Yue");
							status[i] = json_data.getString("Status");
							remark[i] = json_data.getString("Remark");
							time[i] = json_data.getString("CreateTime");

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

	public void getchonhzhi() {
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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetChongzhiList");
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
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					String data = null;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {

							json_data = jArray.getJSONObject(i);
							textid[i] = json_data.getString("Id");
							orderno[i] = json_data.getString("OrderNo");
							type[i] = json_data.getString("Type");
							biandong[i] = json_data.getString("Biandong");
							yue[i] = json_data.getString("Yue");
							status[i] = json_data.getString("Status");
							remark[i] = json_data.getString("Remark");
							time[i] = json_data.getString("CreateTime");

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
