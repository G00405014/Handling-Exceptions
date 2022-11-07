package week7;

import java.util.InputMismatchException;
import java.util.Scanner;

//Name: Emeka Adimora
//Date: 07/11/22
//Student id: G00405014

public class UsingTryCatch {
    public static void main(String[] args) {
        int num = 1;
        while(num > 0) {
            try {
                System.out.println("Please enter a number between 0-9 :");
                Scanner myscan = new Scanner(System.in);
                int myNum = myscan.nextInt();

                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered" + myNum);
                } else {
                    System.out.println("Not valid number");
                }
            //Catching error
            } catch (InputMismatchException ime) {
                System.out.println("Caught exception ");
            }
        }
}
}
