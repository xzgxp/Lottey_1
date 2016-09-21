package ticketpackage;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.GetChars;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

public class Twogroupbottomtwodouble extends BaseFragmentticket implements OnClickListener, OnTouchListener {
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
	private String TAG = "ghghg";
	private LinearLayout LinearLayout_123;
	private LinearLayout Lin_Twogroupbottomtwodouble_xuan_two;
	private LinearLayout Lin_Twogroupbottomtwodouble_xuan_one;
	private Button btn_Twogroupbottomtwodouble_xuan_0;
	private Button btn_Twogroupbottomtwodouble_xuan_1;
	private Button btn_Twogroupbottomtwodouble_xuan_2;
	private Button btn_Twogroupbottomtwodouble_xuan_3;
	private Button btn_Twogroupbottomtwodouble_xuan_4;
	private Button btn_Twogroupbottomtwodouble_xuan_5;
	private Button btn_Twogroupbottomtwodouble_xuan_6;
	private Button btn_Twogroupbottomtwodouble_xuan_7;
	private Button btn_Twogroupbottomtwodouble_xuan_8;
	private Button btn_Twogroupbottomtwodouble_xuan_9;
	private Button btn_Twogroupbottomtwodouble_xuan_big;
	private Button btn_Twogroupbottomtwodouble_xuan_little;
	private Button btn_Twogroupbottomtwodouble_xuan_all;
	private Button btn_Twogroupbottomtwodouble_xuan_odd;
	private Button btn_Twogroupbottomtwodouble_xuan_even;
	private Button btn_Twogroupbottomtwodouble_xuan_clear;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x0;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x1;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x2;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x3;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x4;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x5;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x6;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x7;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x8;
	private RelativeLayout btn_Twogroupbottomtwodouble_xuan_x9;
	private Integer btn_Twogroupbottomtwodouble_xuan_0_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_1_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_2_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_3_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_4_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_5_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_6_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_7_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_8_int = 1;
	private Integer btn_Twogroupbottomtwodouble_xuan_9_int = 1;
	private TextView text_Twogroupbottomtwodouble_xuan_0;
	private TextView text_Twogroupbottomtwodouble_xuan_1;
	private TextView text_Twogroupbottomtwodouble_xuan_2;
	private TextView text_Twogroupbottomtwodouble_xuan_3;
	private TextView text_Twogroupbottomtwodouble_xuan_4;
	private TextView text_Twogroupbottomtwodouble_xuan_5;
	private TextView text_Twogroupbottomtwodouble_xuan_6;
	private TextView text_Twogroupbottomtwodouble_xuan_7;
	private TextView text_Twogroupbottomtwodouble_xuan_8;
	private TextView text_Twogroupbottomtwodouble_xuan_9;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.ticket_two_group_bottomtwo_double, container, false);
		mMainActivity = (BaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		Lin_Twogroupbottomtwodouble_xuan_one = (LinearLayout) context
				.findViewById(R.id.Lin_Twogroupbottomtwodouble_xuan_one);
		Lin_Twogroupbottomtwodouble_xuan_two = (LinearLayout) context
				.findViewById(R.id.Lin_Twogroupbottomtwodouble_xuan_two);
		btn_Twogroupbottomtwodouble_xuan_0 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_0);
		btn_Twogroupbottomtwodouble_xuan_1 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_1);
		btn_Twogroupbottomtwodouble_xuan_2 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_2);
		btn_Twogroupbottomtwodouble_xuan_3 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_3);
		btn_Twogroupbottomtwodouble_xuan_4 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_4);
		btn_Twogroupbottomtwodouble_xuan_5 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_5);
		btn_Twogroupbottomtwodouble_xuan_6 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_6);
		btn_Twogroupbottomtwodouble_xuan_7 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_7);
		btn_Twogroupbottomtwodouble_xuan_8 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_8);
		btn_Twogroupbottomtwodouble_xuan_9 = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_9);
		btn_Twogroupbottomtwodouble_xuan_x0 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x0);
		btn_Twogroupbottomtwodouble_xuan_x1 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x1);
		btn_Twogroupbottomtwodouble_xuan_x2 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x2);
		btn_Twogroupbottomtwodouble_xuan_x3 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x3);
		btn_Twogroupbottomtwodouble_xuan_x4 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x4);
		btn_Twogroupbottomtwodouble_xuan_x5 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x5);
		btn_Twogroupbottomtwodouble_xuan_x6 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x6);
		btn_Twogroupbottomtwodouble_xuan_x7 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x7);
		btn_Twogroupbottomtwodouble_xuan_x8 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x8);
		btn_Twogroupbottomtwodouble_xuan_x9 = (RelativeLayout) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_x9);
		text_Twogroupbottomtwodouble_xuan_0 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_0);
		text_Twogroupbottomtwodouble_xuan_1 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_1);
		text_Twogroupbottomtwodouble_xuan_2 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_2);
		text_Twogroupbottomtwodouble_xuan_3 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_3);
		text_Twogroupbottomtwodouble_xuan_4 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_4);
		text_Twogroupbottomtwodouble_xuan_5 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_5);
		text_Twogroupbottomtwodouble_xuan_6 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_6);
		text_Twogroupbottomtwodouble_xuan_7 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_7);
		text_Twogroupbottomtwodouble_xuan_8 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_8);
		text_Twogroupbottomtwodouble_xuan_9 = (TextView) context.findViewById(R.id.text_Twogroupbottomtwodouble_xuan_9);
		btn_Twogroupbottomtwodouble_xuan_big = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_big);
		btn_Twogroupbottomtwodouble_xuan_little = (Button) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_little);
		btn_Twogroupbottomtwodouble_xuan_all = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_all);
		btn_Twogroupbottomtwodouble_xuan_odd = (Button) context.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_odd);
		btn_Twogroupbottomtwodouble_xuan_even = (Button) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_even);
		btn_Twogroupbottomtwodouble_xuan_clear = (Button) context
				.findViewById(R.id.btn_Twogroupbottomtwodouble_xuan_clear);

		btn_Twogroupbottomtwodouble_xuan_0.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_1.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_2.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_3.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_4.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_5.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_6.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_7.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_8.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_9.setOnTouchListener(this);
		btn_Twogroupbottomtwodouble_xuan_0.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_1.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_2.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_3.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_4.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_5.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_6.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_7.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_8.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_9.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_big.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_little.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_all.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_odd.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_even.setOnClickListener(this);
		btn_Twogroupbottomtwodouble_xuan_clear.setOnClickListener(this);
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
					getnumber_Twogroupbottomtwodouble_xuan_clear();
					// getnumber_Twogroupbottomtwodouble_qian_clear();
					// getnumber_Twogroupbottomtwodouble_bai_clear();
					// getnumber_Twogroupbottomtwodouble_shi_clear();
					// getnumber_Twogroupbottomtwodouble_ge_clear();
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
					getnumber_Twogroupbottomtwodouble_xuan_clear();
					// getnumber_Twogroupbottomtwodouble_qian_clear();
					// getnumber_Twogroupbottomtwodouble_bai_clear();
					// getnumber_Twogroupbottomtwodouble_shi_clear();
					// getnumber_Twogroupbottomtwodouble_ge_clear();
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
					getnumber_Twogroupbottomtwodouble_xuan_clear();
					// getnumber_Twogroupbottomtwodouble_qian_clear();
					// getnumber_Twogroupbottomtwodouble_bai_clear();
					// getnumber_Twogroupbottomtwodouble_shi_clear();
					// getnumber_Twogroupbottomtwodouble_ge_clear();
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
				getnumber_Twogroupbottomtwodouble_xuan_clear();
				getrand();
				for (int i = 0; i < 5; i++) {
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

		BaseActivityticket.curFragmentTag = getString(R.string.two_group_bottomtwo_double_name);
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
		getnumber_Twogroupbottomtwodouble_xuan_clear();
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
		case R.id.btn_Twogroupbottomtwodouble_xuan_big:
			clearxuan();

			btn_Twogroupbottomtwodouble_xuan_big.setTextColor(0xff000000);
			btn_Twogroupbottomtwodouble_xuan_big.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Twogroupbottomtwodouble_xuan_big();
			// RelativeLayout_addbasket.setBackgroundResource(R.drawable.yellow_button);
			// imagebtn_addbasket.setVisibility(View.VISIBLE);
			// LinearLayout_nochoose.setVisibility(View.GONE);
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_little:
			clearxuan();
			btn_Twogroupbottomtwodouble_xuan_little.setTextColor(0xff000000);
			btn_Twogroupbottomtwodouble_xuan_little.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Twogroupbottomtwodouble_xuan_little();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_all:
			clearxuan();
			btn_Twogroupbottomtwodouble_xuan_all.setTextColor(0xff000000);
			btn_Twogroupbottomtwodouble_xuan_all.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Twogroupbottomtwodouble_xuan_all();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_odd:
			clearxuan();
			btn_Twogroupbottomtwodouble_xuan_odd.setTextColor(0xff000000);
			btn_Twogroupbottomtwodouble_xuan_odd.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Twogroupbottomtwodouble_xuan_odd();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_even:
			clearxuan();
			btn_Twogroupbottomtwodouble_xuan_even.setTextColor(0xff000000);
			btn_Twogroupbottomtwodouble_xuan_even.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Twogroupbottomtwodouble_xuan_even();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_clear:
			clearxuan();
			btn_Twogroupbottomtwodouble_xuan_clear.setTextColor(0xff000000);
			btn_Twogroupbottomtwodouble_xuan_clear.setBackgroundResource(R.drawable.change);
			vibrator.vibrate(new long[] { 0, 100 }, -1);
			getnumber_Twogroupbottomtwodouble_xuan_clear();
			mMainActivity.getresultint(getresultint());
			mMainActivity.showresult(getresult());
			mMainActivity.getmoney();
			break;

		case R.id.btn_Twogroupbottomtwodouble_xuan_0:
			selectxuan0();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_1:
			selectxuan1();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_2:
			selectxuan2();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_3:
			selectxuan3();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_4:
			selectxuan4();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_5:
			selectxuan5();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_6:
			selectxuan6();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_7:
			selectxuan7();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_8:
			selectxuan8();
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_9:
			selectxuan9();
			break;

		default:
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_Twogroupbottomtwodouble_xuan_0:

			int actionTwogroupbottomtwodouble0 = event.getAction();
			if (actionTwogroupbottomtwodouble0 == MotionEvent.ACTION_DOWN) {
				Log.d("btn_1_1", "ACTION_DOWN");
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x0.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble0 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_UP");
			} else if (actionTwogroupbottomtwodouble0 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x0.setVisibility(View.INVISIBLE);
				Log.d("btn_1_1", "ACTION_CANCEL");
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_1:
			Log.d("btn_1_1", "fggdfgdfgdfgdgdfgdgd");
			int actionTwogroupbottomtwodouble1 = event.getAction();
			if (actionTwogroupbottomtwodouble1 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x1.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble1 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x1.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble1 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x1.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_2:
			int actionTwogroupbottomtwodouble2 = event.getAction();
			if (actionTwogroupbottomtwodouble2 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x2.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble2 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x2.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble2 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x2.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_3:
			int actionTwogroupbottomtwodouble3 = event.getAction();
			if (actionTwogroupbottomtwodouble3 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x3.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble3 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x3.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble3 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x3.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_4:
			int actionTwogroupbottomtwodouble4 = event.getAction();
			if (actionTwogroupbottomtwodouble4 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x4.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble4 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x4.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble4 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x4.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_5:
			int actionTwogroupbottomtwodouble5 = event.getAction();
			if (actionTwogroupbottomtwodouble5 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x5.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble5 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x5.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble5 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_one.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x5.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_6:
			Log.d("btn_1_1", "btn_Twogroupbottomtwodouble_xuan_6");
			int actionTwogroupbottomtwodouble6 = event.getAction();
			if (actionTwogroupbottomtwodouble6 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x6.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble6 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x6.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble6 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x6.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_7:
			int actionTwogroupbottomtwodouble7 = event.getAction();
			if (actionTwogroupbottomtwodouble7 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x7.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble7 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x7.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble7 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x7.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_8:
			int actionTwogroupbottomtwodouble8 = event.getAction();
			if (actionTwogroupbottomtwodouble8 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x8.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble8 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x8.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble8 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x8.setVisibility(View.INVISIBLE);
			}
			break;
		case R.id.btn_Twogroupbottomtwodouble_xuan_9:
			int actionTwogroupbottomtwodouble9 = event.getAction();
			if (actionTwogroupbottomtwodouble9 == MotionEvent.ACTION_DOWN) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.VISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x9.setVisibility(View.VISIBLE);
			} else if (actionTwogroupbottomtwodouble9 == MotionEvent.ACTION_UP) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x9.setVisibility(View.INVISIBLE);
			} else if (actionTwogroupbottomtwodouble9 == MotionEvent.ACTION_CANCEL) {
				Lin_Twogroupbottomtwodouble_xuan_two.setVisibility(View.INVISIBLE);
				btn_Twogroupbottomtwodouble_xuan_x9.setVisibility(View.INVISIBLE);
			}
			break;

		default:
			break;
		}
		return false;
	}

	private void getnumber_Twogroupbottomtwodouble_xuan_big() {
		// TODO Auto-generated method stub
		btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffffffff);
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

		btn_Twogroupbottomtwodouble_xuan_0_int = 1;
		btn_Twogroupbottomtwodouble_xuan_1_int = 1;
		btn_Twogroupbottomtwodouble_xuan_2_int = 1;
		btn_Twogroupbottomtwodouble_xuan_3_int = 1;
		btn_Twogroupbottomtwodouble_xuan_4_int = 1;
		btn_Twogroupbottomtwodouble_xuan_5_int = -1;
		btn_Twogroupbottomtwodouble_xuan_6_int = -1;
		btn_Twogroupbottomtwodouble_xuan_7_int = -1;
		btn_Twogroupbottomtwodouble_xuan_8_int = -1;
		btn_Twogroupbottomtwodouble_xuan_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Twogroupbottomtwodouble_xuan_little() {
		btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffdedede);
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
		btn_Twogroupbottomtwodouble_xuan_5_int = 1;
		btn_Twogroupbottomtwodouble_xuan_6_int = 1;
		btn_Twogroupbottomtwodouble_xuan_7_int = 1;
		btn_Twogroupbottomtwodouble_xuan_8_int = 1;
		btn_Twogroupbottomtwodouble_xuan_9_int = 1;
		btn_Twogroupbottomtwodouble_xuan_0_int = -1;
		btn_Twogroupbottomtwodouble_xuan_1_int = -1;
		btn_Twogroupbottomtwodouble_xuan_2_int = -1;
		btn_Twogroupbottomtwodouble_xuan_3_int = -1;
		btn_Twogroupbottomtwodouble_xuan_4_int = -1;

		show(myriabit);
	}

	private void getnumber_Twogroupbottomtwodouble_xuan_all() {
		btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffffffff);
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
		btn_Twogroupbottomtwodouble_xuan_0_int = -1;
		btn_Twogroupbottomtwodouble_xuan_1_int = -1;
		btn_Twogroupbottomtwodouble_xuan_2_int = -1;
		btn_Twogroupbottomtwodouble_xuan_3_int = -1;
		btn_Twogroupbottomtwodouble_xuan_4_int = -1;
		btn_Twogroupbottomtwodouble_xuan_5_int = -1;
		btn_Twogroupbottomtwodouble_xuan_6_int = -1;
		btn_Twogroupbottomtwodouble_xuan_7_int = -1;
		btn_Twogroupbottomtwodouble_xuan_8_int = -1;
		btn_Twogroupbottomtwodouble_xuan_9_int = -1;

		show(myriabit);
	}

	private void getnumber_Twogroupbottomtwodouble_xuan_odd() {
		btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffffffff);
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

		btn_Twogroupbottomtwodouble_xuan_0_int = 1;
		btn_Twogroupbottomtwodouble_xuan_2_int = 1;
		btn_Twogroupbottomtwodouble_xuan_4_int = 1;
		btn_Twogroupbottomtwodouble_xuan_6_int = 1;
		btn_Twogroupbottomtwodouble_xuan_8_int = 1;
		btn_Twogroupbottomtwodouble_xuan_1_int = -1;
		btn_Twogroupbottomtwodouble_xuan_3_int = -1;
		btn_Twogroupbottomtwodouble_xuan_5_int = -1;
		btn_Twogroupbottomtwodouble_xuan_7_int = -1;
		btn_Twogroupbottomtwodouble_xuan_9_int = -1;
		show(myriabit);
	}

	private void getnumber_Twogroupbottomtwodouble_xuan_even() {
		btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.big_num_on);
		btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.big_num_on);
		text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffffffff);
		text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffffffff);
		btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.round);
		btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffdedede);
		text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffdedede);
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
		btn_Twogroupbottomtwodouble_xuan_1_int = 1;
		btn_Twogroupbottomtwodouble_xuan_3_int = 1;
		btn_Twogroupbottomtwodouble_xuan_5_int = 1;
		btn_Twogroupbottomtwodouble_xuan_7_int = 1;
		btn_Twogroupbottomtwodouble_xuan_9_int = 1;
		btn_Twogroupbottomtwodouble_xuan_0_int = -1;
		btn_Twogroupbottomtwodouble_xuan_2_int = -1;
		btn_Twogroupbottomtwodouble_xuan_4_int = -1;
		btn_Twogroupbottomtwodouble_xuan_6_int = -1;
		btn_Twogroupbottomtwodouble_xuan_8_int = -1;

		show(myriabit);
	}

	private void getnumber_Twogroupbottomtwodouble_xuan_clear() {
		btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffdedede);
		btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.round);
		text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffdedede);
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
		btn_Twogroupbottomtwodouble_xuan_0_int = 1;
		btn_Twogroupbottomtwodouble_xuan_1_int = 1;
		btn_Twogroupbottomtwodouble_xuan_2_int = 1;
		btn_Twogroupbottomtwodouble_xuan_3_int = 1;
		btn_Twogroupbottomtwodouble_xuan_4_int = 1;
		btn_Twogroupbottomtwodouble_xuan_5_int = 1;
		btn_Twogroupbottomtwodouble_xuan_6_int = 1;
		btn_Twogroupbottomtwodouble_xuan_7_int = 1;
		btn_Twogroupbottomtwodouble_xuan_8_int = 1;
		btn_Twogroupbottomtwodouble_xuan_9_int = 1;
		show(myriabit);
	}

	private void clearxuan() {
		// TODO Auto-generated method stub
		btn_Twogroupbottomtwodouble_xuan_big.setBackgroundResource(0);
		btn_Twogroupbottomtwodouble_xuan_little.setBackgroundResource(0);
		btn_Twogroupbottomtwodouble_xuan_all.setBackgroundResource(0);
		btn_Twogroupbottomtwodouble_xuan_odd.setBackgroundResource(0);
		btn_Twogroupbottomtwodouble_xuan_even.setBackgroundResource(0);
		btn_Twogroupbottomtwodouble_xuan_clear.setBackgroundResource(0);
		btn_Twogroupbottomtwodouble_xuan_big.setTextColor(0xffcfcfcf);
		btn_Twogroupbottomtwodouble_xuan_little.setTextColor(0xffcfcfcf);
		btn_Twogroupbottomtwodouble_xuan_all.setTextColor(0xffcfcfcf);
		btn_Twogroupbottomtwodouble_xuan_odd.setTextColor(0xffcfcfcf);
		btn_Twogroupbottomtwodouble_xuan_even.setTextColor(0xffcfcfcf);
		btn_Twogroupbottomtwodouble_xuan_clear.setTextColor(0xffcfcfcf);

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

		result = result1.length();
		if (result >= 2) {
			result = combination(result, 2);
		} else {
			result = 0;
		}
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
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[0] = changestatus(myriabit[0]);
		if (btn_Twogroupbottomtwodouble_xuan_0_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_0_int = btn_Twogroupbottomtwodouble_xuan_0_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_0_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_0.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_0.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_0_int = btn_Twogroupbottomtwodouble_xuan_0_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan1() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[1] = changestatus(myriabit[1]);
		if (btn_Twogroupbottomtwodouble_xuan_1_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_1_int = btn_Twogroupbottomtwodouble_xuan_1_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_1_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_1.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_1.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_1_int = btn_Twogroupbottomtwodouble_xuan_1_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan2() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[2] = changestatus(myriabit[2]);
		if (btn_Twogroupbottomtwodouble_xuan_2_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_2_int = btn_Twogroupbottomtwodouble_xuan_2_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_2_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_2.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_2.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_2_int = btn_Twogroupbottomtwodouble_xuan_2_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan3() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[3] = changestatus(myriabit[3]);
		if (btn_Twogroupbottomtwodouble_xuan_3_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_3_int = btn_Twogroupbottomtwodouble_xuan_3_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_3_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_3.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_3.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_3_int = btn_Twogroupbottomtwodouble_xuan_3_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan4() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[4] = changestatus(myriabit[4]);
		if (btn_Twogroupbottomtwodouble_xuan_4_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_4_int = btn_Twogroupbottomtwodouble_xuan_4_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_4_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_4.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_4.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_4_int = btn_Twogroupbottomtwodouble_xuan_4_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan5() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[5] = changestatus(myriabit[5]);
		if (btn_Twogroupbottomtwodouble_xuan_5_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_5_int = btn_Twogroupbottomtwodouble_xuan_5_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_5_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_5.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_5.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_5_int = btn_Twogroupbottomtwodouble_xuan_5_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan6() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[6] = changestatus(myriabit[6]);
		if (btn_Twogroupbottomtwodouble_xuan_6_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_6_int = btn_Twogroupbottomtwodouble_xuan_6_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_6_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_6.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_6.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_6_int = btn_Twogroupbottomtwodouble_xuan_6_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan7() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[7] = changestatus(myriabit[7]);
		if (btn_Twogroupbottomtwodouble_xuan_7_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_7_int = btn_Twogroupbottomtwodouble_xuan_7_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_7_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_7.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_7.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_7_int = btn_Twogroupbottomtwodouble_xuan_7_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan8() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[8] = changestatus(myriabit[8]);
		if (btn_Twogroupbottomtwodouble_xuan_8_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_8_int = btn_Twogroupbottomtwodouble_xuan_8_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_8_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_8.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_8.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_8_int = btn_Twogroupbottomtwodouble_xuan_8_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void selectxuan9() {
		clearxuan();
		vibrator.vibrate(new long[] { 0, 100 }, -1);
		myriabit[9] = changestatus(myriabit[9]);
		if (btn_Twogroupbottomtwodouble_xuan_9_int == 1) {
			btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.big_num_on);
			text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffffffff);
			btn_Twogroupbottomtwodouble_xuan_9_int = btn_Twogroupbottomtwodouble_xuan_9_int * -1;
		} else if (btn_Twogroupbottomtwodouble_xuan_9_int == -1) {
			btn_Twogroupbottomtwodouble_xuan_9.setBackgroundResource(R.drawable.round);
			text_Twogroupbottomtwodouble_xuan_9.setTextColor(0xffdedede);
			btn_Twogroupbottomtwodouble_xuan_9_int = btn_Twogroupbottomtwodouble_xuan_9_int * -1;
		}
		show(myriabit);
		mMainActivity.getresultint(getresultint());
		mMainActivity.showresult(getresult());
		mMainActivity.getmoney();
	}

	public void getrand() {
		int randtemp = (int) (Math.random() * 10);
		rand[0] = randtemp;
		for (int i = 1; i < 2; i++) {
			randtemp = (int) (Math.random() * 10);
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
