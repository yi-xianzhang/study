package com.yixian.basics.oop.classes.interface_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 电脑
 * @create : 2022-06-12 21:28
 */
public class Camera implements Usb{

	@Override
	public void start() {
		System.out.println(this.getClass().getTypeName() + " : 开始工作");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getTypeName() + " : 结束工作");
	}
}

