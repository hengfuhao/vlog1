package com.gem.vlog.utils;

import java.util.Random;

/**
 * @ClassName StringUtil
 * @Description TODO
 * @Author Hinoki
 * @Date 2020/12/6
 **/

public class StringUtil {

    public static StringBuilder getVerifyCode() {
        String str = "0123456789";
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        return sb;
    }
}
