package ru.nsu.hci.dolmatov.javalabs.lab3;

import java.util.*;

public class Main {

    public static void printErrorMsg(int i) {

        switch (i) {
            case '1':
                System.out.println("Скобки не согласованы");
                break;

            case '2':
                System.out.println("Некорректное выражение");
        }
    }

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ExpressionParser n = new ExpressionParser();
        List<String> expression = n.parse(s);
        boolean flag = n.flag;

        Calculation calc = new Calculation();

        if (flag) {
            for (String x : expression) System.out.print(x + " ");
            System.out.println();
            System.out.println(calc.calc(expression));
        }
    }
}
