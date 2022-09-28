import java.util.Scanner;

public class xoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng");
        int n =Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[n];
        for (int i=0 ;i<arrInt.length;i++) {
            System.out.printf("nhập vào giá trị của index %d ",(i+1));
            arrInt[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("giá trị các phần tử của mảng trước khi xóa là");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);

        }
        System.out.println("\n");
        // nhập giá trị cần xóa
        System.out.println("nhập vào giá trị bạn cần xóa");
        int canXoa = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i=0;i<arrInt.length;i++){
            if (canXoa==arrInt[i]){
                count++;
            }
        }
        // khởi tạo mảng mới
        int[] arrNew = new int[arrInt.length-count];
        int index=0;
        //copy phần tử sang mảng mới ;
        for (int i=0;i<arrInt.length;i++){
            if (arrInt[i]==canXoa){
                continue;
            }else {
                arrNew[index] = arrInt[i];
                index++;
            }
        }
        System.out.println("mảng mới sau khi xóa là: ");
        for (int i=0;i<arrNew.length;i++){
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.println("\n");

    }
}




