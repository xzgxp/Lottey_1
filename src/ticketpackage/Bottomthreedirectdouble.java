package ticketpackage;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Context;
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
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Bottomthreedirectdouble extends BaseFragmentticket implements OnClickListener, OnTouchListener {
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
	private LinearLayout Lin_Bottomthreedirectdouble_wan_two;
	private LinearLayout Lin_Bottomthreedirectdouble_wan_one;
	private Button btn_Bottomthreedirectdouble_wan_0;
	private Button btn_Bottomthreedirectdouble_wan_1;
	private Button btn_Bottomthreedirectdouble_wan_2;
	private Button btn_Bottomthreedirectdouble_wan_3;
	private Button btn_Bottomthreedirectdouble_wan_4;
	private Button btn_Bottomthreedirectdouble_wan_5;
	private Button btn_Bottomthreedirectdouble_wan_6;
	private Button btn_Bottomthreedirectdouble_wan_7;
	private Button btn_Bottomthreedirectdouble_wan_8;
	private Button btn_Bottomthreedirectdouble_wan_9;
	private Button btn_Bottomthreedirectdouble_wan_big;
	private Button btn_Bottomthreedirectdouble_wan_little;
	private Button btn_Bottomthreedirectdouble_wan_all;
	private Button btn_Bottomthreedirectdouble_wan_odd;
	private Button btn_Bottomthreedirectdouble_wan_even;
	private Button btn_Bottomthreedirectdouble_wan_clear;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x0;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x1;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x2;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x3;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x4;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x5;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x6;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x7;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x8;
	private RelativeLayout btn_Bottomthreedirectdouble_wan_x9;
	private Integer btn_Bottomthreedirectdouble_wan_0_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_1_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_2_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_3_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_4_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_5_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_6_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_7_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_8_int = 1;
	private Integer btn_Bottomthreedirectdouble_wan_9_int = 1;
	private TextView text_Bottomthreedirectdouble_wan_0;
	private TextView text_Bottomthreedirectdouble_wan_1;
	private TextView text_Bottomthreedirectdouble_wan_2;
	private TextView text_Bottomthreedirectdouble_wan_3;
	private TextView text_Bottomthreedirectdouble_wan_4;
	private TextView text_Bottomthreedirectdouble_wan_5;
	private TextView text_Bottomthreedirectdouble_wan_6;
	private TextView text_Bottomthreedirectdouble_wan_7;
	private TextView text_Bottomthreedirectdouble_wan_8;
	private TextView text_Bottomthreedirectdouble_wan_9;
	private LinearLayout Lin_Bottomthreedirectdouble_qian_two;
	private LinearLayout Lin_Bottomthreedirectdouble_qian_one;
	private Button btn_Bottomthreedirectdouble_qian_0;
	private Button btn_Bottomthreedirectdouble_qian_1;
	private Button btn_Bottomthreedirectdouble_qian_2;
	private Button btn_Bottomthreedirectdouble_qian_3;
	private Button btn_Bottomthreedirectdouble_qian_4;
	private Button btn_Bottomthreedirectdouble_qian_5;
	private Button btn_Bottomthreedirectdouble_qian_6;
	private Button btn_Bottomthreedirectdouble_qian_7;
	private Button btn_Bottomthreedirectdouble_qian_8;
	private Button btn_Bottomthreedirectdouble_qian_9;
	private Button btn_Bottomthreedirectdouble_qian_big;
	private Button btn_Bottomthreedirectdouble_qian_little;
	private Button btn_Bottomthreedirectdouble_qian_all;
	private Button btn_Bottomthreedirectdouble_qian_odd;
	private Button btn_Bottomthreedirectdouble_qian_even;
	private Button btn_Bottomthreedirectdouble_qian_clear;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x0;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x1;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x2;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x3;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x4;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x5;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x6;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x7;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x8;
	private RelativeLayout btn_Bottomthreedirectdouble_qian_x9;
	private Integer btn_Bottomthreedirectdouble_qian_0_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_1_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_2_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_3_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_4_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_5_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_6_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_7_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_8_int = 1;
	private Integer btn_Bottomthreedirectdouble_qian_9_int = 1;
	private TextView text_Bottomthreedirectdouble_qian_0;
	private TextView text_Bottomthreedirectdouble_qian_1;
	private TextView text_Bottomthreedirectdouble_qian_2;
	private TextView text_Bottomthreedirectdouble_qian_3;
	private TextView text_Bottomthreedirectdouble_qian_4;
	private TextView text_Bottomthreedirectdouble_qian_5;
	private TextView text_Bottomthreedirectdouble_qian_6;
	private TextView text_Bottomthreedirectdouble_qian_7;
	private TextView text_Bottomthreedirectdouble_qian_8;
	private TextView text_Bottomthreedirectdouble_qian_9;
	private LinearLayout Lin_Bottomthreedirectdouble_bai_two;
	private LinearLayout Lin_Bottomthreedirectdouble_bai_one;
	private Button btn_Bottomthreedirectdouble_bai_0;
	private Button btn_Bottomthreedirectdouble_bai_1;
	private Button btn_Bottomthreedirectdouble_bai_2;
	private Button btn_Bottomthreedirectdouble_bai_3;
	private Button btn_Bottomthreedirectdouble_bai_4;
	private Button btn_Bottomthreedirectdouble_bai_5;
	private Button btn_Bottomthreedirectdouble_bai_6;
	private Button btn_Bottomthreedirectdouble_bai_7;
	private Button btn_Bottomthreedirectdouble_bai_8;
	private Button btn_Bottomthreedirectdouble_bai_9;
	private Button btn_Bottomthreedirectdouble_bai_big;
	private Button btn_Bottomthreedirectdouble_bai_little;
	private Button btn_Bottomthreedirectdouble_bai_all;
	private Button btn_Bottomthreedirectdouble_bai_odd;
	private Button btn_Bottomthreedirectdouble_bai_even;
	private Button btn_Bottomthreedirectdouble_bai_clear;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x0;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x1;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x2;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x3;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x4;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x5;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x6;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x7;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x8;
	private RelativeLayout btn_Bottomthreedirectdouble_bai_x9;
	private Integer btn_Bottomthreedirectdouble_bai_0_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_1_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_2_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_3_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_4_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_5_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_6_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_7_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_8_int = 1;
	private Integer btn_Bottomthreedirectdouble_bai_9_int = 1;
	private TextView text_Bottomthreedirectdouble_bai_0;
	private TextView text_Bottomthreedirectdouble_bai_1;
	private TextView text_Bottomthreedirectdouble_bai_2;
	private TextView text_Bottomthreedirectdouble_bai_3;
	private TextView text_Bottomthreedirectdouble_bai_4;
	private TextView text_Bottomthreedirectdouble_bai_5;
	private TextView text_Bottomthreedirectdouble_bai_6;
	private TextView text_Bottomthreedirectdouble_bai_7;
	private TextView text_Bottomthreedirectdouble_bai_8;
	private TextView text_Bottomthreedirectdouble_bai_9;
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

				// address.this.statusTextView.setText("�ļ��������");
				break;
			}
		}
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.ticket_bottomthree_direct_double, container, false);
		mMainActivity = (BaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		RelativeLayout_addbasket = (RelativeLayout) context.findViewById(R.id.RelativeLayout_addbasket);

		text_chooseend = (TextView) context.findViewById(R.id.text_chooseend);
		text_chooseresult = (TextView) context.findViewById(R.id.text_chooseresult);
		LinearLayout_nochoose = (LinearLayout) context.findViewById(R.id.LinearLayout_nochoose);
		vibrator = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);

		Lin_Bottomthreedirectdouble_wan_one = (LinearLayout) context
				.findViewById(R.id.Lin_Bottomthreedirectdouble_wan_one);
		Lin_Bottomthreedirectdouble_wan_two = (LinearLayout) context
				.findViewById(R.id.Lin_Bottomthreedirectdouble_wan_two);
		btn_Bottomthreedirectdouble_wan_0 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_0);
		btn_Bottomthreedirectdouble_wan_1 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_1);
		btn_Bottomthreedirectdouble_wan_2 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_2);
		btn_Bottomthreedirectdouble_wan_3 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_3);
		btn_Bottomthreedirectdouble_wan_4 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_4);
		btn_Bottomthreedirectdouble_wan_5 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_5);
		btn_Bottomthreedirectdouble_wan_6 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_6);
		btn_Bottomthreedirectdouble_wan_7 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_7);
		btn_Bottomthreedirectdouble_wan_8 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_8);
		btn_Bottomthreedirectdouble_wan_9 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_9);
		btn_Bottomthreedirectdouble_wan_x0 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x0);
		btn_Bottomthreedirectdouble_wan_x1 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x1);
		btn_Bottomthreedirectdouble_wan_x2 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x2);
		btn_Bottomthreedirectdouble_wan_x3 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x3);
		btn_Bottomthreedirectdouble_wan_x4 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x4);
		btn_Bottomthreedirectdouble_wan_x5 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x5);
		btn_Bottomthreedirectdouble_wan_x6 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x6);
		btn_Bottomthreedirectdouble_wan_x7 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x7);
		btn_Bottomthreedirectdouble_wan_x8 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x8);
		btn_Bottomthreedirectdouble_wan_x9 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_x9);
		text_Bottomthreedirectdouble_wan_0 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_0);
		text_Bottomthreedirectdouble_wan_1 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_1);
		text_Bottomthreedirectdouble_wan_2 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_2);
		text_Bottomthreedirectdouble_wan_3 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_3);
		text_Bottomthreedirectdouble_wan_4 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_4);
		text_Bottomthreedirectdouble_wan_5 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_5);
		text_Bottomthreedirectdouble_wan_6 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_6);
		text_Bottomthreedirectdouble_wan_7 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_7);
		text_Bottomthreedirectdouble_wan_8 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_8);
		text_Bottomthreedirectdouble_wan_9 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_wan_9);
		btn_Bottomthreedirectdouble_wan_big = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_big);
		btn_Bottomthreedirectdouble_wan_little = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_little);
		btn_Bottomthreedirectdouble_wan_all = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_all);
		btn_Bottomthreedirectdouble_wan_odd = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_odd);
		btn_Bottomthreedirectdouble_wan_even = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_wan_even);
		btn_Bottomthreedirectdouble_wan_clear = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_wan_clear);

		btn_Bottomthreedirectdouble_wan_0.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_1.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_2.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_3.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_4.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_5.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_6.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_7.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_8.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_9.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_wan_0.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_1.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_2.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_3.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_4.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_5.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_6.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_7.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_8.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_9.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_big.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_little.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_all.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_odd.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_even.setOnClickListener(this);
		btn_Bottomthreedirectdouble_wan_clear.setOnClickListener(this);
		Lin_Bottomthreedirectdouble_qian_one = (LinearLayout) context
				.findViewById(R.id.Lin_Bottomthreedirectdouble_qian_one);
		Lin_Bottomthreedirectdouble_qian_two = (LinearLayout) context
				.findViewById(R.id.Lin_Bottomthreedirectdouble_qian_two);
		btn_Bottomthreedirectdouble_qian_0 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_0);
		btn_Bottomthreedirectdouble_qian_1 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_1);
		btn_Bottomthreedirectdouble_qian_2 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_2);
		btn_Bottomthreedirectdouble_qian_3 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_3);
		btn_Bottomthreedirectdouble_qian_4 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_4);
		btn_Bottomthreedirectdouble_qian_5 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_5);
		btn_Bottomthreedirectdouble_qian_6 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_6);
		btn_Bottomthreedirectdouble_qian_7 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_7);
		btn_Bottomthreedirectdouble_qian_8 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_8);
		btn_Bottomthreedirectdouble_qian_9 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_9);
		btn_Bottomthreedirectdouble_qian_x0 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x0);
		btn_Bottomthreedirectdouble_qian_x1 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x1);
		btn_Bottomthreedirectdouble_qian_x2 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x2);
		btn_Bottomthreedirectdouble_qian_x3 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x3);
		btn_Bottomthreedirectdouble_qian_x4 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x4);
		btn_Bottomthreedirectdouble_qian_x5 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x5);
		btn_Bottomthreedirectdouble_qian_x6 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x6);
		btn_Bottomthreedirectdouble_qian_x7 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x7);
		btn_Bottomthreedirectdouble_qian_x8 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x8);
		btn_Bottomthreedirectdouble_qian_x9 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_x9);
		text_Bottomthreedirectdouble_qian_0 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_0);
		text_Bottomthreedirectdouble_qian_1 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_1);
		text_Bottomthreedirectdouble_qian_2 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_2);
		text_Bottomthreedirectdouble_qian_3 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_3);
		text_Bottomthreedirectdouble_qian_4 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_4);
		text_Bottomthreedirectdouble_qian_5 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_5);
		text_Bottomthreedirectdouble_qian_6 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_6);
		text_Bottomthreedirectdouble_qian_7 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_7);
		text_Bottomthreedirectdouble_qian_8 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_8);
		text_Bottomthreedirectdouble_qian_9 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_qian_9);
		btn_Bottomthreedirectdouble_qian_big = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_big);
		btn_Bottomthreedirectdouble_qian_little = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_little);
		btn_Bottomthreedirectdouble_qian_all = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_all);
		btn_Bottomthreedirectdouble_qian_odd = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_qian_odd);
		btn_Bottomthreedirectdouble_qian_even = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_even);
		btn_Bottomthreedirectdouble_qian_clear = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_qian_clear);

		btn_Bottomthreedirectdouble_qian_0.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_1.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_2.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_3.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_4.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_5.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_6.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_7.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_8.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_9.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_qian_0.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_1.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_2.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_3.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_4.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_5.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_6.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_7.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_8.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_9.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_big.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_little.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_all.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_odd.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_even.setOnClickListener(this);
		btn_Bottomthreedirectdouble_qian_clear.setOnClickListener(this);
		Lin_Bottomthreedirectdouble_bai_one = (LinearLayout) context
				.findViewById(R.id.Lin_Bottomthreedirectdouble_bai_one);
		Lin_Bottomthreedirectdouble_bai_two = (LinearLayout) context
				.findViewById(R.id.Lin_Bottomthreedirectdouble_bai_two);
		btn_Bottomthreedirectdouble_bai_0 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_0);
		btn_Bottomthreedirectdouble_bai_1 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_1);
		btn_Bottomthreedirectdouble_bai_2 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_2);
		btn_Bottomthreedirectdouble_bai_3 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_3);
		btn_Bottomthreedirectdouble_bai_4 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_4);
		btn_Bottomthreedirectdouble_bai_5 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_5);
		btn_Bottomthreedirectdouble_bai_6 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_6);
		btn_Bottomthreedirectdouble_bai_7 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_7);
		btn_Bottomthreedirectdouble_bai_8 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_8);
		btn_Bottomthreedirectdouble_bai_9 = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_9);
		btn_Bottomthreedirectdouble_bai_x0 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x0);
		btn_Bottomthreedirectdouble_bai_x1 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x1);
		btn_Bottomthreedirectdouble_bai_x2 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x2);
		btn_Bottomthreedirectdouble_bai_x3 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x3);
		btn_Bottomthreedirectdouble_bai_x4 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x4);
		btn_Bottomthreedirectdouble_bai_x5 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x5);
		btn_Bottomthreedirectdouble_bai_x6 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x6);
		btn_Bottomthreedirectdouble_bai_x7 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x7);
		btn_Bottomthreedirectdouble_bai_x8 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x8);
		btn_Bottomthreedirectdouble_bai_x9 = (RelativeLayout) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_x9);
		text_Bottomthreedirectdouble_bai_0 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_0);
		text_Bottomthreedirectdouble_bai_1 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_1);
		text_Bottomthreedirectdouble_bai_2 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_2);
		text_Bottomthreedirectdouble_bai_3 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_3);
		text_Bottomthreedirectdouble_bai_4 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_4);
		text_Bottomthreedirectdouble_bai_5 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_5);
		text_Bottomthreedirectdouble_bai_6 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_6);
		text_Bottomthreedirectdouble_bai_7 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_7);
		text_Bottomthreedirectdouble_bai_8 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_8);
		text_Bottomthreedirectdouble_bai_9 = (TextView) context.findViewById(R.id.text_Bottomthreedirectdouble_bai_9);
		btn_Bottomthreedirectdouble_bai_big = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_big);
		btn_Bottomthreedirectdouble_bai_little = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_little);
		btn_Bottomthreedirectdouble_bai_all = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_all);
		btn_Bottomthreedirectdouble_bai_odd = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_odd);
		btn_Bottomthreedirectdouble_bai_even = (Button) context.findViewById(R.id.btn_Bottomthreedirectdouble_bai_even);
		btn_Bottomthreedirectdouble_bai_clear = (Button) context
				.findViewById(R.id.btn_Bottomthreedirectdouble_bai_clear);

		btn_Bottomthreedirectdouble_bai_0.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_1.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_2.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_3.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_4.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_5.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_6.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_7.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_8.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_9.setOnTouchListener(this);
		btn_Bottomthreedirectdouble_bai_0.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_1.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_2.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_3.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_4.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_5.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_6.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_7.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_8.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_9.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_big.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_little.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_all.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_odd.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_even.setOnClickListener(this);
		btn_Bottomthreedirectdouble_bai_clear.setOnClickListener(this);
		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_rocknumber = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_rocknumber);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (number != 0) {
					getnumber_Bottomthreedirectdouble_wan_clear();
					getnumber_Bottomthreedirectdouble_qian_clear();
					getnumber_Bottomthreedirectdouble_bai_clear();
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
					getnumber_Bottomthreedirectdouble_wan_clear();
					getnumber_Bottomthreedirectdouble_qian_clear();
					getnumber_Bottomthreedirectdouble_bai_clear();
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
					getnumber_Bottomthreedirectdouble_wan_clear();
					getnumber_Bottomthreedirectdouble_qian_clear();
					getnumber_Bottomthreedirectdouble_bai_clear();
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
				int wan = (int) (Math.random() * 10);
				switch (wan) {
				case 0:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan0();
					break;
				case 1:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan1();
					break;
				case 2:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan2();
					break;
				case 3:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan3();
					break;
				case 4:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan4();
					break;
				case 5:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan5();
					break;
				case 6:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan6();
					break;
				case 7:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan7();
					break;
				case 8:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan8();
					break;
				case 9:
					getnumber_Bottomthreedirectdouble_wan_clear();
					selectwan9();
					break;

				default:
					break;
				}
				int qian = (int) (Math.random() * 10);
				switch (qian) {
				case 0:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian0();
					break;
				case 1:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian1();
					break;
				case 2:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian2();
					break;
				case 3:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian3();
					break;
				case 4:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian4();
					break;
				case 5:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian5();
					break;
				case 6:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian6();
					break;
				case 7:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian7();
					break;
				case 8:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian8();
					break;
				case 9:
					getnumber_Bottomthreedirectdouble_qian_clear();
					selectqian9();
					break;

				default:
					break;
				}
				int bai = (int) (Math.random() * 10);
				switch (bai) {
				case 0:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai0();
					break;
				case 1:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai1();
					break;
				case 2:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai2();
					break;
				case 3:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai3();
					break;
				case 4:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai4();
					break;
				case 5:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai5();
					break;
				case 6:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai6();
					break;
				case 7:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai7();
					break;
				case 8:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai8();
					break;
				case 9:
					getnumber_Bottomthreedirectdouble_bai_clear();
					selectbai9();
					break;

				default:
					break;
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
		// Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
		// btn_Bottomthreedirectdouble_wan_x0.setVisibility(View.VISIBLE);
		// } else if (actionFive == MotionEvent.ACTION_UP) {
		// Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
		// btn_Bottomthreedirectdouble_wan_x0.setVisibility(View.INVISIBLE);
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

		BaseActivityticket.curFragmentTag = getString(R.string.bottomthree_direct_double_name);
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
		// activity.findViewById(R.id.btn_Bottomthreedirectdouble_ge_9);
		// progressBar.setBackgroundResource(R.drawable.round);
		// btn_Bottomthreedirectdouble_ge_9.setBackgroundResource(R.drawable.round);

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
		getnumber_Bottomthreedirectdouble_wan_clear();
		getnumber_Bottomthreedirectdouble_qian_clear();
		getnumber_Bottomthreedirectdouble_bai_clear();
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
		case R.id.btn_Bottomthreedirectdouble_wan_big:
			clearwan();

			btn_Bottomthreedirectdouble_wan_big.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_wan_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_wan_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_little:
			clearwan();
			btn_Bottomthreedirectdouble_wan_little.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_wan_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_wan_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_all:
			clearwan();
			btn_Bottomthreedirectdouble_wan_all.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_wan_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_wan_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_odd:
			clearwan();
			btn_Bottomthreedirectdouble_wan_odd.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_wan_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_wan_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_even:
			clearwan();
			btn_Bottomthreedirectdouble_wan_even.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_wan_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_wan_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_clear:
			clearwan();
			btn_Bottomthreedirectdouble_wan_clear.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_wan_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_wan_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Bottomthreedirectdouble_wan_0:
			selectwan0();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_1:
			selectwan1();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_2:
			selectwan2();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_3:
			selectwan3();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_4:
			selectwan4();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_5:
			selectwan5();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_6:
			selectwan6();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_7:
			selectwan7();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_8:
			selectwan8();
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_9:
			selectwan9();
			break;

		case R.id.btn_Bottomthreedirectdouble_qian_big:
			clearqian();
			btn_Bottomthreedirectdouble_qian_big.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_qian_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_qian_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_little:
			clearqian();
			btn_Bottomthreedirectdouble_qian_little.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_qian_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_qian_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_all:
			clearqian();
			btn_Bottomthreedirectdouble_qian_all.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_qian_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_qian_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_odd:
			clearqian();
			btn_Bottomthreedirectdouble_qian_odd.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_qian_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_qian_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_even:
			clearqian();
			btn_Bottomthreedirectdouble_qian_even.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_qian_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_qian_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_clear:
			clearqian();
			btn_Bottomthreedirectdouble_qian_clear.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_qian_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_qian_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Bottomthreedirectdouble_qian_0:
			selectqian0();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_1:
			selectqian1();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_2:
			selectqian2();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_3:
			selectqian3();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_4:
			selectqian4();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_5:
			selectqian5();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_6:
			selectqian6();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_7:
			selectqian7();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_8:
			selectqian8();
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_9:
			selectqian9();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_big:
			clearbai();
			btn_Bottomthreedirectdouble_bai_big.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_bai_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_bai_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_little:
			clearbai();
			btn_Bottomthreedirectdouble_bai_little.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_bai_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_bai_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_all:
			clearbai();
			btn_Bottomthreedirectdouble_bai_all.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_bai_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_bai_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_odd:
			clearbai();
			btn_Bottomthreedirectdouble_bai_odd.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_bai_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_bai_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_even:
			clearbai();
			btn_Bottomthreedirectdouble_bai_even.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_bai_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_bai_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_clear:
			clearbai();
			btn_Bottomthreedirectdouble_bai_clear.setTextColor(0xff000000);
			btn_Bottomthreedirectdouble_bai_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);

			getnumber_Bottomthreedirectdouble_bai_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Bottomthreedirectdouble_bai_0:
			selectbai0();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_1:
			selectbai1();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_2:
			selectbai2();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_3:
			selectbai3();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_4:
			selectbai4();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_5:
			selectbai5();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_6:
			selectbai6();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_7:
			selectbai7();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_8:
			selectbai8();
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_9:
			selectbai9();
			break;

		}
	}

	private void getnumber_Bottomthreedirectdouble_wan_big() {
		// TODO Auto-generated method stub
		btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_0.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_1.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_2.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_3.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_4.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_5.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_6.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_7.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_9.setTextColor(0xffffffff);
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

		btn_Bottomthreedirectdouble_wan_0_int = 1;
		btn_Bottomthreedirectdouble_wan_1_int = 1;
		btn_Bottomthreedirectdouble_wan_2_int = 1;
		btn_Bottomthreedirectdouble_wan_3_int = 1;
		btn_Bottomthreedirectdouble_wan_4_int = 1;
		btn_Bottomthreedirectdouble_wan_5_int = -1;
		btn_Bottomthreedirectdouble_wan_6_int = -1;
		btn_Bottomthreedirectdouble_wan_7_int = -1;
		btn_Bottomthreedirectdouble_wan_8_int = -1;
		btn_Bottomthreedirectdouble_wan_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Bottomthreedirectdouble_wan_little() {
		btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_0.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_1.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_2.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_3.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_4.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_5.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_6.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_7.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_8.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_wan_5_int = 1;
		btn_Bottomthreedirectdouble_wan_6_int = 1;
		btn_Bottomthreedirectdouble_wan_7_int = 1;
		btn_Bottomthreedirectdouble_wan_8_int = 1;
		btn_Bottomthreedirectdouble_wan_9_int = 1;
		btn_Bottomthreedirectdouble_wan_0_int = -1;
		btn_Bottomthreedirectdouble_wan_1_int = -1;
		btn_Bottomthreedirectdouble_wan_2_int = -1;
		btn_Bottomthreedirectdouble_wan_3_int = -1;
		btn_Bottomthreedirectdouble_wan_4_int = -1;

		show(myriabit);
	}

	private void getnumber_Bottomthreedirectdouble_wan_all() {
		btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_0.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_1.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_2.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_3.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_4.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_5.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_6.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_7.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_9.setTextColor(0xffffffff);
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
		btn_Bottomthreedirectdouble_wan_0_int = -1;
		btn_Bottomthreedirectdouble_wan_1_int = -1;
		btn_Bottomthreedirectdouble_wan_2_int = -1;
		btn_Bottomthreedirectdouble_wan_3_int = -1;
		btn_Bottomthreedirectdouble_wan_4_int = -1;
		btn_Bottomthreedirectdouble_wan_5_int = -1;
		btn_Bottomthreedirectdouble_wan_6_int = -1;
		btn_Bottomthreedirectdouble_wan_7_int = -1;
		btn_Bottomthreedirectdouble_wan_8_int = -1;
		btn_Bottomthreedirectdouble_wan_9_int = -1;

		show(myriabit);
	}

	private void getnumber_Bottomthreedirectdouble_wan_odd() {
		btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_0.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_2.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_4.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_6.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_8.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_1.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_3.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_5.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_7.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_9.setTextColor(0xffffffff);
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

		btn_Bottomthreedirectdouble_wan_0_int = 1;
		btn_Bottomthreedirectdouble_wan_2_int = 1;
		btn_Bottomthreedirectdouble_wan_4_int = 1;
		btn_Bottomthreedirectdouble_wan_6_int = 1;
		btn_Bottomthreedirectdouble_wan_8_int = 1;
		btn_Bottomthreedirectdouble_wan_1_int = -1;
		btn_Bottomthreedirectdouble_wan_3_int = -1;
		btn_Bottomthreedirectdouble_wan_5_int = -1;
		btn_Bottomthreedirectdouble_wan_7_int = -1;
		btn_Bottomthreedirectdouble_wan_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Bottomthreedirectdouble_wan_even() {
		btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_wan_0.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_2.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_4.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_6.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_wan_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_1.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_3.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_5.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_7.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_wan_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_wan_1_int = 1;
		btn_Bottomthreedirectdouble_wan_3_int = 1;
		btn_Bottomthreedirectdouble_wan_5_int = 1;
		btn_Bottomthreedirectdouble_wan_7_int = 1;
		btn_Bottomthreedirectdouble_wan_9_int = 1;
		btn_Bottomthreedirectdouble_wan_0_int = -1;
		btn_Bottomthreedirectdouble_wan_2_int = -1;
		btn_Bottomthreedirectdouble_wan_4_int = -1;
		btn_Bottomthreedirectdouble_wan_6_int = -1;
		btn_Bottomthreedirectdouble_wan_8_int = -1;

		show(myriabit);
	}

	private void getnumber_Bottomthreedirectdouble_wan_clear() {
		btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_0.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_1.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_2.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_3.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_4.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_5.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_6.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_7.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_8.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_wan_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_wan_0_int = 1;
		btn_Bottomthreedirectdouble_wan_1_int = 1;
		btn_Bottomthreedirectdouble_wan_2_int = 1;
		btn_Bottomthreedirectdouble_wan_3_int = 1;
		btn_Bottomthreedirectdouble_wan_4_int = 1;
		btn_Bottomthreedirectdouble_wan_5_int = 1;
		btn_Bottomthreedirectdouble_wan_6_int = 1;
		btn_Bottomthreedirectdouble_wan_7_int = 1;
		btn_Bottomthreedirectdouble_wan_8_int = 1;
		btn_Bottomthreedirectdouble_wan_9_int = 1;
		show(myriabit);
	}

	private void clearwan() {
		// TODO Auto-generated method stub
		btn_Bottomthreedirectdouble_wan_big.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_wan_little.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_wan_all.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_wan_odd.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_wan_even.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_wan_clear.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_wan_big.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_wan_little.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_wan_all.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_wan_odd.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_wan_even.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_wan_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_Bottomthreedirectdouble_qian_big() {
		// TODO Auto-generated method stub
		btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_0.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_1.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_2.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_3.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_4.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_5.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_6.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_7.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_9.setTextColor(0xffffffff);
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

		btn_Bottomthreedirectdouble_qian_0_int = 1;
		btn_Bottomthreedirectdouble_qian_1_int = 1;
		btn_Bottomthreedirectdouble_qian_2_int = 1;
		btn_Bottomthreedirectdouble_qian_3_int = 1;
		btn_Bottomthreedirectdouble_qian_4_int = 1;
		btn_Bottomthreedirectdouble_qian_5_int = -1;
		btn_Bottomthreedirectdouble_qian_6_int = -1;
		btn_Bottomthreedirectdouble_qian_7_int = -1;
		btn_Bottomthreedirectdouble_qian_8_int = -1;
		btn_Bottomthreedirectdouble_qian_9_int = -1;
		show(kilobit);
	}

	private void getnumber_Bottomthreedirectdouble_qian_little() {
		btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_0.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_1.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_2.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_3.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_4.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_5.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_6.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_7.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_8.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_qian_5_int = 1;
		btn_Bottomthreedirectdouble_qian_6_int = 1;
		btn_Bottomthreedirectdouble_qian_7_int = 1;
		btn_Bottomthreedirectdouble_qian_8_int = 1;
		btn_Bottomthreedirectdouble_qian_9_int = 1;
		btn_Bottomthreedirectdouble_qian_0_int = -1;
		btn_Bottomthreedirectdouble_qian_1_int = -1;
		btn_Bottomthreedirectdouble_qian_2_int = -1;
		btn_Bottomthreedirectdouble_qian_3_int = -1;
		btn_Bottomthreedirectdouble_qian_4_int = -1;

		show(kilobit);
	}

	private void getnumber_Bottomthreedirectdouble_qian_all() {
		btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_0.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_1.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_2.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_3.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_4.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_5.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_6.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_7.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_9.setTextColor(0xffffffff);
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
		btn_Bottomthreedirectdouble_qian_0_int = -1;
		btn_Bottomthreedirectdouble_qian_1_int = -1;
		btn_Bottomthreedirectdouble_qian_2_int = -1;
		btn_Bottomthreedirectdouble_qian_3_int = -1;
		btn_Bottomthreedirectdouble_qian_4_int = -1;
		btn_Bottomthreedirectdouble_qian_5_int = -1;
		btn_Bottomthreedirectdouble_qian_6_int = -1;
		btn_Bottomthreedirectdouble_qian_7_int = -1;
		btn_Bottomthreedirectdouble_qian_8_int = -1;
		btn_Bottomthreedirectdouble_qian_9_int = -1;

		show(kilobit);
	}

	private void getnumber_Bottomthreedirectdouble_qian_odd() {
		btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_0.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_2.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_4.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_6.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_8.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_1.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_3.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_5.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_7.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_9.setTextColor(0xffffffff);
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

		btn_Bottomthreedirectdouble_qian_0_int = 1;
		btn_Bottomthreedirectdouble_qian_2_int = 1;
		btn_Bottomthreedirectdouble_qian_4_int = 1;
		btn_Bottomthreedirectdouble_qian_6_int = 1;
		btn_Bottomthreedirectdouble_qian_8_int = 1;
		btn_Bottomthreedirectdouble_qian_1_int = -1;
		btn_Bottomthreedirectdouble_qian_3_int = -1;
		btn_Bottomthreedirectdouble_qian_5_int = -1;
		btn_Bottomthreedirectdouble_qian_7_int = -1;
		btn_Bottomthreedirectdouble_qian_9_int = -1;
		show(kilobit);
	}

	private void getnumber_Bottomthreedirectdouble_qian_even() {
		btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_qian_0.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_2.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_4.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_6.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_qian_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_1.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_3.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_5.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_7.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_qian_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_qian_1_int = 1;
		btn_Bottomthreedirectdouble_qian_3_int = 1;
		btn_Bottomthreedirectdouble_qian_5_int = 1;
		btn_Bottomthreedirectdouble_qian_7_int = 1;
		btn_Bottomthreedirectdouble_qian_9_int = 1;
		btn_Bottomthreedirectdouble_qian_0_int = -1;
		btn_Bottomthreedirectdouble_qian_2_int = -1;
		btn_Bottomthreedirectdouble_qian_4_int = -1;
		btn_Bottomthreedirectdouble_qian_6_int = -1;
		btn_Bottomthreedirectdouble_qian_8_int = -1;

		show(kilobit);
	}

	private void getnumber_Bottomthreedirectdouble_qian_clear() {
		btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_0.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_1.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_2.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_3.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_4.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_5.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_6.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_7.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_8.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_qian_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_qian_0_int = 1;
		btn_Bottomthreedirectdouble_qian_1_int = 1;
		btn_Bottomthreedirectdouble_qian_2_int = 1;
		btn_Bottomthreedirectdouble_qian_3_int = 1;
		btn_Bottomthreedirectdouble_qian_4_int = 1;
		btn_Bottomthreedirectdouble_qian_5_int = 1;
		btn_Bottomthreedirectdouble_qian_6_int = 1;
		btn_Bottomthreedirectdouble_qian_7_int = 1;
		btn_Bottomthreedirectdouble_qian_8_int = 1;
		btn_Bottomthreedirectdouble_qian_9_int = 1;
		show(kilobit);
	}

	private void clearqian() {
		// TODO Auto-generated method stub
		btn_Bottomthreedirectdouble_qian_big.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_qian_little.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_qian_all.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_qian_odd.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_qian_even.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_qian_clear.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_qian_big.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_qian_little.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_qian_all.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_qian_odd.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_qian_even.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_qian_clear.setTextColor(0xffcfcfcf);

	}

	private void getnumber_Bottomthreedirectdouble_bai_big() {
		// TODO Auto-generated method stub
		btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_0.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_1.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_2.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_3.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_4.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_5.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_6.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_7.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_9.setTextColor(0xffffffff);
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

		btn_Bottomthreedirectdouble_bai_0_int = 1;
		btn_Bottomthreedirectdouble_bai_1_int = 1;
		btn_Bottomthreedirectdouble_bai_2_int = 1;
		btn_Bottomthreedirectdouble_bai_3_int = 1;
		btn_Bottomthreedirectdouble_bai_4_int = 1;
		btn_Bottomthreedirectdouble_bai_5_int = -1;
		btn_Bottomthreedirectdouble_bai_6_int = -1;
		btn_Bottomthreedirectdouble_bai_7_int = -1;
		btn_Bottomthreedirectdouble_bai_8_int = -1;
		btn_Bottomthreedirectdouble_bai_9_int = -1;
		show(hundreds);
	}

	private void getnumber_Bottomthreedirectdouble_bai_little() {
		btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_0.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_1.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_2.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_3.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_4.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_5.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_6.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_7.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_8.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_bai_5_int = 1;
		btn_Bottomthreedirectdouble_bai_6_int = 1;
		btn_Bottomthreedirectdouble_bai_7_int = 1;
		btn_Bottomthreedirectdouble_bai_8_int = 1;
		btn_Bottomthreedirectdouble_bai_9_int = 1;
		btn_Bottomthreedirectdouble_bai_0_int = -1;
		btn_Bottomthreedirectdouble_bai_1_int = -1;
		btn_Bottomthreedirectdouble_bai_2_int = -1;
		btn_Bottomthreedirectdouble_bai_3_int = -1;
		btn_Bottomthreedirectdouble_bai_4_int = -1;

		show(hundreds);
	}

	private void getnumber_Bottomthreedirectdouble_bai_all() {
		btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_0.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_1.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_2.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_3.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_4.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_5.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_6.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_7.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_9.setTextColor(0xffffffff);
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
		btn_Bottomthreedirectdouble_bai_0_int = -1;
		btn_Bottomthreedirectdouble_bai_1_int = -1;
		btn_Bottomthreedirectdouble_bai_2_int = -1;
		btn_Bottomthreedirectdouble_bai_3_int = -1;
		btn_Bottomthreedirectdouble_bai_4_int = -1;
		btn_Bottomthreedirectdouble_bai_5_int = -1;
		btn_Bottomthreedirectdouble_bai_6_int = -1;
		btn_Bottomthreedirectdouble_bai_7_int = -1;
		btn_Bottomthreedirectdouble_bai_8_int = -1;
		btn_Bottomthreedirectdouble_bai_9_int = -1;

		show(hundreds);
	}

	private void getnumber_Bottomthreedirectdouble_bai_odd() {
		btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_0.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_2.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_4.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_6.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_8.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_1.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_3.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_5.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_7.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_9.setTextColor(0xffffffff);
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

		btn_Bottomthreedirectdouble_bai_0_int = 1;
		btn_Bottomthreedirectdouble_bai_2_int = 1;
		btn_Bottomthreedirectdouble_bai_4_int = 1;
		btn_Bottomthreedirectdouble_bai_6_int = 1;
		btn_Bottomthreedirectdouble_bai_8_int = 1;
		btn_Bottomthreedirectdouble_bai_1_int = -1;
		btn_Bottomthreedirectdouble_bai_3_int = -1;
		btn_Bottomthreedirectdouble_bai_5_int = -1;
		btn_Bottomthreedirectdouble_bai_7_int = -1;
		btn_Bottomthreedirectdouble_bai_9_int = -1;
		show(hundreds);
	}

	private void getnumber_Bottomthreedirectdouble_bai_even() {
		btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.big_num_on);
		text_Bottomthreedirectdouble_bai_0.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_2.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_4.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_6.setTextColor(0xffffffff);
		text_Bottomthreedirectdouble_bai_8.setTextColor(0xffffffff);
		btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.round);
		btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_1.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_3.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_5.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_7.setTextColor(0xffdedede);
		text_Bottomthreedirectdouble_bai_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_bai_1_int = 1;
		btn_Bottomthreedirectdouble_bai_3_int = 1;
		btn_Bottomthreedirectdouble_bai_5_int = 1;
		btn_Bottomthreedirectdouble_bai_7_int = 1;
		btn_Bottomthreedirectdouble_bai_9_int = 1;
		btn_Bottomthreedirectdouble_bai_0_int = -1;
		btn_Bottomthreedirectdouble_bai_2_int = -1;
		btn_Bottomthreedirectdouble_bai_4_int = -1;
		btn_Bottomthreedirectdouble_bai_6_int = -1;
		btn_Bottomthreedirectdouble_bai_8_int = -1;

		show(hundreds);
	}

	private void getnumber_Bottomthreedirectdouble_bai_clear() {
		btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_0.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_1.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_2.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_3.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_4.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_5.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_6.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_7.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_8.setTextColor(0xffdedede);
		btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.round);
		text_Bottomthreedirectdouble_bai_9.setTextColor(0xffdedede);
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
		btn_Bottomthreedirectdouble_bai_0_int = 1;
		btn_Bottomthreedirectdouble_bai_1_int = 1;
		btn_Bottomthreedirectdouble_bai_2_int = 1;
		btn_Bottomthreedirectdouble_bai_3_int = 1;
		btn_Bottomthreedirectdouble_bai_4_int = 1;
		btn_Bottomthreedirectdouble_bai_5_int = 1;
		btn_Bottomthreedirectdouble_bai_6_int = 1;
		btn_Bottomthreedirectdouble_bai_7_int = 1;
		btn_Bottomthreedirectdouble_bai_8_int = 1;
		btn_Bottomthreedirectdouble_bai_9_int = 1;
		show(hundreds);
	}

	void clearbai() {
		// TODO Auto-generated method stub
		btn_Bottomthreedirectdouble_bai_big.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_bai_little.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_bai_all.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_bai_odd.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_bai_even.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_bai_clear.setBackgroundResource(0);
		btn_Bottomthreedirectdouble_bai_big.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_bai_little.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_bai_all.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_bai_odd.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_bai_even.setTextColor(0xffcfcfcf);
		btn_Bottomthreedirectdouble_bai_clear.setTextColor(0xffcfcfcf);
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
		// btn_Bottomthreedirectdouble_bai_0_int = 1;
		// btn_Bottomthreedirectdouble_bai_1_int = 1;
		// btn_Bottomthreedirectdouble_bai_2_int = 1;
		// btn_Bottomthreedirectdouble_bai_3_int = 1;
		// btn_Bottomthreedirectdouble_bai_4_int = 1;
		// btn_Bottomthreedirectdouble_bai_5_int = 1;
		// btn_Bottomthreedirectdouble_bai_6_int = 1;
		// btn_Bottomthreedirectdouble_bai_7_int = 1;
		// btn_Bottomthreedirectdouble_bai_8_int = 1;
		// btn_Bottomthreedirectdouble_bai_9_int = 1;

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

		result = result1.length() * result2.length() * result3.length();
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
		case R.id.btn_Bottomthreedirectdouble_wan_0:

			int actionBottomthreedirectdouble0 = event.getAction();
			if (actionBottomthreedirectdouble0 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x0.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble0 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionBottomthreedirectdouble0 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionBottomthreedirectdouble1 = event.getAction();
			if (actionBottomthreedirectdouble1 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x1.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble1 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x1.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble1 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_2:
			int actionBottomthreedirectdouble2 = event.getAction();
			if (actionBottomthreedirectdouble2 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x2.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble2 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x2.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble2 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_3:
			int actionBottomthreedirectdouble3 = event.getAction();
			if (actionBottomthreedirectdouble3 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x3.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble3 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x3.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble3 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_4:
			int actionBottomthreedirectdouble4 = event.getAction();
			if (actionBottomthreedirectdouble4 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x4.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble4 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x4.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble4 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_5:
			int actionBottomthreedirectdouble5 = event.getAction();
			if (actionBottomthreedirectdouble5 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x5.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble5 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x5.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble5 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_6:
			Log.d("btn_1_1", "btn_Bottomthreedirectdouble_wan_6");
			int actionBottomthreedirectdouble6 = event.getAction();
			if (actionBottomthreedirectdouble6 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x6.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble6 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x6.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble6 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_7:
			int actionBottomthreedirectdouble7 = event.getAction();
			if (actionBottomthreedirectdouble7 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x7.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble7 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x7.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble7 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_8:
			int actionBottomthreedirectdouble8 = event.getAction();
			if (actionBottomthreedirectdouble8 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x8.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble8 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x8.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble8 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_wan_9:
			int actionBottomthreedirectdouble9 = event.getAction();
			if (actionBottomthreedirectdouble9 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_wan_x9.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble9 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x9.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble9 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_wan_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_wan_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_0:

			int actionBottomthreedirectdouble01 = event.getAction();
			if (actionBottomthreedirectdouble01 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x0.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble01 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionBottomthreedirectdouble01 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionBottomthreedirectdouble11 = event.getAction();
			if (actionBottomthreedirectdouble11 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x1.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble11 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x1.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble11 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_2:
			int actionBottomthreedirectdouble21 = event.getAction();
			if (actionBottomthreedirectdouble21 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x2.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble21 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x2.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble21 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_3:
			int actionBottomthreedirectdouble31 = event.getAction();
			if (actionBottomthreedirectdouble31 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x3.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble31 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x3.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble31 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_4:
			int actionBottomthreedirectdouble41 = event.getAction();
			if (actionBottomthreedirectdouble41 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x4.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble41 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x4.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble41 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_5:
			int actionBottomthreedirectdouble51 = event.getAction();
			if (actionBottomthreedirectdouble51 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x5.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble51 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x5.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble51 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_6:
			Log.d("btn_1_1", "btn_Bottomthreedirectdouble_qian_6");
			int actionBottomthreedirectdouble61 = event.getAction();
			if (actionBottomthreedirectdouble61 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x6.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble61 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x6.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble61 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_7:
			int actionBottomthreedirectdouble71 = event.getAction();
			if (actionBottomthreedirectdouble71 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x7.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble71 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x7.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble71 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_8:
			int actionBottomthreedirectdouble81 = event.getAction();
			if (actionBottomthreedirectdouble81 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x8.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble81 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x8.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble81 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_qian_9:
			int actionBottomthreedirectdouble91 = event.getAction();
			if (actionBottomthreedirectdouble91 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_qian_x9.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble91 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x9.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble91 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_qian_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_qian_x9.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_0:

			int actionBottomthreedirectdouble02 = event.getAction();
			if (actionBottomthreedirectdouble02 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x0.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble02 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionBottomthreedirectdouble02 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionBottomthreedirectdouble12 = event.getAction();
			if (actionBottomthreedirectdouble12 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x1.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble12 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x1.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble12 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_2:
			int actionBottomthreedirectdouble22 = event.getAction();
			if (actionBottomthreedirectdouble22 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x2.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble22 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x2.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble22 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_3:
			int actionBottomthreedirectdouble32 = event.getAction();
			if (actionBottomthreedirectdouble32 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x3.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble32 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x3.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble32 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_4:
			int actionBottomthreedirectdouble42 = event.getAction();
			if (actionBottomthreedirectdouble42 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x4.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble42 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x4.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble42 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_5:
			int actionBottomthreedirectdouble52 = event.getAction();
			if (actionBottomthreedirectdouble52 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x5.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble52 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x5.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble52 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_one.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_6:
			Log.d("btn_1_1", "btn_Bottomthreedirectdouble_bai_6");
			int actionBottomthreedirectdouble62 = event.getAction();
			if (actionBottomthreedirectdouble62 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x6.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble62 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x6.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble62 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_7:
			int actionBottomthreedirectdouble72 = event.getAction();
			if (actionBottomthreedirectdouble72 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x7.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble72 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x7.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble72 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_8:
			int actionBottomthreedirectdouble82 = event.getAction();
			if (actionBottomthreedirectdouble82 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x8.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble82 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x8.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble82 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Bottomthreedirectdouble_bai_9:
			int actionBottomthreedirectdouble92 = event.getAction();
			if (actionBottomthreedirectdouble92 == MotionEvent.ACTION_DOWN) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.VISIBLE);
				btn_Bottomthreedirectdouble_bai_x9.setVisibility(View.VISIBLE);
			} else if (actionBottomthreedirectdouble92 == MotionEvent.ACTION_UP) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x9.setVisibility(View.INVISIBLE);
			} else if (actionBottomthreedirectdouble92 == MotionEvent.ACTION_CANCEL) {
				Lin_Bottomthreedirectdouble_bai_two.setVisibility(View.INVISIBLE);
				btn_Bottomthreedirectdouble_bai_x9.setVisibility(View.INVISIBLE);
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
		if (btn_Bottomthreedirectdouble_wan_0_int == 1) {
			btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_0.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_0_int = btn_Bottomthreedirectdouble_wan_0_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_0_int == -1) {
			btn_Bottomthreedirectdouble_wan_0.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_0.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_0_int = btn_Bottomthreedirectdouble_wan_0_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_1_int == 1) {
			btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_1.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_1_int = btn_Bottomthreedirectdouble_wan_1_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_1_int == -1) {
			btn_Bottomthreedirectdouble_wan_1.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_1.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_1_int = btn_Bottomthreedirectdouble_wan_1_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_2_int == 1) {
			btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_2.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_2_int = btn_Bottomthreedirectdouble_wan_2_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_2_int == -1) {
			btn_Bottomthreedirectdouble_wan_2.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_2.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_2_int = btn_Bottomthreedirectdouble_wan_2_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_3_int == 1) {
			btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_3.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_3_int = btn_Bottomthreedirectdouble_wan_3_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_3_int == -1) {
			btn_Bottomthreedirectdouble_wan_3.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_3.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_3_int = btn_Bottomthreedirectdouble_wan_3_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_4_int == 1) {
			btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_4.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_4_int = btn_Bottomthreedirectdouble_wan_4_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_4_int == -1) {
			btn_Bottomthreedirectdouble_wan_4.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_4.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_4_int = btn_Bottomthreedirectdouble_wan_4_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_5_int == 1) {
			btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_5.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_5_int = btn_Bottomthreedirectdouble_wan_5_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_5_int == -1) {
			btn_Bottomthreedirectdouble_wan_5.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_5.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_5_int = btn_Bottomthreedirectdouble_wan_5_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_6_int == 1) {
			btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_6.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_6_int = btn_Bottomthreedirectdouble_wan_6_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_6_int == -1) {
			btn_Bottomthreedirectdouble_wan_6.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_6.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_6_int = btn_Bottomthreedirectdouble_wan_6_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_7_int == 1) {
			btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_7.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_7_int = btn_Bottomthreedirectdouble_wan_7_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_7_int == -1) {
			btn_Bottomthreedirectdouble_wan_7.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_7.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_7_int = btn_Bottomthreedirectdouble_wan_7_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_8_int == 1) {
			btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_8.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_8_int = btn_Bottomthreedirectdouble_wan_8_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_8_int == -1) {
			btn_Bottomthreedirectdouble_wan_8.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_8.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_8_int = btn_Bottomthreedirectdouble_wan_8_int * -1;
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
		if (btn_Bottomthreedirectdouble_wan_9_int == 1) {
			btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_wan_9.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_wan_9_int = btn_Bottomthreedirectdouble_wan_9_int * -1;
		} else if (btn_Bottomthreedirectdouble_wan_9_int == -1) {
			btn_Bottomthreedirectdouble_wan_9.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_wan_9.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_wan_9_int = btn_Bottomthreedirectdouble_wan_9_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_0_int == 1) {
			btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_0.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_0_int = btn_Bottomthreedirectdouble_qian_0_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_0_int == -1) {
			btn_Bottomthreedirectdouble_qian_0.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_0.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_0_int = btn_Bottomthreedirectdouble_qian_0_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_1_int == 1) {
			btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_1.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_1_int = btn_Bottomthreedirectdouble_qian_1_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_1_int == -1) {
			btn_Bottomthreedirectdouble_qian_1.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_1.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_1_int = btn_Bottomthreedirectdouble_qian_1_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_2_int == 1) {
			btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_2.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_2_int = btn_Bottomthreedirectdouble_qian_2_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_2_int == -1) {
			btn_Bottomthreedirectdouble_qian_2.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_2.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_2_int = btn_Bottomthreedirectdouble_qian_2_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_3_int == 1) {
			btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_3.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_3_int = btn_Bottomthreedirectdouble_qian_3_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_3_int == -1) {
			btn_Bottomthreedirectdouble_qian_3.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_3.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_3_int = btn_Bottomthreedirectdouble_qian_3_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_4_int == 1) {
			btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_4.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_4_int = btn_Bottomthreedirectdouble_qian_4_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_4_int == -1) {
			btn_Bottomthreedirectdouble_qian_4.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_4.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_4_int = btn_Bottomthreedirectdouble_qian_4_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_5_int == 1) {
			btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_5.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_5_int = btn_Bottomthreedirectdouble_qian_5_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_5_int == -1) {
			btn_Bottomthreedirectdouble_qian_5.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_5.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_5_int = btn_Bottomthreedirectdouble_qian_5_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_6_int == 1) {
			btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_6.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_6_int = btn_Bottomthreedirectdouble_qian_6_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_6_int == -1) {
			btn_Bottomthreedirectdouble_qian_6.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_6.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_6_int = btn_Bottomthreedirectdouble_qian_6_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_7_int == 1) {
			btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_7.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_7_int = btn_Bottomthreedirectdouble_qian_7_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_7_int == -1) {
			btn_Bottomthreedirectdouble_qian_7.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_7.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_7_int = btn_Bottomthreedirectdouble_qian_7_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_8_int == 1) {
			btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_8.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_8_int = btn_Bottomthreedirectdouble_qian_8_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_8_int == -1) {
			btn_Bottomthreedirectdouble_qian_8.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_8.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_8_int = btn_Bottomthreedirectdouble_qian_8_int * -1;
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
		if (btn_Bottomthreedirectdouble_qian_9_int == 1) {
			btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_qian_9.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_qian_9_int = btn_Bottomthreedirectdouble_qian_9_int * -1;
		} else if (btn_Bottomthreedirectdouble_qian_9_int == -1) {
			btn_Bottomthreedirectdouble_qian_9.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_qian_9.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_qian_9_int = btn_Bottomthreedirectdouble_qian_9_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_0_int == 1) {
			btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_0.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_0_int = btn_Bottomthreedirectdouble_bai_0_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_0_int == -1) {
			btn_Bottomthreedirectdouble_bai_0.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_0.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_0_int = btn_Bottomthreedirectdouble_bai_0_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_1_int == 1) {
			btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_1.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_1_int = btn_Bottomthreedirectdouble_bai_1_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_1_int == -1) {
			btn_Bottomthreedirectdouble_bai_1.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_1.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_1_int = btn_Bottomthreedirectdouble_bai_1_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_2_int == 1) {
			btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_2.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_2_int = btn_Bottomthreedirectdouble_bai_2_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_2_int == -1) {
			btn_Bottomthreedirectdouble_bai_2.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_2.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_2_int = btn_Bottomthreedirectdouble_bai_2_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_3_int == 1) {
			btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_3.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_3_int = btn_Bottomthreedirectdouble_bai_3_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_3_int == -1) {
			btn_Bottomthreedirectdouble_bai_3.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_3.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_3_int = btn_Bottomthreedirectdouble_bai_3_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_4_int == 1) {
			btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_4.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_4_int = btn_Bottomthreedirectdouble_bai_4_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_4_int == -1) {
			btn_Bottomthreedirectdouble_bai_4.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_4.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_4_int = btn_Bottomthreedirectdouble_bai_4_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_5_int == 1) {
			btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_5.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_5_int = btn_Bottomthreedirectdouble_bai_5_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_5_int == -1) {
			btn_Bottomthreedirectdouble_bai_5.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_5.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_5_int = btn_Bottomthreedirectdouble_bai_5_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_6_int == 1) {
			btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_6.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_6_int = btn_Bottomthreedirectdouble_bai_6_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_6_int == -1) {
			btn_Bottomthreedirectdouble_bai_6.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_6.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_6_int = btn_Bottomthreedirectdouble_bai_6_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_7_int == 1) {
			btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_7.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_7_int = btn_Bottomthreedirectdouble_bai_7_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_7_int == -1) {
			btn_Bottomthreedirectdouble_bai_7.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_7.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_7_int = btn_Bottomthreedirectdouble_bai_7_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_8_int == 1) {
			btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_8.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_8_int = btn_Bottomthreedirectdouble_bai_8_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_8_int == -1) {
			btn_Bottomthreedirectdouble_bai_8.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_8.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_8_int = btn_Bottomthreedirectdouble_bai_8_int * -1;
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
		if (btn_Bottomthreedirectdouble_bai_9_int == 1) {
			btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.big_num_on);
			text_Bottomthreedirectdouble_bai_9.setTextColor(0xffffffff);
			btn_Bottomthreedirectdouble_bai_9_int = btn_Bottomthreedirectdouble_bai_9_int * -1;
		} else if (btn_Bottomthreedirectdouble_bai_9_int == -1) {
			btn_Bottomthreedirectdouble_bai_9.setBackgroundResource(R.drawable.round);
			text_Bottomthreedirectdouble_bai_9.setTextColor(0xffdedede);
			btn_Bottomthreedirectdouble_bai_9_int = btn_Bottomthreedirectdouble_bai_9_int * -1;
		}
		show(hundreds);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

}
