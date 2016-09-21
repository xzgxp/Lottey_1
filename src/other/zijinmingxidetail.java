package other;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Intent;
import android.database.CursorJoiner.Result;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Relation;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

public class zijinmingxidetail extends Activity {
	private LinearLayout Lin_back;
	private TextView text_id;
	private TextView text_orderno;
	private TextView text_type;
	private TextView text_biandong;
	private TextView text_yue;
	private TextView text_status;
	private TextView text_remark;
	private TextView text_time;
	private String id = "";
	private String orderno = "";
	private String type = "";
	private String biandong = "";
	private String yue = "";
	private String status = "";
	private String remark = "";
	private String time = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.other_zijinmingxidetail);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		text_id = (TextView) findViewById(R.id.text_id);
		text_orderno = (TextView) findViewById(R.id.text_orderno);
		text_type = (TextView) findViewById(R.id.text_type);
		text_biandong = (TextView) findViewById(R.id.text_biandong);
		text_yue = (TextView) findViewById(R.id.text_yue);
		text_status = (TextView) findViewById(R.id.text_status);
		text_remark = (TextView) findViewById(R.id.text_remark);
		text_time = (TextView) findViewById(R.id.text_time);
		Intent intent = this.getIntent(); // 获取已有的intent对象
		Bundle bundle = intent.getExtras(); // 获取intent里面的bundle对象
		id = bundle.getString("id");
		orderno = bundle.getString("orderno");
		type = bundle.getString("type");
		biandong = bundle.getString("biandong");
		yue = bundle.getString("yue");
		status = bundle.getString("status");
		remark = bundle.getString("remark");
		time = bundle.getString("time");
		text_id.setText(id);
		text_orderno.setText(orderno);
		text_type.setText(gettype(type));
		text_biandong.setText(biandong + "元");
		text_yue.setText(yue + "元");
		text_status.setText(getstatus(status));
		text_remark.setText(remark);
		text_time.setText(time);
		Lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	private String getstatus(String status2) {
		// TODO Auto-generated method stub
		String result = "";
		if (status2.equals("0")) {
			result = "成功";
		} else if (status2.equals("1")) {
			result = "失败";
		} else if (status2.equals("2")) {
			result = "取消";
		} else {
			result = "其它类型";
		}
		return result;
	}

	private String gettype(String type2) {
		// TODO Auto-generated method stub
		String result = "";
		if (type2.equals("0")) {
			result = "充值";
		} else if (type2.equals("1")) {
			result = "取款";
		} else if (type2.equals("2")) {
			result = "佣金";
		} else if (type2.equals("3")) {
			result = "分红";
		} else if (type2.equals("4")) {
			result = "返利";
		} else if (type2.equals("5")) {
			result = "红利";
		} else if (type2.equals("6")) {
			result = "投注";
		} else if (type2.equals("7")) {
			result = "派奖";
		} else if (type2.equals("8")) {
			result = "转账";
		} else if (type2.equals("9")) {
			result = "取消投注";
		} else {
			result = "其他类型";
		}
		return result;
	}
}
