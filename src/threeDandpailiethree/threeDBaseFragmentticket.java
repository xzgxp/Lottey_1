package threeDandpailiethree;

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

public class threeDBaseFragmentticket extends Fragment {

	private static final String TAG = "BaseFragment";
	public static String curFragmentTag = threeDBaseActivityticket.curFragmentTag;

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

	public static threeDBaseFragmentticket newInstance(Context context, String tag) {
		threeDBaseFragmentticket baseFragment = null;
		if (TextUtils.equals(tag, context.getString(R.string.three_direct_double_name))) {
			baseFragment = new three_direct_double();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_direct_single_name))) {
			baseFragment = new three_direct_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_direct_sum_name))) {
			baseFragment = new three_direct_sum();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_group_three_name))) {
			baseFragment = new three_group_three();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_group_six_name))) {
			baseFragment = new three_group_six();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_group_sum_name))) {
			baseFragment = new three_group_sum();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_group_combination_name))) {
			baseFragment = new three_group_combination();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_group_three_single_name))) {
			baseFragment = new three_group_three_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.three_group_six_single_name))) {
			baseFragment = new three_group_six_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.top_two_direct_double_name))) {
			baseFragment = new top_two_direct_double();
		} else if (TextUtils.equals(tag, context.getString(R.string.top_two_direct_single_name))) {
			baseFragment = new top_two_direct_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.top_two_group_double_name))) {
			baseFragment = new top_two_group_double();
		} else if (TextUtils.equals(tag, context.getString(R.string.top_two_group_single_name))) {
			baseFragment = new top_two_group_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottom_two_direct_double_name))) {
			baseFragment = new bottom_two_direct_double();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottom_two_direct_single_name))) {
			baseFragment = new bottom_two_direct_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottom_two_group_double_name))) {
			baseFragment = new bottom_two_group_double();
		} else if (TextUtils.equals(tag, context.getString(R.string.bottom_two_group_single_name))) {
			baseFragment = new bottom_two_group_single();
		} else if (TextUtils.equals(tag, context.getString(R.string.fixedposition_name))) {
			baseFragment = new fixedposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.onenumber_notposition))) {
			baseFragment = new onenumber_notposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.twonumber_notposition))) {
			baseFragment = new twonumber_notposition();
		} else if (TextUtils.equals(tag, context.getString(R.string.threeD_maxmin_bottom_name))) {
			baseFragment = new maxmin_bottom();
		} else if (TextUtils.equals(tag, context.getString(R.string.threeD_maxmin_toptwo_name))) {
			baseFragment = new maxmin_toptwo();
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
