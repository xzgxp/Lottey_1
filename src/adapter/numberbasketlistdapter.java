package adapter;

import java.text.DecimalFormat;
import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import model.numberbasketmodel;
import ticketpackage.numberbasket;

public class numberbasketlistdapter extends BaseAdapter implements OnClickListener {
	private List<numberbasketmodel> mData;
	private Context mContext = null;
	private int temp;
	private Callback mCallback;
	private LayoutInflater mInflater;

	public numberbasketlistdapter(Context context, List data, Callback callback) {
		this.mContext = context;
		this.mData = data;
		mInflater = LayoutInflater.from(context);
		mCallback = callback;
	}

	public interface Callback {
		public void click(View v);
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

	// @Override
	// public View getView(int position, View convertView, ViewGroup parent) {
	// // TODO Auto-generated method stub
	// final View view = View.inflate(mContext, R.layout.item_numberbasketlist,
	// null);
	// // view=LayoutInflater.from(getActivity()).inflate(R.layout.item, null);
	// final numberbasket mnumberbasket = new numberbasket();
	// final int temp = position;
	// ImageButton ImageButton_deleteitem = (ImageButton)
	// view.findViewById(R.id.ImageButton_deleteitem);
	// LinearLayout show_number = (LinearLayout)
	// view.findViewById(R.id.show_number);
	// LinearLayout clear_number = (LinearLayout)
	// view.findViewById(R.id.clear_number);
	// TextView text_list_number = (TextView)
	// view.findViewById(R.id.text_list_number);
	// TextView text_list_tickettype = (TextView)
	// view.findViewById(R.id.text_list_tickettype);
	// TextView text_list_ticketdetail = (TextView)
	// view.findViewById(R.id.text_list_ticketdetail);
	// TextView TextView_delete_btn1 = (TextView)
	// view.findViewById(R.id.TextView_delete_btn1);
	// TextView TextView_delete_btn2 = (TextView)
	// view.findViewById(R.id.TextView_delete_btn2);
	// numberbasketmodel numberbasketmodelinfo = mData.get(position);
	// text_list_number.setText(numberbasketmodelinfo.getNumber());
	// text_list_tickettype.setText(numberbasketmodelinfo.getTickettype());
	// text_list_ticketdetail.setText(numberbasketmodelinfo.getNumberofticket()
	// + "注x1倍x2元="
	// + 2 * numberbasketmodelinfo.getNumberofticket() + "元");
	// int clear = numberbasketmodelinfo.getClearint();
	// int delete = numberbasketmodelinfo.getDeleteint();
	// if (delete == -1) {
	// ImageButton_deleteitem.setVisibility(view.INVISIBLE);
	//
	// } else {
	// ImageButton_deleteitem.setVisibility(view.VISIBLE);
	// }
	// if (clear == 1) {
	// clear_number.setVisibility(view.VISIBLE);
	// show_number.setVisibility(view.GONE);
	// } else {
	// clear_number.setVisibility(view.GONE);
	// show_number.setVisibility(view.VISIBLE);
	// }
	// TextView_delete_btn2.setOnClickListener(new View.OnClickListener() {
	//
	// @Override
	// public void onClick(View v) {
	// // TODO Auto-generated method stub
	// // mnumberbasket.clearnumber();
	// Log.d("adapter", "adapter");
	// Log.d("adapter", "adapter" + temp);
	// for (int i = 0; i < temp; i++) {
	// mData.remove(0);
	// notifyDataSetChanged();
	// }
	// mnumberbasket.clearnumber();
	// }
	// });
	// TextView_delete_btn1.setOnClickListener(new View.OnClickListener() {
	//
	// @Override
	// public void onClick(View v) {
	// // TODO Auto-generated method stub
	// // mnumberbasket.clearnumber();
	// Log.d("adapter", "adapter");
	// Log.d("adapter", "adapter" + temp);
	// for (int i = 0; i < temp; i++) {
	// mData.remove(0);
	// notifyDataSetChanged();
	// }
	// mnumberbasket.clearnumber();
	// }
	// });
	// return view;
	// }
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Log.i("tag", "getView");
		ViewHolder holder = null;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_numberbasketlist, null);
			holder = new ViewHolder();
			holder.ImageButton_deleteitem = (ImageButton) convertView.findViewById(R.id.ImageButton_deleteitem);
			holder.show_number = (LinearLayout) convertView.findViewById(R.id.show_number);
			holder.clear_number = (LinearLayout) convertView.findViewById(R.id.clear_number);
			holder.text_list_number = (TextView) convertView.findViewById(R.id.text_list_number);
			holder.text_list_tickettype = (TextView) convertView.findViewById(R.id.text_list_tickettype);
			holder.text_list_ticketdetail = (TextView) convertView.findViewById(R.id.text_list_ticketdetail);
			holder.TextView_delete_btn1 = (TextView) convertView.findViewById(R.id.TextView_delete_btn1);
			holder.TextView_delete_btn2 = (TextView) convertView.findViewById(R.id.TextView_delete_btn2);
			holder.LinearLayout_deleteitem = (LinearLayout) convertView.findViewById(R.id.LinearLayout_deleteitem);
			// holder.textView = (TextView)
			// convertView.findViewById(R.id.textView1);
			// holder.button = (Button) convertView.findViewById(R.id.button1);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		numberbasketmodel numberbasketmodelinfo = mData.get(position);
		// holder.textView.setText(mData.get(position));

