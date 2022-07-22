package com.umeng.umeng_common_sdk_example;

import android.util.Log;

import com.umeng.commonsdk.UMConfigure;

public class App extends io.flutter.app.FlutterApplication {
	@Override
	public void onCreate() {
		super.onCreate();
		UMConfigure.setLogEnabled(true);
		UMConfigure.preInit(this,"您自己的android端appkey","Umeng");

		Log.i("UMLog", "call UMConfigure.preInit();");

	}
}
