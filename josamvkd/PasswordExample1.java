package com.josamvkd;

import java.util.regex.Pattern;

public class PasswordExample1
{
    public static void main(String[] args) {
        isValid("Abcd");
    }
    String PATTERN1="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+-=:;'<>,]).{8,20}$";
    String PATTERN2 ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+-=:;'<>,]).{6,}$";
    public static void isValid(String password){
      //  Pattern p = Pattern.compile(PATTERN1);

    }
}
