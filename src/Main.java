
/*Добавляем функционал. Теперь кол-во котиков тоже задаём с консоли. Для этого пишем в консоль сообщение
        "Введите размер массива котиков (сколько их будет): " и вводим размер массива. Далее по аналогии с предыдущей
        реализацией вводим в консоль сами проценты сытости для каждого котика. Ввод каждого из значений нужно предварять
        записью в консоли "Введите процент сытости Nго котика: ", где N - порядковый номер котика. */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quantity()));
        System.out.println(Arrays.toString(catsHangry()));
    }
    public static int[] quantity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива котиков (сколько их будет):");
        int R = in.nextInt();
        int[] myArray = new int[R];
        for (int i = 0; i <= (R - 1); i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }
    public static int[] catsHangry() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] myArray = new int[N];
        myArray[N] = in.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Введите процент сытости" + N +"го котика:");
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




