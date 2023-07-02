package ru.madykhan.api.lesson1;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

/*Дана строка sql-запроса "select * from students where ". 
*Сформируйте часть WHERE этого запроса, используя StringBuilder. 
*Данные для фильтрации приведены ниже в виде json-строки.
*Если значение null, то параметр не должен попадать в запрос.
*Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", 
*"city":"Moscow", "age":"null"} */
   // public static void main(String[] args) {
   //      Map<String, String> params1 = new HashMap<String,String>();
   //      params1.put("name","Temirlan");
   //      params1.put("country","Russia");
   //      params1.put("city","Moscow");
   //      params1.put("age",null);
   //      System.out.println(getQuery(params1));
   //  }
   //  public static String getQuery(Map<String, String> params)
   //  {
   //      StringBuilder s = new StringBuilder();
   //      for (Map.Entry<String,String> pair : params.entrySet())
   //      {
   //          if (pair.getValue() != null)
   //          {
   //              s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
   //          }
   //      }
   //      s.delete(s.toString().length()-5,s.toString().length());
   //      return s.toString();
   //  }


/*Реализуйте алгоритм сортировки пузырьком числового массива, 
*результат после каждой итерации запишите в лог-файл. */
   public static void main(String[] args) {
        int [] mas = {22, 4, 25, 29, 9};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}