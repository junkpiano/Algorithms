package com.yusukeohashi.algorithm;

public class KaratsubaM {

    /* TODO: [WIP]
     * line 1
     * line 2
     */
    public static String multiply(String numstr1, String numstr2) {
        if (numstr1.length() == 0 || numstr2.length() == 0) {
            return "0";
        }

        Integer num1 = Integer.parseInt(numstr1);
        Integer num2 = Integer.parseInt(numstr2);

        int result = num1 * num2;
        return Integer.toString(result);
    }
}
