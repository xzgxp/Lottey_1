package adapter;

import java.io.InputStream;
import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import model.messagemodel;

public class messageadapter extends BaseAdapter {
	private List<messagemodel> mData;
	private Context mContext;
	private int symble = 1;
	private int getclickposition = 124;
	private String temp;
	InputStream is = null;

	public messageadapter(Context context, List data) {
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
		View view = View.inflate(mContext, R.layout.item_message, null);
		TextView text_message = (TextView) view.findViewById(R.id.text_message);
		messagemodel messagemodel1 = mData.get(position);
		text_message.setText(messagemodel1.getMessage());
		return view;
	}

}
