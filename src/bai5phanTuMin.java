import java.util.Scanner;

public class bai5phanTuMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số hàng");
        int hang = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số Cột");
        int cot = Integer.parseInt(scanner.nextLine());
        int[][] mangHaiChieu = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("nhập vào phần tử của mảng %d ",(i+1));
                mangHaiChieu[i][j] = scanner.nextInt();
            }
        }
        System.out.println("phần tử nhỏ nhất của mảng là : ");
        int min = mangHaiChieu[0][0];
        for (int i=0;i<hang;i++){
            for (int j=0; j<cot;j++){
                if (min>mangHaiChieu[i][j]){
                    min = mangHaiChieu[i][j];
                }
            }
        }
        System.out.printf("phần tử bé nhất là %d",min);
    }
}
