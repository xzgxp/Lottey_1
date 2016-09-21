package lottery;

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

import adapter.recondadapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import model.recondmodel;
import other.message;
import other.othergonggaodetail;
import other.otherzhanneixindetail;
import other.ticketinfodetail;

/**
 * @ClassName: TabAFm
 * @Description: TODO
 * @author Panyy
 * @date 2013 2013年11月6日 下午4:06:26
 *
 */
public class TabCFragment extends Fragment implements OnTouchListener {
	private recondadapter mAdapter;
	private ListView list_tab_a;
	private String[] ticketmoney = new String[50];
	private String[] ticketstatue = new String[50];
	private String[] ticketno = new String[50];
	private int[] ticketif = new int[50];
	private String[] ticketId = new String[50];
	private String[] ticketOrderNo = new String[50];
	private String[] ticketContent = new String[50];
	private String[] ticketZhongjiang = new String[50];
	private SharedPreferences cookiesdetail;
	private SharedPreferences xinjiang;
	private String cookies;
	private int length = 0;
	private TextView text_loading;
	private TextView headTextView = null;
	private final static int RATIO = 2;
	private boolean isRecored;

	private int firstItemIndex = 0;
	private float startY = 0;
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
			// System.out.println("TabAFragment!");
			if (minute == 0) {
				if (second <= 0) {
					minute = 0;
					second = 200;
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
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		// System.out.println("AAAAAAAAAA____onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// System.out.println("AAAAAAAAAA____onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// System.out.println("AAAAAAAAAA____onCreateView");
		View view = inflater.inflate(R.layout.tab_c, container, false);
		cookiesdetail = getActivity().getSharedPreferences("cookies", Context.MODE_PRIVATE);
		list_tab_a = (ListView) view.findViewById(R.id.list_tab_a);
		text_loading = (TextView) view.findViewById(R.id.text_loading);
		// go();
		text_loading.setVisibility(View.VISIBLE);
		getnew();
		headTextView = new TextView(getActivity());
		headTextView.setGravity(Gravity.CENTER);
		headTextView.setMinHeight(100);
		headTextView.setText("正在刷新...");
		headTextView.setTypeface(Typeface.DEFAULT_BOLD);
		headTextView.setTextSize(15);
		headTextView.setBackgroundColor(Color.WHITE);
		headTextView.invalidate();
		list_tab_a.addHeaderView(headTextView, null, false);
		list_tab_a.setPadding(0, -100, 0, 0);list_tab_a.setOnTouchListener(this);
		list_tab_a.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(getActivity(), ticketinfodetail.class);
				// resultCode---请求码
				Bundle bundle = new Bundle(); // 创建Bundle对象
				bundle.putString("ticketmoney", ticketmoney[position - 1]);
				bundle.putString("ticketstatue", ticketstatue[position - 1]);
				bundle.putString("ticketno", ticketno[position - 1]);
				bundle.putString("ticketId", ticketId[position - 1]);
				bundle.putString("ticketOrderNo", ticketOrderNo[position - 1]);
				bundle.putString("ticketContent", ticketContent[position - 1]);
				bundle.putString("ticketZhongjiang", ticketZhongjiang[position - 1]);// 装入数据
				intent.putExtras(bundle);
				startActivityForResult(intent, 1);

			}
		});
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// System.out.println("AAAAAAAAAA____onActivityCreated");
	}

	@Override
	public void onStart() {
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
		second = 200;
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
		// System.out.println("AAAAAAAAAA____onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		// System.out.println("AAAAAAAAAA____onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		// System.out.println("AAAAAAAAAA____onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		// System.out.println("AAAAAAAAAA____onStop");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		// System.out.println("AAAAAAAAAA____onDestroyView");
	}

	@Override
	public void onDestroy() {
		getnew();
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		super.onDestroy();
		// System.out.println("AAAAAAAAAA____onDestroy");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		// System.out.println("AAAAAAAAAA____onDetach");
	}

	protected void go() {
		// TODO Auto-generated method stub
		// Log.e("log_tag", "ismethisgooooo");
		list_tab_a.setPadding(0, -100, 0, 0);
		mAdapter = new recondadapter(getActivity(), getData());
		list_tab_a.setAdapter(mAdapter);
		if (length == 0) {
			text_loading.setVisibility(View.VISIBLE);
			text_loading.setText("无数据");
		} else {
			text_loading.setVisibility(View.GONE);
		}

	}

	private List<recondmodel> getData() {

		List<recondmodel> list = new ArrayList<recondmodel>();
		// Log.e("length", "" + length);
		// Log.e("log_tag", "ismethis");
		for (int i = 0; i < length; i++) {
			// Log.d("ismethis1", ticketno[i]);
			if (i == 0) {
				ticketif[i] = 1;
			} else {
				ticketif[i] = 0;
				// Log.e("log_tag", "ismethis1");
				String t[] = ticketOrderNo[i].split("");
				// Log.e("log_tag", "ismethis2");
				String no1 = t[1] + t[2] + t[3] + t[4] + t[5] + t[6] + t[7] + t[8];
				// / Log.e("log_tag", "ismethis3");
				String y[] = ticketOrderNo[i - 1].split("");
				// Log.e("log_tag", "ismethis4");
				String no2 = y[1] + y[2] + y[3] + y[4] + y[5] + y[6] + y[7] + y[8];
				if (!no1.equals(no2)) {
					ticketif[i] = 1;
				}
			}
			recondmodel orderinfo = new recondmodel();
			orderinfo.setTicketif(ticketif[i]);
			orderinfo.setTicketmoney(ticketmoney[i]);
			orderinfo.setTicketno(ticketno[i]);
			orderinfo.setTicketstatue(ticketstatue[i]);
			orderinfo.setTicketOrderNo(ticketOrderNo[i]);		orderinfo.setTicketContent(ticketContent[i]);
			list.add(orderinfo);

			// Log.e("log_tag", "ismefour");

		}
		return list;
	}

	public void getnew() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		nameValuePairs.add(new BasicNameValuePair("pagesize", "50"));
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
				// / Log.d("TabAFragment", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetWeikaijiangList");
				// Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				// / Log.d("TabAFragment", "111");
				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					// / Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					// Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					// Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					// Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						length = 0;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);

							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("no");
							// value[i] = json_data.getString("value");
							ticketmoney[i] = json_data.getString("Memony");
							ticketstatue[i] = json_data.getString("OrderStatus");
							ticketno[i] = json_data.getString("No");
							// Log.d("ismethis1json_data", ticketno[i]);
							ticketId[i] = json_data.getString("Id");
							ticketOrderNo[i] = json_data.getString("OrderNo");
							ticketContent[i] = json_data.getString("Content");
							ticketZhongjiang[i] = json_data.getString("Zhongjiang");
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
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		float tempY = event.getY();
		firstItemIndex = list_tab_a.getFirstVisiblePosition();
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
		case MotionEvent.ACTION_MOVE:
			if (!isRecored && (firstItemIndex == 0)) {
				isRecored = true;
				startY = tempY;
			}
			break;
		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_CANCEL:
			isRecored = false;
			break;

		default:
			break;
		}

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			break;
		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_CANCEL:
			list_tab_a.setPadding(0, 0, 0, 0);
			if (tempY - startY < 400) {
				list_tab_a.setPadding(0, -100, 0, 0);
			} else {
				getnew();
			}
			break;
		case MotionEvent.ACTION_MOVE:
			if (isRecored && tempY > startY) {
				list_tab_a.setPadding(0, (int) ((tempY - startY) / RATIO - 100), 0, 0);
			}
			break;

		default:
			break;
		}
		return false;
	}
}
