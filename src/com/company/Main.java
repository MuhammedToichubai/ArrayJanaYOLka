package com.company;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
   /*YOLKANYN KODU
        int b = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = b; j > 0; j--) {
                System.out.print(" ");
            }

            for (int i1 = 0; i1 < i; i1++) {
                System.out.print("* ");
            }
            System.out.println();
            b--;
        }*/
  /*  short[] muhammed = new short[5];
    muhammed[0] = 1997;
    muhammed[4] = 2022;
    muhammed[3] = 25;
    muhammed[1] = 2003;
    muhammed[2] = 2014;

        for (int i = 0; i < muhammed.length; i++) {
            System.out.println( muhammed[i]);
        }*/

      /*  int[] muhammed = new int [10];
        int summa = 0;
        for (int i = 0; i < muhammed.length; i++) {
            muhammed[i] = random.nextInt(100);
            summa += muhammed[i];
            System.out.print(muhammed[i]+"+");
        }  System.out.println(summa/muhammed.length);*/


       /* Random random = new Random();
        int[] arr1 = new int[10];
        int sum = 0;

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = random.nextInt(100);
            sum = sum + arr1[j];
        } System.out.println((sum/arr1.length));*/

    /* int sandar = scanner.nextInt();
      int summa = 0;
        for (int i = 1; i < sandar ; i++) {
            if (i%2 == 0){
                summa += i;
                  System.out.print(i);
                  if ( ) {
                      System.out.print(" + ");
                  } else {
                      System.out.print(" = ");
                    }
            }

        }
        System.out.println(summa); */


//        System.out.println("Massivde kancha element bolsun jazynyz:");
//        int element = scanner.nextInt();
//        System.out.println("Massivge kancha element berseniz ar birine maani jazynyz:");
//        int maani = scanner.nextInt();
//        int [] massiv  = new int[element];
//        int summa =0;
//        for (int i = maani; i <= element ; i++){
//
//

        /* Массив тузуп аны толтурунуз.
        Жуп сан болгон элементтерин консольго чыгарыныз.
        Массивдин элементтери:
        1 2 3 4 5 6 7 8 9 10
        Жооп:
        2 4 6 8 10*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Massivge bir element beriniz :");
        int massivElement = scanner.nextInt();
        int[] muhammed = new int [massivElement];
        int summa;
        for (int i = 1; i <= muhammed.length; i++) {
            summa = i % 2;
            if (i%2 == 0){
                System.out.print( i +" ");
            }
        }
        System.out.println(" <-Birden bashtap (" + massivElement + ") sanyna cheyinki jup sandar.");*/

         //   Коломун 10 жана бутун сан сактаган массивтузунуз
        //   Ичин кокус(рандом) сандар менентолтурунуз.
        //   Маанилердин орточо арифметикалыкмаанисин табып консолго чыгарынз

      /*  int summa = 0;
        int [] massiv = new  int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(100);
            summa = summa  + massiv[i];
           if ( massiv.length >= massiv.length) {
               System.out.print(massiv[i] + " + ");
           }
           else {
               System.out.print(massiv[i] +" = ");
           }
        }
        System.out.println(summa/10d);*/
    Scanner scanner = new Scanner(System.in);

    String[]  massiv = new String[10];
    massiv[0] = "Moskva" ;
    massiv[1] = "Bishkek" ;
    massiv[2] = "Kyrgyzstan";
    massiv[3] = "Rossiya";
    massiv[4] = "Esen Niyazov";
    massiv[5] = "Aizhan Nurmatova" ;
    massiv[6] = "Beksultan Mamatkadyr uulu ";
    massiv[7] = "Elnura Tadzhibaeva";
    massiv[8] = "Mukhammed Allanov";
    massiv[9] = "Dinara Bakirova" ;
        System.out.println("Peaksoft kaisyl mamlekette je kaisyl shaarda bar ekenin jazynyz, bolboso Peaksofto kaisyl ishker ishteerin jazynyz?");
    String peaksoft = scanner.nextLine();
        for (String str:
             massiv) {
            if (peaksoft == str) {
                System.out.println(str);
            }
            else {
                System.out.println("Siz jazgan shaarda Peaksoft jana bul mugalim jok ");
            }


        }




    }
}
