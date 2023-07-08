// Урок 3. Коллекции JAVA: Введение
// Формат сдачи: ссылка на подписанный git-проект.
// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
 
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите длинну массива (n >= 2): ");
            n = sc.nextInt();
        } while (n < 2);
        int[] array = createRandomArray(n, 1, 99);
 
        System.out.println("Дан массив: " + Arrays.toString(array));
        findMin(array);         // 2) Найти минимальное значение
        findMax(array);         // 3) Найти максимальное значение
        average(array);         // 4) Найти среднее значение
        int[] arrayDelete = deleteEvenElement(Arrays.copyOf(array, array.length)); // 1) Нужно удалить из него чётные числа
        System.out.println("Удаляем чётные элементы массива: " + Arrays.toString(arrayDelete));
    }
 
    public static int[] createRandomArray(int length, int min, int max) {
        int[] result = length > 0 ? new int[length] : new int[0];
        if (length > 0) {
            Random rand = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }
 
    public static int[] deleteEvenElement(int[] array) {
        int i, j;
        for (i = 0, j = 1; j < array.length; i++, j += 2) {
            array[i] = array[j];
        }
        return Arrays.copyOf(array, i);
    }

    public static void findMax(int[] array) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        System.out.println(max);
    }

    public static void findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
    public static void average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        System.out.println(average);
    }

}