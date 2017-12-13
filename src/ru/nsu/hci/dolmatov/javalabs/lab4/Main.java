package ru.nsu.hci.dolmatov.javalabs.lab4;

public class Main {

    public static void main(String[] args) {

        TextStatistics test = new TextStatistics("src/ru/nsu/hci/dolmatov/javalabs/lab4/mytext.txt");

        System.out.println("Количество строк: " + test.countLines());
        System.out.println("Колечество слов: " + test.countWords());
        System.out.println("Количество букв: " + test.countLetter());
        System.out.println("Частотная характеристика: " + test.frequencyResponse());
    }

}
