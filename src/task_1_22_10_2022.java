import java.util.Scanner;

public class task_1_22_10_2022 {
    public static void main(String[] args) {
        Scanner firstScanner=new Scanner(System.in);
        System.out.println("введите размер первого массива:");
        int[] firstArray=new int[firstScanner.nextInt()];

        for (int i = 0; i <firstArray.length ; i++) {
            firstArray[i]= firstScanner.nextInt();
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);

        }

    }
}
