package ticketpackage;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
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

import adapter.deleteadapter;
import adapter.numberbasketlistdapter;
import adapter.numberbasketlistdapter.Callback;
import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils.SimpleStringSplitter;
import android.transition.ChangeBounds;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import dialog.dialogone;
import dialog.dialogtwo;
import model.numberbasketmodel;
import model.ticketinfo;
import other.loginpassword;

//hgkjhj
public class numberbasket extends Activity implements OnItemClickListener, Callback {
	private SharedPreferences cookiesdetail;
	private SharedPreferences userinfo;
	private SharedPreferences nowdata;
	private String cookies;
	private int ifsend = 1;
	private double moshi = 1;
	private int deleteint = -1;
	private int zero = 0;
	private String statue = "0";
	private String err = "0";
	private int toast = 0;
	private int[] rand = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	private ListView numberbasket_list;
	private numberbasketlistdapter mAdapter;
	private TextView numberlist_tickettype;
	private String[] ticketnumber;
	private String[] tickettype;
	private int[] numberofticket;
	private int tickettypecode;
	private int numberposition;
	private String tj_tickettype = "天津时时彩", jx_tickettype = "江西时时彩", xj_tickettype = "新疆时时彩", cq_tickettype = "重庆时时彩";
	private LinearLayout LinearLayout_sendnumber;
	private LinearLayout LinearLayout_list_back;
	private LinearLayout LinearLayout_change;
	private LinearLayout LinearLayout_select_one;
	private LinearLayout LinearLayout_select_five;
	private LinearLayout LinearLayout_select_goon;
	private EditText EditText_times;
	private EditText EditText_expect;
	private TextView TextView_yue;
	private TextView TextView_pay;
	private TextView TextView_change;
	private String temptickettype;
	private int zhu = 0;
	private int times = 1;
	private int expect = 1;
	private double nowmoney = 0;
	private double sscrmbmoney = 0;
	private String tempticketname;
	private String tempticketgroup = "20151023008";
	private LinearLayout lin_loading;
	private String nowno = "20151030096";
	private String yue = "000";
	private String username = "";
	private String rmb = "";
	private String sscrmb = "";
	private Spinner moshi_spinner;
	private String strmoshi = "元模式";
	private int moshifirst = 0;
	private String SscReturn = "";
	private String getSscReturn = "";
	private double SscReturnresult = 0.0;
	private String Shiyi5Rmb = "0.0";
	private String Shiyi5Return = "0.0";
	private String DipinRmb = "0.0";
	private String DipinReturn = "0.0";
	private ArrayAdapter<CharSequence> moshi_adapter;
	ArrayList nameValuePairs1 = new ArrayList();

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			showAlertDialog();
		}
		return false;
	}

	private Handler uiHandler = new Handler() {
		@Override
		public void handleMessage(Message msg1) {
			switch (msg1.what) {
			case 1:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "yjygj");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				goshow();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			case 2:
				System.out.println("handleMessage thread id " + Thread.currentThread().getId());
				System.out.println("msg.arg1:" + "hjj6666");
				System.out.println("msg.arg2:" + msg1.arg2);
				// goshowload();
				go();
				// address.this.statusTextView.setText("文件下载完成");
				break;
			}
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_numberbasket);
		nowdata = getSharedPreferences("nowdata", Context.MODE_PRIVATE);
		userinfo = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
		cookiesdetail = getSharedPreferences("cookies", Context.MODE_PRIVATE);
		lin_loading = (LinearLayout) findViewById(R.id.lin_loading);
		lin_loading.setVisibility(View.GONE);
		LinearLayout_list_back = (LinearLayout) findViewById(R.id.LinearLayout_list_back);
		LinearLayout_change = (LinearLayout) findViewById(R.id.LinearLayout_change);
		LinearLayout_select_one = (LinearLayout) findViewById(R.id.LinearLayout_select_one);
		LinearLayout_select_five = (LinearLayout) findViewById(R.id.LinearLayout_select_five);
		LinearLayout_select_goon = (LinearLayout) findViewById(R.id.LinearLayout_select_goon);
		EditText_times = (EditText) findViewById(R.id.EditText_times);
		EditText_expect = (EditText) findViewById(R.id.EditText_expect);
		TextView_yue = (TextView) findViewById(R.id.TextView_yue);
		TextView_pay = (TextView) findViewById(R.id.TextView_pay);
		LinearLayout_sendnumber = (LinearLayout) findViewById(R.id.LinearLayout_sendnumber);
		numberbasket_list = (ListView) findViewById(R.id.numberbasket_list);
		numberbasket_list.setOnItemClickListener(this);
		TextView_change = (TextView) findViewById(R.id.TextView_change);
		numberlist_tickettype = (TextView) findViewById(R.id.numberlist_tickettype);
		Intent intent = this.getIntent(); // 获取已有的intent对象
		Bundle bundle = intent.getExtras(); // 获取intent里面的bundle对象
		ticketnumber = bundle.getStringArray("ticketnumber");
		tickettype = bundle.getStringArray("tickettype");
		numberofticket = bundle.getIntArray("numberofticket");
		numberposition = bundle.getInt("numberposition");
		tickettypecode = bundle.getInt("tickettypecode");
		nowno = bundle.getString("nowno");

		nowno = nowdata.getString("nowdata", nowno);
		yue = userinfo.getString("sscrmb", "000");
		getSscReturn = userinfo.getString("SscReturn", "000");
		SscReturnresult = Double.valueOf(getSscReturn);
		sscrmbmoney = Double.valueOf(yue);
		TextView_yue.setText(yue + "元");
		temptickettype = tickettype[numberposition - 1];
		if (tickettypecode == 1) {
			tempticketname = tj_tickettype;
			numberlist_tickettype.setText(tj_tickettype);
		} else if (tickettypecode == 2) {
			tempticketname = xj_tickettype;
			numberlist_tickettype.setText(xj_tickettype);
		} else if (tickettypecode == 3) {
			tempticketname = jx_tickettype;
			numberlist_tickettype.setText(jx_tickettype);
		} else if (tickettypecode == 4) {
			tempticketname = cq_tickettype;
			numberlist_tickettype.setText(cq_tickettype);
		}
		showadapter();
		LinearLayout_list_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showAlertDialog();
			}
		});
		moshi_spinner = (Spinner) findViewById(R.id.moshi_spinner);

		moshi_adapter = ArrayAdapter.createFromResource(this, R.array.moshi, android.R.layout.simple_spinner_item);
		moshi_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		moshi_spinner.setAdapter(moshi_adapter);
		getnew();
		// Stasttime();
		moshi_spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				strmoshi = moshi_spinner.getSelectedItem().toString();

				if (strmoshi.equals("元模式")) {
					// toast = 0;
					moshi = 1;
				} else if (strmoshi.equals("角模式")) {
					// toast = 0;
					moshi = 0.1;
				} else if (strmoshi.equals("分模式")) {
					// toast = 0;
					moshi = 0.01;
				} else {
					// toast = 0;
					moshi = 0.001;
				}
				if (moshifirst == 0) {
					moshifirst = 1;
				} else {
					toast = 0;
					moshifirst = 1;
				}
				showadapter();
				showbottomtext();
				// display.setText(strProvince+"-"+strCity+"-"+strCounty);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}

		});
		LinearLayout_change.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub
				if (deleteint == -1) {
					// toast = 0;
					TextView_change.setText("完成");
				} else {
					// toast = 0;
					TextView_change.setText("编辑");
				}
				toast = 0;
				deleteint = deleteint * -1;
				showadapter();
			}

		});
		EditText_times.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				boolean isNum = EditText_times.getText().toString().matches("[0-9]+");

				if (isNum) {
					Log.d("EditText_times", EditText_times.getText().toString());
					toast = 0;
					times = Integer.parseInt(EditText_times.getText().toString());
					// Integer.toString(x);
					Log.d("times", times + "");

				} else {
					times = 1;
					toast = 0; // Integer.toString(x);
					Log.d("times", times + "");
				}
				showadapter();
				showbottomtext();
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
		EditText_expect.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub

				boolean isNum = EditText_expect.getText().toString().matches("[0-9]+");
				if (isNum) {
					int temp;
					toast = 0;
					Log.d("EditText_expect", EditText_expect.getText().toString());
					temp = Integer.parseInt(EditText_expect.getText().toString());
					// Integer.toString(x);
					if (temp < 41) {
						expect = temp;
					} else {
						expect = 40;
						EditText_expect.setText(expect + "");
					}
					Log.d("expect", expect + "");

				} else {
					expect = 1;
					toast = 0; // Integer.toString(x);
					Log.d("expect", expect + "");
				}
				showbottomtext();
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
		// edit1_.addTextChangedListener(new TextWatcher() {
		//
		// @Override
		// public void onTextChanged(CharSequence s, int start, int before, int
		// count) {
		// /*++ 文本每次改变就会跑这个方法 ++*/
		// if(null != text_){
		// text_.setText("您正在输入......\n当前光标处在第 " + start
		// +" 个位置\n您选择处理了 " + before + " 个字符\n您这次输入的词语有 "
		// + count + " 个字符");
		// }
		//
		// });
		LinearLayout_select_one.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showAlertDialogselectone();
				toast = 0;
			}
		});
		LinearLayout_select_five.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				toast = 0;
				showAlertDialogselectfive();

			}
		});
		LinearLayout_select_goon.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showAlertDialog();
				toast = 0;
			}
		});
		LinearLayout_sendnumber.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				toast = 0;
				getnew();
				nowno = nowdata.getString("nowdata", nowno);
				if (sscrmbmoney >= nowmoney) {
					//
					lin_loading.setVisibility(View.VISIBLE);
					int a = getnoint();
					if (tickettypecode == 1 && a > 84) {
						Toast.makeText(numberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else if (tickettypecode == 2 && a > 96) {
						Toast.makeText(numberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else if (tickettypecode == 3 && a > 84) {
						Toast.makeText(numberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else if (tickettypecode == 4 && a > 120) {
						Toast.makeText(numberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else {
						sendnumber();
					}
				} else {
					// toast = 0;
					getmoney();
				}
				// TODO Auto-generated method stub
				// Intent intent = new Intent(BaseActivityticket.this,
				// numberbasket.class);

			}

			private int getnoint() {
				// TODO Auto-generated method stub
				String t[] = nowno.split("");
				// toast = 0;
				String stri = t[9] + t[10] + t[11];
				int s = Integer.parseInt(stri);
				s = s + expect - 1;
				return s;
			}
		});
		numberbasket_list.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Log.d("fgfdghd", "fhdhgh");
			}
		});

	}

	private List<numberbasketmodel> getData() {
		List<numberbasketmodel> list = new ArrayList<numberbasketmodel>();
		zero = 0;
		for (int i = 0; i < numberposition; i++) {
			Log.e("log_tag", "ismethis");
			numberbasketmodel numberbasketmodelinfo = new numberbasketmodel();
			numberbasketmodelinfo.setNumber(ticketnumber[i]);
			numberbasketmodelinfo.setTickettype(tickettype[i]);
			numberbasketmodelinfo.setNumberofticket(numberofticket[i]);
			numberbasketmodelinfo.setDeleteint(deleteint);
			numberbasketmodelinfo.setZero(0);
			numberbasketmodelinfo.setClearint(0);
			numberbasketmodelinfo.setMoshi(moshi);
			numberbasketmodelinfo.setTimes(times);
			list.add(numberbasketmodelinfo);
			Log.e("log_tag", "ismefour");
			zero++;
		}
		numberbasketmodel numberbasketmodelinfo = new numberbasketmodel();
		numberbasketmodelinfo.setNumber("");
		numberbasketmodelinfo.setTickettype("");
		numberbasketmodelinfo.setNumberofticket(0);
		numberbasketmodelinfo.setClearint(1);
		numberbasketmodelinfo.setDeleteint(deleteint);
		numberbasketmodelinfo.setZero(zero);
		list.add(numberbasketmodelinfo);
		return list;
	}

	public void showadapter() {
		mAdapter = new numberbasketlistdapter(this, getData(), this);
		numberbasket_list.setAdapter(mAdapter);
		showbottomtext();
	}

	private void showbottomtext() {
		zhu = 0;
		for (int i = 0; i < numberposition; i++) {
			zhu = numberofticket[i] + zhu;
		}
		nowmoney = zhu * times * expect * 2 * moshi;
		DecimalFormat df = new DecimalFormat("0.0000");
		String str = df.format(nowmoney);
		if (nowmoney <= sscrmbmoney) {
			// TextView_pay.setText(
			// zhu + "注x" + times + "倍x" + expect + "期x" + moshi + "=" + zhu *
			// times * expect * 2 * moshi + "元");
			TextView_pay.setText(zhu + "注x" + times + "倍x" + expect + "期x" + moshi + "=" + str + "元");
		} else {
			getmoney();
			TextView_pay.setText(zhu + "注x" + times + "倍x" + expect + "期x" + moshi + "=" + str + "元");
		}

	}

	private String getBottompthreegroupsixsingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		while (second == first) {
			second = (int) (Math.random() * 10);
		}
		int third = (int) (Math.random() * 10);
		while (third == second || third == first) {
			third = (int) (Math.random() * 10);
		}
		String getbottompthreegroupsixsingle = first + "" + second + "" + third;
		return getbottompthreegroupsixsingle;
	}

	private String getBottompthreegroupthreesingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		while ((first != second && first != third && second != third) || (first == second && first == third)) {
			first = (int) (Math.random() * 10);
			second = (int) (Math.random() * 10);
			third = (int) (Math.random() * 10);
		}
		String getbottompthreegroupthreesingle = first + "" + second + "" + third;
		return getbottompthreegroupthreesingle;
	}

	private String getBottompthreemixgroup() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		String getbottompthreemixgroup = first + "" + second + "" + third;
		return getbottompthreemixgroup;
	}

	private String getBottomthreedirectsingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		String getbottomthreedirectsingle = first + "" + second + "" + third;
		return getbottomthreedirectsingle;
	}

	private String getFivedirectsingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		int fourth = (int) (Math.random() * 10);
		int fifth = (int) (Math.random() * 10);
		String getfivedirectsingle = first + "" + second + "" + third + "" + fourth + "" + fifth;
		return getfivedirectsingle;
	}

	private String getFourdirectsingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		int fourth = (int) (Math.random() * 10);
		String getfourdirectsingle = first + "" + second + "" + third + "" + fourth;
		return getfourdirectsingle;
	}

	private String getTopthreedirectsingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		String gettopthreedirectsingle = first + "" + second + "" + third;
		return gettopthreedirectsingle;
	}

	private String getTopthreegroupsixsingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		while (second == first) {
			second = (int) (Math.random() * 10);
		}
		int third = (int) (Math.random() * 10);
		while (third == second || third == first) {
			third = (int) (Math.random() * 10);
		}
		String gettopthreegroupsixsingle = first + "" + second + "" + third;
		return gettopthreegroupsixsingle;
	}

	private String getTopthreegroupthreesingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		while ((first != second && first != third && second != third) || (first == second && first == third)) {
			first = (int) (Math.random() * 10);
			second = (int) (Math.random() * 10);
			third = (int) (Math.random() * 10);
		}
		String gettopthreegroupthreesingle = first + "" + second + "" + third;
		return gettopthreegroupthreesingle;
	}

	private String getTopthreemixgroup() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		int third = (int) (Math.random() * 10);
		String gettopthreemixgroup = first + "" + second + "" + third;
		return gettopthreemixgroup;
	}

	private String getTwodirectbottomtwosingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		String gettwodirectbottomtwosingle = first + "" + second;
		return gettwodirectbottomtwosingle;
	}

	private String getTwodirecttoptwosingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		String gettwodirecttoptwosingle = first + "" + second;
		return gettwodirecttoptwosingle;
	}

	private String getTwogroupbottomtwosingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		String gettwogroupbottomtwosingle = first + "" + second;
		return gettwogroupbottomtwosingle;
	}

	private String getTwogrouptoptwosingle() {
		int first = (int) (Math.random() * 10);
		int second = (int) (Math.random() * 10);
		String gettwogrouptoptwosingle = first + "" + second;
		return gettwogrouptoptwosingle;
	}

	private String getFivedirectdouble() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String getFivedirectdouble = wan + "|" + qian + "|" + bai + "|" + shi + "|" + ge;
		return getFivedirectdouble;
	}

	private String getFixedposition() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int x = (int) (Math.random() * 5);
		String getFixedposition = null;
		if (x == 0) {
			getFixedposition = wan + "," + "" + "," + "" + "," + "" + "," + "";
		} else if (x == 1) {
			getFixedposition = "" + "," + wan + "," + "" + "," + "" + "," + "";
		} else if (x == 2) {
			getFixedposition = "" + "," + "" + "," + wan + "," + "" + "," + "";
		} else if (x == 3) {
			getFixedposition = "" + "," + "" + "," + "" + "," + wan + "," + "";
		} else if (x == 4) {
			getFixedposition = "" + "," + "" + "," + "" + "," + "" + "," + wan;
		}

		return getFixedposition;
	}

	private String getTwodirecttoptwodouble() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String getTwodirecttoptwodouble = wan + "|" + qian;
		return getTwodirecttoptwodouble;
	}

	private String getTwodirectbottomtwodouble() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String getTwodirectbottomtwodouble = wan + "|" + qian;
		return getTwodirectbottomtwodouble;
	}

	private String getMaxminbottomtwo() {
		String result2 = "";
		String result1 = "";
		// TODO Auto-generated method stub
		int i = (int) (Math.random() * 3);
		int qian = (int) (Math.random() * 3);
		if (i == 0) {
			result2 = result2 + "大";
		} else if (i == 1) {
			result2 = result2 + "小";
		} else if (i == 2) {
			result2 = result2 + "单";
		} else if (i == 3) {
			result2 = result2 + "双";
		}
		if (qian == 0) {
			result1 = result1 + "大";
		} else if (qian == 1) {
			result1 = result1 + "小";
		} else if (qian == 2) {
			result1 = result1 + "单";
		} else if (qian == 3) {
			result1 = result1 + "双";
		}
		String getMaxminbottomtwo = result2 + "|" + result1;
		return getMaxminbottomtwo;
	}

	private String getMaxmintoptwo() {
		String result2 = "";
		String result1 = "";
		// TODO Auto-generated method stub
		int i = (int) (Math.random() * 3);
		int qian = (int) (Math.random() * 3);
		if (i == 0) {
			result2 = result2 + "大";
		} else if (i == 1) {
			result2 = result2 + "小";
		} else if (i == 2) {
			result2 = result2 + "单";
		} else if (i == 3) {
			result2 = result2 + "双";
		}
		if (qian == 0) {
			result1 = result1 + "大";
		} else if (qian == 1) {
			result1 = result1 + "小";
		} else if (qian == 2) {
			result1 = result1 + "单";
		} else if (qian == 3) {
			result1 = result1 + "双";
		}
		String getMaxmintoptwo = result2 + "|" + result1;
		return getMaxmintoptwo;
	}

	private String getFivegroup120() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivegroup120 = rand[0] + "" + rand[1] + "" + rand[2] + "" + rand[3] + "" + rand[4];
		return getFivegroup120;
	}

	private String getThreebottomthreeonenotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getThreebottomthreeonenotposition = rand[0] + "";
		return getThreebottomthreeonenotposition;
	}

	private String getThreebottomthreetwonotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getThreebottomthreetwonotposition = rand[0] + "" + rand[1];
		return getThreebottomthreetwonotposition;
	}

	private String getFivebottomfivethreenotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivebottomfivethreenotposition = rand[0] + "" + rand[1] + "" + rand[2];
		return getFivebottomfivethreenotposition;
	}

	private String getFivebottomfivetwonotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivebottomfivetwonotposition = rand[0] + "" + rand[1];
		return getFivebottomfivetwonotposition;
	}

	private String getFourbottomfourtwonotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFourbottomfourtwonotposition = rand[0] + "" + rand[1];
		return getFourbottomfourtwonotposition;
	}

	private String getFourbottomfouronenotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFourbottomfouronenotposition = rand[0] + "";
		return getFourbottomfouronenotposition;
	}

	private String getThreetopthreetwonotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getThreetopthreetwonotposition = rand[0] + "" + rand[1];
		return getThreetopthreetwonotposition;
	}

	private String getThreetopthreeonenotposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getThreetopthreeonenotposition = rand[0] + "";
		return getThreetopthreeonenotposition;
	}

	private String getTwogroupbottomtwodouble() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTwogroupbottomtwodouble = rand[0] + "" + rand[1];
		return getTwogroupbottomtwodouble;
	}

	private String getTwogrouptoptwodouble() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTwogrouptoptwodouble = rand[0] + "" + rand[1];
		return getTwogrouptoptwodouble;
	}

	private String getFivegroup60() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivegroup60 = rand[0] + "|" + rand[1] + "" + rand[2] + "" + rand[3];
		return getFivegroup60;
	}

	private String getFivegroup30() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivegroup30 = rand[0] + "" + rand[1] + "|" + rand[2];
		return getFivegroup30;
	}

	private String getFivegroup20() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivegroup20 = rand[0] + "|" + rand[1] + "" + rand[2];
		return getFivegroup20;
	}

	private String getFivegroup10() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivegroup10 = rand[0] + "|" + rand[1];
		return getFivegroup10;
	}

	private String getFivegroup5() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFivegroup5 = rand[0] + "|" + rand[1];
		return getFivegroup5;
	}

	private String getFourdirectdouble() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String getFourdirectdouble = qian + "|" + bai + "|" + shi + "|" + ge;
		return getFourdirectdouble;
	}

	private String getFourgroup24() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFourgroup24 = rand[0] + "" + rand[1] + "" + rand[2] + "" + rand[3];
		return getFourgroup24;
	}

	private String getFourgroup12() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFourgroup12 = rand[0] + "|" + rand[1] + "" + rand[2];
		return getFourgroup12;
	}

	private String getFourgroup6() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFourgroup6 = rand[0] + "" + rand[1];
		return getFourgroup6;
	}

	private String getFourgroup4() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getFourgroup4 = rand[0] + "|" + rand[1];
		return getFourgroup4;
	}

	private String getTopthreedirectdouble() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String getFivedirectdouble = wan + "|" + qian + "|" + bai;
		return getFivedirectdouble;
	}

	private String getMaxminbottomthree() {
		// TODO Auto-generated method stub
		String result1 = "";
		String result2 = "";
		String result3 = "";
		int wan = (int) (Math.random() * 3);
		int qian = (int) (Math.random() * 3);
		int bai = (int) (Math.random() * 3);
		if (wan == 0) {
			result2 = result2 + "大";
		} else if (wan == 1) {
			result2 = result2 + "小";
		} else if (wan == 2) {
			result2 = result2 + "单";
		} else if (wan == 3) {
			result2 = result2 + "双";
		}
		if (qian == 0) {
			result1 = result1 + "大";
		} else if (qian == 1) {
			result1 = result1 + "小";
		} else if (qian == 2) {
			result1 = result1 + "单";
		} else if (qian == 3) {
			result1 = result1 + "双";
		}
		if (bai == 0) {
			result3 = result3 + "大";
		} else if (bai == 1) {
			result3 = result3 + "小";
		} else if (bai == 2) {
			result3 = result3 + "单";
		} else if (bai == 3) {
			result3 = result3 + "双";
		}
		String getFivedirectdouble = result1 + "|" + result2 + "|" + result3;
		return getFivedirectdouble;
	}

	private String getMaxmintopthree() {
		// TODO Auto-generated method stub
		String result1 = "";
		String result2 = "";
		String result3 = "";
		int wan = (int) (Math.random() * 3);
		int qian = (int) (Math.random() * 3);
		int bai = (int) (Math.random() * 3);
		if (wan == 0) {
			result2 = result2 + "大";
		} else if (wan == 1) {
			result2 = result2 + "小";
		} else if (wan == 2) {
			result2 = result2 + "单";
		} else if (wan == 3) {
			result2 = result2 + "双";
		}
		if (qian == 0) {
			result1 = result1 + "大";
		} else if (qian == 1) {
			result1 = result1 + "小";
		} else if (qian == 2) {
			result1 = result1 + "单";
		} else if (qian == 3) {
			result1 = result1 + "双";
		}
		if (bai == 0) {
			result3 = result3 + "大";
		} else if (bai == 1) {
			result3 = result3 + "小";
		} else if (bai == 2) {
			result3 = result3 + "单";
		} else if (bai == 3) {
			result3 = result3 + "双";
		}
		String getFivedirectdouble = result1 + "|" + result2 + "|" + result3;
		return getFivedirectdouble;
	}

	private String getBottomthreedirectdouble() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String getFivedirectdouble = wan + "|" + qian + "|" + bai;
		return getFivedirectdouble;
	}

	private String getTopthreegroup3() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTopthreegroup3 = rand[0] + "" + rand[1];
		return getTopthreegroup3;
	}

	private String getBottomthreegroup3() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getBottomthreegroup3 = rand[0] + "" + rand[1];
		return getBottomthreegroup3;
	}

	private String getTopthreegroup6() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTopthreegroup6 = rand[0] + "" + rand[1] + "" + rand[2];
		return getTopthreegroup6;
	}

	private String getBottomthreegroup6() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getBottomthreegroup6 = rand[0] + "" + rand[1] + "" + rand[2];
		return getBottomthreegroup6;
	}

	private int getTopthreegroupsum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 25) + 1;
		return getTopthreegroup6;
	}

	private int getTopthreegroupsumint(int ago) {
		int getTopthreegroupsumint = 0;
		switch (ago) {
		case 0:
			getTopthreegroupsumint = getTopthreegroupsumint + 0;
			break;
		case 1:
			getTopthreegroupsumint = getTopthreegroupsumint + 1;
			break;
		case 2:
			getTopthreegroupsumint = getTopthreegroupsumint + 2;
			break;
		case 3:
			getTopthreegroupsumint = getTopthreegroupsumint + 2;
			break;
		case 4:
			getTopthreegroupsumint = getTopthreegroupsumint + 4;
			break;
		case 5:
			getTopthreegroupsumint = getTopthreegroupsumint + 5;
			break;
		case 6:
			getTopthreegroupsumint = getTopthreegroupsumint + 6;
			break;
		case 7:
			getTopthreegroupsumint = getTopthreegroupsumint + 8;
			break;
		case 8:
			getTopthreegroupsumint = getTopthreegroupsumint + 10;
			break;
		case 9:
			getTopthreegroupsumint = getTopthreegroupsumint + 11;
			break;
		case 10:
			getTopthreegroupsumint = getTopthreegroupsumint + 13;
			break;
		case 11:
			getTopthreegroupsumint = getTopthreegroupsumint + 14;
			break;
		case 12:
			getTopthreegroupsumint = getTopthreegroupsumint + 14;
			break;
		case 13:
			getTopthreegroupsumint = getTopthreegroupsumint + 15;
			break;
		case 14:
			getTopthreegroupsumint = getTopthreegroupsumint + 15;
			break;
		case 15:
			getTopthreegroupsumint = getTopthreegroupsumint + 14;
			break;
		case 16:
			getTopthreegroupsumint = getTopthreegroupsumint + 14;
			break;
		case 17:
			getTopthreegroupsumint = getTopthreegroupsumint + 13;
			break;
		case 18:
			getTopthreegroupsumint = getTopthreegroupsumint + 11;
			break;
		case 19:
			getTopthreegroupsumint = getTopthreegroupsumint + 10;
			break;
		case 20:
			getTopthreegroupsumint = getTopthreegroupsumint + 8;
			break;
		case 21:
			getTopthreegroupsumint = getTopthreegroupsumint + 6;
			break;
		case 22:
			getTopthreegroupsumint = getTopthreegroupsumint + 5;
			break;
		case 23:
			getTopthreegroupsumint = getTopthreegroupsumint + 4;
			break;
		case 24:
			getTopthreegroupsumint = getTopthreegroupsumint + 2;
			break;
		case 25:
			getTopthreegroupsumint = getTopthreegroupsumint + 2;
			break;
		case 26:
			getTopthreegroupsumint = getTopthreegroupsumint + 1;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTopthreegroupsumint;
	}

	private int getBottomthreegroupsum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 25) + 1;
		return getTopthreegroup6;
	}

	private int getBottomthreegroupsumint(int ago) {
		int getBottomthreegroupsumint = 0;
		switch (ago) {
		case 0:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 0;
			break;
		case 1:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 1;
			break;
		case 2:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 2;
			break;
		case 3:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 2;
			break;
		case 4:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 4;
			break;
		case 5:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 5;
			break;
		case 6:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 6;
			break;
		case 7:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 8;
			break;
		case 8:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 10;
			break;
		case 9:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 11;
			break;
		case 10:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 13;
			break;
		case 11:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 14;
			break;
		case 12:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 14;
			break;
		case 13:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 15;
			break;
		case 14:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 15;
			break;
		case 15:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 14;
			break;
		case 16:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 14;
			break;
		case 17:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 13;
			break;
		case 18:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 11;
			break;
		case 19:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 10;
			break;
		case 20:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 8;
			break;
		case 21:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 6;
			break;
		case 22:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 5;
			break;
		case 23:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 4;
			break;
		case 24:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 2;
			break;
		case 25:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 2;
			break;
		case 26:
			getBottomthreegroupsumint = getBottomthreegroupsumint + 1;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getBottomthreegroupsumint;
	}

	private int getTopthreedirectsum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 27);
		return getTopthreegroup6;
	}

	private int getTopthreedirectsumint(int ago) {
		int getTopthreedirectsumint = 0;
		switch (ago) {
		case 0:
			getTopthreedirectsumint = getTopthreedirectsumint + 1;
			break;
		case 1:
			getTopthreedirectsumint = getTopthreedirectsumint + 3;
			break;
		case 2:
			getTopthreedirectsumint = getTopthreedirectsumint + 6;
			break;
		case 3:
			getTopthreedirectsumint = getTopthreedirectsumint + 10;
			break;
		case 4:
			getTopthreedirectsumint = getTopthreedirectsumint + 15;
			break;
		case 5:
			getTopthreedirectsumint = getTopthreedirectsumint + 21;
			break;
		case 6:
			getTopthreedirectsumint = getTopthreedirectsumint + 28;
			break;
		case 7:
			getTopthreedirectsumint = getTopthreedirectsumint + 36;
			break;
		case 8:
			getTopthreedirectsumint = getTopthreedirectsumint + 45;
			break;
		case 9:
			getTopthreedirectsumint = getTopthreedirectsumint + 55;
			break;
		case 10:
			getTopthreedirectsumint = getTopthreedirectsumint + 63;
			break;
		case 11:
			getTopthreedirectsumint = getTopthreedirectsumint + 69;
			break;
		case 12:
			getTopthreedirectsumint = getTopthreedirectsumint + 73;
			break;
		case 13:
			getTopthreedirectsumint = getTopthreedirectsumint + 75;
			break;
		case 14:
			getTopthreedirectsumint = getTopthreedirectsumint + 75;
			break;
		case 15:
			getTopthreedirectsumint = getTopthreedirectsumint + 73;
			break;
		case 16:
			getTopthreedirectsumint = getTopthreedirectsumint + 69;
			break;
		case 17:
			getTopthreedirectsumint = getTopthreedirectsumint + 63;
			break;
		case 18:
			getTopthreedirectsumint = getTopthreedirectsumint + 55;
			break;
		case 19:
			getTopthreedirectsumint = getTopthreedirectsumint + 45;
			break;
		case 20:
			getTopthreedirectsumint = getTopthreedirectsumint + 36;
			break;
		case 21:
			getTopthreedirectsumint = getTopthreedirectsumint + 28;
			break;
		case 22:
			getTopthreedirectsumint = getTopthreedirectsumint + 21;
			break;
		case 23:
			getTopthreedirectsumint = getTopthreedirectsumint + 15;
			break;
		case 24:
			getTopthreedirectsumint = getTopthreedirectsumint + 10;
			break;
		case 25:
			getTopthreedirectsumint = getTopthreedirectsumint + 6;
			break;
		case 26:
			getTopthreedirectsumint = getTopthreedirectsumint + 3;
			break;
		case 27:
			getTopthreedirectsumint = getTopthreedirectsumint + 1;
			break;
		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTopthreedirectsumint;
	}

	private int getTwodirectbottomtwosum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 18);
		return getTopthreegroup6;
	}

	private int getTwodirectbottomtwosumint(int ago) {
		int getTwodirectbottomtwosumint = 0;
		switch (ago) {
		case 0:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 1;
			break;
		case 1:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 2;
			break;
		case 2:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 3;
			break;
		case 3:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 4;
			break;
		case 4:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 5;
			break;
		case 5:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 6;
			break;
		case 6:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 7;
			break;
		case 7:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 8;
			break;
		case 8:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 9;
			break;
		case 9:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 10;
			break;
		case 10:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 9;
			break;
		case 11:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 8;
			break;
		case 12:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 7;
			break;
		case 13:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 6;
			break;
		case 14:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 5;
			break;
		case 15:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 4;
			break;
		case 16:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 3;
			break;
		case 17:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 2;
			break;
		case 18:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 1;
			break;
		case 19:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 10;
			break;
		case 20:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 8;
			break;
		case 21:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 6;
			break;
		case 22:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 5;
			break;
		case 23:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 4;
			break;
		case 24:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 2;
			break;
		case 25:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 2;
			break;
		case 26:
			getTwodirectbottomtwosumint = getTwodirectbottomtwosumint + 1;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTwodirectbottomtwosumint;
	}

	private int getTwodirecttoptwosum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 18);
		return getTopthreegroup6;
	}

	private int getTwodirecttoptwosumint(int ago) {
		int getTwodirecttoptwosumint = 0;
		switch (ago) {
		case 0:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 1;
			break;
		case 1:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 2;
			break;
		case 2:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 3;
			break;
		case 3:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 4;
			break;
		case 4:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 5;
			break;
		case 5:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 6;
			break;
		case 6:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 7;
			break;
		case 7:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 8;
			break;
		case 8:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 9;
			break;
		case 9:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 10;
			break;
		case 10:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 9;
			break;
		case 11:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 8;
			break;
		case 12:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 7;
			break;
		case 13:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 6;
			break;
		case 14:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 5;
			break;
		case 15:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 4;
			break;
		case 16:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 3;
			break;
		case 17:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 2;
			break;
		case 18:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 1;
			break;
		case 19:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 10;
			break;
		case 20:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 8;
			break;
		case 21:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 6;
			break;
		case 22:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 5;
			break;
		case 23:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 4;
			break;
		case 24:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 2;
			break;
		case 25:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 2;
			break;
		case 26:
			getTwodirecttoptwosumint = getTwodirecttoptwosumint + 1;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTwodirecttoptwosumint;
	}

	private int getTwogroupbottomtwosum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 16) + 1;
		return getTopthreegroup6;
	}

	private int getTwogroupbottomtwosumint(int ago) {
		int getTwogroupbottomtwosumint = 0;
		switch (ago) {
		case 0:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 0;
			break;
		case 1:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 1;
			break;
		case 2:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 1;
			break;
		case 3:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 2;
			break;
		case 4:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 2;
			break;
		case 5:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 3;
			break;
		case 6:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 3;
			break;
		case 7:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 4;
			break;
		case 8:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 4;
			break;
		case 9:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 5;
			break;
		case 10:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 4;
			break;
		case 11:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 4;
			break;
		case 12:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 3;
			break;
		case 13:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 3;
			break;
		case 14:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 2;
			break;
		case 15:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 2;
			break;
		case 16:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 1;
			break;
		case 17:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 1;
			break;
		case 18:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 11;
			break;
		case 19:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 10;
			break;
		case 20:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 8;
			break;
		case 21:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 6;
			break;
		case 22:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 5;
			break;
		case 23:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 4;
			break;
		case 24:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 2;
			break;
		case 25:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 2;
			break;
		case 26:
			getTwogroupbottomtwosumint = getTwogroupbottomtwosumint + 1;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTwogroupbottomtwosumint;
	}

	private int getTwogrouptoptwosum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 16) + 1;
		return getTopthreegroup6;
	}

	private int getTwogrouptoptwosumint(int ago) {
		int getTwogrouptoptwosumint = 0;
		switch (ago) {
		case 0:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 0;
			break;
		case 1:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 1;
			break;
		case 2:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 1;
			break;
		case 3:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 2;
			break;
		case 4:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 2;
			break;
		case 5:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 3;
			break;
		case 6:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 3;
			break;
		case 7:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 4;
			break;
		case 8:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 4;
			break;
		case 9:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 5;
			break;
		case 10:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 4;
			break;
		case 11:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 4;
			break;
		case 12:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 3;
			break;
		case 13:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 3;
			break;
		case 14:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 2;
			break;
		case 15:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 2;
			break;
		case 16:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 1;
			break;
		case 17:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 1;
			break;
		case 18:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 11;
			break;
		case 19:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 10;
			break;
		case 20:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 8;
			break;
		case 21:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 6;
			break;
		case 22:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 5;
			break;
		case 23:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 4;
			break;
		case 24:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 2;
			break;
		case 25:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 2;
			break;
		case 26:
			getTwogrouptoptwosumint = getTwogrouptoptwosumint + 1;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTwogrouptoptwosumint;
	}

	private int getBottomthreedirectsum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = (int) (Math.random() * 27);
		return getTopthreegroup6;
	}

	private int getBottomthreedirectsumint(int ago) {
		int getBottomthreedirectsumint = 0;
		switch (ago) {
		case 0:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 1;
			break;
		case 1:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 3;
			break;
		case 2:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 6;
			break;
		case 3:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 10;
			break;
		case 4:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 15;
			break;
		case 5:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 21;
			break;
		case 6:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 28;
			break;
		case 7:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 36;
			break;
		case 8:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 45;
			break;
		case 9:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 55;
			break;
		case 10:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 63;
			break;
		case 11:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 69;
			break;
		case 12:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 73;
			break;
		case 13:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 75;
			break;
		case 14:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 75;
			break;
		case 15:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 73;
			break;
		case 16:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 69;
			break;
		case 17:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 63;
			break;
		case 18:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 55;
			break;
		case 19:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 45;
			break;
		case 20:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 36;
			break;
		case 21:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 28;
			break;
		case 22:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 21;
			break;
		case 23:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 15;
			break;
		case 24:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 10;
			break;
		case 25:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 6;
			break;
		case 26:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 3;
			break;
		case 27:
			getBottomthreedirectsumint = getBottomthreedirectsumint + 1;
			break;
		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getBottomthreedirectsumint;
	}

	private String getTopthreegroupcontainer() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTopthreegroupcontainer = rand[0] + "";
		return getTopthreegroupcontainer;
	}

	private String getTwogrouptoptwocontainer() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTwogrouptoptwocontainer = rand[0] + "";
		return getTwogrouptoptwocontainer;
	}

	private String getTwogroupbottomtwocontainer() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTwogroupbottomtwocontainer = rand[0] + "";
		return getTwogroupbottomtwocontainer;
	}

	private String getBottomthreegroupcontainer() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getBottomthreegroupcontainer = rand[0] + "";
		return getBottomthreegroupcontainer;
	}

	private String getTopthreesumend() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getTopthreesumend = rand[0] + "";
		return getTopthreesumend;
	}

	private String getBottomthreesumend() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getBottomthreesumend = rand[0] + "";
		return getBottomthreesumend;
	}

	private int getTopthreedirectspan() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = rand[0];
		return getTopthreegroup6;
	}

	private int getTopthreedirectspanint(int ago) {
		int getTopthreedirectspanint = 0;
		switch (ago) {
		case 0:
			getTopthreedirectspanint = getTopthreedirectspanint + 10;
			break;
		case 1:
			getTopthreedirectspanint = getTopthreedirectspanint + 54;
			break;
		case 2:
			getTopthreedirectspanint = getTopthreedirectspanint + 96;
			break;
		case 3:
			getTopthreedirectspanint = getTopthreedirectspanint + 126;
			break;
		case 4:
			getTopthreedirectspanint = getTopthreedirectspanint + 144;
			break;
		case 5:
			getTopthreedirectspanint = getTopthreedirectspanint + 150;
			break;
		case 6:
			getTopthreedirectspanint = getTopthreedirectspanint + 144;
			break;
		case 7:
			getTopthreedirectspanint = getTopthreedirectspanint + 126;
			break;
		case 8:
			getTopthreedirectspanint = getTopthreedirectspanint + 96;
			break;
		case 9:
			getTopthreedirectspanint = getTopthreedirectspanint + 54;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTopthreedirectspanint;
	}

	private int getTwodirectbottomtwospan() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = rand[0];
		return getTopthreegroup6;
	}

	private int getTwodirectbottomtwospanint(int ago) {
		int getTwodirectbottomtwospanint = 0;
		switch (ago) {
		case 0:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 10;
			break;
		case 1:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 18;
			break;
		case 2:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 16;
			break;
		case 3:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 14;
			break;
		case 4:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 12;
			break;
		case 5:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 10;
			break;
		case 6:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 8;
			break;
		case 7:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 6;
			break;
		case 8:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 4;
			break;
		case 9:
			getTwodirectbottomtwospanint = getTwodirectbottomtwospanint + 2;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTwodirectbottomtwospanint;
	}

	private int getTwodirecttoptwospan() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = rand[0];
		return getTopthreegroup6;
	}

	private int getTwodirecttoptwospanint(int ago) {
		int getTwodirecttoptwospanint = 0;
		switch (ago) {
		case 0:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 10;
			break;
		case 1:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 18;
			break;
		case 2:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 16;
			break;
		case 3:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 14;
			break;
		case 4:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 12;
			break;
		case 5:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 10;
			break;
		case 6:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 8;
			break;
		case 7:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 6;
			break;
		case 8:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 4;
			break;
		case 9:
			getTwodirecttoptwospanint = getTwodirecttoptwospanint + 2;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getTwodirecttoptwospanint;
	}

	private int getBottomthreedirectspan() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getTopthreegroup6 = rand[0];
		return getTopthreegroup6;
	}

	private int getBottomthreedirectspanint(int ago) {
		int getBottomthreedirectspanint = 0;
		switch (ago) {
		case 0:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 10;
			break;
		case 1:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 54;
			break;
		case 2:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 96;
			break;
		case 3:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 126;
			break;
		case 4:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 144;
			break;
		case 5:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 150;
			break;
		case 6:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 144;
			break;
		case 7:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 126;
			break;
		case 8:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 96;
			break;
		case 9:
			getBottomthreedirectspanint = getBottomthreedirectspanint + 54;
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);

		return getBottomthreedirectspanint;
	}

	public void showAlertDialog() {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage("您的操作将会取消当前追号方案");
		builder.setTitle("提示");
		builder.setPositiveButton("知道了", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				Intent intent = new Intent();
				// intent.putExtra("otherneed",
				// text_otherneed.getText().toString());
				intent.putExtra("numberposition", numberposition);
				intent.putExtra("numberofticket", numberofticket);
				intent.putExtra("ticketnumber", ticketnumber); // 装入数据
				intent.putExtra("tickettype", tickettype); // 装入数据
				setResult(0, intent);
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

	public void showAlertDialogselectone() {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage("您的操作将会取消当前追号方案");
		builder.setTitle("提示");
		builder.setPositiveButton("知道了", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				if (temptickettype.equals("五星直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivedirectdouble();
				} else if (temptickettype.equals("定位胆")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFixedposition();
				} else if (temptickettype.equals("后二直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwodirectbottomtwodouble();
				} else if (temptickettype.equals("后二大小单双")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getMaxminbottomtwo();
				} else if (temptickettype.equals("前二大小单双")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getMaxmintoptwo();
				} else if (temptickettype.equals("前二直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwodirecttoptwodouble();
				} else if (temptickettype.equals("五星组选120")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivegroup120();
				} else if (temptickettype.equals("后三一码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getThreebottomthreeonenotposition();
				} else if (temptickettype.equals("后三二码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getThreebottomthreetwonotposition();
				} else if (temptickettype.equals("五星三码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivebottomfivethreenotposition();
				} else if (temptickettype.equals("五星二码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivebottomfivetwonotposition();
				} else if (temptickettype.equals("四星二码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourbottomfourtwonotposition();
				} else if (temptickettype.equals("四星一码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourbottomfouronenotposition();
				} else if (temptickettype.equals("前三二码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getThreetopthreetwonotposition();
				} else if (temptickettype.equals("前三一码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getThreetopthreeonenotposition();
				} else if (temptickettype.equals("后二组选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwogroupbottomtwodouble();
				} else if (temptickettype.equals("前二组选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwogrouptoptwodouble();
				} else if (temptickettype.equals("五星组选60")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivegroup60();
				} else if (temptickettype.equals("五星组选30")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivegroup30();
				} else if (temptickettype.equals("五星组选20")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivegroup20();
				} else if (temptickettype.equals("五星组选10")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivegroup10();
				} else if (temptickettype.equals("四星直选复式")) {

					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourdirectdouble();

				} else if (temptickettype.equals("四星组选24")) {

					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourgroup24();

				} else if (temptickettype.equals("四星组选12")) {

					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourgroup12();

				} else if (temptickettype.equals("五星组选5")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivegroup5();
				} else if (temptickettype.equals("四星组选6")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourgroup6();
				} else if (temptickettype.equals("后三组六单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottompthreegroupsixsingle();
				} else if (temptickettype.equals("后三组三单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottompthreegroupthreesingle();
				} else if (temptickettype.equals("后三混合组选")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottompthreemixgroup();
				} else if (temptickettype.equals("五星直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFivedirectsingle();
				} else if (temptickettype.equals("四星直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourdirectsingle();
				} else if (temptickettype.equals("前三直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreedirectsingle();
				} else if (temptickettype.equals("前三组六单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreegroupsixsingle();
				} else if (temptickettype.equals("前三组三单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreegroupthreesingle();
				} else if (temptickettype.equals("前三混合组选")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreemixgroup();
				} else if (temptickettype.equals("后二直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwodirecttoptwosingle();
				} else if (temptickettype.equals("前二直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwodirecttoptwosingle();
				} else if (temptickettype.equals("后二组选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwogroupbottomtwosingle();
				} else if (temptickettype.equals("前二组选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwogrouptoptwosingle();

				} else if (temptickettype.equals("四星组选4")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getFourgroup4();
				} else if (temptickettype.equals("前三直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreedirectdouble();
				} else if (temptickettype.equals("后三大小单双")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getMaxminbottomthree();
				} else if (temptickettype.equals("前三大小单双")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getMaxmintopthree();
				} else if (temptickettype.equals("前三组选组三")) {
					numberofticket[numberposition] = 2;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreegroup3();
				} else if (temptickettype.equals("后三组选组三")) {
					numberofticket[numberposition] = 2;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottomthreegroup3();
				} else if (temptickettype.equals("前三组选组六")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreegroup6();
				} else if (temptickettype.equals("后三组选组六")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottomthreegroup6();
				} else if (temptickettype.equals("前三组选和值")) {
					int tempago = getTopthreegroupsum();

					numberofticket[numberposition] = getTopthreegroupsumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后三组选和值")) {
					int tempago = getBottomthreegroupsum();

					numberofticket[numberposition] = getBottomthreegroupsumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("前三组选包胆")) {
					numberofticket[numberposition] = 54;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreegroupcontainer();
				} else if (temptickettype.equals("前二组选包胆")) {
					numberofticket[numberposition] = 9;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwogrouptoptwocontainer();
				} else if (temptickettype.equals("后二组选包胆")) {
					numberofticket[numberposition] = 9;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTwogroupbottomtwocontainer();
				} else if (temptickettype.equals("后三组选包胆")) {
					numberofticket[numberposition] = 54;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottomthreegroupcontainer();
				} else if (temptickettype.equals("前三直选和值")) {
					int tempago = getTopthreedirectsum();

					numberofticket[numberposition] = getTopthreedirectsumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后二直选和值")) {
					int tempago = getTwodirectbottomtwosum();

					numberofticket[numberposition] = getTwodirectbottomtwosumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("前二直选和值")) {
					int tempago = getTwodirecttoptwosum();

					numberofticket[numberposition] = getTwodirecttoptwosumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后二组选和值")) {
					int tempago = getTwogroupbottomtwosum();

					numberofticket[numberposition] = getTwogroupbottomtwosumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("前二组选和值")) {
					int tempago = getTwogrouptoptwosum();

					numberofticket[numberposition] = getTwogrouptoptwosumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后三直选和值")) {
					int tempago = getBottomthreedirectsum();

					numberofticket[numberposition] = getBottomthreedirectsumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("前三和值尾数")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getTopthreesumend();
				} else if (temptickettype.equals("后三和值尾数")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottomthreesumend();
				} else if (temptickettype.equals("前三直选跨度")) {
					int tempago = getTopthreedirectspan();

					numberofticket[numberposition] = getTopthreedirectspanint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后二直选跨度")) {
					int tempago = getTwodirectbottomtwospan();

					numberofticket[numberposition] = getTwodirectbottomtwospanint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("前二直选跨度")) {
					int tempago = getTwodirecttoptwospan();

					numberofticket[numberposition] = getTwodirecttoptwospanint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后三直选跨度")) {
					int tempago = getBottomthreedirectspan();

					numberofticket[numberposition] = getBottomthreedirectspanint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("后三直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getBottomthreedirectdouble();
				}
				Log.d("getFivedirectdouble", getFivedirectdouble());
				numberposition++;
				showadapter();
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

	public void showAlertDialogselectfive() {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage("您的操作将会取消当前追号方案");
		builder.setTitle("提示");
		builder.setPositiveButton("知道了", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();

				if (temptickettype.equals("五星直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivedirectdouble();
						numberposition++;
					}
				}
				if (temptickettype.equals("定位胆")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFixedposition();
						numberposition++;
					}
				} else if (temptickettype.equals("后二直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwodirectbottomtwodouble();
						numberposition++;
					}
				} else if (temptickettype.equals("后二大小单双")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getMaxminbottomtwo();
						numberposition++;
					}
				} else if (temptickettype.equals("前二大小单双")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getMaxmintoptwo();
						numberposition++;
					}
				} else if (temptickettype.equals("前二直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwodirecttoptwodouble();
						numberposition++;
					}
				} else if (temptickettype.equals("五星组选120")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivegroup120();
						numberposition++;
					}
				} else if (temptickettype.equals("后三一码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getThreebottomthreeonenotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("后三二码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getThreebottomthreetwonotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("五星三码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivebottomfivethreenotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("五星二码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivebottomfivetwonotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("四星二码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourbottomfourtwonotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("四星一码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourbottomfouronenotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("前三二码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getThreetopthreetwonotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("前三一码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getThreetopthreeonenotposition();
						numberposition++;
					}
				} else if (temptickettype.equals("后二组选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwogroupbottomtwodouble();
						numberposition++;
					}
				} else if (temptickettype.equals("前二组选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwogrouptoptwodouble();
						numberposition++;
					}
				} else if (temptickettype.equals("五星组选60")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivegroup60();
						numberposition++;
					}
				} else if (temptickettype.equals("五星组选30")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivegroup30();
						numberposition++;
					}
				} else if (temptickettype.equals("五星组选20")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivegroup20();
						numberposition++;
					}
				} else if (temptickettype.equals("五星组选10")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivegroup10();
						numberposition++;
					}
				} else if (temptickettype.equals("五星组选5")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivegroup5();
						numberposition++;
					}
				} else if (temptickettype.equals("四星直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourdirectdouble();
						numberposition++;
					}
				} else if (temptickettype.equals("四星组选24")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourgroup24();
						numberposition++;
					}
				} else if (temptickettype.equals("四星组选12")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourgroup12();
						numberposition++;
					}
				} else if (temptickettype.equals("四星组选6")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourgroup6();
						numberposition++;
					}
				} else if (temptickettype.equals("四星组选4")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourgroup4();
						numberposition++;
					}
				} else if (temptickettype.equals("前三直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreedirectdouble();
						numberposition++;
					}
				} else if (temptickettype.equals("后三大小单双")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getMaxminbottomthree();
						numberposition++;
					}
				} else if (temptickettype.equals("前三大小单双")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getMaxmintopthree();
						numberposition++;
					}
				} else if (temptickettype.equals("前三组选组三")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 2;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreegroup3();
						numberposition++;
					}
				} else if (temptickettype.equals("后三组选组三")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 2;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottomthreegroup3();
						numberposition++;
					}
				} else if (temptickettype.equals("前三组选组六")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreegroup6();
						numberposition++;
					}
				} else if (temptickettype.equals("后三组选组六")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottomthreegroup6();
						numberposition++;
					}
				} else if (temptickettype.equals("前三组选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTopthreegroupsum();
						numberofticket[numberposition] = getTopthreegroupsumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后三组选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getBottomthreegroupsum();
						numberofticket[numberposition] = getBottomthreegroupsumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("前三组选包胆")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 54;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreegroupcontainer();
						numberposition++;
					}
				} else if (temptickettype.equals("前二组选包胆")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 9;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwogrouptoptwocontainer();
						numberposition++;
					}
				} else if (temptickettype.equals("后二组选包胆")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 9;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwogroupbottomtwocontainer();
						numberposition++;
					}
				} else if (temptickettype.equals("后三组选包胆")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 54;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottomthreegroupcontainer();
						numberposition++;
					}
				} else if (temptickettype.equals("前三直选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTopthreedirectsum();
						numberofticket[numberposition] = getTopthreedirectsumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后二直选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTwodirectbottomtwosum();
						numberofticket[numberposition] = getTwodirectbottomtwosumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("前二直选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTwodirecttoptwosum();
						numberofticket[numberposition] = getTwodirecttoptwosumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后二组选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTwogroupbottomtwosum();
						numberofticket[numberposition] = getTwogroupbottomtwosumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("前二组选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTwogrouptoptwosum();
						numberofticket[numberposition] = getTwogrouptoptwosumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后三直选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getBottomthreedirectsum();
						numberofticket[numberposition] = getBottomthreedirectsumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("前三和值尾数")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreesumend();
						numberposition++;
					}
				} else if (temptickettype.equals("后三和值尾数")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottomthreesumend();
						numberposition++;
					}
				} else if (temptickettype.equals("前三直选跨度")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTopthreedirectspan();
						numberofticket[numberposition] = getTopthreedirectspanint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后二直选跨度")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTwodirectbottomtwospan();
						numberofticket[numberposition] = getTwodirectbottomtwospanint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("前二直选跨度")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getTwodirecttoptwospan();
						numberofticket[numberposition] = getTwodirecttoptwospanint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后三直选跨度")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getBottomthreedirectspan();
						numberofticket[numberposition] = getBottomthreedirectspanint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("后三直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottomthreedirectdouble();
						numberposition++;
					}
				} else if (temptickettype.equals("后三组六单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottompthreegroupsixsingle();
						numberposition++;
					}

				} else if (temptickettype.equals("后三组三单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottompthreegroupthreesingle();
						numberposition++;
					}
				} else if (temptickettype.equals("后三混合组选")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getBottompthreemixgroup();
						numberposition++;
					}
				} else if (temptickettype.equals("五星直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFivedirectsingle();
						numberposition++;
					}
				} else if (temptickettype.equals("四星直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getFourdirectsingle();
						numberposition++;
					}
				} else if (temptickettype.equals("前三直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreedirectsingle();
						numberposition++;
					}
				} else if (temptickettype.equals("前三组六单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreegroupsixsingle();
						numberposition++;
					}
				} else if (temptickettype.equals("前三组三单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreegroupthreesingle();
						numberposition++;
					}
				} else if (temptickettype.equals("前三混合组选")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTopthreemixgroup();
						numberposition++;
					}
				} else if (temptickettype.equals("后二直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwodirecttoptwosingle();
						numberposition++;
					}
				} else if (temptickettype.equals("前二直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwodirecttoptwosingle();
						numberposition++;
					}
				} else if (temptickettype.equals("后二组选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwogroupbottomtwosingle();
						numberposition++;
					}
				} else if (temptickettype.equals("前二组选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getTwogrouptoptwosingle();
						numberposition++;
					}

				}
				Log.d("getFivedirectdouble", getFivegroup120());

				showadapter();
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

	public void clearnumber() {
		Log.d("adapter", "adapter");
		numberposition = 0;
		Log.d("numberposition", "adapter" + numberposition);
		// showadapter();
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		// Toast.makeText(this, "listview的item被点击了！，点击的位置是-->" + position,
		// Toast.LENGTH_SHORT).show();
	}

	@Override
	public void click(View v) {
		// TODO Auto-generated method stub
		// Toast.makeText(numberbasket.this,
		// "listview的内部的按钮被点击了！，位置是-->" + (Integer) v.getTag() + ",内容是-->" +
		// getData().get((Integer) v.getTag()),
		// Toast.LENGTH_SHORT).show();
		if ((Integer) v.getTag() < numberposition) {
			if (deleteint == 1) {
				deleteitem((Integer) v.getTag());
				Log.d("numberposition", "(Integer) v.getTag()" + (Integer) v.getTag());
			}

		} else {

			Log.d("numberposition+Log.d", "(Integer) v.getTag()" + (Integer) v.getTag());
			showAlertDialogclear();
		}
	}

	public void showAlertDialogclear() {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage("您确定清空号码篮？");
		builder.setTitle("提示");
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				// numberofticket[numberposition] = 1;
				// tickettype[numberposition] = tickettype[numberposition - 1];
				// ticketnumber[numberposition] = getFivedirectdouble();
				// Log.d("getFivedirectdouble", getFivedirectdouble());
				numberposition = 0;
				numberofticket[0] = 0;
				showadapter();
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

	public void deleteitem(int position) {
		for (int i = position; i < numberposition - 1; i++) {
			numberofticket[position] = numberofticket[position + 1];
			tickettype[position] = tickettype[position + 1];
			ticketnumber[position] = ticketnumber[position + 1];
		}
		numberposition = numberposition - 1;
		showadapter();
	}

	public void getrand() {
		int randtemp = (int) (Math.random() * 10);
		rand[0] = randtemp;
		for (int i = 1; i < 5; i++) {
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

	public void sendnumber() {

		// TODO Auto-generated method stub
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				cookies = cookiesdetail.getString("cookies", "");
				StringBuilder sb = null;
				numberinter();
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;

				// TODO Auto-generated method stub
				DefaultHttpClient httpClient = new DefaultHttpClient();
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/OrderSubmit");
				httpPost.setHeader("Cookie", cookies);// 将cookies传给服务器
				// httpPost.setHeader("gameGroup", "ssc");
				// httpPost.setHeader("game", "重庆");
				// httpPost.setHeader("Cookie",
				// "ASP.NET_SessionId=dv4tul5hpzdjfoofiw331asw;.AspNet.ApplicationCookie=m8_Dm_sZ_7CLhne7pKd6na_rwInpn3l1GcIC2zf211hLlxWGLP61m-K-3ScVy9iqPs9LlQDa_3tTYIxOutCz2A1yIOpfmthe3B85Yxl8mF1JEh0fpZZZsppZ-mw_57y7WKcFlQmUKQ0ZRE6BFbFpf8U3SfRIlNSMFmB5tBw8MxQG5xezWAzeuVlC9mSLd1HT7LEklNqjMXk0v7KXUnbx0FHEAEdi3PyovQeshp8OeqEUqaUwSU5BvpJHmvwEL_nuXMeiocbHFaY_txuJwPK8OGQ2m_GgBd184O5th5pQ9b538xBl9KbeO9QY0yfbYskxwWlI-RfMDKADzvF4z-cbuIcJId_DnYdxqMDNNQASkgFVybpd20h-iMoOnZ6AQaAusXY-r5hVxuRYfUapyZls-sQ26VTVaVUNNPbBzzHDQIb6oCrtT9Uo81F6kQ4IPr9XfAQ0EZEfqBxG5fesxlmtWg;");

				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs1, "UTF-8"));
					HttpResponse httpResponse;
					httpResponse = httpClient.execute(httpPost);
					is = httpResponse.getEntity().getContent();
					jsonString = Util.convertStreamToString(is);
					jsonString = "[" + jsonString + "]";
					Log.e("jsonString", jsonString);
					// err = jsonString;
					// Log.e("log_tag", "ismethrefgfdgeererw");
					// if (err.length() < 150) {
					// String t[] = jsonString.split("");
					// // for (int i = 0; i < 15; i++) {
					// // Log.e("jsonString" + i, t[i]);
					// // }
					// statue = t[6] + t[7] + t[8] + t[9];
					// } else {
					// err = "网络错误，或未登陆";
					// }
					// // String t[] = jsonString.split("");
					// // // for (int i = 0; i < 15; i++) {
					// // // Log.e("jsonString" + i, t[i]);
					// // // }
					// // statue = t[6] + t[7] + t[8] + t[9];
					//
					// Message msg1 = new Message();
					// // // // 便我们做出不同的处理操作
					// msg1.what = 2;
					//
					// // 我们可以通过arg1和arg2给Message传入简单的数据
					// msg1.arg1 = 123;
					// msg1.arg2 = 321;
					// // 我们也可以通过给obj赋值Object类型传递向Message传入任意数据
					// // msg.obj = null;
					// // 我们还可以通过setData方法和getData方法向Message中写入和读取Bundle类型的数据
					// // msg.setData(null);
					// // Bundle data = msg.getData();
					//
					// // 将该Message发送给对应的Handler
					// uiHandler.sendMessage(msg1);
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							statue = json_data.getString("r");
							err = json_data.getString("err");
							Log.e("msg+err", statue);
						}

					} catch (JSONException e1) {
					} catch (ParseException e1) {
						e1.printStackTrace();
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
					return jsonString;
					//
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return null;
			}

			protected void onPostExecute(String result) {

				Log.e("onPostExecute(String result)", result);
			};

		}.execute();

	}

	public void go() {
		getnew();
		if (statue.equals("true")) {
			if (ifsend == expect) {
				lin_loading.setVisibility(View.GONE);
				Intent intent = new Intent(numberbasket.this, sendvictory.class);
				Bundle bundle = new Bundle(); // 创建Bundle对象
				bundle.putInt("zhu", zhu);
				bundle.putDouble("moshi", moshi);
				bundle.putInt("times", times);
				bundle.putInt("expect", expect);
				bundle.putString("tempticketname", tempticketname); // 装入数据
				bundle.putString("tempticketgroup", tempticketgroup); // 装入数据
				intent.putExtras(bundle);
				startActivityForResult(intent, 0);

				Intent intent1 = new Intent();
				numberofticket[0] = 0;
				intent1.putExtra("numberposition", 0);
				intent1.putExtra("numberofticket", numberofticket);
				intent1.putExtra("ticketnumber", ticketnumber); // 装入数据
				intent1.putExtra("tickettype", tickettype);
				setResult(0, intent1);
				finish();
			} else {
				ifsend++;
				sendnumber();
			}

		} else {
			lin_loading.setVisibility(View.GONE);
			if (ifsend == 1) {
				Toast.makeText(numberbasket.this, "投注失败:" + err, Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(numberbasket.this, "追号失败", Toast.LENGTH_SHORT).show();
			}

		}

	}

	public void numberinter() {
		Log.e("12345678", "qwrerw4");
		nameValuePairs1 = new ArrayList();
		for (int i = 0; i < numberposition; i++) {

			String city = null;
			if (tickettypecode == 1) {
				city = "天津";
			} else if (tickettypecode == 2) {
				city = "新疆";
			} else if (tickettypecode == 3) {
				city = "江西";
			} else if (tickettypecode == 4) {
				city = "重庆";
			}
			Log.e("12345678", "qwrerw46");
			int ticketinfoposition = chazhao(city, tickettype[i]);
			System.out.println("" + ticketinfoposition);
			String Name = null;
			Name = ticketinfo.data[ticketinfoposition][7];
			String Item = null;
			Item = getchange(ticketnumber[i]);
			if (tickettype[i].equals("前三直选和值")) {

			} else if (tickettype[i].equals("前三组选和值")) {

			} else if (tickettype[i].equals("后三组选和值")) {

			} else if (tickettype[i].equals("后三直选和值")) {

			} else if (tickettype[i].equals("前二组选和值")) {

			} else if (tickettype[i].equals("前二直选和值")) {

			} else if (tickettype[i].equals("后二组选和值")) {

			} else if (tickettype[i].equals("后二直选和值")) {

			} else if (tickettype[i].equals("定位胆")) {

			} else if (tickettype[i].equals("前三混合组选")) {

			} else if (tickettype[i].equals("后三混合组选")) {

			} else if (tickettype[i].equals("五星直选单式")) {

			} else if (tickettype[i].equals("四星直选单式")) {

			} else if (tickettype[i].equals("前三直选单式")) {

			} else if (tickettype[i].equals("前三组三单式")) {

			} else if (tickettype[i].equals("前三组六单式")) {

			} else if (tickettype[i].equals("后三直选单式")) {

			} else if (tickettype[i].equals("后三组三单式")) {

			} else if (tickettype[i].equals("后三组六单式")) {

			} else if (tickettype[i].equals("后二直选单式")) {

			} else if (tickettype[i].equals("前二直选单式")) {

			} else if (tickettype[i].equals("后二组选单式")) {

			} else if (tickettype[i].equals("前二组选单式")) {

			} else {
				Item = Change(Item);
			}
			Log.e("定位胆", Item);
			String Beishu = null;
			Beishu = times + "";
			String ReturnPoint = null;
			ReturnPoint = "" + 0;
			String Count = null;
			Count = numberofticket[i] + "";

			String Jiangjin = null;
			Jiangjin = ticketinfo.data[ticketinfoposition][9];
			String fandian = "";
			fandian = ticketinfo.data[ticketinfoposition][8];
			double tempjiangjin = 0;
			double tempfandian = 0;
			tempjiangjin = Double.valueOf(Jiangjin);
			tempfandian = Double.valueOf(fandian);
			double jiangjinresult = 0;
			jiangjinresult = (tempjiangjin + (tempfandian * SscReturnresult)) * times * moshi;
			Jiangjin = jiangjinresult + "";
			Log.e("Jiangjin", Jiangjin);
			String PlayId = null;
			PlayId = ticketinfo.data[ticketinfoposition][6];
			String Unit = null;
			if (moshi == 1) {
				Unit = "1";
			} else {
				Unit = "" + moshi;
			}

			Log.e("Unit", Unit);
			String GameId = null;
			GameId = ticketinfo.data[ticketinfoposition][0];
			String GameName = null;
			GameName = city + "时时彩";
			String No = null;
			No = getnewno(nowno, ifsend - 1);
			tempticketgroup = nowno;
			String TypeName = null;
			TypeName = ticketinfo.data[ticketinfoposition][3];
			String ShowP = null;
			ShowP = ticketinfo.data[ticketinfoposition][11];
			String ShowPl = null;
			ShowP = ticketinfo.data[ticketinfoposition][12];
			String isZhuihao = getisZhuihao();
			String zjtz = getzjtz();
			double pay = numberofticket[i] * 2 * moshi;
			String Memony = pay + "";
			// Double dou = Double.parseDouble(ReturnPoint);
			// dou = dou * pay / 100;
			String ReturnMemony = 0 + "";
			Log.e("12345678", No);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].GameGroup", "ssc"));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Name", Name));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Item", Item));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Beishu", Beishu));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ReturnPoint", ReturnPoint));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Count", Count));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Memony", Memony));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ReturnMemony", ReturnMemony));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Jiangjin", Jiangjin));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].PlayId", PlayId));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Unit", Unit));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].GameId", GameId));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].GameName", GameName));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].No", No));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].TypeName", TypeName));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ShowP", ShowP));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ShowPl", ShowPl));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].isZhuihao", isZhuihao));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].zjtz", zjtz));
			Log.e("12345678", "aaaaaaaaa");

		}

	}

	private String getzjtz() {
		String result = null;
		// TODO Auto-generated method stub
		if (ifsend == 1) {
			result = "false";
		} else {
			result = "true";
		}
		return result;
	}

	private String getisZhuihao() {
		// TODO Auto-generated method stub
		String result = null;
		// TODO Auto-generated method stub
		if (ifsend == 1) {
			result = "false";
		} else {
			result = "true";
		}
		return result;
	}

	private String getnewno(String nowno2, int ifsend2) {
		// TODO Auto-generated method stub
		String no = null;

		String t[] = nowno2.split("");
		String stri = t[9] + t[10] + t[11];
		int s = Integer.parseInt(stri);
		s = s + ifsend2;
		String res = "";
		if (s < 10) {
			res = "00" + s;
		} else if (s < 100) {
			res = "0" + s;
		} else {
			res = "" + s;
		}
		no = t[1] + t[2] + t[3] + t[4] + t[5] + t[6] + t[7] + t[8] + res;
		return no;
	}

	private String getchange(String string) {
		String result = "";
		String g[] = string.split("");
		for (int i = 0; i < g.length; i++) {
			if (g[i].equals("|")) {
				g[i] = ",";
			}
			result = result + g[i];
		}
		return result;

	}

	private String Change(String string) {
		// TODO Auto-generated method stub
		String t[] = string.split(",");
		String resultt = "";
		int length = t.length;
		Log.e("length", "length" + length);

		for (int i = 0; i < t.length; i++) {
			t[i] = Changeagain(t[i]);
		}
		resultt = t[0];
		for (int i = 1; i < t.length; i++) {
			resultt = resultt + "," + t[i];
		}
		Log.d("resultt", resultt);
		return resultt;
	}

	private String Changeagain(String string) {
		// TODO Auto-generated method stub
		String a[] = string.split("");
		String resulta = "";
		resulta = a[1];
		int len = a.length;
		Log.e("len", "len" + len);
		for (int i = 2; i < len; i++) {
			resulta = resulta + " " + a[i];

		}
		return resulta;
	}

	public int chazhao(String data_type, String data_name) {

		System.out.println(data_name);
		System.out.println(data_type);
		for (int i = 0; i < 500; i++) {
			if (!ticketinfo.data[i][0].equals(null)) {
				if (data_name.equals(ticketinfo.data[i][3] + ticketinfo.data[i][7])
						&& data_type.equals(ticketinfo.data[i][1])) {
					return i;
				} else if (data_name.equals(ticketinfo.data[i][7]) && data_type.equals(ticketinfo.data[i][1])) {
					return i;
				} else if (data_name.equals(ticketinfo.data[i][3] + "组选" + ticketinfo.data[i][7])
						&& data_type.equals(ticketinfo.data[i][1])) {
					return i;
				}
			} else {
				break;
			}

		}
		Log.e("12345678", "qwrerw4");
		return -1;
	}

	public void getnew() {
		cookies = cookiesdetail.getString("cookies", "");
		final ArrayList nameValuePairs = new ArrayList();
		// nameValuePairs.add(new BasicNameValuePair("pagesize", "100"));
		// nameValuePairs.add(new BasicNameValuePair("page", "1"));
		// Log.d("selindex", "selindex" + "read" + selindex);
		new AsyncTask<Void, Void, String>() {

			@Override
			protected String doInBackground(Void... params) {
				StringBuilder sb = null;
				JSONArray jArray = null;
				String result = null;
				InputStream is = null;
				String jsonString = null;
				// TODO Auto-generated method stub
				DefaultHttpClient httpClient = new DefaultHttpClient();
				// Log.d("TabAFragment", "1");
				HttpPost httpPost = new HttpPost("http://lottery1.cftb58.cn/App/UserInfo");
				// Log.d("TabAFragment", "11");
				httpPost.setHeader("Cookie", cookies);//
				// Log.d("TabAFragment", "111");
				try {
					httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
					HttpResponse httpResponse;
					// Log.d("TabAFragment", "1111");
					httpResponse = httpClient.execute(httpPost);
					// Log.d("TabAFragment", "12222");
					is = httpResponse.getEntity().getContent();
					// Log.d("TabAFragment", "14444");
					jsonString = Util.convertStreamToString(is);
					jsonString = getstandard(jsonString);
					// Log.e("TabAFragment", jsonString);
					String t;
					String tz;
					String l;
					try {
						jArray = new JSONArray(jsonString);
						JSONObject json_data = null;
						for (int i = 0; i < jArray.length(); i++) {
							json_data = jArray.getJSONObject(i);
							Log.d("dfsd", "dfs");
							username = json_data.getString("UserName");
							rmb = json_data.getString("Rmb");
							sscrmb = json_data.getString("SscRmb");
							SscReturn = json_data.getString("SscReturn");
							Shiyi5Rmb = json_data.getString("Shiyi5Rmb");
							Shiyi5Return = json_data.getString("Shiyi5Return");
							DipinRmb = json_data.getString("DipinRmb");
							DipinReturn = json_data.getString("DipinReturn");
							// Log.d("username", username);
							// Log.d("rmb", "dfs" + rmb);
							// Log.d("sscrmb", "dfs" + sscrmb);
							// game[i] = json_data.getString("game");
							// no[i] = json_data.getString("no");
							// value[i] = json_data.getString("value");
						}
						Message msg1 = new Message();
						// // // 便我们做出不同的处理操作
						msg1.what = 1;

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

	public String getstandard(String str) {
		String t[] = str.split("");
		int temp = 0;
		str = "[" + str + "]";
		return str;
	}

	private void goshow() {
		// TODO Auto-generated method stub
		Editor edit = userinfo.edit();// �� cookies �浽����
		edit.putString("rmb", rmb);
		edit.putString("sscrmb", sscrmb);
		edit.putString("username", username);
		edit.putString("SscReturn", SscReturn);
		edit.putString("Shiyi5Rmb", Shiyi5Rmb);
		edit.putString("Shiyi5Return", Shiyi5Return);
		edit.putString("DipinRmb", DipinRmb);
		edit.putString("DipinReturn", DipinReturn);
		edit.commit();
		// Toast.makeText(numberbasket.this, "投" + sscrmb,
		// Toast.LENGTH_SHORT).show();
	}

	public void showAlertDialognonumber1(String str) {

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

	public void getmoney() {
		if (sscrmbmoney < nowmoney) {
			if (toast == 0) {
				showAlertDialognonumber1("余额不足");
				toast = 1;
			}

		}
	}

	// private void Stasttime() {
	// Timer timer = new Timer();
	// timer.schedule(new TimerTask() {
	//
	// @Override
	// public void run() {
	// toast = 0;
	// Stasttime();
	// }
	//
	// }, 500);
	// }

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		// Stasttime();
		getnew();
		super.onStart();
	}
}
