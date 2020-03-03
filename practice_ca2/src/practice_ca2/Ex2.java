package practice_ca2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of rows: ");
        int rows = in.nextInt();
        in.nextLine();

        int[][] jagged_array = new int [rows][];

        for (int i = 0; i < jagged_array.length; i++){
            System.out.printf("Enter number of cols for row: %d", i+1);
            int num_of_cols = in.nextInt();
            jagged_array[i] = new int[num_of_cols];
        }

        for (int row = 0; row < jagged_array.length; row++) {
            for (int col = 0; col < jagged_array[row].length; col++) {
                System.out.printf("Please enter a value for row:%d col: %d", row+1, col+1);
                jagged_array[row][col] = in.nextInt();
            }
        }

        for (int row =0; row < jagged_array.length; row++) {
            for (int col = 0; col < jagged_array[row].length; col++) {
                System.out.printf("%d ", jagged_array[row][col]);
            }

            System.out.println();

        }
    }
}
