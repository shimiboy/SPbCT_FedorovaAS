package KR_1;

import java.util.Scanner;

public class Task_3 {
    /*1.	Дано число. Если оно более 100 или менее -100, то занулить, иначе увеличить его на 1.*/
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
            if (num > 100){
                num = 0;
            }else if (num < -100){
                num = 0;
            }else{
                num++;
            }
        System.out.println("New number is: " + num);
    }
}
class Task_3_5{
    /*2.	Дано четыре числа, если первые два числа больше 5, третье число делится на 6, четвертое число не делится на 3, то вывести yes, иначе no.*/
    public static void main(String[] args) {
        int a=6,b=6,c=6,d=6;
        System.out.print("Числа для проверки: " + a + " " + b + " " + c  + " "+ d + " \n" );
        if ((a > 5) && (b > 5) && (c % 6 == 0) && (d % 3 != 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
