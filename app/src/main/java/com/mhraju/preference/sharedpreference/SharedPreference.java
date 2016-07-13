package com.mhraju.preference.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by MaksudulHasan on 12-Jul-16.
 */
public class SharedPreference {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;
    private static final String PREFERENCE_NAME = "raju";
    private static final String NAME_KEY = "message";
    private static final String USER_NAME = "user_name";
    private static final String USER_PASSWORD = "user_password";

    public SharedPreference(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME,context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveUserData(String name,String password){
        HashMap map = new HashMap();
        map.put(USER_NAME, name );
        map.put(USER_PASSWORD, password );
        editor.putString(NAME_KEY,map.toString());
        editor.commit();
    }
/**
    public void saveUserData(String name,String password){
        HashMap map = new HashMap();
        map.put( new Integer( 1 )+"name", name );
        map.put( new Integer( 1 )+"password", password );
        editor.putString(NAME_KEY,map.toString());
        editor.commit();
    }
*/

    public String showUserData(){
        String preferenceData = sharedPreferences.getString(NAME_KEY,"No data found");
        return preferenceData;
    }
}

