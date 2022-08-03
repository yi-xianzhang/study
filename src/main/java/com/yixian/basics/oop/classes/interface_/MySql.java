package com.yixian.basics.oop.classes.interface_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : mysql链接
 * @create : 2022-06-12 22:15
 */
public class MySql implements DBInterface{

	@Override
	public void connection() {
		System.out.println("mysql连接数据库");
	}

	@Override
	public void close() {
		System.out.println("mysql关闭数据库连接");
	}
}

