package ticketpackage;

import com.example.lottery.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import fourteen.Bottompthreegroupsixsingle;
import fourteen.Bottompthreegroupthreesingle;
import fourteen.Bottompthreemixgroup;
import fourteen.Bottomthreedirectsingle;
import fourteen.Fivedirectsingle;
import fourteen.Fourdirectsingle;
import fourteen.Topthreedirectsingle;
import fourteen.Topthreegroupsixsingle;
import fourteen.Topthreegroupthreesingle;
import fourteen.Topthreemixgroup;
import fourteen.Twodirectbottomtwosingle;
import fourteen.Twodirecttoptwosingle;
import fourteen.Twogroupbottomtwosingle;
import fourteen.Twogrouptoptwosingle;

public class BaseFragmentticket extends Fragment {

	private static final String TAG = "BaseFragment";
	public static String curFragmentTag = BaseActivityticket.curFragmentTag;

	public FragmentManager mFragmentManager;
	public FragmentTransaction mFragmentTransaction;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.d(TAG, "onAttach------");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		Log.d(TAG, "onCreate------");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		Log.d(TAG, "onCreateView-------");
		return super.onCreateView(inflater, container, savedInstanceState);

	}

	public static BaseFragmentticket newInstance(Context context, String tag) {
		BaseFragmentticket baseFragment = null;
		if (TextUtils.equals(tag, context.getString(R.string.five_direct_double_name))) {
			baseFragment = new Fivedirectdouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_120_name))) {
			baseFragment = new Fivegroup120();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_direct_double_name))) {
			baseFragment = new Fivedirectdouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_120_name))) {
			baseFragment = new Fivegroup120();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_60_name))) {
			baseFragment = new Fivegroup60();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_30_name))) {
			baseFragment = new Fivegroup30();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_20_name))) {
			baseFragment = new Fivegroup20();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_10_name))) {
			baseFragment = new Fivegroup10();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_group_5_name))) {
			baseFragment = new Fivegroup5();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_direct_double_name))) {
			baseFragment = new Fourdirectdouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_group_24_name))) {
			baseFragment = new Fourgroup24();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_group_12_name))) {
			baseFragment = new Fourgroup12();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_direct_double_name))) {
			baseFragment = new Topthreedirectdouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_group_three_name))) {
			baseFragment = new Topthreegroup3();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_group_six_name))) {
			baseFragment = new Topthreegroup6();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_group_sum_name))) {
			baseFragment = new Topthreegroupsum();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_group_container_name))) {
			baseFragment = new Topthreegroupcontainer();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_direct_double_name))) {
			baseFragment = new Bottomthreedirectdouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_group_span_name))) {
			baseFragment = new Bottomthreedirectspan();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_group_three_name))) {
			baseFragment = new Bottomthreegroup3();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_group_six_name))) {
			baseFragment = new Bottomthreegroup6();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_group_sum_name))) {
			baseFragment = new Bottomthreegroupsum();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_group_container_name))) {
			baseFragment = new Bottomthreegroupcontainer();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_bottomtwo_double_name))) {
			baseFragment = new Twodirectbottomtwodouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_bottomtwo_sum_name))) {
			baseFragment = new Twodirectbottomtwosum();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_bottomtwo_span_name))) {
			baseFragment = new Twodirectbottomtwospan();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_toptwo_double_name))) {
			baseFragment = new Twodirecttoptwodouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_toptwo_span_name))) {
			baseFragment = new Twodirecttoptwospan();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_bottomtwo_double_name))) {
			baseFragment = new Twogroupbottomtwodouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_toptwo_double_name))) {
			baseFragment = new Twogrouptoptwodouble();
		} else if (TextUtils.equals(tag, context.getString(R.string.fixed_position_name))) {
			baseFragment = new Fixedposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_bottomthree_one_notposition_name))) {
			baseFragment = new Threebottomthreeonenotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_bottomthree_two_notposition_name))) {
			baseFragment = new Threebottomthreetwonotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_topthree_one_notposition_name))) {
			baseFragment = new Threetopthreeonenotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_topthree_two_notposition_name))) {
			baseFragment = new Threetopthreetwonotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_bottomfour_two_notposition_name))) {
			baseFragment = new Fourbottomfourtwonotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_bottomfive_two_notposition_name))) {
			baseFragment = new Fivebottomfivetwonotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_bottomfive_three_notposition_name))) {
			baseFragment = new Fivebottomfivethreenotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_toptwo_sum_name))) {
			baseFragment = new Twogrouptoptwosum();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_group_6_name))) {
			baseFragment = new Fourgroup6();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_group_4_name))) {
			baseFragment = new Fourgroup4();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_direct_sum_name))) {
			baseFragment = new Bottomthreedirectsum();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_direct_sum_name))) {
			baseFragment = new Topthreedirectsum();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_direct_span_name))) {
			baseFragment = new Topthreedirectspan();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_sum_end_name))) {
			baseFragment = new Topthreesumend();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_sum_end_name))) {
			baseFragment = new Bottomthreesumend();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_toptwo_sum_name))) {
			baseFragment = new Twodirecttoptwosum();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_toptwo_container_name))) {
			baseFragment = new Twogrouptoptwocontainer();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_bottomtwo_container_name))) {
			baseFragment = new Twogroupbottomtwocontainer();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_bottomtwo_sum_name))) {
			baseFragment = new Twogroupbottomtwosum();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_bottomfour_one_notposition_name))) {
			baseFragment = new Fourbottomfouronenotposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.maxmin_bottomtwo_name))) {
			baseFragment = new Maxminbottomtwo();
		} else if (TextUtils.equals(tag, context.getString(R.string.maxmin_bottomthree_name))) {
			baseFragment = new Maxminbottomthree();
		} else if (TextUtils.equals(tag, context.getString(R.string.maxmin_toptwo_name))) {
			baseFragment = new Maxmintoptwo();
		} else if (TextUtils.equals(tag, context.getString(R.string.maxmin_topthree_name))) {
			baseFragment = new Maxmintopthree();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottompthree_group_six_single_name))){
			baseFragment = new Bottompthreegroupsixsingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottompthree_group_three_single_name))){
			baseFragment = new Bottompthreegroupthreesingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottompthree_mix_group_name))){
			baseFragment = new Bottompthreemixgroup();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottomthree_direct_single_name))){
			baseFragment = new Bottomthreedirectsingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.five_direct_single_name))){
			baseFragment = new Fivedirectsingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.four_direct_single_name))){
			baseFragment = new Fourdirectsingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_direct_single_name))){
			baseFragment = new Topthreedirectsingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_group_six_single_name))){
			baseFragment = new Topthreegroupsixsingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_group_three_single_name))){
			baseFragment = new Topthreegroupthreesingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.topthree_mix_group_name))){
			baseFragment = new Topthreemixgroup();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_bottomtwo_single_name))){
			baseFragment = new Twodirectbottomtwosingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_direct_toptwo_single_name))){
			baseFragment = new Twodirecttoptwosingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_bottomtwo_single_name))){
			baseFragment = new Twogroupbottomtwosingle();
		} else if (TextUtils.equals(tag, context.getString(R.string.two_group_toptwo_single_name))){
			baseFragment = new Twogrouptoptwosingle();
		}
		return baseFragment;

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

		Log.d(TAG, "onActivityCreated------");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(TAG, "onStart------");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(TAG, "onResume------");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(TAG, "onPause------");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(TAG, "onStop------");
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.d(TAG, "onDestroyView------");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(TAG, "onDestroy------");
	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.d(TAG, "onDetach------");
	}

}
