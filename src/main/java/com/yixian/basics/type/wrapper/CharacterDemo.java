package com.yixian.basics.type.wrapper;

import com.yixian.util.test.TestTemplate;
import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

/**
 * {@link Character}类的常用方法测试。</br>
 */
public class CharacterDemo extends AbstractTestTemplate implements TestTemplate {

	/**
	 * {@link Character}类的成员方法测试。</br>
	 */
	@Override
	protected void instanceMethodsOfThis() {

		Character character = new Character('a');
		System.out.println("character.charValue return : " + character.charValue());
		System.out.println("character.hashCode return : " + character.hashCode());
		System.out.println("character.equals return : " + character.equals(new Character('a')));
		System.out.println("character.equals return : " + character.equals('a'));
		System.out.println("character.toString return : " + character.toString());

	}


	@Override
	protected void staticMethodsOfThis() {

		System.out.println("Character.MIN_RADIX = " + Character.MIN_RADIX);
		System.out.println("Character.TYPE" + Character.TYPE);
		System.out.println("Character.UnicodeBlock.of methods return : " + Character.UnicodeBlock.of('a'));
		System.out.println("Character.UnicodeBlock.of methods return : " + Character.UnicodeBlock.of('b'));
		System.out.println("Character.valueOf method return : " + Character.valueOf('a'));
		System.out.println("Character.toString method return : " + Character.toString('a'));
		System.out.println("Character.isValidCodePoint method return : " + Character.isValidCodePoint(6789));
		System.out.println("Character.isBmpCodePoint method return : " + Character.isBmpCodePoint(678912345));

		// Character.isLowerCase
		System.out.println("Character.isLowerCase method return : " + Character.isLowerCase('A'));
		System.out.println("Character.isLowerCase method return : " + Character.isLowerCase('a'));
		System.out.println("Character.isLowerCase method return : " + Character.isLowerCase('和'));

		// Character.isUpperCase
		System.out.println("Character.isUpperCase method return : " + Character.isUpperCase('A'));
		System.out.println("Character.isUpperCase method return : " + Character.isUpperCase('a'));
		System.out.println("Character.isUpperCase method return : " + Character.isUpperCase('和'));

		// Character.isDigit
		System.out.println("Character.isDigit method return : " + Character.isDigit('和'));
		System.out.println("Character.isDigit method return : " + Character.isDigit('q'));
		System.out.println("Character.isDigit method return : " + Character.isDigit('6'));

		// Character.isLetter
		System.out.println("Character.isLetter method return : " + Character.isLetter('6'));
		System.out.println("Character.isLetter method return : " + Character.isLetter('a'));
		System.out.println("Character.isLetter method return : " + Character.isLetter('中'));
		System.out.println("Character.isLetter method return : " + Character.isLetter(';'));

		// Character.toLowerCase
		System.out.println("Character.toLowerCase method return : " + Character.toLowerCase('6'));
		System.out.println("Character.toLowerCase method return : " + Character.toLowerCase('A'));
		System.out.println("Character.toLowerCase method return : " + Character.toLowerCase('a'));
		System.out.println("Character.toLowerCase method return : " + Character.toLowerCase('中'));
		System.out.println("Character.toLowerCase method return : " + Character.toLowerCase(';'));

		// Character.toUpperCase
		System.out.println("Character.toUpperCase method return : " + Character.toUpperCase('6'));
		System.out.println("Character.toUpperCase method return : " + Character.toUpperCase('A'));
		System.out.println("Character.toUpperCase method return : " + Character.toUpperCase('a'));
		System.out.println("Character.toUpperCase method return : " + Character.toUpperCase('中'));
		System.out.println("Character.toUpperCase method return : " + Character.toUpperCase(';'));

		// Character.isWhitespace
		System.out.println("Character.isWhitespace method return : " + Character.isWhitespace('6'));
		System.out.println("Character.isWhitespace method return : " + Character.isWhitespace('A'));
		System.out.println("Character.isWhitespace method return : " + Character.isWhitespace('a'));
		System.out.println("Character.isWhitespace method return : " + Character.isWhitespace('中'));
		System.out.println("Character.isWhitespace method return : " + Character.isWhitespace(';'));
		System.out.println("Character.isWhitespace method return : " + Character.isWhitespace(' '));

	}

	@Override
	protected void constructorsOfThis() {

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new CharacterDemo());
	}

}
