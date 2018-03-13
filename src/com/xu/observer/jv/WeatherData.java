package com.xu.observer.jv;


import java.util.Observable;
/*
 * 使用java内置的类，注意在更改数据时调用setChanged();方法，通知notifyObservers（）观察者
 */
public class WeatherData extends Observable{
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	
	public float getTemperature()
	{
		return mTemperatrue;
		
	}
	
	public float getPressure()
	{
		return mPressure;
		
	}
	
	public float getHumidity()
	{
		return mHumidity;
		
	}
	
	
	public void dataChange()
	{
		this.setChanged();
		this.notifyObservers(new Data(getTemperature(),getPressure(),getHumidity()));
		
	}
	
	
	public void setData(float mTemperatrue,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperatrue;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}
	
	public class Data
	{
		public float mTemperatrue;
		public float mPressure;
		public float mHumidity;
		public Data(float mTemperatrue,float mPressure,float mHumidity)
		{
			this.mTemperatrue=mTemperatrue;
			this.mPressure=mPressure;
			this.mHumidity=mHumidity;
		}
	}
	
}
