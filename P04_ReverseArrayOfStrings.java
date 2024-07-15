package May29;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = scanner.nextLine().split(" ");

        for (int i = 0; i <symbols.length / 2 ; i++) {

            String temp = symbols[i];
            symbols[i] = symbols[(symbols.length -1) -i];
            symbols[(symbols.length -1 ) -i] =temp;
            
        }
        System.out.println(String.join(" " , symbols));
  }

}
