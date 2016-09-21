package ticketpackage;

import com.example.lottery.R;

import android.R.raw;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Fixedposition extends BaseFragmentticket implements OnClickListener, OnTouchListener {
	private int number = 0;
	private ImageButton imagebtn_addbasket;
	private LinearLayout LinearLayout_ischoose;
	private LinearLayout LinearLayout_numberbasket;
	private RelativeLayout RelativeLayout_addbasket;
	private LinearLayout LinearLayout_rocknumber;
	private TextView text_chooseend;
	private TextView text_chooseresult;
	private LinearLayout LinearLayout_nochoose;
	private BaseActivityticket mMainActivity;
	private String TAG = "ghghg";
	private LinearLayout Lin_Fixedposition_wan_two;
	private LinearLayout Lin_Fixedposition_wan_one;
	private Button btn_Fixedposition_wan_0;
	private Button btn_Fixedposition_wan_1;
	private Button btn_Fixedposition_wan_2;
	private Button btn_Fixedposition_wan_3;
	private Button btn_Fixedposition_wan_4;
	private Button btn_Fixedposition_wan_5;
	private Button btn_Fixedposition_wan_6;
	private Button btn_Fixedposition_wan_7;
	private Button btn_Fixedposition_wan_8;
	private Button btn_Fixedposition_wan_9;
	private Button btn_Fixedposition_wan_big;
	private Button btn_Fixedposition_wan_little;
	private Button btn_Fixedposition_wan_all;
	private Button btn_Fixedposition_wan_odd;
	private Button btn_Fixedposition_wan_even;
	private Button btn_Fixedposition_wan_clear;
	private RelativeLayout btn_Fixedposition_wan_x0;
	private RelativeLayout btn_Fixedposition_wan_x1;
	private RelativeLayout btn_Fixedposition_wan_x2;
	private RelativeLayout btn_Fixedposition_wan_x3;
	private RelativeLayout btn_Fixedposition_wan_x4;
	private RelativeLayout btn_Fixedposition_wan_x5;
	private RelativeLayout btn_Fixedposition_wan_x6;
	private RelativeLayout btn_Fixedposition_wan_x7;
	private RelativeLayout btn_Fixedposition_wan_x8;
	private RelativeLayout btn_Fixedposition_wan_x9;
	private Integer btn_Fixedposition_wan_0_int = 1;
	private Integer btn_Fixedposition_wan_1_int = 1;
	private Integer btn_Fixedposition_wan_2_int = 1;
	private Integer btn_Fixedposition_wan_3_int = 1;
	private Integer btn_Fixedposition_wan_4_int = 1;
	private Integer btn_Fixedposition_wan_5_int = 1;
	private Integer btn_Fixedposition_wan_6_int = 1;
	private Integer btn_Fixedposition_wan_7_int = 1;
	private Integer btn_Fixedposition_wan_8_int = 1;
	private Integer btn_Fixedposition_wan_9_int = 1;
	private TextView text_Fixedposition_wan_0;
	private TextView text_Fixedposition_wan_1;
	private TextView text_Fixedposition_wan_2;
	private TextView text_Fixedposition_wan_3;
	private TextView text_Fixedposition_wan_4;
	private TextView text_Fixedposition_wan_5;
	private TextView text_Fixedposition_wan_6;
	private TextView text_Fixedposition_wan_7;
	private TextView text_Fixedposition_wan_8;
	private TextView text_Fixedposition_wan_9;
	private LinearLayout Lin_Fixedposition_qian_two;
	private LinearLayout Lin_Fixedposition_qian_one;
	private Button btn_Fixedposition_qian_0;
	private Button btn_Fixedposition_qian_1;
	private Button btn_Fixedposition_qian_2;
	private Button btn_Fixedposition_qian_3;
	private Button btn_Fixedposition_qian_4;
	private Button btn_Fixedposition_qian_5;
	private Button btn_Fixedposition_qian_6;
	private Button btn_Fixedposition_qian_7;
	private Button btn_Fixedposition_qian_8;
	private Button btn_Fixedposition_qian_9;
	private Button btn_Fixedposition_qian_big;
	private Button btn_Fixedposition_qian_little;
	private Button btn_Fixedposition_qian_all;
	private Button btn_Fixedposition_qian_odd;
	private Button btn_Fixedposition_qian_even;
	private Button btn_Fixedposition_qian_clear;
	private RelativeLayout btn_Fixedposition_qian_x0;
	private RelativeLayout btn_Fixedposition_qian_x1;
	private RelativeLayout btn_Fixedposition_qian_x2;
	private RelativeLayout btn_Fixedposition_qian_x3;
	private RelativeLayout btn_Fixedposition_qian_x4;
	private RelativeLayout btn_Fixedposition_qian_x5;
	private RelativeLayout btn_Fixedposition_qian_x6;
	private RelativeLayout btn_Fixedposition_qian_x7;
	private RelativeLayout btn_Fixedposition_qian_x8;
	private RelativeLayout btn_Fixedposition_qian_x9;
	private Integer btn_Fixedposition_qian_0_int = 1;
	private Integer btn_Fixedposition_qian_1_int = 1;
	private Integer btn_Fixedposition_qian_2_int = 1;
	private Integer btn_Fixedposition_qian_3_int = 1;
	private Integer btn_Fixedposition_qian_4_int = 1;
	private Integer btn_Fixedposition_qian_5_int = 1;
	private Integer btn_Fixedposition_qian_6_int = 1;
	private Integer btn_Fixedposition_qian_7_int = 1;
	private Integer btn_Fixedposition_qian_8_int = 1;
	private Integer btn_Fixedposition_qian_9_int = 1;
	private TextView text_Fixedposition_qian_0;
	private TextView text_Fixedposition_qian_1;
	private TextView text_Fixedposition_qian_2;
	private TextView text_Fixedposition_qian_3;
	private TextView text_Fixedposition_qian_4;
	private TextView text_Fixedposition_qian_5;
	private TextView text_Fixedposition_qian_6;
	private TextView text_Fixedposition_qian_7;
	private TextView text_Fixedposition_qian_8;
	private TextView text_Fixedposition_qian_9;
	private LinearLayout Lin_Fixedposition_bai_two;
	private LinearLayout Lin_Fixedposition_bai_one;
	private Button btn_Fixedposition_bai_0;
	private Button btn_Fixedposition_bai_1;
	private Button btn_Fixedposition_bai_2;
	private Button btn_Fixedposition_bai_3;
	private Button btn_Fixedposition_bai_4;
	private Button btn_Fixedposition_bai_5;
	private Button btn_Fixedposition_bai_6;
	private Button btn_Fixedposition_bai_7;
	private Button btn_Fixedposition_bai_8;
	private Button btn_Fixedposition_bai_9;
	private Button btn_Fixedposition_bai_big;
	private Button btn_Fixedposition_bai_little;
	private Button btn_Fixedposition_bai_all;
	private Button btn_Fixedposition_bai_odd;
	private Button btn_Fixedposition_bai_even;
	private Button btn_Fixedposition_bai_clear;
	private RelativeLayout btn_Fixedposition_bai_x0;
	private RelativeLayout btn_Fixedposition_bai_x1;
	private RelativeLayout btn_Fixedposition_bai_x2;
	private RelativeLayout btn_Fixedposition_bai_x3;
	private RelativeLayout btn_Fixedposition_bai_x4;
	private RelativeLayout btn_Fixedposition_bai_x5;
	private RelativeLayout btn_Fixedposition_bai_x6;
	private RelativeLayout btn_Fixedposition_bai_x7;
	private RelativeLayout btn_Fixedposition_bai_x8;
	private RelativeLayout btn_Fixedposition_bai_x9;
	private Integer btn_Fixedposition_bai_0_int = 1;
	private Integer btn_Fixedposition_bai_1_int = 1;
	private Integer btn_Fixedposition_bai_2_int = 1;
	private Integer btn_Fixedposition_bai_3_int = 1;
	private Integer btn_Fixedposition_bai_4_int = 1;
	private Integer btn_Fixedposition_bai_5_int = 1;
	private Integer btn_Fixedposition_bai_6_int = 1;
	private Integer btn_Fixedposition_bai_7_int = 1;
	private Integer btn_Fixedposition_bai_8_int = 1;
	private Integer btn_Fixedposition_bai_9_int = 1;
	private TextView text_Fixedposition_bai_0;
	private TextView text_Fixedposition_bai_1;
	private TextView text_Fixedposition_bai_2;
	private TextView text_Fixedposition_bai_3;
	private TextView text_Fixedposition_bai_4;
	private TextView text_Fixedposition_bai_5;
	private TextView text_Fixedposition_bai_6;
	private TextView text_Fixedposition_bai_7;
	private TextView text_Fixedposition_bai_8;
	private TextView text_Fixedposition_bai_9;
	private LinearLayout Lin_Fixedposition_shi_two;
	private LinearLayout Lin_Fixedposition_shi_one;
	private Button btn_Fixedposition_shi_0;
	private Button btn_Fixedposition_shi_1;
	private Button btn_Fixedposition_shi_2;
	private Button btn_Fixedposition_shi_3;
	private Button btn_Fixedposition_shi_4;
	private Button btn_Fixedposition_shi_5;
	private Button btn_Fixedposition_shi_6;
	private Button btn_Fixedposition_shi_7;
	private Button btn_Fixedposition_shi_8;
	private Button btn_Fixedposition_shi_9;
	private Button btn_Fixedposition_shi_big;
	private Button btn_Fixedposition_shi_little;
	private Button btn_Fixedposition_shi_all;
	private Button btn_Fixedposition_shi_odd;
	private Button btn_Fixedposition_shi_even;
	private Button btn_Fixedposition_shi_clear;
	private RelativeLayout btn_Fixedposition_shi_x0;
	private RelativeLayout btn_Fixedposition_shi_x1;
	private RelativeLayout btn_Fixedposition_shi_x2;
	private RelativeLayout btn_Fixedposition_shi_x3;
	private RelativeLayout btn_Fixedposition_shi_x4;
	private RelativeLayout btn_Fixedposition_shi_x5;
	private RelativeLayout btn_Fixedposition_shi_x6;
	private RelativeLayout btn_Fixedposition_shi_x7;
	private RelativeLayout btn_Fixedposition_shi_x8;
	private RelativeLayout btn_Fixedposition_shi_x9;
	private Integer btn_Fixedposition_shi_0_int = 1;
	private Integer btn_Fixedposition_shi_1_int = 1;
	private Integer btn_Fixedposition_shi_2_int = 1;
	private Integer btn_Fixedposition_shi_3_int = 1;
	private Integer btn_Fixedposition_shi_4_int = 1;
	private Integer btn_Fixedposition_shi_5_int = 1;
	private Integer btn_Fixedposition_shi_6_int = 1;
	private Integer btn_Fixedposition_shi_7_int = 1;
	private Integer btn_Fixedposition_shi_8_int = 1;
	private Integer btn_Fixedposition_shi_9_int = 1;
	private TextView text_Fixedposition_shi_0;
	private TextView text_Fixedposition_shi_1;
	private TextView text_Fixedposition_shi_2;
	private TextView text_Fixedposition_shi_3;
	private TextView text_Fixedposition_shi_4;
	private TextView text_Fixedposition_shi_5;
	private TextView text_Fixedposition_shi_6;
	private TextView text_Fixedposition_shi_7;
	private TextView text_Fixedposition_shi_8;
	private TextView text_Fixedposition_shi_9;
	private LinearLayout Lin_Fixedposition_ge_two;
	private LinearLayout Lin_Fixedposition_ge_one;
	private Button btn_Fixedposition_ge_0;
	private Button btn_Fixedposition_ge_1;
	private Button btn_Fixedposition_ge_2;
	private Button btn_Fixedposition_ge_3;
	private Button btn_Fixedposition_ge_4;
	private Button btn_Fixedposition_ge_5;
	private Button btn_Fixedposition_ge_6;
	private Button btn_Fixedposition_ge_7;
	private Button btn_Fixedposition_ge_8;
	private Button btn_Fixedposition_ge_9;
	private Button btn_Fixedposition_ge_big;
	private Button btn_Fixedposition_ge_little;
	private Button btn_Fixedposition_ge_all;
	private Button btn_Fixedposition_ge_odd;
	private Button btn_Fixedposition_ge_even;
	private Button btn_Fixedposition_ge_clear;
	private RelativeLayout btn_Fixedposition_ge_x0;
	private RelativeLayout btn_Fixedposition_ge_x1;
	private RelativeLayout btn_Fixedposition_ge_x2;
	private RelativeLayout btn_Fixedposition_ge_x3;
	private RelativeLayout btn_Fixedposition_ge_x4;
	private RelativeLayout btn_Fixedposition_ge_x5;
	private RelativeLayout btn_Fixedposition_ge_x6;
	private RelativeLayout btn_Fixedposition_ge_x7;
	private RelativeLayout btn_Fixedposition_ge_x8;
	private RelativeLayout btn_Fixedposition_ge_x9;
	private Integer btn_Fixedposition_ge_0_int = 1;
	private Integer btn_Fixedposition_ge_1_int = 1;
	private Integer btn_Fixedposition_ge_2_int = 1;
	private Integer btn_Fixedposition_ge_3_int = 1;
	private Integer btn_Fixedposition_ge_4_int = 1;
	private Integer btn_Fixedposition_ge_5_int = 1;
	private Integer btn_Fixedposition_ge_6_int = 1;
	private Integer btn_Fixedposition_ge_7_int = 1;
	private Integer btn_Fixedposition_ge_8_int = 1;
	private Integer btn_Fixedposition_ge_9_int = 1;
	private TextView text_Fixedposition_ge_0;
	private TextView text_Fixedposition_ge_1;
	private TextView text_Fixedposition_ge_2;
	private TextView text_Fixedposition_ge_3;
	private TextView text_Fixedposition_ge_4;
	private TextView text_Fixedposition_ge_5;
	private TextView text_Fixedposition_ge_6;
	private TextView text_Fixedposition_ge_7;
	private TextView text_Fixedposition_ge_8;
	private TextView text_Fixedposition_ge_9;
	private String[] myriabit = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] kilobit = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] hundreds = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] decade = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private String[] tens = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
	private Vibrator vibrator;
	private int clearint = 1;
	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 1:
				Log.d("msg.what", "msg.what");

				Log.d("clearint.clearint", "clearint.clearint");
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + msg.arg1);
				System.out.println("msg.arg2:" + msg.arg2);
				go();

				// address.this.statusTextView.setText("�ļ��������");
				break;
			case 2:
				Log.d("msg.what", "msg.what");

				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + msg.arg1);
				System.out.println("msg.arg2:" + msg.arg2);
				btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);

				// address.this.statusTextView.setText("�ļ��������");
				break;
			}
		}
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.ticket_fixed_position, container, false);
		mMainActivity = (BaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		RelativeLayout_addbasket = (RelativeLayout) context.findViewById(R.id.RelativeLayout_addbasket);

		text_chooseend = (TextView) context.findViewById(R.id.text_chooseend);
		text_chooseresult = (TextView) context.findViewById(R.id.text_chooseresult);
		LinearLayout_nochoose = (LinearLayout) context.findViewById(R.id.LinearLayout_nochoose);
		vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

		Lin_Fixedposition_wan_one = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_wan_one);
		Lin_Fixedposition_wan_two = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_wan_two);
		btn_Fixedposition_wan_0 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_0);
		btn_Fixedposition_wan_1 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_1);
		btn_Fixedposition_wan_2 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_2);
		btn_Fixedposition_wan_3 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_3);
		btn_Fixedposition_wan_4 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_4);
		btn_Fixedposition_wan_5 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_5);
		btn_Fixedposition_wan_6 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_6);
		btn_Fixedposition_wan_7 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_7);
		btn_Fixedposition_wan_8 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_8);
		btn_Fixedposition_wan_9 = (Button) context.findViewById(R.id.btn_Fixedposition_wan_9);
		btn_Fixedposition_wan_x0 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x0);
		btn_Fixedposition_wan_x1 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x1);
		btn_Fixedposition_wan_x2 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x2);
		btn_Fixedposition_wan_x3 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x3);
		btn_Fixedposition_wan_x4 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x4);
		btn_Fixedposition_wan_x5 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x5);
		btn_Fixedposition_wan_x6 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x6);
		btn_Fixedposition_wan_x7 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x7);
		btn_Fixedposition_wan_x8 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x8);
		btn_Fixedposition_wan_x9 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_wan_x9);
		text_Fixedposition_wan_0 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_0);
		text_Fixedposition_wan_1 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_1);
		text_Fixedposition_wan_2 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_2);
		text_Fixedposition_wan_3 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_3);
		text_Fixedposition_wan_4 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_4);
		text_Fixedposition_wan_5 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_5);
		text_Fixedposition_wan_6 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_6);
		text_Fixedposition_wan_7 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_7);
		text_Fixedposition_wan_8 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_8);
		text_Fixedposition_wan_9 = (TextView) context.findViewById(R.id.text_Fixedposition_wan_9);
		btn_Fixedposition_wan_big = (Button) context.findViewById(R.id.btn_Fixedposition_wan_big);
		btn_Fixedposition_wan_little = (Button) context.findViewById(R.id.btn_Fixedposition_wan_little);
		btn_Fixedposition_wan_all = (Button) context.findViewById(R.id.btn_Fixedposition_wan_all);
		btn_Fixedposition_wan_odd = (Button) context.findViewById(R.id.btn_Fixedposition_wan_odd);
		btn_Fixedposition_wan_even = (Button) context.findViewById(R.id.btn_Fixedposition_wan_even);
		btn_Fixedposition_wan_clear = (Button) context.findViewById(R.id.btn_Fixedposition_wan_clear);

		btn_Fixedposition_wan_0.setOnTouchListener(this);
		btn_Fixedposition_wan_1.setOnTouchListener(this);
		btn_Fixedposition_wan_2.setOnTouchListener(this);
		btn_Fixedposition_wan_3.setOnTouchListener(this);
		btn_Fixedposition_wan_4.setOnTouchListener(this);
		btn_Fixedposition_wan_5.setOnTouchListener(this);
		btn_Fixedposition_wan_6.setOnTouchListener(this);
		btn_Fixedposition_wan_7.setOnTouchListener(this);
		btn_Fixedposition_wan_8.setOnTouchListener(this);
		btn_Fixedposition_wan_9.setOnTouchListener(this);
		btn_Fixedposition_wan_0.setOnClickListener(this);
		btn_Fixedposition_wan_1.setOnClickListener(this);
		btn_Fixedposition_wan_2.setOnClickListener(this);
		btn_Fixedposition_wan_3.setOnClickListener(this);
		btn_Fixedposition_wan_4.setOnClickListener(this);
		btn_Fixedposition_wan_5.setOnClickListener(this);
		btn_Fixedposition_wan_6.setOnClickListener(this);
		btn_Fixedposition_wan_7.setOnClickListener(this);
		btn_Fixedposition_wan_8.setOnClickListener(this);
		btn_Fixedposition_wan_9.setOnClickListener(this);
		btn_Fixedposition_wan_big.setOnClickListener(this);
		btn_Fixedposition_wan_little.setOnClickListener(this);
		btn_Fixedposition_wan_all.setOnClickListener(this);
		btn_Fixedposition_wan_odd.setOnClickListener(this);
		btn_Fixedposition_wan_even.setOnClickListener(this);
		btn_Fixedposition_wan_clear.setOnClickListener(this);
		Lin_Fixedposition_qian_one = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_qian_one);
		Lin_Fixedposition_qian_two = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_qian_two);
		btn_Fixedposition_qian_0 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_0);
		btn_Fixedposition_qian_1 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_1);
		btn_Fixedposition_qian_2 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_2);
		btn_Fixedposition_qian_3 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_3);
		btn_Fixedposition_qian_4 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_4);
		btn_Fixedposition_qian_5 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_5);
		btn_Fixedposition_qian_6 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_6);
		btn_Fixedposition_qian_7 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_7);
		btn_Fixedposition_qian_8 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_8);
		btn_Fixedposition_qian_9 = (Button) context.findViewById(R.id.btn_Fixedposition_qian_9);
		btn_Fixedposition_qian_x0 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x0);
		btn_Fixedposition_qian_x1 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x1);
		btn_Fixedposition_qian_x2 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x2);
		btn_Fixedposition_qian_x3 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x3);
		btn_Fixedposition_qian_x4 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x4);
		btn_Fixedposition_qian_x5 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x5);
		btn_Fixedposition_qian_x6 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x6);
		btn_Fixedposition_qian_x7 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x7);
		btn_Fixedposition_qian_x8 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x8);
		btn_Fixedposition_qian_x9 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_qian_x9);
		text_Fixedposition_qian_0 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_0);
		text_Fixedposition_qian_1 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_1);
		text_Fixedposition_qian_2 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_2);
		text_Fixedposition_qian_3 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_3);
		text_Fixedposition_qian_4 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_4);
		text_Fixedposition_qian_5 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_5);
		text_Fixedposition_qian_6 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_6);
		text_Fixedposition_qian_7 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_7);
		text_Fixedposition_qian_8 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_8);
		text_Fixedposition_qian_9 = (TextView) context.findViewById(R.id.text_Fixedposition_qian_9);
		btn_Fixedposition_qian_big = (Button) context.findViewById(R.id.btn_Fixedposition_qian_big);
		btn_Fixedposition_qian_little = (Button) context.findViewById(R.id.btn_Fixedposition_qian_little);
		btn_Fixedposition_qian_all = (Button) context.findViewById(R.id.btn_Fixedposition_qian_all);
		btn_Fixedposition_qian_odd = (Button) context.findViewById(R.id.btn_Fixedposition_qian_odd);
		btn_Fixedposition_qian_even = (Button) context.findViewById(R.id.btn_Fixedposition_qian_even);
		btn_Fixedposition_qian_clear = (Button) context.findViewById(R.id.btn_Fixedposition_qian_clear);

		btn_Fixedposition_qian_0.setOnTouchListener(this);
		btn_Fixedposition_qian_1.setOnTouchListener(this);
		btn_Fixedposition_qian_2.setOnTouchListener(this);
		btn_Fixedposition_qian_3.setOnTouchListener(this);
		btn_Fixedposition_qian_4.setOnTouchListener(this);
		btn_Fixedposition_qian_5.setOnTouchListener(this);
		btn_Fixedposition_qian_6.setOnTouchListener(this);
		btn_Fixedposition_qian_7.setOnTouchListener(this);
		btn_Fixedposition_qian_8.setOnTouchListener(this);
		btn_Fixedposition_qian_9.setOnTouchListener(this);
		btn_Fixedposition_qian_0.setOnClickListener(this);
		btn_Fixedposition_qian_1.setOnClickListener(this);
		btn_Fixedposition_qian_2.setOnClickListener(this);
		btn_Fixedposition_qian_3.setOnClickListener(this);
		btn_Fixedposition_qian_4.setOnClickListener(this);
		btn_Fixedposition_qian_5.setOnClickListener(this);
		btn_Fixedposition_qian_6.setOnClickListener(this);
		btn_Fixedposition_qian_7.setOnClickListener(this);
		btn_Fixedposition_qian_8.setOnClickListener(this);
		btn_Fixedposition_qian_9.setOnClickListener(this);
		btn_Fixedposition_qian_big.setOnClickListener(this);
		btn_Fixedposition_qian_little.setOnClickListener(this);
		btn_Fixedposition_qian_all.setOnClickListener(this);
		btn_Fixedposition_qian_odd.setOnClickListener(this);
		btn_Fixedposition_qian_even.setOnClickListener(this);
		btn_Fixedposition_qian_clear.setOnClickListener(this);
		Lin_Fixedposition_bai_one = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_bai_one);
		Lin_Fixedposition_bai_two = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_bai_two);
		btn_Fixedposition_bai_0 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_0);
		btn_Fixedposition_bai_1 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_1);
		btn_Fixedposition_bai_2 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_2);
		btn_Fixedposition_bai_3 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_3);
		btn_Fixedposition_bai_4 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_4);
		btn_Fixedposition_bai_5 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_5);
		btn_Fixedposition_bai_6 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_6);
		btn_Fixedposition_bai_7 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_7);
		btn_Fixedposition_bai_8 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_8);
		btn_Fixedposition_bai_9 = (Button) context.findViewById(R.id.btn_Fixedposition_bai_9);
		btn_Fixedposition_bai_x0 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x0);
		btn_Fixedposition_bai_x1 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x1);
		btn_Fixedposition_bai_x2 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x2);
		btn_Fixedposition_bai_x3 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x3);
		btn_Fixedposition_bai_x4 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x4);
		btn_Fixedposition_bai_x5 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x5);
		btn_Fixedposition_bai_x6 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x6);
		btn_Fixedposition_bai_x7 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x7);
		btn_Fixedposition_bai_x8 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x8);
		btn_Fixedposition_bai_x9 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_bai_x9);
		text_Fixedposition_bai_0 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_0);
		text_Fixedposition_bai_1 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_1);
		text_Fixedposition_bai_2 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_2);
		text_Fixedposition_bai_3 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_3);
		text_Fixedposition_bai_4 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_4);
		text_Fixedposition_bai_5 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_5);
		text_Fixedposition_bai_6 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_6);
		text_Fixedposition_bai_7 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_7);
		text_Fixedposition_bai_8 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_8);
		text_Fixedposition_bai_9 = (TextView) context.findViewById(R.id.text_Fixedposition_bai_9);
		btn_Fixedposition_bai_big = (Button) context.findViewById(R.id.btn_Fixedposition_bai_big);
		btn_Fixedposition_bai_little = (Button) context.findViewById(R.id.btn_Fixedposition_bai_little);
		btn_Fixedposition_bai_all = (Button) context.findViewById(R.id.btn_Fixedposition_bai_all);
		btn_Fixedposition_bai_odd = (Button) context.findViewById(R.id.btn_Fixedposition_bai_odd);
		btn_Fixedposition_bai_even = (Button) context.findViewById(R.id.btn_Fixedposition_bai_even);
		btn_Fixedposition_bai_clear = (Button) context.findViewById(R.id.btn_Fixedposition_bai_clear);

		btn_Fixedposition_bai_0.setOnTouchListener(this);
		btn_Fixedposition_bai_1.setOnTouchListener(this);
		btn_Fixedposition_bai_2.setOnTouchListener(this);
		btn_Fixedposition_bai_3.setOnTouchListener(this);
		btn_Fixedposition_bai_4.setOnTouchListener(this);
		btn_Fixedposition_bai_5.setOnTouchListener(this);
		btn_Fixedposition_bai_6.setOnTouchListener(this);
		btn_Fixedposition_bai_7.setOnTouchListener(this);
		btn_Fixedposition_bai_8.setOnTouchListener(this);
		btn_Fixedposition_bai_9.setOnTouchListener(this);
		btn_Fixedposition_bai_0.setOnClickListener(this);
		btn_Fixedposition_bai_1.setOnClickListener(this);
		btn_Fixedposition_bai_2.setOnClickListener(this);
		btn_Fixedposition_bai_3.setOnClickListener(this);
		btn_Fixedposition_bai_4.setOnClickListener(this);
		btn_Fixedposition_bai_5.setOnClickListener(this);
		btn_Fixedposition_bai_6.setOnClickListener(this);
		btn_Fixedposition_bai_7.setOnClickListener(this);
		btn_Fixedposition_bai_8.setOnClickListener(this);
		btn_Fixedposition_bai_9.setOnClickListener(this);
		btn_Fixedposition_bai_big.setOnClickListener(this);
		btn_Fixedposition_bai_little.setOnClickListener(this);
		btn_Fixedposition_bai_all.setOnClickListener(this);
		btn_Fixedposition_bai_odd.setOnClickListener(this);
		btn_Fixedposition_bai_even.setOnClickListener(this);
		btn_Fixedposition_bai_clear.setOnClickListener(this);
		Lin_Fixedposition_shi_one = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_shi_one);
		Lin_Fixedposition_shi_two = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_shi_two);
		btn_Fixedposition_shi_0 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_0);
		btn_Fixedposition_shi_1 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_1);
		btn_Fixedposition_shi_2 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_2);
		btn_Fixedposition_shi_3 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_3);
		btn_Fixedposition_shi_4 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_4);
		btn_Fixedposition_shi_5 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_5);
		btn_Fixedposition_shi_6 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_6);
		btn_Fixedposition_shi_7 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_7);
		btn_Fixedposition_shi_8 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_8);
		btn_Fixedposition_shi_9 = (Button) context.findViewById(R.id.btn_Fixedposition_shi_9);
		btn_Fixedposition_shi_x0 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x0);
		btn_Fixedposition_shi_x1 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x1);
		btn_Fixedposition_shi_x2 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x2);
		btn_Fixedposition_shi_x3 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x3);
		btn_Fixedposition_shi_x4 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x4);
		btn_Fixedposition_shi_x5 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x5);
		btn_Fixedposition_shi_x6 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x6);
		btn_Fixedposition_shi_x7 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x7);
		btn_Fixedposition_shi_x8 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x8);
		btn_Fixedposition_shi_x9 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_shi_x9);
		text_Fixedposition_shi_0 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_0);
		text_Fixedposition_shi_1 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_1);
		text_Fixedposition_shi_2 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_2);
		text_Fixedposition_shi_3 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_3);
		text_Fixedposition_shi_4 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_4);
		text_Fixedposition_shi_5 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_5);
		text_Fixedposition_shi_6 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_6);
		text_Fixedposition_shi_7 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_7);
		text_Fixedposition_shi_8 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_8);
		text_Fixedposition_shi_9 = (TextView) context.findViewById(R.id.text_Fixedposition_shi_9);
		btn_Fixedposition_shi_big = (Button) context.findViewById(R.id.btn_Fixedposition_shi_big);
		btn_Fixedposition_shi_little = (Button) context.findViewById(R.id.btn_Fixedposition_shi_little);
		btn_Fixedposition_shi_all = (Button) context.findViewById(R.id.btn_Fixedposition_shi_all);
		btn_Fixedposition_shi_odd = (Button) context.findViewById(R.id.btn_Fixedposition_shi_odd);
		btn_Fixedposition_shi_even = (Button) context.findViewById(R.id.btn_Fixedposition_shi_even);
		btn_Fixedposition_shi_clear = (Button) context.findViewById(R.id.btn_Fixedposition_shi_clear);

		btn_Fixedposition_shi_0.setOnTouchListener(this);
		btn_Fixedposition_shi_1.setOnTouchListener(this);
		btn_Fixedposition_shi_2.setOnTouchListener(this);
		btn_Fixedposition_shi_3.setOnTouchListener(this);
		btn_Fixedposition_shi_4.setOnTouchListener(this);
		btn_Fixedposition_shi_5.setOnTouchListener(this);
		btn_Fixedposition_shi_6.setOnTouchListener(this);
		btn_Fixedposition_shi_7.setOnTouchListener(this);
		btn_Fixedposition_shi_8.setOnTouchListener(this);
		btn_Fixedposition_shi_9.setOnTouchListener(this);
		btn_Fixedposition_shi_0.setOnClickListener(this);
		btn_Fixedposition_shi_1.setOnClickListener(this);
		btn_Fixedposition_shi_2.setOnClickListener(this);
		btn_Fixedposition_shi_3.setOnClickListener(this);
		btn_Fixedposition_shi_4.setOnClickListener(this);
		btn_Fixedposition_shi_5.setOnClickListener(this);
		btn_Fixedposition_shi_6.setOnClickListener(this);
		btn_Fixedposition_shi_7.setOnClickListener(this);
		btn_Fixedposition_shi_8.setOnClickListener(this);
		btn_Fixedposition_shi_9.setOnClickListener(this);
		btn_Fixedposition_shi_big.setOnClickListener(this);
		btn_Fixedposition_shi_little.setOnClickListener(this);
		btn_Fixedposition_shi_all.setOnClickListener(this);
		btn_Fixedposition_shi_odd.setOnClickListener(this);
		btn_Fixedposition_shi_even.setOnClickListener(this);
		btn_Fixedposition_shi_clear.setOnClickListener(this);
		Lin_Fixedposition_ge_one = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_ge_one);
		Lin_Fixedposition_ge_two = (LinearLayout) context.findViewById(R.id.Lin_Fixedposition_ge_two);
		btn_Fixedposition_ge_0 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_0);
		btn_Fixedposition_ge_1 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_1);
		btn_Fixedposition_ge_2 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_2);
		btn_Fixedposition_ge_3 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_3);
		btn_Fixedposition_ge_4 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_4);
		btn_Fixedposition_ge_5 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_5);
		btn_Fixedposition_ge_6 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_6);
		btn_Fixedposition_ge_7 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_7);
		btn_Fixedposition_ge_8 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_8);
		btn_Fixedposition_ge_9 = (Button) context.findViewById(R.id.btn_Fixedposition_ge_9);
		btn_Fixedposition_ge_x0 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x0);
		btn_Fixedposition_ge_x1 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x1);
		btn_Fixedposition_ge_x2 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x2);
		btn_Fixedposition_ge_x3 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x3);
		btn_Fixedposition_ge_x4 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x4);
		btn_Fixedposition_ge_x5 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x5);
		btn_Fixedposition_ge_x6 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x6);
		btn_Fixedposition_ge_x7 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x7);
		btn_Fixedposition_ge_x8 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x8);
		btn_Fixedposition_ge_x9 = (RelativeLayout) context.findViewById(R.id.btn_Fixedposition_ge_x9);
		text_Fixedposition_ge_0 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_0);
		text_Fixedposition_ge_1 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_1);
		text_Fixedposition_ge_2 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_2);
		text_Fixedposition_ge_3 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_3);
		text_Fixedposition_ge_4 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_4);
		text_Fixedposition_ge_5 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_5);
		text_Fixedposition_ge_6 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_6);
		text_Fixedposition_ge_7 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_7);
		text_Fixedposition_ge_8 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_8);
		text_Fixedposition_ge_9 = (TextView) context.findViewById(R.id.text_Fixedposition_ge_9);
		btn_Fixedposition_ge_big = (Button) context.findViewById(R.id.btn_Fixedposition_ge_big);
		btn_Fixedposition_ge_little = (Button) context.findViewById(R.id.btn_Fixedposition_ge_little);
		btn_Fixedposition_ge_all = (Button) context.findViewById(R.id.btn_Fixedposition_ge_all);
		btn_Fixedposition_ge_odd = (Button) context.findViewById(R.id.btn_Fixedposition_ge_odd);
		btn_Fixedposition_ge_even = (Button) context.findViewById(R.id.btn_Fixedposition_ge_even);
		btn_Fixedposition_ge_clear = (Button) context.findViewById(R.id.btn_Fixedposition_ge_clear);

		btn_Fixedposition_ge_0.setOnTouchListener(this);
		btn_Fixedposition_ge_1.setOnTouchListener(this);
		btn_Fixedposition_ge_2.setOnTouchListener(this);
		btn_Fixedposition_ge_3.setOnTouchListener(this);
		btn_Fixedposition_ge_4.setOnTouchListener(this);
		btn_Fixedposition_ge_5.setOnTouchListener(this);
		btn_Fixedposition_ge_6.setOnTouchListener(this);
		btn_Fixedposition_ge_7.setOnTouchListener(this);
		btn_Fixedposition_ge_8.setOnTouchListener(this);
		btn_Fixedposition_ge_9.setOnTouchListener(this);
		btn_Fixedposition_ge_0.setOnClickListener(this);
		btn_Fixedposition_ge_1.setOnClickListener(this);
		btn_Fixedposition_ge_2.setOnClickListener(this);
		btn_Fixedposition_ge_3.setOnClickListener(this);
		btn_Fixedposition_ge_4.setOnClickListener(this);
		btn_Fixedposition_ge_5.setOnClickListener(this);
		btn_Fixedposition_ge_6.setOnClickListener(this);
		btn_Fixedposition_ge_7.setOnClickListener(this);
		btn_Fixedposition_ge_8.setOnClickListener(this);
		btn_Fixedposition_ge_9.setOnClickListener(this);
		btn_Fixedposition_ge_big.setOnClickListener(this);
		btn_Fixedposition_ge_little.setOnClickListener(this);
		btn_Fixedposition_ge_all.setOnClickListener(this);
		btn_Fixedposition_ge_odd.setOnClickListener(this);
		btn_Fixedposition_ge_even.setOnClickListener(this);
		btn_Fixedposition_ge_clear.setOnClickListener(this);
		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_rocknumber = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_rocknumber);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_Fixedposition_wan_clear();
					getnumber_Fixedposition_qian_clear();
					getnumber_Fixedposition_bai_clear();
					getnumber_Fixedposition_shi_clear();
					getnumber_Fixedposition_ge_clear();
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
					getnumber_Fixedposition_wan_clear();
					getnumber_Fixedposition_qian_clear();
					getnumber_Fixedposition_bai_clear();
					getnumber_Fixedposition_shi_clear();
					getnumber_Fixedposition_ge_clear();
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
					getnumber_Fixedposition_wan_clear();
					getnumber_Fixedposition_qian_clear();
					getnumber_Fixedposition_bai_clear();
					getnumber_Fixedposition_shi_clear();
					getnumber_Fixedposition_ge_clear();
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
				int x = (int) (Math.random() * 5);
				getnumber_Fixedposition_wan_clear();
				getnumber_Fixedposition_shi_clear();
				getnumber_Fixedposition_qian_clear();
				getnumber_Fixedposition_bai_clear();
				getnumber_Fixedposition_ge_clear();
				if (x == 0) {
					int wan = (int) (Math.random() * 10);
					switch (wan) {
					case 0:

						selectwan0();
						break;
					case 1:
						selectwan1();
						break;
					case 2:
						selectwan2();
						break;
					case 3:
						selectwan3();
						break;
					case 4:
						selectwan4();
						break;
					case 5:
						selectwan5();
						break;
					case 6:
						selectwan6();
						break;
					case 7:
						selectwan7();
						break;
					case 8:
						selectwan8();
						break;
					case 9:
						selectwan9();
						break;

					default:
						break;
					}
				} else if (x == 1) {
					int qian = (int) (Math.random() * 10);
					switch (qian) {
					case 0:

						selectqian0();
						break;
					case 1:
						selectqian1();
						break;
					case 2:
						selectqian2();
						break;
					case 3:
						selectqian3();
						break;
					case 4:
						selectqian4();
						break;
					case 5:
						selectqian5();
						break;
					case 6:
						selectqian6();
						break;
					case 7:
						selectqian7();
						break;
					case 8:
						selectqian8();
						break;
					case 9:
						selectqian9();
						break;

					default:
						break;
					}
				} else if (x == 2) {
					int bai = (int) (Math.random() * 10);
					switch (bai) {
					case 0:

						selectbai0();
						break;
					case 1:
						selectbai1();
						break;
					case 2:
						selectbai2();
						break;
					case 3:
						selectbai3();
						break;
					case 4:
						selectbai4();
						break;
					case 5:
						selectbai5();
						break;
					case 6:
						selectbai6();
						break;
					case 7:
						selectbai7();
						break;
					case 8:
						selectbai8();
						break;
					case 9:
						selectbai9();
						break;

					default:
						break;
					}
				} else if (x == 3) {
					int shi = (int) (Math.random() * 10);
					switch (shi) {
					case 0:

						selectshi0();
						break;
					case 1:
						selectshi1();
						break;
					case 2:
						selectshi2();
						break;
					case 3:
						selectshi3();
						break;
					case 4:
						selectshi4();
						break;
					case 5:
						selectshi5();
						break;
					case 6:
						selectshi6();
						break;
					case 7:
						selectshi7();
						break;
					case 8:
						selectshi8();
						break;
					case 9:
						selectshi9();
						break;

					default:
						break;
					}
				} else if (x == 4) {
					int ge = (int) (Math.random() * 10);
					switch (ge) {
					case 0:
						selectge0();
						break;
					case 1:
						selectge1();
						break;
					case 2:
						selectge2();
						break;
					case 3:
						selectge3();
						break;
					case 4:
						selectge4();
						break;
					case 5:
						selectge5();
						break;
					case 6:
						selectge6();
						break;
					case 7:
						selectge7();
						break;
					case 8:
						selectge8();
						break;
					case 9:

						selectge9();
						break;

					default:
						break;
					}
				}

			}

		}); // btn_123.setOnTouchListener(new OnTouchListener() {
		//
		// @Override
		// public boolean onTouch(View v, MotionEvent event) {
		// // TODO Auto-generated method stub
		// int actionFive = event.getAction();
		// if (actionFive == MotionEvent.ACTION_DOWN) {
		// Log.d("btn_123", "btn_123ACTION_DOWN");
		// Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
		// btn_Fixedposition_wan_x0.setVisibility(View.VISIBLE);
		// } else if (actionFive == MotionEvent.ACTION_UP) {
		// Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
		// btn_Fixedposition_wan_x0.setVisibility(View.INVISIBLE);
		// Log.d("btn_123", "btn_123ACTION_UP");
		// }
		// return false;
		// }
		// });
		return context;

		// tickettype_list = (ListView)
		// getActivity().findViewById(R.id.tickettype_list);
	}

	protected void go() {
		// TODO Auto-generated method stub

		(new Thread() {

			@Override

			public void run() {
				int tempint = clearint;
				for (int i = 1; i < 10000; i++) {

					for (int j = 0; j < 100; j++) {

					}
					if (tempint == clearint - 1) {

					}
					// clearint = clearint;
					// clearint++;
					// Log.d("clearint", "clearint" + clearint);
					// i = clearint;
					// if (i == 999) {
					//
					// i = 1010;
					// clearint = 1;
					// }
					Log.d("i", "i" + i);
				}
			}

		}).start();
	}

	private void clearallbackground() {
		// TODO Auto-generated method stub
		Log.d("clearallbackground", "clearallbackground");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		BaseActivityticket.curFragmentTag = getString(R.string.fixed_position_name);
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
		// ProgressBar progressBar = (ProgressBar)
		// activity.findViewById(R.id.btn_Fixedposition_ge_9);
		// progressBar.setBackgroundResource(R.drawable.round);
		// btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);

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
		getnumber_Fixedposition_wan_clear();
		getnumber_Fixedposition_shi_clear();
		getnumber_Fixedposition_qian_clear();
		getnumber_Fixedposition_bai_clear();
		getnumber_Fixedposition_ge_clear();
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
		case R.id.btn_Fixedposition_wan_big:
			clearwan();

			btn_Fixedposition_wan_big.setTextColor(0xff000000);
			btn_Fixedposition_wan_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_wan_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_wan_little:
			clearwan();
			btn_Fixedposition_wan_little.setTextColor(0xff000000);
			btn_Fixedposition_wan_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_wan_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_wan_all:
			clearwan();
			btn_Fixedposition_wan_all.setTextColor(0xff000000);
			btn_Fixedposition_wan_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_wan_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_wan_odd:
			clearwan();
			btn_Fixedposition_wan_odd.setTextColor(0xff000000);
			btn_Fixedposition_wan_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_wan_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_wan_even:
			clearwan();
			btn_Fixedposition_wan_even.setTextColor(0xff000000);
			btn_Fixedposition_wan_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_wan_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_wan_clear:
			clearwan();
			btn_Fixedposition_wan_clear.setTextColor(0xff000000);
			btn_Fixedposition_wan_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_wan_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Fixedposition_wan_0:
			selectwan0();
			break;
		case R.id.btn_Fixedposition_wan_1:
			selectwan1();
			break;
		case R.id.btn_Fixedposition_wan_2:
			selectwan2();
			break;
		case R.id.btn_Fixedposition_wan_3:
			selectwan3();
			break;
		case R.id.btn_Fixedposition_wan_4:
			selectwan4();
			break;
		case R.id.btn_Fixedposition_wan_5:
			selectwan5();
			break;
		case R.id.btn_Fixedposition_wan_6:
			selectwan6();
			break;
		case R.id.btn_Fixedposition_wan_7:
			selectwan7();
			break;
		case R.id.btn_Fixedposition_wan_8:
			selectwan8();
			break;
		case R.id.btn_Fixedposition_wan_9:
			selectwan9();
			break;

		case R.id.btn_Fixedposition_qian_big:
			clearqian();
			btn_Fixedposition_qian_big.setTextColor(0xff000000);
			btn_Fixedposition_qian_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_qian_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_qian_little:
			clearqian();
			btn_Fixedposition_qian_little.setTextColor(0xff000000);
			btn_Fixedposition_qian_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_qian_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_qian_all:
			clearqian();
			btn_Fixedposition_qian_all.setTextColor(0xff000000);
			btn_Fixedposition_qian_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_qian_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_qian_odd:
			clearqian();
			btn_Fixedposition_qian_odd.setTextColor(0xff000000);
			btn_Fixedposition_qian_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_qian_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_qian_even:
			clearqian();
			btn_Fixedposition_qian_even.setTextColor(0xff000000);
			btn_Fixedposition_qian_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_qian_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_qian_clear:
			clearqian();
			btn_Fixedposition_qian_clear.setTextColor(0xff000000);
			btn_Fixedposition_qian_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_qian_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Fixedposition_qian_0:
			selectqian0();
			break;
		case R.id.btn_Fixedposition_qian_1:
			selectqian1();
			break;
		case R.id.btn_Fixedposition_qian_2:
			selectqian2();
			break;
		case R.id.btn_Fixedposition_qian_3:
			selectqian3();
			break;
		case R.id.btn_Fixedposition_qian_4:
			selectqian4();
			break;
		case R.id.btn_Fixedposition_qian_5:
			selectqian5();
			break;
		case R.id.btn_Fixedposition_qian_6:
			selectqian6();
			break;
		case R.id.btn_Fixedposition_qian_7:
			selectqian7();
			break;
		case R.id.btn_Fixedposition_qian_8:
			selectqian8();
			break;
		case R.id.btn_Fixedposition_qian_9:
			selectqian9();
			break;
		case R.id.btn_Fixedposition_bai_big:
			clearbai();
			btn_Fixedposition_bai_big.setTextColor(0xff000000);
			btn_Fixedposition_bai_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_bai_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_bai_little:
			clearbai();
			btn_Fixedposition_bai_little.setTextColor(0xff000000);
			btn_Fixedposition_bai_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_bai_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_bai_all:
			clearbai();
			btn_Fixedposition_bai_all.setTextColor(0xff000000);
			btn_Fixedposition_bai_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_bai_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_bai_odd:
			clearbai();
			btn_Fixedposition_bai_odd.setTextColor(0xff000000);
			btn_Fixedposition_bai_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_bai_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_bai_even:
			clearbai();
			btn_Fixedposition_bai_even.setTextColor(0xff000000);
			btn_Fixedposition_bai_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_bai_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_bai_clear:
			clearbai();
			btn_Fixedposition_bai_clear.setTextColor(0xff000000);
			btn_Fixedposition_bai_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_bai_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Fixedposition_bai_0:
			selectbai0();
			break;
		case R.id.btn_Fixedposition_bai_1:
			selectbai1();
			break;
		case R.id.btn_Fixedposition_bai_2:
			selectbai2();
			break;
		case R.id.btn_Fixedposition_bai_3:
			selectbai3();
			break;
		case R.id.btn_Fixedposition_bai_4:
			selectbai4();
			break;
		case R.id.btn_Fixedposition_bai_5:
			selectbai5();
			break;
		case R.id.btn_Fixedposition_bai_6:
			selectbai6();
			break;
		case R.id.btn_Fixedposition_bai_7:
			selectbai7();
			break;
		case R.id.btn_Fixedposition_bai_8:
			selectbai8();
			break;
		case R.id.btn_Fixedposition_bai_9:
			selectbai9();
			break;
		case R.id.btn_Fixedposition_shi_big:
			clearshi();
			btn_Fixedposition_shi_big.setTextColor(0xff000000);
			btn_Fixedposition_shi_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_shi_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_shi_little:
			clearshi();
			btn_Fixedposition_shi_little.setTextColor(0xff000000);
			btn_Fixedposition_shi_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_shi_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_shi_all:
			clearshi();
			btn_Fixedposition_shi_all.setTextColor(0xff000000);
			btn_Fixedposition_shi_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_shi_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_shi_odd:
			clearshi();
			btn_Fixedposition_shi_odd.setTextColor(0xff000000);
			btn_Fixedposition_shi_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_shi_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_shi_even:
			clearshi();
			btn_Fixedposition_shi_even.setTextColor(0xff000000);
			btn_Fixedposition_shi_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_shi_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_shi_clear:
			clearshi();
			btn_Fixedposition_shi_clear.setTextColor(0xff000000);
			btn_Fixedposition_shi_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_shi_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Fixedposition_shi_0:
			selectshi0();
			break;
		case R.id.btn_Fixedposition_shi_1:
			selectshi1();
			break;
		case R.id.btn_Fixedposition_shi_2:
			selectshi2();
			break;
		case R.id.btn_Fixedposition_shi_3:
			selectshi3();
			break;
		case R.id.btn_Fixedposition_shi_4:
			selectshi4();
			break;
		case R.id.btn_Fixedposition_shi_5:
			selectshi5();
			break;
		case R.id.btn_Fixedposition_shi_6:
			selectshi6();
			break;
		case R.id.btn_Fixedposition_shi_7:
			selectshi7();
			break;
		case R.id.btn_Fixedposition_shi_8:
			selectshi8();
			break;
		case R.id.btn_Fixedposition_shi_9:
			selectshi9();
			break;
		case R.id.btn_Fixedposition_ge_big:
			clearge();
			btn_Fixedposition_ge_big.setTextColor(0xff000000);
			btn_Fixedposition_ge_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_ge_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_ge_little:
			clearge();
			btn_Fixedposition_ge_little.setTextColor(0xff000000);
			btn_Fixedposition_ge_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_ge_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_ge_all:
			clearge();
			btn_Fixedposition_ge_all.setTextColor(0xff000000);
			btn_Fixedposition_ge_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_ge_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_ge_odd:
			clearge();
			btn_Fixedposition_ge_odd.setTextColor(0xff000000);
			btn_Fixedposition_ge_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_ge_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_ge_even:
			clearge();
			btn_Fixedposition_ge_even.setTextColor(0xff000000);
			btn_Fixedposition_ge_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_ge_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Fixedposition_ge_clear:
			clearge();
			btn_Fixedposition_ge_clear.setTextColor(0xff000000);
			btn_Fixedposition_ge_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Fixedposition_ge_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Fixedposition_ge_0:
			selectge0();
			break;
		case R.id.btn_Fixedposition_ge_1:
			selectge1();
			break;
		case R.id.btn_Fixedposition_ge_2:
			selectge2();
			break;
		case R.id.btn_Fixedposition_ge_3:
			selectge3();
			break;
		case R.id.btn_Fixedposition_ge_4:
			selectge4();
			break;
		case R.id.btn_Fixedposition_ge_5:
			selectge5();
			break;
		case R.id.btn_Fixedposition_ge_6:
			selectge6();
			break;
		case R.id.btn_Fixedposition_ge_7:
			selectge7();
			break;
		case R.id.btn_Fixedposition_ge_8:
			selectge8();
			break;
		case R.id.btn_Fixedposition_ge_9:
			selectge9();
			break;
		}
	}

	private void getnumber_Fixedposition_wan_big() {
		// TODO Auto-generated method stub
		btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_0.setTextColor(0xffdedede);
		btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_1.setTextColor(0xffdedede);
		btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_2.setTextColor(0xffdedede);
		btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_3.setTextColor(0xffdedede);
		btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_4.setTextColor(0xffdedede);
		btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_5.setTextColor(0xffffffff);
		btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_6.setTextColor(0xffffffff);
		btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_7.setTextColor(0xffffffff);
		btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_8.setTextColor(0xffffffff);
		btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_9.setTextColor(0xffffffff);
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

		btn_Fixedposition_wan_0_int = 1;
		btn_Fixedposition_wan_1_int = 1;
		btn_Fixedposition_wan_2_int = 1;
		btn_Fixedposition_wan_3_int = 1;
		btn_Fixedposition_wan_4_int = 1;
		btn_Fixedposition_wan_5_int = -1;
		btn_Fixedposition_wan_6_int = -1;
		btn_Fixedposition_wan_7_int = -1;
		btn_Fixedposition_wan_8_int = -1;
		btn_Fixedposition_wan_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Fixedposition_wan_little() {
		btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_0.setTextColor(0xffffffff);
		text_Fixedposition_wan_1.setTextColor(0xffffffff);
		text_Fixedposition_wan_2.setTextColor(0xffffffff);
		text_Fixedposition_wan_3.setTextColor(0xffffffff);
		text_Fixedposition_wan_4.setTextColor(0xffffffff);
		text_Fixedposition_wan_5.setTextColor(0xffdedede);
		text_Fixedposition_wan_6.setTextColor(0xffdedede);
		text_Fixedposition_wan_7.setTextColor(0xffdedede);
		text_Fixedposition_wan_8.setTextColor(0xffdedede);
		text_Fixedposition_wan_9.setTextColor(0xffdedede);
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
		btn_Fixedposition_wan_5_int = 1;
		btn_Fixedposition_wan_6_int = 1;
		btn_Fixedposition_wan_7_int = 1;
		btn_Fixedposition_wan_8_int = 1;
		btn_Fixedposition_wan_9_int = 1;
		btn_Fixedposition_wan_0_int = -1;
		btn_Fixedposition_wan_1_int = -1;
		btn_Fixedposition_wan_2_int = -1;
		btn_Fixedposition_wan_3_int = -1;
		btn_Fixedposition_wan_4_int = -1;

		show(myriabit);
	}

	private void getnumber_Fixedposition_wan_all() {
		btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_0.setTextColor(0xffffffff);
		btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_1.setTextColor(0xffffffff);
		btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_2.setTextColor(0xffffffff);
		btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_3.setTextColor(0xffffffff);
		btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_4.setTextColor(0xffffffff);
		btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_5.setTextColor(0xffffffff);
		btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_6.setTextColor(0xffffffff);
		btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_7.setTextColor(0xffffffff);
		btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_8.setTextColor(0xffffffff);
		btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_9.setTextColor(0xffffffff);
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
		btn_Fixedposition_wan_0_int = -1;
		btn_Fixedposition_wan_1_int = -1;
		btn_Fixedposition_wan_2_int = -1;
		btn_Fixedposition_wan_3_int = -1;
		btn_Fixedposition_wan_4_int = -1;
		btn_Fixedposition_wan_5_int = -1;
		btn_Fixedposition_wan_6_int = -1;
		btn_Fixedposition_wan_7_int = -1;
		btn_Fixedposition_wan_8_int = -1;
		btn_Fixedposition_wan_9_int = -1;

		show(myriabit);
	}

	private void getnumber_Fixedposition_wan_odd() {
		btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_0.setTextColor(0xffdedede);
		text_Fixedposition_wan_2.setTextColor(0xffdedede);
		text_Fixedposition_wan_4.setTextColor(0xffdedede);
		text_Fixedposition_wan_6.setTextColor(0xffdedede);
		text_Fixedposition_wan_8.setTextColor(0xffdedede);
		btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_1.setTextColor(0xffffffff);
		text_Fixedposition_wan_3.setTextColor(0xffffffff);
		text_Fixedposition_wan_5.setTextColor(0xffffffff);
		text_Fixedposition_wan_7.setTextColor(0xffffffff);
		text_Fixedposition_wan_9.setTextColor(0xffffffff);
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

		btn_Fixedposition_wan_0_int = 1;
		btn_Fixedposition_wan_2_int = 1;
		btn_Fixedposition_wan_4_int = 1;
		btn_Fixedposition_wan_6_int = 1;
		btn_Fixedposition_wan_8_int = 1;
		btn_Fixedposition_wan_1_int = -1;
		btn_Fixedposition_wan_3_int = -1;
		btn_Fixedposition_wan_5_int = -1;
		btn_Fixedposition_wan_7_int = -1;
		btn_Fixedposition_wan_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Fixedposition_wan_even() {
		btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_wan_0.setTextColor(0xffffffff);
		text_Fixedposition_wan_2.setTextColor(0xffffffff);
		text_Fixedposition_wan_4.setTextColor(0xffffffff);
		text_Fixedposition_wan_6.setTextColor(0xffffffff);
		text_Fixedposition_wan_8.setTextColor(0xffffffff);
		btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_1.setTextColor(0xffdedede);
		text_Fixedposition_wan_3.setTextColor(0xffdedede);
		text_Fixedposition_wan_5.setTextColor(0xffdedede);
		text_Fixedposition_wan_7.setTextColor(0xffdedede);
		text_Fixedposition_wan_9.setTextColor(0xffdedede);
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
		btn_Fixedposition_wan_1_int = 1;
		btn_Fixedposition_wan_3_int = 1;
		btn_Fixedposition_wan_5_int = 1;
		btn_Fixedposition_wan_7_int = 1;
		btn_Fixedposition_wan_9_int = 1;
		btn_Fixedposition_wan_0_int = -1;
		btn_Fixedposition_wan_2_int = -1;
		btn_Fixedposition_wan_4_int = -1;
		btn_Fixedposition_wan_6_int = -1;
		btn_Fixedposition_wan_8_int = -1;

		show(myriabit);
	}

	private void getnumber_Fixedposition_wan_clear() {
		btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_0.setTextColor(0xffdedede);
		btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_1.setTextColor(0xffdedede);
		btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_2.setTextColor(0xffdedede);
		btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_3.setTextColor(0xffdedede);
		btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_4.setTextColor(0xffdedede);
		btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_5.setTextColor(0xffdedede);
		btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_6.setTextColor(0xffdedede);
		btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_7.setTextColor(0xffdedede);
		btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_8.setTextColor(0xffdedede);
		btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_wan_9.setTextColor(0xffdedede);
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
		btn_Fixedposition_wan_0_int = 1;
		btn_Fixedposition_wan_1_int = 1;
		btn_Fixedposition_wan_2_int = 1;
		btn_Fixedposition_wan_3_int = 1;
		btn_Fixedposition_wan_4_int = 1;
		btn_Fixedposition_wan_5_int = 1;
		btn_Fixedposition_wan_6_int = 1;
		btn_Fixedposition_wan_7_int = 1;
		btn_Fixedposition_wan_8_int = 1;
		btn_Fixedposition_wan_9_int = 1;
		show(myriabit);
	}

	private void clearwan() {
		// TODO Auto-generated method stub
		btn_Fixedposition_wan_big.setBackgroundResource(0);
		btn_Fixedposition_wan_little.setBackgroundResource(0);
		btn_Fixedposition_wan_all.setBackgroundResource(0);
		btn_Fixedposition_wan_odd.setBackgroundResource(0);
		btn_Fixedposition_wan_even.setBackgroundResource(0);
		btn_Fixedposition_wan_clear.setBackgroundResource(0);
		btn_Fixedposition_wan_big.setTextColor(0xffcfcfcf);
		btn_Fixedposition_wan_little.setTextColor(0xffcfcfcf);
		btn_Fixedposition_wan_all.setTextColor(0xffcfcfcf);
		btn_Fixedposition_wan_odd.setTextColor(0xffcfcfcf);
		btn_Fixedposition_wan_even.setTextColor(0xffcfcfcf);
		btn_Fixedposition_wan_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_Fixedposition_qian_big() {
		// TODO Auto-generated method stub
		btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_0.setTextColor(0xffdedede);
		btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_1.setTextColor(0xffdedede);
		btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_2.setTextColor(0xffdedede);
		btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_3.setTextColor(0xffdedede);
		btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_4.setTextColor(0xffdedede);
		btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_5.setTextColor(0xffffffff);
		btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_6.setTextColor(0xffffffff);
		btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_7.setTextColor(0xffffffff);
		btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_8.setTextColor(0xffffffff);
		btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_9.setTextColor(0xffffffff);
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

		btn_Fixedposition_qian_0_int = 1;
		btn_Fixedposition_qian_1_int = 1;
		btn_Fixedposition_qian_2_int = 1;
		btn_Fixedposition_qian_3_int = 1;
		btn_Fixedposition_qian_4_int = 1;
		btn_Fixedposition_qian_5_int = -1;
		btn_Fixedposition_qian_6_int = -1;
		btn_Fixedposition_qian_7_int = -1;
		btn_Fixedposition_qian_8_int = -1;
		btn_Fixedposition_qian_9_int = -1;
		show(kilobit);
	}

	private void getnumber_Fixedposition_qian_little() {
		btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_0.setTextColor(0xffffffff);
		text_Fixedposition_qian_1.setTextColor(0xffffffff);
		text_Fixedposition_qian_2.setTextColor(0xffffffff);
		text_Fixedposition_qian_3.setTextColor(0xffffffff);
		text_Fixedposition_qian_4.setTextColor(0xffffffff);
		text_Fixedposition_qian_5.setTextColor(0xffdedede);
		text_Fixedposition_qian_6.setTextColor(0xffdedede);
		text_Fixedposition_qian_7.setTextColor(0xffdedede);
		text_Fixedposition_qian_8.setTextColor(0xffdedede);
		text_Fixedposition_qian_9.setTextColor(0xffdedede);
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
		btn_Fixedposition_qian_5_int = 1;
		btn_Fixedposition_qian_6_int = 1;
		btn_Fixedposition_qian_7_int = 1;
		btn_Fixedposition_qian_8_int = 1;
		btn_Fixedposition_qian_9_int = 1;
		btn_Fixedposition_qian_0_int = -1;
		btn_Fixedposition_qian_1_int = -1;
		btn_Fixedposition_qian_2_int = -1;
		btn_Fixedposition_qian_3_int = -1;
		btn_Fixedposition_qian_4_int = -1;

		show(kilobit);
	}

	private void getnumber_Fixedposition_qian_all() {
		btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_0.setTextColor(0xffffffff);
		btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_1.setTextColor(0xffffffff);
		btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_2.setTextColor(0xffffffff);
		btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_3.setTextColor(0xffffffff);
		btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_4.setTextColor(0xffffffff);
		btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_5.setTextColor(0xffffffff);
		btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_6.setTextColor(0xffffffff);
		btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_7.setTextColor(0xffffffff);
		btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_8.setTextColor(0xffffffff);
		btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_9.setTextColor(0xffffffff);
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
		btn_Fixedposition_qian_0_int = -1;
		btn_Fixedposition_qian_1_int = -1;
		btn_Fixedposition_qian_2_int = -1;
		btn_Fixedposition_qian_3_int = -1;
		btn_Fixedposition_qian_4_int = -1;
		btn_Fixedposition_qian_5_int = -1;
		btn_Fixedposition_qian_6_int = -1;
		btn_Fixedposition_qian_7_int = -1;
		btn_Fixedposition_qian_8_int = -1;
		btn_Fixedposition_qian_9_int = -1;

		show(kilobit);
	}

	private void getnumber_Fixedposition_qian_odd() {
		btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_0.setTextColor(0xffdedede);
		text_Fixedposition_qian_2.setTextColor(0xffdedede);
		text_Fixedposition_qian_4.setTextColor(0xffdedede);
		text_Fixedposition_qian_6.setTextColor(0xffdedede);
		text_Fixedposition_qian_8.setTextColor(0xffdedede);
		btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_1.setTextColor(0xffffffff);
		text_Fixedposition_qian_3.setTextColor(0xffffffff);
		text_Fixedposition_qian_5.setTextColor(0xffffffff);
		text_Fixedposition_qian_7.setTextColor(0xffffffff);
		text_Fixedposition_qian_9.setTextColor(0xffffffff);
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

		btn_Fixedposition_qian_0_int = 1;
		btn_Fixedposition_qian_2_int = 1;
		btn_Fixedposition_qian_4_int = 1;
		btn_Fixedposition_qian_6_int = 1;
		btn_Fixedposition_qian_8_int = 1;
		btn_Fixedposition_qian_1_int = -1;
		btn_Fixedposition_qian_3_int = -1;
		btn_Fixedposition_qian_5_int = -1;
		btn_Fixedposition_qian_7_int = -1;
		btn_Fixedposition_qian_9_int = -1;
		show(kilobit);
	}

	private void getnumber_Fixedposition_qian_even() {
		btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_qian_0.setTextColor(0xffffffff);
		text_Fixedposition_qian_2.setTextColor(0xffffffff);
		text_Fixedposition_qian_4.setTextColor(0xffffffff);
		text_Fixedposition_qian_6.setTextColor(0xffffffff);
		text_Fixedposition_qian_8.setTextColor(0xffffffff);
		btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_1.setTextColor(0xffdedede);
		text_Fixedposition_qian_3.setTextColor(0xffdedede);
		text_Fixedposition_qian_5.setTextColor(0xffdedede);
		text_Fixedposition_qian_7.setTextColor(0xffdedede);
		text_Fixedposition_qian_9.setTextColor(0xffdedede);
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
		btn_Fixedposition_qian_1_int = 1;
		btn_Fixedposition_qian_3_int = 1;
		btn_Fixedposition_qian_5_int = 1;
		btn_Fixedposition_qian_7_int = 1;
		btn_Fixedposition_qian_9_int = 1;
		btn_Fixedposition_qian_0_int = -1;
		btn_Fixedposition_qian_2_int = -1;
		btn_Fixedposition_qian_4_int = -1;
		btn_Fixedposition_qian_6_int = -1;
		btn_Fixedposition_qian_8_int = -1;

		show(kilobit);
	}

	private void getnumber_Fixedposition_qian_clear() {
		btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_0.setTextColor(0xffdedede);
		btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_1.setTextColor(0xffdedede);
		btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_2.setTextColor(0xffdedede);
		btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_3.setTextColor(0xffdedede);
		btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_4.setTextColor(0xffdedede);
		btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_5.setTextColor(0xffdedede);
		btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_6.setTextColor(0xffdedede);
		btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_7.setTextColor(0xffdedede);
		btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_8.setTextColor(0xffdedede);
		btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_qian_9.setTextColor(0xffdedede);
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
		btn_Fixedposition_qian_0_int = 1;
		btn_Fixedposition_qian_1_int = 1;
		btn_Fixedposition_qian_2_int = 1;
		btn_Fixedposition_qian_3_int = 1;
		btn_Fixedposition_qian_4_int = 1;
		btn_Fixedposition_qian_5_int = 1;
		btn_Fixedposition_qian_6_int = 1;
		btn_Fixedposition_qian_7_int = 1;
		btn_Fixedposition_qian_8_int = 1;
		btn_Fixedposition_qian_9_int = 1;
		show(kilobit);
	}

	private void clearqian() {
		// TODO Auto-generated method stub
		btn_Fixedposition_qian_big.setBackgroundResource(0);
		btn_Fixedposition_qian_little.setBackgroundResource(0);
		btn_Fixedposition_qian_all.setBackgroundResource(0);
		btn_Fixedposition_qian_odd.setBackgroundResource(0);
		btn_Fixedposition_qian_even.setBackgroundResource(0);
		btn_Fixedposition_qian_clear.setBackgroundResource(0);
		btn_Fixedposition_qian_big.setTextColor(0xffcfcfcf);
		btn_Fixedposition_qian_little.setTextColor(0xffcfcfcf);
		btn_Fixedposition_qian_all.setTextColor(0xffcfcfcf);
		btn_Fixedposition_qian_odd.setTextColor(0xffcfcfcf);
		btn_Fixedposition_qian_even.setTextColor(0xffcfcfcf);
		btn_Fixedposition_qian_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_Fixedposition_bai_big() {
		// TODO Auto-generated method stub
		btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_0.setTextColor(0xffdedede);
		btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_1.setTextColor(0xffdedede);
		btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_2.setTextColor(0xffdedede);
		btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_3.setTextColor(0xffdedede);
		btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_4.setTextColor(0xffdedede);
		btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_5.setTextColor(0xffffffff);
		btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_6.setTextColor(0xffffffff);
		btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_7.setTextColor(0xffffffff);
		btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_8.setTextColor(0xffffffff);
		btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_9.setTextColor(0xffffffff);
		hundreds[5] = "1";
		hundreds[6] = "1";
		hundreds[7] = "1";
		hundreds[8] = "1";
		hundreds[9] = "1";
		hundreds[0] = "0";
		hundreds[1] = "0";
		hundreds[2] = "0";
		hundreds[3] = "0";
		hundreds[4] = "0";

		btn_Fixedposition_bai_0_int = 1;
		btn_Fixedposition_bai_1_int = 1;
		btn_Fixedposition_bai_2_int = 1;
		btn_Fixedposition_bai_3_int = 1;
		btn_Fixedposition_bai_4_int = 1;
		btn_Fixedposition_bai_5_int = -1;
		btn_Fixedposition_bai_6_int = -1;
		btn_Fixedposition_bai_7_int = -1;
		btn_Fixedposition_bai_8_int = -1;
		btn_Fixedposition_bai_9_int = -1;
		show(hundreds);
	}

	private void getnumber_Fixedposition_bai_little() {
		btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_0.setTextColor(0xffffffff);
		text_Fixedposition_bai_1.setTextColor(0xffffffff);
		text_Fixedposition_bai_2.setTextColor(0xffffffff);
		text_Fixedposition_bai_3.setTextColor(0xffffffff);
		text_Fixedposition_bai_4.setTextColor(0xffffffff);
		text_Fixedposition_bai_5.setTextColor(0xffdedede);
		text_Fixedposition_bai_6.setTextColor(0xffdedede);
		text_Fixedposition_bai_7.setTextColor(0xffdedede);
		text_Fixedposition_bai_8.setTextColor(0xffdedede);
		text_Fixedposition_bai_9.setTextColor(0xffdedede);
		hundreds[0] = "1";
		hundreds[1] = "1";
		hundreds[2] = "1";
		hundreds[3] = "1";
		hundreds[4] = "1";
		hundreds[5] = "0";
		hundreds[6] = "0";
		hundreds[7] = "0";
		hundreds[8] = "0";
		hundreds[9] = "0";
		btn_Fixedposition_bai_5_int = 1;
		btn_Fixedposition_bai_6_int = 1;
		btn_Fixedposition_bai_7_int = 1;
		btn_Fixedposition_bai_8_int = 1;
		btn_Fixedposition_bai_9_int = 1;
		btn_Fixedposition_bai_0_int = -1;
		btn_Fixedposition_bai_1_int = -1;
		btn_Fixedposition_bai_2_int = -1;
		btn_Fixedposition_bai_3_int = -1;
		btn_Fixedposition_bai_4_int = -1;

		show(hundreds);
	}

	private void getnumber_Fixedposition_bai_all() {
		btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_0.setTextColor(0xffffffff);
		btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_1.setTextColor(0xffffffff);
		btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_2.setTextColor(0xffffffff);
		btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_3.setTextColor(0xffffffff);
		btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_4.setTextColor(0xffffffff);
		btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_5.setTextColor(0xffffffff);
		btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_6.setTextColor(0xffffffff);
		btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_7.setTextColor(0xffffffff);
		btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_8.setTextColor(0xffffffff);
		btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_9.setTextColor(0xffffffff);
		hundreds[0] = changestatus(hundreds[0]);
		hundreds[1] = changestatus(hundreds[1]);
		hundreds[2] = changestatus(hundreds[2]);
		hundreds[3] = changestatus(hundreds[3]);
		hundreds[4] = changestatus(hundreds[4]);
		hundreds[5] = changestatus(hundreds[5]);
		hundreds[6] = changestatus(hundreds[6]);
		hundreds[7] = changestatus(hundreds[7]);
		hundreds[8] = changestatus(hundreds[8]);
		hundreds[9] = changestatus(hundreds[9]);
		hundreds[1] = "1";
		hundreds[3] = "1";
		hundreds[5] = "1";
		hundreds[7] = "1";
		hundreds[9] = "1";
		hundreds[0] = "1";
		hundreds[2] = "1";
		hundreds[4] = "1";
		hundreds[6] = "1";
		hundreds[8] = "1";
		btn_Fixedposition_bai_0_int = -1;
		btn_Fixedposition_bai_1_int = -1;
		btn_Fixedposition_bai_2_int = -1;
		btn_Fixedposition_bai_3_int = -1;
		btn_Fixedposition_bai_4_int = -1;
		btn_Fixedposition_bai_5_int = -1;
		btn_Fixedposition_bai_6_int = -1;
		btn_Fixedposition_bai_7_int = -1;
		btn_Fixedposition_bai_8_int = -1;
		btn_Fixedposition_bai_9_int = -1;

		show(hundreds);
	}

	private void getnumber_Fixedposition_bai_odd() {
		btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_0.setTextColor(0xffdedede);
		text_Fixedposition_bai_2.setTextColor(0xffdedede);
		text_Fixedposition_bai_4.setTextColor(0xffdedede);
		text_Fixedposition_bai_6.setTextColor(0xffdedede);
		text_Fixedposition_bai_8.setTextColor(0xffdedede);
		btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_1.setTextColor(0xffffffff);
		text_Fixedposition_bai_3.setTextColor(0xffffffff);
		text_Fixedposition_bai_5.setTextColor(0xffffffff);
		text_Fixedposition_bai_7.setTextColor(0xffffffff);
		text_Fixedposition_bai_9.setTextColor(0xffffffff);
		hundreds[1] = "1";
		hundreds[3] = "1";
		hundreds[5] = "1";
		hundreds[7] = "1";
		hundreds[9] = "1";
		hundreds[0] = "0";
		hundreds[2] = "0";
		hundreds[4] = "0";
		hundreds[6] = "0";
		hundreds[8] = "0";

		btn_Fixedposition_bai_0_int = 1;
		btn_Fixedposition_bai_2_int = 1;
		btn_Fixedposition_bai_4_int = 1;
		btn_Fixedposition_bai_6_int = 1;
		btn_Fixedposition_bai_8_int = 1;
		btn_Fixedposition_bai_1_int = -1;
		btn_Fixedposition_bai_3_int = -1;
		btn_Fixedposition_bai_5_int = -1;
		btn_Fixedposition_bai_7_int = -1;
		btn_Fixedposition_bai_9_int = -1;
		show(hundreds);
	}

	private void getnumber_Fixedposition_bai_even() {
		btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_bai_0.setTextColor(0xffffffff);
		text_Fixedposition_bai_2.setTextColor(0xffffffff);
		text_Fixedposition_bai_4.setTextColor(0xffffffff);
		text_Fixedposition_bai_6.setTextColor(0xffffffff);
		text_Fixedposition_bai_8.setTextColor(0xffffffff);
		btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_1.setTextColor(0xffdedede);
		text_Fixedposition_bai_3.setTextColor(0xffdedede);
		text_Fixedposition_bai_5.setTextColor(0xffdedede);
		text_Fixedposition_bai_7.setTextColor(0xffdedede);
		text_Fixedposition_bai_9.setTextColor(0xffdedede);
		hundreds[1] = "0";
		hundreds[3] = "0";
		hundreds[5] = "0";
		hundreds[7] = "0";
		hundreds[9] = "0";
		hundreds[0] = "1";
		hundreds[2] = "1";
		hundreds[4] = "1";
		hundreds[6] = "1";
		hundreds[8] = "1";
		btn_Fixedposition_bai_1_int = 1;
		btn_Fixedposition_bai_3_int = 1;
		btn_Fixedposition_bai_5_int = 1;
		btn_Fixedposition_bai_7_int = 1;
		btn_Fixedposition_bai_9_int = 1;
		btn_Fixedposition_bai_0_int = -1;
		btn_Fixedposition_bai_2_int = -1;
		btn_Fixedposition_bai_4_int = -1;
		btn_Fixedposition_bai_6_int = -1;
		btn_Fixedposition_bai_8_int = -1;

		show(hundreds);
	}

	private void getnumber_Fixedposition_bai_clear() {
		btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_0.setTextColor(0xffdedede);
		btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_1.setTextColor(0xffdedede);
		btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_2.setTextColor(0xffdedede);
		btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_3.setTextColor(0xffdedede);
		btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_4.setTextColor(0xffdedede);
		btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_5.setTextColor(0xffdedede);
		btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_6.setTextColor(0xffdedede);
		btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_7.setTextColor(0xffdedede);
		btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_8.setTextColor(0xffdedede);
		btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_bai_9.setTextColor(0xffdedede);
		hundreds[0] = "0";
		hundreds[1] = "0";
		hundreds[2] = "0";
		hundreds[3] = "0";
		hundreds[4] = "0";
		hundreds[5] = "0";
		hundreds[6] = "0";
		hundreds[7] = "0";
		hundreds[8] = "0";
		hundreds[9] = "0";
		btn_Fixedposition_bai_0_int = 1;
		btn_Fixedposition_bai_1_int = 1;
		btn_Fixedposition_bai_2_int = 1;
		btn_Fixedposition_bai_3_int = 1;
		btn_Fixedposition_bai_4_int = 1;
		btn_Fixedposition_bai_5_int = 1;
		btn_Fixedposition_bai_6_int = 1;
		btn_Fixedposition_bai_7_int = 1;
		btn_Fixedposition_bai_8_int = 1;
		btn_Fixedposition_bai_9_int = 1;
		show(hundreds);
	}

	void clearbai() {
		// TODO Auto-generated method stub
		btn_Fixedposition_bai_big.setBackgroundResource(0);
		btn_Fixedposition_bai_little.setBackgroundResource(0);
		btn_Fixedposition_bai_all.setBackgroundResource(0);
		btn_Fixedposition_bai_odd.setBackgroundResource(0);
		btn_Fixedposition_bai_even.setBackgroundResource(0);
		btn_Fixedposition_bai_clear.setBackgroundResource(0);
		btn_Fixedposition_bai_big.setTextColor(0xffcfcfcf);
		btn_Fixedposition_bai_little.setTextColor(0xffcfcfcf);
		btn_Fixedposition_bai_all.setTextColor(0xffcfcfcf);
		btn_Fixedposition_bai_odd.setTextColor(0xffcfcfcf);
		btn_Fixedposition_bai_even.setTextColor(0xffcfcfcf);
		btn_Fixedposition_bai_clear.setTextColor(0xffcfcfcf);
		// hundreds[0] = "0";
		// hundreds[1] = "0";
		// hundreds[2] = "0";
		// hundreds[3] = "0";
		// hundreds[4] = "0";
		// hundreds[5] = "0";
		// hundreds[6] = "0";
		// hundreds[7] = "0";
		// hundreds[8] = "0";
		// hundreds[9] = "0";
		// btn_Fixedposition_bai_0_int = 1;
		// btn_Fixedposition_bai_1_int = 1;
		// btn_Fixedposition_bai_2_int = 1;
		// btn_Fixedposition_bai_3_int = 1;
		// btn_Fixedposition_bai_4_int = 1;
		// btn_Fixedposition_bai_5_int = 1;
		// btn_Fixedposition_bai_6_int = 1;
		// btn_Fixedposition_bai_7_int = 1;
		// btn_Fixedposition_bai_8_int = 1;
		// btn_Fixedposition_bai_9_int = 1;

	}

	private void getnumber_Fixedposition_shi_big() {
		// TODO Auto-generated method stub
		btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_0.setTextColor(0xffdedede);
		btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_1.setTextColor(0xffdedede);
		btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_2.setTextColor(0xffdedede);
		btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_3.setTextColor(0xffdedede);
		btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_4.setTextColor(0xffdedede);
		btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_5.setTextColor(0xffffffff);
		btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_6.setTextColor(0xffffffff);
		btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_7.setTextColor(0xffffffff);
		btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_8.setTextColor(0xffffffff);
		btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_9.setTextColor(0xffffffff);
		tens[5] = "1";
		tens[6] = "1";
		tens[7] = "1";
		tens[8] = "1";
		tens[9] = "1";
		tens[0] = "0";
		tens[1] = "0";
		tens[2] = "0";
		tens[3] = "0";
		tens[4] = "0";

		btn_Fixedposition_shi_0_int = 1;
		btn_Fixedposition_shi_1_int = 1;
		btn_Fixedposition_shi_2_int = 1;
		btn_Fixedposition_shi_3_int = 1;
		btn_Fixedposition_shi_4_int = 1;
		btn_Fixedposition_shi_5_int = -1;
		btn_Fixedposition_shi_6_int = -1;
		btn_Fixedposition_shi_7_int = -1;
		btn_Fixedposition_shi_8_int = -1;
		btn_Fixedposition_shi_9_int = -1;
		show(tens);
	}

	private void getnumber_Fixedposition_shi_little() {
		btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_0.setTextColor(0xffffffff);
		text_Fixedposition_shi_1.setTextColor(0xffffffff);
		text_Fixedposition_shi_2.setTextColor(0xffffffff);
		text_Fixedposition_shi_3.setTextColor(0xffffffff);
		text_Fixedposition_shi_4.setTextColor(0xffffffff);
		text_Fixedposition_shi_5.setTextColor(0xffdedede);
		text_Fixedposition_shi_6.setTextColor(0xffdedede);
		text_Fixedposition_shi_7.setTextColor(0xffdedede);
		text_Fixedposition_shi_8.setTextColor(0xffdedede);
		text_Fixedposition_shi_9.setTextColor(0xffdedede);
		tens[0] = "1";
		tens[1] = "1";
		tens[2] = "1";
		tens[3] = "1";
		tens[4] = "1";
		tens[5] = "0";
		tens[6] = "0";
		tens[7] = "0";
		tens[8] = "0";
		tens[9] = "0";
		btn_Fixedposition_shi_5_int = 1;
		btn_Fixedposition_shi_6_int = 1;
		btn_Fixedposition_shi_7_int = 1;
		btn_Fixedposition_shi_8_int = 1;
		btn_Fixedposition_shi_9_int = 1;
		btn_Fixedposition_shi_0_int = -1;
		btn_Fixedposition_shi_1_int = -1;
		btn_Fixedposition_shi_2_int = -1;
		btn_Fixedposition_shi_3_int = -1;
		btn_Fixedposition_shi_4_int = -1;

		show(tens);
	}

	private void getnumber_Fixedposition_shi_all() {
		btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_0.setTextColor(0xffffffff);
		btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_1.setTextColor(0xffffffff);
		btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_2.setTextColor(0xffffffff);
		btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_3.setTextColor(0xffffffff);
		btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_4.setTextColor(0xffffffff);
		btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_5.setTextColor(0xffffffff);
		btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_6.setTextColor(0xffffffff);
		btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_7.setTextColor(0xffffffff);
		btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_8.setTextColor(0xffffffff);
		btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_9.setTextColor(0xffffffff);
		tens[0] = changestatus(tens[0]);
		tens[1] = changestatus(tens[1]);
		tens[2] = changestatus(tens[2]);
		tens[3] = changestatus(tens[3]);
		tens[4] = changestatus(tens[4]);
		tens[5] = changestatus(tens[5]);
		tens[6] = changestatus(tens[6]);
		tens[7] = changestatus(tens[7]);
		tens[8] = changestatus(tens[8]);
		tens[9] = changestatus(tens[9]);
		tens[1] = "1";
		tens[3] = "1";
		tens[5] = "1";
		tens[7] = "1";
		tens[9] = "1";
		tens[0] = "1";
		tens[2] = "1";
		tens[4] = "1";
		tens[6] = "1";
		tens[8] = "1";
		btn_Fixedposition_shi_0_int = -1;
		btn_Fixedposition_shi_1_int = -1;
		btn_Fixedposition_shi_2_int = -1;
		btn_Fixedposition_shi_3_int = -1;
		btn_Fixedposition_shi_4_int = -1;
		btn_Fixedposition_shi_5_int = -1;
		btn_Fixedposition_shi_6_int = -1;
		btn_Fixedposition_shi_7_int = -1;
		btn_Fixedposition_shi_8_int = -1;
		btn_Fixedposition_shi_9_int = -1;

		show(tens);
	}

	private void getnumber_Fixedposition_shi_odd() {
		btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_0.setTextColor(0xffdedede);
		text_Fixedposition_shi_2.setTextColor(0xffdedede);
		text_Fixedposition_shi_4.setTextColor(0xffdedede);
		text_Fixedposition_shi_6.setTextColor(0xffdedede);
		text_Fixedposition_shi_8.setTextColor(0xffdedede);
		btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_1.setTextColor(0xffffffff);
		text_Fixedposition_shi_3.setTextColor(0xffffffff);
		text_Fixedposition_shi_5.setTextColor(0xffffffff);
		text_Fixedposition_shi_7.setTextColor(0xffffffff);
		text_Fixedposition_shi_9.setTextColor(0xffffffff);
		tens[1] = "1";
		tens[3] = "1";
		tens[5] = "1";
		tens[7] = "1";
		tens[9] = "1";
		tens[0] = "0";
		tens[2] = "0";
		tens[4] = "0";
		tens[6] = "0";
		tens[8] = "0";

		btn_Fixedposition_shi_0_int = 1;
		btn_Fixedposition_shi_2_int = 1;
		btn_Fixedposition_shi_4_int = 1;
		btn_Fixedposition_shi_6_int = 1;
		btn_Fixedposition_shi_8_int = 1;
		btn_Fixedposition_shi_1_int = -1;
		btn_Fixedposition_shi_3_int = -1;
		btn_Fixedposition_shi_5_int = -1;
		btn_Fixedposition_shi_7_int = -1;
		btn_Fixedposition_shi_9_int = -1;
		show(tens);
	}

	private void getnumber_Fixedposition_shi_even() {
		btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_shi_0.setTextColor(0xffffffff);
		text_Fixedposition_shi_2.setTextColor(0xffffffff);
		text_Fixedposition_shi_4.setTextColor(0xffffffff);
		text_Fixedposition_shi_6.setTextColor(0xffffffff);
		text_Fixedposition_shi_8.setTextColor(0xffffffff);
		btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_1.setTextColor(0xffdedede);
		text_Fixedposition_shi_3.setTextColor(0xffdedede);
		text_Fixedposition_shi_5.setTextColor(0xffdedede);
		text_Fixedposition_shi_7.setTextColor(0xffdedede);
		text_Fixedposition_shi_9.setTextColor(0xffdedede);
		tens[1] = "0";
		tens[3] = "0";
		tens[5] = "0";
		tens[7] = "0";
		tens[9] = "0";
		tens[0] = "1";
		tens[2] = "1";
		tens[4] = "1";
		tens[6] = "1";
		tens[8] = "1";
		btn_Fixedposition_shi_1_int = 1;
		btn_Fixedposition_shi_3_int = 1;
		btn_Fixedposition_shi_5_int = 1;
		btn_Fixedposition_shi_7_int = 1;
		btn_Fixedposition_shi_9_int = 1;
		btn_Fixedposition_shi_0_int = -1;
		btn_Fixedposition_shi_2_int = -1;
		btn_Fixedposition_shi_4_int = -1;
		btn_Fixedposition_shi_6_int = -1;
		btn_Fixedposition_shi_8_int = -1;

		show(tens);
	}

	private void getnumber_Fixedposition_shi_clear() {
		btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_0.setTextColor(0xffdedede);
		btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_1.setTextColor(0xffdedede);
		btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_2.setTextColor(0xffdedede);
		btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_3.setTextColor(0xffdedede);
		btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_4.setTextColor(0xffdedede);
		btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_5.setTextColor(0xffdedede);
		btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_6.setTextColor(0xffdedede);
		btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_7.setTextColor(0xffdedede);
		btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_8.setTextColor(0xffdedede);
		btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_shi_9.setTextColor(0xffdedede);
		tens[0] = "0";
		tens[1] = "0";
		tens[2] = "0";
		tens[3] = "0";
		tens[4] = "0";
		tens[5] = "0";
		tens[6] = "0";
		tens[7] = "0";
		tens[8] = "0";
		tens[9] = "0";
		btn_Fixedposition_shi_0_int = 1;
		btn_Fixedposition_shi_1_int = 1;
		btn_Fixedposition_shi_2_int = 1;
		btn_Fixedposition_shi_3_int = 1;
		btn_Fixedposition_shi_4_int = 1;
		btn_Fixedposition_shi_5_int = 1;
		btn_Fixedposition_shi_6_int = 1;
		btn_Fixedposition_shi_7_int = 1;
		btn_Fixedposition_shi_8_int = 1;
		btn_Fixedposition_shi_9_int = 1;
		show(tens);
	}

	private void clearshi() {
		// TODO Auto-generated method stub
		btn_Fixedposition_shi_big.setBackgroundResource(0);
		btn_Fixedposition_shi_little.setBackgroundResource(0);
		btn_Fixedposition_shi_all.setBackgroundResource(0);
		btn_Fixedposition_shi_odd.setBackgroundResource(0);
		btn_Fixedposition_shi_even.setBackgroundResource(0);
		btn_Fixedposition_shi_clear.setBackgroundResource(0);
		btn_Fixedposition_shi_big.setTextColor(0xffcfcfcf);
		btn_Fixedposition_shi_little.setTextColor(0xffcfcfcf);
		btn_Fixedposition_shi_all.setTextColor(0xffcfcfcf);
		btn_Fixedposition_shi_odd.setTextColor(0xffcfcfcf);
		btn_Fixedposition_shi_even.setTextColor(0xffcfcfcf);
		btn_Fixedposition_shi_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_Fixedposition_ge_big() {
		// TODO Auto-generated method stub
		btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_0.setTextColor(0xffdedede);
		btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_1.setTextColor(0xffdedede);
		btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_2.setTextColor(0xffdedede);
		btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_3.setTextColor(0xffdedede);
		btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_4.setTextColor(0xffdedede);
		btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_5.setTextColor(0xffffffff);
		btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_6.setTextColor(0xffffffff);
		btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_7.setTextColor(0xffffffff);
		btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_8.setTextColor(0xffffffff);
		btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_9.setTextColor(0xffffffff);
		decade[5] = "1";
		decade[6] = "1";
		decade[7] = "1";
		decade[8] = "1";
		decade[9] = "1";
		decade[0] = "0";
		decade[1] = "0";
		decade[2] = "0";
		decade[3] = "0";
		decade[4] = "0";

		btn_Fixedposition_ge_0_int = 1;
		btn_Fixedposition_ge_1_int = 1;
		btn_Fixedposition_ge_2_int = 1;
		btn_Fixedposition_ge_3_int = 1;
		btn_Fixedposition_ge_4_int = 1;
		btn_Fixedposition_ge_5_int = -1;
		btn_Fixedposition_ge_6_int = -1;
		btn_Fixedposition_ge_7_int = -1;
		btn_Fixedposition_ge_8_int = -1;
		btn_Fixedposition_ge_9_int = -1;
		show(decade);
	}

	private void getnumber_Fixedposition_ge_little() {
		btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_0.setTextColor(0xffffffff);
		text_Fixedposition_ge_1.setTextColor(0xffffffff);
		text_Fixedposition_ge_2.setTextColor(0xffffffff);
		text_Fixedposition_ge_3.setTextColor(0xffffffff);
		text_Fixedposition_ge_4.setTextColor(0xffffffff);
		text_Fixedposition_ge_5.setTextColor(0xffdedede);
		text_Fixedposition_ge_6.setTextColor(0xffdedede);
		text_Fixedposition_ge_7.setTextColor(0xffdedede);
		text_Fixedposition_ge_8.setTextColor(0xffdedede);
		text_Fixedposition_ge_9.setTextColor(0xffdedede);
		decade[0] = "1";
		decade[1] = "1";
		decade[2] = "1";
		decade[3] = "1";
		decade[4] = "1";
		decade[5] = "0";
		decade[6] = "0";
		decade[7] = "0";
		decade[8] = "0";
		decade[9] = "0";
		btn_Fixedposition_ge_5_int = 1;
		btn_Fixedposition_ge_6_int = 1;
		btn_Fixedposition_ge_7_int = 1;
		btn_Fixedposition_ge_8_int = 1;
		btn_Fixedposition_ge_9_int = 1;
		btn_Fixedposition_ge_0_int = -1;
		btn_Fixedposition_ge_1_int = -1;
		btn_Fixedposition_ge_2_int = -1;
		btn_Fixedposition_ge_3_int = -1;
		btn_Fixedposition_ge_4_int = -1;

		show(decade);
	}

	private void getnumber_Fixedposition_ge_all() {
		btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_0.setTextColor(0xffffffff);
		btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_1.setTextColor(0xffffffff);
		btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_2.setTextColor(0xffffffff);
		btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_3.setTextColor(0xffffffff);
		btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_4.setTextColor(0xffffffff);
		btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_5.setTextColor(0xffffffff);
		btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_6.setTextColor(0xffffffff);
		btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_7.setTextColor(0xffffffff);
		btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_8.setTextColor(0xffffffff);
		btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_9.setTextColor(0xffffffff);
		decade[0] = changestatus(decade[0]);
		decade[1] = changestatus(decade[1]);
		decade[2] = changestatus(decade[2]);
		decade[3] = changestatus(decade[3]);
		decade[4] = changestatus(decade[4]);
		decade[5] = changestatus(decade[5]);
		decade[6] = changestatus(decade[6]);
		decade[7] = changestatus(decade[7]);
		decade[8] = changestatus(decade[8]);
		decade[9] = changestatus(decade[9]);
		decade[1] = "1";
		decade[3] = "1";
		decade[5] = "1";
		decade[7] = "1";
		decade[9] = "1";
		decade[0] = "1";
		decade[2] = "1";
		decade[4] = "1";
		decade[6] = "1";
		decade[8] = "1";
		btn_Fixedposition_ge_0_int = -1;
		btn_Fixedposition_ge_1_int = -1;
		btn_Fixedposition_ge_2_int = -1;
		btn_Fixedposition_ge_3_int = -1;
		btn_Fixedposition_ge_4_int = -1;
		btn_Fixedposition_ge_5_int = -1;
		btn_Fixedposition_ge_6_int = -1;
		btn_Fixedposition_ge_7_int = -1;
		btn_Fixedposition_ge_8_int = -1;
		btn_Fixedposition_ge_9_int = -1;

		show(decade);
	}

	private void getnumber_Fixedposition_ge_odd() {
		btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_0.setTextColor(0xffdedede);
		text_Fixedposition_ge_2.setTextColor(0xffdedede);
		text_Fixedposition_ge_4.setTextColor(0xffdedede);
		text_Fixedposition_ge_6.setTextColor(0xffdedede);
		text_Fixedposition_ge_8.setTextColor(0xffdedede);
		btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_1.setTextColor(0xffffffff);
		text_Fixedposition_ge_3.setTextColor(0xffffffff);
		text_Fixedposition_ge_5.setTextColor(0xffffffff);
		text_Fixedposition_ge_7.setTextColor(0xffffffff);
		text_Fixedposition_ge_9.setTextColor(0xffffffff);
		decade[1] = "1";
		decade[3] = "1";
		decade[5] = "1";
		decade[7] = "1";
		decade[9] = "1";
		decade[0] = "0";
		decade[2] = "0";
		decade[4] = "0";
		decade[6] = "0";
		decade[8] = "0";

		btn_Fixedposition_ge_0_int = 1;
		btn_Fixedposition_ge_2_int = 1;
		btn_Fixedposition_ge_4_int = 1;
		btn_Fixedposition_ge_6_int = 1;
		btn_Fixedposition_ge_8_int = 1;
		btn_Fixedposition_ge_1_int = -1;
		btn_Fixedposition_ge_3_int = -1;
		btn_Fixedposition_ge_5_int = -1;
		btn_Fixedposition_ge_7_int = -1;
		btn_Fixedposition_ge_9_int = -1;
		show(decade);
	}

	private void getnumber_Fixedposition_ge_even() {
		btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
		text_Fixedposition_ge_0.setTextColor(0xffffffff);
		text_Fixedposition_ge_2.setTextColor(0xffffffff);
		text_Fixedposition_ge_4.setTextColor(0xffffffff);
		text_Fixedposition_ge_6.setTextColor(0xffffffff);
		text_Fixedposition_ge_8.setTextColor(0xffffffff);
		btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.round);
		btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_1.setTextColor(0xffdedede);
		text_Fixedposition_ge_3.setTextColor(0xffdedede);
		text_Fixedposition_ge_5.setTextColor(0xffdedede);
		text_Fixedposition_ge_7.setTextColor(0xffdedede);
		text_Fixedposition_ge_9.setTextColor(0xffdedede);
		decade[1] = "0";
		decade[3] = "0";
		decade[5] = "0";
		decade[7] = "0";
		decade[9] = "0";
		decade[0] = "1";
		decade[2] = "1";
		decade[4] = "1";
		decade[6] = "1";
		decade[8] = "1";
		btn_Fixedposition_ge_1_int = 1;
		btn_Fixedposition_ge_3_int = 1;
		btn_Fixedposition_ge_5_int = 1;
		btn_Fixedposition_ge_7_int = 1;
		btn_Fixedposition_ge_9_int = 1;
		btn_Fixedposition_ge_0_int = -1;
		btn_Fixedposition_ge_2_int = -1;
		btn_Fixedposition_ge_4_int = -1;
		btn_Fixedposition_ge_6_int = -1;
		btn_Fixedposition_ge_8_int = -1;

		show(decade);
	}

	private void getnumber_Fixedposition_ge_clear() {
		btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_0.setTextColor(0xffdedede);
		btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_1.setTextColor(0xffdedede);
		btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_2.setTextColor(0xffdedede);
		btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_3.setTextColor(0xffdedede);
		btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_4.setTextColor(0xffdedede);
		btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_5.setTextColor(0xffdedede);
		btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_6.setTextColor(0xffdedede);
		btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_7.setTextColor(0xffdedede);
		btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_8.setTextColor(0xffdedede);
		btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);
		text_Fixedposition_ge_9.setTextColor(0xffdedede);
		decade[0] = "0";
		decade[1] = "0";
		decade[2] = "0";
		decade[3] = "0";
		decade[4] = "0";
		decade[5] = "0";
		decade[6] = "0";
		decade[7] = "0";
		decade[8] = "0";
		decade[9] = "0";
		btn_Fixedposition_ge_0_int = 1;
		btn_Fixedposition_ge_1_int = 1;
		btn_Fixedposition_ge_2_int = 1;
		btn_Fixedposition_ge_3_int = 1;
		btn_Fixedposition_ge_4_int = 1;
		btn_Fixedposition_ge_5_int = 1;
		btn_Fixedposition_ge_6_int = 1;
		btn_Fixedposition_ge_7_int = 1;
		btn_Fixedposition_ge_8_int = 1;
		btn_Fixedposition_ge_9_int = 1;
		show(decade);
	}

	private void clearge() {
		// TODO Auto-generated method stub
		btn_Fixedposition_ge_big.setBackgroundResource(0);
		btn_Fixedposition_ge_little.setBackgroundResource(0);
		btn_Fixedposition_ge_all.setBackgroundResource(0);
		btn_Fixedposition_ge_odd.setBackgroundResource(0);
		btn_Fixedposition_ge_even.setBackgroundResource(0);
		btn_Fixedposition_ge_clear.setBackgroundResource(0);
		btn_Fixedposition_ge_big.setTextColor(0xffcfcfcf);
		btn_Fixedposition_ge_little.setTextColor(0xffcfcfcf);
		btn_Fixedposition_ge_all.setTextColor(0xffcfcfcf);
		btn_Fixedposition_ge_odd.setTextColor(0xffcfcfcf);
		btn_Fixedposition_ge_even.setTextColor(0xffcfcfcf);
		btn_Fixedposition_ge_clear.setTextColor(0xffcfcfcf);

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
				result1 = result1 + i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (kilobit[i].equals("1")) {
				result2 = result2 + i;
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
		if (result1.equals("")) {
			result1 = "";

		}
		if (result2.equals("")) {
			result2 = "";

		}
		if (result3.equals("")) {
			result3 = "";

		}
		if (result4.equals("")) {
			result4 = "";

		}
		if (result5.equals("")) {
			result5 = "";

		}
		// if (!result2.equals("") && !result1.equals("")) {
		// result1 = result1 + "|";
		// }
		// if (!result3.equals("") && !result2.equals("")) {
		// result2 = result2 + "|";
		// }
		// if (!result4.equals("") && !result3.equals("")) {
		// result3 = result3 + "|";
		// }
		// if (!result5.equals("") && !result4.equals("")) {
		// result4 = result4 + "|";
		// }
		result = result1 + "," + result2 + "," + result3 + "," + result4 + "," + result5;
		return result;
	}

	private int getresultint() {
		int result = 0;
		String result1 = "";
		String result2 = "";
		String result3 = "";
		String result4 = "";
		String result5 = "";
		for (int i = 0; i < 10; i++) {
			if (myriabit[i].equals("1")) {
				result1 = result1 + i;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (kilobit[i].equals("1")) {
				result2 = result2 + i;
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

		result = result1.length() + result2.length() + result3.length() + result4.length() + result5.length();
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

	// @SuppressLint("ClickableViewAccessibility")
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// if (clearint == 1) {
		// Message msg = new Message();
		// msg.what = 1;
		// msg.arg1 = 123;
		// msg.arg2 = 321;
		// uiHandler.sendMessage(msg);
		// }
		//
		// clearint++;
		Log.d("boolean onTouch(View v, ", "boolean onTouch(View v, ");
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_Fixedposition_wan_0:

			int actionFixedposition0 = event.getAction();
			if (actionFixedposition0 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x0.setVisibility(View.VISIBLE);
			} else if (actionFixedposition0 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionFixedposition0 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Fixedposition_wan_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionFixedposition1 = event.getAction();
			if (actionFixedposition1 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x1.setVisibility(View.VISIBLE);
			} else if (actionFixedposition1 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x1.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition1 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_2:
			int actionFixedposition2 = event.getAction();
			if (actionFixedposition2 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x2.setVisibility(View.VISIBLE);
			} else if (actionFixedposition2 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x2.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition2 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_3:
			int actionFixedposition3 = event.getAction();
			if (actionFixedposition3 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x3.setVisibility(View.VISIBLE);
			} else if (actionFixedposition3 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x3.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition3 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_4:
			int actionFixedposition4 = event.getAction();
			if (actionFixedposition4 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x4.setVisibility(View.VISIBLE);
			} else if (actionFixedposition4 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x4.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition4 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_5:
			int actionFixedposition5 = event.getAction();
			if (actionFixedposition5 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x5.setVisibility(View.VISIBLE);
			} else if (actionFixedposition5 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x5.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition5 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_6:
			Log.d("btn_1_1", "btn_Fixedposition_wan_6");
			int actionFixedposition6 = event.getAction();
			if (actionFixedposition6 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x6.setVisibility(View.VISIBLE);
			} else if (actionFixedposition6 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x6.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition6 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_7:
			int actionFixedposition7 = event.getAction();
			if (actionFixedposition7 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x7.setVisibility(View.VISIBLE);
			} else if (actionFixedposition7 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x7.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition7 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_8:
			int actionFixedposition8 = event.getAction();
			if (actionFixedposition8 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x8.setVisibility(View.VISIBLE);
			} else if (actionFixedposition8 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x8.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition8 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_wan_9:
			int actionFixedposition9 = event.getAction();
			if (actionFixedposition9 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_wan_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_wan_x9.setVisibility(View.VISIBLE);
			} else if (actionFixedposition9 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x9.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition9 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_wan_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_wan_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_0:

			int actionFixedposition01 = event.getAction();
			if (actionFixedposition01 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Fixedposition_qian_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x0.setVisibility(View.VISIBLE);
			} else if (actionFixedposition01 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionFixedposition01 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Fixedposition_qian_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionFixedposition11 = event.getAction();
			if (actionFixedposition11 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x1.setVisibility(View.VISIBLE);
			} else if (actionFixedposition11 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x1.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition11 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_2:
			int actionFixedposition21 = event.getAction();
			if (actionFixedposition21 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x2.setVisibility(View.VISIBLE);
			} else if (actionFixedposition21 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x2.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition21 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_3:
			int actionFixedposition31 = event.getAction();
			if (actionFixedposition31 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x3.setVisibility(View.VISIBLE);
			} else if (actionFixedposition31 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x3.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition31 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_4:
			int actionFixedposition41 = event.getAction();
			if (actionFixedposition41 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x4.setVisibility(View.VISIBLE);
			} else if (actionFixedposition41 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x4.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition41 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_5:
			int actionFixedposition51 = event.getAction();
			if (actionFixedposition51 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x5.setVisibility(View.VISIBLE);
			} else if (actionFixedposition51 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x5.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition51 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_6:
			Log.d("btn_1_1", "btn_Fixedposition_qian_6");
			int actionFixedposition61 = event.getAction();
			if (actionFixedposition61 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x6.setVisibility(View.VISIBLE);
			} else if (actionFixedposition61 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x6.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition61 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_7:
			int actionFixedposition71 = event.getAction();
			if (actionFixedposition71 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x7.setVisibility(View.VISIBLE);
			} else if (actionFixedposition71 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x7.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition71 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_8:
			int actionFixedposition81 = event.getAction();
			if (actionFixedposition81 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x8.setVisibility(View.VISIBLE);
			} else if (actionFixedposition81 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x8.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition81 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_qian_9:
			int actionFixedposition91 = event.getAction();
			if (actionFixedposition91 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_qian_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_qian_x9.setVisibility(View.VISIBLE);
			} else if (actionFixedposition91 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x9.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition91 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_qian_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_qian_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_0:

			int actionFixedposition02 = event.getAction();
			if (actionFixedposition02 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x0.setVisibility(View.VISIBLE);
			} else if (actionFixedposition02 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionFixedposition02 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Fixedposition_bai_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionFixedposition12 = event.getAction();
			if (actionFixedposition12 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x1.setVisibility(View.VISIBLE);
			} else if (actionFixedposition12 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x1.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition12 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_2:
			int actionFixedposition22 = event.getAction();
			if (actionFixedposition22 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x2.setVisibility(View.VISIBLE);
			} else if (actionFixedposition22 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x2.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition22 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_3:
			int actionFixedposition32 = event.getAction();
			if (actionFixedposition32 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x3.setVisibility(View.VISIBLE);
			} else if (actionFixedposition32 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x3.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition32 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_4:
			int actionFixedposition42 = event.getAction();
			if (actionFixedposition42 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x4.setVisibility(View.VISIBLE);
			} else if (actionFixedposition42 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x4.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition42 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_5:
			int actionFixedposition52 = event.getAction();
			if (actionFixedposition52 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x5.setVisibility(View.VISIBLE);
			} else if (actionFixedposition52 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x5.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition52 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_6:
			Log.d("btn_1_1", "btn_Fixedposition_bai_6");
			int actionFixedposition62 = event.getAction();
			if (actionFixedposition62 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x6.setVisibility(View.VISIBLE);
			} else if (actionFixedposition62 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x6.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition62 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_7:
			int actionFixedposition72 = event.getAction();
			if (actionFixedposition72 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x7.setVisibility(View.VISIBLE);
			} else if (actionFixedposition72 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x7.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition72 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_8:
			int actionFixedposition82 = event.getAction();
			if (actionFixedposition82 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x8.setVisibility(View.VISIBLE);
			} else if (actionFixedposition82 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x8.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition82 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_bai_9:
			int actionFixedposition92 = event.getAction();
			if (actionFixedposition92 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_bai_x9.setVisibility(View.VISIBLE);
			} else if (actionFixedposition92 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x9.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition92 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_bai_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_0:

			int actionFixedposition03 = event.getAction();
			if (actionFixedposition03 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x0.setVisibility(View.VISIBLE);
			} else if (actionFixedposition03 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionFixedposition03 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Fixedposition_shi_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionFixedposition13 = event.getAction();
			if (actionFixedposition13 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x1.setVisibility(View.VISIBLE);
			} else if (actionFixedposition13 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x1.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition13 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_2:
			int actionFixedposition23 = event.getAction();
			if (actionFixedposition23 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x2.setVisibility(View.VISIBLE);
			} else if (actionFixedposition23 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x2.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition23 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_3:
			int actionFixedposition33 = event.getAction();
			if (actionFixedposition33 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x3.setVisibility(View.VISIBLE);
			} else if (actionFixedposition33 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x3.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition33 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_4:
			int actionFixedposition43 = event.getAction();
			if (actionFixedposition43 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x4.setVisibility(View.VISIBLE);
			} else if (actionFixedposition43 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x4.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition43 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_5:
			int actionFixedposition53 = event.getAction();
			if (actionFixedposition53 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x5.setVisibility(View.VISIBLE);
			} else if (actionFixedposition53 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x5.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition53 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_6:
			Log.d("btn_1_1", "btn_Fixedposition_shi_6");
			int actionFixedposition63 = event.getAction();
			if (actionFixedposition63 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x6.setVisibility(View.VISIBLE);
			} else if (actionFixedposition63 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x6.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition63 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_7:
			int actionFixedposition73 = event.getAction();
			if (actionFixedposition73 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x7.setVisibility(View.VISIBLE);
			} else if (actionFixedposition73 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x7.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition73 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_8:
			int actionFixedposition83 = event.getAction();
			if (actionFixedposition83 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x8.setVisibility(View.VISIBLE);
			} else if (actionFixedposition83 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x8.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition83 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_shi_9:
			int actionFixedposition93 = event.getAction();
			if (actionFixedposition93 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_shi_x9.setVisibility(View.VISIBLE);
			} else if (actionFixedposition93 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x9.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition93 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_shi_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_0:

			int actionFixedposition04 = event.getAction();
			if (actionFixedposition04 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x0.setVisibility(View.VISIBLE);
			} else if (actionFixedposition04 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionFixedposition04 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Fixedposition_ge_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionFixedposition14 = event.getAction();
			if (actionFixedposition14 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x1.setVisibility(View.VISIBLE);
			} else if (actionFixedposition14 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x1.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition14 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_2:
			int actionFixedposition24 = event.getAction();
			if (actionFixedposition24 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x2.setVisibility(View.VISIBLE);
			} else if (actionFixedposition24 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x2.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition24 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_3:
			int actionFixedposition34 = event.getAction();
			if (actionFixedposition34 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x3.setVisibility(View.VISIBLE);
			} else if (actionFixedposition34 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x3.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition34 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_4:
			int actionFixedposition44 = event.getAction();
			if (actionFixedposition44 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x4.setVisibility(View.VISIBLE);
			} else if (actionFixedposition44 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x4.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition44 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_5:
			int actionFixedposition54 = event.getAction();
			if (actionFixedposition54 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x5.setVisibility(View.VISIBLE);
			} else if (actionFixedposition54 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x5.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition54 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_6:
			Log.d("btn_1_1", "btn_Fixedposition_ge_6");
			int actionFixedposition64 = event.getAction();
			if (actionFixedposition64 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x6.setVisibility(View.VISIBLE);
			} else if (actionFixedposition64 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x6.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition64 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_7:
			int actionFixedposition74 = event.getAction();
			if (actionFixedposition74 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x7.setVisibility(View.VISIBLE);
			} else if (actionFixedposition74 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x7.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition74 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_8:
			int actionFixedposition84 = event.getAction();
			if (actionFixedposition84 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x8.setVisibility(View.VISIBLE);
			} else if (actionFixedposition84 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x8.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition84 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Fixedposition_ge_9:
			int actionFixedposition94 = event.getAction();
			if (actionFixedposition94 == MotionEvent.ACTION_DOWN) {
				Lin_Fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_Fixedposition_ge_x9.setVisibility(View.VISIBLE);
			} else if (actionFixedposition94 == MotionEvent.ACTION_UP) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x9.setVisibility(View.INVISIBLE);
			} else if (actionFixedposition94 == MotionEvent.ACTION_CANCEL) {
				Lin_Fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_Fixedposition_ge_x9.setVisibility(View.INVISIBLE);
			}
			break;
		default:
			break;
		}
		return false;
	}

	public void selectwan0() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[0] = changestatus(myriabit[0]);
		if (btn_Fixedposition_wan_0_int == 1) {
			btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_0.setTextColor(0xffffffff);
			btn_Fixedposition_wan_0_int = btn_Fixedposition_wan_0_int * -1;
		} else if (btn_Fixedposition_wan_0_int == -1) {
			btn_Fixedposition_wan_0.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_0.setTextColor(0xffdedede);
			btn_Fixedposition_wan_0_int = btn_Fixedposition_wan_0_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan1() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[1] = changestatus(myriabit[1]);
		if (btn_Fixedposition_wan_1_int == 1) {
			btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_1.setTextColor(0xffffffff);
			btn_Fixedposition_wan_1_int = btn_Fixedposition_wan_1_int * -1;
		} else if (btn_Fixedposition_wan_1_int == -1) {
			btn_Fixedposition_wan_1.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_1.setTextColor(0xffdedede);
			btn_Fixedposition_wan_1_int = btn_Fixedposition_wan_1_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan2() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[2] = changestatus(myriabit[2]);
		if (btn_Fixedposition_wan_2_int == 1) {
			btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_2.setTextColor(0xffffffff);
			btn_Fixedposition_wan_2_int = btn_Fixedposition_wan_2_int * -1;
		} else if (btn_Fixedposition_wan_2_int == -1) {
			btn_Fixedposition_wan_2.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_2.setTextColor(0xffdedede);
			btn_Fixedposition_wan_2_int = btn_Fixedposition_wan_2_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan3() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[3] = changestatus(myriabit[3]);
		if (btn_Fixedposition_wan_3_int == 1) {
			btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_3.setTextColor(0xffffffff);
			btn_Fixedposition_wan_3_int = btn_Fixedposition_wan_3_int * -1;
		} else if (btn_Fixedposition_wan_3_int == -1) {
			btn_Fixedposition_wan_3.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_3.setTextColor(0xffdedede);
			btn_Fixedposition_wan_3_int = btn_Fixedposition_wan_3_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan4() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[4] = changestatus(myriabit[4]);
		if (btn_Fixedposition_wan_4_int == 1) {
			btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_4.setTextColor(0xffffffff);
			btn_Fixedposition_wan_4_int = btn_Fixedposition_wan_4_int * -1;
		} else if (btn_Fixedposition_wan_4_int == -1) {
			btn_Fixedposition_wan_4.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_4.setTextColor(0xffdedede);
			btn_Fixedposition_wan_4_int = btn_Fixedposition_wan_4_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan5() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[5] = changestatus(myriabit[5]);
		if (btn_Fixedposition_wan_5_int == 1) {
			btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_5.setTextColor(0xffffffff);
			btn_Fixedposition_wan_5_int = btn_Fixedposition_wan_5_int * -1;
		} else if (btn_Fixedposition_wan_5_int == -1) {
			btn_Fixedposition_wan_5.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_5.setTextColor(0xffdedede);
			btn_Fixedposition_wan_5_int = btn_Fixedposition_wan_5_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan6() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[6] = changestatus(myriabit[6]);
		if (btn_Fixedposition_wan_6_int == 1) {
			btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_6.setTextColor(0xffffffff);
			btn_Fixedposition_wan_6_int = btn_Fixedposition_wan_6_int * -1;
		} else if (btn_Fixedposition_wan_6_int == -1) {
			btn_Fixedposition_wan_6.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_6.setTextColor(0xffdedede);
			btn_Fixedposition_wan_6_int = btn_Fixedposition_wan_6_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan7() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[7] = changestatus(myriabit[7]);
		if (btn_Fixedposition_wan_7_int == 1) {
			btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_7.setTextColor(0xffffffff);
			btn_Fixedposition_wan_7_int = btn_Fixedposition_wan_7_int * -1;
		} else if (btn_Fixedposition_wan_7_int == -1) {
			btn_Fixedposition_wan_7.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_7.setTextColor(0xffdedede);
			btn_Fixedposition_wan_7_int = btn_Fixedposition_wan_7_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan8() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[8] = changestatus(myriabit[8]);
		if (btn_Fixedposition_wan_8_int == 1) {
			btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_8.setTextColor(0xffffffff);
			btn_Fixedposition_wan_8_int = btn_Fixedposition_wan_8_int * -1;
		} else if (btn_Fixedposition_wan_8_int == -1) {
			btn_Fixedposition_wan_8.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_8.setTextColor(0xffdedede);
			btn_Fixedposition_wan_8_int = btn_Fixedposition_wan_8_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectwan9() {
		clearwan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[9] = changestatus(myriabit[9]);
		if (btn_Fixedposition_wan_9_int == 1) {
			btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_wan_9.setTextColor(0xffffffff);
			btn_Fixedposition_wan_9_int = btn_Fixedposition_wan_9_int * -1;
		} else if (btn_Fixedposition_wan_9_int == -1) {
			btn_Fixedposition_wan_9.setBackgroundResource(R.drawable.round);
			text_Fixedposition_wan_9.setTextColor(0xffdedede);
			btn_Fixedposition_wan_9_int = btn_Fixedposition_wan_9_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian0() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[0] = changestatus(kilobit[0]);
		if (btn_Fixedposition_qian_0_int == 1) {
			btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_0.setTextColor(0xffffffff);
			btn_Fixedposition_qian_0_int = btn_Fixedposition_qian_0_int * -1;
		} else if (btn_Fixedposition_qian_0_int == -1) {
			btn_Fixedposition_qian_0.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_0.setTextColor(0xffdedede);
			btn_Fixedposition_qian_0_int = btn_Fixedposition_qian_0_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian1() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[1] = changestatus(kilobit[1]);
		if (btn_Fixedposition_qian_1_int == 1) {
			btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_1.setTextColor(0xffffffff);
			btn_Fixedposition_qian_1_int = btn_Fixedposition_qian_1_int * -1;
		} else if (btn_Fixedposition_qian_1_int == -1) {
			btn_Fixedposition_qian_1.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_1.setTextColor(0xffdedede);
			btn_Fixedposition_qian_1_int = btn_Fixedposition_qian_1_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian2() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[2] = changestatus(kilobit[2]);
		if (btn_Fixedposition_qian_2_int == 1) {
			btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_2.setTextColor(0xffffffff);
			btn_Fixedposition_qian_2_int = btn_Fixedposition_qian_2_int * -1;
		} else if (btn_Fixedposition_qian_2_int == -1) {
			btn_Fixedposition_qian_2.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_2.setTextColor(0xffdedede);
			btn_Fixedposition_qian_2_int = btn_Fixedposition_qian_2_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian3() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[3] = changestatus(kilobit[3]);
		if (btn_Fixedposition_qian_3_int == 1) {
			btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_3.setTextColor(0xffffffff);
			btn_Fixedposition_qian_3_int = btn_Fixedposition_qian_3_int * -1;
		} else if (btn_Fixedposition_qian_3_int == -1) {
			btn_Fixedposition_qian_3.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_3.setTextColor(0xffdedede);
			btn_Fixedposition_qian_3_int = btn_Fixedposition_qian_3_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian4() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[4] = changestatus(kilobit[4]);
		if (btn_Fixedposition_qian_4_int == 1) {
			btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_4.setTextColor(0xffffffff);
			btn_Fixedposition_qian_4_int = btn_Fixedposition_qian_4_int * -1;
		} else if (btn_Fixedposition_qian_4_int == -1) {
			btn_Fixedposition_qian_4.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_4.setTextColor(0xffdedede);
			btn_Fixedposition_qian_4_int = btn_Fixedposition_qian_4_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian5() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[5] = changestatus(kilobit[5]);
		if (btn_Fixedposition_qian_5_int == 1) {
			btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_5.setTextColor(0xffffffff);
			btn_Fixedposition_qian_5_int = btn_Fixedposition_qian_5_int * -1;
		} else if (btn_Fixedposition_qian_5_int == -1) {
			btn_Fixedposition_qian_5.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_5.setTextColor(0xffdedede);
			btn_Fixedposition_qian_5_int = btn_Fixedposition_qian_5_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian6() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[6] = changestatus(kilobit[6]);
		if (btn_Fixedposition_qian_6_int == 1) {
			btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_6.setTextColor(0xffffffff);
			btn_Fixedposition_qian_6_int = btn_Fixedposition_qian_6_int * -1;
		} else if (btn_Fixedposition_qian_6_int == -1) {
			btn_Fixedposition_qian_6.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_6.setTextColor(0xffdedede);
			btn_Fixedposition_qian_6_int = btn_Fixedposition_qian_6_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian7() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[7] = changestatus(kilobit[7]);
		if (btn_Fixedposition_qian_7_int == 1) {
			btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_7.setTextColor(0xffffffff);
			btn_Fixedposition_qian_7_int = btn_Fixedposition_qian_7_int * -1;
		} else if (btn_Fixedposition_qian_7_int == -1) {
			btn_Fixedposition_qian_7.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_7.setTextColor(0xffdedede);
			btn_Fixedposition_qian_7_int = btn_Fixedposition_qian_7_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian8() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[8] = changestatus(kilobit[8]);
		if (btn_Fixedposition_qian_8_int == 1) {
			btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_8.setTextColor(0xffffffff);
			btn_Fixedposition_qian_8_int = btn_Fixedposition_qian_8_int * -1;
		} else if (btn_Fixedposition_qian_8_int == -1) {
			btn_Fixedposition_qian_8.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_8.setTextColor(0xffdedede);
			btn_Fixedposition_qian_8_int = btn_Fixedposition_qian_8_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectqian9() {
		clearqian();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		kilobit[9] = changestatus(kilobit[9]);
		if (btn_Fixedposition_qian_9_int == 1) {
			btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_qian_9.setTextColor(0xffffffff);
			btn_Fixedposition_qian_9_int = btn_Fixedposition_qian_9_int * -1;
		} else if (btn_Fixedposition_qian_9_int == -1) {
			btn_Fixedposition_qian_9.setBackgroundResource(R.drawable.round);
			text_Fixedposition_qian_9.setTextColor(0xffdedede);
			btn_Fixedposition_qian_9_int = btn_Fixedposition_qian_9_int * -1;
		}
		show(kilobit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai0() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[0] = changestatus(hundreds[0]);
		if (btn_Fixedposition_bai_0_int == 1) {
			btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_0.setTextColor(0xffffffff);
			btn_Fixedposition_bai_0_int = btn_Fixedposition_bai_0_int * -1;
		} else if (btn_Fixedposition_bai_0_int == -1) {
			btn_Fixedposition_bai_0.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_0.setTextColor(0xffdedede);
			btn_Fixedposition_bai_0_int = btn_Fixedposition_bai_0_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai1() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[1] = changestatus(hundreds[1]);
		if (btn_Fixedposition_bai_1_int == 1) {
			btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_1.setTextColor(0xffffffff);
			btn_Fixedposition_bai_1_int = btn_Fixedposition_bai_1_int * -1;
		} else if (btn_Fixedposition_bai_1_int == -1) {
			btn_Fixedposition_bai_1.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_1.setTextColor(0xffdedede);
			btn_Fixedposition_bai_1_int = btn_Fixedposition_bai_1_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai2() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[2] = changestatus(hundreds[2]);
		if (btn_Fixedposition_bai_2_int == 1) {
			btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_2.setTextColor(0xffffffff);
			btn_Fixedposition_bai_2_int = btn_Fixedposition_bai_2_int * -1;
		} else if (btn_Fixedposition_bai_2_int == -1) {
			btn_Fixedposition_bai_2.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_2.setTextColor(0xffdedede);
			btn_Fixedposition_bai_2_int = btn_Fixedposition_bai_2_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai3() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[3] = changestatus(hundreds[3]);
		if (btn_Fixedposition_bai_3_int == 1) {
			btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_3.setTextColor(0xffffffff);
			btn_Fixedposition_bai_3_int = btn_Fixedposition_bai_3_int * -1;
		} else if (btn_Fixedposition_bai_3_int == -1) {
			btn_Fixedposition_bai_3.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_3.setTextColor(0xffdedede);
			btn_Fixedposition_bai_3_int = btn_Fixedposition_bai_3_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai4() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[4] = changestatus(hundreds[4]);
		if (btn_Fixedposition_bai_4_int == 1) {
			btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_4.setTextColor(0xffffffff);
			btn_Fixedposition_bai_4_int = btn_Fixedposition_bai_4_int * -1;
		} else if (btn_Fixedposition_bai_4_int == -1) {
			btn_Fixedposition_bai_4.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_4.setTextColor(0xffdedede);
			btn_Fixedposition_bai_4_int = btn_Fixedposition_bai_4_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai5() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[5] = changestatus(hundreds[5]);
		if (btn_Fixedposition_bai_5_int == 1) {
			btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_5.setTextColor(0xffffffff);
			btn_Fixedposition_bai_5_int = btn_Fixedposition_bai_5_int * -1;
		} else if (btn_Fixedposition_bai_5_int == -1) {
			btn_Fixedposition_bai_5.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_5.setTextColor(0xffdedede);
			btn_Fixedposition_bai_5_int = btn_Fixedposition_bai_5_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai6() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[6] = changestatus(hundreds[6]);
		if (btn_Fixedposition_bai_6_int == 1) {
			btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_6.setTextColor(0xffffffff);
			btn_Fixedposition_bai_6_int = btn_Fixedposition_bai_6_int * -1;
		} else if (btn_Fixedposition_bai_6_int == -1) {
			btn_Fixedposition_bai_6.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_6.setTextColor(0xffdedede);
			btn_Fixedposition_bai_6_int = btn_Fixedposition_bai_6_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai7() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[7] = changestatus(hundreds[7]);
		if (btn_Fixedposition_bai_7_int == 1) {
			btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_7.setTextColor(0xffffffff);
			btn_Fixedposition_bai_7_int = btn_Fixedposition_bai_7_int * -1;
		} else if (btn_Fixedposition_bai_7_int == -1) {
			btn_Fixedposition_bai_7.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_7.setTextColor(0xffdedede);
			btn_Fixedposition_bai_7_int = btn_Fixedposition_bai_7_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai8() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[8] = changestatus(hundreds[8]);
		if (btn_Fixedposition_bai_8_int == 1) {
			btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_8.setTextColor(0xffffffff);
			btn_Fixedposition_bai_8_int = btn_Fixedposition_bai_8_int * -1;
		} else if (btn_Fixedposition_bai_8_int == -1) {
			btn_Fixedposition_bai_8.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_8.setTextColor(0xffdedede);
			btn_Fixedposition_bai_8_int = btn_Fixedposition_bai_8_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectbai9() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[9] = changestatus(hundreds[9]);
		if (btn_Fixedposition_bai_9_int == 1) {
			btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_bai_9.setTextColor(0xffffffff);
			btn_Fixedposition_bai_9_int = btn_Fixedposition_bai_9_int * -1;
		} else if (btn_Fixedposition_bai_9_int == -1) {
			btn_Fixedposition_bai_9.setBackgroundResource(R.drawable.round);
			text_Fixedposition_bai_9.setTextColor(0xffdedede);
			btn_Fixedposition_bai_9_int = btn_Fixedposition_bai_9_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi0() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[0] = changestatus(tens[0]);
		if (btn_Fixedposition_shi_0_int == 1) {
			btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_0.setTextColor(0xffffffff);
			btn_Fixedposition_shi_0_int = btn_Fixedposition_shi_0_int * -1;
		} else if (btn_Fixedposition_shi_0_int == -1) {
			btn_Fixedposition_shi_0.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_0.setTextColor(0xffdedede);
			btn_Fixedposition_shi_0_int = btn_Fixedposition_shi_0_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi1() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[1] = changestatus(tens[1]);
		if (btn_Fixedposition_shi_1_int == 1) {
			btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_1.setTextColor(0xffffffff);
			btn_Fixedposition_shi_1_int = btn_Fixedposition_shi_1_int * -1;
		} else if (btn_Fixedposition_shi_1_int == -1) {
			btn_Fixedposition_shi_1.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_1.setTextColor(0xffdedede);
			btn_Fixedposition_shi_1_int = btn_Fixedposition_shi_1_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi2() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[2] = changestatus(tens[2]);
		if (btn_Fixedposition_shi_2_int == 1) {
			btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_2.setTextColor(0xffffffff);
			btn_Fixedposition_shi_2_int = btn_Fixedposition_shi_2_int * -1;
		} else if (btn_Fixedposition_shi_2_int == -1) {
			btn_Fixedposition_shi_2.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_2.setTextColor(0xffdedede);
			btn_Fixedposition_shi_2_int = btn_Fixedposition_shi_2_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi3() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[3] = changestatus(tens[3]);
		if (btn_Fixedposition_shi_3_int == 1) {
			btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_3.setTextColor(0xffffffff);
			btn_Fixedposition_shi_3_int = btn_Fixedposition_shi_3_int * -1;
		} else if (btn_Fixedposition_shi_3_int == -1) {
			btn_Fixedposition_shi_3.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_3.setTextColor(0xffdedede);
			btn_Fixedposition_shi_3_int = btn_Fixedposition_shi_3_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi4() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[4] = changestatus(tens[4]);
		if (btn_Fixedposition_shi_4_int == 1) {
			btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_4.setTextColor(0xffffffff);
			btn_Fixedposition_shi_4_int = btn_Fixedposition_shi_4_int * -1;
		} else if (btn_Fixedposition_shi_4_int == -1) {
			btn_Fixedposition_shi_4.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_4.setTextColor(0xffdedede);
			btn_Fixedposition_shi_4_int = btn_Fixedposition_shi_4_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi5() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[5] = changestatus(tens[5]);
		if (btn_Fixedposition_shi_5_int == 1) {
			btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_5.setTextColor(0xffffffff);
			btn_Fixedposition_shi_5_int = btn_Fixedposition_shi_5_int * -1;
		} else if (btn_Fixedposition_shi_5_int == -1) {
			btn_Fixedposition_shi_5.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_5.setTextColor(0xffdedede);
			btn_Fixedposition_shi_5_int = btn_Fixedposition_shi_5_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi6() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[6] = changestatus(tens[6]);
		if (btn_Fixedposition_shi_6_int == 1) {
			btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_6.setTextColor(0xffffffff);
			btn_Fixedposition_shi_6_int = btn_Fixedposition_shi_6_int * -1;
		} else if (btn_Fixedposition_shi_6_int == -1) {
			btn_Fixedposition_shi_6.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_6.setTextColor(0xffdedede);
			btn_Fixedposition_shi_6_int = btn_Fixedposition_shi_6_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi7() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[7] = changestatus(tens[7]);
		if (btn_Fixedposition_shi_7_int == 1) {
			btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_7.setTextColor(0xffffffff);
			btn_Fixedposition_shi_7_int = btn_Fixedposition_shi_7_int * -1;
		} else if (btn_Fixedposition_shi_7_int == -1) {
			btn_Fixedposition_shi_7.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_7.setTextColor(0xffdedede);
			btn_Fixedposition_shi_7_int = btn_Fixedposition_shi_7_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi8() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[8] = changestatus(tens[8]);
		if (btn_Fixedposition_shi_8_int == 1) {
			btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_8.setTextColor(0xffffffff);
			btn_Fixedposition_shi_8_int = btn_Fixedposition_shi_8_int * -1;
		} else if (btn_Fixedposition_shi_8_int == -1) {
			btn_Fixedposition_shi_8.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_8.setTextColor(0xffdedede);
			btn_Fixedposition_shi_8_int = btn_Fixedposition_shi_8_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectshi9() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[9] = changestatus(tens[9]);
		if (btn_Fixedposition_shi_9_int == 1) {
			btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_shi_9.setTextColor(0xffffffff);
			btn_Fixedposition_shi_9_int = btn_Fixedposition_shi_9_int * -1;
		} else if (btn_Fixedposition_shi_9_int == -1) {
			btn_Fixedposition_shi_9.setBackgroundResource(R.drawable.round);
			text_Fixedposition_shi_9.setTextColor(0xffdedede);
			btn_Fixedposition_shi_9_int = btn_Fixedposition_shi_9_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge0() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[0] = changestatus(decade[0]);
		if (btn_Fixedposition_ge_0_int == 1) {
			btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_0.setTextColor(0xffffffff);
			btn_Fixedposition_ge_0_int = btn_Fixedposition_ge_0_int * -1;
		} else if (btn_Fixedposition_ge_0_int == -1) {
			btn_Fixedposition_ge_0.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_0.setTextColor(0xffdedede);
			btn_Fixedposition_ge_0_int = btn_Fixedposition_ge_0_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge1() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[1] = changestatus(decade[1]);
		if (btn_Fixedposition_ge_1_int == 1) {
			btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_1.setTextColor(0xffffffff);
			btn_Fixedposition_ge_1_int = btn_Fixedposition_ge_1_int * -1;
		} else if (btn_Fixedposition_ge_1_int == -1) {
			btn_Fixedposition_ge_1.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_1.setTextColor(0xffdedede);
			btn_Fixedposition_ge_1_int = btn_Fixedposition_ge_1_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge2() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[2] = changestatus(decade[2]);
		if (btn_Fixedposition_ge_2_int == 1) {
			btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_2.setTextColor(0xffffffff);
			btn_Fixedposition_ge_2_int = btn_Fixedposition_ge_2_int * -1;
		} else if (btn_Fixedposition_ge_2_int == -1) {
			btn_Fixedposition_ge_2.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_2.setTextColor(0xffdedede);
			btn_Fixedposition_ge_2_int = btn_Fixedposition_ge_2_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge3() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[3] = changestatus(decade[3]);
		if (btn_Fixedposition_ge_3_int == 1) {
			btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_3.setTextColor(0xffffffff);
			btn_Fixedposition_ge_3_int = btn_Fixedposition_ge_3_int * -1;
		} else if (btn_Fixedposition_ge_3_int == -1) {
			btn_Fixedposition_ge_3.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_3.setTextColor(0xffdedede);
			btn_Fixedposition_ge_3_int = btn_Fixedposition_ge_3_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge4() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[4] = changestatus(decade[4]);
		if (btn_Fixedposition_ge_4_int == 1) {
			btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_4.setTextColor(0xffffffff);
			btn_Fixedposition_ge_4_int = btn_Fixedposition_ge_4_int * -1;
		} else if (btn_Fixedposition_ge_4_int == -1) {
			btn_Fixedposition_ge_4.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_4.setTextColor(0xffdedede);
			btn_Fixedposition_ge_4_int = btn_Fixedposition_ge_4_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge5() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[5] = changestatus(decade[5]);
		if (btn_Fixedposition_ge_5_int == 1) {
			btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_5.setTextColor(0xffffffff);
			btn_Fixedposition_ge_5_int = btn_Fixedposition_ge_5_int * -1;
		} else if (btn_Fixedposition_ge_5_int == -1) {
			btn_Fixedposition_ge_5.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_5.setTextColor(0xffdedede);
			btn_Fixedposition_ge_5_int = btn_Fixedposition_ge_5_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge6() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[6] = changestatus(decade[6]);
		if (btn_Fixedposition_ge_6_int == 1) {
			btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_6.setTextColor(0xffffffff);
			btn_Fixedposition_ge_6_int = btn_Fixedposition_ge_6_int * -1;
		} else if (btn_Fixedposition_ge_6_int == -1) {
			btn_Fixedposition_ge_6.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_6.setTextColor(0xffdedede);
			btn_Fixedposition_ge_6_int = btn_Fixedposition_ge_6_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge7() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[7] = changestatus(decade[7]);
		if (btn_Fixedposition_ge_7_int == 1) {
			btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_7.setTextColor(0xffffffff);
			btn_Fixedposition_ge_7_int = btn_Fixedposition_ge_7_int * -1;
		} else if (btn_Fixedposition_ge_7_int == -1) {
			btn_Fixedposition_ge_7.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_7.setTextColor(0xffdedede);
			btn_Fixedposition_ge_7_int = btn_Fixedposition_ge_7_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge8() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[8] = changestatus(decade[8]);
		if (btn_Fixedposition_ge_8_int == 1) {
			btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_8.setTextColor(0xffffffff);
			btn_Fixedposition_ge_8_int = btn_Fixedposition_ge_8_int * -1;
		} else if (btn_Fixedposition_ge_8_int == -1) {
			btn_Fixedposition_ge_8.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_8.setTextColor(0xffdedede);
			btn_Fixedposition_ge_8_int = btn_Fixedposition_ge_8_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectge9() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[9] = changestatus(decade[9]);
		if (btn_Fixedposition_ge_9_int == 1) {
			btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
			text_Fixedposition_ge_9.setTextColor(0xffffffff);
			btn_Fixedposition_ge_9_int = btn_Fixedposition_ge_9_int * -1;
		} else if (btn_Fixedposition_ge_9_int == -1) {
			btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);
			text_Fixedposition_ge_9.setTextColor(0xffdedede);
			btn_Fixedposition_ge_9_int = btn_Fixedposition_ge_9_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	// public void rocknumber() {
	// Log.d("jvkvggvvvgvgvg", "kbhhb");
	// int wan = (int) (Math.random() * 10);
	// selectwan(wan);
	// // switch (wan) {
	// // case 0:
	// // selectwan0();
	// // break;
	// // case 1:
	// // selectwan1();
	// // break;
	// // case 2:
	// // selectwan2();
	// // break;
	// // case 3:
	// // selectwan3();
	// // break;
	// // case 4:
	// // selectwan4();
	// // break;
	// // case 5:
	// // selectwan5();
	// // break;
	// // case 6:
	// // selectwan6();
	// // break;
	// // case 7:
	// // selectwan7();
	// // break;
	// // case 8:
	// // selectwan8();
	// // break;
	// // case 9:
	// // selectwan9();
	// // break;
	// //
	// // default:
	// // break;
	// // }
	// }
	//
	// private void selectwan(int wan) {
	// // TODO Auto-generated method stub
	// Log.d("hjhh", "nhghgf");
	// number = wan;
	// Message msg = new Message();
	// msg.what = 2;
	// msg.arg1 = 123;
	// msg.arg2 = 321;
	// uiHandler.sendMessage(msg);
	// }
	//
	// public void gonumber() {
	// // TODO Auto-generated method stub
	// Log.d("jkhjkhjkh", "jkjkjjjjjj");
	// // btn_Fixedposition_ge_9.setBackgroundResource(R.drawable.round);
	// }
}
