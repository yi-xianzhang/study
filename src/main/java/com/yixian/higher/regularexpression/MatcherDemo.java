package com.yixian.higher.regularexpression;

import com.yixian.util.test.TestTemplateUtil;
import com.yixian.util.test.impl.AbstractTestTemplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo extends AbstractTestTemplate<Matcher> {

	@Override
	protected void instanceMethodsOfThis() throws Exception {
		Matcher matcher = Pattern.compile("57834547").matcher("8946758");
		System.out.println(matcher);
	}

	@Override
	protected void staticMethodsOfThis() throws Exception {
		System.out.println(Matcher.quoteReplacement("\\25623456345$"));
	}

	@Override
	protected void constructorsOfThis() {

	}

	public static void main(String[] args) throws Exception {
		TestTemplateUtil.execTemplate(new MatcherDemo());
	}
}
