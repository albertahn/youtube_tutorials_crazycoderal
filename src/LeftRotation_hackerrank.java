
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation_hackerrank {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt(); //5
            int k = in.nextInt();  //4
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();  //1,2,3,4,5
            }

            int[] answerArr = getRotation(a, k);

            for(int x :  answerArr){
                System.out.print(x + " ");

            }


        }//main

        private static int[] getRotation(int[] arr, int rota){
            int[] res = new int[arr.length];

            //rotate -> . rota % arr.length =4  == 14
            //  4,0,1,2,3
            // 5,1,2,3,4

            int newRotaIndex =  rota % arr.length;

            //res[0] = arr[4];  5
            //res[1] = arr[0];

            for(int i=0; i< arr.length; i++){

                res[i] = arr[(newRotaIndex+i)%arr.length];   // res[0] = arr[2]  //2 rot -. 3rd index


            }//for



            return res;

        }



}
