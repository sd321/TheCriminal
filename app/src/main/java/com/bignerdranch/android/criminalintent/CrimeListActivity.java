package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by surya_dahiya on 16-05-2017.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}