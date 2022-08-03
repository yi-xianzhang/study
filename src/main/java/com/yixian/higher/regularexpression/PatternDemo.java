package com.yixian.higher.regularexpression;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {@link Pattern}正则表达式测试。</br>
 */
public class PatternDemo extends AbstractTestTemplate<Pattern> {

	@Override
	protected void staticMethodsOfThis() throws Exception {
		System.out.println("--------------------------Pattern类静态属性值------------------------------------------------");
		staticFinalProperties();
		System.out.println("--------------------------Pattern类静态方法--------------------------------------------------");
		compile("([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])");
		compile("([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])", 12);
		compile("([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])", -12);
		matches("([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])", "1132144.142143");
		matches(RegexUtil.CH_CN_REGEX, "爱上的还是的说法龥");
		quote("32765734658768578   08339859435");
		quote("1safdsfdhfykj.kjklkj.k   08339859435");
	}

	/**
	 * {@link Pattern}的静态常量。</br>
	 */
	private void staticFinalProperties() {
		System.out.println("Pattern.UNIX_LINES = " + Pattern.UNIX_LINES);
		System.out.println("Pattern.CASE_INSENSITIVE = " + Pattern.CASE_INSENSITIVE);
		System.out.println("Pattern.COMMENTS = " + Pattern.COMMENTS);
		System.out.println("Pattern.MULTILINE = " + Pattern.MULTILINE);
		System.out.println("Pattern.LITERAL = " + Pattern.LITERAL);
		System.out.println("Pattern.DOTALL = " + Pattern.DOTALL);
		System.out.println("Pattern.UNICODE_CASE = " + Pattern.UNICODE_CASE);
		System.out.println("Pattern.CANON_EQ = " + Pattern.CANON_EQ);
		System.out.println("Pattern.UNICODE_CHARACTER_CLASS = " + Pattern.UNICODE_CHARACTER_CLASS);
	}

	/**
	 * {@link Pattern}类的静态方法compile测试。</br>
	 *
	 * @param regex
	 */
	private void compile(String regex) {
		Pattern compile = Pattern.compile(regex);
		System.out.println("Pattern类的静态方法compile(" + regex + ") = : " + compile.toString());
	}

	/**
	 * {@link Pattern}类的静态方法compile测试。</br>
	 *
	 * @param regex
	 * @param flag
	 */
	private void compile(String regex, int flag) {
		Pattern compile = Pattern.compile(regex, flag);
		System.out.println("Pattern类的静态方法compile(" + regex + "," + flag + ") = : " + compile.toString());
	}

	/**
	 * {@link Pattern}类的静态方法matches测试。</br>
	 *
	 * @param regex
	 * @param input
	 */
	private void matches(String regex, CharSequence input) {
		boolean value = Pattern.matches(regex, input);
		System.out.println("Pattern类的静态方法matches(" + regex + "," + input + ") = : " + value);
	}

	/**
	 * {@link Pattern}类的静态方法quote测试。</br>
	 *
	 * @param regex
	 * @param input
	 */
	private void quote(String str) {
		String value = Pattern.quote(str);
		System.out.println("Pattern类的静态方法quote(" + str + ") = : " + value);
	}


	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Pattern pattern = Pattern.compile(RegexUtil.NUMBER_REGEX, -1);
		toString(pattern);
		matcher(pattern, "-123294732");
		flags(pattern);
		split(pattern,
			"凯撒肌凯撒肌凯撒肌1234567.2434肤开始35436123456.2343后ID12435435433456是567肤开始567肤开始567肤开始567肤开始",
			6);
	}

	/**
	 * {@link Pattern}类的成员方法matches测试。</br>
	 *
	 * @param regex
	 * @param input
	 */
	private void toString(Pattern pattern) {
		Objects.requireNonNull(pattern, pattern.getClass().getTypeName() + "类型不能为空！");
		String value = pattern.toString();
		System.out.println("Pattern类的成员方法（pattern [" + pattern + "]）.toString() = : " + value);
	}

	/**
	 * {@link Pattern}类的成员方法matcher，返回一个{@link Matcher}类型的对象。</br>
	 *
	 * @param pattern
	 * @param input
	 */
	private void matcher(Pattern pattern, CharSequence input) {
		Objects.requireNonNull(pattern, pattern.getClass().getTypeName() + "类型不能为空！");
		Matcher value = pattern.matcher(input);
		System.out.println("Pattern类的成员方法（pattern [" + pattern + "]）.matcher() = : " + value);
	}

	/**
	 * {@link Pattern}类的成员方法flags。</br>
	 *
	 * @param pattern
	 */
	private void flags(Pattern pattern) {
		Objects.requireNonNull(pattern, pattern.getClass().getTypeName() + "类型不能为空！");
		int value = pattern.flags();
		System.out.println("Pattern类的成员方法（pattern [" + pattern + "]）.flags() = : " + value);
	}

	/**
	 * {@link Pattern}类的成员方法split。</br>
	 *
	 * @param pattern
	 * @param input
	 * @param limit
	 */
	private void split(Pattern pattern, CharSequence input, int limit) {
		Objects.requireNonNull(pattern, pattern.getClass().getTypeName() + "类型不能为空！");
		String[] values = pattern.split(input, limit);
		System.out.println("Pattern类的成员方法（pattern [" + pattern + "]）.split( " +
			input + "," + limit + ") = : " + values);
		for (String str : values) {
			System.out.println("Pattern类的成员方法（pattern [" + pattern + "]）.split( " +
				input + "," + limit + ") = : " + str);
		}
	}


	@Override
	protected void constructorsOfThis() {

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new PatternDemo());
	}
}
