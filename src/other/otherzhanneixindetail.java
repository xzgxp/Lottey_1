package other;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class otherzhanneixindetail extends Activity {
	private String titles = "";
	private String times = "";
	private String content = "";
	private TextView text;
	private TextView time;
	private TextView title;
	private LinearLayout Lin_back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.other_zhanmeixingdetail);
		Lin_back = (LinearLayout) findViewById(R.id.Lin_back);
		text = (TextView) findViewById(R.id.text);
		time = (TextView) findViewById(R.id.time);
		title = (TextView) findViewById(R.id.title);
		Intent intent = this.getIntent(); // 获取已有的intent对象
		Bundle bundle = intent.getExtras(); // 获取intent里面的bundle对象
		content = bundle.getString("content");
		times = bundle.getString("time");
		titles = bundle.getString("title");
		text.setText(content);
		time.setText(times);
		title.setText(titles);
		Lin_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

}
