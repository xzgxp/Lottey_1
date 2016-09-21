package lottery;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.entertiment.util.URLContainer;
import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import other.chongzhi;
import other.message;
import other.tixian;
import threeDandpailiethree.threeDBaseActivityticket;
import ticketpackage.BaseActivityticket;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public class RecommendFragment extends BaseFragment implements OnTouchListener {

	private static final String TAG = "MessageFragment";
	private BaseActivity mMainActivity;
	private LinearLayout lin_goticketnumberchoose;
	private TextView text_new_fifth;
	private SharedPreferences cookiesdetail;
	private SharedPreferences userinfo;
	private SharedPreferences xinjiang;
	private String cookies;
	private String[] game = { "0", "0", "0", "0" };
	private String[] no = { "0", "0", "0", "0" };
	private String[] value = { "0", "0", "0", "0" };
	private TextView text_new_fouth;

	private TextView text_new_third;

	private TextView text_new_second;

	private TextView text_new_first;

	private TextView text_new_ticketgroup;

	private TextView text_new_tickettype;
	private ImageButton btn_ticket_type1, btn_ticket_type2, btn_ticket_type3;
	private ImageButton btn_ticket_type4, btn_ticket_type5, btn_ticket_type6;
	private TextView text_ticketcustom;
	private int distinguish1 = 1, distinguish2 = 2, distinguish3 = 0;
	private int distinguish4 = 0, distinguish5 = 0, distinguish6 = 0;
	private SharedPreferences pre;
	private SharedPreferences preticket;
	private int container_distinguish1 = 3, container_distinguish2 = 4;
	private int container_distinguish3 = 5, container_distinguish4 = 6;
	private int writesymbel;
	private float height;
	private float wight;
	private float relative_move_height;
	private RelativeLayout relative_move;
	private ImageButton btn_pickup, btn_slowdown;
	private RelativeLayout RelativeLayout_my_messages, RelativeLayout_bet_record;
	private RelativeLayout RelativeLayout_fast_withdraw, RelativeLayout_fast_recharge;
	private LinearLayout LinearLayout_tran;
	private LinearLayout lin_pic;
	private LinearLayout lin_new;
	private String username = "";
	private String rmb = "";
	private String sscrmb = "";
	private String shiyi5rmb = "";
	private String dipinrmb = "";
	private String tickettypesc = "cq";
	private String lastnumberjx = "0,0,0,0,0";
	private String lastnumbercq = "0,0,0,0,0";
	private String lastnumberxj = "0,0,0,0,0";
	private String lastnumbertj = "0,0,0,0,0";
	private String lastnojx = "00000000000";
	private String lastnocq = "00000000000";
	private String lastnoxj = "00000000000";
	private String lastnotj = "00000000000";
	private String gamejx = "江西";
	private String gamecq = "重庆";
	private String gamexj = "新疆";
	private String gametj = "天津";
	private TextView textview_username;
	private TextView textview_yesterdaywin;
	private TextView textview_account_balance;
	private TextView text_dipin;
	private TextView text_shiyi5;
	private SharedPreferences chongqing;
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "hjj6666");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				shownewticket();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}
	};

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View messageLayout = inflater.inflate(R.layout.activity_recommend, container, false);

		Log.d(TAG, "onCreateView---->");
		// Log.d("plan", cqplan.no[0]);
		chongqing = getActivity().getSharedPreferences("chongqing", Context.MODE_PRIVATE);
		LinearLayout_tran = (LinearLayout) messageLayout.findViewById(R.id.LinearLayout_tran);
		btn_pickup = (ImageButton) messageLayout.findViewById(R.id.btn_pickup);
		btn_slowdown = (ImageButton) messageLayout.findViewById(R.id.btn_slowdown);
		RelativeLayout_fast_recharge = (RelativeLayout) messageLayout.findViewById(R.id.RelativeLayout_fast_recharge);
		RelativeLayout_bet_record = (RelativeLayout) messageLayout.findViewById(R.id.RelativeLayout_bet_record);
		RelativeLayout_my_messages = (RelativeLayout) messageLayout.findViewById(R.id.RelativeLayout_my_messages);
		RelativeLayout_fast_withdraw = (RelativeLayout) messageLayout.findViewById(R.id.RelativeLayout_fast_withdraw);
		textview_account_balance = (TextView) messageLayout.findViewById(R.id.textview_account_balance);
		textview_yesterdaywin = (TextView) messageLayout.findViewById(R.id.textview_yesterdaywin);
		textview_username = (TextView) messageLayout.findViewById(R.id.textview_username);
		text_dipin = (TextView) messageLayout.findViewById(R.id.text_dipin);
		text_shiyi5 = (TextView) messageLayout.findViewById(R.id.text_shiyi5);
		btn_ticket_type1 = (ImageButton) messageLayout.findViewById(R.id.btn_ticket_type1);
		btn_ticket_type2 = (ImageButton) messageLayout.findViewById(R.id.btn_ticket_type2);
		btn_ticket_type3 = (ImageButton) messageLayout.findViewById(R.id.btn_ticket_type3);
		btn_ticket_type4 = (ImageButton) messageLayout.findViewById(R.id.btn_ticket_type4);
		btn_ticket_type5 = (ImageButton) messageLayout.findViewById(R.id.btn_ticket_type5);
		btn_ticket_type6 = (ImageButton) messageLayout.findViewById(R.id.btn_ticket_type6);
		text_ticketcustom = (TextView) messageLayout.findViewById(R.id.text_ticketcustom);
		userinfo = getActivity().getSharedPreferences("userinfo", Context.MODE_PRIVATE);
		pre = getActivity().getSharedPreferences("custominfo", Context.MODE_PRIVATE);
		preticket = getActivity().getSharedPreferences("fastticket", Context.MODE_PRIVATE);
		relative_move = (RelativeLayout) messageLayout.findViewById(R.id.relative_move);
		// lin_pic = (LinearLayout) messageLayout.findViewById(R.id.lin_pic);
		lin_new = (LinearLayout) messageLayout.findViewById(R.id.lin_new);
		lin_goticketnumberchoose = (LinearLayout) messageLayout.findViewById(R.id.lin_goticketnumberchoose);
		text_new_fifth = (TextView) messageLayout.findViewById(R.id.text_new_fifth);

		text_new_fouth = (TextView) messageLayout.findViewById(R.id.text_new_fouth);

		text_new_third = (TextView) messageLayout.findViewById(R.id.text_new_third);

		text_new_second = (TextView) messageLayout.findViewById(R.id.text_new_second);

		text_new_first = (TextView) messageLayout.findViewById(R.id.text_new_first);

		text_new_ticketgroup = (TextView) messageLayout.findViewById(R.id.text_new_ticketgroup);

		text_new_tickettype = (TextView) messageLayout.findViewById(R.id.text_new_tickettype);
		cookiesdetail = getActivity().getSharedPreferences("cookies", Context.MODE_PRIVATE);
		xinjiang = getActivity().getSharedPreferences("xinjiang", Context.MODE_PRIVATE);
		readsymbel();
		readfastticket();
		shownewticket();
		getnew();
		// (new Thread() {
		//
		// @Override
		//
		// public void run() {

		// Message msg = new Message();
		// // 便我们做出不同的处理操作
		// msg.what = 1;
		//
		// // 我们可以通过arg1和arg2给Message传入简单的数据
		// msg.arg1 = 123;
		// msg.arg2 = 321;
		// // 我们也可以通过给obj赋值Object类型传递向Message传入任意数据
		// // msg.obj = null;
		// // 我们还可以通过setData方法和getData方法向Message中写入和读取Bundle类型的数据
		// // msg.setData(null);
		// // Bundle data = msg.getData();
		//
		// // 将该Message发送给对应的Handler
		// // uiHandler.sendMessage(msg);
		// }
		//
		// }).start();
		if (writesymbel == 0 || writesymbel == 1) {
			write(distinguish1, distinguish2, container_distinguish1, container_distinguish2, container_distinguish3,
					container_distinguish4);
		}
		read();
		ticket_screen(distinguish1, distinguish2, distinguish3, distinguish4, distinguish5, distinguish6);

		// btn1 = (Button) messageLayout.findViewById(R.id.btn1);
		// btn2 = (Button) messageLayout.findViewById(R.id.btn2);
		mMainActivity = (BaseActivity) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		height = getActivity().getWindow().getWindowManager().getDefaultDisplay().getHeight();
		Log.d("height", "height" + height);
		wight = getActivity().getWindow().getWindowManager().getDefaultDisplay().getWidth();
		Log.d("height", "height" + height);
		relative_move_height = (float) (height / 3.0);

		Log.d("relative_move_height", "relative_move_height" + relative_move_height);
		RelativeLayout.LayoutParams layoutParams1 = (android.widget.RelativeLayout.LayoutParams) relative_move
				.getLayoutParams();
		LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) lin_new.getLayoutParams();
		layoutParams2.height = (int) (wight / 2.2);
		layoutParams1.height = (int) relative_move_height;
		layoutParams1.topMargin = (int) -relative_move_height;
		btn_ticket_type1.setOnTouchListener(this);
		btn_ticket_type2.setOnTouchListener(this);
		btn_ticket_type3.setOnTouchListener(this);
		btn_ticket_type4.setOnTouchListener(this);
		btn_ticket_type5.setOnTouchListener(this);
		btn_ticket_type6.setOnTouchListener(this);

		LinearLayout_tran.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				packup();
				LinearLayout_tran.setVisibility(View.GONE);
			}
		});
		lin_goticketnumberchoose.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				readfastticket();
				Intent intent = new Intent(getActivity(), BaseActivityticket.class);
				switch (tickettypesc) {
				case "tj":

					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);

					break;
				case "xj":
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);

					break;
				case "jx":
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);

					break;
				case "cq":
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);

					break;

				default:
					break;
				}
				startActivity(intent);
			}
		});
		RelativeLayout_fast_recharge.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				Intent intent = new Intent(getActivity(), chongzhi.class);

				startActivity(intent);
			}
		});
		RelativeLayout_fast_withdraw.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				Intent intent = new Intent(getActivity(), tixian.class);

				startActivity(intent);
			}
		});
		RelativeLayout_my_messages.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				Intent intent = new Intent(getActivity(), message.class);

				startActivity(intent);
			}
		});
		RelativeLayout_bet_record.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.setTabSelection(getString(R.string.word_mine));

				// Intent intent = new Intent(getActivity(), test.class);
				// startActivity(intent);
			}
		});
		btn_pickup.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				packup();
				LinearLayout_tran.setVisibility(View.GONE);
			}
		});
		btn_slowdown.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				slowdown();
				getinfo();
				LinearLayout_tran.setVisibility(View.VISIBLE);
			}
		});
		text_ticketcustom.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
				// b.putString("ordertype", "baojie");
				intent.putExtra("distinguish1", distinguish1);
				intent.putExtra("distinguish2", distinguish2);
				intent.putExtra("distinguish3", distinguish3);
				intent.putExtra("distinguish4", distinguish4);
				intent.putExtra("distinguish5", distinguish5);
				intent.putExtra("distinguish6", distinguish6);
				startActivityForResult(intent, 0);
			}
		});
		btn_ticket_type1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				if (distinguish1 == 0) {
					Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("distinguish1", distinguish1);
					intent.putExtra("distinguish2", distinguish2);
					intent.putExtra("distinguish3", distinguish3);
					intent.putExtra("distinguish4", distinguish4);
					intent.putExtra("distinguish5", distinguish5);
					intent.putExtra("distinguish6", distinguish6);
					startActivity(intent);
				} else if (distinguish1 == 1) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
				} else if (distinguish1 == 2) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);
					startActivity(intent);
				} else if (distinguish1 == 3) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);
					startActivity(intent);
				} else if (distinguish1 == 4) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);
					startActivity(intent);
				} else if (distinguish1 == 5) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 5);
					startActivity(intent);
				} else if (distinguish1 == 6) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 6);
					startActivity(intent);
				}

			}
		});
		btn_ticket_type2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				if (distinguish2 == 0) {
					Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("distinguish1", distinguish1);
					intent.putExtra("distinguish2", distinguish2);
					intent.putExtra("distinguish3", distinguish3);
					intent.putExtra("distinguish4", distinguish4);
					intent.putExtra("distinguish5", distinguish5);
					intent.putExtra("distinguish6", distinguish6);
					startActivity(intent);
				} else if (distinguish2 == 1) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
				} else if (distinguish2 == 2) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);
					startActivity(intent);
				} else if (distinguish2 == 3) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);
					startActivity(intent);
				} else if (distinguish2 == 4) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);
					startActivity(intent);
				} else if (distinguish2 == 5) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 5);
					startActivity(intent);
				} else if (distinguish2 == 6) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 6);
					startActivity(intent);
				}

			}
		});
		btn_ticket_type3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				if (distinguish3 == 0) {
					Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("distinguish1", distinguish1);
					intent.putExtra("distinguish2", distinguish2);
					intent.putExtra("distinguish3", distinguish3);
					intent.putExtra("distinguish4", distinguish4);
					intent.putExtra("distinguish5", distinguish5);
					intent.putExtra("distinguish6", distinguish6);
					startActivity(intent);
				} else if (distinguish3 == 1) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
				} else if (distinguish3 == 2) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);
					startActivity(intent);
				} else if (distinguish3 == 3) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);
					startActivity(intent);
				} else if (distinguish3 == 4) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);
					startActivity(intent);
				} else if (distinguish3 == 5) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 5);
					startActivity(intent);
				} else if (distinguish3 == 6) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 6);
					startActivity(intent);
				}

			}
		});
		btn_ticket_type4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				if (distinguish4 == 0) {
					Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("distinguish1", distinguish1);
					intent.putExtra("distinguish2", distinguish2);
					intent.putExtra("distinguish3", distinguish3);
					intent.putExtra("distinguish4", distinguish4);
					intent.putExtra("distinguish5", distinguish5);
					intent.putExtra("distinguish6", distinguish6);
					startActivity(intent);
				} else if (distinguish4 == 1) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
				} else if (distinguish4 == 2) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);
					startActivity(intent);
				} else if (distinguish4 == 3) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);
					startActivity(intent);
				} else if (distinguish4 == 4) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);
					startActivity(intent);
				} else if (distinguish4 == 5) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 5);
					startActivity(intent);
				} else if (distinguish4 == 6) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 6);
					startActivity(intent);
				}

			}
		});
		btn_ticket_type5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				if (distinguish5 == 0) {
					Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("distinguish1", distinguish1);
					intent.putExtra("distinguish2", distinguish2);
					intent.putExtra("distinguish3", distinguish3);
					intent.putExtra("distinguish4", distinguish4);
					intent.putExtra("distinguish5", distinguish5);
					intent.putExtra("distinguish6", distinguish6);
					startActivity(intent);
				} else if (distinguish5 == 1) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
				} else if (distinguish5 == 2) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);
					startActivity(intent);
				} else if (distinguish5 == 3) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);
					startActivity(intent);
				} else if (distinguish5 == 4) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);
					startActivity(intent);
				} else if (distinguish5 == 5) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 5);
					startActivity(intent);
				} else if (distinguish5 == 6) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 6);
					startActivity(intent);
				}

			}
		});
		btn_ticket_type6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				mMainActivity.showloading();
				if (distinguish6 == 0) {
					Intent intent = new Intent(getActivity(), TickettypecustomActivity.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("distinguish1", distinguish1);
					intent.putExtra("distinguish2", distinguish2);
					intent.putExtra("distinguish3", distinguish3);
					intent.putExtra("distinguish4", distinguish4);
					intent.putExtra("distinguish5", distinguish5);
					intent.putExtra("distinguish6", distinguish6);
					startActivity(intent);
				} else if (distinguish6 == 1) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
				} else if (distinguish6 == 2) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 2);
					startActivity(intent);
				} else if (distinguish6 == 3) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 3);
					startActivity(intent);
				} else if (distinguish6 == 4) {
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 4);
					startActivity(intent);
				} else if (distinguish6 == 5) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 5);
					startActivity(intent);
				} else if (distinguish6 == 6) {
					Intent intent = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 6);
					startActivity(intent);
				}

			}
		});
		// btn2.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// mMainActivity.setTabSelection(getString(R.string.word_hall));
		// }
		// });

		return messageLayout;
	}

	public void shownewticket() {
		// TODO Auto-generated method stub
		readfastticket();
		switch (tickettypesc) {
		case "tj":
			String a[] = lastnumbertj.split(",");
			text_new_first.setText(a[0]);
			text_new_second.setText(a[1]);
			text_new_third.setText(a[2]);
			text_new_fouth.setText(a[3]);
			text_new_fifth.setText(a[4]);
			text_new_ticketgroup.setText("第" + lastnotj + "期");
			text_new_tickettype.setText(gametj + "时时彩    ");
			break;
		case "xj":
			String b[] = lastnumberxj.split(",");
			text_new_first.setText(b[0]);
			text_new_second.setText(b[1]);
			text_new_third.setText(b[2]);
			text_new_fouth.setText(b[3]);
			text_new_fifth.setText(b[4]);
			text_new_ticketgroup.setText("第" + lastnoxj + "期");
			text_new_tickettype.setText(gamexj + "时时彩    ");
			break;
		case "jx":
			String c[] = lastnumberjx.split(",");
			text_new_first.setText(c[0]);
			text_new_second.setText(c[1]);
			text_new_third.setText(c[2]);
			text_new_fouth.setText(c[3]);
			text_new_fifth.setText(c[4]);
			text_new_ticketgroup.setText("第" + lastnojx + "期");
			text_new_tickettype.setText(gamejx + "时时彩    ");
			break;
		case "cq":
			String d[] = lastnumbercq.split(",");
			text_new_first.setText(d[0]);
			text_new_second.setText(d[1]);
			text_new_third.setText(d[2]);
			text_new_fouth.setText(d[3]);
			text_new_fifth.setText(d[4]);
			text_new_ticketgroup.setText("第" + lastnocq + "期");
			text_new_tickettype.setText(gamecq + "时时彩    ");
			break;

		default:
			break;
		}
	}

	private void readfastticket() {
		// TODO Auto-generated method stub
		tickettypesc = "cq";
		Log.d("tickettypesc", "tickettypesc" + tickettypesc);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	private void packup() {
		ValueAnimator animator = ValueAnimator.ofFloat(relative_move_height, -relative_move_height);
		animator.setTarget(relative_move);
		animator.setDuration(500).start();
		animator.addUpdateListener(new AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				relative_move.setTranslationY((Float) animation.getAnimatedValue());
			}
		});
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	private void slowdown() {
		ValueAnimator animator = ValueAnimator.ofFloat(0, relative_move_height);
		animator.setTarget(relative_move);
		animator.setDuration(500).start();
		animator.addUpdateListener(new AnimatorUpdateListener() {
			@TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				relative_move.setTranslationY((Float) animation.getAnimatedValue());
			}
		});
	}

	private void readsymbel() {
		// TODO Auto-generated method stub
		writesymbel = pre.getInt("writesymbel", 0);
		Log.d("writesymbel", "writesymbel" + writesymbel);
	}

	private void read() {
		// TODO Auto-generated method stub
		writesymbel = pre.getInt("writesymbel", 0);
		distinguish1 = pre.getInt("distinguish1", 0);
		distinguish2 = pre.getInt("distinguish2", 0);
		distinguish3 = pre.getInt("distinguish3", 0);
		distinguish4 = pre.getInt("distinguish4", 0);
		distinguish5 = pre.getInt("distinguish5", 0);
		distinguish6 = pre.getInt("distinguish6", 0);
	}

	private void write(int distinguish12, int distinguish22, int container_distinguish12, int container_distinguish22,
			int container_distinguish32, int container_distinguish42) {
		// TODO Auto-generated method stub
		Editor edit = pre.edit();
		edit.putInt("distinguish1", distinguish12);
		edit.putInt("distinguish2", distinguish22);
		edit.putInt("container_distinguish1", container_distinguish12);
		edit.putInt("container_distinguish2", container_distinguish22);
		edit.putInt("container_distinguish3", container_distinguish32);
		edit.putInt("container_distinguish4", container_distinguish42);
		edit.putInt("writesymbel", 2);
		edit.commit();
	}

	private void ticket_screen(int distinguish12, int distinguish22, int distinguish32, int distinguish42,
			int distinguish52, int distinguish62) {
		// TODO Auto-generated method stub
		switch (distinguish12) {
		case 0:
			btn_ticket_type1.setImageResource(R.drawable.image_no);
			break;
		case 1:
			btn_ticket_type1.setImageResource(R.drawable.image_tj);
			break;
		case 2:
			btn_ticket_type1.setImageResource(R.drawable.image_xj);
			break;
		case 3:
			btn_ticket_type1.setImageResource(R.drawable.image_jx);
			break;
		case 4:
			btn_ticket_type1.setImageResource(R.drawable.image_cq);
			break;
		case 5:
			btn_ticket_type1.setImageResource(R.drawable.main_3d);
			break;
		case 6:
			btn_ticket_type1.setImageResource(R.drawable.main_pailie3);
			break;

		default:
			break;
		}
		switch (distinguish22) {
		case 0:
			btn_ticket_type2.setImageResource(R.drawable.image_no);
			break;
		case 1:
			btn_ticket_type2.setImageResource(R.drawable.image_tj);
			break;
		case 2:
			btn_ticket_type2.setImageResource(R.drawable.image_xj);
			break;
		case 3:
			btn_ticket_type2.setImageResource(R.drawable.image_jx);
			break;
		case 4:
			btn_ticket_type2.setImageResource(R.drawable.image_cq);
			break;
		case 5:
			btn_ticket_type2.setImageResource(R.drawable.main_3d);
			break;
		case 6:
			btn_ticket_type2.setImageResource(R.drawable.main_pailie3);
			break;
		default:
			break;
		}
		switch (distinguish32) {
		case 0:
			btn_ticket_type3.setImageResource(R.drawable.image_no);
			break;
		case 1:
			btn_ticket_type3.setImageResource(R.drawable.image_tj);
			break;
		case 2:
			btn_ticket_type3.setImageResource(R.drawable.image_xj);
			break;
		case 3:
			btn_ticket_type3.setImageResource(R.drawable.image_jx);
			break;
		case 4:
			btn_ticket_type3.setImageResource(R.drawable.image_cq);
			break;
		case 5:
			btn_ticket_type3.setImageResource(R.drawable.main_3d);
			break;
		case 6:
			btn_ticket_type3.setImageResource(R.drawable.main_pailie3);
			break;
		default:
			break;
		}
		switch (distinguish42) {
		case 0:
			btn_ticket_type4.setImageResource(R.drawable.image_no);
			break;
		case 1:
			btn_ticket_type4.setImageResource(R.drawable.image_tj);
			break;
		case 2:
			btn_ticket_type4.setImageResource(R.drawable.image_xj);
			break;
		case 3:
			btn_ticket_type4.setImageResource(R.drawable.image_jx);
			break;
		case 4:
			btn_ticket_type4.setImageResource(R.drawable.image_cq);
			break;
		case 5:
			btn_ticket_type4.setImageResource(R.drawable.main_3d);
			break;
		case 6:
			btn_ticket_type4.setImageResource(R.drawable.main_pailie3);
			break;
		default:
			break;
		}
		switch (distinguish52) {
		case 0:
			btn_ticket_type5.setImageResource(R.drawable.image_no);
			break;
		case 1:
			btn_ticket_type5.setImageResource(R.drawable.image_tj);
			break;
		case 2:
			btn_ticket_type5.setImageResource(R.drawable.image_xj);
			break;
		case 3:
			btn_ticket_type5.setImageResource(R.drawable.image_jx);
			break;
		case 4:
			btn_ticket_type5.setImageResource(R.drawable.image_cq);
			break;
		case 5:
			btn_ticket_type5.setImageResource(R.drawable.main_3d);
			break;
		case 6:
			btn_ticket_type5.setImageResource(R.drawable.main_pailie3);
			break;
		default:
			break;
		}
		switch (distinguish62) {
		case 0:
			btn_ticket_type6.setImageResource(R.drawable.image_no);
			break;
		case 1:
			btn_ticket_type6.setImageResource(R.drawable.image_tj);
			break;
		case 2:
			btn_ticket_type6.setImageResource(R.drawable.image_xj);
			break;
		case 3:
			btn_ticket_type6.setImageResource(R.drawable.image_jx);
			break;
		case 4:
			btn_ticket_type6.setImageResource(R.drawable.image_cq);
			break;
		case 5:
			btn_ticket_type6.setImageResource(R.drawable.main_3d);
			break;
		case 6:
			btn_ticket_type6.setImageResource(R.drawable.main_pailie3);
			break;
		default:
			break;
		}

	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.e(TAG, "onAttach-----");

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(TAG, "onCreate------");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.e(TAG, "onActivityCreated-------");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		read();
		shownewticket();
		getnew();
		ticket_screen(distinguish1, distinguish2, distinguish3, distinguish4, distinguish5, distinguish6);
		if (chongqing.getInt("chongqing", 0) == 10) {

			Editor edit = chongqing.edit();
			edit.putInt("chongqing", 0);
			edit.commit();
			mMainActivity.showloading();
			Intent intent = new Intent(getActivity(), BaseActivityticket.class);
			// b.putString("ordertype", "baojie");
			intent.putExtra("tickettypecode", 4);
			startActivity(intent);
		}

		Log.e(TAG, "onStart----->");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		shownewticket();
		Log.e(TAG, "onresume---->");
		BaseActivity.curFragmentTag = getString(R.string.word_recommend);
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG, "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG, "onStop");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.e(TAG, "ondestoryView");
	}

	@Override
	public void onDestroy() {

		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG, "ondestory");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.d(TAG, "onDetach------");

	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_ticket_type1:

			Log.d("hgcjhcj", "jjjjjj");
			int action = event.getAction();// 事件类型
			// if (recommendtouch == 0) {
			if (action == MotionEvent.ACTION_DOWN) {// 按下
				// Log.d("hgcjhcj", "jjjjjj");
				btn_ticket_type1.setBackgroundColor(0xffEDEDED);
			} else if (action == MotionEvent.ACTION_UP) {// 松开
				btn_ticket_type1.setBackgroundColor(0xffffffff);
			}

			break;
		case R.id.btn_ticket_type2:

			Log.d("hgcjhcj", "jjjjjj");
			int action2 = event.getAction();// 事件类型
			// if (recommendtouch == 0) {
			if (action2 == MotionEvent.ACTION_DOWN) {// 按下
				// Log.d("hgcjhcj", "jjjjjj");
				btn_ticket_type2.setBackgroundColor(0xffEDEDED);
			} else if (action2 == MotionEvent.ACTION_UP) {// 松开
				btn_ticket_type2.setBackgroundColor(0xffffffff);

			}
			break;
		case R.id.btn_ticket_type3:

			Log.d("hgcjhcj", "jjjjjj");
			int action3 = event.getAction();// 事件类型
			// if (recommendtouch == 0) {
			if (action3 == MotionEvent.ACTION_DOWN) {// 按下
				// Log.d("hgcjhcj", "jjjjjj");
				btn_ticket_type3.setBackgroundColor(0xffEDEDED);
			} else if (action3 == MotionEvent.ACTION_UP) {// 松开
				btn_ticket_type3.setBackgroundColor(0xffffffff);
			}

			break;
		case R.id.btn_ticket_type4:
			Log.d("hgcjhcj", "jjjjjj");
			int action4 = event.getAction();// 事件类型
			// if (recommendtouch == 0) {
			if (action4 == MotionEvent.ACTION_DOWN) {// 按下
				// Log.d("hgcjhcj", "jjjjjj");
				btn_ticket_type4.setBackgroundColor(0xffEDEDED);
			} else if (action4 == MotionEvent.ACTION_UP) {// 松开
				btn_ticket_type4.setBackgroundColor(0xffffffff);
			}
			break;
		case R.id.btn_ticket_type5:
			Log.d("hgcjhcj", "jjjjjj");
			int action5 = event.getAction();// 事件类型
			// if (recommendtouch == 0) {
			if (action5 == MotionEvent.ACTION_DOWN) {// 按下
				// Log.d("hgcjhcj", "jjjjjj");
				btn_ticket_type5.setBackgroundColor(0xffEDEDED);
			} else if (action5 == MotionEvent.ACTION_UP) {// 松开
				btn_ticket_type5.setBackgroundColor(0xffffffff);
			}
			break;
		case R.id.btn_ticket_type6:
			Log.d("hgcjhcj", "jjjjjj");
			int action6 = event.getAction();// 事件类型
			// if (recommendtouch == 0) {
			if (action6 == MotionEvent.ACTION_DOWN) {// 按下
				// Log.d("hgcjhcj", "jjjjjj");
				btn_ticket_type6.setBackgroundColor(0xffEDEDED);
			} else if (action6 == MotionEvent.ACTION_UP) {// 松开
				btn_ticket_type6.setBackgroundColor(0xffffffff);
			}
			break;
		default:
			break;
		}
		return false;
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
				HttpPost httpPost = new HttpPost(URLContainer.getPlayHistoryInCloud());
				Log.d("xxxxx", "11");
				httpPost.setHeader("Cookie", cookies);//
				Log.d("xxxxx", "111");
				HttpResponse httpResponse;
				try {
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
						for (int i = 0; i < 4; i++) {
							json_data = jArray.getJSONObject(i);
							game[i] = json_data.getString("game");
							no[i] = json_data.getString("no");
							value[i] = json_data.getString("value");
						}
						Log.e("game", game[0]);
						Log.e("game", game[1]);
						Log.e("game", game[2]);
						Log.e("game", game[3]);
						Log.e("no", no[0]);
						Log.e("no", no[1]);
						Log.e("no", no[2]);
						Log.e("no", no[3]);
						Log.e("value", value[0]);
						Log.e("value", value[1]);
						Log.e("value", value[2]);
						Log.e("value", value[3]);
						lastnumbercq = value[0];
						lastnumberjx = value[1];
						lastnumbertj = value[2];
						lastnumberxj = value[3];
						gamecq = game[0];
						gamejx = game[1];
						gametj = game[2];
						gamexj = game[3];
						lastnocq = no[0];
						lastnojx = no[1];
						lastnotj = no[2];
						lastnoxj = no[3];
						Editor edit = xinjiang.edit();// 把 cookies 存到本地
						edit.putString("xinjiang", lastnoxj);
						edit.commit();
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

	public void getinfo() {
		username = userinfo.getString("username", "username");
		rmb = userinfo.getString("rmb", "00000");
		sscrmb = userinfo.getString("sscrmb", "00000");
		shiyi5rmb = userinfo.getString("Shiyi5Rmb", "00000");
		dipinrmb = userinfo.getString("DipinRmb", "00000");
		textview_username.setText(username);
		textview_yesterdaywin.setText(rmb);
		textview_account_balance.setText(sscrmb);
		text_dipin.setText(dipinrmb);
		text_shiyi5.setText(shiyi5rmb);
	}
}
