package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Date date = new Date(str);

        SimpleDateFormat format = new SimpleDateFormat("MMMM dd, YYYY", myDateFormatSymbols);
        System.out.println(format.format(date));

    }

    private static DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols()
    {

        @Override
        public String[] getMonths()
        {
            return new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
                    "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        }
    };
}