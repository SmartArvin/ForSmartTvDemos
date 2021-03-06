package com.ktc.serialport.utils;

import com.mstar.android.tvapi.common.TvManager;
import com.mstar.android.tvapi.common.exception.TvCommonException;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;

/**
*TODO KTC数据库操作
*@author Arvin
*@Time 2018-1-9 上午10:23:22
*/
public class KtcDataUtil {
	
	private static final String TAG = "KtcDataUtil";
	private static KtcDataUtil mDataBaseUtil;
	private static Context mContext = null;
	
	//user_setting.db systemsetting table index
	public final static short T_SystemSetting_IDX = 0x19;
	public final static short T_SoundSetting_IDX = 0x17;
	
	public static KtcDataUtil getInstance(Context context) {
		mContext = context;
    	if (mDataBaseUtil == null) {
    		mDataBaseUtil = new KtcDataUtil();
    	}
    	return mDataBaseUtil;
    }

	/**
	 * TODO get the user_setting.db systemsetting table tag value
	 * @param String tag
	 * @return int
	 */
	public int getValueDatabase_systemsetting(String tag) {
		int bAutoBacklightSign = 0;
		Cursor cursor = mContext.getContentResolver().query(
				Uri.parse("content://mstar.tv.usersetting/systemsetting"),
				null, null, null, null);
		if (cursor.moveToNext())
			bAutoBacklightSign = cursor.getInt(cursor
					.getColumnIndex(tag));
		cursor.close();
		return bAutoBacklightSign;
	}

	/**
	 * TODO set the user_setting.db systemsetting table tag value
	 * @param String tag , int values
	 * @return void
	 */
	public void updateDatabase_systemsetting(String tag,int values) {
		int ret = -1;
		ContentValues vals = new ContentValues();
		vals.put(tag, values);
		try {
			ret = mContext.getContentResolver().update(
					Uri.parse("content://mstar.tv.usersetting/systemsetting"),
					vals, null, null);
		} catch (SQLException e) {
		}
		if (ret == -1) {
			System.out.println("update tbl_SystemSetting ignored");
		}
		
        try {
			TvManager.getInstance().getDatabaseManager().setDatabaseDirtyByApplication(T_SystemSetting_IDX);
		} catch (TvCommonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
