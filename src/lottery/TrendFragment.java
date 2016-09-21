package lottery;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import threeDandpailiethree.threeDBaseActivityticket;
import ticketpackage.BaseActivityticket;
import trend.chongqing;
import trend.jiangxi;
import trend.pailie;
import trend.threed;
import trend.tianjin;
import trend.xinjiang;

public class TrendFragment extends BaseFragment implements OnClickListener, OnTouchListener {
	private SharedPreferences cookiesdetail;
	private String cookies;
	private LinearLayout lin_chongqingnumber;
	private LinearLayout lin_jiangxinumber;
	private LinearLayout lin_tianjinnumber;
	private LinearLayout lin_xinjiangnumber;
	private LinearLayout lin_threednumber;
	private LinearLayout lin_pailienumber;
	private Button btn_chongqing;
	private TextView text_chongqing_expect_one;
	private TextView text_chongqing_expect_one1;
	private TextView text_chongqing_expect_one2;
	private TextView text_chongqing_expect_one3;
	private TextView text_chongqing_expect_one4;
	private TextView text_chongqing_expect_one5;
	private TextView text_chongqing_expect_two;
	private TextView text_chongqing_expect_two1;
	private TextView text_chongqing_expect_two2;
	private TextView text_chongqing_expect_two3;
	private TextView text_chongqing_expect_two4;
	private TextView text_chongqing_expect_two5;
	private TextView text_chongqing_expect_three;
	private TextView text_chongqing_expect_three1;
	private TextView text_chongqing_expect_three2;
	private TextView text_chongqing_expect_three3;
	private TextView text_chongqing_expect_three4;
	private TextView text_chongqing_expect_three5;
	private Button btn_tianjin;
	private TextView text_tianjin_expect_one;
	private TextView text_tianjin_expect_one1;
	private TextView text_tianjin_expect_one2;
	private TextView text_tianjin_expect_one3;
	private TextView text_tianjin_expect_one4;
	private TextView text_tianjin_expect_one5;
	private TextView text_tianjin_expect_two;
	private TextView text_tianjin_expect_two1;
	private TextView text_tianjin_expect_two2;
	private TextView text_tianjin_expect_two3;
	private TextView text_tianjin_expect_two4;
	private TextView text_tianjin_expect_two5;
	private TextView text_tianjin_expect_three;
	private TextView text_tianjin_expect_three1;
	private TextView text_tianjin_expect_three2;
	private TextView text_tianjin_expect_three3;
	private TextView text_tianjin_expect_three4;
	private TextView text_tianjin_expect_three5;
	private Button btn_xinjiang;
	private TextView text_xinjiang_expect_one;
	private TextView text_xinjiang_expect_one1;
	private TextView text_xinjiang_expect_one2;
	private TextView text_xinjiang_expect_one3;
	private TextView text_xinjiang_expect_one4;
	private TextView text_xinjiang_expect_one5;
	private TextView text_xinjiang_expect_two;
	private TextView text_xinjiang_expect_two1;
	private TextView text_xinjiang_expect_two2;
	private TextView text_xinjiang_expect_two3;
	private TextView text_xinjiang_expect_two4;
	private TextView text_xinjiang_expect_two5;
	private TextView text_xinjiang_expect_three;
	private TextView text_xinjiang_expect_three1;
	private TextView text_xinjiang_expect_three2;
	private TextView text_xinjiang_expect_three3;
	private TextView text_xinjiang_expect_three4;
	private TextView text_xinjiang_expect_three5;
	private Button btn_jiangxi;
	private TextView text_jiangxi_expect_one;
	private TextView text_jiangxi_expect_one1;
	private TextView text_jiangxi_expect_one2;
	private TextView text_jiangxi_expect_one3;
	private TextView text_jiangxi_expect_one4;
	private TextView text_jiangxi_expect_one5;
	private TextView text_jiangxi_expect_two;
	private TextView text_jiangxi_expect_two1;
	private TextView text_jiangxi_expect_two2;
	private TextView text_jiangxi_expect_two3;
	private TextView text_jiangxi_expect_two4;
	private TextView text_jiangxi_expect_two5;
	private TextView text_jiangxi_expect_three;
	private TextView text_jiangxi_expect_three1;
	private TextView text_jiangxi_expect_three2;
	private TextView text_jiangxi_expect_three3;
	private TextView text_jiangxi_expect_three4;
	private TextView text_jiangxi_expect_three5;
	private Button btn_threed;
	private TextView text_threed_expect_one;
	private TextView text_threed_expect_one1;
	private TextView text_threed_expect_one2;
	private TextView text_threed_expect_one3;
	private TextView text_threed_expect_one4;
	private TextView text_threed_expect_one5;
	private TextView text_threed_expect_two;
	private TextView text_threed_expect_two1;
	private TextView text_threed_expect_two2;
	private TextView text_threed_expect_two3;
	private TextView text_threed_expect_two4;
	private TextView text_threed_expect_two5;
	private TextView text_threed_expect_three;
	private TextView text_threed_expect_three1;
	private TextView text_threed_expect_three2;
	private TextView text_threed_expect_three3;
	private TextView text_threed_expect_three4;
	private TextView text_threed_expect_three5;
	private Button btn_pailie;
	private TextView text_pailie_expect_one;
	private TextView text_pailie_expect_one1;
	private TextView text_pailie_expect_one2;
	private TextView text_pailie_expect_one3;
	private TextView text_pailie_expect_one4;
	private TextView text_pailie_expect_one5;
	private TextView text_pailie_expect_two;
	private TextView text_pailie_expect_two1;
	private TextView text_pailie_expect_two2;
	private TextView text_pailie_expect_two3;
	private TextView text_pailie_expect_two4;
	private TextView text_pailie_expect_two5;
	private TextView text_pailie_expect_three;
	private TextView text_pailie_expect_three1;
	private TextView text_pailie_expect_three2;
	private TextView text_pailie_expect_three3;
	private TextView text_pailie_expect_three4;
	private TextView text_pailie_expect_three5;
	private String[] data = { "0", "0", "0", "0", "0", "0" };
	private String[] chongqingexpect = { "111111111100", "111111111100", "111111111100" };
	private String[] chongqingvalue = { "11111", "11111", "11111" };
	private String[] jiangxiexpect = { "111111111100", "111111111100", "111111111100" };
	private String[] jiangxivalue = { "11111", "11111", "11111" };
	private String[] tianjinexpect = { "111111111100", "111111111100", "111111111100" };
	private String[] tianjinvalue = { "11111", "11111", "11111" };
	private String[] xinjiangexpect = { "111111111100", "111111111100", "111111111100" };
	private String[] xinjiangvalue = { "11111", "11111", "11111" };
	private String[] threedexpect = { "111111111100", "111111111100", "111111111100" };
	private String[] threedvalue = { "11111", "11111", "11111" };
	private String[] pailieexpect = { "111111111100", "111111111100", "111111111100" };
	private String[] pailievalue = { "11111", "11111", "11111" };
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
				shownumber();
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
			System.out.println("han死死死死死死死死死死死死死死死死dle!");
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
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View newsLayout = inflater.inflate(R.layout.opentendicy, container, false);
		InitView(newsLayout);
		InitData();
		return newsLayout;
	}

	private void InitData() {
		// TODO Auto-generated method stub
	}

	private void InitView(View view) {
		// TODO Auto-generated method stub
		// 、 listview = (ListView) view.findViewById(R.id.openTendicyListView);
		cookiesdetail = getActivity().getSharedPreferences("cookies", Context.MODE_PRIVATE);
		lin_chongqingnumber = (LinearLayout) view.findViewById(R.id.lin_chongqingnumber);
		lin_jiangxinumber = (LinearLayout) view.findViewById(R.id.lin_jiangxinumber);
		lin_tianjinnumber = (LinearLayout) view.findViewById(R.id.lin_tianjinnumber);
		lin_xinjiangnumber = (LinearLayout) view.findViewById(R.id.lin_xinjiangnumber);
		lin_threednumber = (LinearLayout) view.findViewById(R.id.lin_threednumber);
		lin_pailienumber = (LinearLayout) view.findViewById(R.id.lin_pailienumber);
		lin_chongqingnumber.setOnClickListener(this);
		lin_chongqingnumber.setOnTouchListener(this);
		lin_jiangxinumber.setOnClickListener(this);
		lin_jiangxinumber.setOnTouchListener(this);
		lin_tianjinnumber.setOnClickListener(this);
		lin_tianjinnumber.setOnTouchListener(this);
		lin_xinjiangnumber.setOnClickListener(this);
		lin_xinjiangnumber.setOnTouchListener(this);
		lin_threednumber.setOnClickListener(this);
		lin_threednumber.setOnTouchListener(this);
		lin_pailienumber.setOnClickListener(this);
		lin_pailienumber.setOnTouchListener(this);
		btn_chongqing = (Button) view.findViewById(R.id.btn_chongqing);
		text_chongqing_expect_one = (TextView) view.findViewById(R.id.text_chongqing_expect_one);
		text_chongqing_expect_one1 = (TextView) view.findViewById(R.id.text_chongqing_expect_one1);
		text_chongqing_expect_one2 = (TextView) view.findViewById(R.id.text_chongqing_expect_one2);
		text_chongqing_expect_one3 = (TextView) view.findViewById(R.id.text_chongqing_expect_one3);
		text_chongqing_expect_one4 = (TextView) view.findViewById(R.id.text_chongqing_expect_one4);
		text_chongqing_expect_one5 = (TextView) view.findViewById(R.id.text_chongqing_expect_one5);
		text_chongqing_expect_two = (TextView) view.findViewById(R.id.text_chongqing_expect_two);
		text_chongqing_expect_two1 = (TextView) view.findViewById(R.id.text_chongqing_expect_two1);
		text_chongqing_expect_two2 = (TextView) view.findViewById(R.id.text_chongqing_expect_two2);
		text_chongqing_expect_two3 = (TextView) view.findViewById(R.id.text_chongqing_expect_two3);
		text_chongqing_expect_two4 = (TextView) view.findViewById(R.id.text_chongqing_expect_two4);
		text_chongqing_expect_two5 = (TextView) view.findViewById(R.id.text_chongqing_expect_two5);
		text_chongqing_expect_three = (TextView) view.findViewById(R.id.text_chongqing_expect_three);
		text_chongqing_expect_three1 = (TextView) view.findViewById(R.id.text_chongqing_expect_three1);
		text_chongqing_expect_three2 = (TextView) view.findViewById(R.id.text_chongqing_expect_three2);
		text_chongqing_expect_three3 = (TextView) view.findViewById(R.id.text_chongqing_expect_three3);
		text_chongqing_expect_three4 = (TextView) view.findViewById(R.id.text_chongqing_expect_three4);
		text_chongqing_expect_three5 = (TextView) view.findViewById(R.id.text_chongqing_expect_three5);
		btn_tianjin = (Button) view.findViewById(R.id.btn_tianjin);
		text_tianjin_expect_one = (TextView) view.findViewById(R.id.text_tianjin_expect_one);
		text_tianjin_expect_one1 = (TextView) view.findViewById(R.id.text_tianjin_expect_one1);
		text_tianjin_expect_one2 = (TextView) view.findViewById(R.id.text_tianjin_expect_one2);
		text_tianjin_expect_one3 = (TextView) view.findViewById(R.id.text_tianjin_expect_one3);
		text_tianjin_expect_one4 = (TextView) view.findViewById(R.id.text_tianjin_expect_one4);
		text_tianjin_expect_one5 = (TextView) view.findViewById(R.id.text_tianjin_expect_one5);
		text_tianjin_expect_two = (TextView) view.findViewById(R.id.text_tianjin_expect_two);
		text_tianjin_expect_two1 = (TextView) view.findViewById(R.id.text_tianjin_expect_two1);
		text_tianjin_expect_two2 = (TextView) view.findViewById(R.id.text_tianjin_expect_two2);
		text_tianjin_expect_two3 = (TextView) view.findViewById(R.id.text_tianjin_expect_two3);
		text_tianjin_expect_two4 = (TextView) view.findViewById(R.id.text_tianjin_expect_two4);
		text_tianjin_expect_two5 = (TextView) view.findViewById(R.id.text_tianjin_expect_two5);
		text_tianjin_expect_three = (TextView) view.findViewById(R.id.text_tianjin_expect_three);
		text_tianjin_expect_three1 = (TextView) view.findViewById(R.id.text_tianjin_expect_three1);
		text_tianjin_expect_three2 = (TextView) view.findViewById(R.id.text_tianjin_expect_three2);
		text_tianjin_expect_three3 = (TextView) view.findViewById(R.id.text_tianjin_expect_three3);
		text_tianjin_expect_three4 = (TextView) view.findViewById(R.id.text_tianjin_expect_three4);
		text_tianjin_expect_three5 = (TextView) view.findViewById(R.id.text_tianjin_expect_three5);
		btn_xinjiang = (Button) view.findViewById(R.id.btn_xinjiang);
		text_xinjiang_expect_one = (TextView) view.findViewById(R.id.text_xinjiang_expect_one);
		text_xinjiang_expect_one1 = (TextView) view.findViewById(R.id.text_xinjiang_expect_one1);
		text_xinjiang_expect_one2 = (TextView) view.findViewById(R.id.text_xinjiang_expect_one2);
		text_xinjiang_expect_one3 = (TextView) view.findViewById(R.id.text_xinjiang_expect_one3);
		text_xinjiang_expect_one4 = (TextView) view.findViewById(R.id.text_xinjiang_expect_one4);
		text_xinjiang_expect_one5 = (TextView) view.findViewById(R.id.text_xinjiang_expect_one5);
		text_xinjiang_expect_two = (TextView) view.findViewById(R.id.text_xinjiang_expect_two);
		text_xinjiang_expect_two1 = (TextView) view.findViewById(R.id.text_xinjiang_expect_two1);
		text_xinjiang_expect_two2 = (TextView) view.findViewById(R.id.text_xinjiang_expect_two2);
		text_xinjiang_expect_two3 = (TextView) view.findViewById(R.id.text_xinjiang_expect_two3);
		text_xinjiang_expect_two4 = (TextView) view.findViewById(R.id.text_xinjiang_expect_two4);
		text_xinjiang_expect_two5 = (TextView) view.findViewById(R.id.text_xinjiang_expect_two5);
		text_xinjiang_expect_three = (TextView) view.findViewById(R.id.text_xinjiang_expect_three);
		text_xinjiang_expect_three1 = (TextView) view.findViewById(R.id.text_xinjiang_expect_three1);
		text_xinjiang_expect_three2 = (TextView) view.findViewById(R.id.text_xinjiang_expect_three2);
		text_xinjiang_expect_three3 = (TextView) view.findViewById(R.id.text_xinjiang_expect_three3);
		text_xinjiang_expect_three4 = (TextView) view.findViewById(R.id.text_xinjiang_expect_three4);
		text_xinjiang_expect_three5 = (TextView) view.findViewById(R.id.text_xinjiang_expect_three5);
		btn_jiangxi = (Button) view.findViewById(R.id.btn_jiangxi);
		text_jiangxi_expect_one = (TextView) view.findViewById(R.id.text_jiangxi_expect_one);
		text_jiangxi_expect_one1 = (TextView) view.findViewById(R.id.text_jiangxi_expect_one1);
		text_jiangxi_expect_one2 = (TextView) view.findViewById(R.id.text_jiangxi_expect_one2);
		text_jiangxi_expect_one3 = (TextView) view.findViewById(R.id.text_jiangxi_expect_one3);
		text_jiangxi_expect_one4 = (TextView) view.findViewById(R.id.text_jiangxi_expect_one4);
		text_jiangxi_expect_one5 = (TextView) view.findViewById(R.id.text_jiangxi_expect_one5);
		text_jiangxi_expect_two = (TextView) view.findViewById(R.id.text_jiangxi_expect_two);
		text_jiangxi_expect_two1 = (TextView) view.findViewById(R.id.text_jiangxi_expect_two1);
		text_jiangxi_expect_two2 = (TextView) view.findViewById(R.id.text_jiangxi_expect_two2);
		text_jiangxi_expect_two3 = (TextView) view.findViewById(R.id.text_jiangxi_expect_two3);
		text_jiangxi_expect_two4 = (TextView) view.findViewById(R.id.text_jiangxi_expect_two4);
		text_jiangxi_expect_two5 = (TextView) view.findViewById(R.id.text_jiangxi_expect_two5);
		text_jiangxi_expect_three = (TextView) view.findViewById(R.id.text_jiangxi_expect_three);
		text_jiangxi_expect_three1 = (TextView) view.findViewById(R.id.text_jiangxi_expect_three1);
		text_jiangxi_expect_three2 = (TextView) view.findViewById(R.id.text_jiangxi_expect_three2);
		text_jiangxi_expect_three3 = (TextView) view.findViewById(R.id.text_jiangxi_expect_three3);
		text_jiangxi_expect_three4 = (TextView) view.findViewById(R.id.text_jiangxi_expect_three4);
		text_jiangxi_expect_three5 = (TextView) view.findViewById(R.id.text_jiangxi_expect_three5);
		// shownumber();
		btn_pailie = (Button) view.findViewById(R.id.btn_pailie);
		text_pailie_expect_one = (TextView) view.findViewById(R.id.text_pailie_expect_one);
		text_pailie_expect_one1 = (TextView) view.findViewById(R.id.text_pailie_expect_one1);
		text_pailie_expect_one2 = (TextView) view.findViewById(R.id.text_pailie_expect_one2);
		text_pailie_expect_one3 = (TextView) view.findViewById(R.id.text_pailie_expect_one3);
		text_pailie_expect_one4 = (TextView) view.findViewById(R.id.text_pailie_expect_one4);
		text_pailie_expect_one5 = (TextView) view.findViewById(R.id.text_pailie_expect_one5);
		text_pailie_expect_two = (TextView) view.findViewById(R.id.text_pailie_expect_two);
		text_pailie_expect_two1 = (TextView) view.findViewById(R.id.text_pailie_expect_two1);
		text_pailie_expect_two2 = (TextView) view.findViewById(R.id.text_pailie_expect_two2);
		text_pailie_expect_two3 = (TextView) view.findViewById(R.id.text_pailie_expect_two3);
		text_pailie_expect_two4 = (TextView) view.findViewById(R.id.text_pailie_expect_two4);
		text_pailie_expect_two5 = (TextView) view.findViewById(R.id.text_pailie_expect_two5);
		text_pailie_expect_three = (TextView) view.findViewById(R.id.text_pailie_expect_three);
		text_pailie_expect_three1 = (TextView) view.findViewById(R.id.text_pailie_expect_three1);
		text_pailie_expect_three2 = (TextView) view.findViewById(R.id.text_pailie_expect_three2);
		text_pailie_expect_three3 = (TextView) view.findViewById(R.id.text_pailie_expect_three3);
		text_pailie_expect_three4 = (TextView) view.findViewById(R.id.text_pailie_expect_three4);
		text_pailie_expect_three5 = (TextView) view.findViewById(R.id.text_pailie_expect_three5);
		// shownumber();
		btn_threed = (Button) view.findViewById(R.id.btn_threed);
		text_threed_expect_one = (TextView) view.findViewById(R.id.text_threed_expect_one);
		text_threed_expect_one1 = (TextView) view.findViewById(R.id.text_threed_expect_one1);
		text_threed_expect_one2 = (TextView) view.findViewById(R.id.text_threed_expect_one2);
		text_threed_expect_one3 = (TextView) view.findViewById(R.id.text_threed_expect_one3);
		text_threed_expect_one4 = (TextView) view.findViewById(R.id.text_threed_expect_one4);
		text_threed_expect_one5 = (TextView) view.findViewById(R.id.text_threed_expect_one5);
		text_threed_expect_two = (TextView) view.findViewById(R.id.text_threed_expect_two);
		text_threed_expect_two1 = (TextView) view.findViewById(R.id.text_threed_expect_two1);
		text_threed_expect_two2 = (TextView) view.findViewById(R.id.text_threed_expect_two2);
		text_threed_expect_two3 = (TextView) view.findViewById(R.id.text_threed_expect_two3);
		text_threed_expect_two4 = (TextView) view.findViewById(R.id.text_threed_expect_two4);
		text_threed_expect_two5 = (TextView) view.findViewById(R.id.text_threed_expect_two5);
		text_threed_expect_three = (TextView) view.findViewById(R.id.text_threed_expect_three);
		text_threed_expect_three1 = (TextView) view.findViewById(R.id.text_threed_expect_three1);
		text_threed_expect_three2 = (TextView) view.findViewById(R.id.text_threed_expect_three2);
		text_threed_expect_three3 = (TextView) view.findViewById(R.id.text_threed_expect_three3);
		text_threed_expect_three4 = (TextView) view.findViewById(R.id.text_threed_expect_three4);
		text_threed_expect_three5 = (TextView) view.findViewById(R.id.text_threed_expect_three5);
		// shownumber();

		btn_xinjiang.setOnClickListener(this);
		btn_threed.setOnClickListener(this);
		btn_pailie.setOnClickListener(this);
		btn_chongqing.setOnClickListener(this);
		btn_jiangxi.setOnClickListener(this);
		btn_tianjin.setOnClickListener(this);
		btn_xinjiang.setOnTouchListener(this);
		btn_threed.setOnTouchListener(this);
		btn_pailie.setOnTouchListener(this);
		btn_chongqing.setOnTouchListener(this);
		btn_jiangxi.setOnTouchListener(this);
		btn_tianjin.setOnTouchListener(this);

		getnew();
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		BaseActivity.curFragmentTag = getString(R.string.word_trend);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.lin_chongqingnumber:

			int actionlin_chongqingnumber = event.getAction();
			if (actionlin_chongqingnumber == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				lin_chongqingnumber.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionlin_chongqingnumber == MotionEvent.ACTION_UP) {
				// lin_chongqingnumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// lin_chongqingnumber.setBackgroundColor(0xffC1FFC1);
				lin_chongqingnumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionlin_chongqingnumber == MotionEvent.ACTION_CANCEL) {
				// lin_chongqingnumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				lin_chongqingnumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.lin_jiangxinumber:

			int actionlin_jiangxinumber = event.getAction();
			if (actionlin_jiangxinumber == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				lin_jiangxinumber.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionlin_jiangxinumber == MotionEvent.ACTION_UP) {
				// lin_jiangxinumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// lin_jiangxinumber.setBackgroundColor(0xffC1FFC1);
				lin_jiangxinumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionlin_jiangxinumber == MotionEvent.ACTION_CANCEL) {
				// lin_jiangxinumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				lin_jiangxinumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.lin_tianjinnumber:

			int actionlin_tianjinnumber = event.getAction();
			if (actionlin_tianjinnumber == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				lin_tianjinnumber.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionlin_tianjinnumber == MotionEvent.ACTION_UP) {
				// lin_tianjinnumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// lin_tianjinnumber.setBackgroundColor(0xffC1FFC1);
				lin_tianjinnumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionlin_tianjinnumber == MotionEvent.ACTION_CANCEL) {
				// lin_tianjinnumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				lin_tianjinnumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.lin_xinjiangnumber:

			int actionlin_xinjiangnumber = event.getAction();
			if (actionlin_xinjiangnumber == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				lin_xinjiangnumber.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionlin_xinjiangnumber == MotionEvent.ACTION_UP) {
				// lin_xinjiangnumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// lin_xinjiangnumber.setBackgroundColor(0xffC1FFC1);
				lin_xinjiangnumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionlin_xinjiangnumber == MotionEvent.ACTION_CANCEL) {
				// lin_xinjiangnumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				lin_xinjiangnumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.lin_pailienumber:

			int actionlin_pailienumber = event.getAction();
			if (actionlin_pailienumber == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				lin_pailienumber.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionlin_pailienumber == MotionEvent.ACTION_UP) {
				// lin_pailienumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// lin_pailienumber.setBackgroundColor(0xffC1FFC1);
				lin_pailienumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionlin_pailienumber == MotionEvent.ACTION_CANCEL) {
				// lin_pailienumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				lin_pailienumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.lin_threednumber:

			int actionlin_threednumber = event.getAction();
			if (actionlin_threednumber == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				lin_threednumber.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionlin_threednumber == MotionEvent.ACTION_UP) {
				// lin_threednumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// lin_threednumber.setBackgroundColor(0xffC1FFC1);
				lin_threednumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionlin_threednumber == MotionEvent.ACTION_CANCEL) {
				// lin_threednumber.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				lin_threednumber.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_pailie:
			int actionbtn_pailie = event.getAction();
			if (actionbtn_pailie == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				btn_pailie.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionbtn_pailie == MotionEvent.ACTION_UP) {
				// btn_pailie.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// btn_pailie.setBackgroundColor(0xffC1FFC1);
				btn_pailie.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionbtn_pailie == MotionEvent.ACTION_CANCEL) {
				// btn_pailie.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				btn_pailie.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_threed:
			int actionbtn_threed = event.getAction();
			if (actionbtn_threed == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				btn_threed.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionbtn_threed == MotionEvent.ACTION_UP) {
				// btn_threed.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// btn_threed.setBackgroundColor(0xffC1FFC1);
				btn_threed.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionbtn_threed == MotionEvent.ACTION_CANCEL) {
				// btn_threed.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				btn_threed.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_xinjiang:
			int actionbtn_xinjiang = event.getAction();
			if (actionbtn_xinjiang == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				btn_xinjiang.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionbtn_xinjiang == MotionEvent.ACTION_UP) {
				// btn_xinjiang.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// btn_xinjiang.setBackgroundColor(0xffC1FFC1);
				btn_xinjiang.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionbtn_xinjiang == MotionEvent.ACTION_CANCEL) {
				// btn_xinjiang.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				btn_xinjiang.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_chongqing:
			int actionbtn_chongqing = event.getAction();
			if (actionbtn_chongqing == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				btn_chongqing.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionbtn_chongqing == MotionEvent.ACTION_UP) {
				// btn_chongqing.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// btn_chongqing.setBackgroundColor(0xffC1FFC1);
				btn_chongqing.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionbtn_chongqing == MotionEvent.ACTION_CANCEL) {
				// btn_chongqing.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				btn_chongqing.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_jiangxi:
			int actionbtn_jiangxi = event.getAction();
			if (actionbtn_jiangxi == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				btn_jiangxi.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionbtn_jiangxi == MotionEvent.ACTION_UP) {
				// btn_jiangxi.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// btn_jiangxi.setBackgroundColor(0xffC1FFC1);
				btn_jiangxi.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionbtn_jiangxi == MotionEvent.ACTION_CANCEL) {
				// btn_jiangxi.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				btn_jiangxi.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_tianjin:
			int actionbtn_tianjin = event.getAction();
			if (actionbtn_tianjin == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				btn_tianjin.setBackgroundColor(0xffF0F8FF);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionbtn_tianjin == MotionEvent.ACTION_UP) {
				// btn_tianjin.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				// btn_tianjin.setBackgroundColor(0xffC1FFC1);
				btn_tianjin.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionbtn_tianjin == MotionEvent.ACTION_CANCEL) {
				// btn_tianjin.setVisibility(View.INVISIBLE);
				// btn_Fivegroup5_erchong_x0.setVisibility(View.INVISIBLE);
				btn_tianjin.setBackgroundColor(0);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		default:
			break;
		}
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.lin_chongqingnumber:
			Intent intent = new Intent(getActivity(), chongqing.class);
			// b.putString("ordertype", "baojie");
			// intent.putExtra("tickettypecode", 4);
			startActivity(intent);
			break;
		case R.id.lin_jiangxinumber:
			Intent intent2 = new Intent(getActivity(), jiangxi.class);
			// b.putString("ordertype", "baojie");
			// intent.putExtra("tickettypecode", 4);
			startActivity(intent2);
			break;
		case R.id.lin_tianjinnumber:
			Intent intent3 = new Intent(getActivity(), tianjin.class);
			// b.putString("ordertype", "baojie");
			// intent.putExtra("tickettypecode", 4);
			startActivity(intent3);
			break;
		case R.id.lin_xinjiangnumber:
			Intent intent4 = new Intent(getActivity(), xinjiang.class);
			// b.putString("ordertype", "baojie");
			// intent.putExtra("tickettypecode", 4);
			startActivity(intent4);
			break;
		case R.id.lin_threednumber:
			Intent intent9 = new Intent(getActivity(), threed.class);
			// b.putString("ordertype", "baojie");
			// intent.putExtra("tickettypecode", 4);
			startActivity(intent9);
			break;
		case R.id.lin_pailienumber:
			Intent intent10 = new Intent(getActivity(), pailie.class);
			// b.putString("ordertype", "baojie");
			// intent.putExtra("tickettypecode", 4);
			startActivity(intent10);
			break;
		case R.id.btn_xinjiang:
			Intent intent5 = new Intent(getActivity(), BaseActivityticket.class);

			// b.putString("ordertype", "baojie");
			intent5.putExtra("tickettypecode", 2);

			startActivity(intent5);
			break;
		case R.id.btn_chongqing:
			Intent intent6 = new Intent(getActivity(), BaseActivityticket.class);

			// b.putString("ordertype", "baojie");
			intent6.putExtra("tickettypecode", 4);

			startActivity(intent6);
			break;
		case R.id.btn_jiangxi:
			Intent intent7 = new Intent(getActivity(), BaseActivityticket.class);

			// b.putString("ordertype", "baojie");
			intent7.putExtra("tickettypecode", 3);

			startActivity(intent7);
			break;
		case R.id.btn_tianjin:
			Intent intent8 = new Intent(getActivity(), BaseActivityticket.class);

			// b.putString("ordertype", "baojie");
			intent8.putExtra("tickettypecode", 1);

			startActivity(intent8);
			break;
		case R.id.btn_pailie:
			Intent intent11 = new Intent(getActivity(), threeDBaseActivityticket.class);

			// b.putString("ordertype", "baojie");
			intent11.putExtra("tickettypecode", 6);

			startActivity(intent11);
			break;
		case R.id.btn_threed:
			Intent intent12 = new Intent(getActivity(), threeDBaseActivityticket.class);

			// b.putString("ordertype", "baojie");
			intent12.putExtra("tickettypecode", 5);

			startActivity(intent12);
			break;
		default:
			break;
		}
	}

	public void shownumber() {
		String chongqingone[] = chongqingvalue[0].split("");
		text_chongqing_expect_one.setText("第" + chongqingexpect[0] + "期");
		text_chongqing_expect_one1.setText(chongqingone[1]);
		text_chongqing_expect_one2.setText(chongqingone[2]);
		text_chongqing_expect_one3.setText(chongqingone[3]);
		text_chongqing_expect_one4.setText(chongqingone[4]);
		text_chongqing_expect_one5.setText(chongqingone[5]);
		String chongqingtwo[] = chongqingvalue[1].split("");
		text_chongqing_expect_two.setText("第" + chongqingexpect[1] + "期");
		text_chongqing_expect_two1.setText(chongqingtwo[1]);
		text_chongqing_expect_two2.setText(chongqingtwo[2]);
		text_chongqing_expect_two3.setText(chongqingtwo[3]);
		text_chongqing_expect_two4.setText(chongqingtwo[4]);
		text_chongqing_expect_two5.setText(chongqingtwo[5]);
		String chongqingthree[] = chongqingvalue[2].split("");
		text_chongqing_expect_three.setText("第" + chongqingexpect[2] + "期");
		text_chongqing_expect_three1.setText(chongqingthree[1]);
		text_chongqing_expect_three2.setText(chongqingthree[2]);
		text_chongqing_expect_three3.setText(chongqingthree[3]);
		text_chongqing_expect_three4.setText(chongqingthree[4]);
		text_chongqing_expect_three5.setText(chongqingthree[5]);
		String jiangxione[] = jiangxivalue[0].split("");
		text_jiangxi_expect_one.setText("第" + jiangxiexpect[0] + "期");
		text_jiangxi_expect_one1.setText(jiangxione[1]);
		text_jiangxi_expect_one2.setText(jiangxione[2]);
		text_jiangxi_expect_one3.setText(jiangxione[3]);
		text_jiangxi_expect_one4.setText(jiangxione[4]);
		text_jiangxi_expect_one5.setText(jiangxione[5]);
		String jiangxitwo[] = jiangxivalue[1].split("");
		text_jiangxi_expect_two.setText("第" + jiangxiexpect[1] + "期");
		text_jiangxi_expect_two1.setText(jiangxitwo[1]);
		text_jiangxi_expect_two2.setText(jiangxitwo[2]);
		text_jiangxi_expect_two3.setText(jiangxitwo[3]);
		text_jiangxi_expect_two4.setText(jiangxitwo[4]);
		text_jiangxi_expect_two5.setText(jiangxitwo[5]);
		String jiangxithree[] = jiangxivalue[2].split("");
		text_jiangxi_expect_three.setText("第" + jiangxiexpect[2] + "期");
		text_jiangxi_expect_three1.setText(jiangxithree[1]);
		text_jiangxi_expect_three2.setText(jiangxithree[2]);
		text_jiangxi_expect_three3.setText(jiangxithree[3]);
		text_jiangxi_expect_three4.setText(jiangxithree[4]);
		text_jiangxi_expect_three5.setText(jiangxithree[5]);

		String tianjinone[] = tianjinvalue[0].split("");
		text_tianjin_expect_one.setText("第" + tianjinexpect[0] + "期");
		text_tianjin_expect_one1.setText(tianjinone[1]);
		text_tianjin_expect_one2.setText(tianjinone[2]);
		text_tianjin_expect_one3.setText(tianjinone[3]);
		text_tianjin_expect_one4.setText(tianjinone[4]);
		text_tianjin_expect_one5.setText(tianjinone[5]);
		String tianjintwo[] = tianjinvalue[1].split("");
		text_tianjin_expect_two.setText("第" + tianjinexpect[1] + "期");
		text_tianjin_expect_two1.setText(tianjintwo[1]);
		text_tianjin_expect_two2.setText(tianjintwo[2]);
		text_tianjin_expect_two3.setText(tianjintwo[3]);
		text_tianjin_expect_two4.setText(tianjintwo[4]);
		text_tianjin_expect_two5.setText(tianjintwo[5]);
		String tianjinthree[] = tianjinvalue[2].split("");
		text_tianjin_expect_three.setText("第" + tianjinexpect[2] + "期");
		text_tianjin_expect_three1.setText(tianjinthree[1]);
		text_tianjin_expect_three2.setText(tianjinthree[2]);
		text_tianjin_expect_three3.setText(tianjinthree[3]);
		text_tianjin_expect_three4.setText(tianjinthree[4]);
		text_tianjin_expect_three5.setText(tianjinthree[5]);
		String xinjiangone[] = xinjiangvalue[0].split("");
		text_xinjiang_expect_one.setText("第" + xinjiangexpect[0] + "期");
		text_xinjiang_expect_one1.setText(xinjiangone[1]);
		text_xinjiang_expect_one2.setText(xinjiangone[2]);
		text_xinjiang_expect_one3.setText(xinjiangone[3]);
		text_xinjiang_expect_one4.setText(xinjiangone[4]);
		text_xinjiang_expect_one5.setText(xinjiangone[5]);
		String xinjiangtwo[] = xinjiangvalue[1].split("");
		text_xinjiang_expect_two.setText("第" + xinjiangexpect[1] + "期");
		text_xinjiang_expect_two1.setText(xinjiangtwo[1]);
		text_xinjiang_expect_two2.setText(xinjiangtwo[2]);
		text_xinjiang_expect_two3.setText(xinjiangtwo[3]);
		text_xinjiang_expect_two4.setText(xinjiangtwo[4]);
		text_xinjiang_expect_two5.setText(xinjiangtwo[5]);
		String xinjiangthree[] = xinjiangvalue[2].split("");
		text_xinjiang_expect_three.setText("第" + xinjiangexpect[2] + "期");
		text_xinjiang_expect_three1.setText(xinjiangthree[1]);
		text_xinjiang_expect_three2.setText(xinjiangthree[2]);
		text_xinjiang_expect_three3.setText(xinjiangthree[3]);
		text_xinjiang_expect_three4.setText(xinjiangthree[4]);
		text_xinjiang_expect_three5.setText(xinjiangthree[5]);
		String threedone[] = threedvalue[0].split(",");
		text_threed_expect_one.setText("第" + threedexpect[0] + "期");
		text_threed_expect_one1.setText(threedone[0]);
		text_threed_expect_one2.setText(threedone[1]);
		text_threed_expect_one3.setText(threedone[2]);
		String threedtwo[] = threedvalue[1].split(",");
		text_threed_expect_two.setText("第" + threedexpect[1] + "期");
		text_threed_expect_two1.setText(threedtwo[0]);
		text_threed_expect_two2.setText(threedtwo[1]);
		text_threed_expect_two3.setText(threedtwo[2]);
		String threedthree[] = threedvalue[2].split(",");
		text_threed_expect_three.setText("第" + threedexpect[2] + "期");
		text_threed_expect_three1.setText(threedthree[0]);
		text_threed_expect_three2.setText(threedthree[1]);
		text_threed_expect_three3.setText(threedthree[2]);
		String pailieone[] = pailievalue[0].split(",");
		text_pailie_expect_one.setText("第" + pailieexpect[0] + "期");
		text_pailie_expect_one1.setText(pailieone[0]);
		text_pailie_expect_one2.setText(pailieone[1]);
		text_pailie_expect_one3.setText(pailieone[2]);
		String pailietwo[] = pailievalue[1].split(",");
		text_pailie_expect_two.setText("第" + pailieexpect[1] + "期");
		text_pailie_expect_two1.setText(pailietwo[0]);
		text_pailie_expect_two2.setText(pailietwo[1]);
		text_pailie_expect_two3.setText(pailietwo[2]);
		String pailiethree[] = pailievalue[2].split(",");
		text_pailie_expect_three.setText("第" + pailieexpect[2] + "期");
		text_pailie_expect_three1.setText(pailiethree[0]);
		text_pailie_expect_three2.setText(pailiethree[1]);
		text_pailie_expect_three3.setText(pailiethree[2]);
	}

	public void getnew() {
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
				Log.d("xxxxx", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetLastKaijiangList");
				Log.d("xxxxx", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("xxxxx", "111");

				try {
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
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							// game[i] = json_data.getString("game");
							data[i] = json_data.getString("data");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						jArray = new JSONArray(data[0]);
						JSONObject json_data = null;
						int temp = jArray.length();
						if (temp > 3) {
							temp = 3;
						}
						for (int i = 0; i < temp; i++) {
							json_data = jArray.getJSONObject(i);
							chongqingvalue[i] = json_data.getString("Value");
							chongqingexpect[i] = json_data.getString("No");
							// game[i] = json_data.getString("game");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						jArray = new JSONArray(data[1]);
						JSONObject json_data = null;
						int temp = jArray.length();
						if (temp > 3) {
							temp = 3;
						}
						for (int i = 0; i < temp; i++) {
							json_data = jArray.getJSONObject(i);
							jiangxivalue[i] = json_data.getString("Value");
							jiangxiexpect[i] = json_data.getString("No");
							// game[i] = json_data.getString("game");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						jArray = new JSONArray(data[2]);
						JSONObject json_data = null;
						int temp = jArray.length();
						if (temp > 3) {
							temp = 3;
						}
						for (int i = 0; i < temp; i++) {
							json_data = jArray.getJSONObject(i);
							tianjinvalue[i] = json_data.getString("Value");
							tianjinexpect[i] = json_data.getString("No");
							// game[i] = json_data.getString("game");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						jArray = new JSONArray(data[3]);
						JSONObject json_data = null;
						int temp = jArray.length();
						if (temp > 3) {
							temp = 3;
						}
						for (int i = 0; i < temp; i++) {
							json_data = jArray.getJSONObject(i);
							xinjiangvalue[i] = json_data.getString("Value");
							xinjiangexpect[i] = json_data.getString("No");
							// game[i] = json_data.getString("game");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						jArray = new JSONArray(data[4]);
						JSONObject json_data = null;
						int temp = jArray.length();
						if (temp > 3) {
							temp = 3;
						}
						for (int i = 0; i < temp; i++) {
							json_data = jArray.getJSONObject(i);
							threedvalue[i] = json_data.getString("Value");
							threedexpect[i] = json_data.getString("No");
							// game[i] = json_data.getString("game");
						}
					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
					}
					try {
						jArray = new JSONArray(data[5]);
						JSONObject json_data = null;
						int temp = jArray.length();
						if (temp > 3) {
							temp = 3;
						}
						for (int i = 0; i < temp; i++) {
							json_data = jArray.getJSONObject(i);
							pailievalue[i] = json_data.getString("Value");
							pailieexpect[i] = json_data.getString("No");
							// game[i] = json_data.getString("game");
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
	public void onDestroy() {
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
