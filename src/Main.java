/*Добавляем функционал. Теперь кол-во котиков тоже задаём с консоли. Для этого пишем в консоль сообщение
        "Введите размер массива котиков (сколько их будет): " и вводим размер массива. Далее по аналогии с предыдущей
        реализацией вводим в консоль сами проценты сытости для каждого котика. Ввод каждого из значений нужно предварять
        записью в консоли "Введите процент сытости Nго котика: ", где N - порядковый номер котика. */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quantity()));
    }

    public static int[] quantity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива котиков (сколько их будет):");
        int R = in.nextInt();
        int[] myArray = new int[R];
        for (int i = 0; i <= (R - 1); i++) {
            myArray[i] = i + 1;
        }

        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Введите процент сытости " + j + "го котика: ");
            int N = in.nextInt();
            if (myArray[j] < 100) {
                myArray[j] = j + (100 - j);
            } else if (myArray[j] > 100) {  //ошибка входных данных, котик полностью сыт
                myArray[j] = 100;
            } else
                myArray[j] = 100;
        }
        return  myArray;
    }
}




