package sample.Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {

    public static void main(String[] args) {

        System.out.println("Введите строку");
        Scanner scan = new Scanner(System.in);
        String strock = scan.nextLine();

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(strock);
        while (matcher.find()){
            System.out.println(strock.substring(matcher.start(), matcher.end()));
        }
    }
}
