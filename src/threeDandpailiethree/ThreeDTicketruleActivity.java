package threeDandpailiethree;

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

public class ThreeDTicketruleActivity extends Activity {
	private TextView rule_tickettype;
	private TextView rule_ticketdetail;
	private LinearLayout rule_back;
	private int tickettypecode = 1;
	private String threed_tickettype = "福彩3D", pailie_tickettype = "排列三";
	private String threed_tickettypedetail = "8:35更新，每天开奖一期";
	private String pailie_tickettypedetail = "8:35更新，每天开奖一期";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.threed_activity_ticketrule);
		Intent intent = getIntent();
		rule_back = (LinearLayout) findViewById(R.id.rule_back);
		tickettypecode = intent.getIntExtra("tickettypecode", 0);
		rule_tickettype = (TextView) findViewById(R.id.rule_tickettype);
		rule_ticketdetail = (TextView) findViewById(R.id.rule_ticketdetail);
		if (tickettypecode == 5) {
			rule_tickettype.setText(threed_tickettype);
			rule_ticketdetail.setText(threed_tickettypedetail);
		} else if (tickettypecode == 6) {
			rule_tickettype.setText(pailie_tickettype);
			rule_ticketdetail.setText(pailie_tickettypedetail);
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
