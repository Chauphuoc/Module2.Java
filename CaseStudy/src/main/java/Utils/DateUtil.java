package FeatureApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp {
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    public static Date convertStringToDate(String strDate) {
        try {
            return formatter.parse(strDate);
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        return null;
    }

    public static String convertDateToString(Date date) {
        return formatter.format(date);
    }

    public static void main(String[] args) {
        String test = "22-12-2022";
        System.out.println(convertStringToDate(test));
    }
}
