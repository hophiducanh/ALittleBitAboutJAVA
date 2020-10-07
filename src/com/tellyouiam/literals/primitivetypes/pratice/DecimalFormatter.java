package com.tellyouiam.literals.primitivetypes.pratice;

public class DecimalFormatter {
    public static void main(String[] args) {
        String value = "$2,016.88".replace("$", "");
//        DecimalFormat formatter = new DecimalFormat("#,###.##");
//        String s = formatter.format(Double.parseDouble(value));
//        System.out.println(s);
        String doubleValueStr = value.replace("$","").replaceAll(",","");

        Double cellValue = Double.parseDouble(doubleValueStr);
        System.out.println(cellValue);
    }
}
