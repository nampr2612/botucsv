import java.util.Scanner;

public class baibuoi7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in );
        int[]array=new int[10];
        System.out.println("nhap cac phan tu mang:\n");

        for (int i = 0; i < array.length; i++) {
            System.out.println("phan tu mang"+ i +"=");
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        sum(array);
        sum2(array);
        nhan(array);

        }

    public static void sum(int[] array) {
        int tong=0;
        for (int i = 1; i < array.length ; i+=2) {
            tong += array[1];
        }
        System.out.println("ket qua tong 1 3 5 7 9 la:"+tong);   }



    public static void sum2(int[]array){

    }

    public static void nhan(int []array) {
        int tich=1;
        for (int i = 2; i <array.length;i++){
                tich=array[2]*array[4]*array[9];

        }
        System.out.println("ket qua ham tich 2 4 9 la:"+tich);
        }
}
