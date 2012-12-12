package org.ahirugumi.study.loggingproxy;

import java.lang.reflect.Proxy;
import org.junit.Test;

public class LoggingProxyTest {

	@Test
	public void testLoggingProxy() {
		ClassLoader loader = IBaseLogic.class.getClassLoader();
		Class<?>[] inter = new Class[]{IBaseLogic.class};

		//ビジネスロジックをインスタンス化
		//LogicLogging（インターセプタ）にビジネスロジックを渡す
		//実際は、MyLogicにロギングするクラスが織り込まれる
		LogicLogging mylogic = new LogicLogging(new MyLogic());

		//プロキシクラスを取得する
		IBaseLogic logic = (IBaseLogic) Proxy.newProxyInstance(loader, inter, mylogic);

		//ビジネスロジックの呼び出し
		logic.method1(new String[]{"a", "b", "c"});
		logic.method2(3);
		logic.method3();
	}
}
