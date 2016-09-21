package adapter;

import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import model.trendmodel;

public class trendadapter extends BaseAdapter {
	private List<trendmodel> mData;
	private Context mContext;
	private LinearLayout lin_other;

	private LinearLayout lin_first;
	private TextView text_first_expect;

	private TextView text_first_one;

	private TextView text_first_two;

	private TextView text_first_three;

	private TextView text_first_four;

	private TextView text_first_five;

	private TextView text_other_expect;

	private TextView text_other_one;

	private TextView text_other_two;

	private TextView text_other_three;

	private TextView text_other_four;

	private TextView text_other_five;

	public trendadapter(Context context, List data) {

		this.mContext = context;
		this.mData = data;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = View.inflate(mContext, R.layout.trend_number, null);
		LinearLayout lin_other = (LinearLayout) view.findViewById(R.id.lin_other);

		LinearLayout lin_first = (LinearLayout) view.findViewById(R.id.lin_first);

		TextView text_first_expect = (TextView) view.findViewById(R.id.text_first_expect);

		TextView text_first_one = (TextView) view.findViewById(R.id.text_first_one);

		TextView text_first_two = (TextView) view.findViewById(R.id.text_first_two);

		TextView text_first_three = (TextView) view.findViewById(R.id.text_first_three);

		TextView text_first_four = (TextView) view.findViewById(R.id.text_first_four);

		TextView text_first_five = (TextView) view.findViewById(R.id.text_first_five);

		TextView text_other_expect = (TextView) view.findViewById(R.id.text_other_expect);

		TextView text_other_one = (TextView) view.findViewById(R.id.text_other_one);

		TextView text_other_two = (TextView) view.findViewById(R.id.text_other_two);

		TextView text_other_three = (TextView) view.findViewById(R.id.text_other_three);

		TextView text_other_four = (TextView) view.findViewById(R.id.text_other_four);

		TextView text_other_five = (TextView) view.findViewById(R.id.text_other_five);
		trendmodel trend = mData.get(position);
		text_first_expect.setText("第" + trend.getExpect() + "期");
		text_other_expect.setText("第" + trend.getExpect() + "期");
		String temp = "0,0,0,0,0";
		temp = trend.getNo();
		String t[] = temp.split("");

		text_first_one.setText(t[1]);

		text_first_two.setText(t[2]);

		text_first_three.setText(t[3]);

		text_first_four.setText(t[4]);

		text_first_five.setText(t[5]);

		text_other_one.setText(t[1]);

		text_other_two.setText(t[2]);

		text_other_three.setText(t[3]);

		text_other_four.setText(t[4]);

		text_other_five.setText(t[5]);
		if (position == 0) {
			lin_other.setVisibility(view.GONE);
			lin_first.setVisibility(view.VISIBLE);
			Log.d("here", "0");
		} else {
			lin_first.setVisibility(view.GONE);
			lin_other.setVisibility(view.VISIBLE);
			Log.d("here", "1");
		}
		return view;
	}

}
