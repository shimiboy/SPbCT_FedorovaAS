package KR_1;


import java.util.Scanner;

public class Task_5 {
    /*1.	Пользователь вводит англ. букву, вывести следующие три по алфавиту.
    Если алфавит закончился, то вывести циклично с начала алфавита, то есть если z, то a b c.
    Вывод только маленьких букв. Учесть, что пользователь может ввести заглавную букву.*/
    public static void main(String[] args) {
        System.out.print("Введите букву: ");
        final int N = 3;
        final Scanner scanner = new Scanner(System.in);
        final char c = scanner.useDelimiter("").next().toLowerCase().charAt(0);
        for (int i = 1; i <= N; i++) {
            System.out.println((char) ('a' + (c - 'a' + i) % 26));
        }
    }
}
class Task_5_2{
    /*2.	Пользователь вводит положительное целое число. Зашифровать каждую цифру серией из букв (конкретный принцип составления серии букв разработать самостоятельно).*/
    public static void main(String[] args) {
        System.out.print("Введите число для цифрования: ");
        Scanner scanner = new Scanner(System.in);
        int scanInt = scanner.nextInt();
        String str = String.valueOf(scanInt);
        char[] strChar = str.toCharArray();
            strChar[1] = 'x';
            strChar[2] = 'd';
            strChar[0] = 'D';
        str = String.valueOf(strChar);
        System.out.println("Зашифровано: " + str);
    }
}
