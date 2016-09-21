package ticketpackage;

import com.example.lottery.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TicketruleActivity extends Activity {
	private TextView rule_tickettype;
	private TextView rule_ticketdetail;
	private LinearLayout rule_back;
	private int tickettypecode = 1;
	private String tj_tickettype = "天津时时彩", jx_tickettype = "江西时时彩", xj_tickettype = "新疆时时彩", cq_tickettype = "重庆时时彩";
	private String tj_tickettypedetail = "09:10-23:00，10分钟一期，全天84期。";
	private String jx_tickettypedetail = "09:10-23:15，10分钟一期，全天84期。";
	private String xj_tickettypedetail = "10:10-02:00，10分钟一期，全天84期。";
	private String cq_tickettypedetail = "10:10-22:00（10分钟一期，共72期）\n22:00-01:55（5分钟一期，共48期）\n全天120期。";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_ticketrule);
		Intent intent = getIntent();
		rule_back = (LinearLayout) findViewById(R.id.rule_back);
		tickettypecode = intent.getIntExtra("tickettypecode", 0);
		rule_tickettype = (TextView) findViewById(R.id.rule_tickettype);
		rule_ticketdetail = (TextView) findViewById(R.id.rule_ticketdetail);
		if (tickettypecode == 1) {
			rule_tickettype.setText(tj_tickettype);
			rule_ticketdetail.setText(tj_tickettypedetail);
		} else if (tickettypecode == 2) {
			rule_tickettype.setText(xj_tickettype);
			rule_ticketdetail.setText(xj_tickettypedetail);
		} else if (tickettypecode == 3) {
			rule_tickettype.setText(jx_tickettype);
			rule_ticketdetail.setText(jx_tickettypedetail);
		} else if (tickettypecode == 4) {
			rule_tickettype.setText(cq_tickettype);
			rule_ticketdetail.setText(cq_tickettypedetail);
		}
		rule_back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				finish();
			}

		});
	}

}
