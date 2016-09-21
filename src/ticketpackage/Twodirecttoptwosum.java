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

public class Twodirecttoptwosum extends BaseFragmentticket implements OnClickListener, OnTouchListener {
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
	private String[] myriabit = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",
			"0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] kilobit = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] hundreds = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] decade = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] tens = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private Vibrator vibrator;
	private int clearint = 1;
	private BaseActivityticket mMainActivity;
	private String TAG = "ghghg";
	private LinearLayout LinearLayout_123;
	private LinearLayout Lin_Twodirecttoptwosum_xuan_two;
	private LinearLayout Lin_Twodirecttoptwosum_xuan_one;
	private LinearLayout Lin_Twodirecttoptwosum_xuan_three;
	private LinearLayout Lin_Twodirecttoptwosum_xuan_four;
	private LinearLayout Lin_Twodirecttoptwosum_xuan_five;
	private Button btn_Twodirecttoptwosum_xuan_0;
	private Button btn_Twodirecttoptwosum_xuan_1;
	private Button btn_Twodirecttoptwosum_xuan_2;
	private Button btn_Twodirecttoptwosum_xuan_3;
	private Button btn_Twodirecttoptwosum_xuan_4;
	private Button btn_Twodirecttoptwosum_xuan_5;
	private Button btn_Twodirecttoptwosum_xuan_6;
	private Button btn_Twodirecttoptwosum_xuan_7;
	private Button btn_Twodirecttoptwosum_xuan_8;
	private Button btn_Twodirecttoptwosum_xuan_9;
	private Button btn_Twodirecttoptwosum_xuan_10;
	private Button btn_Twodirecttoptwosum_xuan_11;
	private Button btn_Twodirecttoptwosum_xuan_12;
	private Button btn_Twodirecttoptwosum_xuan_13;
	private Button btn_Twodirecttoptwosum_xuan_14;
	private Button btn_Twodirecttoptwosum_xuan_15;
	private Button btn_Twodirecttoptwosum_xuan_16;
	private Button btn_Twodirecttoptwosum_xuan_17;
	private Button btn_Twodirecttoptwosum_xuan_18;
	private Button btn_Twodirecttoptwosum_xuan_19;
	private Button btn_Twodirecttoptwosum_xuan_20;
	private Button btn_Twodirecttoptwosum_xuan_21;
	private Button btn_Twodirecttoptwosum_xuan_22;
	private Button btn_Twodirecttoptwosum_xuan_23;
	private Button btn_Twodirecttoptwosum_xuan_24;
	private Button btn_Twodirecttoptwosum_xuan_25;
	private Button btn_Twodirecttoptwosum_xuan_26;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x0;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x1;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x2;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x3;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x4;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x5;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x6;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x7;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x8;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x9;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x10;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x11;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x12;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x13;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x14;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x15;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x16;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x17;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x18;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x19;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x20;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x21;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x22;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x23;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x24;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x25;
	private RelativeLayout btn_Twodirecttoptwosum_xuan_x26;
	private Integer btn_Twodirecttoptwosum_xuan_0_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_1_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_2_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_3_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_4_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_5_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_6_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_7_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_8_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_9_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_10_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_11_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_12_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_13_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_14_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_15_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_16_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_17_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_18_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_19_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_20_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_21_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_22_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_23_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_24_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_25_int = 1;
	private Integer btn_Twodirecttoptwosum_xuan_26_int = 1;
	private TextView text_Twodirecttoptwosum_xuan_0;
	private TextView text_Twodirecttoptwosum_xuan_1;
	private TextView text_Twodirecttoptwosum_xuan_2;
	private TextView text_Twodirecttoptwosum_xuan_3;
	private TextView text_Twodirecttoptwosum_xuan_4;
	private TextView text_Twodirecttoptwosum_xuan_5;
	private TextView text_Twodirecttoptwosum_xuan_6;
	private TextView text_Twodirecttoptwosum_xuan_7;
	private TextView text_Twodirecttoptwosum_xuan_8;
	private TextView text_Twodirecttoptwosum_xuan_9;
	private TextView text_Twodirecttoptwosum_xuan_10;
	private TextView text_Twodirecttoptwosum_xuan_11;
	private TextView text_Twodirecttoptwosum_xuan_12;
	private TextView text_Twodirecttoptwosum_xuan_13;
	private TextView text_Twodirecttoptwosum_xuan_14;
	private TextView text_Twodirecttoptwosum_xuan_15;
	private TextView text_Twodirecttoptwosum_xuan_16;
	private TextView text_Twodirecttoptwosum_xuan_17;
	private TextView text_Twodirecttoptwosum_xuan_18;
	private TextView text_Twodirecttoptwosum_xuan_19;
	private TextView text_Twodirecttoptwosum_xuan_20;
	private TextView text_Twodirecttoptwosum_xuan_21;
	private TextView text_Twodirecttoptwosum_xuan_22;
	private TextView text_Twodirecttoptwosum_xuan_23;
	private TextView text_Twodirecttoptwosum_xuan_24;
	private TextView text_Twodirecttoptwosum_xuan_25;
	private TextView text_Twodirecttoptwosum_xuan_26;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.ticket_two_direct_toptwo_sum, container, false);
		mMainActivity = (BaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		Lin_Twodirecttoptwosum_xuan_one = (LinearLayout) context.findViewById(R.id.Lin_Twodirecttoptwosum_xuan_one);
		Lin_Twodirecttoptwosum_xuan_two = (LinearLayout) context.findViewById(R.id.Lin_Twodirecttoptwosum_xuan_two);
		Lin_Twodirecttoptwosum_xuan_three = (LinearLayout) context.findViewById(R.id.Lin_Twodirecttoptwosum_xuan_three);
		Lin_Twodirecttoptwosum_xuan_four = (LinearLayout) context.findViewById(R.id.Lin_Twodirecttoptwosum_xuan_four);
		Lin_Twodirecttoptwosum_xuan_five = (LinearLayout) context.findViewById(R.id.Lin_Twodirecttoptwosum_xuan_five);
		btn_Twodirecttoptwosum_xuan_0 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_0);
		btn_Twodirecttoptwosum_xuan_1 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_1);
		btn_Twodirecttoptwosum_xuan_2 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_2);
		btn_Twodirecttoptwosum_xuan_3 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_3);
		btn_Twodirecttoptwosum_xuan_4 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_4);
		btn_Twodirecttoptwosum_xuan_5 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_5);
		btn_Twodirecttoptwosum_xuan_6 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_6);
		btn_Twodirecttoptwosum_xuan_7 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_7);
		btn_Twodirecttoptwosum_xuan_8 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_8);
		btn_Twodirecttoptwosum_xuan_9 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_9);
		btn_Twodirecttoptwosum_xuan_10 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_10);
		btn_Twodirecttoptwosum_xuan_11 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_11);
		btn_Twodirecttoptwosum_xuan_12 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_12);
		btn_Twodirecttoptwosum_xuan_13 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_13);
		btn_Twodirecttoptwosum_xuan_14 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_14);
		btn_Twodirecttoptwosum_xuan_15 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_15);
		btn_Twodirecttoptwosum_xuan_16 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_16);
		btn_Twodirecttoptwosum_xuan_17 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_17);
		btn_Twodirecttoptwosum_xuan_18 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_18);
		btn_Twodirecttoptwosum_xuan_19 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_19);
		btn_Twodirecttoptwosum_xuan_20 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_20);
		btn_Twodirecttoptwosum_xuan_21 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_21);
		btn_Twodirecttoptwosum_xuan_22 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_22);
		btn_Twodirecttoptwosum_xuan_23 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_23);
		btn_Twodirecttoptwosum_xuan_24 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_24);
		btn_Twodirecttoptwosum_xuan_25 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_25);
		btn_Twodirecttoptwosum_xuan_26 = (Button) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_26);
		btn_Twodirecttoptwosum_xuan_x0 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x0);
		btn_Twodirecttoptwosum_xuan_x1 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x1);
		btn_Twodirecttoptwosum_xuan_x2 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x2);
		btn_Twodirecttoptwosum_xuan_x3 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x3);
		btn_Twodirecttoptwosum_xuan_x4 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x4);
		btn_Twodirecttoptwosum_xuan_x5 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x5);
		btn_Twodirecttoptwosum_xuan_x6 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x6);
		btn_Twodirecttoptwosum_xuan_x7 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x7);
		btn_Twodirecttoptwosum_xuan_x8 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x8);
		btn_Twodirecttoptwosum_xuan_x9 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x9);
		btn_Twodirecttoptwosum_xuan_x10 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x10);
		btn_Twodirecttoptwosum_xuan_x11 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x11);
		btn_Twodirecttoptwosum_xuan_x12 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x12);
		btn_Twodirecttoptwosum_xuan_x13 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x13);
		btn_Twodirecttoptwosum_xuan_x14 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x14);
		btn_Twodirecttoptwosum_xuan_x15 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x15);
		btn_Twodirecttoptwosum_xuan_x16 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x16);
		btn_Twodirecttoptwosum_xuan_x17 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x17);
		btn_Twodirecttoptwosum_xuan_x18 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x18);
		btn_Twodirecttoptwosum_xuan_x19 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x19);
		btn_Twodirecttoptwosum_xuan_x20 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x20);
		btn_Twodirecttoptwosum_xuan_x21 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x21);
		btn_Twodirecttoptwosum_xuan_x22 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x22);
		btn_Twodirecttoptwosum_xuan_x23 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x23);
		btn_Twodirecttoptwosum_xuan_x24 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x24);
		btn_Twodirecttoptwosum_xuan_x25 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x25);
		btn_Twodirecttoptwosum_xuan_x26 = (RelativeLayout) context.findViewById(R.id.btn_Twodirecttoptwosum_xuan_x26);
		text_Twodirecttoptwosum_xuan_0 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_0);
		text_Twodirecttoptwosum_xuan_1 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_1);
		text_Twodirecttoptwosum_xuan_2 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_2);
		text_Twodirecttoptwosum_xuan_3 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_3);
		text_Twodirecttoptwosum_xuan_4 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_4);
		text_Twodirecttoptwosum_xuan_5 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_5);
		text_Twodirecttoptwosum_xuan_6 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_6);
		text_Twodirecttoptwosum_xuan_7 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_7);
		text_Twodirecttoptwosum_xuan_8 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_8);
		text_Twodirecttoptwosum_xuan_9 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_9);
		text_Twodirecttoptwosum_xuan_10 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_10);
		text_Twodirecttoptwosum_xuan_11 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_11);
		text_Twodirecttoptwosum_xuan_12 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_12);
		text_Twodirecttoptwosum_xuan_13 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_13);
		text_Twodirecttoptwosum_xuan_14 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_14);
		text_Twodirecttoptwosum_xuan_15 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_15);
		text_Twodirecttoptwosum_xuan_16 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_16);
		text_Twodirecttoptwosum_xuan_17 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_17);
		text_Twodirecttoptwosum_xuan_18 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_18);
		text_Twodirecttoptwosum_xuan_19 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_19);
		text_Twodirecttoptwosum_xuan_20 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_20);
		text_Twodirecttoptwosum_xuan_21 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_21);
		text_Twodirecttoptwosum_xuan_22 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_22);
		text_Twodirecttoptwosum_xuan_23 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_23);
		text_Twodirecttoptwosum_xuan_24 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_24);
		text_Twodirecttoptwosum_xuan_25 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_25);
		text_Twodirecttoptwosum_xuan_26 = (TextView) context.findViewById(R.id.text_Twodirecttoptwosum_xuan_26);
		btn_Twodirecttoptwosum_xuan_0.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_1.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_2.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_3.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_4.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_5.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_6.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_7.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_8.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_9.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_10.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_11.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_12.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_13.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_14.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_15.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_16.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_17.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_18.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_19.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_20.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_21.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_22.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_23.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_24.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_25.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_26.setOnTouchListener(this);
		btn_Twodirecttoptwosum_xuan_0.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_1.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_2.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_3.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_4.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_5.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_6.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_7.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_8.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_9.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_10.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_11.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_12.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_13.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_14.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_15.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_16.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_17.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_18.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_19.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_20.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_21.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_22.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_23.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_24.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_25.setOnClickListener(this);
		btn_Twodirecttoptwosum_xuan_26.setOnClickListener(this);
		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_rocknumber = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_rocknumber);
		vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_Twodirecttoptwosum_xuan_clear();
					// getnumber_Twodirecttoptwosum_qian_clear();
					// getnumber_Twodirecttoptwosum_bai_clear();
					// getnumber_Twodirecttoptwosum_shi_clear();
					// getnumber_Twodirecttoptwosum_ge_clear();
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
					getnumber_Twodirecttoptwosum_xuan_clear();
					// getnumber_Twodirecttoptwosum_qian_clear();
					// getnumber_Twodirecttoptwosum_bai_clear();
					// getnumber_Twodirecttoptwosum_shi_clear();
					// getnumber_Twodirecttoptwosum_ge_clear();
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
					getnumber_Twodirecttoptwosum_xuan_clear();
					// getnumber_Twodirecttoptwosum_qian_clear();
					// getnumber_Twodirecttoptwosum_bai_clear();
					// getnumber_Twodirecttoptwosum_shi_clear();
					// getnumber_Twodirecttoptwosum_ge_clear();
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
				getnumber_Twodirecttoptwosum_xuan_clear();
				getrand();
				for (int i = 0; i < 1; i++) {
					int xuan = rand[i];
					switch (xuan) {
					case 0:
						selectxuan0();
						break;
					case 1:
						selectxuan1();
						break;
					case 2:
						selectxuan2();
						break;
					case 3:
						selectxuan3();
						break;
					case 4:
						selectxuan4();
						break;
					case 5:
						selectxuan5();
						break;
					case 6:
						selectxuan6();
						break;
					case 7:
						selectxuan7();
						break;
					case 8:
						selectxuan8();
						break;
					case 9:
						selectxuan9();
						break;
					case 10:
						selectxuan10();
						break;
					case 11:
						selectxuan11();
						break;
					case 12:
						selectxuan12();
						break;
					case 13:
						selectxuan13();
						break;
					case 14:
						selectxuan14();
						break;
					case 15:
						selectxuan15();
						break;
					case 16:
						selectxuan16();
						break;
					case 17:
						selectxuan17();
						break;
					case 18:
						selectxuan18();
						break;
					case 19:
						selectxuan19();
						break;
					case 20:
						selectxuan20();
						break;
					case 21:
						selectxuan21();
						break;
					case 22:
						selectxuan22();
						break;
					case 23:
						selectxuan23();
						break;
					case 24:
						selectxuan24();
						break;
					case 25:
						selectxuan25();
						break;
					case 26:
						selectxuan26();
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

		BaseActivityticket.curFragmentTag = getString(R.string.two_direct_toptwo_sum_name);
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
		getnumber_Twodirecttoptwosum_xuan_clear();
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
		case R.id.btn_Twodirecttoptwosum_xuan_0:
			selectxuan0();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_1:
			selectxuan1();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_2:
			selectxuan2();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_3:
			selectxuan3();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_4:
			selectxuan4();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_5:
			selectxuan5();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_6:
			selectxuan6();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_7:
			selectxuan7();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_8:
			selectxuan8();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_9:
			selectxuan9();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_10:
			selectxuan10();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_11:
			selectxuan11();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_12:
			selectxuan12();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_13:
			selectxuan13();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_14:
			selectxuan14();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_15:
			selectxuan15();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_16:
			selectxuan16();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_17:
			selectxuan17();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_18:
			selectxuan18();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_19:
			selectxuan19();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_20:
			selectxuan20();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_21:
			selectxuan21();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_22:
			selectxuan22();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_23:
			selectxuan23();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_24:
			selectxuan24();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_25:
			selectxuan25();
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_26:
			selectxuan26();
			break;

		default:
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		switch (v.getId()) {
		case R.id.btn_Twodirecttoptwosum_xuan_0:
			int actionTwodirecttoptwosum0 = event.getAction();
			if (actionTwodirecttoptwosum0 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x0.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum0 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x0.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum0 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x0.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_1:
			int actionTwodirecttoptwosum1 = event.getAction();
			if (actionTwodirecttoptwosum1 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x1.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum1 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x1.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum1 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_2:
			int actionTwodirecttoptwosum2 = event.getAction();
			if (actionTwodirecttoptwosum2 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x2.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum2 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x2.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum2 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_3:
			int actionTwodirecttoptwosum3 = event.getAction();
			if (actionTwodirecttoptwosum3 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x3.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum3 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x3.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum3 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_4:
			int actionTwodirecttoptwosum4 = event.getAction();
			if (actionTwodirecttoptwosum4 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x4.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum4 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x4.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum4 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_5:
			int actionTwodirecttoptwosum5 = event.getAction();
			if (actionTwodirecttoptwosum5 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x5.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum5 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x5.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum5 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_6:
			int actionTwodirecttoptwosum6 = event.getAction();
			if (actionTwodirecttoptwosum6 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x6.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum6 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x6.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum6 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_7:
			int actionTwodirecttoptwosum7 = event.getAction();
			if (actionTwodirecttoptwosum7 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x7.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum7 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x7.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum7 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_8:
			int actionTwodirecttoptwosum8 = event.getAction();
			if (actionTwodirecttoptwosum8 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x8.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum8 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x8.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum8 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_9:
			int actionTwodirecttoptwosum9 = event.getAction();
			if (actionTwodirecttoptwosum9 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x9.setVisibility(View.VISIBLE);
			} else if (actionTwodirecttoptwosum9 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x9.setVisibility(View.INVISIBLE);
			} else if (actionTwodirecttoptwosum9 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_10:
			int actionTopthreegroup40 = event.getAction();
			if (actionTopthreegroup40 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x10.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup40 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x10.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup40 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x10.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_11:
			int actionTopthreegroup41 = event.getAction();
			if (actionTopthreegroup41 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x11.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup41 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x11.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup41 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x11.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_12:
			int actionTopthreegroup42 = event.getAction();
			if (actionTopthreegroup42 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x12.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup42 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x12.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup42 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x12.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_13:
			int actionTopthreegroup43 = event.getAction();
			if (actionTopthreegroup43 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x13.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup43 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x13.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup43 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x13.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_14:
			int actionTopthreegroup44 = event.getAction();
			if (actionTopthreegroup44 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x14.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup44 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x14.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup44 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x14.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_15:
			int actionTopthreegroup45 = event.getAction();
			if (actionTopthreegroup45 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x15.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup45 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x15.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup45 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x15.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_16:
			int actionTopthreegroup46 = event.getAction();
			if (actionTopthreegroup46 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x16.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup46 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x16.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup46 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x16.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_17:
			int actionTopthreegroup47 = event.getAction();
			if (actionTopthreegroup47 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x17.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup47 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x17.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup47 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_three.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x17.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_18:
			int actionTopthreegroup48 = event.getAction();
			if (actionTopthreegroup48 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x18.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup48 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x18.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup48 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x18.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_19:
			int actionTopthreegroup49 = event.getAction();
			if (actionTopthreegroup49 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x19.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup49 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x19.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup49 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x19.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_20:
			int actionTopthreegroup50 = event.getAction();
			if (actionTopthreegroup50 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x20.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup50 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x20.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup50 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x20.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_21:
			int actionTopthreegroup51 = event.getAction();
			if (actionTopthreegroup51 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x21.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup51 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x21.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup51 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x21.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_22:
			int actionTopthreegroup52 = event.getAction();
			if (actionTopthreegroup52 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x22.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup52 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x22.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup52 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x22.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_23:
			int actionTopthreegroup53 = event.getAction();
			if (actionTopthreegroup53 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x23.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup53 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x23.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup53 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_four.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x23.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_24:
			int actionTopthreegroup54 = event.getAction();
			if (actionTopthreegroup54 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x24.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup54 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x24.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup54 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x24.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_25:
			int actionTopthreegroup55 = event.getAction();
			if (actionTopthreegroup55 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x25.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup55 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x25.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup55 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x25.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twodirecttoptwosum_xuan_26:
			int actionTopthreegroup56 = event.getAction();
			if (actionTopthreegroup56 == MotionEvent.ACTION_DOWN) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.VISIBLE);
				btn_Twodirecttoptwosum_xuan_x26.setVisibility(View.VISIBLE);
			} else if (actionTopthreegroup56 == MotionEvent.ACTION_UP) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x26.setVisibility(View.INVISIBLE);
			} else if (actionTopthreegroup56 == MotionEvent.ACTION_CANCEL) {
				Lin_Twodirecttoptwosum_xuan_five.setVisibility(View.INVISIBLE);
				btn_Twodirecttoptwosum_xuan_x26.setVisibility(View.INVISIBLE);
			}
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		return false;
	}

	private void getnumber_Twodirecttoptwosum_xuan_clear() {
		btn_Twodirecttoptwosum_xuan_0.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_0.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_1.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_1.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_2.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_2.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_3.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_3.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_4.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_4.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_5.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_5.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_6.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_6.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_7.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_7.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_8.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_8.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_9.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_9.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_10.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_10.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_11.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_11.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_12.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_12.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_13.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_13.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_14.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_14.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_15.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_15.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_16.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_16.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_17.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_17.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_18.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_18.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_19.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_19.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_20.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_20.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_21.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_21.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_22.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_22.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_23.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_23.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_24.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_24.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_25.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_25.setTextColor(0xffdedede);
		btn_Twodirecttoptwosum_xuan_26.setBackgroundResource(R.drawable.round);
		text_Twodirecttoptwosum_xuan_26.setTextColor(0xffdedede);

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
		myriabit[10] = "0";
		myriabit[11] = "0";
		myriabit[12] = "0";
		myriabit[13] = "0";
		myriabit[14] = "0";
		myriabit[15] = "0";
		myriabit[16] = "0";
		myriabit[17] = "0";
		myriabit[18] = "0";
		myriabit[19] = "0";
		myriabit[20] = "0";
		myriabit[21] = "0";
		myriabit[22] = "0";
		myriabit[23] = "0";
		myriabit[24] = "0";
		myriabit[25] = "0";
		myriabit[26] = "0";

		btn_Twodirecttoptwosum_xuan_0_int = 1;
		btn_Twodirecttoptwosum_xuan_1_int = 1;
		btn_Twodirecttoptwosum_xuan_2_int = 1;
		btn_Twodirecttoptwosum_xuan_3_int = 1;
		btn_Twodirecttoptwosum_xuan_4_int = 1;
		btn_Twodirecttoptwosum_xuan_5_int = 1;
		btn_Twodirecttoptwosum_xuan_6_int = 1;
		btn_Twodirecttoptwosum_xuan_7_int = 1;
		btn_Twodirecttoptwosum_xuan_8_int = 1;
		btn_Twodirecttoptwosum_xuan_9_int = 1;
		btn_Twodirecttoptwosum_xuan_10_int = 1;
		btn_Twodirecttoptwosum_xuan_11_int = 1;
		btn_Twodirecttoptwosum_xuan_12_int = 1;
		btn_Twodirecttoptwosum_xuan_13_int = 1;
		btn_Twodirecttoptwosum_xuan_14_int = 1;
		btn_Twodirecttoptwosum_xuan_15_int = 1;
		btn_Twodirecttoptwosum_xuan_16_int = 1;
		btn_Twodirecttoptwosum_xuan_17_int = 1;
		btn_Twodirecttoptwosum_xuan_18_int = 1;
		btn_Twodirecttoptwosum_xuan_19_int = 1;
		btn_Twodirecttoptwosum_xuan_20_int = 1;
		btn_Twodirecttoptwosum_xuan_21_int = 1;
		btn_Twodirecttoptwosum_xuan_22_int = 1;
		btn_Twodirecttoptwosum_xuan_23_int = 1;
		btn_Twodirecttoptwosum_xuan_24_int = 1;
		btn_Twodirecttoptwosum_xuan_25_int = 1;
		btn_Twodirecttoptwosum_xuan_26_int = 1;

		show(myriabit);
	}

	private String getresult() {
		String result = "";
		String result1 = "";
		String result2 = "";
		String result3 = "";
		String result4 = "";
		String result5 = "";
		for (int i = 0; i < 27; i++) {
			if (myriabit[i].equals("1")) {
				result1 = result1 + i + " ";
			}
		}
		// for (int i = 0; i < 10; i++) {
		// if (kilobit[i].equals("1")) {
		// result2 = result2 + i;
		// }
		// }
		// for (int i = 0; i < 10; i++) {
		// if (hundreds[i].equals("1")) {
		// result3 = result3 + i;
		// }
		// }
		// for (int i = 0; i < 10; i++) {
		// if (tens[i].equals("1")) {
		// result4 = result4 + i;
		// }
		// }
		// for (int i = 0; i < 10; i++) {
		// if (decade[i].equals("1")) {
		// result5 = result5 + i;
		// }
		// }
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
		for (int i = 0; i < 27; i++) {
			if (myriabit[i].equals("1")) {
				switch (i) {
				case 0:
					number = number + 1;
					break;
				case 1:
					number = number + 2;
					break;
				case 2:
					number = number + 3;
					break;
				case 3:
					number = number + 4;
					break;
				case 4:
					number = number + 5;
					break;
				case 5:
					number = number + 6;
					break;
				case 6:
					number = number + 7;
					break;
				case 7:
					number = number + 8;
					break;
				case 8:
					number = number + 9;
					break;
				case 9:
					number = number + 10;
					break;
				case 10:
					number = number + 9;
					break;
				case 11:
					number = number + 8;
					break;
				case 12:
					number = number + 7;
					break;
				case 13:
					number = number + 6;
					break;
				case 14:
					number = number + 5;
					break;
				case 15:
					number = number + 4;
					break;
				case 16:
					number = number + 3;
					break;
				case 17:
					number = number + 2;
					break;
				case 18:
					number = number + 1;
					break;
				case 19:
					number = number + 10;
					break;
				case 20:
					number = number + 8;
					break;
				case 21:
					number = number + 6;
					break;
				case 22:
					number = number + 5;
					break;
				case 23:
					number = number + 4;
					break;
				case 24:
					number = number + 2;
					break;
				case 25:
					number = number + 2;
					break;
				case 26:
					number = number + 1;
					break;

				default:
					break;
				}
			}
		}

		// result = result1.length();
		// if (result >= 2) {
		// result = combination(result, 2);
		// } else {
		// result = 0;
		// }
		result = number;
		number = result;
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

	public void selectxuan0() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[0] = changestatus(myriabit[0]);
		if (btn_Twodirecttoptwosum_xuan_0_int == 1) {
			btn_Twodirecttoptwosum_xuan_0.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_0.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_0_int = btn_Twodirecttoptwosum_xuan_0_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_0_int == -1) {
			btn_Twodirecttoptwosum_xuan_0.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_0.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_0_int = btn_Twodirecttoptwosum_xuan_0_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan1() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[1] = changestatus(myriabit[1]);
		if (btn_Twodirecttoptwosum_xuan_1_int == 1) {
			btn_Twodirecttoptwosum_xuan_1.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_1.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_1_int = btn_Twodirecttoptwosum_xuan_1_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_1_int == -1) {
			btn_Twodirecttoptwosum_xuan_1.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_1.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_1_int = btn_Twodirecttoptwosum_xuan_1_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan2() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[2] = changestatus(myriabit[2]);
		if (btn_Twodirecttoptwosum_xuan_2_int == 1) {
			btn_Twodirecttoptwosum_xuan_2.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_2.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_2_int = btn_Twodirecttoptwosum_xuan_2_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_2_int == -1) {
			btn_Twodirecttoptwosum_xuan_2.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_2.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_2_int = btn_Twodirecttoptwosum_xuan_2_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan3() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[3] = changestatus(myriabit[3]);
		if (btn_Twodirecttoptwosum_xuan_3_int == 1) {
			btn_Twodirecttoptwosum_xuan_3.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_3.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_3_int = btn_Twodirecttoptwosum_xuan_3_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_3_int == -1) {
			btn_Twodirecttoptwosum_xuan_3.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_3.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_3_int = btn_Twodirecttoptwosum_xuan_3_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan4() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[4] = changestatus(myriabit[4]);
		if (btn_Twodirecttoptwosum_xuan_4_int == 1) {
			btn_Twodirecttoptwosum_xuan_4.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_4.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_4_int = btn_Twodirecttoptwosum_xuan_4_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_4_int == -1) {
			btn_Twodirecttoptwosum_xuan_4.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_4.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_4_int = btn_Twodirecttoptwosum_xuan_4_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan5() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[5] = changestatus(myriabit[5]);
		if (btn_Twodirecttoptwosum_xuan_5_int == 1) {
			btn_Twodirecttoptwosum_xuan_5.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_5.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_5_int = btn_Twodirecttoptwosum_xuan_5_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_5_int == -1) {
			btn_Twodirecttoptwosum_xuan_5.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_5.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_5_int = btn_Twodirecttoptwosum_xuan_5_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan6() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[6] = changestatus(myriabit[6]);
		if (btn_Twodirecttoptwosum_xuan_6_int == 1) {
			btn_Twodirecttoptwosum_xuan_6.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_6.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_6_int = btn_Twodirecttoptwosum_xuan_6_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_6_int == -1) {
			btn_Twodirecttoptwosum_xuan_6.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_6.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_6_int = btn_Twodirecttoptwosum_xuan_6_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan7() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[7] = changestatus(myriabit[7]);
		if (btn_Twodirecttoptwosum_xuan_7_int == 1) {
			btn_Twodirecttoptwosum_xuan_7.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_7.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_7_int = btn_Twodirecttoptwosum_xuan_7_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_7_int == -1) {
			btn_Twodirecttoptwosum_xuan_7.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_7.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_7_int = btn_Twodirecttoptwosum_xuan_7_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan8() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[8] = changestatus(myriabit[8]);
		if (btn_Twodirecttoptwosum_xuan_8_int == 1) {
			btn_Twodirecttoptwosum_xuan_8.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_8.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_8_int = btn_Twodirecttoptwosum_xuan_8_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_8_int == -1) {
			btn_Twodirecttoptwosum_xuan_8.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_8.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_8_int = btn_Twodirecttoptwosum_xuan_8_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan9() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[9] = changestatus(myriabit[9]);
		if (btn_Twodirecttoptwosum_xuan_9_int == 1) {
			btn_Twodirecttoptwosum_xuan_9.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_9.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_9_int = btn_Twodirecttoptwosum_xuan_9_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_9_int == -1) {
			btn_Twodirecttoptwosum_xuan_9.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_9.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_9_int = btn_Twodirecttoptwosum_xuan_9_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan10() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[10] = changestatus(myriabit[10]);
		if (btn_Twodirecttoptwosum_xuan_10_int == 1) {
			btn_Twodirecttoptwosum_xuan_10.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_10.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_10_int = btn_Twodirecttoptwosum_xuan_10_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_10_int == -1) {
			btn_Twodirecttoptwosum_xuan_10.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_10.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_10_int = btn_Twodirecttoptwosum_xuan_10_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan11() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[11] = changestatus(myriabit[11]);
		if (btn_Twodirecttoptwosum_xuan_11_int == 1) {
			btn_Twodirecttoptwosum_xuan_11.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_11.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_11_int = btn_Twodirecttoptwosum_xuan_11_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_11_int == -1) {
			btn_Twodirecttoptwosum_xuan_11.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_11.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_11_int = btn_Twodirecttoptwosum_xuan_11_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan12() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[12] = changestatus(myriabit[12]);
		if (btn_Twodirecttoptwosum_xuan_12_int == 1) {
			btn_Twodirecttoptwosum_xuan_12.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_12.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_12_int = btn_Twodirecttoptwosum_xuan_12_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_12_int == -1) {
			btn_Twodirecttoptwosum_xuan_12.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_12.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_12_int = btn_Twodirecttoptwosum_xuan_12_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan13() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[13] = changestatus(myriabit[13]);
		if (btn_Twodirecttoptwosum_xuan_13_int == 1) {
			btn_Twodirecttoptwosum_xuan_13.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_13.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_13_int = btn_Twodirecttoptwosum_xuan_13_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_13_int == -1) {
			btn_Twodirecttoptwosum_xuan_13.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_13.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_13_int = btn_Twodirecttoptwosum_xuan_13_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan14() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[14] = changestatus(myriabit[14]);
		if (btn_Twodirecttoptwosum_xuan_14_int == 1) {
			btn_Twodirecttoptwosum_xuan_14.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_14.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_14_int = btn_Twodirecttoptwosum_xuan_14_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_14_int == -1) {
			btn_Twodirecttoptwosum_xuan_14.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_14.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_14_int = btn_Twodirecttoptwosum_xuan_14_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan15() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[15] = changestatus(myriabit[15]);
		if (btn_Twodirecttoptwosum_xuan_15_int == 1) {
			btn_Twodirecttoptwosum_xuan_15.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_15.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_15_int = btn_Twodirecttoptwosum_xuan_15_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_15_int == -1) {
			btn_Twodirecttoptwosum_xuan_15.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_15.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_15_int = btn_Twodirecttoptwosum_xuan_15_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan16() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[16] = changestatus(myriabit[16]);
		if (btn_Twodirecttoptwosum_xuan_16_int == 1) {
			btn_Twodirecttoptwosum_xuan_16.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_16.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_16_int = btn_Twodirecttoptwosum_xuan_16_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_16_int == -1) {
			btn_Twodirecttoptwosum_xuan_16.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_16.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_16_int = btn_Twodirecttoptwosum_xuan_16_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan17() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[17] = changestatus(myriabit[17]);
		if (btn_Twodirecttoptwosum_xuan_17_int == 1) {
			btn_Twodirecttoptwosum_xuan_17.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_17.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_17_int = btn_Twodirecttoptwosum_xuan_17_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_17_int == -1) {
			btn_Twodirecttoptwosum_xuan_17.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_17.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_17_int = btn_Twodirecttoptwosum_xuan_17_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan18() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[18] = changestatus(myriabit[18]);
		if (btn_Twodirecttoptwosum_xuan_18_int == 1) {
			btn_Twodirecttoptwosum_xuan_18.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_18.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_18_int = btn_Twodirecttoptwosum_xuan_18_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_18_int == -1) {
			btn_Twodirecttoptwosum_xuan_18.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_18.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_18_int = btn_Twodirecttoptwosum_xuan_18_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan19() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[19] = changestatus(myriabit[19]);
		if (btn_Twodirecttoptwosum_xuan_19_int == 1) {
			btn_Twodirecttoptwosum_xuan_19.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_19.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_19_int = btn_Twodirecttoptwosum_xuan_19_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_19_int == -1) {
			btn_Twodirecttoptwosum_xuan_19.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_19.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_19_int = btn_Twodirecttoptwosum_xuan_19_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan20() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[20] = changestatus(myriabit[20]);
		if (btn_Twodirecttoptwosum_xuan_20_int == 1) {
			btn_Twodirecttoptwosum_xuan_20.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_20.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_20_int = btn_Twodirecttoptwosum_xuan_20_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_20_int == -1) {
			btn_Twodirecttoptwosum_xuan_20.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_20.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_20_int = btn_Twodirecttoptwosum_xuan_20_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan21() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[21] = changestatus(myriabit[21]);
		if (btn_Twodirecttoptwosum_xuan_21_int == 1) {
			btn_Twodirecttoptwosum_xuan_21.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_21.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_21_int = btn_Twodirecttoptwosum_xuan_21_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_21_int == -1) {
			btn_Twodirecttoptwosum_xuan_21.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_21.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_21_int = btn_Twodirecttoptwosum_xuan_21_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan22() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[22] = changestatus(myriabit[22]);
		if (btn_Twodirecttoptwosum_xuan_22_int == 1) {
			btn_Twodirecttoptwosum_xuan_22.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_22.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_22_int = btn_Twodirecttoptwosum_xuan_22_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_22_int == -1) {
			btn_Twodirecttoptwosum_xuan_22.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_22.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_22_int = btn_Twodirecttoptwosum_xuan_22_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan23() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[23] = changestatus(myriabit[23]);
		if (btn_Twodirecttoptwosum_xuan_23_int == 1) {
			btn_Twodirecttoptwosum_xuan_23.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_23.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_23_int = btn_Twodirecttoptwosum_xuan_23_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_23_int == -1) {
			btn_Twodirecttoptwosum_xuan_23.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_23.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_23_int = btn_Twodirecttoptwosum_xuan_23_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan24() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[24] = changestatus(myriabit[24]);
		if (btn_Twodirecttoptwosum_xuan_24_int == 1) {
			btn_Twodirecttoptwosum_xuan_24.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_24.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_24_int = btn_Twodirecttoptwosum_xuan_24_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_24_int == -1) {
			btn_Twodirecttoptwosum_xuan_24.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_24.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_24_int = btn_Twodirecttoptwosum_xuan_24_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan25() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[25] = changestatus(myriabit[25]);
		if (btn_Twodirecttoptwosum_xuan_25_int == 1) {
			btn_Twodirecttoptwosum_xuan_25.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_25.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_25_int = btn_Twodirecttoptwosum_xuan_25_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_25_int == -1) {
			btn_Twodirecttoptwosum_xuan_25.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_25.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_25_int = btn_Twodirecttoptwosum_xuan_25_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan26() {
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[26] = changestatus(myriabit[26]);
		if (btn_Twodirecttoptwosum_xuan_26_int == 1) {
			btn_Twodirecttoptwosum_xuan_26.setBackgroundResource(R.drawable.big_num_on);
			text_Twodirecttoptwosum_xuan_26.setTextColor(0xffffffff);
			btn_Twodirecttoptwosum_xuan_26_int = btn_Twodirecttoptwosum_xuan_26_int * -1;
		} else if (btn_Twodirecttoptwosum_xuan_26_int == -1) {
			btn_Twodirecttoptwosum_xuan_26.setBackgroundResource(R.drawable.round);
			text_Twodirecttoptwosum_xuan_26.setTextColor(0xffdedede);
			btn_Twodirecttoptwosum_xuan_26_int = btn_Twodirecttoptwosum_xuan_26_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void getrand() {
		int randtemp = (int) (Math.random() * 18);
		rand[0] = randtemp;
		for (int i = 1; i < 5; i++) {
			randtemp = (int) (Math.random() * 18);
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
