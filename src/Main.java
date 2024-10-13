import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int n = in.nextInt();
        in.close();
        if(n > 0) {
            Container a = new Container(n);
            System.out.println();
            System.out.println("Массив:");
            for (int i = 0; i < n; i++)
            {
                a.set(ThreadLocalRandom.current().nextInt(0, 101), i);
            }
            a.print();
            System.out.println("Добавляем элемент - 16:");
            a.add(16);
            a.print();
            System.out.println("Удаляем элемент - 16:");
            a.delete(16);
            a.print();
            System.out.println("Найдем элемент с индексом 1:");
            System.out.println(a.get(1));
            System.out.println("Установим элемент 43 на место с индексом 2:");
            a.set(43, 2);
            a.print();
        }
        else System.out.println("Размер массива должен превышать 0");
    }
}