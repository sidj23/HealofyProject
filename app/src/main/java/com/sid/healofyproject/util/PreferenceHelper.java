package com.sid.healofyproject.util;

import android.content.Context;
import android.content.SharedPreferences;

import static com.sid.healofyproject.util.AppConstants.PREF_NAME;

public class PreferenceHelper {


    private static final String PREF_KEY_DATA = "PREF_KEY_DATA";


    private final SharedPreferences mPrefs;

    public PreferenceHelper(Context context) {
        this.mPrefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

}
