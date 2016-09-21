package adapter;

import java.io.InputStream;
import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import model.recondmodel;

public class recondadapter extends BaseAdapter {
	private List<recondmodel> mData;
	private Context mContext;
	private int symble = 1;
	private int getclickposition = 124;
	private String temp;
	InputStream is = null;

	public recondadapter(Context context, List data) {
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
		View view = View.inflate(mContext, R.layout.item_recond, null);
		TextView text_ticketmouth = (TextView) view.findViewById(R.id.text_ticketmouth);
		TextView text_ticketday = (TextView) view.findViewById(R.id.text_ticketday);
		TextView text_ticketif = (TextView) view.findViewById(R.id.text_ticketif);
		TextView text_ticketcity = (TextView) view.findViewById(R.id.text_ticketcity);
		TextView text_ticketmoney = (TextView) view.findViewById(R.id.text_ticketmoney);
		TextView text_ticketstatue = (TextView) view.findViewById(R.id.text_ticketstatue);
		recondmodel recondmodel1 = mData.get(position);
		String no = recondmodel1.getTicketOrderNo();
		String t[] = no.split("");
		String mouth = t[5] + t[6] + "月";
		String day = t[7] + t[8];
		String city = recondmodel1.getTicketContent();
		String c[] = city.split("");
		city = c[1] + c[2] + c[3] + c[4] + c[5];
		String tempcity = c[1] + c[2] + c[3] + c[4];
		if (tempcity.equals("福彩3D")) {
			city = tempcity;
		}
		tempcity = c[1] + c[2] + c[3];
		if (tempcity.equals("排列三")) {
			city = tempcity;
		}
		String money = recondmodel1.getTicketmoney();
		money = money + "元";
		text_ticketstatue.setText(recondmodel1.getTicketstatue());
		text_ticketmoney.setText(money);
		text_ticketcity.setText(city);
		text_ticketday.setText(day);
		text_ticketmouth.setText(mouth);
		int temp;
		temp = recondmodel1.getTicketif();
		if (temp != 1) {
			text_ticketif.setVisibility(View.GONE);
			text_ticketmouth.setVisibility(View.GONE);
			text_ticketday.setVisibility(View.GONE);
		}
		return view;
	}

}
