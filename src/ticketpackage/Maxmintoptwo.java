package ticketpackage;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Maxmintoptwo extends BaseFragmentticket implements OnClickListener, OnTouchListener {
	private String TAG = "ghghg";
	private int[] rand = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	private ImageButton imagebtn_addbasket;
	private LinearLayout LinearLayout_ischoose;
	private LinearLayout LinearLayout_numberbasket;
	private RelativeLayout RelativeLayout_addbasket;
	private LinearLayout LinearLayout_rocknumber;
	private TextView text_chooseend;
	private TextView text_chooseresult;
	private LinearLayout LinearLayout_nochoose;
	private int number = 0;
	private String[] myriabit = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] kilobit = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] hundreds = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] decade = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] tens = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private Vibrator vibrator;
	private int clearint = 1;
	private BaseActivityticket mMainActivity;
	private LinearLayout LinearLayout_123;
	private LinearLayout Lin_Maxmintoptwo_erchong_two;
	private LinearLayout Lin_Maxmintoptwo_erchong_one;
	private Button btn_Maxmintoptwo_erchong_0;
	private Button btn_Maxmintoptwo_erchong_1;
	private Button btn_Maxmintoptwo_erchong_2;
	private Button btn_Maxmintoptwo_erchong_3;
	private Button btn_Maxmintoptwo_erchong_4;
	private Button btn_Maxmintoptwo_erchong_5;
	private Button btn_Maxmintoptwo_erchong_6;
	private Button btn_Maxmintoptwo_erchong_7;
	private Button btn_Maxmintoptwo_erchong_8;
	private Button btn_Maxmintoptwo_erchong_9;
	private Button btn_Maxmintoptwo_erchong_big;
	private Button btn_Maxmintoptwo_erchong_little;
	private Button btn_Maxmintoptwo_erchong_all;
	private Button btn_Maxmintoptwo_erchong_odd;
	private Button btn_Maxmintoptwo_erchong_even;
	private Button btn_Maxmintoptwo_erchong_clear;
	private RelativeLayout btn_Maxmintoptwo_erchong_x0;
	private RelativeLayout btn_Maxmintoptwo_erchong_x1;
	private RelativeLayout btn_Maxmintoptwo_erchong_x2;
	private RelativeLayout btn_Maxmintoptwo_erchong_x3;
	private RelativeLayout btn_Maxmintoptwo_erchong_x4;
	private RelativeLayout btn_Maxmintoptwo_erchong_x5;
	private RelativeLayout btn_Maxmintoptwo_erchong_x6;
	private RelativeLayout btn_Maxmintoptwo_erchong_x7;
	private RelativeLayout btn_Maxmintoptwo_erchong_x8;
	private RelativeLayout btn_Maxmintoptwo_erchong_x9;
	private Integer btn_Maxmintoptwo_erchong_0_int = 1;
	private Integer btn_Maxmintoptwo_erchong_1_int = 1;
	private Integer btn_Maxmintoptwo_erchong_2_int = 1;
	private Integer btn_Maxmintoptwo_erchong_3_int = 1;
	private Integer btn_Maxmintoptwo_erchong_4_int = 1;
	private Integer btn_Maxmintoptwo_erchong_5_int = 1;
	private Integer btn_Maxmintoptwo_erchong_6_int = 1;
	private Integer btn_Maxmintoptwo_erchong_7_int = 1;
	private Integer btn_Maxmintoptwo_erchong_8_int = 1;
	private Integer btn_Maxmintoptwo_erchong_9_int = 1;
	private TextView text_Maxmintoptwo_erchong_0;
	private TextView text_Maxmintoptwo_erchong_1;
	private TextView text_Maxmintoptwo_erchong_2;
	private TextView text_Maxmintoptwo_erchong_3;
	private TextView text_Maxmintoptwo_erchong_4;
	private TextView text_Maxmintoptwo_erchong_5;
	private TextView text_Maxmintoptwo_erchong_6;
	private TextView text_Maxmintoptwo_erchong_7;
	private TextView text_Maxmintoptwo_erchong_8;
	private TextView text_Maxmintoptwo_erchong_9;

	private LinearLayout Lin_Maxmintoptwo_dan_two;
	private LinearLayout Lin_Maxmintoptwo_dan_one;
	private Button btn_Maxmintoptwo_dan_0;
	private Button btn_Maxmintoptwo_dan_1;
	private Button btn_Maxmintoptwo_dan_2;
	private Button btn_Maxmintoptwo_dan_3;
	private Button btn_Maxmintoptwo_dan_4;
	private Button btn_Maxmintoptwo_dan_5;
	private Button btn_Maxmintoptwo_dan_6;
	private Button btn_Maxmintoptwo_dan_7;
	private Button btn_Maxmintoptwo_dan_8;
	private Button btn_Maxmintoptwo_dan_9;
	private Button btn_Maxmintoptwo_dan_big;
	private Button btn_Maxmintoptwo_dan_little;
	private Button btn_Maxmintoptwo_dan_all;
	private Button btn_Maxmintoptwo_dan_odd;
	private Button btn_Maxmintoptwo_dan_even;
	private Button btn_Maxmintoptwo_dan_clear;
	private RelativeLayout btn_Maxmintoptwo_dan_x0;
	private RelativeLayout btn_Maxmintoptwo_dan_x1;
	private RelativeLayout btn_Maxmintoptwo_dan_x2;
	private RelativeLayout btn_Maxmintoptwo_dan_x3;
	private RelativeLayout btn_Maxmintoptwo_dan_x4;
	private RelativeLayout btn_Maxmintoptwo_dan_x5;
	private RelativeLayout btn_Maxmintoptwo_dan_x6;
	private RelativeLayout btn_Maxmintoptwo_dan_x7;
	private RelativeLayout btn_Maxmintoptwo_dan_x8;
	private RelativeLayout btn_Maxmintoptwo_dan_x9;
	private Integer btn_Maxmintoptwo_dan_0_int = 1;
	private Integer btn_Maxmintoptwo_dan_1_int = 1;
	private Integer btn_Maxmintoptwo_dan_2_int = 1;
	private Integer btn_Maxmintoptwo_dan_3_int = 1;
	private Integer btn_Maxmintoptwo_dan_4_int = 1;
	private Integer btn_Maxmintoptwo_dan_5_int = 1;
	private Integer btn_Maxmintoptwo_dan_6_int = 1;
	private Integer btn_Maxmintoptwo_dan_7_int = 1;
	private Integer btn_Maxmintoptwo_dan_8_int = 1;
	private Integer btn_Maxmintoptwo_dan_9_int = 1;
	private TextView text_Maxmintoptwo_dan_0;
	private TextView text_Maxmintoptwo_dan_1;
	private TextView text_Maxmintoptwo_dan_2;
	private TextView text_Maxmintoptwo_dan_3;
	private TextView text_Maxmintoptwo_dan_4;
	private TextView text_Maxmintoptwo_dan_5;
	private TextView text_Maxmintoptwo_dan_6;
	private TextView text_Maxmintoptwo_dan_7;
	private TextView text_Maxmintoptwo_dan_8;
	private TextView text_Maxmintoptwo_dan_9;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.ticket_maxmin_toptwo, container, false);
		mMainActivity = (BaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_rocknumber = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_rocknumber);
		vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
		Lin_Maxmintoptwo_erchong_one = (LinearLayout) context.findViewById(R.id.Lin_Maxmintoptwo_erchong_one);
		Lin_Maxmintoptwo_erchong_two = (LinearLayout) context.findViewById(R.id.Lin_Maxmintoptwo_erchong_two);
		btn_Maxmintoptwo_erchong_0 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_0);
		btn_Maxmintoptwo_erchong_1 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_1);
		btn_Maxmintoptwo_erchong_2 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_2);
		btn_Maxmintoptwo_erchong_3 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_3);
		btn_Maxmintoptwo_erchong_4 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_4);
		btn_Maxmintoptwo_erchong_5 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_5);
		btn_Maxmintoptwo_erchong_6 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_6);
		btn_Maxmintoptwo_erchong_7 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_7);
		btn_Maxmintoptwo_erchong_8 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_8);
		btn_Maxmintoptwo_erchong_9 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_9);
		btn_Maxmintoptwo_erchong_x0 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x0);
		btn_Maxmintoptwo_erchong_x1 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x1);
		btn_Maxmintoptwo_erchong_x2 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x2);
		btn_Maxmintoptwo_erchong_x3 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x3);
		btn_Maxmintoptwo_erchong_x4 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x4);
		btn_Maxmintoptwo_erchong_x5 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x5);
		btn_Maxmintoptwo_erchong_x6 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x6);
		btn_Maxmintoptwo_erchong_x7 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x7);
		btn_Maxmintoptwo_erchong_x8 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x8);
		btn_Maxmintoptwo_erchong_x9 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_erchong_x9);
		text_Maxmintoptwo_erchong_0 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_0);
		text_Maxmintoptwo_erchong_1 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_1);
		text_Maxmintoptwo_erchong_2 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_2);
		text_Maxmintoptwo_erchong_3 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_3);
		text_Maxmintoptwo_erchong_4 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_4);
		text_Maxmintoptwo_erchong_5 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_5);
		text_Maxmintoptwo_erchong_6 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_6);
		text_Maxmintoptwo_erchong_7 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_7);
		text_Maxmintoptwo_erchong_8 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_8);
		text_Maxmintoptwo_erchong_9 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_erchong_9);
		btn_Maxmintoptwo_erchong_big = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_big);
		btn_Maxmintoptwo_erchong_little = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_little);
		btn_Maxmintoptwo_erchong_all = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_all);
		btn_Maxmintoptwo_erchong_odd = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_odd);
		btn_Maxmintoptwo_erchong_even = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_even);
		btn_Maxmintoptwo_erchong_clear = (Button) context.findViewById(R.id.btn_Maxmintoptwo_erchong_clear);

		btn_Maxmintoptwo_erchong_0.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_1.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_2.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_3.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_4.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_5.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_6.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_7.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_8.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_9.setOnTouchListener(this);
		btn_Maxmintoptwo_erchong_0.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_1.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_2.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_3.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_4.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_5.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_6.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_7.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_8.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_9.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_big.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_little.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_all.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_odd.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_even.setOnClickListener(this);
		btn_Maxmintoptwo_erchong_clear.setOnClickListener(this);

		Lin_Maxmintoptwo_dan_one = (LinearLayout) context.findViewById(R.id.Lin_Maxmintoptwo_dan_one);
		Lin_Maxmintoptwo_dan_two = (LinearLayout) context.findViewById(R.id.Lin_Maxmintoptwo_dan_two);
		btn_Maxmintoptwo_dan_0 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_0);
		btn_Maxmintoptwo_dan_1 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_1);
		btn_Maxmintoptwo_dan_2 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_2);
		btn_Maxmintoptwo_dan_3 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_3);
		btn_Maxmintoptwo_dan_4 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_4);
		btn_Maxmintoptwo_dan_5 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_5);
		btn_Maxmintoptwo_dan_6 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_6);
		btn_Maxmintoptwo_dan_7 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_7);
		btn_Maxmintoptwo_dan_8 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_8);
		btn_Maxmintoptwo_dan_9 = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_9);
		btn_Maxmintoptwo_dan_x0 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x0);
		btn_Maxmintoptwo_dan_x1 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x1);
		btn_Maxmintoptwo_dan_x2 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x2);
		btn_Maxmintoptwo_dan_x3 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x3);
		btn_Maxmintoptwo_dan_x4 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x4);
		btn_Maxmintoptwo_dan_x5 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x5);
		btn_Maxmintoptwo_dan_x6 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x6);
		btn_Maxmintoptwo_dan_x7 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x7);
		btn_Maxmintoptwo_dan_x8 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x8);
		btn_Maxmintoptwo_dan_x9 = (RelativeLayout) context.findViewById(R.id.btn_Maxmintoptwo_dan_x9);
		text_Maxmintoptwo_dan_0 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_0);
		text_Maxmintoptwo_dan_1 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_1);
		text_Maxmintoptwo_dan_2 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_2);
		text_Maxmintoptwo_dan_3 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_3);
		text_Maxmintoptwo_dan_4 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_4);
		text_Maxmintoptwo_dan_5 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_5);
		text_Maxmintoptwo_dan_6 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_6);
		text_Maxmintoptwo_dan_7 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_7);
		text_Maxmintoptwo_dan_8 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_8);
		text_Maxmintoptwo_dan_9 = (TextView) context.findViewById(R.id.text_Maxmintoptwo_dan_9);
		btn_Maxmintoptwo_dan_big = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_big);
		btn_Maxmintoptwo_dan_little = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_little);
		btn_Maxmintoptwo_dan_all = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_all);
		btn_Maxmintoptwo_dan_odd = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_odd);
		btn_Maxmintoptwo_dan_even = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_even);
		btn_Maxmintoptwo_dan_clear = (Button) context.findViewById(R.id.btn_Maxmintoptwo_dan_clear);

		btn_Maxmintoptwo_dan_0.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_1.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_2.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_3.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_4.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_5.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_6.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_7.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_8.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_9.setOnTouchListener(this);
		btn_Maxmintoptwo_dan_0.setOnClickListener(this);
		btn_Maxmintoptwo_dan_1.setOnClickListener(this);
		btn_Maxmintoptwo_dan_2.setOnClickListener(this);
		btn_Maxmintoptwo_dan_3.setOnClickListener(this);
		btn_Maxmintoptwo_dan_4.setOnClickListener(this);
		btn_Maxmintoptwo_dan_5.setOnClickListener(this);
		btn_Maxmintoptwo_dan_6.setOnClickListener(this);
		btn_Maxmintoptwo_dan_7.setOnClickListener(this);
		btn_Maxmintoptwo_dan_8.setOnClickListener(this);
		btn_Maxmintoptwo_dan_9.setOnClickListener(this);
		btn_Maxmintoptwo_dan_big.setOnClickListener(this);
		btn_Maxmintoptwo_dan_little.setOnClickListener(this);
		btn_Maxmintoptwo_dan_all.setOnClickListener(this);
		btn_Maxmintoptwo_dan_odd.setOnClickListener(this);
		btn_Maxmintoptwo_dan_even.setOnClickListener(this);
		btn_Maxmintoptwo_dan_clear.setOnClickListener(this);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_Maxmintoptwo_erchong_clear();
					getnumber_Maxmintoptwo_dan_clear();
					// getnumber_Maxmintoptwo_qian_clear();
					// getnumber_Maxmintoptwo_bai_clear();
					// getnumber_Maxmintoptwo_shi_clear();
					// getnumber_Maxmintoptwo_ge_clear();
				}
				mMainActivity.LinearLayout_ischooseonclick();
				mMainActivity.getresultint(getresultint());
				mMainActivity.showresult(getresult());
				mMainActivity.getmoney();
			}
		});
		LinearLayout_numberbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_Maxmintoptwo_dan_clear();
					getnumber_Maxmintoptwo_erchong_clear();
					// getnumber_Maxmintoptwo_qian_clear();
					// getnumber_Maxmintoptwo_bai_clear();
					// getnumber_Maxmintoptwo_shi_clear();
					// getnumber_Maxmintoptwo_ge_clear();
				}
				mMainActivity.LinearLayout_numberbasketonclick();
				mMainActivity.getresultint(getresultint());
				mMainActivity.showresult(getresult());
				mMainActivity.getmoney();
			}
		});
		imagebtn_addbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_Maxmintoptwo_dan_clear();
					getnumber_Maxmintoptwo_erchong_clear();
					// getnumber_Maxmintoptwo_qian_clear();
					// getnumber_Maxmintoptwo_bai_clear();
					// getnumber_Maxmintoptwo_shi_clear();
					// getnumber_Maxmintoptwo_ge_clear();
				}
				mMainActivity.imagebtn_addbasketonclick();
				mMainActivity.getresultint(getresultint());
				mMainActivity.showresult(getresult());
				mMainActivity.getmoney();
			}
		});
		LinearLayout_rocknumber.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				Log.d("vggg", "bjbjb");
				getnumber_Maxmintoptwo_dan_clear();
				getnumber_Maxmintoptwo_erchong_clear();
				getrand();

				int erchong = rand[0];
				switch (erchong) {
				case 0:

					selecterchong0();
					break;
				case 1:
					selecterchong1();
					break;
				case 2:
					selecterchong2();
					break;
				case 3:
					selecterchong3();
					break;
				case 4:
					selecterchong4();
					break;
				case 5:
					selecterchong5();
					break;
				case 6:
					selecterchong6();
					break;
				case 7:
					selecterchong7();
					break;
				case 8:
					selecterchong8();
					break;
				case 9:
					selecterchong9();
					break;

				default:
					break;
				}

				for (int i = 1; i < 2; i++) {
					int dan = rand[i];
					switch (dan) {
					case 0:

						selectdan0();
						break;
					case 1:
						selectdan1();
						break;
					case 2:
						selectdan2();
						break;
					case 3:
						selectdan3();
						break;
					case 4:
						selectdan4();
						break;
					case 5:
						selectdan5();
						break;
					case 6:
						selectdan6();
						break;
					case 7:
						selectdan7();
						break;
					case 8:
						selectdan8();
						break;
					case 9:
						selectdan9();
						break;

					default:
						break;
					}
				}

			}

		});
		return context;

		// tickettype_list = (ListView)
		// getActivity().findViewById(R.id.tickettype_list);
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		BaseActivityticket.curFragmentTag = getString(R.string.maxmin_toptwo_name);
	}

	// public void onAttach(Activity activity) {
	//
	// super.onAttach(activity);
	//
	//
	// }

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
		getnumber_Maxmintoptwo_dan_clear();
		getnumber_Maxmintoptwo_erchong_clear();
		super.onStart();
		Log.e(TAG, "onStart----->");
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
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_Maxmintoptwo_erchong_big:
			clearerchong();

			btn_Maxmintoptwo_erchong_big.setTextColor(0xff000000);
			btn_Maxmintoptwo_erchong_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_erchong_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_erchong_little:
			clearerchong();
			btn_Maxmintoptwo_erchong_little.setTextColor(0xff000000);
			btn_Maxmintoptwo_erchong_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_erchong_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_erchong_all:
			clearerchong();
			btn_Maxmintoptwo_erchong_all.setTextColor(0xff000000);
			btn_Maxmintoptwo_erchong_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_erchong_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_erchong_odd:
			clearerchong();
			btn_Maxmintoptwo_erchong_odd.setTextColor(0xff000000);
			btn_Maxmintoptwo_erchong_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_erchong_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_erchong_even:
			clearerchong();
			btn_Maxmintoptwo_erchong_even.setTextColor(0xff000000);
			btn_Maxmintoptwo_erchong_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_erchong_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_erchong_clear:
			clearerchong();
			btn_Maxmintoptwo_erchong_clear.setTextColor(0xff000000);
			btn_Maxmintoptwo_erchong_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_erchong_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Maxmintoptwo_erchong_0:
			selecterchong0();
			break;
		case R.id.btn_Maxmintoptwo_erchong_1:
			selecterchong1();
			break;
		case R.id.btn_Maxmintoptwo_erchong_2:
			selecterchong2();
			break;
		case R.id.btn_Maxmintoptwo_erchong_3:
			selecterchong3();
			break;
		case R.id.btn_Maxmintoptwo_erchong_4:
			selecterchong4();
			break;
		case R.id.btn_Maxmintoptwo_erchong_5:
			selecterchong5();
			break;
		case R.id.btn_Maxmintoptwo_erchong_6:
			selecterchong6();
			break;
		case R.id.btn_Maxmintoptwo_erchong_7:
			selecterchong7();
			break;
		case R.id.btn_Maxmintoptwo_erchong_8:
			selecterchong8();
			break;
		case R.id.btn_Maxmintoptwo_erchong_9:
			selecterchong9();
			break;
		case R.id.btn_Maxmintoptwo_dan_big:
			cleardan();

			btn_Maxmintoptwo_dan_big.setTextColor(0xff000000);
			btn_Maxmintoptwo_dan_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_dan_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_dan_little:
			cleardan();
			btn_Maxmintoptwo_dan_little.setTextColor(0xff000000);
			btn_Maxmintoptwo_dan_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_dan_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_dan_all:
			cleardan();
			btn_Maxmintoptwo_dan_all.setTextColor(0xff000000);
			btn_Maxmintoptwo_dan_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_dan_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_dan_odd:
			cleardan();
			btn_Maxmintoptwo_dan_odd.setTextColor(0xff000000);
			btn_Maxmintoptwo_dan_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_dan_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_dan_even:
			cleardan();
			btn_Maxmintoptwo_dan_even.setTextColor(0xff000000);
			btn_Maxmintoptwo_dan_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_dan_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Maxmintoptwo_dan_clear:
			cleardan();
			btn_Maxmintoptwo_dan_clear.setTextColor(0xff000000);
			btn_Maxmintoptwo_dan_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Maxmintoptwo_dan_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Maxmintoptwo_dan_0:
			selectdan0();
			break;
		case R.id.btn_Maxmintoptwo_dan_1:
			selectdan1();
			break;
		case R.id.btn_Maxmintoptwo_dan_2:
			selectdan2();
			break;
		case R.id.btn_Maxmintoptwo_dan_3:
			selectdan3();
			break;
		case R.id.btn_Maxmintoptwo_dan_4:
			selectdan4();
			break;
		case R.id.btn_Maxmintoptwo_dan_5:
			selectdan5();
			break;
		case R.id.btn_Maxmintoptwo_dan_6:
			selectdan6();
			break;
		case R.id.btn_Maxmintoptwo_dan_7:
			selectdan7();
			break;
		case R.id.btn_Maxmintoptwo_dan_8:
			selectdan8();
			break;
		case R.id.btn_Maxmintoptwo_dan_9:
			selectdan9();
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_Maxmintoptwo_erchong_0:

			int actionMaxmintoptwo0 = event.getAction();
			if (actionMaxmintoptwo0 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x0.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo0 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionMaxmintoptwo0 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionMaxmintoptwo1 = event.getAction();
			if (actionMaxmintoptwo1 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x1.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo1 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x1.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo1 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_2:
			int actionMaxmintoptwo2 = event.getAction();
			if (actionMaxmintoptwo2 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x2.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo2 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x2.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo2 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_3:
			int actionMaxmintoptwo3 = event.getAction();
			if (actionMaxmintoptwo3 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x3.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo3 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x3.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo3 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_4:
			int actionMaxmintoptwo4 = event.getAction();
			if (actionMaxmintoptwo4 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x4.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo4 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x4.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo4 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_5:
			int actionMaxmintoptwo5 = event.getAction();
			if (actionMaxmintoptwo5 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x5.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo5 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x5.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo5 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_6:
			Log.d("btn_1_1", "btn_Maxmintoptwo_erchong_6");
			int actionMaxmintoptwo6 = event.getAction();
			if (actionMaxmintoptwo6 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x6.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo6 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x6.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo6 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_7:
			int actionMaxmintoptwo7 = event.getAction();
			if (actionMaxmintoptwo7 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x7.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo7 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x7.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo7 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_8:
			int actionMaxmintoptwo8 = event.getAction();
			if (actionMaxmintoptwo8 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x8.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo8 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x8.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo8 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_erchong_9:
			int actionMaxmintoptwo9 = event.getAction();
			if (actionMaxmintoptwo9 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_erchong_x9.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo9 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x9.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo9 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_erchong_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_erchong_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_0:

			int actionMaxmintoptwo01 = event.getAction();
			if (actionMaxmintoptwo01 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Maxmintoptwo_dan_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x0.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo01 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionMaxmintoptwo01 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionMaxmintoptwo11 = event.getAction();
			if (actionMaxmintoptwo11 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x1.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo11 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x1.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo11 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_2:
			int actionMaxmintoptwo21 = event.getAction();
			if (actionMaxmintoptwo21 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x2.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo21 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x2.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo21 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_3:
			int actionMaxmintoptwo31 = event.getAction();
			if (actionMaxmintoptwo31 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x3.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo31 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x3.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo31 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_4:
			int actionMaxmintoptwo41 = event.getAction();
			if (actionMaxmintoptwo41 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x4.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo41 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x4.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo41 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_5:
			int actionMaxmintoptwo51 = event.getAction();
			if (actionMaxmintoptwo51 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x5.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo51 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x5.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo51 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_one.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_6:
			Log.d("btn_1_1", "btn_Maxmintoptwo_dan_6");
			int actionMaxmintoptwo61 = event.getAction();
			if (actionMaxmintoptwo61 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x6.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo61 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x6.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo61 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_7:
			int actionMaxmintoptwo71 = event.getAction();
			if (actionMaxmintoptwo71 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x7.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo71 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x7.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo71 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_8:
			int actionMaxmintoptwo81 = event.getAction();
			if (actionMaxmintoptwo81 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x8.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo81 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x8.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo81 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Maxmintoptwo_dan_9:
			int actionMaxmintoptwo91 = event.getAction();
			if (actionMaxmintoptwo91 == MotionEvent.ACTION_DOWN) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.VISIBLE);
				btn_Maxmintoptwo_dan_x9.setVisibility(View.VISIBLE);
			} else if (actionMaxmintoptwo91 == MotionEvent.ACTION_UP) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x9.setVisibility(View.INVISIBLE);
			} else if (actionMaxmintoptwo91 == MotionEvent.ACTION_CANCEL) {
				Lin_Maxmintoptwo_dan_two.setVisibility(View.INVISIBLE);
				btn_Maxmintoptwo_dan_x9.setVisibility(View.INVISIBLE);
			}
			break;

		default:
			break;
		}
		return false;
	}

	private void getnumber_Maxmintoptwo_dan_big() {
		// TODO Auto-generated method stub
		btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_0.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_1.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_2.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_3.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_4.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_5.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_6.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_7.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_8.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_9.setTextColor(0xffffffff);
		kilobit[5] = "1";
		kilobit[6] = "1";
		kilobit[7] = "1";
		kilobit[8] = "1";
		kilobit[9] = "1";
		kilobit[0] = "0";
		kilobit[1] = "0";
		kilobit[2] = "0";
		kilobit[3] = "0";
		kilobit[4] = "0";

		btn_Maxmintoptwo_dan_0_int = 1;
		btn_Maxmintoptwo_dan_1_int = 1;
		btn_Maxmintoptwo_dan_2_int = 1;
		btn_Maxmintoptwo_dan_3_int = 1;
		btn_Maxmintoptwo_dan_4_int = 1;
		btn_Maxmintoptwo_dan_5_int = -1;
		btn_Maxmintoptwo_dan_6_int = -1;
		btn_Maxmintoptwo_dan_7_int = -1;
		btn_Maxmintoptwo_dan_8_int = -1;
		btn_Maxmintoptwo_dan_9_int = -1;
		show(kilobit);
	}

	private void getnumber_Maxmintoptwo_dan_little() {
		btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_0.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_1.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_2.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_3.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_4.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_5.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_6.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_7.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_8.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_9.setTextColor(0xffdedede);
		kilobit[0] = "1";
		kilobit[1] = "1";
		kilobit[2] = "1";
		kilobit[3] = "1";
		kilobit[4] = "1";
		kilobit[5] = "0";
		kilobit[6] = "0";
		kilobit[7] = "0";
		kilobit[8] = "0";
		kilobit[9] = "0";
		btn_Maxmintoptwo_dan_5_int = 1;
		btn_Maxmintoptwo_dan_6_int = 1;
		btn_Maxmintoptwo_dan_7_int = 1;
		btn_Maxmintoptwo_dan_8_int = 1;
		btn_Maxmintoptwo_dan_9_int = 1;
		btn_Maxmintoptwo_dan_0_int = -1;
		btn_Maxmintoptwo_dan_1_int = -1;
		btn_Maxmintoptwo_dan_2_int = -1;
		btn_Maxmintoptwo_dan_3_int = -1;
		btn_Maxmintoptwo_dan_4_int = -1;

		show(kilobit);
	}

	private void getnumber_Maxmintoptwo_dan_all() {
		btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_0.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_1.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_2.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_3.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_4.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_5.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_6.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_7.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_8.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_9.setTextColor(0xffffffff);
		kilobit[0] = changestatus(kilobit[0]);
		kilobit[1] = changestatus(kilobit[1]);
		kilobit[2] = changestatus(kilobit[2]);
		kilobit[3] = changestatus(kilobit[3]);
		kilobit[4] = changestatus(kilobit[4]);
		kilobit[5] = changestatus(kilobit[5]);
		kilobit[6] = changestatus(kilobit[6]);
		kilobit[7] = changestatus(kilobit[7]);
		kilobit[8] = changestatus(kilobit[8]);
		kilobit[9] = changestatus(kilobit[9]);
		kilobit[1] = "1";
		kilobit[3] = "1";
		kilobit[5] = "1";
		kilobit[7] = "1";
		kilobit[9] = "1";
		kilobit[0] = "1";
		kilobit[2] = "1";
		kilobit[4] = "1";
		kilobit[6] = "1";
		kilobit[8] = "1";
		btn_Maxmintoptwo_dan_0_int = -1;
		btn_Maxmintoptwo_dan_1_int = -1;
		btn_Maxmintoptwo_dan_2_int = -1;
		btn_Maxmintoptwo_dan_3_int = -1;
		btn_Maxmintoptwo_dan_4_int = -1;
		btn_Maxmintoptwo_dan_5_int = -1;
		btn_Maxmintoptwo_dan_6_int = -1;
		btn_Maxmintoptwo_dan_7_int = -1;
		btn_Maxmintoptwo_dan_8_int = -1;
		btn_Maxmintoptwo_dan_9_int = -1;

		show(kilobit);
	}

	private void getnumber_Maxmintoptwo_dan_odd() {
		btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_0.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_2.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_4.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_6.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_8.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_1.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_3.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_5.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_7.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_9.setTextColor(0xffffffff);
		kilobit[1] = "1";
		kilobit[3] = "1";
		kilobit[5] = "1";
		kilobit[7] = "1";
		kilobit[9] = "1";
		kilobit[0] = "0";
		kilobit[2] = "0";
		kilobit[4] = "0";
		kilobit[6] = "0";
		kilobit[8] = "0";

		btn_Maxmintoptwo_dan_0_int = 1;
		btn_Maxmintoptwo_dan_2_int = 1;
		btn_Maxmintoptwo_dan_4_int = 1;
		btn_Maxmintoptwo_dan_6_int = 1;
		btn_Maxmintoptwo_dan_8_int = 1;
		btn_Maxmintoptwo_dan_1_int = -1;
		btn_Maxmintoptwo_dan_3_int = -1;
		btn_Maxmintoptwo_dan_5_int = -1;
		btn_Maxmintoptwo_dan_7_int = -1;
		btn_Maxmintoptwo_dan_9_int = -1;
		show(kilobit);
	}

	private void getnumber_Maxmintoptwo_dan_even() {
		btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_dan_0.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_2.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_4.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_6.setTextColor(0xffffffff);
		text_Maxmintoptwo_dan_8.setTextColor(0xffffffff);
		btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_1.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_3.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_5.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_7.setTextColor(0xffdedede);
		text_Maxmintoptwo_dan_9.setTextColor(0xffdedede);
		kilobit[1] = "0";
		kilobit[3] = "0";
		kilobit[5] = "0";
		kilobit[7] = "0";
		kilobit[9] = "0";
		kilobit[0] = "1";
		kilobit[2] = "1";
		kilobit[4] = "1";
		kilobit[6] = "1";
		kilobit[8] = "1";
		btn_Maxmintoptwo_dan_1_int = 1;
		btn_Maxmintoptwo_dan_3_int = 1;
		btn_Maxmintoptwo_dan_5_int = 1;
		btn_Maxmintoptwo_dan_7_int = 1;
		btn_Maxmintoptwo_dan_9_int = 1;
		btn_Maxmintoptwo_dan_0_int = -1;
		btn_Maxmintoptwo_dan_2_int = -1;
		btn_Maxmintoptwo_dan_4_int = -1;
		btn_Maxmintoptwo_dan_6_int = -1;
		btn_Maxmintoptwo_dan_8_int = -1;

		show(kilobit);
	}

	private void getnumber_Maxmintoptwo_dan_clear() {
		btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_0.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_1.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_2.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_3.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_4.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_5.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_6.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_7.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_8.setTextColor(0xffdedede);
		btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_dan_9.setTextColor(0xffdedede);
		kilobit[0] = "0";
		kilobit[1] = "0";
		kilobit[2] = "0";
		kilobit[3] = "0";
		kilobit[4] = "0";
		kilobit[5] = "0";
		kilobit[6] = "0";
		kilobit[7] = "0";
		kilobit[8] = "0";
		kilobit[9] = "0";
		btn_Maxmintoptwo_dan_0_int = 1;
		btn_Maxmintoptwo_dan_1_int = 1;
		btn_Maxmintoptwo_dan_2_int = 1;
		btn_Maxmintoptwo_dan_3_int = 1;
		btn_Maxmintoptwo_dan_4_int = 1;
		btn_Maxmintoptwo_dan_5_int = 1;
		btn_Maxmintoptwo_dan_6_int = 1;
		btn_Maxmintoptwo_dan_7_int = 1;
		btn_Maxmintoptwo_dan_8_int = 1;
		btn_Maxmintoptwo_dan_9_int = 1;
		show(kilobit);
	}

	private void cleardan() {
		// TODO Auto-generated method stub
		btn_Maxmintoptwo_dan_big.setBackgroundResource(0);
		btn_Maxmintoptwo_dan_little.setBackgroundResource(0);
		btn_Maxmintoptwo_dan_all.setBackgroundResource(0);
		btn_Maxmintoptwo_dan_odd.setBackgroundResource(0);
		btn_Maxmintoptwo_dan_even.setBackgroundResource(0);
		btn_Maxmintoptwo_dan_clear.setBackgroundResource(0);
		btn_Maxmintoptwo_dan_big.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_dan_little.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_dan_all.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_dan_odd.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_dan_even.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_dan_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_Maxmintoptwo_erchong_big() {
		// TODO Auto-generated method stub
		btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_0.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_1.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_2.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_3.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_4.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_5.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_6.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_7.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_8.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_9.setTextColor(0xffffffff);
		myriabit[5] = "1";
		myriabit[6] = "1";
		myriabit[7] = "1";
		myriabit[8] = "1";
		myriabit[9] = "1";
		myriabit[0] = "0";
		myriabit[1] = "0";
		myriabit[2] = "0";
		myriabit[3] = "0";
		myriabit[4] = "0";

		btn_Maxmintoptwo_erchong_0_int = 1;
		btn_Maxmintoptwo_erchong_1_int = 1;
		btn_Maxmintoptwo_erchong_2_int = 1;
		btn_Maxmintoptwo_erchong_3_int = 1;
		btn_Maxmintoptwo_erchong_4_int = 1;
		btn_Maxmintoptwo_erchong_5_int = -1;
		btn_Maxmintoptwo_erchong_6_int = -1;
		btn_Maxmintoptwo_erchong_7_int = -1;
		btn_Maxmintoptwo_erchong_8_int = -1;
		btn_Maxmintoptwo_erchong_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Maxmintoptwo_erchong_little() {
		btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_0.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_1.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_2.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_3.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_4.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_5.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_6.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_7.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_8.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_9.setTextColor(0xffdedede);
		myriabit[0] = "1";
		myriabit[1] = "1";
		myriabit[2] = "1";
		myriabit[3] = "1";
		myriabit[4] = "1";
		myriabit[5] = "0";
		myriabit[6] = "0";
		myriabit[7] = "0";
		myriabit[8] = "0";
		myriabit[9] = "0";
		btn_Maxmintoptwo_erchong_5_int = 1;
		btn_Maxmintoptwo_erchong_6_int = 1;
		btn_Maxmintoptwo_erchong_7_int = 1;
		btn_Maxmintoptwo_erchong_8_int = 1;
		btn_Maxmintoptwo_erchong_9_int = 1;
		btn_Maxmintoptwo_erchong_0_int = -1;
		btn_Maxmintoptwo_erchong_1_int = -1;
		btn_Maxmintoptwo_erchong_2_int = -1;
		btn_Maxmintoptwo_erchong_3_int = -1;
		btn_Maxmintoptwo_erchong_4_int = -1;

		show(myriabit);
	}

	private void getnumber_Maxmintoptwo_erchong_all() {
		btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_0.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_1.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_2.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_3.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_4.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_5.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_6.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_7.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_8.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_9.setTextColor(0xffffffff);
		myriabit[0] = changestatus(myriabit[0]);
		myriabit[1] = changestatus(myriabit[1]);
		myriabit[2] = changestatus(myriabit[2]);
		myriabit[3] = changestatus(myriabit[3]);
		myriabit[4] = changestatus(myriabit[4]);
		myriabit[5] = changestatus(myriabit[5]);
		myriabit[6] = changestatus(myriabit[6]);
		myriabit[7] = changestatus(myriabit[7]);
		myriabit[8] = changestatus(myriabit[8]);
		myriabit[9] = changestatus(myriabit[9]);
		myriabit[1] = "1";
		myriabit[3] = "1";
		myriabit[5] = "1";
		myriabit[7] = "1";
		myriabit[9] = "1";
		myriabit[0] = "1";
		myriabit[2] = "1";
		myriabit[4] = "1";
		myriabit[6] = "1";
		myriabit[8] = "1";
		btn_Maxmintoptwo_erchong_0_int = -1;
		btn_Maxmintoptwo_erchong_1_int = -1;
		btn_Maxmintoptwo_erchong_2_int = -1;
		btn_Maxmintoptwo_erchong_3_int = -1;
		btn_Maxmintoptwo_erchong_4_int = -1;
		btn_Maxmintoptwo_erchong_5_int = -1;
		btn_Maxmintoptwo_erchong_6_int = -1;
		btn_Maxmintoptwo_erchong_7_int = -1;
		btn_Maxmintoptwo_erchong_8_int = -1;
		btn_Maxmintoptwo_erchong_9_int = -1;

		show(myriabit);
	}

	private void getnumber_Maxmintoptwo_erchong_odd() {
		btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_0.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_2.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_4.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_6.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_8.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_1.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_3.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_5.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_7.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_9.setTextColor(0xffffffff);
		myriabit[1] = "1";
		myriabit[3] = "1";
		myriabit[5] = "1";
		myriabit[7] = "1";
		myriabit[9] = "1";
		myriabit[0] = "0";
		myriabit[2] = "0";
		myriabit[4] = "0";
		myriabit[6] = "0";
		myriabit[8] = "0";

		btn_Maxmintoptwo_erchong_0_int = 1;
		btn_Maxmintoptwo_erchong_2_int = 1;
		btn_Maxmintoptwo_erchong_4_int = 1;
		btn_Maxmintoptwo_erchong_6_int = 1;
		btn_Maxmintoptwo_erchong_8_int = 1;
		btn_Maxmintoptwo_erchong_1_int = -1;
		btn_Maxmintoptwo_erchong_3_int = -1;
		btn_Maxmintoptwo_erchong_5_int = -1;
		btn_Maxmintoptwo_erchong_7_int = -1;
		btn_Maxmintoptwo_erchong_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Maxmintoptwo_erchong_even() {
		btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.big_num_on);
		text_Maxmintoptwo_erchong_0.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_2.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_4.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_6.setTextColor(0xffffffff);
		text_Maxmintoptwo_erchong_8.setTextColor(0xffffffff);
		btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.round);
		btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_1.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_3.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_5.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_7.setTextColor(0xffdedede);
		text_Maxmintoptwo_erchong_9.setTextColor(0xffdedede);
		myriabit[1] = "0";
		myriabit[3] = "0";
		myriabit[5] = "0";
		myriabit[7] = "0";
		myriabit[9] = "0";
		myriabit[0] = "1";
		myriabit[2] = "1";
		myriabit[4] = "1";
		myriabit[6] = "1";
		myriabit[8] = "1";
		btn_Maxmintoptwo_erchong_1_int = 1;
		btn_Maxmintoptwo_erchong_3_int = 1;
		btn_Maxmintoptwo_erchong_5_int = 1;
		btn_Maxmintoptwo_erchong_7_int = 1;
		btn_Maxmintoptwo_erchong_9_int = 1;
		btn_Maxmintoptwo_erchong_0_int = -1;
		btn_Maxmintoptwo_erchong_2_int = -1;
		btn_Maxmintoptwo_erchong_4_int = -1;
		btn_Maxmintoptwo_erchong_6_int = -1;
		btn_Maxmintoptwo_erchong_8_int = -1;

		show(myriabit);
	}

	private void getnumber_Maxmintoptwo_erchong_clear() {
		btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_0.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_1.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_2.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_3.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_4.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_5.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_6.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_7.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_8.setTextColor(0xffdedede);
		btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.round);
		text_Maxmintoptwo_erchong_9.setTextColor(0xffdedede);
		myriabit[0] = "0";
		myriabit[1] = "0";
		myriabit[2] = "0";
		myriabit[3] = "0";
		myriabit[4] = "0";
		myriabit[5] = "0";
		myriabit[6] = "0";
		myriabit[7] = "0";
		myriabit[8] = "0";
		myriabit[9] = "0";
		btn_Maxmintoptwo_erchong_0_int = 1;
		btn_Maxmintoptwo_erchong_1_int = 1;
		btn_Maxmintoptwo_erchong_2_int = 1;
		btn_Maxmintoptwo_erchong_3_int = 1;
		btn_Maxmintoptwo_erchong_4_int = 1;
		btn_Maxmintoptwo_erchong_5_int = 1;
		btn_Maxmintoptwo_erchong_6_int = 1;
		btn_Maxmintoptwo_erchong_7_int = 1;
		btn_Maxmintoptwo_erchong_8_int = 1;
		btn_Maxmintoptwo_erchong_9_int = 1;
		show(myriabit);
	}

	private void clearerchong() {
		// TODO Auto-generated method stub
		btn_Maxmintoptwo_erchong_big.setBackgroundResource(0);
		btn_Maxmintoptwo_erchong_little.setBackgroundResource(0);
		btn_Maxmintoptwo_erchong_all.setBackgroundResource(0);
		btn_Maxmintoptwo_erchong_odd.setBackgroundResource(0);
		btn_Maxmintoptwo_erchong_even.setBackgroundResource(0);
		btn_Maxmintoptwo_erchong_clear.setBackgroundResource(0);
		btn_Maxmintoptwo_erchong_big.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_erchong_little.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_erchong_all.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_erchong_odd.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_erchong_even.setTextColor(0xffcfcfcf);
		btn_Maxmintoptwo_erchong_clear.setTextColor(0xffcfcfcf);

	}

	private String getresult() {
		String result = "";
		String result1 = "";
		String result2 = "";
		String result3 = "";
		String result4 = "";
		String result5 = "";
		for (int i = 0; i < 10; i++) {
			if (myriabit[i].equals("1")) {
				if (i == 0) {
					result1 = result1 + "大";
				} else if (i == 1) {
					result1 = result1 + "小";
				} else if (i == 2) {
					result1 = result1 + "单";
				} else if (i == 3) {
					result1 = result1 + "双";
				}

			}
		}
		for (int i = 0; i < 10; i++) {
			if (kilobit[i].equals("1")) {
				if (i == 0) {
					result2 = result2 + "大";
				} else if (i == 1) {
					result2 = result2 + "小";
				} else if (i == 2) {
					result2 = result2 + "单";
				} else if (i == 3) {
					result2 = result2 + "双";
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			if (hundreds[i].equals("1")) {
				result3 = result3 + i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (tens[i].equals("1")) {
				result4 = result4 + i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (decade[i].equals("1")) {
				result5 = result5 + i;
			}
		}
		if (!result2.equals("") && !result1.equals("")) {
			result1 = result1 + "|";
		}
		if (!result3.equals("") && !result2.equals("")) {
			result2 = result2 + "|";
		}
		if (!result4.equals("") && !result3.equals("")) {
			result3 = result3 + "|";
		}
		if (!result5.equals("") && !result4.equals("")) {
			result4 = result4 + "|";
		}
		result = result1 + result2 + result3 + result4 + result5;
		return result;
	}

	private int getresultint() {
		number = 0;
		int result = 0;
		String result1 = "";
		String result2 = "";
		String result3 = "";
		String result4 = "";
		String result5 = "";
		for (int i = 0; i < 10; i++) {
			if (kilobit[i].equals("1")) {
				result2 = result2 + i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (myriabit[i].equals("1")) {
				result1 = result1 + i;

				// if (kilobit[i].equals("1")) {
				// result = result2.length() - 1;
				// number = number + combination(result, 3);
				// } else {
				// result = result2.length();
				// number = number + combination(result, 3);
				// }

			}
		}
		result = result1.length() * result2.length();
		number = result;
		// if (result >= 5) {
		// result = combination(result, 5);
		// } else {
		// result = 0;
		// }
		// number = result;
		return result;
	}

	private void show(String[] str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Log.d("str", str[i]);
		}

	}

	private String changestatus(String string) {
		// TODO Auto-generated method stub
		String changestatustemp;
		if (string.equals("0")) {
			changestatustemp = "1";
		} else {
			changestatustemp = "0";
		}
		return changestatustemp;
	}

	public void selecterchong0() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[0] = changestatus(myriabit[0]);
		if (btn_Maxmintoptwo_erchong_0_int == 1) {
			btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_0.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_0_int = btn_Maxmintoptwo_erchong_0_int * -1;
		} else if (btn_Maxmintoptwo_erchong_0_int == -1) {
			btn_Maxmintoptwo_erchong_0.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_0.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_0_int = btn_Maxmintoptwo_erchong_0_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong1() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[1] = changestatus(myriabit[1]);
		if (btn_Maxmintoptwo_erchong_1_int == 1) {
			btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_1.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_1_int = btn_Maxmintoptwo_erchong_1_int * -1;
		} else if (btn_Maxmintoptwo_erchong_1_int == -1) {
			btn_Maxmintoptwo_erchong_1.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_1.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_1_int = btn_Maxmintoptwo_erchong_1_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong2() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[2] = changestatus(myriabit[2]);
		if (btn_Maxmintoptwo_erchong_2_int == 1) {
			btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_2.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_2_int = btn_Maxmintoptwo_erchong_2_int * -1;
		} else if (btn_Maxmintoptwo_erchong_2_int == -1) {
			btn_Maxmintoptwo_erchong_2.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_2.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_2_int = btn_Maxmintoptwo_erchong_2_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong3() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[3] = changestatus(myriabit[3]);
		if (btn_Maxmintoptwo_erchong_3_int == 1) {
			btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_3.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_3_int = btn_Maxmintoptwo_erchong_3_int * -1;
		} else if (btn_Maxmintoptwo_erchong_3_int == -1) {
			btn_Maxmintoptwo_erchong_3.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_3.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_3_int = btn_Maxmintoptwo_erchong_3_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong4() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[4] = changestatus(myriabit[4]);
		if (btn_Maxmintoptwo_erchong_4_int == 1) {
			btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_4.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_4_int = btn_Maxmintoptwo_erchong_4_int * -1;
		} else if (btn_Maxmintoptwo_erchong_4_int == -1) {
			btn_Maxmintoptwo_erchong_4.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_4.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_4_int = btn_Maxmintoptwo_erchong_4_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong5() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[5] = changestatus(myriabit[5]);
		if (btn_Maxmintoptwo_erchong_5_int == 1) {
			btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_5.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_5_int = btn_Maxmintoptwo_erchong_5_int * -1;
		} else if (btn_Maxmintoptwo_erchong_5_int == -1) {
			btn_Maxmintoptwo_erchong_5.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_5.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_5_int = btn_Maxmintoptwo_erchong_5_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong6() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[6] = changestatus(myriabit[6]);
		if (btn_Maxmintoptwo_erchong_6_int == 1) {
			btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_6.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_6_int = btn_Maxmintoptwo_erchong_6_int * -1;
		} else if (btn_Maxmintoptwo_erchong_6_int == -1) {
			btn_Maxmintoptwo_erchong_6.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_6.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_6_int = btn_Maxmintoptwo_erchong_6_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong7() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[7] = changestatus(myriabit[7]);
		if (btn_Maxmintoptwo_erchong_7_int == 1) {
			btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_7.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_7_int = btn_Maxmintoptwo_erchong_7_int * -1;
		} else if (btn_Maxmintoptwo_erchong_7_int == -1) {
			btn_Maxmintoptwo_erchong_7.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_7.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_7_int = btn_Maxmintoptwo_erchong_7_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong8() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[8] = changestatus(myriabit[8]);
		if (btn_Maxmintoptwo_erchong_8_int == 1) {
			btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_8.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_8_int = btn_Maxmintoptwo_erchong_8_int * -1;
		} else if (btn_Maxmintoptwo_erchong_8_int == -1) {
			btn_Maxmintoptwo_erchong_8.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_8.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_8_int = btn_Maxmintoptwo_erchong_8_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selecterchong9() {
		clearerchong();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[9] = changestatus(myriabit[9]);
		if (btn_Maxmintoptwo_erchong_9_int == 1) {
			btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_erchong_9.setTextColor(0xffffffff);
			btn_Maxmintoptwo_erchong_9_int = btn_Maxmintoptwo_erchong_9_int * -1;
		} else if (btn_Maxmintoptwo_erchong_9_int == -1) {
			btn_Maxmintoptwo_erchong_9.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_erchong_9.setTextColor(0xffdedede);
			btn_Maxmintoptwo_erchong_9_int = btn_Maxmintoptwo_erchong_9_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan0() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[0] = changestatus(kilobit[0]);
		if (btn_Maxmintoptwo_dan_0_int == 1) {
			btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_0.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_0_int = btn_Maxmintoptwo_dan_0_int * -1;
		} else if (btn_Maxmintoptwo_dan_0_int == -1) {
			btn_Maxmintoptwo_dan_0.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_0.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_0_int = btn_Maxmintoptwo_dan_0_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan1() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[1] = changestatus(kilobit[1]);
		if (btn_Maxmintoptwo_dan_1_int == 1) {
			btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_1.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_1_int = btn_Maxmintoptwo_dan_1_int * -1;
		} else if (btn_Maxmintoptwo_dan_1_int == -1) {
			btn_Maxmintoptwo_dan_1.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_1.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_1_int = btn_Maxmintoptwo_dan_1_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan2() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[2] = changestatus(kilobit[2]);
		if (btn_Maxmintoptwo_dan_2_int == 1) {
			btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_2.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_2_int = btn_Maxmintoptwo_dan_2_int * -1;
		} else if (btn_Maxmintoptwo_dan_2_int == -1) {
			btn_Maxmintoptwo_dan_2.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_2.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_2_int = btn_Maxmintoptwo_dan_2_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan3() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[3] = changestatus(kilobit[3]);
		if (btn_Maxmintoptwo_dan_3_int == 1) {
			btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_3.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_3_int = btn_Maxmintoptwo_dan_3_int * -1;
		} else if (btn_Maxmintoptwo_dan_3_int == -1) {
			btn_Maxmintoptwo_dan_3.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_3.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_3_int = btn_Maxmintoptwo_dan_3_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan4() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[4] = changestatus(kilobit[4]);
		if (btn_Maxmintoptwo_dan_4_int == 1) {
			btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_4.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_4_int = btn_Maxmintoptwo_dan_4_int * -1;
		} else if (btn_Maxmintoptwo_dan_4_int == -1) {
			btn_Maxmintoptwo_dan_4.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_4.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_4_int = btn_Maxmintoptwo_dan_4_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan5() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[5] = changestatus(kilobit[5]);
		if (btn_Maxmintoptwo_dan_5_int == 1) {
			btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_5.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_5_int = btn_Maxmintoptwo_dan_5_int * -1;
		} else if (btn_Maxmintoptwo_dan_5_int == -1) {
			btn_Maxmintoptwo_dan_5.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_5.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_5_int = btn_Maxmintoptwo_dan_5_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan6() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[6] = changestatus(kilobit[6]);
		if (btn_Maxmintoptwo_dan_6_int == 1) {
			btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_6.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_6_int = btn_Maxmintoptwo_dan_6_int * -1;
		} else if (btn_Maxmintoptwo_dan_6_int == -1) {
			btn_Maxmintoptwo_dan_6.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_6.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_6_int = btn_Maxmintoptwo_dan_6_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan7() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[7] = changestatus(kilobit[7]);
		if (btn_Maxmintoptwo_dan_7_int == 1) {
			btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_7.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_7_int = btn_Maxmintoptwo_dan_7_int * -1;
		} else if (btn_Maxmintoptwo_dan_7_int == -1) {
			btn_Maxmintoptwo_dan_7.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_7.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_7_int = btn_Maxmintoptwo_dan_7_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan8() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[8] = changestatus(kilobit[8]);
		if (btn_Maxmintoptwo_dan_8_int == 1) {
			btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_8.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_8_int = btn_Maxmintoptwo_dan_8_int * -1;
		} else if (btn_Maxmintoptwo_dan_8_int == -1) {
			btn_Maxmintoptwo_dan_8.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_8.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_8_int = btn_Maxmintoptwo_dan_8_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectdan9() {
		cleardan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[9] = changestatus(kilobit[9]);
		if (btn_Maxmintoptwo_dan_9_int == 1) {
			btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.big_num_on);
			text_Maxmintoptwo_dan_9.setTextColor(0xffffffff);
			btn_Maxmintoptwo_dan_9_int = btn_Maxmintoptwo_dan_9_int * -1;
		} else if (btn_Maxmintoptwo_dan_9_int == -1) {
			btn_Maxmintoptwo_dan_9.setBackgroundResource(R.drawable.round);
			text_Maxmintoptwo_dan_9.setTextColor(0xffdedede);
			btn_Maxmintoptwo_dan_9_int = btn_Maxmintoptwo_dan_9_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void getrand() {
		int randtemp = (int) (Math.random() * 3);
		rand[0] = randtemp;
		for (int i = 1; i < 2; i++) {
			randtemp = (int) (Math.random() * 3);
			if (randtemp == rand[0]) {
				i--;
			} else if (randtemp == rand[1]) {
				i--;
			} else if (randtemp == rand[2]) {
				i--;
			} else if (randtemp == rand[3]) {
				i--;
			} else if (randtemp == rand[4]) {
				i--;
			} else {
				rand[i] = randtemp;
			}
		}
		for (int i = 0; i < 5; i++) {
			Log.d("randtemp", "randtemp" + rand[i]);
		}

	}

	public int combination(int number1, int number2) {
		int combinationresult = 0;
		int temptop = 1;
		int tempbottom = 1;
		for (int i = 1; i <= number2; i++) {
			temptop = temptop * number1;
			number1--;
		}
		for (int i = 1; i <= number2; i++) {
			tempbottom = tempbottom * i;
		}
		combinationresult = temptop / tempbottom;
		return combinationresult;

	}
}
