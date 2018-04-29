package com.example.hp.chatapplication;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Amol Deshmukh on 29/4/18.
 */

public class ChatPreferenceManager {

    private static final String USER_PREF_FILE_NAME = "chatPrefManager";

    private static ChatPreferenceManager sInstance;
    private final SharedPreferences mPreferences;
    private final SharedPreferences.Editor mEditor;
    private static Context context;

    private ChatPreferenceManager(Context ctx) {
        mPreferences = ctx.getSharedPreferences(USER_PREF_FILE_NAME, Context.MODE_PRIVATE);
        mEditor = mPreferences.edit();
        this.context = ctx;
    }

    public static ChatPreferenceManager instance(Context context) {
        if (sInstance == null) {
            sInstance = new ChatPreferenceManager(context);
        }
        return sInstance;
    }

    private interface Keys {
        String USER_NAME = "userName";
    }

    public void setUserName(String username) {
        mEditor.putString(Keys.USER_NAME, username).apply();
    }

    public String getUserName() {
        return mPreferences.getString(Keys.USER_NAME, null);
    }

}
