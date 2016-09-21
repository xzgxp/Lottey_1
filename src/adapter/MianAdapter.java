package adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MianAdapter  extends FragmentPagerAdapter{
	ArrayList<Fragment> myfragment;

	public MianAdapter(FragmentManager fm, ArrayList<Fragment> myfragment) {
		super(fm);
		this.myfragment = myfragment;
	}

	@Override
	public Fragment getItem(int arg0) {
		if (myfragment != null) {
			return myfragment.get(arg0);
		}
		return null;
	}

	@Override
	public int getCount() {
		if (myfragment != null) {
			return myfragment.size();
		}
		return 0;
	}

}
