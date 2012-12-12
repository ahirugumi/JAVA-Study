package org.ahirugumi.study.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ロギングクラスインターセプタ
 * ビジネスロジックを挟み込んでログ出力する
 * @author ahirugumi
 */
public class LogicLogging implements InvocationHandler {

	private IBaseLogic logic = null;

	public LogicLogging(IBaseLogic logic) {
		this.logic = logic;
	}

	public Object invoke(Object o, Method method, Object[] os) throws Throwable {
		String arg = (os == null) ? "" : Arrays.toString(os);
		//Startログ
		System.out.println("Start: " + "Method - " + method.getDeclaringClass().getName()
				+ "." + method.getName() + " Args: " + arg);
		
		Object result = null;
		//リフレクションにて、ビジネスロジックの呼び出し
		result = method.invoke(logic, os);
		
		//Endログ
		System.out.println("End: " + "Method - " + method.getDeclaringClass().getName()
				+ "." + method.getName() + " Return: " + result);
		return result;
	}
}
