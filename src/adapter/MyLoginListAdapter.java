package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MyLoginListAdapter extends BaseAdapter{
	protected Context context;
	protected ArrayList<HashMap<String,Object>> list;
	protected int itemLayout;
	protected String from;
	protected int to;
	
	public MyLoginListAdapter(Context context,
			ArrayList<HashMap<String, Object>> list, int itemLayout,
			String from, int to) {
		super();
		this.context = context;
		this.list = list;
		this.itemLayout = itemLayout;
		this.from = from;
		this.to = to;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	class ViewHolder{
		
		public TextView userQQ;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder=null;
		/*
		currentPosition=position;    
		不能使用currentPosition，因为每绘制完一个Item就会更新currentPosition
		这样得到的currentPosition将始终是最后一个Item的position		
		*/
		
		if(convertView==null){
			convertView=LayoutInflater.from(context).inflate(itemLayout, null);
			holder=new ViewHolder();
			
			holder.userQQ=(TextView)convertView.findViewById(to);
			
			convertView.setTag(holder);
		}
		else{
			holder=(ViewHolder)convertView.getTag();
		}
		
		
		holder.userQQ.setText((String)list.get(position).get(from));
		
		
		
		return convertView;
	}

}
