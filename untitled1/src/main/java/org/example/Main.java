package org.example;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Main {
    public static String removeAccent(String s) {

        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }
    public static void main(String[] args) {
        System.out.print(Main.removeAccent("Sinh Viên Công Nghệ Thông Tin"));
    }
}