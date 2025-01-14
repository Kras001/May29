package May29;

import java.util.Arrays;
import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sum += numbers[i];
            }
            
        }
        System.out.print(sum);
    }
}
