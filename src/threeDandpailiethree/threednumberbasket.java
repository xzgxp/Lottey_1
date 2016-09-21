package threeDandpailiethree;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
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

import adapter.numberbasketlistdapter;
import adapter.numberbasketlistdapter.Callback;
import android.app.Activity;
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
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import dialog.dialogone;
import dialog.dialogtwo;
import model.numberbasketmodel;
import model.ticketinfo;
import ticketpackage.sendvictory;

//hgkjhj
public class threednumberbasket extends Activity implements OnItemClickListener, Callback {
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
	private String tj_tickettype = "天津时时彩", jx_tickettype = "江西时时彩", xj_tickettype = "新疆时时彩", cq_tickettype = "重庆时时彩",
			threed = "福彩3D", pailie = "排列三";
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
		setContentView(R.layout.threed_numberbasket);
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
		yue = userinfo.getString("DipinRmb", "000");
		getSscReturn = userinfo.getString("DipinReturn", "000");
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
		} else if (tickettypecode == 5) {
			tempticketname = threed;
			numberlist_tickettype.setText(threed);
		} else if (tickettypecode == 6) {
			tempticketname = pailie;
			numberlist_tickettype.setText(pailie);
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
						Toast.makeText(threednumberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else if (tickettypecode == 2 && a > 96) {
						Toast.makeText(threednumberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else if (tickettypecode == 3 && a > 84) {
						Toast.makeText(threednumberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
					} else if (tickettypecode == 4 && a > 120) {
						Toast.makeText(threednumberbasket.this, "即将结束，追号超限", Toast.LENGTH_SHORT).show();
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
				String stri = t[5] + t[6] + t[7];
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

	private String getthree_direct_double() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String three_direct_double = wan + "," + qian + "," + bai;
		return three_direct_double;
	}

	private String getthree_direct_single() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int qian = (int) (Math.random() * 10);
		int bai = (int) (Math.random() * 10);
		int shi = (int) (Math.random() * 10);
		int ge = (int) (Math.random() * 10);
		String three_direct_double = wan + ""+ qian + ""+ bai;
		return three_direct_double;
	}

	private int getthree_direct_sum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getthree_direct_sum = (int) (Math.random() * 27);
		return getthree_direct_sum;
	}

	private int getthree_direct_sumint(int ago) {
		int getthree_direct_sumint = 0;
		switch (ago) {
		case 0:
			getthree_direct_sumint = getthree_direct_sumint + 1;
			break;
		case 1:
			getthree_direct_sumint = getthree_direct_sumint + 3;
			break;
		case 2:
			getthree_direct_sumint = getthree_direct_sumint + 6;
			break;
		case 3:
			getthree_direct_sumint = getthree_direct_sumint + 10;
			break;
		case 4:
			getthree_direct_sumint = getthree_direct_sumint + 15;
			break;
		case 5:
			getthree_direct_sumint = getthree_direct_sumint + 21;
			break;
		case 6:
			getthree_direct_sumint = getthree_direct_sumint + 28;
			break;
		case 7:
			getthree_direct_sumint = getthree_direct_sumint + 36;
			break;
		case 8:
			getthree_direct_sumint = getthree_direct_sumint + 45;
			break;
		case 9:
			getthree_direct_sumint = getthree_direct_sumint + 55;
			break;
		case 10:
			getthree_direct_sumint = getthree_direct_sumint + 63;
			break;
		case 11:
			getthree_direct_sumint = getthree_direct_sumint + 69;
			break;
		case 12:
			getthree_direct_sumint = getthree_direct_sumint + 73;
			break;
		case 13:
			getthree_direct_sumint = getthree_direct_sumint + 75;
			break;
		case 14:
			getthree_direct_sumint = getthree_direct_sumint + 75;
			break;
		case 15:
			getthree_direct_sumint = getthree_direct_sumint + 73;
			break;
		case 16:
			getthree_direct_sumint = getthree_direct_sumint + 69;
			break;
		case 17:
			getthree_direct_sumint = getthree_direct_sumint + 63;
			break;
		case 18:
			getthree_direct_sumint = getthree_direct_sumint + 55;
			break;
		case 19:
			getthree_direct_sumint = getthree_direct_sumint + 45;
			break;
		case 20:
			getthree_direct_sumint = getthree_direct_sumint + 36;
			break;
		case 21:
			getthree_direct_sumint = getthree_direct_sumint + 28;
			break;
		case 22:
			getthree_direct_sumint = getthree_direct_sumint + 21;
			break;
		case 23:
			getthree_direct_sumint = getthree_direct_sumint + 15;
			break;
		case 24:
			getthree_direct_sumint = getthree_direct_sumint + 10;
			break;
		case 25:
			getthree_direct_sumint = getthree_direct_sumint + 6;
			break;
		case 26:
			getthree_direct_sumint = getthree_direct_sumint + 3;
			break;
		case 27:
			getthree_direct_sumint = getthree_direct_sumint + 1;
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

		return getthree_direct_sumint;
	}

	private int getthree_group_sum() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int getthree_group_sum = (int) (Math.random() * 25) + 1;
		return getthree_group_sum;
	}

	private int getthree_group_sumint(int ago) {
		int getthree_group_sumint = 0;
		switch (ago) {
		case 0:
			getthree_group_sumint = getthree_group_sumint + 0;
			break;
		case 1:
			getthree_group_sumint = getthree_group_sumint + 1;
			break;
		case 2:
			getthree_group_sumint = getthree_group_sumint + 2;
			break;
		case 3:
			getthree_group_sumint = getthree_group_sumint + 2;
			break;
		case 4:
			getthree_group_sumint = getthree_group_sumint + 4;
			break;
		case 5:
			getthree_group_sumint = getthree_group_sumint + 5;
			break;
		case 6:
			getthree_group_sumint = getthree_group_sumint + 6;
			break;
		case 7:
			getthree_group_sumint = getthree_group_sumint + 8;
			break;
		case 8:
			getthree_group_sumint = getthree_group_sumint + 10;
			break;
		case 9:
			getthree_group_sumint = getthree_group_sumint + 11;
			break;
		case 10:
			getthree_group_sumint = getthree_group_sumint + 13;
			break;
		case 11:
			getthree_group_sumint = getthree_group_sumint + 14;
			break;
		case 12:
			getthree_group_sumint = getthree_group_sumint + 14;
			break;
		case 13:
			getthree_group_sumint = getthree_group_sumint + 15;
			break;
		case 14:
			getthree_group_sumint = getthree_group_sumint + 15;
			break;
		case 15:
			getthree_group_sumint = getthree_group_sumint + 14;
			break;
		case 16:
			getthree_group_sumint = getthree_group_sumint + 14;
			break;
		case 17:
			getthree_group_sumint = getthree_group_sumint + 13;
			break;
		case 18:
			getthree_group_sumint = getthree_group_sumint + 11;
			break;
		case 19:
			getthree_group_sumint = getthree_group_sumint + 10;
			break;
		case 20:
			getthree_group_sumint = getthree_group_sumint + 8;
			break;
		case 21:
			getthree_group_sumint = getthree_group_sumint + 6;
			break;
		case 22:
			getthree_group_sumint = getthree_group_sumint + 5;
			break;
		case 23:
			getthree_group_sumint = getthree_group_sumint + 4;
			break;
		case 24:
			getthree_group_sumint = getthree_group_sumint + 2;
			break;
		case 25:
			getthree_group_sumint = getthree_group_sumint + 2;
			break;
		case 26:
			getthree_group_sumint = getthree_group_sumint + 1;
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

		return getthree_group_sumint;
	}

	private String getthree_group_three() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getthree_group_three = rand[0] + "" + rand[1];
		return getthree_group_three;
	}

	private String getthree_group_six() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getthree_group_six = rand[0] + "" + rand[1] + "" + rand[2];
		return getthree_group_six;
	}

	private String getthree_group_combination() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getthree_group_combination = rand[0] + "" + rand[1] + "" + rand[2];
		return getthree_group_combination;
	}

	private String getthree_group_three_single() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int temp = rand[0];
		String getthree_group_three_single = temp + "" + rand[1] + "" + temp;
		return getthree_group_three_single;
	}

	private String getbottom_two_direct_double() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getbottom_two_direct_double = rand[0] + "," + rand[1];
		return getbottom_two_direct_double;
	}

	private String getbottom_two_direct_single() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getbottom_two_direct_single = rand[0] + "" + rand[1];
		return getbottom_two_direct_single;
	}

	private String getbottom_two_group_double() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getbottom_two_direct_single = rand[0] + "" + rand[1];
		return getbottom_two_direct_single;
	}

	private String getbottom_two_group_single() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getbottom_two_direct_single = rand[0] + "" + rand[1];
		return getbottom_two_direct_single;
	}

	private String gettop_two_direct_double() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String gettop_two_direct_double = rand[0] + "," + rand[1];
		return gettop_two_direct_double;
	}

	private String gettop_two_direct_single() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String gettop_two_direct_single = rand[0] + "" + rand[1];
		return gettop_two_direct_single;
	}

	private String gettop_two_group_double() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String gettop_two_direct_single = rand[0] + "" + rand[1];
		return gettop_two_direct_single;
	}

	private String gettop_two_group_single() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String gettop_two_direct_single = rand[0] + "" + rand[1];
		return gettop_two_direct_single;
	}

	private String getthree_group_six_single() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		int temp = rand[0];
		String getthree_group_six_single = temp + "" + rand[1] + "" + rand[2];
		return getthree_group_six_single;
	}

	private String getfixedposition() {
		// TODO Auto-generated method stub
		int wan = (int) (Math.random() * 10);
		int x = (int) (Math.random() * 3);
		String getfixedposition = null;
		if (x == 0) {
			getfixedposition = wan + "," + "" + ",";
		} else if (x == 1) {
			getfixedposition = "" + "," + wan + ",";
		} else if (x == 2) {
			getfixedposition = "" + "," + "" + "," + wan;
		}

		return getfixedposition;
	}

	private String getonenumber_notposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String getonenumber_notposition = "" + rand[1];
		return getonenumber_notposition;
	}

	private String gettwonumber_notposition() {
		getrand();
		// TODO Auto-generated method stub
		// int wan = (int) (Math.random() * 10);
		// int qian = (int) (Math.random() * 10);
		// int bai = (int) (Math.random() * 10);
		// int shi = (int) (Math.random() * 10);
		// int ge = (int) (Math.random() * 10);
		String gettwonumber_notposition = rand[0] + " " + rand[1];
		return gettwonumber_notposition;
	}

	private String getmaxmin_bottom() {
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
		String getmaxmin_bottom = result2 + "," + result1;
		return getmaxmin_bottom;
	}

	private String getmaxmin_toptwo() {
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
		String getmaxmin_toptwo = result2 + "," + result1;
		return getmaxmin_toptwo;
	}

	public void showAlertDialogselectone() {

		dialogtwo.Builder builder = new dialogtwo.Builder(this);
		builder.setMessage("您的操作将会取消当前追号方案");
		builder.setTitle("提示");
		builder.setPositiveButton("知道了", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				if (temptickettype.equals("三星直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_direct_double();
				} else if (temptickettype.equals("三星直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_direct_single();
				} else if (temptickettype.equals("三星直选和值")) {
					int tempago = getthree_direct_sum();

					numberofticket[numberposition] = getthree_direct_sumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("三星组三")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_group_three();
				} else if (temptickettype.equals("三星组六")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_group_six();
				} else if (temptickettype.equals("三星组选和值")) {
					int tempago = getthree_group_sum();
					numberofticket[numberposition] = getthree_group_sumint(tempago);
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = tempago + "";
				} else if (temptickettype.equals("三星混合组选")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_group_combination();
				} else if (temptickettype.equals("三星组三单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_group_three_single();
				} else if (temptickettype.equals("三星组六单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getthree_group_six_single();
				} else if (temptickettype.equals("前二直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = gettop_two_direct_double();
				} else if (temptickettype.equals("前二直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = gettop_two_direct_single();
				} else if (temptickettype.equals("前二组选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = gettop_two_group_double();
				} else if (temptickettype.equals("前二组选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = gettop_two_group_single();
				} else if (temptickettype.equals("后二直选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getbottom_two_direct_double();
				} else if (temptickettype.equals("后二直选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getbottom_two_direct_single();
				} else if (temptickettype.equals("后二组选复式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getbottom_two_group_double();
				} else if (temptickettype.equals("后二组选单式")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getbottom_two_group_single();
				} else if (temptickettype.equals("定位胆")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getfixedposition();
				} else if (temptickettype.equals("一码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getonenumber_notposition();
				} else if (temptickettype.equals("二码不定位")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = gettwonumber_notposition();
				} else if (temptickettype.equals("后二大小单双")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getmaxmin_bottom();
				} else if (temptickettype.equals("前二大小单双")) {
					numberofticket[numberposition] = 1;
					tickettype[numberposition] = temptickettype;
					ticketnumber[numberposition] = getmaxmin_toptwo();
				}
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
				if (temptickettype.equals("三星直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_direct_double();
						numberposition++;
					}
				} else if (temptickettype.equals("三星直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_direct_single();
						numberposition++;
					}
				} else if (temptickettype.equals("三星直选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getthree_direct_sum();

						numberofticket[numberposition] = getthree_direct_sumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("三星组三")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_group_three();
						numberposition++;
					}
				} else if (temptickettype.equals("三星组六")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_group_six();
						numberposition++;
					}
				} else if (temptickettype.equals("三星组选和值")) {
					for (int i = 0; i < 5; i++) {
						int tempago = getthree_group_sum();
						numberofticket[numberposition] = getthree_group_sumint(tempago);
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = tempago + "";
						numberposition++;
					}
				} else if (temptickettype.equals("三星混合组选")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_group_combination();
						numberposition++;
					}
				} else if (temptickettype.equals("三星组三单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_group_three_single();
						numberposition++;
					}
				} else if (temptickettype.equals("三星组六单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getthree_group_six_single();
						numberposition++;
					}
				} else if (temptickettype.equals("前二直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = gettop_two_direct_double();
						numberposition++;
					}
				} else if (temptickettype.equals("前二直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = gettop_two_direct_single();
						numberposition++;
					}
				} else if (temptickettype.equals("前二组选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = gettop_two_group_double();
						numberposition++;
					}
				} else if (temptickettype.equals("前二组选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = gettop_two_group_single();
						numberposition++;
					}
				} else if (temptickettype.equals("后二直选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getbottom_two_direct_double();
						numberposition++;
					}
				} else if (temptickettype.equals("后二直选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getbottom_two_direct_single();
						numberposition++;
					}
				} else if (temptickettype.equals("后二组选复式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getbottom_two_group_double();
						numberposition++;
					}
				} else if (temptickettype.equals("后二组选单式")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getbottom_two_group_single();
						numberposition++;
					}
				} else if (temptickettype.equals("定位胆")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getfixedposition();
						numberposition++;
					}
				} else if (temptickettype.equals("一码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getonenumber_notposition();
						numberposition++;
					}
				} else if (temptickettype.equals("二码不定位")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = gettwonumber_notposition();
						numberposition++;
					}
				} else if (temptickettype.equals("后二大小单双")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getmaxmin_bottom();
						numberposition++;
					}
				} else if (temptickettype.equals("前二大小单双")) {
					for (int i = 0; i < 5; i++) {
						numberofticket[numberposition] = 1;
						tickettype[numberposition] = temptickettype;
						ticketnumber[numberposition] = getmaxmin_toptwo();
						numberposition++;
					}
				}
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
				Intent intent = new Intent(threednumberbasket.this, threedsendvictory.class);
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
				Toast.makeText(threednumberbasket.this, "投注失败:" + err, Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(threednumberbasket.this, "追号失败", Toast.LENGTH_SHORT).show();
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
			} else if (tickettypecode == 5) {
				city = "福彩3D";
			} else if (tickettypecode == 6) {
				city = "排列三";
			}
			Log.e("12345678", "qwrerw46");
			if (tickettype[i].equals("一码不定位")) {
				tickettype[i] = "不定位" + tickettype[i];
			} else if (tickettype[i].equals("二码不定位")) {
				tickettype[i] = "不定位" + tickettype[i];
			} else if (tickettype[i].equals("后二大小单双")) {
				tickettype[i] = "大小单双" + tickettype[i];
			} else if (tickettype[i].equals("前二大小单双")) {
				tickettype[i] = "大小单双" + tickettype[i];
			} else if (tickettype[i].equals("定位胆")) {
				tickettype[i] = "定位胆" + tickettype[i];
			} else if (tickettype[i].equals("三星组选和值")) {
				tickettype[i] = "三星和值";
			}
			int ticketinfoposition = chazhao(city, tickettype[i]);
			System.out.println("" + ticketinfoposition);
			String Name = null;
			Name = ticketinfo.data[ticketinfoposition][7];
			String Item = null;
			Item = getchange(ticketnumber[i]);
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
			GameName = city;
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
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].GameGroup", "dipin"));
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Name", Name));
			Log.e("Name", Name);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Item", Item));
			Log.e("Item", Item);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Beishu", Beishu));
			Log.e("Beishu", Beishu);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ReturnPoint", ReturnPoint));
			Log.e("ReturnPoint", ReturnPoint);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Count", Count));
			Log.e("Count", Count);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Memony", Memony));
			Log.e("Memony", Memony);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ReturnMemony", ReturnMemony));
			Log.e("ReturnMemony", ReturnMemony);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Jiangjin", Jiangjin));
			Log.e("Jiangjin", Jiangjin);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].PlayId", PlayId));
			Log.e("PlayId", PlayId);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].Unit", Unit));
			Log.e("Unit", Unit);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].GameId", GameId));
			Log.e("GameId", GameId);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].GameName", GameName));
			Log.e("GameName", GameName);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].No", No));
			Log.e("No", No);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].TypeName", TypeName));
			Log.e("TypeName", TypeName);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ShowP", ShowP));
			Log.e("Beishu", ShowP);
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].ShowPl", ShowPl));
			Log.e("Beishu", ShowPl + "yy");
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].isZhuihao", isZhuihao));
			Log.e("isZhuihao", isZhuihao + "yy");
			nameValuePairs1.add(new BasicNameValuePair("orders[" + i + "].zjtz", zjtz));
			Log.e("zjtz", zjtz + "yy");

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
		String stri = t[5] + t[6] + t[7];
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
		no = t[1] + t[2] + t[3] + t[4] + res;
		return no;
	}

	private String getchange(String string) {
		// String result = "";
		// String g[] = string.split("");
		// for (int i = 0; i < g.length; i++) {
		// if (g[i].equals("|")) {
		// g[i] = ",";
		// }
		// result = result + g[i];
		// }
		return string;

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
