//2.Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println ("Вы ввели число " + n); 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println ("n! =  " + fact);
    }
}
