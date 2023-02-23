package BaiTapTuan4;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int size;
        int array[];;


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        size = scanner.nextInt();
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("phan tu cua mang" + (i + 1));
            array[i] = scanner.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        int sum = 0;
        for (int number : array) {
            sum += number;

Duyetmangbangforeach(array);
Timgiatrilonnhat(array);
    }
        //    bài3
    }
    public static void Duyetmangbangforeach (int array []){
        for (int c:array
        ) {
git         System.out.println("Phần tử trong mảng là " +c);
        }
    }


    //Bài 4
    public static void Timgiatrilonnhat (int array []){
        int max = 0 ;
        for (int num :array
        ) {
            if (num > max){
                max = num ;
            }

        }
        System.out.println("Gía trị lớn nhất là " + max);
    }

}


















