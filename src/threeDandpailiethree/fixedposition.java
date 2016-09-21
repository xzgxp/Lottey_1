package threeDandpailiethree;

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

public class fixedposition extends threeDBaseFragmentticket implements OnClickListener, OnTouchListener {
	private int number = 0;
	private ImageButton imagebtn_addbasket;
	private LinearLayout LinearLayout_ischoose;
	private LinearLayout LinearLayout_numberbasket;
	private RelativeLayout RelativeLayout_addbasket;
	private LinearLayout LinearLayout_rocknumber;
	private TextView text_chooseend;
	private TextView text_chooseresult;
	private LinearLayout LinearLayout_nochoose;
	private threeDBaseActivityticket mMainActivity;
	private String TAG = "ghghg";
	private LinearLayout Lin_fixedposition_bai_two;
	private LinearLayout Lin_fixedposition_bai_one;
	private Button btn_fixedposition_bai_0;
	private Button btn_fixedposition_bai_1;
	private Button btn_fixedposition_bai_2;
	private Button btn_fixedposition_bai_3;
	private Button btn_fixedposition_bai_4;
	private Button btn_fixedposition_bai_5;
	private Button btn_fixedposition_bai_6;
	private Button btn_fixedposition_bai_7;
	private Button btn_fixedposition_bai_8;
	private Button btn_fixedposition_bai_9;
	private Button btn_fixedposition_bai_big;
	private Button btn_fixedposition_bai_little;
	private Button btn_fixedposition_bai_all;
	private Button btn_fixedposition_bai_odd;
	private Button btn_fixedposition_bai_even;
	private Button btn_fixedposition_bai_clear;
	private RelativeLayout btn_fixedposition_bai_x0;
	private RelativeLayout btn_fixedposition_bai_x1;
	private RelativeLayout btn_fixedposition_bai_x2;
	private RelativeLayout btn_fixedposition_bai_x3;
	private RelativeLayout btn_fixedposition_bai_x4;
	private RelativeLayout btn_fixedposition_bai_x5;
	private RelativeLayout btn_fixedposition_bai_x6;
	private RelativeLayout btn_fixedposition_bai_x7;
	private RelativeLayout btn_fixedposition_bai_x8;
	private RelativeLayout btn_fixedposition_bai_x9;
	private Integer btn_fixedposition_bai_0_int = 1;
	private Integer btn_fixedposition_bai_1_int = 1;
	private Integer btn_fixedposition_bai_2_int = 1;
	private Integer btn_fixedposition_bai_3_int = 1;
	private Integer btn_fixedposition_bai_4_int = 1;
	private Integer btn_fixedposition_bai_5_int = 1;
	private Integer btn_fixedposition_bai_6_int = 1;
	private Integer btn_fixedposition_bai_7_int = 1;
	private Integer btn_fixedposition_bai_8_int = 1;
	private Integer btn_fixedposition_bai_9_int = 1;
	private TextView text_fixedposition_bai_0;
	private TextView text_fixedposition_bai_1;
	private TextView text_fixedposition_bai_2;
	private TextView text_fixedposition_bai_3;
	private TextView text_fixedposition_bai_4;
	private TextView text_fixedposition_bai_5;
	private TextView text_fixedposition_bai_6;
	private TextView text_fixedposition_bai_7;
	private TextView text_fixedposition_bai_8;
	private TextView text_fixedposition_bai_9;
	private LinearLayout Lin_fixedposition_shi_two;
	private LinearLayout Lin_fixedposition_shi_one;
	private Button btn_fixedposition_shi_0;
	private Button btn_fixedposition_shi_1;
	private Button btn_fixedposition_shi_2;
	private Button btn_fixedposition_shi_3;
	private Button btn_fixedposition_shi_4;
	private Button btn_fixedposition_shi_5;
	private Button btn_fixedposition_shi_6;
	private Button btn_fixedposition_shi_7;
	private Button btn_fixedposition_shi_8;
	private Button btn_fixedposition_shi_9;
	private Button btn_fixedposition_shi_big;
	private Button btn_fixedposition_shi_little;
	private Button btn_fixedposition_shi_all;
	private Button btn_fixedposition_shi_odd;
	private Button btn_fixedposition_shi_even;
	private Button btn_fixedposition_shi_clear;
	private RelativeLayout btn_fixedposition_shi_x0;
	private RelativeLayout btn_fixedposition_shi_x1;
	private RelativeLayout btn_fixedposition_shi_x2;
	private RelativeLayout btn_fixedposition_shi_x3;
	private RelativeLayout btn_fixedposition_shi_x4;
	private RelativeLayout btn_fixedposition_shi_x5;
	private RelativeLayout btn_fixedposition_shi_x6;
	private RelativeLayout btn_fixedposition_shi_x7;
	private RelativeLayout btn_fixedposition_shi_x8;
	private RelativeLayout btn_fixedposition_shi_x9;
	private Integer btn_fixedposition_shi_0_int = 1;
	private Integer btn_fixedposition_shi_1_int = 1;
	private Integer btn_fixedposition_shi_2_int = 1;
	private Integer btn_fixedposition_shi_3_int = 1;
	private Integer btn_fixedposition_shi_4_int = 1;
	private Integer btn_fixedposition_shi_5_int = 1;
	private Integer btn_fixedposition_shi_6_int = 1;
	private Integer btn_fixedposition_shi_7_int = 1;
	private Integer btn_fixedposition_shi_8_int = 1;
	private Integer btn_fixedposition_shi_9_int = 1;
	private TextView text_fixedposition_shi_0;
	private TextView text_fixedposition_shi_1;
	private TextView text_fixedposition_shi_2;
	private TextView text_fixedposition_shi_3;
	private TextView text_fixedposition_shi_4;
	private TextView text_fixedposition_shi_5;
	private TextView text_fixedposition_shi_6;
	private TextView text_fixedposition_shi_7;
	private TextView text_fixedposition_shi_8;
	private TextView text_fixedposition_shi_9;
	private LinearLayout Lin_fixedposition_ge_two;
	private LinearLayout Lin_fixedposition_ge_one;
	private Button btn_fixedposition_ge_0;
	private Button btn_fixedposition_ge_1;
	private Button btn_fixedposition_ge_2;
	private Button btn_fixedposition_ge_3;
	private Button btn_fixedposition_ge_4;
	private Button btn_fixedposition_ge_5;
	private Button btn_fixedposition_ge_6;
	private Button btn_fixedposition_ge_7;
	private Button btn_fixedposition_ge_8;
	private Button btn_fixedposition_ge_9;
	private Button btn_fixedposition_ge_big;
	private Button btn_fixedposition_ge_little;
	private Button btn_fixedposition_ge_all;
	private Button btn_fixedposition_ge_odd;
	private Button btn_fixedposition_ge_even;
	private Button btn_fixedposition_ge_clear;
	private RelativeLayout btn_fixedposition_ge_x0;
	private RelativeLayout btn_fixedposition_ge_x1;
	private RelativeLayout btn_fixedposition_ge_x2;
	private RelativeLayout btn_fixedposition_ge_x3;
	private RelativeLayout btn_fixedposition_ge_x4;
	private RelativeLayout btn_fixedposition_ge_x5;
	private RelativeLayout btn_fixedposition_ge_x6;
	private RelativeLayout btn_fixedposition_ge_x7;
	private RelativeLayout btn_fixedposition_ge_x8;
	private RelativeLayout btn_fixedposition_ge_x9;
	private Integer btn_fixedposition_ge_0_int = 1;
	private Integer btn_fixedposition_ge_1_int = 1;
	private Integer btn_fixedposition_ge_2_int = 1;
	private Integer btn_fixedposition_ge_3_int = 1;
	private Integer btn_fixedposition_ge_4_int = 1;
	private Integer btn_fixedposition_ge_5_int = 1;
	private Integer btn_fixedposition_ge_6_int = 1;
	private Integer btn_fixedposition_ge_7_int = 1;
	private Integer btn_fixedposition_ge_8_int = 1;
	private Integer btn_fixedposition_ge_9_int = 1;
	private TextView text_fixedposition_ge_0;
	private TextView text_fixedposition_ge_1;
	private TextView text_fixedposition_ge_2;
	private TextView text_fixedposition_ge_3;
	private TextView text_fixedposition_ge_4;
	private TextView text_fixedposition_ge_5;
	private TextView text_fixedposition_ge_6;
	private TextView text_fixedposition_ge_7;
	private TextView text_fixedposition_ge_8;
	private TextView text_fixedposition_ge_9;
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
				btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);

				// address.this.statusTextView.setText("�ļ��������");
				break;
			}
		}
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.d_fixedposition, container, false);
		mMainActivity = (threeDBaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		RelativeLayout_addbasket = (RelativeLayout) context.findViewById(R.id.RelativeLayout_addbasket);

		text_chooseend = (TextView) context.findViewById(R.id.text_chooseend);
		text_chooseresult = (TextView) context.findViewById(R.id.text_chooseresult);
		LinearLayout_nochoose = (LinearLayout) context.findViewById(R.id.LinearLayout_nochoose);
		vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

		Lin_fixedposition_bai_one = (LinearLayout) context.findViewById(R.id.Lin_fixedposition_bai_one);
		Lin_fixedposition_bai_two = (LinearLayout) context.findViewById(R.id.Lin_fixedposition_bai_two);
		btn_fixedposition_bai_0 = (Button) context.findViewById(R.id.btn_fixedposition_bai_0);
		btn_fixedposition_bai_1 = (Button) context.findViewById(R.id.btn_fixedposition_bai_1);
		btn_fixedposition_bai_2 = (Button) context.findViewById(R.id.btn_fixedposition_bai_2);
		btn_fixedposition_bai_3 = (Button) context.findViewById(R.id.btn_fixedposition_bai_3);
		btn_fixedposition_bai_4 = (Button) context.findViewById(R.id.btn_fixedposition_bai_4);
		btn_fixedposition_bai_5 = (Button) context.findViewById(R.id.btn_fixedposition_bai_5);
		btn_fixedposition_bai_6 = (Button) context.findViewById(R.id.btn_fixedposition_bai_6);
		btn_fixedposition_bai_7 = (Button) context.findViewById(R.id.btn_fixedposition_bai_7);
		btn_fixedposition_bai_8 = (Button) context.findViewById(R.id.btn_fixedposition_bai_8);
		btn_fixedposition_bai_9 = (Button) context.findViewById(R.id.btn_fixedposition_bai_9);
		btn_fixedposition_bai_x0 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x0);
		btn_fixedposition_bai_x1 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x1);
		btn_fixedposition_bai_x2 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x2);
		btn_fixedposition_bai_x3 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x3);
		btn_fixedposition_bai_x4 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x4);
		btn_fixedposition_bai_x5 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x5);
		btn_fixedposition_bai_x6 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x6);
		btn_fixedposition_bai_x7 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x7);
		btn_fixedposition_bai_x8 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x8);
		btn_fixedposition_bai_x9 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_bai_x9);
		text_fixedposition_bai_0 = (TextView) context.findViewById(R.id.text_fixedposition_bai_0);
		text_fixedposition_bai_1 = (TextView) context.findViewById(R.id.text_fixedposition_bai_1);
		text_fixedposition_bai_2 = (TextView) context.findViewById(R.id.text_fixedposition_bai_2);
		text_fixedposition_bai_3 = (TextView) context.findViewById(R.id.text_fixedposition_bai_3);
		text_fixedposition_bai_4 = (TextView) context.findViewById(R.id.text_fixedposition_bai_4);
		text_fixedposition_bai_5 = (TextView) context.findViewById(R.id.text_fixedposition_bai_5);
		text_fixedposition_bai_6 = (TextView) context.findViewById(R.id.text_fixedposition_bai_6);
		text_fixedposition_bai_7 = (TextView) context.findViewById(R.id.text_fixedposition_bai_7);
		text_fixedposition_bai_8 = (TextView) context.findViewById(R.id.text_fixedposition_bai_8);
		text_fixedposition_bai_9 = (TextView) context.findViewById(R.id.text_fixedposition_bai_9);
		btn_fixedposition_bai_big = (Button) context.findViewById(R.id.btn_fixedposition_bai_big);
		btn_fixedposition_bai_little = (Button) context.findViewById(R.id.btn_fixedposition_bai_little);
		btn_fixedposition_bai_all = (Button) context.findViewById(R.id.btn_fixedposition_bai_all);
		btn_fixedposition_bai_odd = (Button) context.findViewById(R.id.btn_fixedposition_bai_odd);
		btn_fixedposition_bai_even = (Button) context.findViewById(R.id.btn_fixedposition_bai_even);
		btn_fixedposition_bai_clear = (Button) context.findViewById(R.id.btn_fixedposition_bai_clear);

		btn_fixedposition_bai_0.setOnTouchListener(this);
		btn_fixedposition_bai_1.setOnTouchListener(this);
		btn_fixedposition_bai_2.setOnTouchListener(this);
		btn_fixedposition_bai_3.setOnTouchListener(this);
		btn_fixedposition_bai_4.setOnTouchListener(this);
		btn_fixedposition_bai_5.setOnTouchListener(this);
		btn_fixedposition_bai_6.setOnTouchListener(this);
		btn_fixedposition_bai_7.setOnTouchListener(this);
		btn_fixedposition_bai_8.setOnTouchListener(this);
		btn_fixedposition_bai_9.setOnTouchListener(this);
		btn_fixedposition_bai_0.setOnClickListener(this);
		btn_fixedposition_bai_1.setOnClickListener(this);
		btn_fixedposition_bai_2.setOnClickListener(this);
		btn_fixedposition_bai_3.setOnClickListener(this);
		btn_fixedposition_bai_4.setOnClickListener(this);
		btn_fixedposition_bai_5.setOnClickListener(this);
		btn_fixedposition_bai_6.setOnClickListener(this);
		btn_fixedposition_bai_7.setOnClickListener(this);
		btn_fixedposition_bai_8.setOnClickListener(this);
		btn_fixedposition_bai_9.setOnClickListener(this);
		btn_fixedposition_bai_big.setOnClickListener(this);
		btn_fixedposition_bai_little.setOnClickListener(this);
		btn_fixedposition_bai_all.setOnClickListener(this);
		btn_fixedposition_bai_odd.setOnClickListener(this);
		btn_fixedposition_bai_even.setOnClickListener(this);
		btn_fixedposition_bai_clear.setOnClickListener(this);
		Lin_fixedposition_shi_one = (LinearLayout) context.findViewById(R.id.Lin_fixedposition_shi_one);
		Lin_fixedposition_shi_two = (LinearLayout) context.findViewById(R.id.Lin_fixedposition_shi_two);
		btn_fixedposition_shi_0 = (Button) context.findViewById(R.id.btn_fixedposition_shi_0);
		btn_fixedposition_shi_1 = (Button) context.findViewById(R.id.btn_fixedposition_shi_1);
		btn_fixedposition_shi_2 = (Button) context.findViewById(R.id.btn_fixedposition_shi_2);
		btn_fixedposition_shi_3 = (Button) context.findViewById(R.id.btn_fixedposition_shi_3);
		btn_fixedposition_shi_4 = (Button) context.findViewById(R.id.btn_fixedposition_shi_4);
		btn_fixedposition_shi_5 = (Button) context.findViewById(R.id.btn_fixedposition_shi_5);
		btn_fixedposition_shi_6 = (Button) context.findViewById(R.id.btn_fixedposition_shi_6);
		btn_fixedposition_shi_7 = (Button) context.findViewById(R.id.btn_fixedposition_shi_7);
		btn_fixedposition_shi_8 = (Button) context.findViewById(R.id.btn_fixedposition_shi_8);
		btn_fixedposition_shi_9 = (Button) context.findViewById(R.id.btn_fixedposition_shi_9);
		btn_fixedposition_shi_x0 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x0);
		btn_fixedposition_shi_x1 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x1);
		btn_fixedposition_shi_x2 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x2);
		btn_fixedposition_shi_x3 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x3);
		btn_fixedposition_shi_x4 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x4);
		btn_fixedposition_shi_x5 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x5);
		btn_fixedposition_shi_x6 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x6);
		btn_fixedposition_shi_x7 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x7);
		btn_fixedposition_shi_x8 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x8);
		btn_fixedposition_shi_x9 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_shi_x9);
		text_fixedposition_shi_0 = (TextView) context.findViewById(R.id.text_fixedposition_shi_0);
		text_fixedposition_shi_1 = (TextView) context.findViewById(R.id.text_fixedposition_shi_1);
		text_fixedposition_shi_2 = (TextView) context.findViewById(R.id.text_fixedposition_shi_2);
		text_fixedposition_shi_3 = (TextView) context.findViewById(R.id.text_fixedposition_shi_3);
		text_fixedposition_shi_4 = (TextView) context.findViewById(R.id.text_fixedposition_shi_4);
		text_fixedposition_shi_5 = (TextView) context.findViewById(R.id.text_fixedposition_shi_5);
		text_fixedposition_shi_6 = (TextView) context.findViewById(R.id.text_fixedposition_shi_6);
		text_fixedposition_shi_7 = (TextView) context.findViewById(R.id.text_fixedposition_shi_7);
		text_fixedposition_shi_8 = (TextView) context.findViewById(R.id.text_fixedposition_shi_8);
		text_fixedposition_shi_9 = (TextView) context.findViewById(R.id.text_fixedposition_shi_9);
		btn_fixedposition_shi_big = (Button) context.findViewById(R.id.btn_fixedposition_shi_big);
		btn_fixedposition_shi_little = (Button) context.findViewById(R.id.btn_fixedposition_shi_little);
		btn_fixedposition_shi_all = (Button) context.findViewById(R.id.btn_fixedposition_shi_all);
		btn_fixedposition_shi_odd = (Button) context.findViewById(R.id.btn_fixedposition_shi_odd);
		btn_fixedposition_shi_even = (Button) context.findViewById(R.id.btn_fixedposition_shi_even);
		btn_fixedposition_shi_clear = (Button) context.findViewById(R.id.btn_fixedposition_shi_clear);

		btn_fixedposition_shi_0.setOnTouchListener(this);
		btn_fixedposition_shi_1.setOnTouchListener(this);
		btn_fixedposition_shi_2.setOnTouchListener(this);
		btn_fixedposition_shi_3.setOnTouchListener(this);
		btn_fixedposition_shi_4.setOnTouchListener(this);
		btn_fixedposition_shi_5.setOnTouchListener(this);
		btn_fixedposition_shi_6.setOnTouchListener(this);
		btn_fixedposition_shi_7.setOnTouchListener(this);
		btn_fixedposition_shi_8.setOnTouchListener(this);
		btn_fixedposition_shi_9.setOnTouchListener(this);
		btn_fixedposition_shi_0.setOnClickListener(this);
		btn_fixedposition_shi_1.setOnClickListener(this);
		btn_fixedposition_shi_2.setOnClickListener(this);
		btn_fixedposition_shi_3.setOnClickListener(this);
		btn_fixedposition_shi_4.setOnClickListener(this);
		btn_fixedposition_shi_5.setOnClickListener(this);
		btn_fixedposition_shi_6.setOnClickListener(this);
		btn_fixedposition_shi_7.setOnClickListener(this);
		btn_fixedposition_shi_8.setOnClickListener(this);
		btn_fixedposition_shi_9.setOnClickListener(this);
		btn_fixedposition_shi_big.setOnClickListener(this);
		btn_fixedposition_shi_little.setOnClickListener(this);
		btn_fixedposition_shi_all.setOnClickListener(this);
		btn_fixedposition_shi_odd.setOnClickListener(this);
		btn_fixedposition_shi_even.setOnClickListener(this);
		btn_fixedposition_shi_clear.setOnClickListener(this);
		Lin_fixedposition_ge_one = (LinearLayout) context.findViewById(R.id.Lin_fixedposition_ge_one);
		Lin_fixedposition_ge_two = (LinearLayout) context.findViewById(R.id.Lin_fixedposition_ge_two);
		btn_fixedposition_ge_0 = (Button) context.findViewById(R.id.btn_fixedposition_ge_0);
		btn_fixedposition_ge_1 = (Button) context.findViewById(R.id.btn_fixedposition_ge_1);
		btn_fixedposition_ge_2 = (Button) context.findViewById(R.id.btn_fixedposition_ge_2);
		btn_fixedposition_ge_3 = (Button) context.findViewById(R.id.btn_fixedposition_ge_3);
		btn_fixedposition_ge_4 = (Button) context.findViewById(R.id.btn_fixedposition_ge_4);
		btn_fixedposition_ge_5 = (Button) context.findViewById(R.id.btn_fixedposition_ge_5);
		btn_fixedposition_ge_6 = (Button) context.findViewById(R.id.btn_fixedposition_ge_6);
		btn_fixedposition_ge_7 = (Button) context.findViewById(R.id.btn_fixedposition_ge_7);
		btn_fixedposition_ge_8 = (Button) context.findViewById(R.id.btn_fixedposition_ge_8);
		btn_fixedposition_ge_9 = (Button) context.findViewById(R.id.btn_fixedposition_ge_9);
		btn_fixedposition_ge_x0 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x0);
		btn_fixedposition_ge_x1 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x1);
		btn_fixedposition_ge_x2 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x2);
		btn_fixedposition_ge_x3 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x3);
		btn_fixedposition_ge_x4 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x4);
		btn_fixedposition_ge_x5 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x5);
		btn_fixedposition_ge_x6 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x6);
		btn_fixedposition_ge_x7 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x7);
		btn_fixedposition_ge_x8 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x8);
		btn_fixedposition_ge_x9 = (RelativeLayout) context.findViewById(R.id.btn_fixedposition_ge_x9);
		text_fixedposition_ge_0 = (TextView) context.findViewById(R.id.text_fixedposition_ge_0);
		text_fixedposition_ge_1 = (TextView) context.findViewById(R.id.text_fixedposition_ge_1);
		text_fixedposition_ge_2 = (TextView) context.findViewById(R.id.text_fixedposition_ge_2);
		text_fixedposition_ge_3 = (TextView) context.findViewById(R.id.text_fixedposition_ge_3);
		text_fixedposition_ge_4 = (TextView) context.findViewById(R.id.text_fixedposition_ge_4);
		text_fixedposition_ge_5 = (TextView) context.findViewById(R.id.text_fixedposition_ge_5);
		text_fixedposition_ge_6 = (TextView) context.findViewById(R.id.text_fixedposition_ge_6);
		text_fixedposition_ge_7 = (TextView) context.findViewById(R.id.text_fixedposition_ge_7);
		text_fixedposition_ge_8 = (TextView) context.findViewById(R.id.text_fixedposition_ge_8);
		text_fixedposition_ge_9 = (TextView) context.findViewById(R.id.text_fixedposition_ge_9);
		btn_fixedposition_ge_big = (Button) context.findViewById(R.id.btn_fixedposition_ge_big);
		btn_fixedposition_ge_little = (Button) context.findViewById(R.id.btn_fixedposition_ge_little);
		btn_fixedposition_ge_all = (Button) context.findViewById(R.id.btn_fixedposition_ge_all);
		btn_fixedposition_ge_odd = (Button) context.findViewById(R.id.btn_fixedposition_ge_odd);
		btn_fixedposition_ge_even = (Button) context.findViewById(R.id.btn_fixedposition_ge_even);
		btn_fixedposition_ge_clear = (Button) context.findViewById(R.id.btn_fixedposition_ge_clear);

		btn_fixedposition_ge_0.setOnTouchListener(this);
		btn_fixedposition_ge_1.setOnTouchListener(this);
		btn_fixedposition_ge_2.setOnTouchListener(this);
		btn_fixedposition_ge_3.setOnTouchListener(this);
		btn_fixedposition_ge_4.setOnTouchListener(this);
		btn_fixedposition_ge_5.setOnTouchListener(this);
		btn_fixedposition_ge_6.setOnTouchListener(this);
		btn_fixedposition_ge_7.setOnTouchListener(this);
		btn_fixedposition_ge_8.setOnTouchListener(this);
		btn_fixedposition_ge_9.setOnTouchListener(this);
		btn_fixedposition_ge_0.setOnClickListener(this);
		btn_fixedposition_ge_1.setOnClickListener(this);
		btn_fixedposition_ge_2.setOnClickListener(this);
		btn_fixedposition_ge_3.setOnClickListener(this);
		btn_fixedposition_ge_4.setOnClickListener(this);
		btn_fixedposition_ge_5.setOnClickListener(this);
		btn_fixedposition_ge_6.setOnClickListener(this);
		btn_fixedposition_ge_7.setOnClickListener(this);
		btn_fixedposition_ge_8.setOnClickListener(this);
		btn_fixedposition_ge_9.setOnClickListener(this);
		btn_fixedposition_ge_big.setOnClickListener(this);
		btn_fixedposition_ge_little.setOnClickListener(this);
		btn_fixedposition_ge_all.setOnClickListener(this);
		btn_fixedposition_ge_odd.setOnClickListener(this);
		btn_fixedposition_ge_even.setOnClickListener(this);
		btn_fixedposition_ge_clear.setOnClickListener(this);
		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_rocknumber = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_rocknumber);
		LinearLayout_rocknumber.setVisibility(View.VISIBLE);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_fixedposition_bai_clear();
					getnumber_fixedposition_shi_clear();
					getnumber_fixedposition_ge_clear();
				}
				mMainActivity.LinearLayout_ischooseonclick();
				mMainActivity.getresultint(getresultint());
				mMainActivity.showresult(getresult());

			}
		});
		LinearLayout_numberbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_fixedposition_bai_clear();
					getnumber_fixedposition_shi_clear();
					getnumber_fixedposition_ge_clear();
				}
				mMainActivity.LinearLayout_numberbasketonclick();
				mMainActivity.getresultint(getresultint());
				mMainActivity.showresult(getresult());

			}
		});
		imagebtn_addbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_fixedposition_bai_clear();
					getnumber_fixedposition_shi_clear();
					getnumber_fixedposition_ge_clear();
				}
				mMainActivity.imagebtn_addbasketonclick();
				mMainActivity.getresultint(getresultint());
				mMainActivity.showresult(getresult());

			}
		});
		LinearLayout_rocknumber.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				Log.d("vggg", "bjbjb");
				int x = (int) (Math.random() * 3 + 2);
				getnumber_fixedposition_shi_clear();
				getnumber_fixedposition_bai_clear();
				getnumber_fixedposition_ge_clear();
				if (x == 0) {
					int wan = (int) (Math.random() * 10);
				} else if (x == 1) {
					int qian = (int) (Math.random() * 10);
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
		// Lin_fixedposition_wan_one.setVisibility(View.VISIBLE);
		// btn_fixedposition_wan_x0.setVisibility(View.VISIBLE);
		// } else if (actionFive == MotionEvent.ACTION_UP) {
		// Lin_fixedposition_wan_one.setVisibility(View.INVISIBLE);
		// btn_fixedposition_wan_x0.setVisibility(View.INVISIBLE);
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

		threeDBaseActivityticket.curFragmentTag = getString(R.string.fixedposition_name);
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
		// activity.findViewById(R.id.btn_fixedposition_ge_9);
		// progressBar.setBackgroundResource(R.drawable.round);
		// btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);

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
		getnumber_fixedposition_shi_clear();
		getnumber_fixedposition_bai_clear();
		getnumber_fixedposition_ge_clear();
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
		case R.id.btn_fixedposition_bai_big:
			clearbai();
			btn_fixedposition_bai_big.setTextColor(0xff000000);
			btn_fixedposition_bai_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_bai_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_bai_little:
			clearbai();
			btn_fixedposition_bai_little.setTextColor(0xff000000);
			btn_fixedposition_bai_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_bai_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_bai_all:
			clearbai();
			btn_fixedposition_bai_all.setTextColor(0xff000000);
			btn_fixedposition_bai_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_bai_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_bai_odd:
			clearbai();
			btn_fixedposition_bai_odd.setTextColor(0xff000000);
			btn_fixedposition_bai_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_bai_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_bai_even:
			clearbai();
			btn_fixedposition_bai_even.setTextColor(0xff000000);
			btn_fixedposition_bai_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_bai_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_bai_clear:
			clearbai();
			btn_fixedposition_bai_clear.setTextColor(0xff000000);
			btn_fixedposition_bai_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_bai_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;

		case R.id.btn_fixedposition_bai_0:
			selectbai0();
			break;
		case R.id.btn_fixedposition_bai_1:
			selectbai1();
			break;
		case R.id.btn_fixedposition_bai_2:
			selectbai2();
			break;
		case R.id.btn_fixedposition_bai_3:
			selectbai3();
			break;
		case R.id.btn_fixedposition_bai_4:
			selectbai4();
			break;
		case R.id.btn_fixedposition_bai_5:
			selectbai5();
			break;
		case R.id.btn_fixedposition_bai_6:
			selectbai6();
			break;
		case R.id.btn_fixedposition_bai_7:
			selectbai7();
			break;
		case R.id.btn_fixedposition_bai_8:
			selectbai8();
			break;
		case R.id.btn_fixedposition_bai_9:
			selectbai9();
			break;
		case R.id.btn_fixedposition_shi_big:
			clearshi();
			btn_fixedposition_shi_big.setTextColor(0xff000000);
			btn_fixedposition_shi_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_shi_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_shi_little:
			clearshi();
			btn_fixedposition_shi_little.setTextColor(0xff000000);
			btn_fixedposition_shi_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_shi_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_shi_all:
			clearshi();
			btn_fixedposition_shi_all.setTextColor(0xff000000);
			btn_fixedposition_shi_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_shi_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_shi_odd:
			clearshi();
			btn_fixedposition_shi_odd.setTextColor(0xff000000);
			btn_fixedposition_shi_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_shi_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_shi_even:
			clearshi();
			btn_fixedposition_shi_even.setTextColor(0xff000000);
			btn_fixedposition_shi_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_shi_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_shi_clear:
			clearshi();
			btn_fixedposition_shi_clear.setTextColor(0xff000000);
			btn_fixedposition_shi_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_shi_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;

		case R.id.btn_fixedposition_shi_0:
			selectshi0();
			break;
		case R.id.btn_fixedposition_shi_1:
			selectshi1();
			break;
		case R.id.btn_fixedposition_shi_2:
			selectshi2();
			break;
		case R.id.btn_fixedposition_shi_3:
			selectshi3();
			break;
		case R.id.btn_fixedposition_shi_4:
			selectshi4();
			break;
		case R.id.btn_fixedposition_shi_5:
			selectshi5();
			break;
		case R.id.btn_fixedposition_shi_6:
			selectshi6();
			break;
		case R.id.btn_fixedposition_shi_7:
			selectshi7();
			break;
		case R.id.btn_fixedposition_shi_8:
			selectshi8();
			break;
		case R.id.btn_fixedposition_shi_9:
			selectshi9();
			break;
		case R.id.btn_fixedposition_ge_big:
			clearge();
			btn_fixedposition_ge_big.setTextColor(0xff000000);
			btn_fixedposition_ge_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_ge_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_ge_little:
			clearge();
			btn_fixedposition_ge_little.setTextColor(0xff000000);
			btn_fixedposition_ge_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_ge_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_ge_all:
			clearge();
			btn_fixedposition_ge_all.setTextColor(0xff000000);
			btn_fixedposition_ge_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_ge_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_ge_odd:
			clearge();
			btn_fixedposition_ge_odd.setTextColor(0xff000000);
			btn_fixedposition_ge_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_ge_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_ge_even:
			clearge();
			btn_fixedposition_ge_even.setTextColor(0xff000000);
			btn_fixedposition_ge_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_ge_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;
		case R.id.btn_fixedposition_ge_clear:
			clearge();
			btn_fixedposition_ge_clear.setTextColor(0xff000000);
			btn_fixedposition_ge_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_fixedposition_ge_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());

			break;

		case R.id.btn_fixedposition_ge_0:
			selectge0();
			break;
		case R.id.btn_fixedposition_ge_1:
			selectge1();
			break;
		case R.id.btn_fixedposition_ge_2:
			selectge2();
			break;
		case R.id.btn_fixedposition_ge_3:
			selectge3();
			break;
		case R.id.btn_fixedposition_ge_4:
			selectge4();
			break;
		case R.id.btn_fixedposition_ge_5:
			selectge5();
			break;
		case R.id.btn_fixedposition_ge_6:
			selectge6();
			break;
		case R.id.btn_fixedposition_ge_7:
			selectge7();
			break;
		case R.id.btn_fixedposition_ge_8:
			selectge8();
			break;
		case R.id.btn_fixedposition_ge_9:
			selectge9();
			break;
		}
	}

	private void getnumber_fixedposition_bai_big() {
		// TODO Auto-generated method stub
		btn_fixedposition_bai_0.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_0.setTextColor(0xffdedede);
		btn_fixedposition_bai_1.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_1.setTextColor(0xffdedede);
		btn_fixedposition_bai_2.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_2.setTextColor(0xffdedede);
		btn_fixedposition_bai_3.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_3.setTextColor(0xffdedede);
		btn_fixedposition_bai_4.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_4.setTextColor(0xffdedede);
		btn_fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_5.setTextColor(0xffffffff);
		btn_fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_6.setTextColor(0xffffffff);
		btn_fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_7.setTextColor(0xffffffff);
		btn_fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_8.setTextColor(0xffffffff);
		btn_fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_9.setTextColor(0xffffffff);
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

		btn_fixedposition_bai_0_int = 1;
		btn_fixedposition_bai_1_int = 1;
		btn_fixedposition_bai_2_int = 1;
		btn_fixedposition_bai_3_int = 1;
		btn_fixedposition_bai_4_int = 1;
		btn_fixedposition_bai_5_int = -1;
		btn_fixedposition_bai_6_int = -1;
		btn_fixedposition_bai_7_int = -1;
		btn_fixedposition_bai_8_int = -1;
		btn_fixedposition_bai_9_int = -1;
		show(hundreds);
	}

	private void getnumber_fixedposition_bai_little() {
		btn_fixedposition_bai_5.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_6.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_7.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_8.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_9.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_0.setTextColor(0xffffffff);
		text_fixedposition_bai_1.setTextColor(0xffffffff);
		text_fixedposition_bai_2.setTextColor(0xffffffff);
		text_fixedposition_bai_3.setTextColor(0xffffffff);
		text_fixedposition_bai_4.setTextColor(0xffffffff);
		text_fixedposition_bai_5.setTextColor(0xffdedede);
		text_fixedposition_bai_6.setTextColor(0xffdedede);
		text_fixedposition_bai_7.setTextColor(0xffdedede);
		text_fixedposition_bai_8.setTextColor(0xffdedede);
		text_fixedposition_bai_9.setTextColor(0xffdedede);
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
		btn_fixedposition_bai_5_int = 1;
		btn_fixedposition_bai_6_int = 1;
		btn_fixedposition_bai_7_int = 1;
		btn_fixedposition_bai_8_int = 1;
		btn_fixedposition_bai_9_int = 1;
		btn_fixedposition_bai_0_int = -1;
		btn_fixedposition_bai_1_int = -1;
		btn_fixedposition_bai_2_int = -1;
		btn_fixedposition_bai_3_int = -1;
		btn_fixedposition_bai_4_int = -1;

		show(hundreds);
	}

	private void getnumber_fixedposition_bai_all() {
		btn_fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_0.setTextColor(0xffffffff);
		btn_fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_1.setTextColor(0xffffffff);
		btn_fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_2.setTextColor(0xffffffff);
		btn_fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_3.setTextColor(0xffffffff);
		btn_fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_4.setTextColor(0xffffffff);
		btn_fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_5.setTextColor(0xffffffff);
		btn_fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_6.setTextColor(0xffffffff);
		btn_fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_7.setTextColor(0xffffffff);
		btn_fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_8.setTextColor(0xffffffff);
		btn_fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_9.setTextColor(0xffffffff);
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
		btn_fixedposition_bai_0_int = -1;
		btn_fixedposition_bai_1_int = -1;
		btn_fixedposition_bai_2_int = -1;
		btn_fixedposition_bai_3_int = -1;
		btn_fixedposition_bai_4_int = -1;
		btn_fixedposition_bai_5_int = -1;
		btn_fixedposition_bai_6_int = -1;
		btn_fixedposition_bai_7_int = -1;
		btn_fixedposition_bai_8_int = -1;
		btn_fixedposition_bai_9_int = -1;

		show(hundreds);
	}

	private void getnumber_fixedposition_bai_odd() {
		btn_fixedposition_bai_0.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_2.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_4.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_6.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_8.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_0.setTextColor(0xffdedede);
		text_fixedposition_bai_2.setTextColor(0xffdedede);
		text_fixedposition_bai_4.setTextColor(0xffdedede);
		text_fixedposition_bai_6.setTextColor(0xffdedede);
		text_fixedposition_bai_8.setTextColor(0xffdedede);
		btn_fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_1.setTextColor(0xffffffff);
		text_fixedposition_bai_3.setTextColor(0xffffffff);
		text_fixedposition_bai_5.setTextColor(0xffffffff);
		text_fixedposition_bai_7.setTextColor(0xffffffff);
		text_fixedposition_bai_9.setTextColor(0xffffffff);
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

		btn_fixedposition_bai_0_int = 1;
		btn_fixedposition_bai_2_int = 1;
		btn_fixedposition_bai_4_int = 1;
		btn_fixedposition_bai_6_int = 1;
		btn_fixedposition_bai_8_int = 1;
		btn_fixedposition_bai_1_int = -1;
		btn_fixedposition_bai_3_int = -1;
		btn_fixedposition_bai_5_int = -1;
		btn_fixedposition_bai_7_int = -1;
		btn_fixedposition_bai_9_int = -1;
		show(hundreds);
	}

	private void getnumber_fixedposition_bai_even() {
		btn_fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_bai_0.setTextColor(0xffffffff);
		text_fixedposition_bai_2.setTextColor(0xffffffff);
		text_fixedposition_bai_4.setTextColor(0xffffffff);
		text_fixedposition_bai_6.setTextColor(0xffffffff);
		text_fixedposition_bai_8.setTextColor(0xffffffff);
		btn_fixedposition_bai_1.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_3.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_5.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_7.setBackgroundResource(R.drawable.round);
		btn_fixedposition_bai_9.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_1.setTextColor(0xffdedede);
		text_fixedposition_bai_3.setTextColor(0xffdedede);
		text_fixedposition_bai_5.setTextColor(0xffdedede);
		text_fixedposition_bai_7.setTextColor(0xffdedede);
		text_fixedposition_bai_9.setTextColor(0xffdedede);
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
		btn_fixedposition_bai_1_int = 1;
		btn_fixedposition_bai_3_int = 1;
		btn_fixedposition_bai_5_int = 1;
		btn_fixedposition_bai_7_int = 1;
		btn_fixedposition_bai_9_int = 1;
		btn_fixedposition_bai_0_int = -1;
		btn_fixedposition_bai_2_int = -1;
		btn_fixedposition_bai_4_int = -1;
		btn_fixedposition_bai_6_int = -1;
		btn_fixedposition_bai_8_int = -1;

		show(hundreds);
	}

	private void getnumber_fixedposition_bai_clear() {
		btn_fixedposition_bai_0.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_0.setTextColor(0xffdedede);
		btn_fixedposition_bai_1.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_1.setTextColor(0xffdedede);
		btn_fixedposition_bai_2.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_2.setTextColor(0xffdedede);
		btn_fixedposition_bai_3.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_3.setTextColor(0xffdedede);
		btn_fixedposition_bai_4.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_4.setTextColor(0xffdedede);
		btn_fixedposition_bai_5.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_5.setTextColor(0xffdedede);
		btn_fixedposition_bai_6.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_6.setTextColor(0xffdedede);
		btn_fixedposition_bai_7.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_7.setTextColor(0xffdedede);
		btn_fixedposition_bai_8.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_8.setTextColor(0xffdedede);
		btn_fixedposition_bai_9.setBackgroundResource(R.drawable.round);
		text_fixedposition_bai_9.setTextColor(0xffdedede);
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
		btn_fixedposition_bai_0_int = 1;
		btn_fixedposition_bai_1_int = 1;
		btn_fixedposition_bai_2_int = 1;
		btn_fixedposition_bai_3_int = 1;
		btn_fixedposition_bai_4_int = 1;
		btn_fixedposition_bai_5_int = 1;
		btn_fixedposition_bai_6_int = 1;
		btn_fixedposition_bai_7_int = 1;
		btn_fixedposition_bai_8_int = 1;
		btn_fixedposition_bai_9_int = 1;
		show(hundreds);
	}

	void clearbai() {
		// TODO Auto-generated method stub
		btn_fixedposition_bai_big.setBackgroundResource(0);
		btn_fixedposition_bai_little.setBackgroundResource(0);
		btn_fixedposition_bai_all.setBackgroundResource(0);
		btn_fixedposition_bai_odd.setBackgroundResource(0);
		btn_fixedposition_bai_even.setBackgroundResource(0);
		btn_fixedposition_bai_clear.setBackgroundResource(0);
		btn_fixedposition_bai_big.setTextColor(0xffcfcfcf);
		btn_fixedposition_bai_little.setTextColor(0xffcfcfcf);
		btn_fixedposition_bai_all.setTextColor(0xffcfcfcf);
		btn_fixedposition_bai_odd.setTextColor(0xffcfcfcf);
		btn_fixedposition_bai_even.setTextColor(0xffcfcfcf);
		btn_fixedposition_bai_clear.setTextColor(0xffcfcfcf);
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
		// btn_fixedposition_bai_0_int = 1;
		// btn_fixedposition_bai_1_int = 1;
		// btn_fixedposition_bai_2_int = 1;
		// btn_fixedposition_bai_3_int = 1;
		// btn_fixedposition_bai_4_int = 1;
		// btn_fixedposition_bai_5_int = 1;
		// btn_fixedposition_bai_6_int = 1;
		// btn_fixedposition_bai_7_int = 1;
		// btn_fixedposition_bai_8_int = 1;
		// btn_fixedposition_bai_9_int = 1;

	}

	private void getnumber_fixedposition_shi_big() {
		// TODO Auto-generated method stub
		btn_fixedposition_shi_0.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_0.setTextColor(0xffdedede);
		btn_fixedposition_shi_1.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_1.setTextColor(0xffdedede);
		btn_fixedposition_shi_2.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_2.setTextColor(0xffdedede);
		btn_fixedposition_shi_3.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_3.setTextColor(0xffdedede);
		btn_fixedposition_shi_4.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_4.setTextColor(0xffdedede);
		btn_fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_5.setTextColor(0xffffffff);
		btn_fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_6.setTextColor(0xffffffff);
		btn_fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_7.setTextColor(0xffffffff);
		btn_fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_8.setTextColor(0xffffffff);
		btn_fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_9.setTextColor(0xffffffff);
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

		btn_fixedposition_shi_0_int = 1;
		btn_fixedposition_shi_1_int = 1;
		btn_fixedposition_shi_2_int = 1;
		btn_fixedposition_shi_3_int = 1;
		btn_fixedposition_shi_4_int = 1;
		btn_fixedposition_shi_5_int = -1;
		btn_fixedposition_shi_6_int = -1;
		btn_fixedposition_shi_7_int = -1;
		btn_fixedposition_shi_8_int = -1;
		btn_fixedposition_shi_9_int = -1;
		show(tens);
	}

	private void getnumber_fixedposition_shi_little() {
		btn_fixedposition_shi_5.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_6.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_7.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_8.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_9.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_0.setTextColor(0xffffffff);
		text_fixedposition_shi_1.setTextColor(0xffffffff);
		text_fixedposition_shi_2.setTextColor(0xffffffff);
		text_fixedposition_shi_3.setTextColor(0xffffffff);
		text_fixedposition_shi_4.setTextColor(0xffffffff);
		text_fixedposition_shi_5.setTextColor(0xffdedede);
		text_fixedposition_shi_6.setTextColor(0xffdedede);
		text_fixedposition_shi_7.setTextColor(0xffdedede);
		text_fixedposition_shi_8.setTextColor(0xffdedede);
		text_fixedposition_shi_9.setTextColor(0xffdedede);
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
		btn_fixedposition_shi_5_int = 1;
		btn_fixedposition_shi_6_int = 1;
		btn_fixedposition_shi_7_int = 1;
		btn_fixedposition_shi_8_int = 1;
		btn_fixedposition_shi_9_int = 1;
		btn_fixedposition_shi_0_int = -1;
		btn_fixedposition_shi_1_int = -1;
		btn_fixedposition_shi_2_int = -1;
		btn_fixedposition_shi_3_int = -1;
		btn_fixedposition_shi_4_int = -1;

		show(tens);
	}

	private void getnumber_fixedposition_shi_all() {
		btn_fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_0.setTextColor(0xffffffff);
		btn_fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_1.setTextColor(0xffffffff);
		btn_fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_2.setTextColor(0xffffffff);
		btn_fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_3.setTextColor(0xffffffff);
		btn_fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_4.setTextColor(0xffffffff);
		btn_fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_5.setTextColor(0xffffffff);
		btn_fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_6.setTextColor(0xffffffff);
		btn_fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_7.setTextColor(0xffffffff);
		btn_fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_8.setTextColor(0xffffffff);
		btn_fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_9.setTextColor(0xffffffff);
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
		btn_fixedposition_shi_0_int = -1;
		btn_fixedposition_shi_1_int = -1;
		btn_fixedposition_shi_2_int = -1;
		btn_fixedposition_shi_3_int = -1;
		btn_fixedposition_shi_4_int = -1;
		btn_fixedposition_shi_5_int = -1;
		btn_fixedposition_shi_6_int = -1;
		btn_fixedposition_shi_7_int = -1;
		btn_fixedposition_shi_8_int = -1;
		btn_fixedposition_shi_9_int = -1;

		show(tens);
	}

	private void getnumber_fixedposition_shi_odd() {
		btn_fixedposition_shi_0.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_2.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_4.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_6.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_8.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_0.setTextColor(0xffdedede);
		text_fixedposition_shi_2.setTextColor(0xffdedede);
		text_fixedposition_shi_4.setTextColor(0xffdedede);
		text_fixedposition_shi_6.setTextColor(0xffdedede);
		text_fixedposition_shi_8.setTextColor(0xffdedede);
		btn_fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_1.setTextColor(0xffffffff);
		text_fixedposition_shi_3.setTextColor(0xffffffff);
		text_fixedposition_shi_5.setTextColor(0xffffffff);
		text_fixedposition_shi_7.setTextColor(0xffffffff);
		text_fixedposition_shi_9.setTextColor(0xffffffff);
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

		btn_fixedposition_shi_0_int = 1;
		btn_fixedposition_shi_2_int = 1;
		btn_fixedposition_shi_4_int = 1;
		btn_fixedposition_shi_6_int = 1;
		btn_fixedposition_shi_8_int = 1;
		btn_fixedposition_shi_1_int = -1;
		btn_fixedposition_shi_3_int = -1;
		btn_fixedposition_shi_5_int = -1;
		btn_fixedposition_shi_7_int = -1;
		btn_fixedposition_shi_9_int = -1;
		show(tens);
	}

	private void getnumber_fixedposition_shi_even() {
		btn_fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_shi_0.setTextColor(0xffffffff);
		text_fixedposition_shi_2.setTextColor(0xffffffff);
		text_fixedposition_shi_4.setTextColor(0xffffffff);
		text_fixedposition_shi_6.setTextColor(0xffffffff);
		text_fixedposition_shi_8.setTextColor(0xffffffff);
		btn_fixedposition_shi_1.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_3.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_5.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_7.setBackgroundResource(R.drawable.round);
		btn_fixedposition_shi_9.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_1.setTextColor(0xffdedede);
		text_fixedposition_shi_3.setTextColor(0xffdedede);
		text_fixedposition_shi_5.setTextColor(0xffdedede);
		text_fixedposition_shi_7.setTextColor(0xffdedede);
		text_fixedposition_shi_9.setTextColor(0xffdedede);
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
		btn_fixedposition_shi_1_int = 1;
		btn_fixedposition_shi_3_int = 1;
		btn_fixedposition_shi_5_int = 1;
		btn_fixedposition_shi_7_int = 1;
		btn_fixedposition_shi_9_int = 1;
		btn_fixedposition_shi_0_int = -1;
		btn_fixedposition_shi_2_int = -1;
		btn_fixedposition_shi_4_int = -1;
		btn_fixedposition_shi_6_int = -1;
		btn_fixedposition_shi_8_int = -1;

		show(tens);
	}

	private void getnumber_fixedposition_shi_clear() {
		btn_fixedposition_shi_0.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_0.setTextColor(0xffdedede);
		btn_fixedposition_shi_1.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_1.setTextColor(0xffdedede);
		btn_fixedposition_shi_2.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_2.setTextColor(0xffdedede);
		btn_fixedposition_shi_3.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_3.setTextColor(0xffdedede);
		btn_fixedposition_shi_4.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_4.setTextColor(0xffdedede);
		btn_fixedposition_shi_5.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_5.setTextColor(0xffdedede);
		btn_fixedposition_shi_6.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_6.setTextColor(0xffdedede);
		btn_fixedposition_shi_7.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_7.setTextColor(0xffdedede);
		btn_fixedposition_shi_8.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_8.setTextColor(0xffdedede);
		btn_fixedposition_shi_9.setBackgroundResource(R.drawable.round);
		text_fixedposition_shi_9.setTextColor(0xffdedede);
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
		btn_fixedposition_shi_0_int = 1;
		btn_fixedposition_shi_1_int = 1;
		btn_fixedposition_shi_2_int = 1;
		btn_fixedposition_shi_3_int = 1;
		btn_fixedposition_shi_4_int = 1;
		btn_fixedposition_shi_5_int = 1;
		btn_fixedposition_shi_6_int = 1;
		btn_fixedposition_shi_7_int = 1;
		btn_fixedposition_shi_8_int = 1;
		btn_fixedposition_shi_9_int = 1;
		show(tens);
	}

	private void clearshi() {
		// TODO Auto-generated method stub
		btn_fixedposition_shi_big.setBackgroundResource(0);
		btn_fixedposition_shi_little.setBackgroundResource(0);
		btn_fixedposition_shi_all.setBackgroundResource(0);
		btn_fixedposition_shi_odd.setBackgroundResource(0);
		btn_fixedposition_shi_even.setBackgroundResource(0);
		btn_fixedposition_shi_clear.setBackgroundResource(0);
		btn_fixedposition_shi_big.setTextColor(0xffcfcfcf);
		btn_fixedposition_shi_little.setTextColor(0xffcfcfcf);
		btn_fixedposition_shi_all.setTextColor(0xffcfcfcf);
		btn_fixedposition_shi_odd.setTextColor(0xffcfcfcf);
		btn_fixedposition_shi_even.setTextColor(0xffcfcfcf);
		btn_fixedposition_shi_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_fixedposition_ge_big() {
		// TODO Auto-generated method stub
		btn_fixedposition_ge_0.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_0.setTextColor(0xffdedede);
		btn_fixedposition_ge_1.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_1.setTextColor(0xffdedede);
		btn_fixedposition_ge_2.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_2.setTextColor(0xffdedede);
		btn_fixedposition_ge_3.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_3.setTextColor(0xffdedede);
		btn_fixedposition_ge_4.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_4.setTextColor(0xffdedede);
		btn_fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_5.setTextColor(0xffffffff);
		btn_fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_6.setTextColor(0xffffffff);
		btn_fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_7.setTextColor(0xffffffff);
		btn_fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_8.setTextColor(0xffffffff);
		btn_fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_9.setTextColor(0xffffffff);
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

		btn_fixedposition_ge_0_int = 1;
		btn_fixedposition_ge_1_int = 1;
		btn_fixedposition_ge_2_int = 1;
		btn_fixedposition_ge_3_int = 1;
		btn_fixedposition_ge_4_int = 1;
		btn_fixedposition_ge_5_int = -1;
		btn_fixedposition_ge_6_int = -1;
		btn_fixedposition_ge_7_int = -1;
		btn_fixedposition_ge_8_int = -1;
		btn_fixedposition_ge_9_int = -1;
		show(decade);
	}

	private void getnumber_fixedposition_ge_little() {
		btn_fixedposition_ge_5.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_6.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_7.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_8.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_0.setTextColor(0xffffffff);
		text_fixedposition_ge_1.setTextColor(0xffffffff);
		text_fixedposition_ge_2.setTextColor(0xffffffff);
		text_fixedposition_ge_3.setTextColor(0xffffffff);
		text_fixedposition_ge_4.setTextColor(0xffffffff);
		text_fixedposition_ge_5.setTextColor(0xffdedede);
		text_fixedposition_ge_6.setTextColor(0xffdedede);
		text_fixedposition_ge_7.setTextColor(0xffdedede);
		text_fixedposition_ge_8.setTextColor(0xffdedede);
		text_fixedposition_ge_9.setTextColor(0xffdedede);
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
		btn_fixedposition_ge_5_int = 1;
		btn_fixedposition_ge_6_int = 1;
		btn_fixedposition_ge_7_int = 1;
		btn_fixedposition_ge_8_int = 1;
		btn_fixedposition_ge_9_int = 1;
		btn_fixedposition_ge_0_int = -1;
		btn_fixedposition_ge_1_int = -1;
		btn_fixedposition_ge_2_int = -1;
		btn_fixedposition_ge_3_int = -1;
		btn_fixedposition_ge_4_int = -1;

		show(decade);
	}

	private void getnumber_fixedposition_ge_all() {
		btn_fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_0.setTextColor(0xffffffff);
		btn_fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_1.setTextColor(0xffffffff);
		btn_fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_2.setTextColor(0xffffffff);
		btn_fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_3.setTextColor(0xffffffff);
		btn_fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_4.setTextColor(0xffffffff);
		btn_fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_5.setTextColor(0xffffffff);
		btn_fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_6.setTextColor(0xffffffff);
		btn_fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_7.setTextColor(0xffffffff);
		btn_fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_8.setTextColor(0xffffffff);
		btn_fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_9.setTextColor(0xffffffff);
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
		btn_fixedposition_ge_0_int = -1;
		btn_fixedposition_ge_1_int = -1;
		btn_fixedposition_ge_2_int = -1;
		btn_fixedposition_ge_3_int = -1;
		btn_fixedposition_ge_4_int = -1;
		btn_fixedposition_ge_5_int = -1;
		btn_fixedposition_ge_6_int = -1;
		btn_fixedposition_ge_7_int = -1;
		btn_fixedposition_ge_8_int = -1;
		btn_fixedposition_ge_9_int = -1;

		show(decade);
	}

	private void getnumber_fixedposition_ge_odd() {
		btn_fixedposition_ge_0.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_2.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_4.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_6.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_8.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_0.setTextColor(0xffdedede);
		text_fixedposition_ge_2.setTextColor(0xffdedede);
		text_fixedposition_ge_4.setTextColor(0xffdedede);
		text_fixedposition_ge_6.setTextColor(0xffdedede);
		text_fixedposition_ge_8.setTextColor(0xffdedede);
		btn_fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_1.setTextColor(0xffffffff);
		text_fixedposition_ge_3.setTextColor(0xffffffff);
		text_fixedposition_ge_5.setTextColor(0xffffffff);
		text_fixedposition_ge_7.setTextColor(0xffffffff);
		text_fixedposition_ge_9.setTextColor(0xffffffff);
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

		btn_fixedposition_ge_0_int = 1;
		btn_fixedposition_ge_2_int = 1;
		btn_fixedposition_ge_4_int = 1;
		btn_fixedposition_ge_6_int = 1;
		btn_fixedposition_ge_8_int = 1;
		btn_fixedposition_ge_1_int = -1;
		btn_fixedposition_ge_3_int = -1;
		btn_fixedposition_ge_5_int = -1;
		btn_fixedposition_ge_7_int = -1;
		btn_fixedposition_ge_9_int = -1;
		show(decade);
	}

	private void getnumber_fixedposition_ge_even() {
		btn_fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
		btn_fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
		text_fixedposition_ge_0.setTextColor(0xffffffff);
		text_fixedposition_ge_2.setTextColor(0xffffffff);
		text_fixedposition_ge_4.setTextColor(0xffffffff);
		text_fixedposition_ge_6.setTextColor(0xffffffff);
		text_fixedposition_ge_8.setTextColor(0xffffffff);
		btn_fixedposition_ge_1.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_3.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_5.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_7.setBackgroundResource(R.drawable.round);
		btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_1.setTextColor(0xffdedede);
		text_fixedposition_ge_3.setTextColor(0xffdedede);
		text_fixedposition_ge_5.setTextColor(0xffdedede);
		text_fixedposition_ge_7.setTextColor(0xffdedede);
		text_fixedposition_ge_9.setTextColor(0xffdedede);
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
		btn_fixedposition_ge_1_int = 1;
		btn_fixedposition_ge_3_int = 1;
		btn_fixedposition_ge_5_int = 1;
		btn_fixedposition_ge_7_int = 1;
		btn_fixedposition_ge_9_int = 1;
		btn_fixedposition_ge_0_int = -1;
		btn_fixedposition_ge_2_int = -1;
		btn_fixedposition_ge_4_int = -1;
		btn_fixedposition_ge_6_int = -1;
		btn_fixedposition_ge_8_int = -1;

		show(decade);
	}

	private void getnumber_fixedposition_ge_clear() {
		btn_fixedposition_ge_0.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_0.setTextColor(0xffdedede);
		btn_fixedposition_ge_1.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_1.setTextColor(0xffdedede);
		btn_fixedposition_ge_2.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_2.setTextColor(0xffdedede);
		btn_fixedposition_ge_3.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_3.setTextColor(0xffdedede);
		btn_fixedposition_ge_4.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_4.setTextColor(0xffdedede);
		btn_fixedposition_ge_5.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_5.setTextColor(0xffdedede);
		btn_fixedposition_ge_6.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_6.setTextColor(0xffdedede);
		btn_fixedposition_ge_7.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_7.setTextColor(0xffdedede);
		btn_fixedposition_ge_8.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_8.setTextColor(0xffdedede);
		btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);
		text_fixedposition_ge_9.setTextColor(0xffdedede);
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
		btn_fixedposition_ge_0_int = 1;
		btn_fixedposition_ge_1_int = 1;
		btn_fixedposition_ge_2_int = 1;
		btn_fixedposition_ge_3_int = 1;
		btn_fixedposition_ge_4_int = 1;
		btn_fixedposition_ge_5_int = 1;
		btn_fixedposition_ge_6_int = 1;
		btn_fixedposition_ge_7_int = 1;
		btn_fixedposition_ge_8_int = 1;
		btn_fixedposition_ge_9_int = 1;
		show(decade);
	}

	private void clearge() {
		// TODO Auto-generated method stub
		btn_fixedposition_ge_big.setBackgroundResource(0);
		btn_fixedposition_ge_little.setBackgroundResource(0);
		btn_fixedposition_ge_all.setBackgroundResource(0);
		btn_fixedposition_ge_odd.setBackgroundResource(0);
		btn_fixedposition_ge_even.setBackgroundResource(0);
		btn_fixedposition_ge_clear.setBackgroundResource(0);
		btn_fixedposition_ge_big.setTextColor(0xffcfcfcf);
		btn_fixedposition_ge_little.setTextColor(0xffcfcfcf);
		btn_fixedposition_ge_all.setTextColor(0xffcfcfcf);
		btn_fixedposition_ge_odd.setTextColor(0xffcfcfcf);
		btn_fixedposition_ge_even.setTextColor(0xffcfcfcf);
		btn_fixedposition_ge_clear.setTextColor(0xffcfcfcf);

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
		result = result3 + "," + result4 + "," + result5;
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
		case R.id.btn_fixedposition_bai_0:

			int actionfixedposition02 = event.getAction();
			if (actionfixedposition02 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x0.setVisibility(View.VISIBLE);
			} else if (actionfixedposition02 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionfixedposition02 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_fixedposition_bai_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionfixedposition12 = event.getAction();
			if (actionfixedposition12 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x1.setVisibility(View.VISIBLE);
			} else if (actionfixedposition12 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x1.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition12 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_2:
			int actionfixedposition22 = event.getAction();
			if (actionfixedposition22 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x2.setVisibility(View.VISIBLE);
			} else if (actionfixedposition22 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x2.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition22 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_3:
			int actionfixedposition32 = event.getAction();
			if (actionfixedposition32 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x3.setVisibility(View.VISIBLE);
			} else if (actionfixedposition32 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x3.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition32 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_4:
			int actionfixedposition42 = event.getAction();
			if (actionfixedposition42 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x4.setVisibility(View.VISIBLE);
			} else if (actionfixedposition42 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x4.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition42 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_5:
			int actionfixedposition52 = event.getAction();
			if (actionfixedposition52 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_one.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x5.setVisibility(View.VISIBLE);
			} else if (actionfixedposition52 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x5.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition52 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_6:
			Log.d("btn_1_1", "btn_fixedposition_bai_6");
			int actionfixedposition62 = event.getAction();
			if (actionfixedposition62 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x6.setVisibility(View.VISIBLE);
			} else if (actionfixedposition62 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x6.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition62 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_7:
			int actionfixedposition72 = event.getAction();
			if (actionfixedposition72 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x7.setVisibility(View.VISIBLE);
			} else if (actionfixedposition72 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x7.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition72 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_8:
			int actionfixedposition82 = event.getAction();
			if (actionfixedposition82 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x8.setVisibility(View.VISIBLE);
			} else if (actionfixedposition82 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x8.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition82 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_bai_9:
			int actionfixedposition92 = event.getAction();
			if (actionfixedposition92 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_bai_two.setVisibility(View.VISIBLE);
				btn_fixedposition_bai_x9.setVisibility(View.VISIBLE);
			} else if (actionfixedposition92 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x9.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition92 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_bai_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_bai_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_0:

			int actionfixedposition03 = event.getAction();
			if (actionfixedposition03 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x0.setVisibility(View.VISIBLE);
			} else if (actionfixedposition03 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionfixedposition03 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_fixedposition_shi_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionfixedposition13 = event.getAction();
			if (actionfixedposition13 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x1.setVisibility(View.VISIBLE);
			} else if (actionfixedposition13 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x1.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition13 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_2:
			int actionfixedposition23 = event.getAction();
			if (actionfixedposition23 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x2.setVisibility(View.VISIBLE);
			} else if (actionfixedposition23 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x2.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition23 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_3:
			int actionfixedposition33 = event.getAction();
			if (actionfixedposition33 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x3.setVisibility(View.VISIBLE);
			} else if (actionfixedposition33 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x3.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition33 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_4:
			int actionfixedposition43 = event.getAction();
			if (actionfixedposition43 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x4.setVisibility(View.VISIBLE);
			} else if (actionfixedposition43 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x4.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition43 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_5:
			int actionfixedposition53 = event.getAction();
			if (actionfixedposition53 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_one.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x5.setVisibility(View.VISIBLE);
			} else if (actionfixedposition53 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x5.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition53 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_6:
			Log.d("btn_1_1", "btn_fixedposition_shi_6");
			int actionfixedposition63 = event.getAction();
			if (actionfixedposition63 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x6.setVisibility(View.VISIBLE);
			} else if (actionfixedposition63 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x6.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition63 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_7:
			int actionfixedposition73 = event.getAction();
			if (actionfixedposition73 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x7.setVisibility(View.VISIBLE);
			} else if (actionfixedposition73 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x7.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition73 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_8:
			int actionfixedposition83 = event.getAction();
			if (actionfixedposition83 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x8.setVisibility(View.VISIBLE);
			} else if (actionfixedposition83 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x8.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition83 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_shi_9:
			int actionfixedposition93 = event.getAction();
			if (actionfixedposition93 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_shi_two.setVisibility(View.VISIBLE);
				btn_fixedposition_shi_x9.setVisibility(View.VISIBLE);
			} else if (actionfixedposition93 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x9.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition93 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_shi_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_shi_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_0:

			int actionfixedposition04 = event.getAction();
			if (actionfixedposition04 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x0.setVisibility(View.VISIBLE);
			} else if (actionfixedposition04 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionfixedposition04 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_fixedposition_ge_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionfixedposition14 = event.getAction();
			if (actionfixedposition14 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x1.setVisibility(View.VISIBLE);
			} else if (actionfixedposition14 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x1.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition14 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_2:
			int actionfixedposition24 = event.getAction();
			if (actionfixedposition24 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x2.setVisibility(View.VISIBLE);
			} else if (actionfixedposition24 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x2.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition24 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_3:
			int actionfixedposition34 = event.getAction();
			if (actionfixedposition34 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x3.setVisibility(View.VISIBLE);
			} else if (actionfixedposition34 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x3.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition34 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_4:
			int actionfixedposition44 = event.getAction();
			if (actionfixedposition44 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x4.setVisibility(View.VISIBLE);
			} else if (actionfixedposition44 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x4.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition44 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_5:
			int actionfixedposition54 = event.getAction();
			if (actionfixedposition54 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_one.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x5.setVisibility(View.VISIBLE);
			} else if (actionfixedposition54 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x5.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition54 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_one.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_6:
			Log.d("btn_1_1", "btn_fixedposition_ge_6");
			int actionfixedposition64 = event.getAction();
			if (actionfixedposition64 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x6.setVisibility(View.VISIBLE);
			} else if (actionfixedposition64 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x6.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition64 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_7:
			int actionfixedposition74 = event.getAction();
			if (actionfixedposition74 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x7.setVisibility(View.VISIBLE);
			} else if (actionfixedposition74 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x7.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition74 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_8:
			int actionfixedposition84 = event.getAction();
			if (actionfixedposition84 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x8.setVisibility(View.VISIBLE);
			} else if (actionfixedposition84 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x8.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition84 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_fixedposition_ge_9:
			int actionfixedposition94 = event.getAction();
			if (actionfixedposition94 == MotionEvent.ACTION_DOWN) {
				Lin_fixedposition_ge_two.setVisibility(View.VISIBLE);
				btn_fixedposition_ge_x9.setVisibility(View.VISIBLE);
			} else if (actionfixedposition94 == MotionEvent.ACTION_UP) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x9.setVisibility(View.INVISIBLE);
			} else if (actionfixedposition94 == MotionEvent.ACTION_CANCEL) {
				Lin_fixedposition_ge_two.setVisibility(View.INVISIBLE);
				btn_fixedposition_ge_x9.setVisibility(View.INVISIBLE);
			}
			break;
		default:
			break;
		}
		return false;
	}

	public void selectbai0() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[0] = changestatus(hundreds[0]);
		if (btn_fixedposition_bai_0_int == 1) {
			btn_fixedposition_bai_0.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_0.setTextColor(0xffffffff);
			btn_fixedposition_bai_0_int = btn_fixedposition_bai_0_int * -1;
		} else if (btn_fixedposition_bai_0_int == -1) {
			btn_fixedposition_bai_0.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_0.setTextColor(0xffdedede);
			btn_fixedposition_bai_0_int = btn_fixedposition_bai_0_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai1() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[1] = changestatus(hundreds[1]);
		if (btn_fixedposition_bai_1_int == 1) {
			btn_fixedposition_bai_1.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_1.setTextColor(0xffffffff);
			btn_fixedposition_bai_1_int = btn_fixedposition_bai_1_int * -1;
		} else if (btn_fixedposition_bai_1_int == -1) {
			btn_fixedposition_bai_1.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_1.setTextColor(0xffdedede);
			btn_fixedposition_bai_1_int = btn_fixedposition_bai_1_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai2() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[2] = changestatus(hundreds[2]);
		if (btn_fixedposition_bai_2_int == 1) {
			btn_fixedposition_bai_2.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_2.setTextColor(0xffffffff);
			btn_fixedposition_bai_2_int = btn_fixedposition_bai_2_int * -1;
		} else if (btn_fixedposition_bai_2_int == -1) {
			btn_fixedposition_bai_2.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_2.setTextColor(0xffdedede);
			btn_fixedposition_bai_2_int = btn_fixedposition_bai_2_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai3() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[3] = changestatus(hundreds[3]);
		if (btn_fixedposition_bai_3_int == 1) {
			btn_fixedposition_bai_3.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_3.setTextColor(0xffffffff);
			btn_fixedposition_bai_3_int = btn_fixedposition_bai_3_int * -1;
		} else if (btn_fixedposition_bai_3_int == -1) {
			btn_fixedposition_bai_3.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_3.setTextColor(0xffdedede);
			btn_fixedposition_bai_3_int = btn_fixedposition_bai_3_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai4() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[4] = changestatus(hundreds[4]);
		if (btn_fixedposition_bai_4_int == 1) {
			btn_fixedposition_bai_4.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_4.setTextColor(0xffffffff);
			btn_fixedposition_bai_4_int = btn_fixedposition_bai_4_int * -1;
		} else if (btn_fixedposition_bai_4_int == -1) {
			btn_fixedposition_bai_4.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_4.setTextColor(0xffdedede);
			btn_fixedposition_bai_4_int = btn_fixedposition_bai_4_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai5() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[5] = changestatus(hundreds[5]);
		if (btn_fixedposition_bai_5_int == 1) {
			btn_fixedposition_bai_5.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_5.setTextColor(0xffffffff);
			btn_fixedposition_bai_5_int = btn_fixedposition_bai_5_int * -1;
		} else if (btn_fixedposition_bai_5_int == -1) {
			btn_fixedposition_bai_5.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_5.setTextColor(0xffdedede);
			btn_fixedposition_bai_5_int = btn_fixedposition_bai_5_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai6() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[6] = changestatus(hundreds[6]);
		if (btn_fixedposition_bai_6_int == 1) {
			btn_fixedposition_bai_6.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_6.setTextColor(0xffffffff);
			btn_fixedposition_bai_6_int = btn_fixedposition_bai_6_int * -1;
		} else if (btn_fixedposition_bai_6_int == -1) {
			btn_fixedposition_bai_6.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_6.setTextColor(0xffdedede);
			btn_fixedposition_bai_6_int = btn_fixedposition_bai_6_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai7() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[7] = changestatus(hundreds[7]);
		if (btn_fixedposition_bai_7_int == 1) {
			btn_fixedposition_bai_7.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_7.setTextColor(0xffffffff);
			btn_fixedposition_bai_7_int = btn_fixedposition_bai_7_int * -1;
		} else if (btn_fixedposition_bai_7_int == -1) {
			btn_fixedposition_bai_7.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_7.setTextColor(0xffdedede);
			btn_fixedposition_bai_7_int = btn_fixedposition_bai_7_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai8() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[8] = changestatus(hundreds[8]);
		if (btn_fixedposition_bai_8_int == 1) {
			btn_fixedposition_bai_8.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_8.setTextColor(0xffffffff);
			btn_fixedposition_bai_8_int = btn_fixedposition_bai_8_int * -1;
		} else if (btn_fixedposition_bai_8_int == -1) {
			btn_fixedposition_bai_8.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_8.setTextColor(0xffdedede);
			btn_fixedposition_bai_8_int = btn_fixedposition_bai_8_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectbai9() {
		clearbai();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		hundreds[9] = changestatus(hundreds[9]);
		if (btn_fixedposition_bai_9_int == 1) {
			btn_fixedposition_bai_9.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_bai_9.setTextColor(0xffffffff);
			btn_fixedposition_bai_9_int = btn_fixedposition_bai_9_int * -1;
		} else if (btn_fixedposition_bai_9_int == -1) {
			btn_fixedposition_bai_9.setBackgroundResource(R.drawable.round);
			text_fixedposition_bai_9.setTextColor(0xffdedede);
			btn_fixedposition_bai_9_int = btn_fixedposition_bai_9_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi0() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[0] = changestatus(tens[0]);
		if (btn_fixedposition_shi_0_int == 1) {
			btn_fixedposition_shi_0.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_0.setTextColor(0xffffffff);
			btn_fixedposition_shi_0_int = btn_fixedposition_shi_0_int * -1;
		} else if (btn_fixedposition_shi_0_int == -1) {
			btn_fixedposition_shi_0.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_0.setTextColor(0xffdedede);
			btn_fixedposition_shi_0_int = btn_fixedposition_shi_0_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi1() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[1] = changestatus(tens[1]);
		if (btn_fixedposition_shi_1_int == 1) {
			btn_fixedposition_shi_1.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_1.setTextColor(0xffffffff);
			btn_fixedposition_shi_1_int = btn_fixedposition_shi_1_int * -1;
		} else if (btn_fixedposition_shi_1_int == -1) {
			btn_fixedposition_shi_1.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_1.setTextColor(0xffdedede);
			btn_fixedposition_shi_1_int = btn_fixedposition_shi_1_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi2() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[2] = changestatus(tens[2]);
		if (btn_fixedposition_shi_2_int == 1) {
			btn_fixedposition_shi_2.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_2.setTextColor(0xffffffff);
			btn_fixedposition_shi_2_int = btn_fixedposition_shi_2_int * -1;
		} else if (btn_fixedposition_shi_2_int == -1) {
			btn_fixedposition_shi_2.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_2.setTextColor(0xffdedede);
			btn_fixedposition_shi_2_int = btn_fixedposition_shi_2_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi3() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[3] = changestatus(tens[3]);
		if (btn_fixedposition_shi_3_int == 1) {
			btn_fixedposition_shi_3.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_3.setTextColor(0xffffffff);
			btn_fixedposition_shi_3_int = btn_fixedposition_shi_3_int * -1;
		} else if (btn_fixedposition_shi_3_int == -1) {
			btn_fixedposition_shi_3.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_3.setTextColor(0xffdedede);
			btn_fixedposition_shi_3_int = btn_fixedposition_shi_3_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi4() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[4] = changestatus(tens[4]);
		if (btn_fixedposition_shi_4_int == 1) {
			btn_fixedposition_shi_4.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_4.setTextColor(0xffffffff);
			btn_fixedposition_shi_4_int = btn_fixedposition_shi_4_int * -1;
		} else if (btn_fixedposition_shi_4_int == -1) {
			btn_fixedposition_shi_4.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_4.setTextColor(0xffdedede);
			btn_fixedposition_shi_4_int = btn_fixedposition_shi_4_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi5() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[5] = changestatus(tens[5]);
		if (btn_fixedposition_shi_5_int == 1) {
			btn_fixedposition_shi_5.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_5.setTextColor(0xffffffff);
			btn_fixedposition_shi_5_int = btn_fixedposition_shi_5_int * -1;
		} else if (btn_fixedposition_shi_5_int == -1) {
			btn_fixedposition_shi_5.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_5.setTextColor(0xffdedede);
			btn_fixedposition_shi_5_int = btn_fixedposition_shi_5_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi6() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[6] = changestatus(tens[6]);
		if (btn_fixedposition_shi_6_int == 1) {
			btn_fixedposition_shi_6.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_6.setTextColor(0xffffffff);
			btn_fixedposition_shi_6_int = btn_fixedposition_shi_6_int * -1;
		} else if (btn_fixedposition_shi_6_int == -1) {
			btn_fixedposition_shi_6.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_6.setTextColor(0xffdedede);
			btn_fixedposition_shi_6_int = btn_fixedposition_shi_6_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi7() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[7] = changestatus(tens[7]);
		if (btn_fixedposition_shi_7_int == 1) {
			btn_fixedposition_shi_7.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_7.setTextColor(0xffffffff);
			btn_fixedposition_shi_7_int = btn_fixedposition_shi_7_int * -1;
		} else if (btn_fixedposition_shi_7_int == -1) {
			btn_fixedposition_shi_7.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_7.setTextColor(0xffdedede);
			btn_fixedposition_shi_7_int = btn_fixedposition_shi_7_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi8() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[8] = changestatus(tens[8]);
		if (btn_fixedposition_shi_8_int == 1) {
			btn_fixedposition_shi_8.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_8.setTextColor(0xffffffff);
			btn_fixedposition_shi_8_int = btn_fixedposition_shi_8_int * -1;
		} else if (btn_fixedposition_shi_8_int == -1) {
			btn_fixedposition_shi_8.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_8.setTextColor(0xffdedede);
			btn_fixedposition_shi_8_int = btn_fixedposition_shi_8_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectshi9() {
		clearshi();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		tens[9] = changestatus(tens[9]);
		if (btn_fixedposition_shi_9_int == 1) {
			btn_fixedposition_shi_9.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_shi_9.setTextColor(0xffffffff);
			btn_fixedposition_shi_9_int = btn_fixedposition_shi_9_int * -1;
		} else if (btn_fixedposition_shi_9_int == -1) {
			btn_fixedposition_shi_9.setBackgroundResource(R.drawable.round);
			text_fixedposition_shi_9.setTextColor(0xffdedede);
			btn_fixedposition_shi_9_int = btn_fixedposition_shi_9_int * -1;
		}
		show(tens);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge0() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[0] = changestatus(decade[0]);
		if (btn_fixedposition_ge_0_int == 1) {
			btn_fixedposition_ge_0.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_0.setTextColor(0xffffffff);
			btn_fixedposition_ge_0_int = btn_fixedposition_ge_0_int * -1;
		} else if (btn_fixedposition_ge_0_int == -1) {
			btn_fixedposition_ge_0.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_0.setTextColor(0xffdedede);
			btn_fixedposition_ge_0_int = btn_fixedposition_ge_0_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge1() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[1] = changestatus(decade[1]);
		if (btn_fixedposition_ge_1_int == 1) {
			btn_fixedposition_ge_1.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_1.setTextColor(0xffffffff);
			btn_fixedposition_ge_1_int = btn_fixedposition_ge_1_int * -1;
		} else if (btn_fixedposition_ge_1_int == -1) {
			btn_fixedposition_ge_1.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_1.setTextColor(0xffdedede);
			btn_fixedposition_ge_1_int = btn_fixedposition_ge_1_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge2() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[2] = changestatus(decade[2]);
		if (btn_fixedposition_ge_2_int == 1) {
			btn_fixedposition_ge_2.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_2.setTextColor(0xffffffff);
			btn_fixedposition_ge_2_int = btn_fixedposition_ge_2_int * -1;
		} else if (btn_fixedposition_ge_2_int == -1) {
			btn_fixedposition_ge_2.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_2.setTextColor(0xffdedede);
			btn_fixedposition_ge_2_int = btn_fixedposition_ge_2_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge3() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[3] = changestatus(decade[3]);
		if (btn_fixedposition_ge_3_int == 1) {
			btn_fixedposition_ge_3.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_3.setTextColor(0xffffffff);
			btn_fixedposition_ge_3_int = btn_fixedposition_ge_3_int * -1;
		} else if (btn_fixedposition_ge_3_int == -1) {
			btn_fixedposition_ge_3.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_3.setTextColor(0xffdedede);
			btn_fixedposition_ge_3_int = btn_fixedposition_ge_3_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge4() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[4] = changestatus(decade[4]);
		if (btn_fixedposition_ge_4_int == 1) {
			btn_fixedposition_ge_4.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_4.setTextColor(0xffffffff);
			btn_fixedposition_ge_4_int = btn_fixedposition_ge_4_int * -1;
		} else if (btn_fixedposition_ge_4_int == -1) {
			btn_fixedposition_ge_4.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_4.setTextColor(0xffdedede);
			btn_fixedposition_ge_4_int = btn_fixedposition_ge_4_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge5() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[5] = changestatus(decade[5]);
		if (btn_fixedposition_ge_5_int == 1) {
			btn_fixedposition_ge_5.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_5.setTextColor(0xffffffff);
			btn_fixedposition_ge_5_int = btn_fixedposition_ge_5_int * -1;
		} else if (btn_fixedposition_ge_5_int == -1) {
			btn_fixedposition_ge_5.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_5.setTextColor(0xffdedede);
			btn_fixedposition_ge_5_int = btn_fixedposition_ge_5_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge6() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[6] = changestatus(decade[6]);
		if (btn_fixedposition_ge_6_int == 1) {
			btn_fixedposition_ge_6.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_6.setTextColor(0xffffffff);
			btn_fixedposition_ge_6_int = btn_fixedposition_ge_6_int * -1;
		} else if (btn_fixedposition_ge_6_int == -1) {
			btn_fixedposition_ge_6.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_6.setTextColor(0xffdedede);
			btn_fixedposition_ge_6_int = btn_fixedposition_ge_6_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge7() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[7] = changestatus(decade[7]);
		if (btn_fixedposition_ge_7_int == 1) {
			btn_fixedposition_ge_7.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_7.setTextColor(0xffffffff);
			btn_fixedposition_ge_7_int = btn_fixedposition_ge_7_int * -1;
		} else if (btn_fixedposition_ge_7_int == -1) {
			btn_fixedposition_ge_7.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_7.setTextColor(0xffdedede);
			btn_fixedposition_ge_7_int = btn_fixedposition_ge_7_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge8() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[8] = changestatus(decade[8]);
		if (btn_fixedposition_ge_8_int == 1) {
			btn_fixedposition_ge_8.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_8.setTextColor(0xffffffff);
			btn_fixedposition_ge_8_int = btn_fixedposition_ge_8_int * -1;
		} else if (btn_fixedposition_ge_8_int == -1) {
			btn_fixedposition_ge_8.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_8.setTextColor(0xffdedede);
			btn_fixedposition_ge_8_int = btn_fixedposition_ge_8_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

	}

	public void selectge9() {
		clearge();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		decade[9] = changestatus(decade[9]);
		if (btn_fixedposition_ge_9_int == 1) {
			btn_fixedposition_ge_9.setBackgroundResource(R.drawable.big_num_on);
			text_fixedposition_ge_9.setTextColor(0xffffffff);
			btn_fixedposition_ge_9_int = btn_fixedposition_ge_9_int * -1;
		} else if (btn_fixedposition_ge_9_int == -1) {
			btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);
			text_fixedposition_ge_9.setTextColor(0xffdedede);
			btn_fixedposition_ge_9_int = btn_fixedposition_ge_9_int * -1;
		}
		show(decade);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());

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
	// // btn_fixedposition_ge_9.setBackgroundResource(R.drawable.round);
	// }
}
