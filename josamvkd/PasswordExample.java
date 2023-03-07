package com.josamvkd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordExample
{
    public static void main(String[] args) {
        isValid("Geek");
    }
    // digit + lowercase char + uppercase char + punctuation + symbol
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final String PASSWORD_PATTERN1 =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
    private static final Pattern pattern1 = Pattern.compile(PASSWORD_PATTERN1);
    public static void isValid(final String password) {
        Matcher m = pattern.matcher(password);
        Matcher m1 = pattern1.matcher(password);
        if(m.matches())
        {
            System.out.println("Strong");
        }
        else if(m1.matches())
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Weak");
        }
    }
}
