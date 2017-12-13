package ru.nsu.hci.dolmatov.javalabs.lab5;

public class Formatted {

    static String errorParameter = "Incorrect template parameter";
    static String errorArgument = "Not enough arguments passed";
    private Object[] args;
    private String input;
    private int position;
    private char symbol;
    private StringBuilder result = new StringBuilder();

    Formatted(String input, Object...args) {

        this.input = input;
        this.args = args;

        for (position = -1; hasNextChar(); )
            parseSymbol();
    }

    public static String format(String input, Object...args) {

        Formatted f = new Formatted(input, args);

        return f.returnString();
    }

    private boolean hasNextChar() {

        return position < (this.input.length() - 1);
    }

    private void parseSymbol() throws IllegalArgumentException {

        if (readNextChar() == '$') {
            int n = parseFormatArg();
            if (n >= 0) {
                if (n >= args.length)
                    throw new IllegalArgumentException(errorArgument);
                result.append(String.valueOf(args[n]));
            } else
                result.append('$');
        } else
            result.append(symbol);
    }

    private int parseFormatArg() {

        int posWas = position;

        while(true) {
            if (readNextChar() != '{') {
                position = posWas;
                return -1;
            }
            int result = parseNumber();

            return result;
        }
    }

    private int parseNumber() throws IllegalArgumentException {

        int result = 0;

        if (!hasNextChar() || !Character.isDigit(readNextChar()))
            throw new IllegalArgumentException(errorParameter);

        while (Character.isDigit(symbol)) {
            result *= 10;
            result += Character.getNumericValue(symbol);
            if (hasNextChar()) {
                readNextChar();
            } else
                break;
        }

        return result;
    }

    private char readNextChar() throws IllegalArgumentException {

        if (!hasNextChar())
            throw new IllegalArgumentException(errorParameter);
        position++;
        symbol = input.charAt(position);

        return symbol;
    }

    public String returnString() {

        return result.toString();
    }
}