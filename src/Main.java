
/*Добавляем функционал. Теперь кол-во котиков тоже задаём с консоли. Для этого пишем в консоль сообщение
        "Введите размер массива котиков (сколько их будет): " и вводим размер массива. Далее по аналогии с предыдущей
        реализацией вводим в консоль сами проценты сытости для каждого котика. Ввод каждого из значений нужно предварять
        записью в консоли "Введите процент сытости Nго котика: ", где N - порядковый номер котика. */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        quantity();
        System.out.println(Arrays.toString(catsHangry()));
    }

    public static int[] quantity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива котиков (сколько их будет):");
        int N = in.nextInt();
        int[] myArray = new int[N];
        for (int i = 0; i <= (N - 1); i++) {
            if (myArray[i] > 0) {
                myArray[i] = i;
            } else if (myArray[i] <= 0) {
                System.out.print("ошибка входных данных, котиков нет");
            } else
                myArray[i] = i;
            return myArray;
        }

        public static int[] catsHangry() {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int[] myArray = new int[N];
            System.out.print("Введите процент сытости Nго котика:");
            myArray[0] = in.nextInt();
            System.out.print("Введите процент сытости Nго котика:");
            myArray[1] = in.nextInt();
            System.out.print("Введите процент сытости Nго котика:");
            myArray[2] = in.nextInt();
            in.close();

            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] < 100) {
                    myArray[i] = i + (100 - i);
                } else if (myArray[i] > 100) {  //ошибка входных данных, котик полностью сыт
                    myArray[i] = 100;
                } else
                    myArray[i] = 100;
            }
            return myArray;
        }
    }
}