package fourteen;

import com.example.lottery.R;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import dialog.dialogone;
import ticketpackage.BaseActivityticket;
import ticketpackage.BaseFragmentticket;

public class Topthreemixgroup extends BaseFragmentticket implements OnClickListener {

	private BaseActivityticket mMainActivity;
	EditText edit_number;
	Button btn_qingkong;
	Button btn_quchong;
	private String edit_text = "";
	private String result = "";

	private LinearLayout LinearLayout_ischoose;
	private LinearLayout LinearLayout_numberbasket;
	ImageButton imagebtn_addbasket;
	private int geshu = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		BaseActivityticket.curFragmentTag = getString(R.string.topthree_mix_group_name);
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e("TAG", "onStart----->");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.e("TAG", "onActivityCreated-------");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e("TAG", "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e("TAG", "onStop");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.e("TAG", "ondestoryView");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e("TAG", "ondestory");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.d("TAG", "onDetach------");

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.ticket_topthree_mix_group, container, false);
		mMainActivity = (BaseActivityticket) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();
		edit_number = (EditText) context.findViewById(R.id.edit_number);
		btn_qingkong = (Button) context.findViewById(R.id.btn_qingkong);
		btn_quchong = (Button) context.findViewById(R.id.btn_quchong);

		LinearLayout_ischoose = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_ischoose);
		LinearLayout_ischoose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// String temptext = getresult(numbertext);
				// number = getresultint(temptext);
				// Log.e("number", "" + getresultint(temptext));

				mMainActivity.LinearLayout_ischooseonclick();
				String temotext = result;
				mMainActivity.getresultint(geshu);
				mMainActivity.showresult(temotext);
				if (geshu != 0) {
					// getnumber_bottom_two_direct_double_qian_clear();
					// getnumber_bottom_two_direct_double_bai_clear();
					// getnumber_bottom_two_direct_double_shi_clear();
					// getnumber_bottom_two_direct_double_ge_clear();
					edit_number.setText("");
				}
			}
		});
		LinearLayout_numberbasket = (LinearLayout) getActivity().findViewById(R.id.LinearLayout_numberbasket);
		LinearLayout_numberbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// String temptext = getresult(numbertext);
				// number = getresultint(temptext);
				// Log.e("number", "" + getresultint(temptext));

				mMainActivity.LinearLayout_numberbasketonclick();
				String temotext = result;
				mMainActivity.getresultint(geshu);
				mMainActivity.showresult(temotext);
				if (geshu != 0) {
					// getnumber_bottom_two_direct_double_qian_clear();
					// getnumber_bottom_two_direct_double_bai_clear();
					edit_number.setText(""); //
					// getnumber_bottom_two_direct_double_shi_clear();
					// getnumber_bottom_two_direct_double_ge_clear();
				}
			}
		});
		imagebtn_addbasket = (ImageButton) getActivity().findViewById(R.id.imagebtn_addbasket);
		imagebtn_addbasket.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// String temptext = getresult(numbertext);
				// number = getresultint(temptext);
				// Log.e("number", "" + getresultint(temptext));

				mMainActivity.imagebtn_addbasketonclick();
				String temotext = result;
				mMainActivity.getresultint(geshu);
				mMainActivity.showresult(temotext);
				if (geshu != 0) {
					// getnumber_bottom_two_direct_double_qian_clear();
					// getnumber_bottom_two_direct_double_bai_clear();
					edit_number.setText(""); //
					// getnumber_bottom_two_direct_double_shi_clear();
					// getnumber_bottom_two_direct_double_ge_clear();
				}
			}
		});

		edit_number.addTextChangedListener(textWatcher);
		btn_quchong.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				result = clearother(edit_text);
				Log.e("result", result);
				result = splitstring(result);	result = Standardiazation(result);
				edit_number.setText(result);
			}
		});
		btn_qingkong.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				edit_number.setText("");
			}
		});
		return context;
	}

	// 将分隔符转换成空格
	private String changetospace(String s) {
		String[] temp = s.split("");
		String result = "";
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(",") || temp[i].equals(";") || temp[i].equals("，") || temp[i].equals("；")
					|| temp[i].equals("\n")) {
				temp[i] = " ";
			}
			result = result + temp[i];
		}
		return result;

	}

	// 去除空格
	private String clearspace(String s) {
		String[] temp = s.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(" ")) {
				temp[i] = "";
			}
			s = s + temp[i];
		}
		return s;
	}

	// 提示信息
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

	// 判断字符串是否无其他字符,并去除其他字符
	private String clearother(String s) {
		String clearstring = "";
		String[] temp = s.split("");
		Log.e("temp", temp[0]);
		for (int i = 0; i < temp.length; i++) {
			if ((temp[i].equals("0") || temp[i].equals("1") || temp[i].equals("2") || temp[i].equals("3")
					|| temp[i].equals("4") || temp[i].equals("5") || temp[i].equals("6") || temp[i].equals("7")
					|| temp[i].equals("8") || temp[i].equals("9") || temp[i].equals(" ") || temp[i].equals("")
					|| temp[i].equals(";") || temp[i].equals(",") || temp[i].equals("；") || temp[i].equals("，")
					|| temp[i].equals("\n")) == false) {
				showAlertDialog("只能输入数字或空格");
				temp[i] = "";
			}
			Log.e("tempi", temp[i]);
			clearstring = clearstring + temp[i];
			Log.e(clearstring, clearstring);
		}
		return clearstring;
	}

	// 转换成符合投注规则的字符
	private String Standardiazation(String s) {
		Log.e("tag", s);
		String[] temp = s.split(" ");
		String standarstring = "";
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].length() != 3) {
				temp[i] = "";
			} else {
				temp[i] = temp[i] + " ";
			}
			if (i >= 1) { // 去除重复的投注号码
				for (int j = 0; j < i; j++) {
					if (temp[i].equals(temp[j])) {
						temp[i] = "";
						break;
					}
				}
			}

			if (temp[i].length() == 4) { // 判断是否有字符重复
				Log.e("qq", temp[i]);
				String tmp0 = temp[i].charAt(0) + "";
				String tmp1 = temp[i].charAt(1) + "";
				String tmp2 = temp[i].charAt(2) + "";
				if (tmp0.equals(tmp1) && tmp0.equals(tmp2)) {
					temp[i] = "";
				}

			}

			standarstring = standarstring + temp[i];
		}
		Log.e("stabdarstring", "" + standarstring.length());
		if (standarstring.length() > 0 && standarstring.charAt(standarstring.length() - 1) == ' ') {
			String test = standarstring;
			standarstring = "";
			for (int i = 0; i < test.length() - 1; i++) {
				standarstring = standarstring + test.charAt(i);
			}
			Log.e("sub", standarstring + "11");
		}

		return standarstring;

	}

	// 获得投注注数
	private int getgeshu(String s) {
		int geshu = 0;
		String[] temp = s.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].length() == 3) {
				geshu = geshu + 1;
			}
		}
		return geshu;
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

	// 监听edit_text的变化
	private TextWatcher textWatcher = new TextWatcher() {

		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count) {
			edit_text = edit_number.getText().toString();
			Log.e("edit_text1", edit_text);
			edit_text = changetospace(edit_text);
			Log.e("edit_text2", edit_text);
			result = clearother(edit_text);
			Log.e("result", result);
			result = splitstring(result);
			result = Standardiazation(result);
			geshu = getgeshu(result);
			mMainActivity.getresultint(geshu); // 传入注数
			mMainActivity.showresult(result); // 传入投注号码

		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			// TODO Auto-generated method stub

		}

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub

		}
	};

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
