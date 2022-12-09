/*Задано уравнение вида q + w = e, q, w, e >= 0. 
* Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
* Требуется восстановить выражение до верного равенства. 
* Предложить хотя бы одно решение или сообщить, что его нет.
 */

//import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String s ="2? + ?6 = 69";
        String newstr = s.replace("?", "0");
        System.out.println(newstr);
        String[] k = newstr.split(" ");
        for (String l : k) {
            System.out.println(l);
        }
        int a = Integer.parseInt (k[0]);
        int b = Integer.parseInt (k[2]);
        int c= Integer.parseInt (k[4]);
        int m = c-a-b;
        int a1 = m%a+a;
        int b1 = m%b+b;
        System.out.println(m);
    }
}