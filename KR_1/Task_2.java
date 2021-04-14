package KR_1;

import java.util.Scanner;

public class Task_2 {
    /*1.	Пользователь вводит сторону квадрата. Найдите периметр и площадь квадрата. */
    public static void main(String[] args) {
        int P, S;
        System.out.println("Введите сторону квадрата:");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        P = 4 * w;
        S = w * w;
        System.out.println("Площаль квадрата равна:" + S);
        System.out.println("Периметр квадрата равна:" + P);
    }
}
class Task_2_2{
    /*2.	Из трехзначного числа x вычли его последнюю цифру. Когда результат разделили на 10, а к частному слева приписали последнюю цифру числа x, то получилось число 237. Найти число x.*/
    public static void main(String[] args) {
        int x, y, num, priv;
        y = 237;
        num = y / 100;
        priv = y % 100;
        x = priv * 10 + num;
        System.out.println(x);
    }
}
