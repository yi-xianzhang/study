package com.yixian.basics.oop.classes.keywords.final_;

/**
 * @author : zhang_yx
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : final修饰属性时，属性值不能被修改
 * @create : 2022-06-12 18:10
 */
public class FinalProperty {

	private static final double TAX_RATE = 0.09;

	private static final double TAX_RATE2;

	private final double PERSON_RATE = 0.09;

	private final double PERSON_RATE2;

	private final double PERSON_RATE3;

	private final double PERSON_RATE4;


	{
//		PERSON_RATE = 0.10;
		PERSON_RATE2 = 0.9;
		PERSON_RATE4 = 0.9;
	}

	public FinalProperty() {
//		PERSON_RATE = 0.10;
		PERSON_RATE3 = 0.8;
//		PERSON_RATE4 = 0.9;
	}

	static {
//		TAX_RATE = 0.10;
		TAX_RATE2 = 0.9;
	}

	public static void setTaxRate(double taxRate) {
//		TAX_RATE = taxRate;
	}
}

