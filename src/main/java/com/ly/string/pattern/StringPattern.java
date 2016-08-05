package com.ly.string.pattern;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * 该类用于各种正则表达式
 * 
 * @author moon
 * @since 2016-08-05
 * 
 * */
public class StringPattern {
	
	 public static final String EMAIL_PATTERN_STRING = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*$";

	    public static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_PATTERN_STRING);

	    public static final String ACCOUNT_PATTERN_STRING = "^\\b[A-Za-z][A-Za-z0-9]{3,15}$";

	    public static final Pattern ACCOUNT_PATTERN = Pattern.compile(ACCOUNT_PATTERN_STRING);

	    public static final String MPHONE_PATTERN_STRING = "^(1([3|8][0-9]|[4][57]|[5][012356789]|[7][0-9]))\\d{8}$";

	    public static final Pattern MPHONE_PATTERN = Pattern.compile(MPHONE_PATTERN_STRING);

	    public static final String NICKNAME_PATTERN_STRING = "^[_A-Za-z0-9\u4e00-\u9fa5]+$";

	    public static final Pattern NICKNAME_PATTERN = Pattern.compile(NICKNAME_PATTERN_STRING);

	    public static final String NOT_NICKNAME_PATTERN_STRING = "[^_A-Za-z0-9\u4e00-\u9fa5]";

	    public static final String NICKNAMECHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    
	    public static final String ID_CARD_STRING="(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])";
	    
	    public static final String ID_CARD_STRING_DETAIL="^[1-9][0-9]{5}(19[0-9]{2}|200[0-9]|2010)(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$";
	    
	    public static final Pattern ID_CARD_PATTERN=Pattern.compile(ID_CARD_STRING);
	    
	    public static final Pattern ID_CARD_DETAIL_PATTERN=Pattern.compile(ID_CARD_STRING_DETAIL);
	    
	    /**
	     * 邮箱匹配
	     * 
	     * @param email	输入邮箱
	     * @return boolean 是否匹配成功
	     * 
	     * */
	    public static boolean matchesEmail(String email) {
	        if (StringUtils.isEmpty(email)) {
	            return false;
	        }
	        return EMAIL_PATTERN.matcher(email).matches();
	    }

	    public static boolean matchesAccount(String account) {
	        if (StringUtils.isEmpty(account)) {
	            return false;
	        }
	        return ACCOUNT_PATTERN.matcher(account).matches();
	    }
	    /**
	     * 手机匹配
	     * 
	     * @param mPhone	输入手机号
	     * @return boolean 是否匹配成功
	     * 
	     * */
	    public static boolean matchesMPhone(String mPhone) {
	        if (StringUtils.isEmpty(mPhone)) {
	            return false;
	        }
	        return MPHONE_PATTERN.matcher(mPhone).matches();
	    }
	    /**
	     * 昵称匹配
	     * 
	     * @param nickname	输入昵称
	     * @return boolean 是否匹配成功
	     * 
	     * */
	    public static boolean matchesNickname(String nickname) {
	        if (StringUtils.isEmpty(nickname)) {
	            return false;
	        }
	        return NICKNAME_PATTERN.matcher(nickname).matches();
	    }
	    
	    /**
	     * 身份证匹配
	     * 
	     * @param idCard	输入身份证
	     * @return boolean 是否匹配成功
	     * 
	     * */
	    public static boolean matchesIdCard(String idCard){
	    	if(StringUtils.isEmpty(idCard)){
	    		return false;
	    	}
	    	return ID_CARD_PATTERN.matcher(idCard).matches();
	    }
	    
	    /**
	     * 身份证详细匹配
	     * 
	     * @param idCard	输入身份证
	     * @return boolean 是否匹配成功
	     * 
	     * */
	    public static boolean matchesIdCardDetail(String idCard){
	    	if(StringUtils.isEmpty(idCard)){
	    		return false;
	    	}
	    	return ID_CARD_DETAIL_PATTERN.matcher(idCard).matches();
	    }
	    
	    public static void main(String[] args) {
			System.out.println(matchesIdCardDetail("121102199101293614"));
		}
	   
}
