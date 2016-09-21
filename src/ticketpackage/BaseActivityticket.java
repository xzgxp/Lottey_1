package ticketpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import dialog.dialogone;
import dialog.dialogtwo;
import fourteen.Bottompthreegroupsixsingle;
import fourteen.Bottompthreegroupthreesingle;
import fourteen.Bottompthreemixgroup;
import fourteen.Bottomthreedirectsingle;
import fourteen.Fivedirectsingle;
import fourteen.Fourdirectsingle;
import fourteen.Topthreedirectsingle;
import fourteen.Topthreegroupsixsingle;
import fourteen.Topthreegroupthreesingle;
import fourteen.Topthreemixgroup;
import fourteen.Twodirectbottomtwosingle;
import fourteen.Twodirecttoptwosingle;
import fourteen.Twogroupbottomtwosingle;
import fourteen.Twogrouptoptwosingle;
import model.chongqingticketplan;
import other.loginpassword;
import other.setting;

/**
 * 椤圭洰鐨勪富Activity锛屾墍鏈夌殑Fragment閮藉祵鍏ュ湪杩欓噷銆? vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
 * 
 * @author
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public class BaseActivityticket extends FragmentActivity implements OnClickListener, OnTouchListener {
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
	private double sscrmb = 0.0;
	private SharedPreferences preticketint;
	private SharedPreferences nowdata;
	private Fivedirectdouble Fivedirectdouble;
	private Fivegroup120 Fivegroup120;
	private Fivegroup60 Fivegroup60;
	private Fivegroup30 Fivegroup30;
	private Fivegroup20 Fivegroup20;
	private Fivegroup10 Fivegroup10;
	private Fivegroup5 Fivegroup5;
	private Fourdirectdouble Fourdirectdouble;
	private Fourgroup24 Fourgroup24;
	private Fourgroup12 Fourgroup12;
	private Topthreedirectdouble Topthreedirectdouble;
	private Topthreegroup3 Topthreegroup3;
	private Topthreegroup6 Topthreegroup6;
	private Topthreegroupsum Topthreegroupsum;
	private Topthreegroupcontainer Topthreegroupcontainer;
	private Bottomthreedirectdouble Bottomthreedirectdouble;
	private Bottomthreedirectspan Bottomthreedirectspan;
	private Bottomthreegroup3 Bottomthreegroup3;
	private Bottomthreegroup6 Bottomthreegroup6;
	private Bottomthreegroupsum Bottomthreegroupsum;
	private Bottomthreegroupcontainer Bottomthreegroupcontainer;
	private Twodirectbottomtwodouble Twodirectbottomtwodouble;
	private Twodirectbottomtwosum Twodirectbottomtwosum;
	private Twodirectbottomtwospan Twodirectbottomtwospan;
	private Twodirecttoptwodouble Twodirecttoptwodouble;
	private Twodirecttoptwospan Twodirecttoptwospan;
	private Twogroupbottomtwodouble Twogroupbottomtwodouble;
	private Twogrouptoptwodouble Twogrouptoptwodouble;
	private Fixedposition Fixedposition;
	private Threebottomthreeonenotposition Threebottomthreeonenotposition;
	private Threebottomthreetwonotposition Threebottomthreetwonotposition;
	private Threetopthreeonenotposition Threetopthreeonenotposition;
	private Threetopthreetwonotposition Threetopthreetwonotposition;
	private Fourbottomfourtwonotposition Fourbottomfourtwonotposition;
	private Fivebottomfivetwonotposition Fivebottomfivetwonotposition;
	private Fivebottomfivethreenotposition Fivebottomfivethreenotposition;
	private Twogrouptoptwosum Twogrouptoptwosum;
	private Fourgroup6 Fourgroup6;
	private Fourgroup4 Fourgroup4;
	private Bottomthreedirectsum Bottomthreedirectsum;
	private Topthreedirectsum Topthreedirectsum;
	private Topthreedirectspan Topthreedirectspan;
	private Topthreesumend Topthreesumend;
	private Bottomthreesumend Bottomthreesumend;
	private Twodirecttoptwosum Twodirecttoptwosum;
	private Twogrouptoptwocontainer Twogrouptoptwocontainer;
	private Twogroupbottomtwocontainer Twogroupbottomtwocontainer;
	private Twogroupbottomtwosum Twogroupbottomtwosum;
	private Fourbottomfouronenotposition Fourbottomfouronenotposition;
	private Maxminbottomtwo Maxminbottomtwo;
	private Maxminbottomthree Maxminbottomthree;
	private Maxmintoptwo Maxmintoptwo;
	private Maxmintopthree Maxmintopthree;// 新加14彩种
	private Fivedirectsingle Fivedirectsingle;
	private Fourdirectsingle Fourdirectsingle;
	private Topthreegroupthreesingle Topthreegroupthreesingle;
	private Topthreegroupsixsingle Topthreegroupsixsingle;
	private Topthreedirectsingle Topthreedirectsingle;
	private Bottomthreedirectsingle Bottomthreedirectsingle;
	private Bottompthreegroupthreesingle Bottompthreegroupthreesingle;
	private Bottompthreegroupsixsingle Bottompthreegroupsixsingle;
	private Twodirecttoptwosingle Twodirecttoptwosingle;
	private Twogrouptoptwosingle Twogrouptoptwosingle;
	private Twogroupbottomtwosingle Twogroupbottomtwosingle;
	private Twodirectbottomtwosingle Twodirectbottomtwosingle;
	private Topthreemixgroup Topthreemixgroup;
	private Bottompthreemixgroup Bottompthreemixgroup;
	// 到此为止
	private String topthree_mix_group_str = "前三混合组选";
	private String bottompthree_mix_group_str = "后三混合组选";
	private String five_direct_single_str = "五星直选单式";
	private String four_direct_single_str = "四星直选单式";
	private String topthree_direct_single_str = "前三直选单式";
	private String topthree_group_three_single_str = "前三组三单式";
	private String topthree_group_six_single_str = "前三组六单式";
	private String bottomthree_direct_single_str = "后三直选单式";
	private String bottomthree_group_three_single_str = "后三组三单式";
	private String bottomthree_group_six_single_str = "后三组六单式";
	private String two_direct_bottomtwo_single_str = "后二直选单式";
	private String two_direct_toptwo_single_str = "前二直选单式";
	private String two_group_bottomtwo_single_str = "后二组选单式";
	private String two_group_toptwo_single_str = "前二组选单式";

	private TextView five_direct_single;
	private TextView four_direct_single;
	private TextView topthree_group_three_single;
	private TextView topthree_group_six_single;
	private TextView topthree_direct_single;
	private TextView bottomthree_direct_single;
	private TextView bottompthree_group_three_single;
	private TextView bottompthree_group_six_single;
	private TextView two_direct_toptwo_single;
	private TextView two_group_toptwo_single;
	private TextView two_group_bottomtwo_single;
	private TextView two_direct_bottomtwo_single;
	private TextView topthree_mix_group;
	private TextView bottompthree_mix_group;
	// 到此为止
	private String five_direct_double_str = "五星直选复式";
	private String five_group_120_str = "五星组选120";
	private String five_group_60_str = "五星组选60";
	private String five_group_30_str = "五星组选30";
	private String five_group_20_str = "五星组选20";
	private String five_group_10_str = "五星组选10";
	private String five_group_5_str = "五星组选5";
	private String four_direct_double_str = "四星直选复式";
	private String four_group_24_str = "四星组选24";
	private String four_group_12_str = "四星组选12";
	private String topthree_direct_double_str = "前三直选复式";
	private String topthree_group_three_str = "前三组选组三";
	private String topthree_group_six_str = "前三组选组六";
	private String topthree_group_sum_str = "前三组选和值";
	private String topthree_group_container_str = "前三组选包胆";
	private String bottomthree_direct_double_str = "后三直选复式";
	private String bottomthree_group_span_str = "后三直选跨度";
	private String bottomthree_group_three_str = "后三组选组三";
	private String bottomthree_group_six_str = "后三组选组六";
	private String bottomthree_group_sum_str = "后三组选和值";
	private String bottomthree_group_container_str = "后三组选包胆";
	private String two_direct_bottomtwo_double_str = "后二直选复式";
	private String two_direct_bottomtwo_sum_str = "后二直选和值";
	private String two_direct_bottomtwo_span_str = "后二直选跨度";
	private String two_direct_toptwo_double_str = "前二直选复式";
	private String two_direct_toptwo_span_str = "前二直选跨度";
	private String two_group_bottomtwo_double_str = "后二组选复式";
	private String two_group_toptwo_double_str = "前二组选复式";
	private String fixed_position_str = "定位胆";
	private String three_bottomthree_one_notposition_str = "后三一码不定位";
	private String three_bottomthree_two_notposition_str = "后三二码不定位";
	private String three_topthree_one_notposition_str = "前三一码不定位";
	private String three_topthree_two_notposition_str = "前三二码不定位";
	private String four_bottomfour_two_notposition_str = "四星二码不定位";
	private String five_bottomfive_two_notposition_str = "五星二码不定位";
	private String five_bottomfive_three_notposition_str = "五星三码不定位";
	private String two_group_toptwo_sum_str = "前二组选和值";
	private String four_group_6_str = "四星组选6";
	private String four_group_4_str = "四星组选4";
	private String bottomthree_direct_sum_str = "后三直选和值";
	private String topthree_direct_sum_str = "前三直选和值";
	private String topthree_direct_span_str = "前三直选跨度";
	private String topthree_sum_end_str = "前三和值尾数";
	private String bottomthree_sum_end_str = "后三和值尾数";
	private String two_direct_toptwo_sum_str = "前二直选和值";
	private String two_group_toptwo_container_str = "前二组选包胆";
	private String two_group_bottomtwo_container_str = "后二组选包胆";
	private String two_group_bottomtwo_sum_str = "后二组选和值";
	private String four_bottomfour_one_notposition_str = "四星一码不定位";
	private String maxmin_bottomtwo_str = "后二大小单双";
	private String maxmin_bottomthree_str = "后三大小单双";
	private String maxmin_toptwo_str = "前二大小单双";
	private String maxmin_topthree_str = "前三大小单双";
	private static final String TAG = "MainActivity";
	private SharedPreferences precq;
	private SharedPreferences prexj;
	private SharedPreferences pretj;
	private SharedPreferences prejx;
	private SharedPreferences preticket;
	private int symbel_int = 1;
	private FragmentManager fragmentManager;
	private FragmentTransaction mFragmentTransaction;
	private int tickettypecode = 1;
	public static String curFragmentTag;
	private SharedPreferences userinfo;
	private int wight;
	private LinearLayout LinearLayout_ticket_rule;
	private LinearLayout play_menu;
	private LinearLayout play_menu_arrow;
	private LinearLayout tran_sur;
	private ImageButton play_menu_arrow1;
	private TextView five_direct_double;
	private TextView five_group_120;
	private TextView five_group_60;
	private TextView five_group_30;
	private TextView five_group_20;
	private TextView five_group_10;
	private TextView five_group_5;
	private TextView four_direct_double;
	private TextView four_group_24;
	private TextView four_group_12;
	private TextView topthree_direct_double;
	private TextView topthree_group_three;
	private TextView topthree_group_six;
	private TextView topthree_group_sum;
	private TextView topthree_group_container;
	private TextView bottomthree_direct_double;
	private TextView bottomthree_group_span;
	private TextView bottomthree_group_three;
	private TextView bottomthree_group_six;
	private TextView bottomthree_group_sum;
	private TextView bottomthree_group_container;
	private TextView two_direct_bottomtwo_double;
	private TextView two_direct_bottomtwo_sum;
	private TextView two_direct_bottomtwo_span;
	private TextView two_direct_toptwo_double;
	private TextView two_direct_toptwo_span;
	private TextView two_group_bottomtwo_double;
	private TextView two_group_toptwo_double;
	private TextView fixed_position;
	private TextView three_bottomthree_one_notposition;
	private TextView three_bottomthree_two_notposition;
	private TextView three_topthree_one_notposition;
	private TextView three_topthree_two_notposition;
	private TextView four_bottomfour_two_notposition;
	private TextView five_bottomfive_two_notposition;
	private TextView five_bottomfive_three_notposition;
	private TextView two_group_toptwo_sum;
	private TextView four_group_6;
	private TextView four_group_4;
	private TextView bottomthree_direct_sum;
	private TextView topthree_direct_sum;
	private TextView topthree_direct_span;
	private TextView topthree_sum_end;
	private TextView bottomthree_sum_end;
	private TextView two_direct_toptwo_sum;
	private TextView two_group_toptwo_container;
	private TextView two_group_bottomtwo_container;
	private TextView two_group_bottomtwo_sum;
	private TextView four_bottomfour_one_notposition;
	private TextView maxmin_bottomtwo;
	private TextView maxmin_bottomthree;
	private TextView maxmin_toptwo;
	private TextView maxmin_topthree;
	private TextView base_tickettype;
	private String numberresult;
	private String tj_tickettype = "天津时时彩", jx_tickettype = "江西时时彩", xj_tickettype = "新疆时时彩", cq_tickettype = "重庆时时彩";
	private LinearLayout base_back;
	private Button btn_menu1, btn_menu2, btn_menu3, btn_menu4, btn_menu5;
	private Integer btn_menu1_int = 0, btn_menu2_int = 0, btn_menu3_int = 0, btn_menu4_int = 0, btn_menu5_int = 0;
	private String[] ticketnumber = new String[100];
	private String[] tickettype = new String[100];
	private int[] numberofticket = new int[100];
	private LinearLayout lin_loading;
	private String[] ticketname = { "", five_direct_double_str, five_group_120_str, five_group_60_str,
			five_group_30_str, five_group_20_str, five_group_10_str, five_group_5_str, four_direct_double_str,
			four_group_24_str, four_group_12_str, topthree_direct_double_str, topthree_group_three_str,
			topthree_group_six_str, topthree_group_sum_str, topthree_group_container_str, bottomthree_direct_double_str,
			bottomthree_group_span_str, bottomthree_group_three_str, bottomthree_group_six_str,
			bottomthree_group_sum_str, bottomthree_group_container_str, two_direct_bottomtwo_double_str,
			two_direct_bottomtwo_sum_str, two_direct_bottomtwo_span_str, two_direct_toptwo_double_str,
			two_direct_toptwo_span_str, two_group_bottomtwo_double_str, two_group_toptwo_double_str, fixed_position_str,
			three_bottomthree_one_notposition_str, three_bottomthree_two_notposition_str,
			three_topthree_one_notposition_str, three_topthree_two_notposition_str, four_bottomfour_two_notposition_str,
			five_bottomfive_two_notposition_str, five_bottomfive_three_notposition_str, two_group_toptwo_sum_str,
			four_group_6_str, four_group_4_str, bottomthree_direct_sum_str, topthree_direct_sum_str,
			topthree_direct_span_str, topthree_sum_end_str, bottomthree_sum_end_str, two_direct_toptwo_sum_str,
			two_group_toptwo_container_str, two_group_bottomtwo_container_str, two_group_bottomtwo_sum_str,
			four_bottomfour_one_notposition_str, maxmin_bottomtwo_str, maxmin_bottomthree_str, maxmin_toptwo_str,
			maxmin_topthree_str, five_direct_single_str, four_direct_single_str, topthree_group_three_single_str,
			topthree_group_six_single_str, topthree_direct_single_str, bottomthree_direct_single_str,
			bottomthree_group_three_single_str, bottomthree_group_six_single_str, two_direct_toptwo_single_str,
			two_group_toptwo_single_str, two_group_bottomtwo_single_str, two_direct_bottomtwo_single_str,
			topthree_mix_group_str, bottompthree_mix_group_str };
	private SharedPreferences cookiesdetail;
	private String cookies;
	private SharedPreferences xinjiang;
	private String[] no = { "0", "0", "0", "0" };
	Time time;
	Date date;
	private String[] gameid = { "069A4F0E-1032-4198-BB6B-586549485AF6", "598E270B-0CF9-4964-9E1C-0C0D287BE13C",
			"5819B172-F0A9-49AB-BBE7-52BD8FA56C01", "966B02D4-46A9-47FA-BDF4-35E5131B8132" };
	private int showint = 0;
	private SharedPreferences chongqing;
	private String noagain = "000";
	private int endtime = 0;
	private TextView text_showtime;
	private TextView text_showno;
	private String[] No = { "000", "000", "000", "000" };
	private Double[] Notime = { 0.0, 0.0, 0.0, 0.0 };
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

				if (second <= 0) {
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

	// @Override
	// public boolean onKeyDown(int keyCode, KeyEvent event) {
	// // TODO Auto-generated method stub
	// if (keyCode == KeyEvent.KEYCODE_BACKSLASH) {
	// if (showalert == 0) {
	// // finish();
	// } else {
	// showalert = 0;
	// }
	// }
	// return false;
	// }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.ticket_activity_baseactivity);
		xinjiang = getSharedPreferences("xinjiang", MODE_PRIVATE);
		prexj = getSharedPreferences("xjmenuinfo", MODE_PRIVATE);
		prejx = getSharedPreferences("jxmenuinfo", MODE_PRIVATE);
		precq = getSharedPreferences("cqmenuinfo", MODE_PRIVATE);
		pretj = getSharedPreferences("tjmenuinfo", MODE_PRIVATE);
		preticket = getSharedPreferences("fastticket", MODE_PRIVATE);
		preticketint = getSharedPreferences("ticketinfo", MODE_PRIVATE);
		userinfo = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
		yue = userinfo.getString("sscrmb", "0.0");
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		nowdata = getSharedPreferences("nowdata", Context.MODE_PRIVATE);
		sscrmb = Double.valueOf(yue);

		Log.d("dfsdf", "" + sscrmb);
		for (int i = 0; i < 53; i++) {
			Log.d("dfsdf", ticketname[i]);
		}
		Log.e("chongqingticketplan.no[1]", chongqingticketplan.no[1]);

		//
		// 鍒濆鍖栧竷灞?鍏冪礌
		initViews();
		Animation anim = AnimationUtils.loadAnimation(this, R.animator.round_loading);
		activity = this;
		findViewById(R.id.loadingBtn).startAnimation(anim);
		btn_menu1.setBackgroundResource(R.drawable.my_account_menu_pressed);
		if (tickettypecode == 1) {
			readtj();
			writefasttj();
			base_tickettype.setText(tj_tickettype);
		} else if (tickettypecode == 2) {
			readxj();
			writefastxj();
			base_tickettype.setText(xj_tickettype);
		} else if (tickettypecode == 3) {
			readjx();
			writefastjx();
			base_tickettype.setText(jx_tickettype);
		} else if (tickettypecode == 4) {
			readcq();
			writefastcq();
			base_tickettype.setText(cq_tickettype);
		}
		showfivetype();
		getticketplan();
		play_menu_arrow1.setImageResource(R.drawable.arrow_down);
		wight = getWindow().getWindowManager().getDefaultDisplay().getHeight();
		wight = wight / 3;
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
		} else if (ticketint == 23) {
			write(23);
			changesetTabSelection(23);
		} else if (ticketint == 24) {
			write(24);
			changesetTabSelection(24);
		} else if (ticketint == 25) {
			write(25);
			changesetTabSelection(25);
		} else if (ticketint == 26) {
			write(26);
			changesetTabSelection(26);
		} else if (ticketint == 27) {
			write(27);
			changesetTabSelection(27);
		} else if (ticketint == 28) {
			write(28);
			changesetTabSelection(28);
		} else if (ticketint == 29) {
			write(29);
			changesetTabSelection(29);
		} else if (ticketint == 30) {
			write(30);
			changesetTabSelection(30);
		} else if (ticketint == 31) {
			write(31);
			changesetTabSelection(31);
		} else if (ticketint == 32) {
			write(32);
			changesetTabSelection(32);
		} else if (ticketint == 33) {
			write(33);
			changesetTabSelection(33);
		} else if (ticketint == 34) {
			write(34);
			changesetTabSelection(34);
		} else if (ticketint == 35) {
			write(35);
			changesetTabSelection(35);
		} else if (ticketint == 36) {
			write(36);
			changesetTabSelection(36);
		} else if (ticketint == 37) {
			write(37);
			changesetTabSelection(37);
		} else if (ticketint == 38) {
			write(38);
			changesetTabSelection(38);
		} else if (ticketint == 39) {
			write(39);
			changesetTabSelection(39);
		} else if (ticketint == 40) {
			write(40);
			changesetTabSelection(40);
		} else if (ticketint == 41) {
			write(41);
			changesetTabSelection(41);
		} else if (ticketint == 42) {
			write(42);
			changesetTabSelection(42);
		} else if (ticketint == 43) {
			write(43);
			changesetTabSelection(43);
		} else if (ticketint == 44) {
			write(44);
			changesetTabSelection(44);
		} else if (ticketint == 45) {
			write(45);
			changesetTabSelection(45);
		} else if (ticketint == 46) {
			write(46);
			changesetTabSelection(46);
		} else if (ticketint == 47) {
			write(47);
			changesetTabSelection(47);
		} else if (ticketint == 48) {
			write(48);
			changesetTabSelection(48);
		} else if (ticketint == 49) {
			write(49);
			changesetTabSelection(49);
		} else if (ticketint == 50) {
			write(50);
			changesetTabSelection(50);
		} else if (ticketint == 51) {
			write(51);
			changesetTabSelection(51);
		} else if (ticketint == 52) {
			write(52);
			changesetTabSelection(52);
		} else if (ticketint == 53) {
			write(53);
			changesetTabSelection(53);
		} else if (ticketint == 54) {
			write(54);
			changesetTabSelection(54);
		} else if (ticketint == 55) {
			write(55);
			changesetTabSelection(55);
		} else if (ticketint == 56) {
			write(56);
			changesetTabSelection(56);
		} else if (ticketint == 57) {
			write(57);
			changesetTabSelection(57);
		} else if (ticketint == 58) {
			write(58);
			changesetTabSelection(58);
		} else if (ticketint == 59) {
			write(59);
			changesetTabSelection(59);
		} else if (ticketint == 60) {
			write(60);
			changesetTabSelection(60);
		} else if (ticketint == 61) {
			write(61);
			changesetTabSelection(61);
		} else if (ticketint == 62) {
			write(62);
			changesetTabSelection(62);
		} else if (ticketint == 63) {
			write(63);
			changesetTabSelection(63);
		} else if (ticketint == 64) {
			write(64);
			changesetTabSelection(64);
		} else if (ticketint == 65) {
			write(65);
			changesetTabSelection(65);
		} else if (ticketint == 66) {
			write(66);
			changesetTabSelection(66);
		} else if (ticketint == 67) {
			write(67);
			changesetTabSelection(67);
		} else if (ticketint == 0) {
			setCurrentFragment();
		}

	}

	private void read() {
		// TODO Auto-generated method stub
		ticketint = preticketint.getInt("ticketint", 0);
		Log.d("ticketint", "ticketint" + "read" + ticketint);
	}

	private void write(int i) {
		// TODO Auto-generated method stub
		Editor edit = preticketint.edit();
		edit.putInt("ticketint", i);
		edit.commit();
	}

	private void readtj() {
		// TODO Auto-generated method stub
		btn_menu1_int = pretj.getInt("btn_menu1_int", 1);
		btn_menu2_int = pretj.getInt("btn_menu2_int", 0);
		btn_menu3_int = pretj.getInt("btn_menu3_int", 0);
		btn_menu4_int = pretj.getInt("btn_menu4_int", 0);
		btn_menu5_int = pretj.getInt("btn_menu5_int", 0);
	}

	private void readjx() {
		// TODO Auto-generated method stub
		btn_menu1_int = prejx.getInt("btn_menu1_int", 1);
		btn_menu2_int = prejx.getInt("btn_menu2_int", 0);
		btn_menu3_int = prejx.getInt("btn_menu3_int", 0);
		btn_menu4_int = prejx.getInt("btn_menu4_int", 0);
		btn_menu5_int = prejx.getInt("btn_menu5_int", 0);
	}

	private void readcq() {
		// TODO Auto-generated method stub
		btn_menu1_int = precq.getInt("btn_menu1_int", 1);
		btn_menu2_int = precq.getInt("btn_menu2_int", 0);
		btn_menu3_int = precq.getInt("btn_menu3_int", 0);
		btn_menu4_int = precq.getInt("btn_menu4_int", 0);
		btn_menu5_int = precq.getInt("btn_menu5_int", 0);
	}

	private void readxj() {
		// TODO Auto-generated method stub
		btn_menu1_int = prexj.getInt("btn_menu1_int", 1);
		btn_menu2_int = prexj.getInt("btn_menu2_int", 0);
		btn_menu3_int = prexj.getInt("btn_menu3_int", 0);
		btn_menu4_int = prexj.getInt("btn_menu4_int", 0);
		btn_menu5_int = prexj.getInt("btn_menu5_int", 0);
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
		if (tickettypecode == 1) {
			writetj();
		} else if (tickettypecode == 2) {
			writexj();
		} else if (tickettypecode == 3) {
			writejx();
		} else if (tickettypecode == 4) {
			writecq();
		}

	}

	private void writecq() {
		// TODO Auto-generated method stub
		Editor edit = precq.edit();
		edit.putInt("btn_menu1_int", btn_menu1_int);
		edit.putInt("btn_menu2_int", btn_menu2_int);
		edit.putInt("btn_menu3_int", btn_menu3_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.commit();
	}

	private void writexj() {
		// TODO Auto-generated method stub
		Editor edit = prexj.edit();
		edit.putInt("btn_menu1_int", btn_menu1_int);
		edit.putInt("btn_menu2_int", btn_menu2_int);
		edit.putInt("btn_menu3_int", btn_menu3_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.commit();
	}

	private void writejx() {
		// TODO Auto-generated method stub
		Editor edit = prejx.edit();
		edit.putInt("btn_menu1_int", btn_menu1_int);
		edit.putInt("btn_menu2_int", btn_menu2_int);
		edit.putInt("btn_menu3_int", btn_menu3_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.putInt("btn_menu4_int", btn_menu4_int);
		edit.commit();
	}

	private void writetj() {
		// TODO Auto-generated method stub
		Editor edit = pretj.edit();
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
		tickettypecode = intent.getIntExtra("tickettypecode", 0);

		base_back = (LinearLayout) findViewById(R.id.base_back);
		LinearLayout_ticket_rule = (LinearLayout) findViewById(R.id.LinearLayout_ticket_rule);
		play_menu = (LinearLayout) findViewById(R.id.play_menu);
		play_menu_arrow = (LinearLayout) findViewById(R.id.play_menu_arrow);
		tran_sur = (LinearLayout) findViewById(R.id.tran_sur);
		play_menu_arrow1 = (ImageButton) findViewById(R.id.play_menu_arrow1);
		five_direct_double = (TextView) findViewById(R.id.five_direct_double);
		five_direct_single = (TextView) findViewById(R.id.five_direct_single);
		four_direct_single = (TextView) findViewById(R.id.four_direct_single);
		topthree_group_three_single = (TextView) findViewById(R.id.topthree_group_three_single);
		topthree_group_six_single = (TextView) findViewById(R.id.topthree_group_six_single);
		topthree_direct_single = (TextView) findViewById(R.id.topthree_direct_single);
		bottomthree_direct_single = (TextView) findViewById(R.id.bottomthree_direct_single);
		bottompthree_group_three_single = (TextView) findViewById(R.id.bottompthree_group_three_single);
		bottompthree_group_six_single = (TextView) findViewById(R.id.bottompthree_group_six_single);
		two_direct_toptwo_single = (TextView) findViewById(R.id.two_direct_toptwo_single);
		two_group_toptwo_single = (TextView) findViewById(R.id.two_group_toptwo_single);
		two_group_bottomtwo_single = (TextView) findViewById(R.id.two_group_bottomtwo_single);
		two_direct_bottomtwo_single = (TextView) findViewById(R.id.two_direct_bottomtwo_single);
		topthree_mix_group = (TextView) findViewById(R.id.topthree_mix_group);
		bottompthree_mix_group = (TextView) findViewById(R.id.bottompthree_mix_group);
		// 到此为止
		five_group_120 = (TextView) findViewById(R.id.five_group_120);
		five_group_60 = (TextView) findViewById(R.id.five_group_60);
		five_group_30 = (TextView) findViewById(R.id.five_group_30);
		five_group_20 = (TextView) findViewById(R.id.five_group_20);
		five_group_10 = (TextView) findViewById(R.id.five_group_10);
		five_group_5 = (TextView) findViewById(R.id.five_group_5);
		four_direct_double = (TextView) findViewById(R.id.four_direct_double);
		four_group_24 = (TextView) findViewById(R.id.four_group_24);
		four_group_12 = (TextView) findViewById(R.id.four_group_12);
		topthree_direct_double = (TextView) findViewById(R.id.topthree_direct_double);
		topthree_group_three = (TextView) findViewById(R.id.topthree_group_three);
		topthree_group_six = (TextView) findViewById(R.id.topthree_group_six);
		topthree_group_sum = (TextView) findViewById(R.id.topthree_group_sum);
		topthree_group_container = (TextView) findViewById(R.id.topthree_group_container);
		bottomthree_direct_double = (TextView) findViewById(R.id.bottomthree_direct_double);
		bottomthree_group_span = (TextView) findViewById(R.id.bottomthree_group_span);
		bottomthree_group_three = (TextView) findViewById(R.id.bottomthree_group_three);
		bottomthree_group_six = (TextView) findViewById(R.id.bottomthree_group_six);
		bottomthree_group_sum = (TextView) findViewById(R.id.bottomthree_group_sum);
		bottomthree_group_container = (TextView) findViewById(R.id.bottomthree_group_container);
		two_direct_bottomtwo_double = (TextView) findViewById(R.id.two_direct_bottomtwo_double);
		two_direct_bottomtwo_sum = (TextView) findViewById(R.id.two_direct_bottomtwo_sum);
		two_direct_bottomtwo_span = (TextView) findViewById(R.id.two_direct_bottomtwo_span);
		two_direct_toptwo_double = (TextView) findViewById(R.id.two_direct_toptwo_double);
		two_direct_toptwo_span = (TextView) findViewById(R.id.two_direct_toptwo_span);
		two_group_bottomtwo_double = (TextView) findViewById(R.id.two_group_bottomtwo_double);
		two_group_toptwo_double = (TextView) findViewById(R.id.two_group_toptwo_double);
		fixed_position = (TextView) findViewById(R.id.fixed_position);
		three_bottomthree_one_notposition = (TextView) findViewById(R.id.three_bottomthree_one_notposition);
		three_bottomthree_two_notposition = (TextView) findViewById(R.id.three_bottomthree_two_notposition);
		three_topthree_one_notposition = (TextView) findViewById(R.id.three_topthree_one_notposition);
		three_topthree_two_notposition = (TextView) findViewById(R.id.three_topthree_two_notposition);
		four_bottomfour_two_notposition = (TextView) findViewById(R.id.four_bottomfour_two_notposition);
		five_bottomfive_two_notposition = (TextView) findViewById(R.id.five_bottomfive_two_notposition);
		five_bottomfive_three_notposition = (TextView) findViewById(R.id.five_bottomfive_three_notposition);
		two_group_toptwo_sum = (TextView) findViewById(R.id.two_group_toptwo_sum);
		four_group_6 = (TextView) findViewById(R.id.four_group_6);
		four_group_4 = (TextView) findViewById(R.id.four_group_4);
		bottomthree_direct_sum = (TextView) findViewById(R.id.bottomthree_direct_sum);
		topthree_direct_sum = (TextView) findViewById(R.id.topthree_direct_sum);
		topthree_direct_span = (TextView) findViewById(R.id.topthree_direct_span);
		topthree_sum_end = (TextView) findViewById(R.id.topthree_sum_end);
		bottomthree_sum_end = (TextView) findViewById(R.id.bottomthree_sum_end);
		two_direct_toptwo_sum = (TextView) findViewById(R.id.two_direct_toptwo_sum);
		two_group_toptwo_container = (TextView) findViewById(R.id.two_group_toptwo_container);
		two_group_bottomtwo_container = (TextView) findViewById(R.id.two_group_bottomtwo_container);
		two_group_bottomtwo_sum = (TextView) findViewById(R.id.two_group_bottomtwo_sum);
		four_bottomfour_one_notposition = (TextView) findViewById(R.id.four_bottomfour_one_notposition);
		maxmin_bottomtwo = (TextView) findViewById(R.id.maxmin_bottomtwo);
		maxmin_bottomthree = (TextView) findViewById(R.id.maxmin_bottomthree);
		maxmin_toptwo = (TextView) findViewById(R.id.maxmin_toptwo);
		maxmin_topthree = (TextView) findViewById(R.id.maxmin_topthree);
		base_tickettype = (TextView) findViewById(R.id.base_tickettype);
		btn_menu1 = (Button) findViewById(R.id.btn_menu1);
		btn_menu2 = (Button) findViewById(R.id.btn_menu2);
		btn_menu3 = (Button) findViewById(R.id.btn_menu3);
		btn_menu4 = (Button) findViewById(R.id.btn_menu4);
		btn_menu5 = (Button) findViewById(R.id.btn_menu5);
		// a_layout = findViewById(R.id.a_layout);
		// b_layout = findViewById(R.id.b_layout);
		// a_layout.setOnClickListener(this);
		// b_layout.setOnClickListener(this);
		five_direct_single.setOnClickListener(this);
		four_direct_single.setOnClickListener(this);
		topthree_group_three_single.setOnClickListener(this);
		topthree_group_six_single.setOnClickListener(this);
		topthree_direct_single.setOnClickListener(this);
		bottomthree_direct_single.setOnClickListener(this);
		bottompthree_group_three_single.setOnClickListener(this);
		bottompthree_group_six_single.setOnClickListener(this);
		two_direct_toptwo_single.setOnClickListener(this);
		two_group_toptwo_single.setOnClickListener(this);
		two_group_bottomtwo_single.setOnClickListener(this);
		two_direct_bottomtwo_single.setOnClickListener(this);
		topthree_mix_group.setOnClickListener(this);
		bottompthree_mix_group.setOnClickListener(this);
		// 到此为止
		LinearLayout_ticket_rule.setOnClickListener(this);
		five_direct_double.setOnClickListener(this);
		five_group_120.setOnClickListener(this);
		five_group_60.setOnClickListener(this);
		five_group_30.setOnClickListener(this);
		five_group_20.setOnClickListener(this);
		five_group_10.setOnClickListener(this);
		five_group_5.setOnClickListener(this);
		four_direct_double.setOnClickListener(this);
		four_group_24.setOnClickListener(this);
		four_group_12.setOnClickListener(this);
		topthree_direct_double.setOnClickListener(this);
		topthree_group_three.setOnClickListener(this);
		topthree_group_six.setOnClickListener(this);
		topthree_group_sum.setOnClickListener(this);
		topthree_group_container.setOnClickListener(this);
		bottomthree_direct_double.setOnClickListener(this);
		bottomthree_group_span.setOnClickListener(this);
		bottomthree_group_three.setOnClickListener(this);
		bottomthree_group_six.setOnClickListener(this);
		bottomthree_group_sum.setOnClickListener(this);
		bottomthree_group_container.setOnClickListener(this);
		two_direct_bottomtwo_double.setOnClickListener(this);
		two_direct_bottomtwo_sum.setOnClickListener(this);
		two_direct_bottomtwo_span.setOnClickListener(this);
		two_direct_toptwo_double.setOnClickListener(this);
		two_direct_toptwo_span.setOnClickListener(this);
		two_group_bottomtwo_double.setOnClickListener(this);
		two_group_toptwo_double.setOnClickListener(this);
		fixed_position.setOnClickListener(this);
		three_bottomthree_one_notposition.setOnClickListener(this);
		three_bottomthree_two_notposition.setOnClickListener(this);
		three_topthree_one_notposition.setOnClickListener(this);
		three_topthree_two_notposition.setOnClickListener(this);
		four_bottomfour_two_notposition.setOnClickListener(this);
		five_bottomfive_two_notposition.setOnClickListener(this);
		five_bottomfive_three_notposition.setOnClickListener(this);
		two_group_toptwo_sum.setOnClickListener(this);
		four_group_6.setOnClickListener(this);
		four_group_4.setOnClickListener(this);
		bottomthree_direct_sum.setOnClickListener(this);
		topthree_direct_sum.setOnClickListener(this);
		topthree_direct_span.setOnClickListener(this);
		topthree_sum_end.setOnClickListener(this);
		bottomthree_sum_end.setOnClickListener(this);
		two_direct_toptwo_sum.setOnClickListener(this);
		two_group_toptwo_container.setOnClickListener(this);
		two_group_bottomtwo_container.setOnClickListener(this);
		two_group_bottomtwo_sum.setOnClickListener(this);
		four_bottomfour_one_notposition.setOnClickListener(this);
		maxmin_bottomtwo.setOnClickListener(this);
		maxmin_bottomthree.setOnClickListener(this);
		maxmin_toptwo.setOnClickListener(this);
		maxmin_topthree.setOnClickListener(this);
		btn_menu1.setOnClickListener(this);
		btn_menu2.setOnClickListener(this);
		btn_menu3.setOnClickListener(this);
		btn_menu4.setOnClickListener(this);
		btn_menu5.setOnClickListener(this);
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
				Intent intent = new Intent(BaseActivityticket.this, numberbasket.class);
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
			showloading();
			number = 0;
			showresult("");
			changefivetext(btn_menu1_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();
			packupbtn();
			tran_sur.setVisibility(View.GONE);
			endloading();
			break;
		case R.id.btn_menu2:
			showloading();
			number = 0;
			showresult("");
			changefivetext(btn_menu2_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();

			packupbtn();
			tran_sur.setVisibility(View.GONE);
			endloading();
			break;
		case R.id.btn_menu3:
			showloading();
			number = 0;
			showresult("");
			changefivetext(btn_menu3_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();
			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.btn_menu4:
			showloading();
			number = 0;
			showresult("");
			changefivetext(btn_menu4_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();
			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.btn_menu5:
			showloading();
			number = 0;
			showresult("");
			changefivetext(btn_menu5_int);
			changesetTabSelection(btn_menu1_int);
			showfivetype();

			packupbtn();
			tran_sur.setVisibility(View.GONE);
			break;
		case R.id.LinearLayout_ticket_rule:
			showloading();
			number = 0;
			showresult("");
			Intent intent = new Intent(BaseActivityticket.this, TicketruleActivity.class);
			// resultCode---请求码
			Bundle bundle = new Bundle(); // 创建Bundle对象
			bundle.putInt("tickettypecode", tickettypecode); // 装入数据
			intent.putExtras(bundle);
			startActivityForResult(intent, 1);
			break;
		case R.id.five_direct_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(1);
			changefivetext(1);
			showfivetype();
			changesetTabSelection(1);
			five_direct_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_direct_double);
			break;
		case R.id.five_group_120:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(2);
			changefivetext(2);
			showfivetype();
			five_group_120.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.five_group_60:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			changesetTabSelection(3);
			changefivetext(3);
			showfivetype();
			packupandslowdown();
			five_group_60.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_60);
			break;
		case R.id.five_group_30:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			changesetTabSelection(4);
			changefivetext(4);
			showfivetype();
			packupandslowdown();
			five_group_30.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_30);
			break;
		case R.id.five_group_20:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(5);
			changefivetext(5);
			showfivetype();
			five_group_20.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_20);
			break;
		case R.id.five_group_10:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(6);
			changefivetext(6);
			showfivetype();
			five_group_10.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_10);
			break;
		case R.id.five_group_5:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(7);
			changefivetext(7);
			showfivetype();
			five_group_5.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_5);
			break;
		case R.id.four_direct_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(8);
			changefivetext(8);
			showfivetype();
			four_direct_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.four_direct_double);
			break;
		case R.id.four_group_24:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(9);
			changefivetext(9);
			showfivetype();
			four_group_24.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.four_group_24);
			break;
		case R.id.four_group_12:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(10);
			changefivetext(10);
			showfivetype();
			four_group_12.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.four_group_12);
			break;
		case R.id.topthree_direct_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(11);
			changefivetext(11);
			showfivetype();
			topthree_direct_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.topthree_direct_double);
			break;
		case R.id.topthree_group_three:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(12);
			changefivetext(12);
			showfivetype();
			topthree_group_three.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.topthree_group_three);
			break;
		case R.id.topthree_group_six:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(13);
			changefivetext(13);
			showfivetype();
			topthree_group_six.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.topthree_group_six);
			break;
		case R.id.topthree_group_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(14);
			changefivetext(14);
			showfivetype();
			topthree_group_sum.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.topthree_group_sum);
			break;
		case R.id.topthree_group_container:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(15);
			changefivetext(15);
			showfivetype();
			topthree_group_container.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.topthree_group_container);
			break;
		case R.id.bottomthree_direct_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(16);
			changefivetext(16);
			showfivetype();
			bottomthree_direct_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.bottomthree_direct_double);
			break;
		case R.id.bottomthree_group_span:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(17);
			changefivetext(17);
			showfivetype();
			bottomthree_group_span.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.bottomthree_group_span);
			break;
		case R.id.bottomthree_group_three:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(18);
			changefivetext(18);
			showfivetype();
			bottomthree_group_three.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.bottomthree_group_three);
			break;
		case R.id.bottomthree_group_six:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(19);
			changefivetext(19);
			showfivetype();
			bottomthree_group_six.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.bottomthree_group_six);
			break;
		case R.id.bottomthree_group_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(20);
			changefivetext(20);
			showfivetype();
			bottomthree_group_sum.setBackgroundResource(R.drawable.small_editbg);
			// / clearbackground(R.id.bottomthree_group_sum);
			break;
		case R.id.bottomthree_group_container:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(21);
			changefivetext(21);
			showfivetype();
			bottomthree_group_container.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.bottomthree_group_container);
			break;
		case R.id.two_direct_bottomtwo_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(22);
			changefivetext(22);
			showfivetype();
			two_direct_bottomtwo_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.two_direct_bottomtwo_double);
			break;
		case R.id.two_direct_bottomtwo_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(23);
			changefivetext(23);
			showfivetype();
			two_direct_bottomtwo_sum.setBackgroundResource(R.drawable.small_editbg);
			// / clearbackground(R.id.two_direct_bottomtwo_sum);
			break;
		case R.id.two_direct_bottomtwo_span:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(24);
			changefivetext(24);
			showfivetype();
			two_direct_bottomtwo_span.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.two_direct_bottomtwo_span);
			break;
		case R.id.two_direct_toptwo_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(25);
			changefivetext(25);
			showfivetype();
			two_direct_toptwo_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.two_direct_toptwo_double);
			break;
		case R.id.two_direct_toptwo_span:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(26);
			changefivetext(26);
			showfivetype();
			two_direct_toptwo_span.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.two_direct_toptwo_span);
			break;
		case R.id.two_group_bottomtwo_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(27);
			changefivetext(27);
			showfivetype();
			two_group_bottomtwo_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.two_group_bottomtwo_double);
			break;
		case R.id.two_group_toptwo_double:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(28);
			changefivetext(28);
			showfivetype();
			two_group_toptwo_double.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.two_group_toptwo_double);
			break;
		case R.id.fixed_position:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(29);
			changefivetext(29);
			showfivetype();
			fixed_position.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.fixed_position);
			break;
		case R.id.three_bottomthree_one_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(30);
			changefivetext(30);
			showfivetype();
			three_bottomthree_one_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.three_bottomthree_one_notposition);
			break;
		case R.id.three_bottomthree_two_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(31);
			changefivetext(31);
			showfivetype();
			three_bottomthree_two_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.three_bottomthree_two_notposition);
			break;
		case R.id.three_topthree_one_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(32);
			changefivetext(32);
			showfivetype();
			three_topthree_one_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.three_topthree_one_notposition);
			break;
		case R.id.three_topthree_two_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(33);
			changefivetext(33);
			showfivetype();
			three_topthree_two_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.three_topthree_two_notposition);
			break;
		case R.id.four_bottomfour_two_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(34);
			changefivetext(34);
			showfivetype();
			four_bottomfour_two_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.four_bottomfour_two_notposition);
			break;
		case R.id.five_bottomfive_two_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(35);
			changefivetext(35);
			showfivetype();
			five_bottomfive_two_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_two_notposition);
			break;
		case R.id.five_bottomfive_three_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(36);
			changefivetext(36);
			showfivetype();
			five_bottomfive_three_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;

		case R.id.two_group_toptwo_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(37);
			changefivetext(37);
			showfivetype();
			two_group_toptwo_sum.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.four_group_6:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(38);
			changefivetext(38);
			showfivetype();
			four_group_6.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.four_group_4:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(39);
			changefivetext(39);
			showfivetype();
			four_group_4.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.bottomthree_direct_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(40);
			changefivetext(40);
			showfivetype();
			bottomthree_direct_sum.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.topthree_direct_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(41);
			changefivetext(41);
			showfivetype();
			topthree_direct_sum.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.topthree_direct_span:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(42);
			changefivetext(42);
			showfivetype();
			topthree_direct_span.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.topthree_sum_end:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(43);
			changefivetext(43);
			showfivetype();
			topthree_sum_end.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.bottomthree_sum_end:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(44);
			changefivetext(44);
			showfivetype();
			bottomthree_sum_end.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.two_direct_toptwo_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(45);
			changefivetext(45);
			showfivetype();
			two_direct_toptwo_sum.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.two_group_toptwo_container:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(46);
			changefivetext(46);
			showfivetype();
			two_group_toptwo_container.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.two_group_bottomtwo_container:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(47);
			changefivetext(47);
			showfivetype();
			Log.d("bkkhg", "fcdfd");
			two_group_bottomtwo_container.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.two_group_bottomtwo_sum:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(48);
			changefivetext(48);
			showfivetype();
			two_group_bottomtwo_sum.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.four_bottomfour_one_notposition:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(49);
			changefivetext(49);
			showfivetype();
			four_bottomfour_one_notposition.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.maxmin_bottomtwo:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(50);
			changefivetext(50);
			showfivetype();
			maxmin_bottomtwo.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.maxmin_bottomthree:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(51);
			changefivetext(51);
			showfivetype();
			maxmin_bottomthree.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.maxmin_toptwo:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(52);
			changefivetext(52);
			showfivetype();
			maxmin_toptwo.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.maxmin_topthree:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(53);
			changefivetext(53);
			showfivetype();
			maxmin_topthree.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_bottomfive_three_notposition);
			break;
		case R.id.five_direct_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(54);
			changefivetext(54);
			showfivetype();
			five_direct_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.four_direct_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(55);
			changefivetext(55);
			showfivetype();
			four_direct_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.topthree_group_three_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(56);
			changefivetext(56);
			showfivetype();
			topthree_group_three_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.topthree_group_six_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(57);
			changefivetext(57);
			showfivetype();
			topthree_group_six_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.topthree_direct_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(58);
			changefivetext(58);
			showfivetype();
			topthree_direct_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.bottomthree_direct_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(59);
			changefivetext(59);
			showfivetype();
			bottomthree_direct_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.bottompthree_group_three_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(60);
			changefivetext(60);
			showfivetype();
			bottompthree_group_three_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.bottompthree_group_six_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(61);
			changefivetext(61);
			showfivetype();
			bottompthree_group_six_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.two_direct_toptwo_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(62);
			changefivetext(62);
			showfivetype();
			two_direct_toptwo_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.two_group_toptwo_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(63);
			changefivetext(63);
			showfivetype();
			two_group_toptwo_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.two_group_bottomtwo_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(64);
			changefivetext(64);
			showfivetype();
			two_group_bottomtwo_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.two_direct_bottomtwo_single:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(65);
			changefivetext(65);
			showfivetype();
			two_direct_bottomtwo_single.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.topthree_mix_group:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(66);
			changefivetext(66);
			showfivetype();
			topthree_mix_group.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		case R.id.bottompthree_mix_group:
			showloading();
			number = 0;
			showresult("");
			clearbackground();
			packupandslowdown();
			changesetTabSelection(67);
			changefivetext(67);
			showfivetype();
			bottompthree_mix_group.setBackgroundResource(R.drawable.small_editbg);
			// clearbackground(R.id.five_group_120);
			break;
		//
		// case R.id.a_layout:
		// // 褰撶偣鍑讳簡娑堟伅tab鏃讹紝閫変腑绗?1涓猼ab
		// Log.d("TAG", "a");
		// setTabSelection(getString(R.string.five_direct_double_name));
		// Log.d("TAG", "aa");
		// break;
		// case R.id.b_layout:
		// Log.d("TAG", "b");
		//
		// // 褰撶偣鍑讳簡鑱旂郴浜簍ab鏃讹紝閫変腑绗?2涓猼ab
		// setTabSelection(getString(R.string.five_group_120_name));
		// Log.d("TAG", "bb");
		// break;
		default:
			break;
		}
	}

	public void getresultint(int result) {
		number = result;

	}

	public void showresult(String result) {
		numberresult = result;
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
		}

	}

	private void changesetTabSelection(int i) {
		// TODO Auto-generated method stub
		if (i == 1)

		{
			setTabSelection(getString(R.string.five_direct_double_name));
		}
		if (i == 2)

		{
			setTabSelection(getString(R.string.five_group_120_name));
		}
		if (i == 3)

		{
			setTabSelection(getString(R.string.five_group_60_name));
		}
		if (i == 4)

		{
			setTabSelection(getString(R.string.five_group_30_name));
		}
		if (i == 5)

		{
			setTabSelection(getString(R.string.five_group_20_name));
		}
		if (i == 6)

		{
			setTabSelection(getString(R.string.five_group_10_name));
		}
		if (i == 7)

		{
			setTabSelection(getString(R.string.five_group_5_name));
		}
		if (i == 8)

		{
			setTabSelection(getString(R.string.four_direct_double_name));
		}
		if (i == 9)

		{
			setTabSelection(getString(R.string.four_group_24_name));
		}
		if (i == 10)

		{
			setTabSelection(getString(R.string.four_group_12_name));
		}
		if (i == 11)

		{
			setTabSelection(getString(R.string.topthree_direct_double_name));
		}
		if (i == 12)

		{
			setTabSelection(getString(R.string.topthree_group_three_name));
		}
		if (i == 13)

		{
			setTabSelection(getString(R.string.topthree_group_six_name));
		}
		if (i == 14)

		{
			setTabSelection(getString(R.string.topthree_group_sum_name));
		}
		if (i == 15)

		{
			setTabSelection(getString(R.string.topthree_group_container_name));
		}
		if (i == 16)

		{
			setTabSelection(getString(R.string.bottomthree_direct_double_name));
		}
		if (i == 17)

		{
			setTabSelection(getString(R.string.bottomthree_group_span_name));
		}
		if (i == 18)

		{
			setTabSelection(getString(R.string.bottomthree_group_three_name));
		}
		if (i == 19)

		{
			setTabSelection(getString(R.string.bottomthree_group_six_name));
		}
		if (i == 20)

		{
			setTabSelection(getString(R.string.bottomthree_group_sum_name));
		}
		if (i == 21)

		{
			setTabSelection(getString(R.string.bottomthree_group_container_name));
		}
		if (i == 22)

		{
			setTabSelection(getString(R.string.two_direct_bottomtwo_double_name));
		}
		if (i == 23)

		{
			setTabSelection(getString(R.string.two_direct_bottomtwo_sum_name));
		}
		if (i == 24)

		{
			setTabSelection(getString(R.string.two_direct_bottomtwo_span_name));
		}
		if (i == 25)

		{
			setTabSelection(getString(R.string.two_direct_toptwo_double_name));
		}
		if (i == 26)

		{
			setTabSelection(getString(R.string.two_direct_toptwo_span_name));
		}
		if (i == 27)

		{
			setTabSelection(getString(R.string.two_group_bottomtwo_double_name));
		}
		if (i == 28)

		{
			setTabSelection(getString(R.string.two_group_toptwo_double_name));
		}
		if (i == 29)

		{
			setTabSelection(getString(R.string.fixed_position_name));
		}
		if (i == 30)

		{
			setTabSelection(getString(R.string.three_bottomthree_one_notposition_name));
		}
		if (i == 31)

		{
			setTabSelection(getString(R.string.three_bottomthree_two_notposition_name));
		}
		if (i == 32)

		{
			setTabSelection(getString(R.string.three_topthree_one_notposition_name));
		}
		if (i == 33)

		{
			setTabSelection(getString(R.string.three_topthree_two_notposition_name));
		}
		if (i == 34)

		{
			setTabSelection(getString(R.string.four_bottomfour_two_notposition_name));
		}
		if (i == 35)

		{
			setTabSelection(getString(R.string.five_bottomfive_two_notposition_name));
		}
		if (i == 36)

		{
			setTabSelection(getString(R.string.five_bottomfive_three_notposition_name));
		}
		if (i == 37)

		{
			setTabSelection(getString(R.string.two_group_toptwo_sum_name));
		}
		if (i == 38)

		{
			setTabSelection(getString(R.string.four_group_6_name));
		}
		if (i == 39)

		{
			setTabSelection(getString(R.string.four_group_4_name));
		}
		if (i == 40)

		{
			setTabSelection(getString(R.string.bottomthree_direct_sum_name));
		}
		if (i == 41)

		{
			setTabSelection(getString(R.string.topthree_direct_sum_name));
		}
		if (i == 42)

		{
			setTabSelection(getString(R.string.topthree_direct_span_name));
		}
		if (i == 43)

		{
			setTabSelection(getString(R.string.topthree_sum_end_name));
		}
		if (i == 44)

		{
			setTabSelection(getString(R.string.bottomthree_sum_end_name));
		}
		if (i == 45)

		{
			setTabSelection(getString(R.string.two_direct_toptwo_sum_name));
		}
		if (i == 46)

		{
			setTabSelection(getString(R.string.two_group_toptwo_container_name));
		}
		if (i == 47)

		{
			setTabSelection(getString(R.string.two_group_bottomtwo_container_name));
		}
		if (i == 48)

		{
			setTabSelection(getString(R.string.two_group_bottomtwo_sum_name));
		}
		if (i == 49)

		{
			setTabSelection(getString(R.string.four_bottomfour_one_notposition_name));
		}
		if (i == 50)

		{
			setTabSelection(getString(R.string.maxmin_bottomtwo_name));
		}
		if (i == 51)

		{
			setTabSelection(getString(R.string.maxmin_bottomthree_name));
		}
		if (i == 52)

		{
			setTabSelection(getString(R.string.maxmin_toptwo_name));
		}
		if (i == 53)

		{
			setTabSelection(getString(R.string.maxmin_topthree_name));
		}
		if (i == 54)

		{
			setTabSelection(getString(R.string.five_direct_single_name));
		}
		if (i == 55)

		{
			setTabSelection(getString(R.string.four_direct_single_name));
		}
		if (i == 56)

		{
			setTabSelection(getString(R.string.topthree_group_three_single_name));
		}
		if (i == 57)

		{
			setTabSelection(getString(R.string.topthree_group_six_single_name));
		}
		if (i == 58)

		{
			setTabSelection(getString(R.string.topthree_direct_single_name));
		}
		if (i == 59)

		{
			setTabSelection(getString(R.string.bottomthree_direct_single_name));
		}
		if (i == 60)

		{
			setTabSelection(getString(R.string.bottompthree_group_three_single_name));
		}
		if (i == 61)

		{
			setTabSelection(getString(R.string.bottompthree_group_six_single_name));
		}
		if (i == 62)

		{
			setTabSelection(getString(R.string.two_direct_toptwo_single_name));
		}
		if (i == 63)

		{
			setTabSelection(getString(R.string.two_group_toptwo_single_name));
		}
		if (i == 64)

		{
			setTabSelection(getString(R.string.two_group_bottomtwo_single_name));
		}
		if (i == 65)

		{
			setTabSelection(getString(R.string.two_direct_bottomtwo_single_name));
		}
		if (i == 66)

		{
			setTabSelection(getString(R.string.topthree_mix_group_name));
		}
		if (i == 67)

		{
			setTabSelection(getString(R.string.bottompthree_mix_group_name));
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
		five_direct_single.setBackgroundResource(0);
		four_direct_single.setBackgroundResource(0);
		topthree_group_three_single.setBackgroundResource(0);
		topthree_group_six_single.setBackgroundResource(0);
		topthree_direct_single.setBackgroundResource(0);
		bottomthree_direct_single.setBackgroundResource(0);
		bottompthree_group_three_single.setBackgroundResource(0);
		bottompthree_group_six_single.setBackgroundResource(0);
		two_direct_toptwo_single.setBackgroundResource(0);
		two_group_toptwo_single.setBackgroundResource(0);
		two_group_bottomtwo_single.setBackgroundResource(0);
		two_direct_bottomtwo_single.setBackgroundResource(0);
		topthree_mix_group.setBackgroundResource(0);
		bottompthree_mix_group.setBackgroundResource(0);
		five_direct_double.setBackgroundResource(0);
		five_group_120.setBackgroundResource(0);
		five_group_60.setBackgroundResource(0);
		five_group_30.setBackgroundResource(0);
		five_group_20.setBackgroundResource(0);
		five_group_10.setBackgroundResource(0);
		five_group_5.setBackgroundResource(0);
		four_direct_double.setBackgroundResource(0);
		four_group_24.setBackgroundResource(0);
		four_group_12.setBackgroundResource(0);
		topthree_direct_double.setBackgroundResource(0);
		topthree_group_three.setBackgroundResource(0);
		topthree_group_six.setBackgroundResource(0);
		topthree_group_sum.setBackgroundResource(0);
		topthree_group_container.setBackgroundResource(0);
		bottomthree_direct_double.setBackgroundResource(0);
		bottomthree_group_span.setBackgroundResource(0);
		bottomthree_group_three.setBackgroundResource(0);
		bottomthree_group_six.setBackgroundResource(0);
		bottomthree_group_sum.setBackgroundResource(0);
		bottomthree_group_container.setBackgroundResource(0);
		two_direct_bottomtwo_double.setBackgroundResource(0);
		two_direct_bottomtwo_sum.setBackgroundResource(0);
		two_direct_bottomtwo_span.setBackgroundResource(0);
		two_direct_toptwo_double.setBackgroundResource(0);
		two_direct_toptwo_span.setBackgroundResource(0);
		two_group_bottomtwo_double.setBackgroundResource(0);
		two_group_toptwo_double.setBackgroundResource(0);
		fixed_position.setBackgroundResource(0);
		three_bottomthree_one_notposition.setBackgroundResource(0);
		three_bottomthree_two_notposition.setBackgroundResource(0);
		three_topthree_one_notposition.setBackgroundResource(0);
		three_topthree_two_notposition.setBackgroundResource(0);
		four_bottomfour_two_notposition.setBackgroundResource(0);
		five_bottomfive_two_notposition.setBackgroundResource(0);
		five_bottomfive_three_notposition.setBackgroundResource(0);
		two_group_toptwo_sum.setBackgroundResource(0);
		four_group_6.setBackgroundResource(0);
		four_group_4.setBackgroundResource(0);
		bottomthree_direct_sum.setBackgroundResource(0);
		topthree_direct_sum.setBackgroundResource(0);
		topthree_direct_span.setBackgroundResource(0);
		topthree_sum_end.setBackgroundResource(0);
		bottomthree_sum_end.setBackgroundResource(0);
		two_direct_toptwo_sum.setBackgroundResource(0);
		two_group_toptwo_container.setBackgroundResource(0);
		two_group_bottomtwo_container.setBackgroundResource(0);
		two_group_bottomtwo_sum.setBackgroundResource(0);
		four_bottomfour_one_notposition.setBackgroundResource(0);
		maxmin_bottomtwo.setBackgroundResource(0);
		maxmin_bottomthree.setBackgroundResource(0);
		maxmin_toptwo.setBackgroundResource(0);
		maxmin_topthree.setBackgroundResource(0);
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
			if (Fivedirectdouble == null) {
				Fivedirectdouble = new Fivedirectdouble();
				mFragmentTransaction.add(R.id.content, Fivedirectdouble, getString(R.string.five_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_direct_double_name);

		} else if (btn_menu1_int == 2) {
			write(2);
			if (Fivegroup120 == null) {
				Fivegroup120 = new Fivegroup120();
				mFragmentTransaction.add(R.id.content, Fivegroup120, getString(R.string.five_group_120_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_group_120_name);
		} else if (btn_menu1_int == 3) {
			write(3);
			if (Fivegroup60 == null) {
				Fivegroup60 = new Fivegroup60();
				mFragmentTransaction.add(R.id.content, Fivegroup60, getString(R.string.five_group_60_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_group_60_name);
		} else if (btn_menu1_int == 4) {
			write(4);
			if (Fivegroup30 == null) {
				Fivegroup30 = new Fivegroup30();
				mFragmentTransaction.add(R.id.content, Fivegroup30, getString(R.string.five_group_30_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_group_30_name);
		} else if (btn_menu1_int == 5) {
			write(5);
			if (Fivegroup20 == null) {
				Fivegroup20 = new Fivegroup20();
				mFragmentTransaction.add(R.id.content, Fivegroup20, getString(R.string.five_group_20_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_group_20_name);
		} else if (btn_menu1_int == 6) {
			write(6);
			if (Fivegroup10 == null) {
				Fivegroup10 = new Fivegroup10();
				mFragmentTransaction.add(R.id.content, Fivegroup10, getString(R.string.five_group_10_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_group_10_name);
		} else if (btn_menu1_int == 7) {
			write(7);
			if (Fivegroup5 == null) {
				Fivegroup5 = new Fivegroup5();
				mFragmentTransaction.add(R.id.content, Fivegroup5, getString(R.string.five_group_5_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_group_5_name);
		} else if (btn_menu1_int == 8) {
			write(8);
			if (Fourdirectdouble == null) {
				Fourdirectdouble = new Fourdirectdouble();
				mFragmentTransaction.add(R.id.content, Fourdirectdouble, getString(R.string.four_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_direct_double_name);
		} else if (btn_menu1_int == 9) {
			write(9);
			if (Fourgroup24 == null) {
				Fourgroup24 = new Fourgroup24();
				mFragmentTransaction.add(R.id.content, Fourgroup24, getString(R.string.four_group_24_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_group_24_name);
		} else if (btn_menu1_int == 10) {
			write(10);
			if (Fourgroup12 == null) {
				Fourgroup12 = new Fourgroup12();
				mFragmentTransaction.add(R.id.content, Fourgroup12, getString(R.string.four_group_12_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_group_12_name);
		} else if (btn_menu1_int == 11) {
			write(11);
			if (Topthreedirectdouble == null) {
				Topthreedirectdouble = new Topthreedirectdouble();
				mFragmentTransaction.add(R.id.content, Topthreedirectdouble,
						getString(R.string.topthree_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_direct_double_name);
		} else if (btn_menu1_int == 12) {
			write(12);
			if (Topthreegroup3 == null) {
				Topthreegroup3 = new Topthreegroup3();
				mFragmentTransaction.add(R.id.content, Topthreegroup3, getString(R.string.topthree_group_three_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_group_three_name);
		} else if (btn_menu1_int == 13) {
			write(13);
			if (Topthreegroup6 == null) {
				Topthreegroup6 = new Topthreegroup6();
				mFragmentTransaction.add(R.id.content, Topthreegroup6, getString(R.string.topthree_group_six_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_group_six_name);
		} else if (btn_menu1_int == 14) {
			write(14);
			if (Topthreegroupsum == null) {
				Topthreegroupsum = new Topthreegroupsum();
				mFragmentTransaction.add(R.id.content, Topthreegroupsum, getString(R.string.topthree_group_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_group_sum_name);
		} else if (btn_menu1_int == 15) {
			write(15);
			if (Topthreegroupcontainer == null) {
				Topthreegroupcontainer = new Topthreegroupcontainer();
				mFragmentTransaction.add(R.id.content, Topthreegroupcontainer,
						getString(R.string.topthree_group_container_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_group_container_name);
		} else if (btn_menu1_int == 16) {
			write(16);
			if (Bottomthreedirectdouble == null) {
				Bottomthreedirectdouble = new Bottomthreedirectdouble();
				mFragmentTransaction.add(R.id.content, Bottomthreedirectdouble,
						getString(R.string.bottomthree_direct_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_direct_double_name);
		} else if (btn_menu1_int == 17) {
			write(17);
			if (Bottomthreedirectspan == null) {
				Bottomthreedirectspan = new Bottomthreedirectspan();
				mFragmentTransaction.add(R.id.content, Bottomthreedirectspan,
						getString(R.string.bottomthree_group_span_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_group_span_name);
		} else if (btn_menu1_int == 18) {
			write(18);
			if (Bottomthreegroup3 == null) {
				Bottomthreegroup3 = new Bottomthreegroup3();
				mFragmentTransaction.add(R.id.content, Bottomthreegroup3,
						getString(R.string.bottomthree_group_three_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_group_three_name);
		} else if (btn_menu1_int == 19) {
			write(19);
			if (Bottomthreegroup6 == null) {
				Bottomthreegroup6 = new Bottomthreegroup6();
				mFragmentTransaction.add(R.id.content, Bottomthreegroup6,
						getString(R.string.bottomthree_group_six_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_group_six_name);
		} else if (btn_menu1_int == 20) {
			write(20);
			if (Bottomthreegroupsum == null) {
				Bottomthreegroupsum = new Bottomthreegroupsum();
				mFragmentTransaction.add(R.id.content, Bottomthreegroupsum,
						getString(R.string.bottomthree_group_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_group_sum_name);
		} else if (btn_menu1_int == 21) {
			write(21);
			if (Bottomthreegroupcontainer == null) {
				Bottomthreegroupcontainer = new Bottomthreegroupcontainer();
				mFragmentTransaction.add(R.id.content, Bottomthreegroupcontainer,
						getString(R.string.bottomthree_group_container_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_group_container_name);
		} else if (btn_menu1_int == 22) {
			write(22);
			if (Twodirectbottomtwodouble == null) {
				Twodirectbottomtwodouble = new Twodirectbottomtwodouble();
				mFragmentTransaction.add(R.id.content, Twodirectbottomtwodouble,
						getString(R.string.two_direct_bottomtwo_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_bottomtwo_double_name);
		} else if (btn_menu1_int == 23) {
			write(23);
			if (Twodirectbottomtwosum == null) {
				Twodirectbottomtwosum = new Twodirectbottomtwosum();
				mFragmentTransaction.add(R.id.content, Twodirectbottomtwosum,
						getString(R.string.two_direct_bottomtwo_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_bottomtwo_sum_name);
		} else if (btn_menu1_int == 24) {
			write(24);
			if (Twodirectbottomtwospan == null) {
				Twodirectbottomtwospan = new Twodirectbottomtwospan();
				mFragmentTransaction.add(R.id.content, Twodirectbottomtwospan,
						getString(R.string.two_direct_bottomtwo_span_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_bottomtwo_span_name);
		} else if (btn_menu1_int == 25) {
			write(25);
			if (Twodirecttoptwodouble == null) {
				Twodirecttoptwodouble = new Twodirecttoptwodouble();
				mFragmentTransaction.add(R.id.content, Twodirecttoptwodouble,
						getString(R.string.two_direct_toptwo_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_toptwo_double_name);
		} else if (btn_menu1_int == 26) {
			write(26);
			if (Twodirecttoptwospan == null) {
				Twodirecttoptwospan = new Twodirecttoptwospan();
				mFragmentTransaction.add(R.id.content, Twodirecttoptwospan,
						getString(R.string.two_direct_toptwo_span_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_toptwo_span_name);
		} else if (btn_menu1_int == 27) {
			write(27);
			if (Twogroupbottomtwodouble == null) {
				Twogroupbottomtwodouble = new Twogroupbottomtwodouble();
				mFragmentTransaction.add(R.id.content, Twogroupbottomtwodouble,
						getString(R.string.two_group_bottomtwo_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_bottomtwo_double_name);
		} else if (btn_menu1_int == 28) {
			write(28);
			if (Twogrouptoptwodouble == null) {
				Twogrouptoptwodouble = new Twogrouptoptwodouble();
				mFragmentTransaction.add(R.id.content, Twogrouptoptwodouble,
						getString(R.string.two_group_toptwo_double_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_toptwo_double_name);
		} else if (btn_menu1_int == 29) {
			write(29);
			if (Fixedposition == null) {
				Fixedposition = new Fixedposition();
				mFragmentTransaction.add(R.id.content, Fixedposition, getString(R.string.fixed_position_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.fixed_position_name);
		} else if (btn_menu1_int == 30) {
			write(30);
			if (Threebottomthreeonenotposition == null) {
				Threebottomthreeonenotposition = new Threebottomthreeonenotposition();
				mFragmentTransaction.add(R.id.content, Threebottomthreeonenotposition,
						getString(R.string.three_bottomthree_one_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_bottomthree_one_notposition_name);
		} else if (btn_menu1_int == 31) {
			write(31);
			if (Threebottomthreetwonotposition == null) {
				Threebottomthreetwonotposition = new Threebottomthreetwonotposition();
				mFragmentTransaction.add(R.id.content, Threebottomthreetwonotposition,
						getString(R.string.three_bottomthree_two_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_bottomthree_two_notposition_name);
		} else if (btn_menu1_int == 32) {
			write(32);
			if (Threetopthreeonenotposition == null) {
				Threetopthreeonenotposition = new Threetopthreeonenotposition();
				mFragmentTransaction.add(R.id.content, Threetopthreeonenotposition,
						getString(R.string.three_topthree_one_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_topthree_one_notposition_name);
		} else if (btn_menu1_int == 33) {
			write(33);
			if (Threetopthreetwonotposition == null) {
				Threetopthreetwonotposition = new Threetopthreetwonotposition();
				mFragmentTransaction.add(R.id.content, Threetopthreetwonotposition,
						getString(R.string.three_topthree_two_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.three_topthree_two_notposition_name);
		} else if (btn_menu1_int == 34) {
			write(34);
			if (Fourbottomfourtwonotposition == null) {
				Fourbottomfourtwonotposition = new Fourbottomfourtwonotposition();
				mFragmentTransaction.add(R.id.content, Fourbottomfourtwonotposition,
						getString(R.string.four_bottomfour_two_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_bottomfour_two_notposition_name);
		} else if (btn_menu1_int == 35) {
			write(35);
			if (Fivebottomfivetwonotposition == null) {
				Fivebottomfivetwonotposition = new Fivebottomfivetwonotposition();
				mFragmentTransaction.add(R.id.content, Fivebottomfivetwonotposition,
						getString(R.string.five_bottomfive_two_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_bottomfive_two_notposition_name);
		} else if (btn_menu1_int == 36) {
			write(36);
			if (Fivebottomfivethreenotposition == null) {
				Fivebottomfivethreenotposition = new Fivebottomfivethreenotposition();
				mFragmentTransaction.add(R.id.content, Fivebottomfivethreenotposition,
						getString(R.string.five_bottomfive_three_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_bottomfive_three_notposition_name);
		} else if (btn_menu1_int == 37) {
			write(37);
			if (Twogrouptoptwosum == null) {
				Twogrouptoptwosum = new Twogrouptoptwosum();
				mFragmentTransaction.add(R.id.content, Twogrouptoptwosum,
						getString(R.string.two_group_toptwo_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_toptwo_sum_name);
		} else if (btn_menu1_int == 38) {
			write(38);
			if (Fourgroup6 == null) {
				Fourgroup6 = new Fourgroup6();
				mFragmentTransaction.add(R.id.content, Fourgroup6, getString(R.string.four_group_6_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_group_6_name);
		} else if (btn_menu1_int == 39) {
			write(39);
			if (Fourgroup4 == null) {
				Fourgroup4 = new Fourgroup4();
				mFragmentTransaction.add(R.id.content, Fourgroup4, getString(R.string.four_group_4_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_group_4_name);
		} else if (btn_menu1_int == 40) {
			write(40);
			if (Bottomthreedirectsum == null) {
				Bottomthreedirectsum = new Bottomthreedirectsum();
				mFragmentTransaction.add(R.id.content, Bottomthreedirectsum,
						getString(R.string.bottomthree_direct_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_direct_sum_name);
		} else if (btn_menu1_int == 41) {
			write(41);
			if (Topthreedirectsum == null) {
				Topthreedirectsum = new Topthreedirectsum();
				mFragmentTransaction.add(R.id.content, Topthreedirectsum, getString(R.string.topthree_direct_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_direct_sum_name);
		} else if (btn_menu1_int == 42) {
			write(42);
			if (Topthreedirectspan == null) {
				Topthreedirectspan = new Topthreedirectspan();
				mFragmentTransaction.add(R.id.content, Topthreedirectspan,
						getString(R.string.topthree_direct_span_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_direct_span_name);
		} else if (btn_menu1_int == 43) {
			write(43);
			if (Topthreesumend == null) {
				Topthreesumend = new Topthreesumend();
				mFragmentTransaction.add(R.id.content, Topthreesumend, getString(R.string.topthree_sum_end_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_sum_end_name);
		} else if (btn_menu1_int == 44) {
			write(44);
			if (Bottomthreesumend == null) {
				Bottomthreesumend = new Bottomthreesumend();
				mFragmentTransaction.add(R.id.content, Bottomthreesumend, getString(R.string.bottomthree_sum_end_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_sum_end_name);
		} else if (btn_menu1_int == 45) {
			write(45);
			if (Twodirecttoptwosum == null) {
				Twodirecttoptwosum = new Twodirecttoptwosum();
				mFragmentTransaction.add(R.id.content, Twodirecttoptwosum,
						getString(R.string.two_direct_toptwo_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_toptwo_sum_name);
		} else if (btn_menu1_int == 46) {
			write(46);
			if (Twogrouptoptwocontainer == null) {
				Twogrouptoptwocontainer = new Twogrouptoptwocontainer();
				mFragmentTransaction.add(R.id.content, Twogrouptoptwocontainer,
						getString(R.string.two_group_toptwo_container_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_toptwo_container_name);
		} else if (btn_menu1_int == 47) {
			write(47);
			if (Twogroupbottomtwocontainer == null) {
				Twogroupbottomtwocontainer = new Twogroupbottomtwocontainer();
				mFragmentTransaction.add(R.id.content, Twogroupbottomtwocontainer,
						getString(R.string.two_group_bottomtwo_container_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_bottomtwo_container_name);
		} else if (btn_menu1_int == 48) {
			write(48);
			if (Twogroupbottomtwosum == null) {
				Twogroupbottomtwosum = new Twogroupbottomtwosum();
				mFragmentTransaction.add(R.id.content, Twogroupbottomtwosum,
						getString(R.string.two_group_bottomtwo_sum_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_bottomtwo_sum_name);
		} else if (btn_menu1_int == 49) {
			write(49);
			if (Fourbottomfouronenotposition == null) {
				Fourbottomfouronenotposition = new Fourbottomfouronenotposition();
				mFragmentTransaction.add(R.id.content, Fourbottomfouronenotposition,
						getString(R.string.four_bottomfour_one_notposition_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_bottomfour_one_notposition_name);
		} else if (btn_menu1_int == 50) {
			write(50);
			if (Maxminbottomtwo == null) {
				Maxminbottomtwo = new Maxminbottomtwo();
				mFragmentTransaction.add(R.id.content, Maxminbottomtwo, getString(R.string.maxmin_bottomtwo_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.maxmin_bottomtwo_name);
		} else if (btn_menu1_int == 51) {
			write(51);
			if (Maxminbottomthree == null) {
				Maxminbottomthree = new Maxminbottomthree();
				mFragmentTransaction.add(R.id.content, Maxminbottomthree, getString(R.string.maxmin_bottomthree_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.maxmin_bottomthree_name);
		} else if (btn_menu1_int == 52) {
			write(52);
			if (Maxmintoptwo == null) {
				Maxmintoptwo = new Maxmintoptwo();
				mFragmentTransaction.add(R.id.content, Maxmintoptwo, getString(R.string.maxmin_toptwo_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.maxmin_toptwo_name);
		} else if (btn_menu1_int == 53) {
			write(53);
			if (Maxmintopthree == null) {
				Maxmintopthree = new Maxmintopthree();
				mFragmentTransaction.add(R.id.content, Maxmintopthree, getString(R.string.maxmin_topthree_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.maxmin_topthree_name);
		} else if (btn_menu1_int == 54) {
			write(54);
			if (Fivedirectsingle == null) {
				Fivedirectsingle = new Fivedirectsingle();
				mFragmentTransaction.add(R.id.content, Fivedirectsingle, getString(R.string.five_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.five_direct_single_name);
		} else if (btn_menu1_int == 55) {
			write(55);
			if (Fourdirectsingle == null) {
				Fourdirectsingle = new Fourdirectsingle();
				mFragmentTransaction.add(R.id.content, Fourdirectsingle, getString(R.string.four_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.four_direct_single_name);
		} else if (btn_menu1_int == 56) {
			write(56);
			if (Topthreegroupthreesingle == null) {
				Topthreegroupthreesingle = new Topthreegroupthreesingle();
				mFragmentTransaction.add(R.id.content, Topthreegroupthreesingle,
						getString(R.string.topthree_group_three_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_group_three_single_name);
		} else if (btn_menu1_int == 57) {
			write(57);
			if (Topthreegroupsixsingle == null) {
				Topthreegroupsixsingle = new Topthreegroupsixsingle();
				mFragmentTransaction.add(R.id.content, Topthreegroupsixsingle,
						getString(R.string.topthree_group_six_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_group_six_single_name);
		} else if (btn_menu1_int == 58) {
			write(58);
			if (Topthreedirectsingle == null) {
				Topthreedirectsingle = new Topthreedirectsingle();
				mFragmentTransaction.add(R.id.content, Topthreedirectsingle,
						getString(R.string.topthree_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_direct_single_name);
		} else if (btn_menu1_int == 59) {
			write(59);
			if (Bottomthreedirectsingle == null) {
				Bottomthreedirectsingle = new Bottomthreedirectsingle();
				mFragmentTransaction.add(R.id.content, Bottomthreedirectsingle,
						getString(R.string.bottomthree_direct_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottomthree_direct_single_name);
		} else if (btn_menu1_int == 60) {
			write(60);
			if (Bottompthreegroupthreesingle == null) {
				Bottompthreegroupthreesingle = new Bottompthreegroupthreesingle();
				mFragmentTransaction.add(R.id.content, Bottompthreegroupthreesingle,
						getString(R.string.bottompthree_group_three_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottompthree_group_three_single_name);
		} else if (btn_menu1_int == 61) {
			write(61);
			if (Bottompthreegroupsixsingle == null) {
				Bottompthreegroupsixsingle = new Bottompthreegroupsixsingle();
				mFragmentTransaction.add(R.id.content, Bottompthreegroupsixsingle,
						getString(R.string.bottompthree_group_six_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottompthree_group_six_single_name);
		} else if (btn_menu1_int == 62) {
			write(62);
			if (Twodirecttoptwosingle == null) {
				Twodirecttoptwosingle = new Twodirecttoptwosingle();
				mFragmentTransaction.add(R.id.content, Twodirecttoptwosingle,
						getString(R.string.two_direct_toptwo_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_toptwo_single_name);
		} else if (btn_menu1_int == 63) {
			write(63);
			if (Twogrouptoptwosingle == null) {
				Twogrouptoptwosingle = new Twogrouptoptwosingle();
				mFragmentTransaction.add(R.id.content, Twogrouptoptwosingle,
						getString(R.string.two_group_toptwo_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_toptwo_single_name);
		} else if (btn_menu1_int == 64) {
			write(64);
			if (Twogroupbottomtwosingle == null) {
				Twogroupbottomtwosingle = new Twogroupbottomtwosingle();
				mFragmentTransaction.add(R.id.content, Twogroupbottomtwosingle,
						getString(R.string.two_group_bottomtwo_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_group_bottomtwo_single_name);
		} else if (btn_menu1_int == 65) {
			write(65);
			if (Twodirectbottomtwosingle == null) {
				Twodirectbottomtwosingle = new Twodirectbottomtwosingle();
				mFragmentTransaction.add(R.id.content, Twodirectbottomtwosingle,
						getString(R.string.two_direct_bottomtwo_single_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.two_direct_bottomtwo_single_name);
		} else if (btn_menu1_int == 66) {
			write(66);
			if (Topthreemixgroup == null) {
				Topthreemixgroup = new Topthreemixgroup();
				mFragmentTransaction.add(R.id.content, Topthreemixgroup, getString(R.string.topthree_mix_group_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.topthree_mix_group_name);
		} else if (btn_menu1_int == 67) {
			write(67);
			if (Bottompthreemixgroup == null) {
				Bottompthreemixgroup = new Bottompthreemixgroup();
				mFragmentTransaction.add(R.id.content, Bottompthreemixgroup,
						getString(R.string.bottompthree_mix_group_name));
				commitTransactions();
			}
			curFragmentTag = getString(R.string.bottompthree_mix_group_name);
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
		if (TextUtils.equals(tag, getString(R.string.five_direct_double_name))) {
			if (Fivedirectdouble == null) {
				Fivedirectdouble = new Fivedirectdouble();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_group_120_name))) {

			Log.e(TAG, "contact");
			if (Fivegroup120 == null) {
				Fivegroup120 = new Fivegroup120();
			}

		}
		if (TextUtils.equals(tag, getString(R.string.five_group_60_name))) {
			if (Fivegroup60 == null) {
				Fivegroup60 = new Fivegroup60();
			}
		}

		if (TextUtils.equals(tag, getString(R.string.five_group_30_name))) {
			if (Fivegroup30 == null) {
				Fivegroup30 = new Fivegroup30();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_group_20_name))) {
			if (Fivegroup20 == null) {
				Fivegroup20 = new Fivegroup20();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_group_10_name))) {
			if (Fivegroup10 == null) {
				Fivegroup10 = new Fivegroup10();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_group_5_name))) {
			if (Fivegroup5 == null) {
				Fivegroup5 = new Fivegroup5();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_direct_double_name))) {
			if (Fourdirectdouble == null) {
				Fourdirectdouble = new Fourdirectdouble();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_group_24_name))) {
			if (Fourgroup24 == null) {
				Fourgroup24 = new Fourgroup24();
			}

		}
		if (TextUtils.equals(tag, getString(R.string.four_group_12_name))) {
			if (Fourgroup12 == null) {
				Fourgroup12 = new Fourgroup12();

			}

		}
		if (TextUtils.equals(tag, getString(R.string.topthree_direct_double_name))) {
			if (Topthreedirectdouble == null) {
				Topthreedirectdouble = new Topthreedirectdouble();
			}
		}

		if (TextUtils.equals(tag, getString(R.string.topthree_group_three_name))) {
			if (Topthreegroup3 == null) {
				Topthreegroup3 = new Topthreegroup3();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_group_six_name))) {
			if (Topthreegroup6 == null) {
				Topthreegroup6 = new Topthreegroup6();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_group_sum_name))) {
			if (Topthreegroupsum == null) {
				Topthreegroupsum = new Topthreegroupsum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_group_container_name))) {
			if (Topthreegroupcontainer == null) {
				Topthreegroupcontainer = new Topthreegroupcontainer();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_direct_double_name))) {
			if (Bottomthreedirectdouble == null) {
				Bottomthreedirectdouble = new Bottomthreedirectdouble();

			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_group_span_name))) {
			if (Bottomthreedirectspan == null) {
				Bottomthreedirectspan = new Bottomthreedirectspan();

			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_group_three_name))) {
			if (Bottomthreegroup3 == null) {
				Bottomthreegroup3 = new Bottomthreegroup3();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_group_six_name))) {
			if (Bottomthreegroup6 == null) {
				Bottomthreegroup6 = new Bottomthreegroup6();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_group_sum_name))) {
			if (Bottomthreegroupsum == null) {
				Bottomthreegroupsum = new Bottomthreegroupsum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_group_container_name))) {
			if (Bottomthreegroupcontainer == null) {
				Bottomthreegroupcontainer = new Bottomthreegroupcontainer();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_bottomtwo_double_name))) {
			if (Twodirectbottomtwodouble == null) {
				Twodirectbottomtwodouble = new Twodirectbottomtwodouble();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_bottomtwo_sum_name))) {
			if (Twodirectbottomtwosum == null) {
				Twodirectbottomtwosum = new Twodirectbottomtwosum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_bottomtwo_span_name))) {
			if (Twodirectbottomtwospan == null) {
				Twodirectbottomtwospan = new Twodirectbottomtwospan();
			}

		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_toptwo_double_name))) {
			if (Twodirecttoptwodouble == null) {
				Twodirecttoptwodouble = new Twodirecttoptwodouble();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_toptwo_span_name))) {
			if (Twodirecttoptwospan == null) {
				Twodirecttoptwospan = new Twodirecttoptwospan();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_bottomtwo_double_name))) {
			if (Twogroupbottomtwodouble == null) {
				Twogroupbottomtwodouble = new Twogroupbottomtwodouble();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_toptwo_double_name))) {
			if (Twogrouptoptwodouble == null) {
				Twogrouptoptwodouble = new Twogrouptoptwodouble();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.fixed_position_name))) {
			if (Fixedposition == null) {
				Fixedposition = new Fixedposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_bottomthree_one_notposition_name))) {
			if (Threebottomthreeonenotposition == null) {
				Threebottomthreeonenotposition = new Threebottomthreeonenotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_bottomthree_two_notposition_name))) {
			if (Threebottomthreetwonotposition == null) {
				Threebottomthreetwonotposition = new Threebottomthreetwonotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_topthree_one_notposition_name))) {
			if (Threetopthreeonenotposition == null) {
				Threetopthreeonenotposition = new Threetopthreeonenotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.three_topthree_two_notposition_name))) {
			if (Threetopthreetwonotposition == null) {
				Threetopthreetwonotposition = new Threetopthreetwonotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_bottomfour_two_notposition_name))) {
			if (Fourbottomfourtwonotposition == null) {
				Fourbottomfourtwonotposition = new Fourbottomfourtwonotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_bottomfive_two_notposition_name))) {
			if (Fivebottomfivetwonotposition == null) {
				Fivebottomfivetwonotposition = new Fivebottomfivetwonotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_bottomfive_three_notposition_name))) {
			if (Fivebottomfivethreenotposition == null) {
				Fivebottomfivethreenotposition = new Fivebottomfivethreenotposition();
			}

		}
		if (TextUtils.equals(tag, getString(R.string.two_group_toptwo_sum_name))) {
			if (Twogrouptoptwosum == null) {
				Twogrouptoptwosum = new Twogrouptoptwosum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_group_6_name))) {
			if (Fourgroup6 == null) {
				Fourgroup6 = new Fourgroup6();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_group_4_name))) {
			if (Fourgroup4 == null) {
				Fourgroup4 = new Fourgroup4();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_direct_sum_name))) {
			if (Bottomthreedirectsum == null) {
				Bottomthreedirectsum = new Bottomthreedirectsum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_direct_sum_name))) {
			if (Topthreedirectsum == null) {
				Topthreedirectsum = new Topthreedirectsum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_direct_span_name))) {
			if (Topthreedirectspan == null) {
				Topthreedirectspan = new Topthreedirectspan();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_sum_end_name))) {
			if (Topthreesumend == null) {
				Topthreesumend = new Topthreesumend();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_sum_end_name))) {
			if (Bottomthreesumend == null) {
				Bottomthreesumend = new Bottomthreesumend();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_toptwo_sum_name))) {
			if (Twodirecttoptwosum == null) {
				Twodirecttoptwosum = new Twodirecttoptwosum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_toptwo_container_name))) {
			if (Twogrouptoptwocontainer == null) {
				Twogrouptoptwocontainer = new Twogrouptoptwocontainer();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_bottomtwo_container_name))) {
			if (Twogroupbottomtwocontainer == null) {
				Twogroupbottomtwocontainer = new Twogroupbottomtwocontainer();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_bottomtwo_sum_name))) {
			if (Twogroupbottomtwosum == null) {
				Twogroupbottomtwosum = new Twogroupbottomtwosum();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_bottomfour_one_notposition_name))) {
			if (Fourbottomfouronenotposition == null) {
				Fourbottomfouronenotposition = new Fourbottomfouronenotposition();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.maxmin_bottomtwo_name))) {
			if (Maxminbottomtwo == null) {
				Maxminbottomtwo = new Maxminbottomtwo();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.maxmin_bottomthree_name))) {
			if (Maxminbottomthree == null) {
				Maxminbottomthree = new Maxminbottomthree();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.maxmin_toptwo_name))) {
			if (Maxmintoptwo == null) {
				Maxmintoptwo = new Maxmintoptwo();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.maxmin_topthree_name))) {
			if (Maxmintopthree == null) {
				Maxmintopthree = new Maxmintopthree();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.five_direct_single_name))) {
			if (Fivedirectsingle == null) {
				Fivedirectsingle = new Fivedirectsingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.four_direct_single_name))) {
			if (Fourdirectsingle == null) {
				Fourdirectsingle = new Fourdirectsingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_group_three_single_name))) {
			if (Topthreegroupthreesingle == null) {
				Topthreegroupthreesingle = new Topthreegroupthreesingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_group_six_single_name))) {
			if (Topthreegroupsixsingle == null) {
				Topthreegroupsixsingle = new Topthreegroupsixsingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_direct_single_name))) {
			if (Topthreedirectsingle == null) {
				Topthreedirectsingle = new Topthreedirectsingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottomthree_direct_single_name))) {
			if (Bottomthreedirectsingle == null) {
				Bottomthreedirectsingle = new Bottomthreedirectsingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottompthree_group_three_single_name))) {
			if (Bottompthreegroupthreesingle == null) {
				Bottompthreegroupthreesingle = new Bottompthreegroupthreesingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottompthree_group_six_single_name))) {
			if (Bottompthreegroupsixsingle == null) {
				Bottompthreegroupsixsingle = new Bottompthreegroupsixsingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_toptwo_single_name))) {
			if (Twodirecttoptwosingle == null) {
				Twodirecttoptwosingle = new Twodirecttoptwosingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_toptwo_single_name))) {
			if (Twogrouptoptwosingle == null) {
				Twogrouptoptwosingle = new Twogrouptoptwosingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_group_bottomtwo_single_name))) {
			if (Twogroupbottomtwosingle == null) {
				Twogroupbottomtwosingle = new Twogroupbottomtwosingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.two_direct_bottomtwo_single_name))) {
			if (Twodirectbottomtwosingle == null) {
				Twodirectbottomtwosingle = new Twodirectbottomtwosingle();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.topthree_mix_group_name))) {
			if (Topthreemixgroup == null) {
				Topthreemixgroup = new Topthreemixgroup();
			}
		}
		if (TextUtils.equals(tag, getString(R.string.bottompthree_mix_group_name))) {
			if (Bottompthreemixgroup == null) {
				Bottompthreemixgroup = new Bottompthreemixgroup();
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

			f = BaseFragmentticket.newInstance(getApplicationContext(), tag);
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
		endloading();
		// getnewtime();
		// Stasttime();
		// if (chongqing.getInt("chongqing", 0) == 10) {
		// tickettypecode = 4;
		// Editor edit = chongqing.edit();
		// edit.putInt("chongqing", 0);
		// edit.commit();
		// }

		Log.e(TAG, "onStart----->");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		endloading();
		// getnewtime();
		Log.e(TAG, "onresume---->");
		BaseActivityticket.curFragmentTag = getString(R.string.five_star);
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
		endloading();
		// getnewtime();
		Log.e(TAG, "onStop");
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
		No[0] = "000";
		No[1] = "000";
		No[2] = "000";
		No[3] = "000";
		// TODO Auto-generated method stub
		super.onDestroy();
		// getnewtime();
		write(0);
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

	public void showloading() {
		// lin_loading.setVisibility(View.VISIBLE);

	}

	public void endloading() {
		// lin_loading.setVisibility(View.GONE);

	}

	private void writefastcq() {
		// TODO Auto-generated method stub
		Editor edit = preticket.edit();
		edit.putString("tickettype", "cq");
		edit.commit();
	}

	private void writefastxj() {
		// TODO Auto-generated method stub
		Editor edit = preticket.edit();
		edit.putString("tickettype", "xj");
		edit.commit();
	}

	private void writefasttj() {
		// TODO Auto-generated method stub
		Editor edit = preticket.edit();
		edit.putString("tickettype", "tj");
		edit.commit();
	}

	private void writefastjx() {
		// TODO Auto-generated method stub
		Editor edit = preticket.edit();
		edit.putString("tickettype", "jx");
		edit.commit();
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
