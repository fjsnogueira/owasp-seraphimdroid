package org.owasp.seraphimdroid.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.owasp.seraphimdroid.CallLogFragment;
import org.owasp.seraphimdroid.SMSLogFragment;
import org.owasp.seraphimdroid.USSDLogFragment;

public class LogSwipeAdapter extends FragmentPagerAdapter{

	public LogSwipeAdapter(FragmentManager fragmentManager) {
		super(fragmentManager);
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = null;
		switch(position){
		case 0:
			fragment = new CallLogFragment();
			break;
		case 1:
			fragment = new USSDLogFragment();
			break;
		case 2:
			fragment = new SMSLogFragment();
			break;
		}
		
		return fragment;
	}

	@Override
	public int getCount() {
		return 3;
	}

}
