package com.bestpractice.string;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

import static org.apache.commons.lang3.StringUtils.*;

public class IfNullGetEmpty {
	public static void main(String[] args) {
		String str = null;
		
		//optional
		String result = Optional.ofNullable(str).orElse(EMPTY);
		//guava
		result = Strings.nullToEmpty(str);
		System.out.println(result);
	}
}
