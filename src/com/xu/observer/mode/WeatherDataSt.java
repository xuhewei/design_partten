package com.xu.observer.mode;


import java.util.ArrayList;

import com.xu.observer.observer.Observer;
import com.xu.observer.observer.Subject;
/**
 * 
 * @author xuhewei
   @date 2018/03/13
 *一个观察目标可以对应多个观察者，
 *而且这些观察者之间没有相互联系，可以根据需要增加和删除观察者，
 *使得系统更易于扩展，这就是观察者模式的模式动机
 */

public class WeatherDataSt implements Subject{
	
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private ArrayList<Observer> mObservers;
	public WeatherDataSt()
	{
		mObservers=new ArrayList<Observer>();
	}
	
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
		notifyObservers();
	}

	

	
	
	
	public void setData(float mTemperatrue,float mPressure,float mHumidity)
	{
		this.mTemperatrue=mTemperatrue;
		this.mPressure=mPressure;
		this.mHumidity=mHumidity;
		dataChange();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		mObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(mObservers.contains(o))
		{mObservers.remove(o);}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0,len=mObservers.size();i<len;i++)
		{
			mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
		}
	}

}
