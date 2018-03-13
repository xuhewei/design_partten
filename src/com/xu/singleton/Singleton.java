package com.xu.singleton;
/**
 * 
 * @author xuhewei
   @date 2018/03/13
 * 經典單利模式
 */
public class Singleton {
	
	private static Singleton s = null;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(s==null){
			s = new Singleton();
		}
		return s;
	}
}
