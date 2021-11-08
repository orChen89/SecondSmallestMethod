import java.util.Scanner;

public class SecondSmallestMethod {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the array length: ");

        final int[] arr = new int[SCANNER.nextInt()];

        System.out.println("Please enter the array values: ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = SCANNER.nextInt();
        }
        printAnswer(arr);

        }

        static void printAnswer (int[] arr){

            System.out.println("The second smallest number is : " + secondSmallestInArray(arr));
        }

        static int secondSmallestInArray (int [] arr) {

             int smallest = 1;
             int secondSmallest = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                 if (arr[i] < smallest) {
                     smallest = arr[i];
                 }
                 if (arr[i] > smallest && arr[i] < secondSmallest) {
                     secondSmallest = arr[i];
                 }

             }
             return secondSmallest;
         }
    }



















