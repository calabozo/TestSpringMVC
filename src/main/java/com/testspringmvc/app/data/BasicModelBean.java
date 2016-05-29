package com.testspringmvc.app.data;

public class BasicModelBean {
	int data;

	public void init() {
		data = 1;
	}

	public void destroy() {
		data = 0;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
}
