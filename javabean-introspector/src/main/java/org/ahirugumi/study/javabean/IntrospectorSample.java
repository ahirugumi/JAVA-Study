package org.ahirugumi.study.javabean;

/**
 * IntrospectorSample
 * JavaBeanを想定
 */
public class IntrospectorSample 
{
	private String foo;
	private String bar;
	private int baz;
	private Object piyo;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public int getBaz() {
		return baz;
	}

	public void setBaz(int baz) {
		this.baz = baz;
	}

	public Object getPiyo() {
		return piyo;
	}

	public void setPiyo(Object piyo) {
		this.piyo = piyo;
	}

}
