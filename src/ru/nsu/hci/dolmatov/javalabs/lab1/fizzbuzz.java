//FizzBuzz
package ru.nsu.hci.dolmatov.javalabs.lab1;

public class fizzbuzz {

    public static void main(String[] args) {

        System.out.print("Введите число от 0 до 100: ");

        for(int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else System.out.println (i);
        }

    }

}
