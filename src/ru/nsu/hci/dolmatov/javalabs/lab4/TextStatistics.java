package ru.nsu.hci.dolmatov.javalabs.lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TextStatistics {
    String fileText;

    public TextStatistics(String file) {

        try {
            FileReader fstream = new FileReader(file);
            BufferedReader reader = new BufferedReader(fstream);
            String line;
            while ((line = reader.readLine()) != null) {
                fileText += line + "\n";
            }
            fstream.close();
        } catch (IOException e) {
            printError();
        }
    }

    private void printError() {
        System.out.println("Ошибка!");
    }

    public int countLines() {
        int cLines = 0;

        for (int i = 0; i < fileText.length(); i++) {
            if (fileText.charAt(i) == '\n')
                cLines++;
        }

        return cLines;
    }

    public int countWords() {
        int cWords = 0;
        int j;

        for (int i = 0; i < fileText.length(); i++) {
            if (Character.isLetter(fileText.charAt(i))) {
                for (j = i; j < fileText.length(); j++) {
                    if (Character.isLetter(fileText.charAt(j)) == false)
                        break;
                }
                i = j;
                cWords++;
            }
        }

        return cWords;
    }

    public int countLetter() {
        int cLetter = 0;

        for(int i = 0; i < fileText.length(); i++)
        if (Character.isLetter(fileText.charAt(i)))
            cLetter++;

        return cLetter;
    }

    public String frequencyResponse() {
        Map<String, Integer> freqRes = new HashMap<>();

        for (int i = 0; i < fileText.length(); i++) {
            if (freqRes.containsKey(String.valueOf(fileText.charAt(i)))) {
                freqRes.put(String.valueOf(fileText.charAt(i)), freqRes.get(String.valueOf(fileText.charAt(i))) + 1);
            } else {
                freqRes.put(String.valueOf(fileText.charAt(i)), 1);
            }
        }
        return String.valueOf(freqRes);//.replaceAll("[{},]", "")
               // .replaceAll("[ ]", "\n");
    }
}