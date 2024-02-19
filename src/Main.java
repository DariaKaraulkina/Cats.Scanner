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
        for (int j = 0; j < myArray.length; j++) {
            myArray[j] = j + 1;
            System.out.println("Введите процент сытости " + myArray[j] + "го котика: "); // В консоли пишется: "Введите процент сытости 0го котика:", а надо начинать нумерацию с 1, а не с 0. Исправила.
            myArray[j] = in.nextInt();   // Где используется эта переменная? Исправила.
            if (myArray[j] < 100) {
                myArray[j] = 100;     // Не очень понял, зачем нужно порядковый номер (итератор цикла) отнимать и прибавлять от процента? Исправила.
            } else
                myArray[j] = 100;           // Чем эта строка отличается от 28й?
        }
        return  myArray;
    }
}



