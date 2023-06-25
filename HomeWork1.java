// Формат сдачи: ссылка на подписанный git-проект.
// Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.// Формат сдачи: ссылка на подписанный git-проект.
// Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class HomeWork1 
{
    public static int factorial(int f) { // 1) Вычислить n! (произведение чисел от 1 до n)
        if (f == 1 || f == 0) {
            return 1;
        } else {
            return f * factorial(f-1);
        }
    }

    public static void calc (int user_input1, int user_input2, String oper)
    {
        switch(oper)
        {
            case "+":
            System.out.printf("Решение %s %s %s = %s \n", user_input1, oper, user_input2, user_input1+user_input2);
            break;
            case "-":
            System.out.printf("Решение %s %s %s = %s \n", user_input1, oper, user_input2, user_input1-user_input2);
            break;
            case "*":
            System.out.printf("Решение %s %s %s = %s \n", user_input1, oper, user_input2, user_input1*user_input2);
            break;
            case "/":
            System.out.printf("Решение %s %s %s = %s \n", user_input1, oper, user_input2, user_input1/user_input2);
            break;
        }
    }

    public static void main(String[] args) {
        int N = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n-число: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) { // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
            N = N + i;
        }
        System.out.printf("%s-ое треугольное число = %s\n", n, N);
        System.out.printf("Факториал %s = %s\n", n, factorial(n));  // 1) Вывести n! (произведение чисел от 1 до n)
        
        // 2) Вывести все простые числа от 1 до 1000
        System.out.print("Все простые числа от 1 до 1000: "); 
        for (int i = 1; i <= 1000; i++) {
            System.out.printf(" %s,", i);
        }
        System.out.print("\n");

        // 3) Реализовать простой калькулятор
    

        System.out.println("Введите число 1: ");
        int user_input1 = in.nextInt();
        System.out.println("Введите операцию: ");
        in.nextLine();
        String oper = in.nextLine();      
        System.out.println("Введите число 2: ");
        int user_input2 = in.nextInt();
        calc(user_input1, user_input2, oper);

        in.close();
    }
}