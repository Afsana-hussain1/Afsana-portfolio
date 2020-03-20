import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] numArray = new int[10];
        numArray[0] = 12;
        numArray[1] = 24;
        numArray[2] = 54;
        numArray[3] = 45;
        numArray[4] = 3;
        numArray[5] = 1;
        numArray[6] = 100;
        numArray[7] = 77;
        numArray[8] = 94;
        numArray[9] = 5;

        System.out.println(Arrays.toString(numArray));
        System.out.println(numArray.length);

        System.out.println("Enter a number you wish to search for in the array between numbers 1-100");
        int num = myScanner.nextInt();

        for (int i = 0; i < numArray.length; i++) {
            if (num == numArray[i]) {
                System.out.println("The number" + " " + num + " " + "is in the array");
                break;
            }else

                if (num != numArray[i]) {
                    //loop stops after 9th index
                    if (i > 8 && numArray[i] != num )
                    System.out.println("The number" + " " + num + " " + "is not in the array");
                   // break;
                }


            }
        }
    }



