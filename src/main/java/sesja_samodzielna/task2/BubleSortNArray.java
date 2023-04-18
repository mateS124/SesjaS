package sesja_samodzielna.task2;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BubleSortNArray {
    public static void main(String[] args) {
        System.out.println("Podaj ilość elementów do posortowania: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] toSort = new int[n];
        System.out.println("Podaj elementy tablicy: ");
        for(int i = 0; i < n; i++){
            toSort[i] = sc.nextInt();
        }

        int temp;
        for (int i = 0; i < n -1; i ++){
            for (int j = 0; j < (n - i - 1); j++){
                if (toSort[j] > toSort[j + 1]){
                    temp = toSort[j];
                    toSort[j] = toSort [j + 1];
                    toSort[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers: ");
        for (int i = 0; i < n; i++){
            System.out.print(toSort[i] + " ");
        }
    }


}
