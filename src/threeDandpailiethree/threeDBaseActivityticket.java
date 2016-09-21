package threeDandpailiethree;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import dialog.dialogone;
import dialog.dialogtwo;
import model.chongqingticketplan;
import other.loginpassword;
import ticketpackage.numberbasket;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
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

import com.example.entertiment.util.Util;
import com.example.lottery.R;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;

/**
 * 椤圭洰鐨勪富Activity锛屾墍鏈夌殑Fragment閮藉祵鍏ュ湪杩欓噷銆? vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
 * 
 * @author
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public class threeDBaseActivityticket extends FragmentActivity implements OnClickListener, OnTouchListener {
	private String yue = "0.0";
	private LinearLayout LinearLayout_numberbasket;
	private int number = 0;
	static Activity activity;
	private TextView TextView_show_number;
	private int numberposition = 0;
	private RelativeLayout RelativeLayout_addbasket;
	private ImageButton imagebtn_addbasket;
	private TextView text_chooseend;
	private TextView text_chooseresult;
	private LinearLayout LinearLayout_nochoose;
	private LinearLayout LinearLayout_ischoose;
	private int ticketint = 0;
	private SharedPreferences preticketintdipin;
	private SharedPreferences nowdata;
	private three_direct_double three_direct_double;
	private three_direct_single three_direct_single;
	private three_direct_sum three_direct_sum;
	private three_group_three three_group_three;
	private three_group_six three_group_six;
	private three_group_sum three_group_sum;
	private three_group_combination three_group_combination;
	private three_group_three_single three_group_three_single;
	private three_group_six_single three_group_six_single;
	private top_two_direct_double top_two_direct_double;
	private top_two_direct_single top_two_direct_single;
	private top_two_group_double top_two_group_double;
	private top_two_group_single top_two_group_single;
	private bottom_two_direct_double bottom_two_direct_double;
	private bottom_two_direct_single bottom_two_direct_single;
	private bottom_two_group_double bottom_two_group_double;
	private bottom_two_group_single bottom_two_group_single;
	private fixedposition fixedposition;
	private onenumber_notposition onenumber_notposition;
	private twonumber_notposition twonumber_notposition;
	private maxmin_bottom maxmin_bottom;
	private maxmin_toptwo maxmin_toptwo;

	private String three_direct_double_str = "三星直选复式";
	private String three_direct_single_str = "三星直选单式";
	private String three_direct_sum_str = "三星直选和值";
	private String three_group_three_str = "三星组三";
	private String three_group_six_str = "三星组六";
	private String three_group_sum_str = "三星组选和值";
	private String three_group_combination_str = "三星混合组选";
	private String three_group_three_single_str = "三星组三单式";
	private String three_group_six_single_str = "三星组六单式";
	private String top_two_direct_double_str = "前二直选复式";
	private String top_two_direct_single_str = "前二直选单式";
	private String top_two_group_double_str = "前二组选复式";
	private String top_two_group_single_str = "前二组选单式";
	private String bottom_two_direct_double_str = "后二直选复式";
	private String bottom_two_direct_single_str = "后二直选单式";
	private String bottom_two_group_double_str = "后二组选复式";
	private String bottom_two_group_single_str = "后二组选单式";
	private String fixedposition_str = "定位胆";
	private String onenumber_notposition_str = "一码不定位";
	private String twonumber_notposition_str = "二码不定位";
	private String maxmin_bottom_str = "后二大小单双";
	private String maxmin_toptwo_str = "前二大小单双";

	private static final String TAG = "MainActivity";
	private SharedPreferences pre3d;
	private SharedPreferences prepailie;
	// private SharedPreferences preticket;
	private int symbel_int = 1;
	private FragmentManager fragmentManager;
	private FragmentTransaction mFragmentTransaction;
	private int tickettypecode = 5;
	public static String curFragmentTag;
	private SharedPreferences userinfo;
	private int wight;
	private LinearLayout LinearLayout_ticket_rule;
	private LinearLayout play_menu;
	private LinearLayout play_menu_arrow;
	private LinearLayout tran_sur;
	private ImageButton play_menu_arrow1;
	private TextView three_direct_double_text;
	private TextView three_direct_single_text;
	private TextView three_direct_sum_text;
	private TextView three_group_three_text;
	private TextView three_group_six_text;
	private TextView three_group_sum_text;
	private TextView three_group_combination_text;
	private TextView three_group_three_single_text;
	private TextView three_group_six_single_text;
	private TextView top_two_direct_double_text;
	private TextView top_two_direct_single_text;
	private TextView top_two_group_double_text;
	private TextView top_two_group_single_text;
	private TextView bottom_two_direct_double_text;
	private TextView bottom_two_direct_single_text;
	private TextView bottom_two_group_double_text;
	private TextView bottom_two_group_single_text;
	private TextView fixedposition_text;
	private TextView onenumber_notposition_text;
	private TextView twonumber_notposition_text;
	private TextView maxmin_bottom_text;
	private TextView maxmin_toptwo_text;
	private SharedPreferences cookiesdetail;
	private String cookies;
	private TextView base_tickettype;
	private String numberresult;
	private String threed_tickettype = "福彩3D", pailie3 = "排列三";
	private LinearLayout base_back;
	private Button btn_menu1, btn_menu2, btn_menu3, btn_menu4, btn_menu5;
	private Integer btn_menu1_int = 0, btn_menu2_int = 0, btn_menu3_int = 0, btn_menu4_int = 0, btn_menu5_int = 0;
	private String[] ticketnumber = new String[100];
	private String[] tickettype = new String[100];
	private int[] numberofticket = new int[100];
	private String[] gameid = { "069A4F0E-1032-4198-BB6B-586549485AF6", "598E270B-0CF9-4964-9E1C-0C0D287BE13C",
			"5819B172-F0A9-49AB-BBE7-52BD8FA56C01", "966B02D4-46A9-47FA-BDF4-35E5131B8132",
			"704AD747-CD54-422A-8292-502209B5A11E", "C7C0976B-A77B-4517-9777-58080AC76348" };
	private LinearLayout lin_loading;
	private String[] ticketname = { "", three_direct_double_str, three_direct_single_str, three_direct_sum_str,
			three_group_three_str, three_group_six_str, three_group_sum_str, three_group_combination_str,
			three_group_three_single_str, three_group_six_single_str, top_two_direct_double_str,
			top_two_direct_single_str, top_two_group_double_str, top_two_group_single_str, bottom_two_direct_double_str,
			bottom_two_direct_single_str, bottom_two_group_double_str, bottom_two_group_single_str, fixedposition_str,
			onenumber_notposition_str, twonumber_notposition_str, maxmin_bottom_str, maxmin_toptwo_str, };
	private SharedPreferences xinjiang;
	Time time;
	Date date;
	private int showint = 0;
	private SharedPreferences chongqing;
	private String noagain = "000";
	private SharedPreferences ticketplan;
	private TextView text_showtime;
	private TextView text_showno;
	private String[] No = { "000", "000", "000", "000", "000", "000" };
	private Double[] Notime = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + msg.arg1);
				System.out.println("msg.arg2:" + msg.arg2);
				go();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 5:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + msg.arg1);
				System.out.println("msg.arg2:" + msg.arg2);
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}
	};
	static int minute = -1;
	static int second = -1;
	final static String tag = "tag";
	// TextView text_showtime;
	Timer timer;
	TimerTask timerTask;
	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			System.out.println("handleminute!");
			// int temptime = minute * 60 + second;
			// int fortime = temptime - (temptime / 10) * 10;
			// if (fortime == 0) {
			// getticketplan();
			// Log.e("getticketplan", "" + fortime);
			// }
			if (minute == 0) {

				if (second == 0) {
					text_showtime.setText("正在刷新...");

					if (timer != null) {
						timer.cancel();
						timer = null;
					}
					if (timerTask != null) {
						timerTask = null;
					}
					if (showint == 0) {
						showAlertDialognonumber("即将进入下一期");
						showint = 1;
						Stastshowtime();
						getticketplan();
					}

				} else {
					second--;
					if (second >= 10) {
						text_showtime.setText("0" + minute + ":" + second);
					} else {
						text_showtime.setText("0" + minute + ":0" + second);
					}
				}
			} else {
				if (second == 0) {
					second = 59;
					minute--;
					if (minute >= 10) {
						text_showtime.setText(minute + ":" + second);
					} else {
						text_showtime.setText("0" + minute + ":" + second);
					}
				} else {
					second--;
					if (second >= 10) {
						if (minute >= 10) {
							text_showtime.setText(minute + ":" + second);
						} else {
							text_showtime.setText("0" + minute + ":" + second);
						}
					} else {
						if (minute >= 10) {
							text_showtime.setText(minute + ":0" + second);
						} else {
							text_showtime.setText("0" + minute + ":0" + second);
						}
					}
				}
			}
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.threed_baseactivity);
		xinjiang = getSharedPreferences("xinjiang", MODE_PRIVATE);
		pre3d = getSharedPreferences("dmenuinfo", MODE_PRIVATE);
		prepailie = getSharedPreferences("pailiemenuinfo", MODE_PRIVATE);
		// preticket = getSharedPreferences("fastticket", MODE_PRIVATE);
		ticketplan = getSharedPreferences("ticketplan", MODE_PRIVATE);
		preticketintdipin = getSharedPreferences("dipinticketinfo", MODE_PRIVATE);
		userinfo = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
		yue = userinfo.getString("sscrmb", "0.0");
		nowdata = getSharedPreferences("nowdata", Context.MODE_PRIVATE);
		initViews();
		Animation anim = AnimationUtils.loadAnimation(this, R.animator.round_loading);
		activity = this;
		findViewById(R.id.loadingBtn).startAnimation(anim);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		btn_menu1.setBackgroundResource(R.drawable.my_account_menu_pressed);
		;
		if (tickettypecode == 5) {
			read3d();
			// writefast3d();
			base_tickettype.setText(threed_tickettype);
		} else if (tickettypecode == 6) {
			readpailie();
			// writefastpailie();
			base_tickettype.setText(pailie3);
		}
		Log.d("dfsdf", "" + "here");
		showfivetype();
		getticketplan();
		Log.d("dfsdf", "" + "here1");
		play_menu_arrow1.setImageResource(R.drawable.arrow_down);
		Log.d("dfsdf", "" + "here2");
		wight = getWindow().getWindowManager().getDefaultDisplay().getHeight();
		wight = wight / 3;
		Log.d("dfsdf", "" + "here3");
		RelativeLayout.LayoutParams layoutParams1 = (android.widget.RelativeLayout.LayoutParams) play_menu
				.getLayoutParams();
		layoutParams1.height = wight;
		layoutParams1.topMargin = -wight;
		fragmentManager = getSupportFragmentManager();
		inifragment();

		// if (btn_menu1_int == 1) {
		//
		// } else {
		// changesetTabSelection(btn_menu1_int);
		// }
		// LinearLayout_rocknumber.setOnClickListener(new OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// // Bundle b = new Bundle();
		// Fivedirectdouble.rocknumber();
		// }
		//
		// });
		base_back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (numberposition != 0) {
					showAlertDialog();
				} else {
					finish();
				}
			}

		});
		tran_sur.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (symbel_int == 1) {
					Log.d("play_menu", "play_menu");
					tran_sur.setVisibility(View.VISIBLE);
					play_menu_arrow1.setImageResource(R.drawable.arrow_up);
					symbel_int = symbel_int * -1;
					packup();
				} else if (symbel_int == -1) {
					Log.d("play_menu", "play_menu");
					tran_sur.setVisibility(View.GONE);
					play_menu_arrow1.setImageResource(R.drawable.arrow_down);
					slowdown();
					symbel_int = symbel_int * -1;
				}

			}

		});
		play_menu_arrow.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (symbel_int == 1) {
					Log.d("play_menu", "play_menu");
					tran_sur.setVisibility(View.VISIBLE);
					play_menu_arrow1.setImageResource(R.drawable.arrow_up);
					symbel_int = symbel_int * -1;
					packup();
				} else if (symbel_int == -1) {
					Log.d("play_menu", "play_menu");
					tran_sur.setVisibility(View.GONE);
					play_menu_arrow1.setImageResource(R.drawable.arrow_down);
					slowdown();
					symbel_int = symbel_int * -1;
				}

			}

		});
		play_menu_arrow1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				if (symbel_int == 1) {
					Log.d("play_menu", "play_menu");
					tran_sur.setVisibility(View.VISIBLE);
					play_menu_arrow1.setImageResource(R.drawable.arrow_up);
					symbel_int = symbel_int * -1;
					packup();
				} else if (symbel_int == -1) {
					Log.d("play_menu", "play_menu");
					tran_sur.setVisibility(View.GONE);
					play_menu_arrow1.setImageResource(R.drawable.arrow_down);
					slowdown();
					symbel_int = symbel_int * -1;
				}

			}
		});
	}

	private void inifragment() {
		read();
		// TODO Auto-generated method stub
		if (ticketint == 1) {
			write(1);
			changesetTabSelection(1);
		} else if (ticketint == 2) {
			write(2);
			changesetTabSelection(2);
		} else if (ticketint == 3) {
			write(3);
			changesetTabSelection(3);
		} else if (ticketint == 4) {
			write(4);
			changesetTabSelection(4);
		} else if (ticketint == 5) {
			write(5);
			changesetTabSelection(5);
		} else if (ticketint == 6) {
			write(6);
			changesetTabSelection(6);
		} else if (ticketint == 7) {
			write(7);
			changesetTabSelection(7);
		} else if (ticketint == 8) {
			write(8);
			changesetTabSelection(8);
		} else if (ticketint == 9) {
			write(9);
			changesetTabSelection(9);
		} else if (ticketint == 10) {
			write(10);
			changesetTabSelection(10);
		} else if (ticketint == 11) {
			write(11);
			changesetTabSelection(11);
		} else if (ticketint == 12) {
			write(12);
			changesetTabSelection(12);
		} else if (ticketint == 13) {
			write(13);
			changesetTabSelection(13);
		} else if (ticketint == 14) {
			write(14);
			changesetTabSelection(14);
		} else if (ticketint == 15) {
			write(15);
			changesetTabSelection(15);
		} else if (ticketint == 16) {
			write(16);
			changesetTabSelection(16);
		} else if (ticketint == 17) {
			write(17);
			changesetTabSelection(17);
		} else if (ticketint == 18) {
			write(18);
			changesetTabSelection(18);
		} else if (ticketint == 19) {
			write(19);
			changesetTabSelection(19);
		} else if (ticketint == 20) {
			write(20);
			changesetTabSelection(20);
		} else if (ticketint == 21) {
			write(21);
			changesetTabSelection(21);
		} else if (ticketint == 22) {
			write(22);
			changesetTabSelection(22);
		} else if (ticketint == 0) {
			setCurrentFragment();
		}

	}

	private void read() {
		// TODO Auto-generated method stub
		ticketint = preticketintdipin.getInt("ticketint", 0);
		Log.d("ticketint", "ticketint" + "read" + ticketint);
	}

	private void write(int i) {
		// TODO Auto-generated method stub
		Editor edit = preticketintdipin.edit();
		edit.putInt("ticketint", i);
		edit.commit();
	}

	private void read3d() {
		// TODO Auto-generated method stub
		btn_menu1_int = pre3d.getInt("btn_menu1_int", 1);
		btn_menu2_int = pre3d.getInt("btn_menu2_int", 0);
		btn_menu3_int = pre3d.getInt("btn_menu3_int", 0);
		btn_menu4_int = pre3d.getInt("btn_menu4_int", 0);
		btn_menu5_int = pre3d.getInt("btn_menu5_int", 0);
	}

	private void readpailie() {
		// TODO Auto-generated method stub
		btn_menu1_int = prepailie.getInt("btn_menu1_int", 1);
		btn_menu2_int = prepailie.getInt("btn_menu2_int", 0);
		btn_menu3_int = prepailie.getInt("btn_menu3_int", 0);
		btn_menu4_int = prepailie.getInt("btn_menu4_int", 0);
		btn_menu5_int = prepailie.getInt("btn_menu5_int", 0);
	}

	private void changefivetext(int i) {
		// TODO Auto-generated method stub

		if (btn_menu1_int == i) {
			btn_menu1_int = i;
		} else if (btn_menu2_int == i) {
			btn_menu2_int = btn_menu1_int;
			btn_menu1_int = i;
		} else if (btn_menu3_int == i) {
			btn_menu3_int = btn_menu2_int;
			btn_menu2_int = btn_menu1_int;
			btn_menu1_int = i;
		} else if (btn_menu4_int == i) {
			btn_menu4_int = btn_menu3_int;
			btn_menu3_int = btn_menu2_int;
			btn_menu2_int = btn_menu1_int;
			btn_menu1_int = i;
		} else {
			btn_menu5_int = btn_menu4_int;
			btn_menu4_int = btn_menu3_int;
			btn_menu3_int = btn_menu2_int;
			btn_menu2_int = btn_menu1_int;
			btn_menu1_int = i;
		}
		if (tickettypecode == 5) {
			write3d();
		} else if (tickettypecode == 6) {
			writepailie();
		}

	}

	private void write3d() {
		// TODO Auto-generated method stub
		Editor edit = pre3d.edit();
		edit.putInt("btn_menu1_int", btn_menu1_int);
		edit.putInt("btn_menu2_int", btn_menu2_int);
		edit.putInt("btn_menu3_int", btn_menu3_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.commit();
	}

	private void writepailie() {
		// TODO Auto-generated method stub
		Editor edit = prepailie.edit();
		edit.putInt("btn_menu1_int", btn_menu1_int);
		edit.putInt("btn_menu2_int", btn_menu2_int);
		edit.putInt("btn_menu3_int", btn_menu3_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.commit();
	}

	private void showfivetype() {
		// TODO Auto-generated method stub

		btn_menu1.setText(ticketname[btn_menu1_int]);
		btn_menu2.setText(ticketname[btn_menu2_int]);
		btn_menu3.setText(ticketname[btn_menu3_int]);
		btn_menu4.setText(ticketname[btn_menu4_int]);
		btn_menu5.setText(ticketname[btn_menu5_int]);
		if (btn_menu1_int == 0) {
			btn_menu1.setVisibility(View.GONE);
		} else {
			btn_menu1.setVisibility(View.VISIBLE);
		}
		if (btn_menu2_int == 0) {
			btn_menu2.setVisibility(View.GONE);
		} else {
			btn_menu2.setVisibility(View.VISIBLE);
		}
		if (btn_menu3_int == 0) {
			btn_menu3.setVisibility(View.GONE);
		} else {
			btn_menu3.setVisibility(View.VISIBLE);
		}
		if (btn_menu4_int == 0) {
			btn_menu4.setVisibility(View.GONE);
		} else {
			btn_menu4.setVisibility(View.VISIBLE);
		}
		if (btn_menu5_int == 0) {
			btn_menu5.setVisibility(View.GONE);
		} else {
			btn_menu5.setVisibility(View.VISIBLE);
		}
	}

	/**
	 * 鍦ㄨ繖閲岃幏鍙栧埌姣忎釜闇?瑕佺敤鍒扮殑鎺т欢鐨勫疄渚嬶紝骞剁粰瀹冧滑璁剧疆濂藉繀瑕佺殑鐐瑰嚮浜嬩欢銆?
	 */
	@SuppressLint("NewApi")
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void initViews() {

		text_showtime = (TextView) findViewById(R.id.text_showtime);
		text_showno = (TextView) findViewById(R.id.text_showno);
		lin_loading = (LinearLayout) findViewById(R.id.lin_loading);
		chongqing = getSharedPreferences("chongqing", MODE_PRIVATE);
		Intent intent = getIntent();
		tickettypecode = intent.getIntExtra("tickettypecode", 5);

		base_back = (LinearLayout) findViewById(R.id.base_back);
		LinearLayout_ticket_rule = (LinearLayout) findViewById(R.id.LinearLayout_ticket_rule);
		play_menu = (LinearLayout) findViewById(R.id.play_menu);
		play_menu_arrow = (LinearLayout) findViewById(R.id.play_menu_arrow);
		tran_sur = (LinearLayout) findViewById(R.id.tran_sur);
		play_menu_arrow1 = (ImageButton) findViewById(R.id.play_menu_arrow1);
		base_tickettype = (TextView) findViewById(R.id.base_tickettype);
		btn_menu1 = (Button) findViewById(R.id.btn_menu1);
		btn_menu2 = (Button) findViewById(R.id.btn_menu2);
		btn_menu3 = (Button) findViewById(R.id.btn_menu3);
		btn_menu4 = (Button) findViewById(R.id.btn_menu4);
		btn_menu5 = (Button) findViewById(R.id.btn_menu5);
		three_direct_double_text = (TextView) findViewById(R.id.three_direct_double_text);
		three_direct_single_text = (TextView) findViewById(R.id.three_direct_single_text);
		three_direct_sum_text = (TextView) findViewById(R.id.three_direct_sum_text);
		three_group_three_text = (TextView) findViewById(R.id.three_group_three_text);
		three_group_six_text = (TextView) findViewById(R.id.three_group_six_text);
		three_group_sum_text = (TextView) findViewById(R.id.three_group_sum_text);
		three_group_combination_text = (TextView) findViewById(R.id.three_group_combination_text);
		three_group_three_single_text = (TextView) findViewById(R.id.three_group_three_single_text);
		three_group_six_single_text = (TextView) findViewById(R.id.three_group_six_single_text);
		top_two_direct_double_text = (TextView) findViewById(R.id.top_two_direct_double_text);
		top_two_direct_single_text = (TextView) findViewById(R.id.top_two_direct_single_text);
		top_two_group_double_text = (TextView) findViewById(R.id.top_two_group_double_text);
		top_two_group_single_text = (TextView) findViewById(R.id.top_two_group_single_text);
		bottom_two_direct_double_text = (TextView) findViewById(R.id.bottom_two_direct_double_text);
		bottom_two_direct_single_text = (TextView) findViewById(R.id.bottom_two_direct_single_text);
		bottom_two_group_double_text = (TextView) findViewById(R.id.bottom_two_group_double_text);
		bottom_two_group_single_text = (TextView) findViewById(R.id.bottom_two_group_single_text);
		fixedposition_text = (TextView) findViewById(R.id.fixedposition_text);
		onenumber_notposition_text = (TextView) findViewById(R.id.onenumber_notposition_text);
		twonumber_notposition_text = (TextView) findViewById(R.id.twonumber_notposition_text);
		maxmin_bottom_text = (TextView) findViewById(R.id.maxmin_bottom_text);
		maxmin_toptwo_text = (TextView) findViewById(R.id.maxmin_toptwo_text);

		LinearLayout_ticket_rule.setOnClickListener(this);
		btn_menu1.setOnClickListener(this);
		btn_menu2.setOnClickListener(this);
		btn_menu3.setOnClickListener(this);
		btn_menu4.setOnClickListener(this);
		btn_menu5.setOnClickListener(this);
		three_direct_double_text.setOnClickListener(this);
		three_direct_single_text.setOnClickListener(this);
		three_direct_sum_text.setOnClickListener(this);
		three_group_three_text.setOnClickListener(this);
		three_group_six_text.setOnClickListener(this);
		three_group_sum_text.setOnClickListener(this);
		three_group_combination_text.setOnClickListener(this);
		three_group_three_single_text.setOnClickListener(this);
		three_group_six_single_text.setOnClickListener(this);
		top_two_direct_double_text.setOnClickListener(this);
		top_two_direct_single_text.setOnClickListener(this);
		top_two_group_double_text.setOnClickListener(this);
		top_two_group_single_text.setOnClickListener(this);
		bottom_two_direct_double_text.setOnClickListener(this);
		bottom_two_direct_single_text.setOnClickListener(this);
		bottom_two_group_double_text.setOnClickListener(this);
		bottom_two_group_single_text.setOnClickListener(this);
		fixedposition_text.setOnClickListener(this);
		onenumber_notposition_text.setOnClickListener(this);
		twonumber_notposition_text.setOnClickListener(this);
		maxmin_bottom_text.setOnClickListener(this);
		maxmin_toptwo_text.setOnClickListener(this);

		TextView_show_number = (TextView) findViewById(R.id.TextView_show_number);
		RelativeLayout_addbasket = (RelativeLayout) findViewById(R.id.RelativeLayout_addbasket);
		imagebtn_addbasket = (ImageButton) findViewById(R.id.imagebtn_addbasket);
		text_chooseend = (TextView) findViewById(R.id.text_chooseend);
		text_chooseresult = (TextView) findViewById(R.id.text_chooseresult);
		LinearLayout_nochoose = (LinearLayout) findViewById(R.id.LinearLayout_nochoose);
		LinearLayout_ischoose = (LinearLayout) findViewById(R.id.LinearLayout_ischoose);
		LinearLayout_numberbasket = (LinearLayout) findViewById(R.id.LinearLayout_numberbasket);
	}

	public void LinearLayout_ischooseonclick() {
		if (number != 0) {
			getnumber();
			// }
			// Intent intent = new Intent(BaseActivityticket.this,
			// numberbasket.class);
			// Bundle bundle = new Bundle(); // 创建Bundle对象
			// bundle.putInt("numberposition", numberposition);
			// bundle.putInt("tickettypecode", tickettypecode);
			// bundle.putIntArray("numberofticket", numberofticket);
			// bundle.putStringArray("ticketnumber", ticketnumber); // 装入数据
			// bundle.putStringArray("tickettype", tickettype); // 装入数据
			// intent.putExtras(bundle);
			// startActivityForResult(intent, 0);
		} else {
			showAlertDialognonumber("请选择合适的号码");
		}
		showTextView_show_number();
	}

	public void imagebtn_addbasketonclick() {
		// if (numberofticket[0] != 0 || number != 0) {
		// Log.d("vggg", "bjbjb");
		if (number != 0) {
			getnumber();
			// }
			// Intent intent = new Intent(BaseActivityticket.this,
			// numberbasket.class);
			// Bundle bundle = new Bundle(); // 创建Bundle对象
			// bundle.putInt("numberposition", numberposition);
			// bundle.putInt("tickettypecode", tickettypecode);
			// bundle.putIntArray("numberofticket", numberofticket);
			// bundle.putStringArray("ticketnumber", ticketnumber); // 装入数据
			// bundle.putStringArray("tickettype", tickettype); // 装入数据
			// intent.putExtras(bundle);
			// startActivityForResult(intent, 0);
		} else {
			showAlertDialognonumber("请选择合适的号码");
		}
		showTextView_show_number();
	}

	public void LinearLayout_numberbasketonclick() {
		if (numberofticket[0] != 0 || number != 0) {
			Log.d("vggg", "bjbjb");
			if (number != 0) {
				getnumber();
			}
			if (!No[tickettypecode - 1].equals("000")) {
				// if (sscrmb > number * 2) {
				Intent intent = new Intent(threeDBaseActivityticket.this, threednumberbasket.class);
				Bundle bundle = new Bundle(); // 创建Bundle对象
				bundle.putInt("numberposition", numberposition);
				bundle.putInt("tickettypecode", tickettypecode);
				bundle.putString("nowno", noagain);
				bundle.putIntArray("numberofticket", numberofticket);
				bundle.putStringArray("ticketnumber", ticketnumber); // 装入数据
				bundle.putStringArray("tickettype", tickettype); // 装入数据
				intent.putExtras(bundle);
				startActivityForResult(intent, 0);
				// } else {
				// getmoney();
				// }
				Log.e("bundle", numberposition + "");
				Log.e("bundle", tickettypecode + "");
				Log.e("bundle", noagain);
				Log.e("bundle", "" + numberofticket[0]);
				Log.e("bundle", ticketnumber[0]);
				Log.e("bundle", tickettype[0]);
			} else {
				showAlertDialognonumber("未获得当前期数，请稍等");
			}

		} else {
			showAlertDialognonumber("请选择合适的号码");
		}
		showTextView_show_number();
	}

	public void showTextView_show_number() {

		if (numberposition != 0) {
			TextView_show_number.setVisibility(View.VISIBLE);
			if (numberposition < 100) {
				TextView_show_number.setText("" + numberposition);
			} else {
				TextView_show_number.setText("99+");
			}

		} else {
			TextView_show_number.setVisibility(View.INVISIBLE);
		}

	}

	public void getnumber() {
		// TODO Auto-generated method stub

		numberofticket[numberposition] = number;
		ticketnumber[numberposition] = numberresult;
		tickettype[numberposition] = ticketname[btn_menu1_int];
		numberposition++;

	}

	@SuppressLint("NewApi")
	private void packup() {
		ValueAnimator animator = ValueAnimator.ofFloat(0, wight);
		animator.setTarget(play_menu);
		animator.setDuration(200).start();
		animator.addUpdateListener(new AnimatorUpdateListener() {
			@SuppressLint("NewApi")
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				play_menu.setTranslationY((Float) animation.getAnimatedValue());
			}
		});
	}

	private void slowdown() {
		ValueAnimator animator = ValueAnimator.ofFloat(wight, 0);
		animator.setTarget(play_menu);
		animator.setDuration(200).start();
		animator.addUpdateListener(new AnimatorUpdateListener() {
			@TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				play_menu.setTranslationY((Float) animation.getAnimatedValue());
			}
		});
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_menu1:

			number = 0;
			showresult("");
			changefivetext(btn_menu1_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();
			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.btn_menu2:

			number = 0;
			showresult("");
			changefivetext(btn_menu2_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();

			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.btn_menu3:
			number = 0;
			showresult("");
			changefivetext(btn_menu3_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();
			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.btn_menu4:

			number = 0;
			showresult("");
			changefivetext(btn_menu4_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();
			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.btn_menu5:

			number = 0;
			showresult("");
			changefivetext(btn_menu5_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();

			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.LinearLayout_ticket_rule:

			number = 0;
			showresult("");
			Intent intent = new Intent(threeDBaseActivityticket.this, ThreeDTicketruleActivity.class);
			// resultCode---请求码
			Bundle bundle = new Bundle(); // 创建Bundle对象
			bundle.putInt("tickettypecode", tickettypecode); // 装入数据
			intent.putExtras(bundle);
			startActivityForResult(intent, 1);
			break;
		case R.id.three_direct_double_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(1);
			changefivetext(1);
			showfivetype();
			changesetTabSelection(1);
			three_direct_double_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_direct_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(2);
			changefivetext(2);
			showfivetype();
			changesetTabSelection(2);
			three_direct_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_direct_sum_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(3);
			changefivetext(3);
			showfivetype();
			changesetTabSelection(3);
			three_direct_sum_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_group_three_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(4);
			changefivetext(4);
			showfivetype();
			changesetTabSelection(4);
			three_group_three_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_group_six_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(5);
			changefivetext(5);
			showfivetype();
			changesetTabSelection(5);
			three_group_six_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_group_sum_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(6);
			changefivetext(6);
			showfivetype();
			changesetTabSelection(6);
			three_group_sum_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_group_combination_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(7);
			changefivetext(7);
			showfivetype();
			changesetTabSelection(7);
			three_group_combination_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_group_three_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(8);
			changefivetext(8);
			showfivetype();
			changesetTabSelection(8);
			three_group_three_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.three_group_six_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(9);
			changefivetext(9);
			showfivetype();
			changesetTabSelection(9);
			three_group_six_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.top_two_direct_double_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(10);
			changefivetext(10);
			showfivetype();
			changesetTabSelection(10);
			top_two_direct_double_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.top_two_direct_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(11);
			changefivetext(11);
			showfivetype();
			changesetTabSelection(11);
			top_two_direct_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.top_two_group_double_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(12);
			changefivetext(12);
			showfivetype();
			changesetTabSelection(12);
			top_two_group_double_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.top_two_group_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(13);
			changefivetext(13);
			showfivetype();
			changesetTabSelection(13);
			top_two_group_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.bottom_two_direct_double_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(14);
			changefivetext(14);
			showfivetype();
			changesetTabSelection(14);
			bottom_two_direct_double_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.bottom_two_direct_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(15);
			changefivetext(15);
			showfivetype();
			changesetTabSelection(15);
			bottom_two_direct_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.bottom_two_group_double_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(16);
			changefivetext(16);
			showfivetype();
			changesetTabSelection(16);
			bottom_two_group_double_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.bottom_two_group_single_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(17);
			changefivetext(17);
			showfivetype();
			changesetTabSelection(17);
			bottom_two_group_single_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.fixedposition_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(18);
			changefivetext(18);
			showfivetype();
			changesetTabSelection(18);
			fixedposition_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.onenumber_notposition_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(19);
			changefivetext(19);
			showfivetype();
			changesetTabSelection(19);
			onenumber_notposition_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.twonumber_notposition_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(20);
			changefivetext(20);
			showfivetype();
			changesetTabSelection(20);
			twonumber_notposition_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.maxmin_bottom_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(21);
			changefivetext(21);
			showfivetype();
			changesetTabSelection(21);
			maxmin_bottom_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		case R.id.maxmin_toptwo_text:
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(22);
			changefivetext(22);
			showfivetype();
			changesetTabSelection(22);
			maxmin_toptwo_text.setBackgroundResource(R.drawable.small_editbg);
			break;
		default:
			break;
		}
	}

	public void getresultint(int result) {
		number = result;
		Log.e("void", "" + number);

	}

	public void showresult(String result) {
		numberresult = result;
		Log.e("showresult", numberresult);
		if (result.equals("")) {
			RelativeLayout_addbasket.setBackgroundResource(R.drawable.pick_num_bottombg);
			LinearLayout_ischoose.setVisibility(View.GONE);
			LinearLayout_nochoose.setVisibility(View.VISIBLE);
		} else {
			RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			LinearLayout_ischoose.setVisibility(View.VISIBLE);
			LinearLayout_nochoose.setVisibility(View.GONE);
			text_chooseend.setText("已选" + number + "注，共" + 2 * number + "元");
			text_chooseresult.setText(result);
			Log.e("showresult", result);
			Log.e("void", "" + "已选" + number + "注，共" + 2 * number + "元");
		}

	}

	private void changesetTabSelection(int i) {
		// TODO Auto-generated method stub
		if (i == 1) {
			setTabSelection(getString(R.string.three_direct_double_name));
		}
		if (i == 2) {
			setTabSelection(getString(R.string.three_direct_single_name));
		}
		if (i == 3) {
			setTabSelection(getString(R.string.three_direct_sum_name));
		}
		if (i == 4) {
			setTabSelection(getString(R.string.three_group_three_name));
		}
		if (i == 5) {
			setTabSelection(getString(R.string.three_group_six_name));
		}
		if (i == 6) {
			setTabSelection(getString(R.string.three_group_sum_name));
		}
		if (i == 7) {
			setTabSelection(getString(R.string.three_group_combination_name));
		}
		if (i == 8) {
			setTabSelection(getString(R.string.three_group_three_single_name));
		}
		if (i == 9) {
			setTabSelection(getString(R.string.three_group_six_single_name));
		}
		if (i == 10) {
			setTabSelection(getString(R.string.top_two_direct_double_name));
		}
		if (i == 11) {
			setTabSelection(getString(R.string.top_two_direct_single_name));
		}
		if (i == 12) {
			setTabSelection(getString(R.string.top_two_group_double_name));
		}
		if (i == 13) {
			setTabSelection(getString(R.string.top_two_group_single_name));
		}
		if (i == 14) {
			setTabSelection(getString(R.string.bottom_two_direct_double_name));
		}
		if (i == 15) {
			setTabSelection(getString(R.string.bottom_two_direct_single_name));
		}
		if (i == 16) {
			setTabSelection(getString(R.string.bottom_two_group_double_name));
		}
		if (i == 17) {
			setTabSelection(getString(R.string.bottom_two_group_single_name));
		}
		if (i == 18) {
			setTabSelection(getString(R.string.fixedposition_name));
		}
		if (i == 19) {
			setTabSelection(getString(R.string.onenumber_notposition));
		}
		if (i == 20) {
			setTabSelection(getString(R.string.twonumber_notposition));
		}
		if (i == 21) {
			setTabSelection(getString(R.string.threeD_maxmin_bottom_name));
		}
		if (i == 22) {
			setTabSelection(getString(R.string.threeD_maxmin_toptwo_name));
		}

		write(i);
	}

	private void packupandslowdown() {
		// TODO Auto-generated method stub
		if (symbel_int == 1) {
			Log.d("play_menu", "play_menu");
			tran_sur.setVisibility(View.VISIBLE);
			play_menu_arrow1.setImageResource(R.drawable.arrow_up);
			symbel_int = symbel_int * -1;
			packup();
		} else if (symbel_int == -1) {
			Log.d("play_menu", "play_menu");
			tran_sur.setVisibility(View.GONE);
			play_menu_arrow1.setImageResource(R.drawable.arrow_down);
			slowdown();
			symbel_int = symbel_int * -1;
		}
	}

	private void packupbtn() {
		// TODO Auto-generated method stub
		if (symbel_int == -1) {
			Log.d("play_menu", "play_menu");
			tran_sur.setVisibility(View.VISIBLE);
			play_menu_arrow1.setImageResource(R.drawable.arrow_up);
			symbel_int = symbel_int * -1;
			slowdown();
		}
	}

	private void clearbackground() {
		// TODO Auto-generated method stub
		three_direct_double_text.setBackgroundResource(0);
		three_direct_single_text.setBackgroundResource(0);
		three_direct_sum_text.setBackgroundResource(0);
		three_group_three_text.setBackgroundResource(0);
		three_group_six_text.setBackgroundResource(0);
		three_group_sum_text.setBackgroundResource(0);
		three_group_combination_text.setBackgroundResource(0);
		three_group_three_single_text.setBackgroundResource(0);
		three_group_six_single_text.setBackgroundResource(0);
		top_two_direct_double_text.setBackgroundResource(0);
		top_two_direct_single_text.setBackgroundResource(0);
		top_two_group_double_text.setBackgroundResource(0);
		top_two_group_single_text.setBackgroundResource(0);
		bottom_two_direct_double_text.setBackgroundResource(0);
		bottom_two_direct_single_text.setBackgroundResource(0);
		bottom_two_group_double_text.setBackgroundResource(0);
		bottom_two_group_single_text.setBackgroundResource(0);
		fixedposition_text.setBackgroundResource(0);
		onenumber_notposition_text.setBackgroundResource(0);
		twonumber_notposition_text.setBackgroundResource(0);
		maxmin_bottom_text.setBackgroundResource(0);
		maxmin_toptwo_text.setBackgroundResource(0);

	}

	public boolean onTouch(View v, MotionEvent event) {
		switch (v.getId()) {
		default:
			break;
		}
		return false;

	}

	private void setCurrentFragment() {
		clearSelection();
		mFragmentTransaction = fragmentManager.beginTransaction();

		if (btn_menu1_int == 1) {
			write(1);
			if (three_direct_double == null) {
				three_direct_double = new three_direct_double();
				mFragmentTransaction.add(R.id.content, three_direct_double,
						getString(R.string.three_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_direct_double_name);
		} else if (btn_menu1_int == 2) {
			write(2);
			if (three_direct_single == null) {
				three_direct_single = new three_direct_single();
				mFragmentTransaction.add(R.id.content, three_direct_single,
						getString(R.string.three_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_direct_single_name);
		} else if (btn_menu1_int == 3) {
			write(3);
			if (three_direct_sum == null) {
				three_direct_sum = new three_direct_sum();
				mFragmentTransaction.add(R.id.content, three_direct_sum, getString(R.string.three_direct_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_direct_sum_name);
		} else if (btn_menu1_int == 4) {
			write(4);
			if (three_group_three == null) {
				three_group_three = new three_group_three();
				mFragmentTransaction.add(R.id.content, three_group_three, getString(R.string.three_group_three_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_group_three_name);
		} else if (btn_menu1_int == 5) {
			write(5);
			if (three_group_six == null) {
				three_group_six = new three_group_six();
				mFragmentTransaction.add(R.id.content, three_group_six, getString(R.string.three_group_six_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_group_six_name);
		} else if (btn_menu1_int == 6) {
			write(6);
			if (three_group_sum == null) {
				three_group_sum = new three_group_sum();
				mFragmentTransaction.add(R.id.content, three_group_sum, getString(R.string.three_group_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_group_sum_name);
		} else if (btn_menu1_int == 7) {
			write(7);
			if (three_group_combination == null) {
				three_group_combination = new three_group_combination();
				mFragmentTransaction.add(R.id.content, three_group_combination,
						getString(R.string.three_group_combination_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_group_combination_name);
		} else if (btn_menu1_int == 8) {
			write(8);
			if (three_group_three_single == null) {
				three_group_three_single = new three_group_three_single();
				mFragmentTransaction.add(R.id.content, three_group_three_single,
						getString(R.string.three_group_three_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_group_three_single_name);
		} else if (btn_menu1_int == 9) {
			write(9);
			if (three_group_six_single == null) {
				three_group_six_single = new three_group_six_single();
				mFragmentTransaction.add(R.id.content, three_group_six_single,
						getString(R.string.three_group_six_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_group_six_single_name);
		} else if (btn_menu1_int == 10) {
			write(10);
			if (top_two_direct_double == null) {
				top_two_direct_double = new top_two_direct_double();
				mFragmentTransaction.add(R.id.content, top_two_direct_double,
						getString(R.string.top_two_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.top_two_direct_double_name);
		} else if (btn_menu1_int == 11) {
			write(11);
			if (top_two_direct_single == null) {
				top_two_direct_single = new top_two_direct_single();
				mFragmentTransaction.add(R.id.content, top_two_direct_single,
						getString(R.string.top_two_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.top_two_direct_single_name);
		} else if (btn_menu1_int == 12) {
			write(12);
			if (top_two_group_double == null) {
				top_two_group_double = new top_two_group_double();
				mFragmentTransaction.add(R.id.content, top_two_group_double,
						getString(R.string.top_two_group_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.top_two_group_double_name);
		} else if (btn_menu1_int == 13) {
			write(13);
			if (top_two_group_single == null) {
				top_two_group_single = new top_two_group_single();
				mFragmentTransaction.add(R.id.content, top_two_group_single,
						getString(R.string.top_two_group_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.top_two_group_single_name);
		} else if (btn_menu1_int == 14) {
			write(14);
			if (bottom_two_direct_double == null) {
				bottom_two_direct_double = new bottom_two_direct_double();
				mFragmentTransaction.add(R.id.content, bottom_two_direct_double,
						getString(R.string.bottom_two_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottom_two_direct_double_name);
		} else if (btn_menu1_int == 15) {
			write(15);
			if (bottom_two_direct_single == null) {
				bottom_two_direct_single = new bottom_two_direct_single();
				mFragmentTransaction.add(R.id.content, bottom_two_direct_single,
						getString(R.string.bottom_two_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottom_two_direct_single_name);
		} else if (btn_menu1_int == 16) {
			write(16);
			if (bottom_two_group_double == null) {
				bottom_two_group_double = new bottom_two_group_double();
				mFragmentTransaction.add(R.id.content, bottom_two_group_double,
						getString(R.string.bottom_two_group_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottom_two_group_double_name);
		} else if (btn_menu1_int == 17) {
			write(17);
			if (bottom_two_group_single == null) {
				bottom_two_group_single = new bottom_two_group_single();
				mFragmentTransaction.add(R.id.content, bottom_two_group_single,
						getString(R.string.bottom_two_group_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottom_two_group_single_name);
		} else if (btn_menu1_int == 18) {
			write(18);
			if (fixedposition == null) {
				fixedposition = new fixedposition();
				mFragmentTransaction.add(R.id.content, fixedposition, getString(R.string.fixedposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.fixedposition_name);
		} else if (btn_menu1_int == 19) {
			write(19);
			if (onenumber_notposition == null) {
				onenumber_notposition = new onenumber_notposition();
				mFragmentTransaction.add(R.id.content, onenumber_notposition,
						getString(R.string.onenumber_notposition));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.onenumber_notposition);
		} else if (btn_menu1_int == 20) {
			write(20);
			if (twonumber_notposition == null) {
				twonumber_notposition = new twonumber_notposition();
				mFragmentTransaction.add(R.id.content, twonumber_notposition,
						getString(R.string.twonumber_notposition));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.twonumber_notposition);
		} else if (btn_menu1_int == 21) {
			write(21);
			if (maxmin_bottom == null) {
				maxmin_bottom = new maxmin_bottom();
				mFragmentTransaction.add(R.id.content, maxmin_bottom, getString(R.string.threeD_maxmin_bottom_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.threeD_maxmin_bottom_name);
		} else if (btn_menu1_int == 22) {
			write(22);
			if (maxmin_toptwo == null) {
				maxmin_toptwo = new maxmin_toptwo();
				mFragmentTransaction.add(R.id.content, maxmin_toptwo, getString(R.string.threeD_maxmin_toptwo_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.threeD_maxmin_toptwo_name);
		}

	}

	/**
	 * 鏍规嵁浼犲叆鐨則ag鍙傛暟鏉ヨ缃?変腑鐨則ab椤点??
	 * 
	 * @param tag
	 * 
	 */
	public void setTabSelection(String tag) {
		// 姣忔閫変腑涔嬪墠鍏堟竻妤氭帀涓婃鐨勯?変腑鐘舵??
		clearSelection();
		// 寮?鍚竴涓狥ragment浜嬪姟
		mFragmentTransaction = fragmentManager.beginTransaction();
		Log.e("setTagSele", "currentTag" + curFragmentTag + "-----tag----" + tag);
		if (TextUtils.equals(tag, getString(R.string.three_direct_double_name))) {
			if (three_direct_double == null) {
				three_direct_double = new three_direct_double();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_direct_single_name))) {
			if (three_direct_single == null) {
				three_direct_single = new three_direct_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_direct_sum_name))) {
			if (three_direct_sum == null) {
				three_direct_sum = new three_direct_sum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_group_three_name))) {
			if (three_group_three == null) {
				three_group_three = new three_group_three();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_group_six_name))) {
			if (three_group_six == null) {
				three_group_six = new three_group_six();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_group_sum_name))) {
			if (three_group_sum == null) {
				three_group_sum = new three_group_sum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_group_combination_name))) {
			if (three_group_combination == null) {
				three_group_combination = new three_group_combination();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_group_three_single_name))) {
			if (three_group_three_single == null) {
				three_group_three_single = new three_group_three_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_group_six_single_name))) {
			if (three_group_six_single == null) {
				three_group_six_single = new three_group_six_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.top_two_direct_double_name))) {
			if (top_two_direct_double == null) {
				top_two_direct_double = new top_two_direct_double();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.top_two_direct_single_name))) {
			if (top_two_direct_single == null) {
				top_two_direct_single = new top_two_direct_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.top_two_group_double_name))) {
			if (top_two_group_double == null) {
				top_two_group_double = new top_two_group_double();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.top_two_group_single_name))) {
			if (top_two_group_single == null) {
				top_two_group_single = new top_two_group_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottom_two_direct_double_name))) {
			if (bottom_two_direct_double == null) {
				bottom_two_direct_double = new bottom_two_direct_double();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottom_two_direct_single_name))) {
			if (bottom_two_direct_single == null) {
				bottom_two_direct_single = new bottom_two_direct_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottom_two_group_double_name))) {
			if (bottom_two_group_double == null) {
				bottom_two_group_double = new bottom_two_group_double();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottom_two_group_single_name))) {
			if (bottom_two_group_single == null) {
				bottom_two_group_single = new bottom_two_group_single();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.fixedposition_name))) {
			if (fixedposition == null) {
				fixedposition = new fixedposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.onenumber_notposition))) {
			if (onenumber_notposition == null) {
				onenumber_notposition = new onenumber_notposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.twonumber_notposition))) {
			if (twonumber_notposition == null) {
				twonumber_notposition = new twonumber_notposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.threeD_maxmin_bottom_name))) {
			if (maxmin_bottom == null) {
				maxmin_bottom = new maxmin_bottom();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.threeD_maxmin_toptwo_name))) {
			if (maxmin_toptwo == null) {
				maxmin_toptwo = new maxmin_toptwo();
			}
		}

		switchFragment(tag);

	}

	public void switchFragment(String tag) {
		if (TextUtils.equals(tag, curFragmentTag)) {
			Log.e("switchFragment", "curTag == tag");
			return;
		}

		if (curFragmentTag != null) {
			detachFragment(getFragment(curFragmentTag));

		}
		attachFragment(R.id.content, getFragment(tag), tag);
		curFragmentTag = tag;
		Log.e(" after switchFrag", "currenttag--->" + curFragmentTag);
		commitTransactions();
	}

	private void detachFragment(Fragment f) {

		if (f != null && !f.isDetached()) {
			Log.d("detachFragment-->", f.getTag());
			ensureTransaction();
			mFragmentTransaction.detach(f);
		}
	}

	private FragmentTransaction ensureTransaction() {
		if (mFragmentTransaction == null) {
			mFragmentTransaction = fragmentManager.beginTransaction();
			mFragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

		}
		return mFragmentTransaction;

	}

	private void attachFragment(int layout, Fragment f, String tag) {
		if (f != null) {
			if (f.isDetached()) {
				ensureTransaction();
				mFragmentTransaction.attach(f);

			} else if (!f.isAdded()) {
				ensureTransaction();
				mFragmentTransaction.add(layout, f, tag);
			}
		}
	}

	private void commitTransactions() {
		if (mFragmentTransaction != null && !mFragmentTransaction.isEmpty()) {
			mFragmentTransaction.commit();
			mFragmentTransaction = null;
		}
	}

	private Fragment getFragment(String tag) {

		Fragment f = fragmentManager.findFragmentByTag(tag);

		if (f == null) {
			// Toast.makeText(getApplicationContext(), "fragment == null",
			// Toast.LENGTH_SHORT).show();

			f = threeDBaseFragmentticket.newInstance(getApplicationContext(), tag);
		}
		return f;

	}

	/**
	 * 娓呴櫎鎺夋墍鏈夌殑閫変腑鐘舵?併??
	 */
	private void clearSelection() {
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		getticketplan();
		Log.e(TAG, "onStart----->");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(TAG, "onresume---->");
		threeDBaseActivityticket.curFragmentTag = getString(R.string.five_star);
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		// getnewtime();
		Log.e(TAG, "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		// getnewtime();
		Log.e(TAG, "onStop");
	}

	@Override
	public void onDestroy() {
		write(0);
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		No[0] = "000";
		No[1] = "000";
		No[2] = "000";
		No[3] = "000";
		No[4] = "000";
		No[5] = "000";
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG, "ondestory");
	}

	public void showAlertDialog() {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage("返回上层将清空已选号码，您确定返回吗？");
		builder.setTitle("提示");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				finish();
				// 设置你的操作事项
			}
		});

		builder.setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		builder.create().show();

	}

	public void showAlertDialognonumber(String str) {

		dialogone.Builder builder = new dialogone.Builder(this);
		builder.setMessage(str);
		builder.setTitle("提示");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				// 设置你的操作事项
			}
		});

		builder.setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		builder.create().show();

	}

	public void showAlertDialognonumber1(String str) {

		dialogone.Builder builder = new dialogone.Builder(this);
		builder.setMessage(str);
		builder.setTitle("提示");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		builder.setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		builder.create().show();

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if (data == null)
			return;
		Bundle bundle = data.getExtras();

		switch (requestCode) {
		case 0:
			// String otherneed = bundle.getString("otherneed");
			ticketnumber = bundle.getStringArray("ticketnumber");
			tickettype = bundle.getStringArray("tickettype");
			numberofticket = bundle.getIntArray("numberofticket");
			numberposition = bundle.getInt("numberposition");
			// tickettypecode = bundle.getInt("tickettypecode");
			showTextView_show_number();
			break;
		default:
			break;
		}
	}

	protected void go() {
		// getnewtime();
		// TODO Auto-generated method stub
		// Date date = new Date();// 取时间BH
		// Calendar calendar = new GregorianCalendar();
		// calendar.setTime(date);
		// calendar.add(calendar.DATE, 1);// 把日期往后增加一天.整数往后推,负数往前移动
		// date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		if (timerTask != null) {
			timerTask = null;
		}
		minute = -1;
		second = -1;
		int Nominute = 0;
		int Nosecond = 0;
		Nominute = (int) (Notime[tickettypecode - 1] / 60);
		Nosecond = (int) (Notime[tickettypecode - 1] - 60 * Nominute);
		// text = getticketno.Changetianjin(texta);
		// Log.e("minute3", text);

		// no = getticketno.gettianjin(text);
		// int getminute = getticketno.gettianjinminute(no, texta);
		if (Notime[tickettypecode - 1] == 0) {
			text_showtime.setText("00" + ":" + "00");
			Editor edit = nowdata.edit();
			edit.putString("nowdata", No[tickettypecode - 1]);
			edit.commit();
			text_showno.setText(No[tickettypecode - 1]);
			Stastshowtime();
		} else {
			minute = Nominute;
			second = Nosecond;
			text_showtime.setText(minute + ":" + second);
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
			Editor edit = nowdata.edit();
			edit.putString("nowdata", No[tickettypecode - 1]);
			edit.commit();
			text_showno.setText(No[tickettypecode - 1]);
		}

	}

	public void getmoney() {
		// if (sscrmb < number * 2) {
		// if (showalert == 0) {
		// showAlertDialognonumber1("余额不足");
		// showalert = 1;
		// }
		//
		// }
	}

	private void Stastshowtime() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				showint = 0;
				getticketplan();
			}

		}, 20000);
	}

	private void getticketplan() {
		// TODO Auto-generated method stub
		Log.e("eee", "www");
		cookies = cookiesdetail.getString("cookies", "");
		Log.e("eee", "www1");
		final ArrayList nameValuePairs = new ArrayList();
		Log.e("eee", "www2");
		nameValuePairs.add(new BasicNameValuePair("gameId", gameid[tickettypecode - 1]));
		// nameValuePairs.add(new BasicNameValuePair("page", "1"));
		// Log.d("selindex", "selindex" + "read" + selindex);
		Log.e("eee", "www3");
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;
				// TODO Auto-generated method stub
				Log.e("eee", "www4");
				DefaultHttpClient httpClient = new DefaultHttpClient();
				// /Log.d("TabAFragment", "1");
				Log.e("eee", "www5");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/GetGamePlan");
				Log.e("eee", "www6");
				Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				// Log.d("TabAFragment", "111");
				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					// Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					// Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							No[tickettypecode - 1] = json_data.getString("no");
							Notime[tickettypecode - 1] = json_data.getDouble("time");
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("no");
							// value[i] = json_data.getString("value");
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
