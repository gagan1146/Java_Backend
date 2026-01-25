package org.example.Java10_17_Features.String.StringAfterJava21;

public class StringAfterJava21Example1 {
    static void main(String[] args) {
        String name = """
                -----------------------------
                Hello,
                My name is Rock,
                And my age is 30
                -----------------------------
                """;
        System.out.println(name);

        int a = 4;
        int b = 30;
//        String result = STR."\{a} + \{b} = \{a + b}";
//        System.out.println(result);
    }
}
