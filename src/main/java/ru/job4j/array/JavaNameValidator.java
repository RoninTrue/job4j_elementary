package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (!name.isEmpty()) {
            if (isLowerLatinLetter(name.codePointAt(0))) {
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (isSpecialSymbol(code) || isLowerLatinLetter(code)
                            || isUpperLatinLetter(code) || Character.isDigit(code)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return 65 <= code && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return 97 <= code && code <= 122;
    }
}
