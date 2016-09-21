package adapter;

import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import model.tickettypemodel;

public class tickettypeadapter extends BaseAdapter {
	private List<tickettypemodel> mData;
	private Context mContext = null;
	private int temp;

	public tickettypeadapter(Context hallFragment, List data) {
		this.mContext = hallFragment;
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
		View view = View.inflate(mContext, R.layout.item_tickettype, null);
		// view=LayoutInflater.from(getActivity()).inflate(R.layout.item, null);
		ImageView ImageView_picturehall = (ImageView) view.findViewById(R.id.ImageView_picturehall);
		TextView textview_ticketname = (TextView) view.findViewById(R.id.textview_ticketname);
		TextView textview_ticketdetail = (TextView) view.findViewById(R.id.textview_ticketdetail);
		int totalsize = getCount();
		tickettypemodel tickettypeinfo = mData.get(position);
		temp = tickettypeinfo.getTickettypenumber();
		switch (temp) {
		case 1:
			ImageView_picturehall.setImageResource(R.drawable.lottery_tj_logo);
			break;
		case 2:
			ImageView_picturehall.setImageResource(R.drawable.lottery_xj_logo);
			break;
		case 3:
			ImageView_picturehall.setImageResource(R.drawable.lottery_jx_logo);
			break;
		case 4:
			ImageView_picturehall.setImageResource(R.drawable.lottery_cq_logo);
			break;
		case 5:
			ImageView_picturehall.setImageResource(R.drawable.lottery_3d_logo);
			break;
		case 6:
			ImageView_picturehall.setImageResource(R.drawable.pailie3);
			break;
		default:
			break;
		}
		textview_ticketname.setText(tickettypeinfo.getTickettypename());
		textview_ticketdetail.setText(tickettypeinfo.getTickettypedetail());
		return view;
	}
}
