package com.application.swecha.adapter;

import com.application.swecha.AgendaFragment;
import com.application.swecha.SpeakerFragment;
import com.application.swecha.RegisterFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new RegisterFragment();
		case 1:
			// Games fragment activity
			return new AgendaFragment();
		case 2:
			// Movies fragment activity
			return new SpeakerFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
