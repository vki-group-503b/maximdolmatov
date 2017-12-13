package ru.nsu.hci.dolmatov.javalabs.lab5;


public class Formatter {

    public static void main(String[] args) {

    String yourName = "Max", name = "Jarvis", description = "AI from some movie";

    String formatter = Formatted.format("Hello, ${0}. My name is ${1}.\n I am ${1} - ${2}.", yourName, name,description);
    System.out.println(formatter);

    }
}
