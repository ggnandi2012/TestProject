package com.example.testproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service{
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return iBinder;
	}
	
	com.remote.aidl.Addition.Stub iBinder = new com.remote.aidl.Addition.Stub()
	{
		public int add(int num1, int num2) 
		{
			return num1+num2;
		}
	};
	public boolean onUnbind(Intent intent) {
		return false;
	};
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}

}
