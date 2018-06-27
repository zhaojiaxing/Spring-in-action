package com.zjx.externals;

/**
 * Created by zjx on 2018/6/9.
 */
public class TestMain {
//    public static void main(String[] args) {
//        try {
//            String ss = "找三李四王五吾问无为谓无无无无   呜呜呜呜去取";
//           ss = URLEncoder.encode(ss, "utf-8");
//            System.out.println(ss.length());
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }

    private static String str2 = null;
    public static void changeStr(String str) {
        str = "welcome";
    }

    public static void main(String[] args) {
        String str = "1234";
        str2 = "5678";
        changeStr(str);
        changeStr(str2);
        System.out.println(str);
        System.out.println(str2);
    }
}
