package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String[] stroka = url.split("\\?");
        String[] masRazd = stroka[1].split("&");


        for (String st : masRazd) {
            String[] strokaRavn = st.split("=");
            System.out.print(strokaRavn[0] + " ");

        }
        System.out.println("");
        for (String st : masRazd) {
            String[] strokaRavn = st.split("=");
            if (strokaRavn[0].equals("obj"))
            {
                try
                {
                    double t = Double.parseDouble(strokaRavn[1]);
                    alert (t);
                }
                catch (Exception e)
                {
                    alert(strokaRavn[1]);
                }
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}

