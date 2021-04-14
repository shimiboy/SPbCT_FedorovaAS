package KR_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task_4 {
    /*1.	Дано натуральное число n. Вычислите 1cosx+1cosx2+…+1cosxn*/
    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
           sum = sum + cos(x)*n;
        }
        System.out.println(sum);
    }
}
class Task_4_2{
    /*2.	Найдите n пар простых чисел, которые отличаются друг от друга на 2*/
    public static void main(String[] args) {
    int a=1, b=3;   //Для примера начнем с этих чисел.
    List<Integer> x = new ArrayList<Integer>();
        for (int i=1; i < 10; i++){     //Если добавить количество прохода цикла (i < число), можно будет вывести больше пар.
            if (a + 2 == b){
                x.add(a);
                x.add(b);
                a = a+2;
                b = b+2;
            }else{
                System.out.println("error");
            }
            System.out.println(x);
        }
    }
}
