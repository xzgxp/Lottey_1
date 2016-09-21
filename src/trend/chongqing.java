package trend;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.URLContainer;
import com.example.entertiment.util.Util;
import com.example.lottery.R;

import adapter.trendadapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import model.trendmodel;
import ticketpackage.BaseActivityticket;

public class chongqing extends Activity {
	private LinearLayout lin_loading;
	private trendadapter mAdapter;
	private ListView chongqinglist;
	private ImageButton btn_back;
	private TextView text_gotouzhu;
	private SharedPreferences cookiesdetail;
	private String cookies;
	private String[] no = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",
			"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] expect = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",
			"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private int length = 0;
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				getnew();
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
	static int minute = -1;
	static int second = -1;
	final static String tag = "tag";
	// TextView timeView;
	Timer timer;
	TimerTask timerTask;
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			System.out.println("han11111111111111dle!");
			if (minute == 0) {
				if (second == 0) {
					minute = 0;
					second = 20;
					// timeView.setText("Time out !");
					Message msg1 = new Message();
					// // 便我们做出不同的处理操作
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
					if (timer != null) {
						timer.cancel();
						timer = null;
					}
					if (timerTask != null) {
						timerTask = null;
					}
					timerTask = new TimerTask() {

						@Override
						public void run() {
							Message msg = new Message();
							msg.what = 0;
							handler.sendMessage(msg);
						}
					};

					timer = new Timer();
					timer.schedule(timerTask, 0, 1000);
				} else {
					second--;
					if (second >= 10) {
						// timeView.setText("0" + minute + ":" + second);
					} else {
						// timeView.setText("0" + minute + ":0" + second);
					}
				}
			} else {
				if (second == 0) {
					second = 59;
					minute--;
					if (minute >= 10) {
						// timeView.setText(minute + ":" + second);
					} else {
						// timeView.setText("0" + minute + ":" + second);
					}
				} else {
					second--;
					if (second >= 10) {
						if (minute >= 10) {
							// timeView.setText(minute + ":" + second);
						} else {
							// timeView.setText("0" + minute + ":" + second);
						}
					} else {
						if (minute >= 10) {
							// timeView.setText(minute + ":0" + second);
						} else {
							// timeView.setText("0" + minute + ":0" + second);
						}
					}
				}
			}
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.trend_chongqing);
		text_gotouzhu = (TextView) findViewById(R.id.text_gotouzhu);
		btn_back = (ImageButton) findViewById(R.id.btn_back);
		lin_loading = (LinearLayout) findViewById(R.id.lin_loading);
		chongqinglist = (ListView) findViewById(R.id.chongqinglist);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		lin_loading.setVisibility(View.VISIBLE);
		getnew();
		text_gotouzhu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(chongqing.this, BaseActivityticket.class);

				// b.putString("ordertype", "baojie");
				intent.putExtra("tickettypecode", 4);

				startActivity(intent);
			}
		});
		btn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	protected void go() {
		// TODO Auto-generated method stub
		Log.e("log_tag", "ismethisgooooo");
		mAdapter = new trendadapter(this, getData());
		chongqinglist.setAdapter(mAdapter);
		lin_loading.setVisibility(View.GONE);
	}

	private List<trendmodel> getData() {

		List<trendmodel> list = new ArrayList<trendmodel>();
		// FriendModel friend1 = new FriendModel();
		// friend1.setAvatar(R.drawable.image1);
		// friend1.setNickname("凯撒");
		// friend1.setDescription("凯撒的归凯撒，上帝的归上帝");

		Log.e("log_tag", "ismethis");
		for (int i = 0; i < length; i++) {
			trendmodel orderinfo = new trendmodel();
			orderinfo.setExpect(expect[i]);
			orderinfo.setNo(no[i]);
			list.add(orderinfo);

			Log.e("log_tag", "ismefour");

		}
		return list;
	}

	public void getnew() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("GameGroup", "ssc"));
		nameValuePairs.add(new BasicNameValuePair("game", "重庆"));

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
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetLastKaijiangList");
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
					Log.d("xxxxx", jsonString);
					String t;
					String tz;
					String l;
					try {
						length = 0;
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							// game[i] = json_data.getString("game");
							data = json_data.getString("data");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						length = 0;
						jArray = new JSONArray(data);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							// game[i] = json_data.getString("game");
							no[i] = json_data.getString("Value");
							expect[i] = json_data.getString("No");
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

	@Override
	protected void onDestroy() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub

		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		minute = 0;
		second = 20;
		timerTask = new TimerTask() {

			@Override
			public void run() {
				Message msg = new Message();
				msg.what = 0;
				handler.sendMessage(msg);
			}
		};

		timer = new Timer();
		timer.schedule(timerTask, 0, 1000);
		super.onStart();
	}
}
