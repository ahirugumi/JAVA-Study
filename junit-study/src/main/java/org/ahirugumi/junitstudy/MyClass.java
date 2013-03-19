/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ahirugumi.junitstudy;

/**
 *
 * @author tomohiro
 */
public class MyClass {
	public enum Weeks
	{
		MON,TUE,WED,THU,FRI,SAT,SUN
	}
	
	public enum Weeks_JP
	{
		月,火,水,木,金,土,日
	}

	public String getName()
	{
		return "myclass";
	}
	
	public Weeks_JP getWeek(Weeks wk)
	{
		Weeks_JP ret=null;
		switch (wk)
		{
			case MON:ret = Weeks_JP.月; break;
			case TUE:ret = Weeks_JP.火; break;
			case WED:ret = Weeks_JP.水; break;
			case THU:ret = Weeks_JP.木; break;
			case FRI:ret = Weeks_JP.金; break;
			case SAT:ret = Weeks_JP.土; break;
			case SUN:ret = Weeks_JP.日; break;
		}
		return ret;
	}
	public void throwsNullPointerException()
	{
		throw new NullPointerException("nullpo");
	}
}
