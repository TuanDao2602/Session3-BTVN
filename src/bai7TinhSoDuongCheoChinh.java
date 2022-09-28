import java.util.Scanner;

public class bai7TinhSoDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số hàng");
        int hang =Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột");
        int cot =Integer.parseInt(scanner.nextLine());
        int[][] mangHaiChieu = new int[hang][cot];
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                System.out.println("nhập phần tử của mảng ");
                mangHaiChieu[i][j] = scanner.nextInt();

            }
        }
        int sum = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = i; j <=i ; j++) {
                sum+=mangHaiChieu[i][j];
            }
        }
        System.out.printf("tong cot cheo la %d ",sum);

    }
}
