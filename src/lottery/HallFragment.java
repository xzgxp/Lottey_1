package lottery;

import java.util.ArrayList;
import java.util.List;

import com.example.lottery.R;

import adapter.tickettypeadapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import model.tickettypemodel;
import threeDandpailiethree.threeDBaseActivityticket;
import ticketpackage.BaseActivityticket;

public class HallFragment extends BaseFragment implements OnClickListener {
	private tickettypeadapter mAdapter;
	private ListView tickettype_list;
	private Context mContext = null;
	private static final String TAG = "MessageFragment";
	private BaseActivity mMainActivity;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View context = inflater.inflate(R.layout.activity_hall, container, false);
		tickettype_list = (ListView) context.findViewById(R.id.tickettype_list);
		mContext = getActivity();
		mAdapter = new tickettypeadapter(mContext, getData());
		tickettype_list.setAdapter(mAdapter);
		mMainActivity = (BaseActivity) getActivity();
		mFragmentManager = getActivity().getSupportFragmentManager();

		// tickettype_list = (ListView)
		// getActivity().findViewById(R.id.tickettype_list);
		tickettype_list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Log.d("case", "case" + 1);
				switch (position) {
				case 0:
					Log.d("case", "case" + 1);
					Intent intent = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent.putExtra("tickettypecode", 1);
					startActivity(intent);
					break;
				case 1:
					Log.d("case", "case" + 2);
					Intent intent1 = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent1.putExtra("tickettypecode", 2);
					startActivity(intent1);
					break;
				case 2:
					Intent intent5 = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent5.putExtra("tickettypecode", 5);
					startActivity(intent5);
					break;
				case 3:
					Log.d("case", "case" + 3);
					Intent intent2 = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent2.putExtra("tickettypecode", 3);
					startActivity(intent2);
					break;
				case 4:
					Log.d("case", "case" + 4);
					Intent intent3 = new Intent(getActivity(), BaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent3.putExtra("tickettypecode", 4);
					startActivity(intent3);
					break;
				case 5:
					Log.d("case", "case" + 3);
					Intent intent6 = new Intent(getActivity(), threeDBaseActivityticket.class);
					// b.putString("ordertype", "baojie");
					intent6.putExtra("tickettypecode", 6);
					startActivity(intent6);
					break;
				default:
					break;
				}
			}
		});
		return context;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		BaseActivity.curFragmentTag = getString(R.string.word_hall);
	}

	// public void onAttach(Activity activity) {
	//
	// super.onAttach(activity);
	//
	//
	// }

	private List<tickettypemodel> getData() {

		List<tickettypemodel> list = new ArrayList<tickettypemodel>();
		tickettypemodel tickettypeinfo = new tickettypemodel();
		tickettypeinfo.setTickettypenumber(1);
		tickettypeinfo.setTickettypename("天津时时彩");
		tickettypeinfo.setTickettypedetail("中奖率高、简单刺激，玩法多样");
		list.add(tickettypeinfo);
		tickettypemodel tickettypeinfo1 = new tickettypemodel();
		tickettypeinfo1.setTickettypenumber(2);
		tickettypeinfo1.setTickettypename("新疆时时彩");
		tickettypeinfo1.setTickettypedetail("开奖节奏快、中奖率高、玩法多样简单");
		list.add(tickettypeinfo1);
		tickettypemodel tickettypeinfo4 = new tickettypemodel();
		tickettypeinfo4.setTickettypenumber(5);
		tickettypeinfo4.setTickettypename("福彩3D");
		tickettypeinfo4.setTickettypedetail("天天开奖，奖金绝不缩水");
		list.add(tickettypeinfo4);
		tickettypemodel tickettypeinfo2 = new tickettypemodel();
		tickettypeinfo2.setTickettypenumber(3);
		tickettypeinfo2.setTickettypename("江西时时彩");
		tickettypeinfo2.setTickettypedetail("数字型玩法、更易组合和分析");
		list.add(tickettypeinfo2);
		tickettypemodel tickettypeinfo3 = new tickettypemodel();
		tickettypeinfo3.setTickettypenumber(4);
		tickettypeinfo3.setTickettypename("重庆时时彩");
		tickettypeinfo3.setTickettypedetail("人气最高、各类玩法应有尽有");
		list.add(tickettypeinfo3);

		tickettypemodel tickettypeinfo5 = new tickettypemodel();
		tickettypeinfo5.setTickettypenumber(6);
		tickettypeinfo5.setTickettypename("排列三");
		tickettypeinfo5.setTickettypedetail("数字型玩法、更易组合和分析");
		list.add(tickettypeinfo5);
		return list;
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.e(TAG, "onAttach-----");

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(TAG, "onCreate------");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.e(TAG, "onActivityCreated-------");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e(TAG, "onStart----->");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG, "onpause");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG, "onStop");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.e(TAG, "ondestoryView");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG, "ondestory");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.d(TAG, "onDetach------");

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

}
