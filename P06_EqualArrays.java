package May29;

import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the first array
        String[] firstArrayInput = scanner.nextLine().split(" ");
        int[] firstArray = new int[firstArrayInput.length];
        for (int i = 0; i < firstArrayInput.length; i++) {
            firstArray[i] = Integer.parseInt(firstArrayInput[i]);
        }

        // Read the second array
        String[] secondArrayInput = scanner.nextLine().split(" ");
        int[] secondArray = new int[secondArrayInput.length];
        for (int i = 0; i < secondArrayInput.length; i++) {
            secondArray[i] = Integer.parseInt(secondArrayInput[i]);
        }

        // Compare the arrays and compute the sum if they are identical
        if (firstArray.length != secondArray.length) {
            System.out.println("Arrays are not identical. Found difference at index 0.");
            return;
        }

        int sum = 0;
        boolean areIdentical = true;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
            sum += firstArray[i];
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        }
    }
}