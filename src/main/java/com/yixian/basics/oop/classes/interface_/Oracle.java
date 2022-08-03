package com.yixian.basics.oop.classes.interface_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : Oracle数据库
 * @create : 2022-06-12 22:16
 */
public class Oracle implements DBInterface{

	@Override
	public void connection() {
		System.out.println("Oracle连接数据库");
	}

	@Override
	public void close() {
		System.out.println("Oracle关闭数据库连接");
	}
}

