package org.example;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this is string buffer string");

        // Текущая длина строки и текущий размер выделенного буфера
        System.out.println(sb.length()); // 28
        System.out.println(sb.capacity()); // 44

        // Увеличение размера буфера и длины строки
        sb.ensureCapacity(45);
        sb.setLength(30);
        System.out.println(sb.length()); // 30
        System.out.println(sb); // this is string buffer string??
        System.out.println(sb.capacity()); // 90???

        // Получение и изменение символа
        System.out.println(sb.charAt(8)); // s
        sb.setCharAt(8, '!');
        System.out.println(sb.charAt(8)); // !

        // getChars - аналогично String

        // Добавление строки к исходной строке
        sb.append(" this is first added string").append(" this is second added string");
        System.out.println(sb); // this is !tring buffer string   this is first added string this is second added string

        // Вставка строки в исходную строку
        sb.insert(5, "THIS IS ADDED STRING");
        System.out.println(sb); // this THIS IS ADDED STRINGis !tring buffer string   this is first added string this is second added string

        // Изменения порядка следования символов на обратный
        sb.reverse();
        System.out.println(sb); // gnirts dedda dnoces si siht gnirts dedda tsrif si siht   gnirts reffub gnirt! siGNIRTS DEDDA SI SIHT siht
        sb.reverse();

        // Удаление символов
        sb.delete(5, 25);
        System.out.println(sb); // this is !tring buffer string   this is first added string this is second added string
        sb.deleteCharAt(29);
        sb.deleteCharAt(28);
        System.out.println(sb); // this is !tring buffer string this is first added string this is second added string

        // Замена символов
        sb.replace(0, 4, "THIS");
        System.out.println(sb);

        // substring аналогично String
    }
}
