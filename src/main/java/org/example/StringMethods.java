package org.example;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "this is test string";
        String s2 = "this is test string";
        String s3 = new String("this is test string");

        // Сравнение ссылок на одну и ту же строку в пуле строк
        System.out.println(s1 == s2); // true

        // Сравнение ссылок на одну строку из пула строк и другую строку просто из кучи
        System.out.println(s1 == s3); // false (s3 is not in string pool)

        // Сравнение строк посимвольно
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true

        // Определение длины строки
        System.out.println(s1.length()); // 19

        // Извлечение символа по индексу
        System.out.println(s1.charAt(6)); // s

        // Извлечение массива символов
        char[] buffer1 = new char[11];
        buffer1[0] = 'a';
        s2.getChars(4, 14, buffer1, 1);
        System.out.println(buffer1); // a is test s

        // Преобразование в массив символов
        char[] chars = s1.toCharArray();
        System.out.println(chars); // this is test string

        // Сравнение части строки
        System.out.println(s1.regionMatches(1, s2, 1, 18));

        // Проверка с чего начинается строка
        System.out.println(s1.startsWith("this")); // true

        // Проверка на что оканчивается строка
        System.out.println(s1.endsWith("string")); // true

        // Сравнение строк в лексикографическом порядке
        System.out.println(s1.compareTo(s2 + "4")); // -1

        // Нахождение индекса первого (последнего) вхождения символа
        System.out.println(s1.indexOf('i')); // 2
        System.out.println(s1.lastIndexOf('i')); // 16

        // Извлечение подстроки
        String s4 = s1.substring(7, 12);
        System.out.println(s4); //  test

        // Соединение двух подстрок
        String s5 = s1.concat(s4);
        System.out.println(s5); // this is test string test

        // Замена символов в исходной строке
        String s6 = s3.replace('i', '!');
        System.out.println(s6); // th!s !s test str!ng

        // Удаление начальных и конечных пробелов
        String s7 = "   this is string   ".trim();
        System.out.println(s7); // this is string

        // Преобразование других типов данных в String
        String s8 = String.valueOf('c');
        String s9 = String.valueOf(8);
        String s10 = String.valueOf(147L);
        System.out.println(s8); // c
        System.out.println(s9); // 8
        System.out.println(s10); // 147

        // Смена регистра букв
        String s11 = "this is uppercase".toUpperCase();
        String s12 = "this is lowercase".toLowerCase();
        System.out.println(s11); // THIS IS UPPERCASE
        System.out.println(s12); // this is lowercase
    }
}