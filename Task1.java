//1.Вычислить n-ое треугольного число(сумма чисел от 1 до n)
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println ("Вы ввели число " + n); 
        int triangle_num = n*(n+1)/2;
        System.out.println ("n-ое триуголное число =  " + triangle_num);
    }
}