		// holder.show_number.setOnClickListener(this);
		// holder.show_number.setTag(position);
		holder.TextView_delete_btn2.setOnClickListener(this);
		holder.TextView_delete_btn2.setTag(position);
		holder.LinearLayout_deleteitem.setOnClickListener(this);
		holder.LinearLayout_deleteitem.setTag(position);
		holder.ImageButton_deleteitem.setOnClickListener(this);
		holder.ImageButton_deleteitem.setTag(position);
		holder.TextView_delete_btn1.setOnClickListener(this);
		holder.TextView_delete_btn1.setTag(position);
		holder.text_list_number.setText(numberbasketmodelinfo.getNumber());
		holder.text_list_tickettype.setText(numberbasketmodelinfo.getTickettype());
		DecimalFormat df = new DecimalFormat("0.0000");
		double temp = 2 * numberbasketmodelinfo.getNumberofticket() * numberbasketmodelinfo.getMoshi()
				* numberbasketmodelinfo.getTimes();
		String str = df.format(temp);
		holder.text_list_ticketdetail.setText(numberbasketmodelinfo.getNumberofticket() + "注x"
				+ numberbasketmodelinfo.getTimes() + "倍x2元x" + numberbasketmodelinfo.getMoshi() + "=" + str + "元");
		int clear = numberbasketmodelinfo.getClearint();
		int delete = numberbasketmodelinfo.getDeleteint();
		if (delete == -1) {
			holder.ImageButton_deleteitem.setVisibility(convertView.INVISIBLE);

		} else {
			holder.ImageButton_deleteitem.setVisibility(convertView.VISIBLE);
		}
		if (clear == 1) {
			holder.clear_number.setVisibility(convertView.VISIBLE);
			holder.show_number.setVisibility(convertView.GONE);
		} else {
			holder.clear_number.setVisibility(convertView.GONE);
			holder.show_number.setVisibility(convertView.VISIBLE);
		}
		return convertView;
	}

	public class ViewHolder {
		public TextView textView;
		public Button button;
		public ImageButton ImageButton_deleteitem;
		public LinearLayout show_number;
		public LinearLayout clear_number;
		public TextView text_list_number;
		public TextView text_list_tickettype;
		public TextView text_list_ticketdetail;
		public TextView TextView_delete_btn2;
		public TextView TextView_delete_btn1;
		public LinearLayout LinearLayout_deleteitem;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mCallback.click(v);
	}

}
