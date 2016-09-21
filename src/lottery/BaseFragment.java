package lottery;

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

public class BaseFragment extends Fragment {

	private static final String TAG = "BaseFragment";
	public static String curFragmentTag = BaseActivity.curFragmentTag;

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

	public static BaseFragment newInstance(Context context, String tag) {
		BaseFragment baseFragment = null;
		if (TextUtils.equals(tag, context.getString(R.string.word_hall))) {
			baseFragment = new HallFragment();
		} else if (TextUtils.equals(tag, context.getString(R.string.word_recommend))) {
			baseFragment = new RecommendFragment();
		} else if (TextUtils.equals(tag, context.getString(R.string.word_mine))) {
			baseFragment = new MineFragment();
		} else if (TextUtils.equals(tag, context.getString(R.string.word_trend))) {
			baseFragment = new TrendFragment();
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
