package com.yixian.basics.oop.encapsulation;

import com.yixian.util.StringUtils;

import java.util.Objects;

/**
 * 银行账户
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 银行账号
 * @create : 2022-06-04 23:13
 */
public class Account {

	private String name;

	private double over;

	private String passWord;

	public String getName() {
		return name;
	}

	public double getOver() {
		return over;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setName(String name) throws Exception {
		checkName(name);
		this.name = name;
	}

	public void setOver(double over) throws Exception {
		checkOver(over);
		this.over = over;
	}

	public void setPassWord(String passWord) throws Exception {
		checkPassWord(passWord);
		this.passWord = passWord;
	}

	private void checkName(String name) throws Exception {
		if (StringUtils.isBlank(name) || name.length() < 2 || name.length() > 4)
			throw new Exception("姓名长度必须为2-4位");
	}

	private void checkPassWord(String passWord) throws Exception {
		if (StringUtils.isBlank(passWord) || passWord.length() != 6)
			throw new Exception("密码长度必须为6位");
	}


	private void checkOver(double over) throws Exception {
		if (over <= 20)
			throw new Exception("余额必须大于20");
	}

	public Account(String name, double over, String passWord) throws Exception {
		checkName(name);
		this.name = name;
		checkPassWord(passWord);
		this.passWord = passWord;
		checkOver(over);
		this.over = over;
	}

	public Account() {
	}

	@Override
	public String toString() {
		return "Account{" +
			"name='" + name + '\'' +
			", over=" + over +
			", passWord='" + passWord + '\'' +
			'}';
	}

	public String  showInfo() {
		return this.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Account account = (Account) o;
		return Double.compare(account.over, over) == 0 &&
			Objects.equals(name, account.name) &&
			Objects.equals(passWord, account.passWord);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, over, passWord);
	}
}

