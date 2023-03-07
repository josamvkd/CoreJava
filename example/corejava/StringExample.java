package com.example.corejava;

public class StringExample {
    public static void main(String[] args) {
        System.out.println("-----------compareTo-----------------");
        String s1="hello";
        String s2="hello";
        String s3="HELLO";
        System.out.println(s1.compareTo(s2));//0 Equal
        System.out.println(s1.compareTo(s3));//32 not equal it will check the case-sensitive
        System.out.println("-----------contains()-----------------");
        String str ="what do you know about me";
        System.out.println(str.contains("do you")); //true
        System.out.println(str.contains("about me")); //true
        System.out.println(str.contains("how")); //false
        System.out.println("-----------endsWith()-----------------");
        String abc ="Nissan";
        System.out.println(abc.endsWith("n"));//true
        System.out.println(abc.endsWith("t"));//false
        System.out.println("-----------Equals()-----------------");
        String t1 ="jomon";
        String t2 ="jomon";
        String t3 ="Jomon";
        System.out.println(t1.equals(t2)); //true
        System.out.println(t1.equals(t3)); //false
        System.out.println("-----------equalsIgnoreCase()-----------------");
        String f1 ="dubai";
        String f2 ="dubai";
        String f3 ="DUBAI";
        String f4 ="Sharjah";
        System.out.println(f1.equalsIgnoreCase(f2)); //true
        System.out.println(f1.equalsIgnoreCase(f3)); //true case ignored
        System.out.println(f1.equalsIgnoreCase(f4)); //false

        System.out.println("-------------indexOf()------------------------");
        String g1 ="This is indexOf the method";
        System.out.println(g1.indexOf("method"));
        int index = g1.indexOf('e', 12);
        System.out.println("index of char "+index);
        System.out.println("-------------join()------------------------");
        String date =String.join("/","12","11","1990");
        System.out.print(date);
        String time =String.join(":","10","55","12");
        System.out.println(" "+time);
        System.out.println("-------------LastIndexOf()------------------------");
        String sb="this is index of example"; //there are 2 's' characters in this sentence
        int index1=sb.lastIndexOf('s'); //returns last index of 's' char value
        System.out.println(index1); //6
        String str1 = "This is index of example";
        int index2 = str1.lastIndexOf('s',5);
        System.out.println(index2); //3
        System.out.println("-------------length()-----------------------------");
        String sit ="NullPointerException";
        String sit2 ="ArithmeticException";
        System.out.println(sit.length());//20
        System.out.println(sit2.length());//19
        System.out.println("--------------replace()-----------------------------");
        String bbc="a sequence of characters";
        String replaceString= bbc.replace("e","o");
        System.out.println(replaceString);
        System.out.println("--------------replaceAll()-----------------------------");
        String cc="javatpoint is a very good website";
        String replaceString2=cc.replaceAll("a","k");
        System.out.println(replaceString2);
        String kkk="JavaTpoint";
        System.out.println(kkk.replaceAll(""," "));
        System.out.println("--------------split()----------------------------------");
        String ss1="java string split method by javatpoint";
        String[] word =ss1.split("\\s");
        for (String ss:word){
            System.out.println(ss);
        }
        System.out.println("--------------substring()----------------------------------");
        String dd="Dubai airport terminal one";
        System.out.println(dd.substring(5));
        System.out.println(dd.substring(6,13));
        System.out.println(dd.substring(0,5));
        System.out.println(dd.substring(6,7));
        System.out.println("----------------trim()-------------------------------------");
        String sw =" Senior Software Engineer ";
        System.out.println(sw);
        System.out.println("SW Length : "+sw.length());
        String qq = sw.trim();
        System.out.println(qq);
        System.out.println("QQ Length : "+qq.length());

    }
}
