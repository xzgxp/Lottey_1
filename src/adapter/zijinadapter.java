package adapter;

import java.io.InputStream;
import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import model.zijinmodel;

public class zijinadapter extends BaseAdapter {
	private List<zijinmodel> mData;
	private Context mContext;
	private int symble = 1;
	private int getclickposition = 124;
	private String temp;
	InputStream is = null;

	public zijinadapter(Context context, List data) {
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
		View view = View.inflate(mContext, R.layout.item_zijin, null);
		TextView text_money = (TextView) view.findViewById(R.id.text_money);
		TextView text_status = (TextView) view.findViewById(R.id.text_status);
		TextView text_data = (TextView) view.findViewById(R.id.text_data);
		zijinmodel zijinmodel1 = mData.get(position);
		text_data.setText(zijinmodel1.getTime());
		text_money.setText(zijinmodel1.getBiandong() + "元");
		text_status.setText(getstatus(zijinmodel1.getStatus()));
		return view;
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
}
