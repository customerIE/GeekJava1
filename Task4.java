//4.Реализовать простой калькулятор
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите любое число a: ");
		Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        System.out.print("Введите любое число b: ");
        float b = scan.nextFloat();
        System.out.print("Выбирете операцию: +, -, *, / ");
        String oper = scan.next();
        scan.close();
        float res = 0;
        switch (oper) {
            case "+":
                res = a+b;
                break;
            case "-":
                res = a-b;
                break;
            case "*":
                res = a*b;
                break;
            case "/":
                res = a/b;
                break;
            default:
            System.out.println ("Выбранной операции нет в списке!");
                break;
        }
        if (res>0) {
            System.out.print("Результат = " + res);
        }
        
    }
}