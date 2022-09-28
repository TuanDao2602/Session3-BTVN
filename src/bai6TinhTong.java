import java.util.Scanner;

public class bai6TinhTong {
    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("nhap so hang");
//        int a = scanner.nextInt();
//        System.out.println("nhap so cot");
//        int b = scanner.nextInt();
//        int[][] arr = new int[a][b];
//        System.out.println("nhap phan tu mang 2 chieu");
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                arr[i][j]= scanner.nextInt();
//            }
//        }
//        System.out.println("nhap cot can tinh tong");
//        int cot = scanner.nextInt();
//        int sum=0;
//        for (int i = cot; i <cot+1 ; i++) {
//            for (int j = 0; j < b; j++) {
//                sum+=arr[cot][j];
//            }
//        }
//        System.out.printf("tong cot %d la %d",cot,sum);



        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số hàng");
        int hang = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột");
        int cot = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[hang][cot];
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.printf("nhập vào giá trị của mảng 2 chiều %d ",(i+1));
                array[i][j] = scanner.nextInt();

            }
        }
        System.out.println("nhập vào cột cần tính tổng");
        int cotTinhTong= scanner.nextInt();
        int sum=0;
        for (int i=cotTinhTong;i<cotTinhTong+1;i++){
            for (int j=0;j<hang;j++){
                sum += array[cotTinhTong][j];
            }
        }
        System.out.printf("tong cot %d là %d ",cotTinhTong,sum);
    }
}
