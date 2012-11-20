package org.ahirugumi.study.seaser.di.test;

import org.ahirugumi.study.seaser.di.SetterInject;
import org.junit.Test;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public class SeaserDiTest {

	/**
	 * SetterInjection Test
	 */
	@Test
	public void testSetterInject() {
		S2Container con = S2ContainerFactory.create("org/ahirugumi/study/seaser/di/setter-inject.dicon");
		con.init();
		SetterInject ap = (SetterInject) con.getComponent(SetterInject.class);
		ap.execute();
	}
}
