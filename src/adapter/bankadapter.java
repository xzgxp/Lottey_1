package adapter;

import java.io.InputStream;
import java.util.List;

import com.example.lottery.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import model.bankmodel;
import model.bankmodel;

public class bankadapter extends BaseAdapter {
	private List<bankmodel> mData;
	private Context mContext;
	private int symble = 1;
	private int getclickposition = 124;
	private String temp;
	InputStream is = null;

	public bankadapter(Context context, List data) {
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
		View view = View.inflate(mContext, R.layout.item_bank, null);
		TextView text_bankname = (TextView) view.findViewById(R.id.text_bankname);
		TextView text_banknumber = (TextView) view.findViewById(R.id.text_banknumber);
		TextView text_picture = (TextView) view.findViewById(R.id.text_picture);
		bankmodel bankmodel1 = mData.get(position);
		text_bankname.setText(bankmodel1.getBank());
		String number = bankmodel1.getCard();
		String n[] = number.split("");
		String result = n[n.length - 4] + n[n.length - 3] + n[n.length - 2] + n[n.length - 1];
		text_banknumber.setText("尾号" + result);
		String temp = bankmodel1.getBank();
		if (temp.equals("中国银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_zgyh_logo);
		} else if (temp.equals("建设银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_jsyh_logo);
		} else if (temp.equals("工商银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_gsyh_logo);
		} else if (temp.equals("农业银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_nyyh_logo);
		} else if (temp.equals("招商银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_zsyh_logo);
		} else if (temp.equals("民生银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_msyh_logo);
		} else if (temp.equals("交通银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_jtyh_logo);
		} else if (temp.equals("中国邮政")) {
			text_picture.setBackgroundResource(R.drawable.bank_yzcx_logo);
		} else if (temp.equals("中信银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_zxyh_logo);
		} else if (temp.equals("华夏银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_hxyh_logo);
		} else if (temp.equals("光大银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_gdyh_logo);
		} else if (temp.equals("广发银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_gfyh_logo);
		} else if (temp.equals("平安银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_payh_logo);
		} else if (temp.equals("兴业银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_xyyh_logo);
		} else if (temp.equals("恒丰银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_hfyh_logo);
		} else if (temp.equals("友利银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_ylyh_logo);
		} else if (temp.equals("浦发银行")) {
			text_picture.setBackgroundResource(R.drawable.bank_pfyh_logo);
		}
		return view;
	}
}
