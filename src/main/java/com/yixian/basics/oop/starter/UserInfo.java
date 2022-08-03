package com.yixian.basics.oop.starter;

import java.util.Date;
import java.util.Objects;

/**
 * @author Administrator
 */
public class UserInfo implements Comparable<UserInfo> {



	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 用户编码
	 */
	private String userCode;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 登录名
	 */
	private String loginName;
	/**
	 * 用户部门
	 */
	private String departCode;
	/**
	 * 排序号
	 */
	private Integer order;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 出生年月
	 */
	private Date birth;
	/**
	 * 学历
	 */
	private String education;

	public UserInfo() {
	}

	public UserInfo(int age, String userCode, String password, String userName,
	                String loginName, String departCode, Integer order,
	                String idCard, Date birth, String education) {
		this.age = age;
		this.userCode = userCode;
		this.password = password;
		this.userName = userName;
		this.loginName = loginName;
		this.departCode = departCode;
		this.order = order;
		this.idCard = idCard;
		this.birth = birth;
		this.education = education;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getDepartCode() {
		return departCode;
	}

	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UserInfo userInfo = (UserInfo) o;
		return age == userInfo.age &&
			Objects.equals(userCode, userInfo.userCode) &&
			Objects.equals(password, userInfo.password) &&
			Objects.equals(userName, userInfo.userName) &&
			Objects.equals(loginName, userInfo.loginName) &&
			Objects.equals(departCode, userInfo.departCode) &&
			Objects.equals(order, userInfo.order) &&
			Objects.equals(idCard, userInfo.idCard) &&
			Objects.equals(birth, userInfo.birth) &&
			Objects.equals(education, userInfo.education);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, userCode, password, userName, loginName,
			departCode, order, idCard, birth, education);
	}

	@Override
	public String toString() {
		return "UserInfo{" +
			"age=" + age +
			", userCode='" + userCode + '\'' +
			", password='" + password + '\'' +
			", userName='" + userName + '\'' +
			", loginName='" + loginName + '\'' +
			", departCode='" + departCode + '\'' +
			", order='" + order + '\'' +
			", idCard='" + idCard + '\'' +
			", birth=" + birth +
			", education='" + education + '\'' +
			'}';
	}


	@Override
	public int compareTo(UserInfo o) {
		if (o == null) return 1;
		return this.order > o.order ? 1 : (this.order == o.order ? 0 : -1);
	}
}
