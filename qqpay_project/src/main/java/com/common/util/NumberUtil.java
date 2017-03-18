package com.common.util;
/**
 * 校验字符串
 * @author zjx
 *
 */
public class NumberUtil {
	/**
	 * 判断字符串是否为null或"",若为null或"",则返回-1;
	 * 判断字符串是否全为数字且不为负数,若不符合则返回-2
	 * 若上面条件均符合,则把字符串转换为int类型.
	 * @param str
	 * @return
	 */
	public static int parseInt(String str){
		if(str == null || str.isEmpty()){
			return -1;
		}else{
			if(isNumber(str)){
				return Integer.parseInt(str);
			}else{
				return -2;
			}
		}
	}
	/**
	 * 判断字符串是否全为数字且不为负数,若不符合则返回false
	 * @param str
	 * @return
	 */
	private static boolean isNumber(String str){
		return str.matches("[0-9]*");
	}
}
