package practice_ca2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrix_size;
        int row = 0;
        int col = 0;
        int sum_row = 0;
        int sum_col = 0;
        int sum_diagonal = 0;

        System.out.printf("%s", "Please enter the size of the matrix");
        matrix_size = in.nextInt();
        int[] total_array = new int[(matrix_size*2)];
        int[] row_list = new int[matrix_size];
        int[] col_list = new int[matrix_size];
        int[] diagonal_list = new int[matrix_size];

        int[][] matrix = new int[matrix_size][matrix_size];

        for (row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[row].length; col++){
                System.out.printf("Please enter a value for row %d column %d", row+1, col+1);
                matrix[row][col] = in.nextInt();
                row_list[row] += matrix[row][col];
            }
        }

        int counter = 0;
        for (row =0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                col_list[row] += matrix[col][counter];
            }
            counter ++;
        }

        int row_counter = 0;
        int col_counter = 0;

        for (row =0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                diagonal_list[row] = matrix[row_counter][col_counter];
            }
            row_counter ++;
            col_counter++;
        }

        for (row = 0; row < row_list.length; row++){
            sum_row += row_list[row];
        }

        for (row = 0; row < col_list.length; row++){
            sum_col += col_list[row];
        }

        for (row = 0; row < diagonal_list.length; row++){
            sum_diagonal += diagonal_list[row];
        }

        for (int i = 0; i < row_list.length; i++){
            System.out.printf("Sum row %d = %d%n", i+1, row_list[i]);
        }

        for (int i = 0; i < row_list.length; i++){
            System.out.printf("Sum col %d = %d%n", i+1, col_list[i]);
        }

        System.out.printf("The sum of the diagonal is %d%n", sum_diagonal);

        boolean same = false;

        for (int i = 0; i < row_list.length; i++) {
            if (row_list[i] == col_list[i] && row_list[i] == sum_diagonal) {
                same = true;
            }
        }

        if (same){
            System.out.printf("%s", "This is a magic matrix");
        } else {
            System.out.printf("%s", "This is NOT a magic matrix");
        }


    }
}
