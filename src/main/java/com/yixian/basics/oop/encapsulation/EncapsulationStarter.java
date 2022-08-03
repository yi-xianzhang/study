package com.yixian.basics.oop.encapsulation;

import org.junit.Test;

/**
 * 面向对象的第一特征之继承
 * <p>
 * 1.封装释义：抽象的数据[属性]和属性的操作[方法]封装在一起，数据被保护在内部，程序的
 * 其他部分仅可通过被授权的操作[方法],才能对数据进行操作
 * 2.电视机就是典型的封装
 * 3.好处：隐藏实现细节，对数据进行验证，保证安全合理
 *
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 封装的开始引导类
 * @create : 2022-06-04 22:17
 */
public class EncapsulationStarter {

	public static void main(String[] args) throws Exception {
		EncapsulationEx encapsulationEx = new EncapsulationEx(3000.0,
			(byte) 125, "欧阳克欧阳克欧阳克");
	}

	@Test
	public void testAccount() throws Exception {
		Account account = new Account();
		account.setName("smit");
		account.setPassWord("123456");
		account.setOver(20.45);
		System.out.println(account.toString());

	}



}



