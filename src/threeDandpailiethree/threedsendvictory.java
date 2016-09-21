package threeDandpailiethree;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class threedsendvictory extends Activity {
	private LinearLayout lin_base_victory;

	private TextView text_victory_detail;

	private TextView text_ticketname_victory;

	private TextView text_zhuihaobegin_victory;

	private TextView text_maney_victory;

	private TextView text_getrecond_victory;

	private TextView text_goon_victory;

	private LinearLayout lin_loading;

	private TextView text_jixuan_victory;

	private threeDBaseActivityticket BaseActivityticket;
	private SharedPreferences chongqing;
	private SharedPreferences presymbel;
	private int zhu = 0;
	private int times = 0;
	private int expect = 0;
	private String tempticketname = "";
	private String tempticketgroup = "";
	private double moshi = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_sendvictory);
		Intent intent = this.getIntent(); // 获取已有的intent对象
		Bundle bundle = intent.getExtras(); // 获取intent里面的bundle对象
		tempticketgroup = bundle.getString("tempticketgroup");
		tempticketname = bundle.getString("tempticketname");
		expect = bundle.getInt("expect");
		times = bundle.getInt("times");
		zhu = bundle.getInt("zhu");
		moshi = bundle.getDouble("moshi");
		// temptickettype = tickettype[numberposition - 1];
		lin_base_victory = (LinearLayout) findViewById(R.id.lin_base_victory);
		lin_loading = (LinearLayout) findViewById(R.id.lin_loading);
		lin_loading.setVisibility(View.GONE);
		text_victory_detail = (TextView) findViewById(R.id.text_victory_detail);

		text_ticketname_victory = (TextView) findViewById(R.id.text_ticketname_victory);

		text_zhuihaobegin_victory = (TextView) findViewById(R.id.text_zhuihaobegin_victory);

		text_maney_victory = (TextView) findViewById(R.id.text_maney_victory);

		text_getrecond_victory = (TextView) findViewById(R.id.text_getrecond_victory);

		text_goon_victory = (TextView) findViewById(R.id.text_goon_victory);

		text_jixuan_victory = (TextView) findViewById(R.id.text_jixuan_victory);
		chongqing = getSharedPreferences("chongqing", MODE_PRIVATE);
		presymbel = getSharedPreferences("presymbel", MODE_PRIVATE);
		text_victory_detail.setText(tempticketname + "  注单金额" + zhu * expect * times * 2 * moshi + "元");
		text_ticketname_victory.setText(tempticketname);
		text_zhuihaobegin_victory.setText("第" + tempticketgroup + "期（追" + (expect - 1) + "期）");
		text_maney_victory.setText(
				zhu + "注x" + times + "倍x" + expect + "期x" + moshi + "=" + zhu * expect * times * 2 * moshi + "元");
		text_jixuan_victory.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				lin_loading.setVisibility(View.VISIBLE);
				Editor edit = chongqing.edit();
				edit.putInt("chongqing", 10);
				edit.commit();
				finish();
				BaseActivityticket.activity.finish();

			}

		});
		lin_base_victory.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				finish();
			}

		});
		text_goon_victory.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				finish();
			}

		});
		text_getrecond_victory.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Bundle b = new Bundle();
				BaseActivityticket.activity.finish();

				Editor edit = presymbel.edit();
				edit.putInt("fragmentsymble", 1);
				edit.commit();

				finish();
			}

		});
	}

}
