import java.util.Scanner;

public class phanTuMax {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số row của mảng");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số col của mảng");
        int c =Integer.parseInt(scanner.nextLine());
        int[][] mangHaiChieu = new int[r][c];


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("nhập vào phần tử của mảng 2 chiều %d ",(i+1));

                mangHaiChieu[i][j]=scanner.nextInt();
            }

        }
        System.out.println("phần tử lớn nhất là");
        int max = mangHaiChieu[0][0];
        for (int i=0;i<r;i++){
            for (int j=0; j<c;j++){
                if (max<mangHaiChieu[i][j]){
                    max=mangHaiChieu[i][j];
                }
            }
        }
        System.out.printf("%d",max);

    }
}
