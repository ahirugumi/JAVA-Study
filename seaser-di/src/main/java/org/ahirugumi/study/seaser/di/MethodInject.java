package org.ahirugumi.study.seaser.di;

import java.util.ArrayList;
import java.util.List;

public class MethodInject {

	private List<IDomain> domains = new ArrayList<IDomain>();

	public void addDomain(IDomain domain) {
		System.out.println("MethodInject -> addDomain : " + domain.getClass().getName());
		domains.add(domain);
	}

	public void execute() {
		System.out.println("MethodInject -> execute() start");
		for (IDomain domain : domains) {
			domain.execute();
		}
		System.out.println("MethodInject -> execute() end");
	}
}
