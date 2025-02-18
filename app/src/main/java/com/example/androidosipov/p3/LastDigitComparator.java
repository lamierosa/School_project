package com.example.androidosipov.p3;

import java.util.Comparator;

public class LastDigitComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        // Преобразуем числа в строки
        String str1 = i1.toString();
        String str2 = i2.toString();

        // Получаем первую цифру
        char d1 = str1.charAt(0);
        char d2 = str2.charAt(0);

        // Сравниваем первые цифры
        return Character.compare(d1, d2);
    }
}
