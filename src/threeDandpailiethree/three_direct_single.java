package threeDandpailiethree;

import com.example.lottery.R;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import dialog.dialogone;
import android.view.View.OnClickListener;

public class three_direct_single extends threeDBaseFragmentticket implements OnClickListener {
	private threeDBaseActivityticket mMainActivity;
	private EditText edit_number;
	private Button btn_quchong;
	private Button btn_qingkong;
	private String numbertext = "";
	private String TAG = "ghghg";
	private LinearLayout LinearLayout_rocknumber;
	private ImageButton imagebtn_addbasket;
	private LinearLayout LinearLayout_ischoose;
	private LinearLayout LinearLayout_numberbasket;
	private int number = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.d_three_direct_single, container, false);
		mMainActivity = (threeDBaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		btn_qingkong = (Button) context.findViewById(R.id.btn_qingkong);
		btn_quchong = (Button) context.findViewById(R.id.btn_quchong);
		edit_number = (EditText) context.findViewById(R.id.edit_number);
		LinearLayout_rocknumber = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_rocknumber);
		LinearLayout_rocknumber.setVisibility(View.GONE);
		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// String temptext = getresult(numbertext);
				// number = getresultint(temptext);
				// Log.e("number", "" + getresultint(temptext));

				mMainActivity.LinearLayout_ischooseonclick();
				String temotext = getresult(numbertext);
				mMainActivity.getresultint(getresultint(temotext));
				mMainActivity.showresult(temotext);
				if (number != 0) {
					// getnumber_bottom_two_direct_double_qian_clear();
					// getnumber_bottom_two_direct_double_bai_clear();
					// getnumber_bottom_two_direct_double_shi_clear();
					// getnumber_bottom_two_direct_double_ge_clear();
					edit_number.setText("");
				}
			}
		});
		LinearLayout_numberbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// String temptext = getresult(numbertext);
				// number = getresultint(temptext);
				// Log.e("number", "" + getresultint(temptext));

				mMainActivity.LinearLayout_numberbasketonclick();
				String temotext = getresult(numbertext);
				mMainActivity.getresultint(getresultint(temotext));
				mMainActivity.showresult(temotext);
				if (number != 0) {
					// getnumber_bottom_two_direct_double_qian_clear();
					// getnumber_bottom_two_direct_double_bai_clear();
					edit_number.setText(""); //
					// getnumber_bottom_two_direct_double_shi_clear();
					// getnumber_bottom_two_direct_double_ge_clear();
				}
			}
		});
		imagebtn_addbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// String temptext = getresult(numbertext);
				// number = getresultint(temptext);
				// Log.e("number", "" + getresultint(temptext));

				mMainActivity.imagebtn_addbasketonclick();
				String temotext = getresult(numbertext);
				mMainActivity.getresultint(getresultint(temotext));
				mMainActivity.showresult(temotext);
				if (number != 0) {
					// getnumber_bottom_two_direct_double_qian_clear();
					// getnumber_bottom_two_direct_double_bai_clear();
					edit_number.setText(""); //
					// getnumber_bottom_two_direct_double_shi_clear();
					// getnumber_bottom_two_direct_double_ge_clear();
				}
			}
		});
		btn_qingkong.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				edit_number.setText("");
			}
		});
		btn_quchong.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				numbertext = edit_number.getText().toString();

				String temotext = getresult(numbertext);
				edit_number.setText(temotext);
			}
		});
		edit_number.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				numbertext = edit_number.getText().toString();

				String temotext = getresult(numbertext);
				mMainActivity.getresultint(getresultint(temotext));
				mMainActivity.showresult(temotext);

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub

			}
		});
		return context;

		// tickettype_list = (ListView)
		// getActivity().findViewById(R.id.tickettype_list);
	}

	protected String getresult(String numbertext2) {
		// TODO Auto-generated method stub
		String result = "";
		numbertext2 = changeotherletter(numbertext2);
		if (!isallnumber(numbertext2)) {
			showAlertDialog("只能输入数字或空格");
		} else {
			numbertext2 = splitstring(numbertext2);
			result = deletekongge(numbertext2);
			result = getstanardnumber(result);
			result = deletekongge(result);
		}
		return result;
	}

	private String splitstring(String str) {
		// TODO Auto-generated method stub
		String temp[] = str.split(" ");
		String result = "";
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].length() == 6) {
				String tempsingle[] = temp[i].split("");
				temp[i] = tempsingle[0] + tempsingle[1] + tempsingle[2] + tempsingle[3] + " " + tempsingle[4]
						+ tempsingle[5] + tempsingle[6];
			}
			result = result + temp[i] + " ";
		}
		return result;
	}

	private String getstanardnumber(String result1) {
		// TODO Auto-generated method stub
		String result = "";
		String temp[] = result1.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (!(temp[i].length() == 3)) {
				temp[i] = "";
			} else {
				for (int j = 0; j < i; j++) {
					if (temp[j].equals(temp[i])) {
						temp[i] = "";
					}
				}
			}
		}
		for (int i = 0; i < temp.length - 1; i++) {
			result = result + temp[i] + " ";
		}
		result = result + temp[temp.length - 1];
		return result;
	}

	private String changeotherletter(String numbertext2) {
		// TODO Auto-generated method stub
		String result = "";
		String temp[] = numbertext2.split("");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(",") || temp[i].equals(";") || temp[i].equals("，") || temp[i].equals("；")
					|| temp[i].equals("\n")) {
				temp[i] = " ";
			}
			result = result + temp[i];
		}

		return result;
	}

	private String deletekongge(String numbertext2) {
		// TODO Auto-generated method stub
		String temp[] = numbertext2.split("");
		int tempbefore = 0;
		int tempafter = 0;
		temp[0] = " ";
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(" ")) {
				if (tempbefore == 0) {
					temp[i] = "";
				} else {
					tempbefore = 0;
				}
			} else {
				tempbefore = 1;
			}
		}
		for (int i = temp.length - 1; i >= 0; i--) {
			if (temp[i].equals(" ")) {
				if (tempafter == 0) {
					temp[i] = "";
				} else {
					tempafter = 0;
				}
			} else {
				tempafter = 1;
			}
		}
		String result = "";
		for (int i = 0; i < temp.length; i++) {
			result = result + temp[i];
		}
		return result;
	}

	private boolean isallnumber(String numbertext2) {
		// TODO Auto-generated method stub
		String temp[] = numbertext2.split("");
		int tempint = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals("0") || temp[i].equals("1") || temp[i].equals("2") || temp[i].equals("3")
					|| temp[i].equals("4") || temp[i].equals("5") || temp[i].equals("6") || temp[i].equals("7")
					|| temp[i].equals("8") || temp[i].equals("9") || temp[i].equals(" ") || temp[i].equals("")
					|| temp[i].equals("\n")) {

			} else {
				tempint = tempint + 1;
			}
		}
		if (tempint == 0) {
			return true;
		} else {
			return false;
		}

	}

	protected int getresultint(String text) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (text.length() == 0) {
			return 0;
		} else {
			number = 0;
			String temp[] = text.split(" ");
			int tempresult = 0;
			for (int i = 0; i < temp.length; i++) {
				tempresult++;
			}
			number = temp.length;
			return temp.length;
		}
	}

	public void showAlertDialog(String str) {

		dialogone.Builder builder = new dialogone.Builder(getActivity());
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

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		threeDBaseActivityticket.curFragmentTag = getString(R.string.three_direct_single_name);
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

	}

}
