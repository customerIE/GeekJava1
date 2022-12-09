//3.Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 1000: ");
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println ("Вы ввели число " + n); 
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n%i==0) count++;
        }
        switch (count) {
            case 0:
            System.out.println (n+" - Простое число");
                break;
        
            default:
            System.out.println (n+" - Не простое число");
                break;
        }
    }
}