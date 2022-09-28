import java.util.Scanner;

public class ThêmPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" nhập vào số phần tử từ bàn phím");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[n];

        for (int i=0;i<arrInt.length;i++){
            System.out.printf("nhập giá trị phần tử %d",(i+1));
            arrInt[i]=Integer.parseInt(scanner.nextLine());

        }
        System.out.println("mảng trước khi thêm là");
        for (int i=0;i<arrInt.length;i++) {
            System.out.printf("%d\t", arrInt[i]);
        }
        System.out.println("\n");

//        System.out.println("nhập vào mảng mới cần khởi tạo");
        int[] newarray = new int[arrInt.length+1];
        System.out.println("nhập vào số cần thêm");
        int socanthem = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào chỉ số vị trí cần thêm");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<newarray.length;i++){
            if (i<index){
                newarray[i]=arrInt[i];
            }else if (i==index){
                newarray[i]=socanthem;
            }else {
                newarray[i]=arrInt[i-1];
            }
        }
        System.out.println("mảng mới sau khi thêm là ");
        for (int i =0;i<newarray.length;i++){
            System.out.printf(" %d", newarray[i]);
        }

    }
}
