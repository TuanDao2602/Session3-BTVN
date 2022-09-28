import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class bai3GopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào độ dài của mảng 1");
        int n= Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        for (int i = 0; i <array1.length ; i++) {
            System.out.printf("nhập vào giá trị index của mang1 %d ",(i+1));
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        //nhập mảng 2
        System.out.println("nhập vào độ dài của mảng 2");
        int n2 = Integer.parseInt(scanner.nextLine());
        int[] array2= new int[n2];
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("nhập vào giá trị in dex của mang2 %d ",(i+1));
            array2[i]=Integer.parseInt(scanner.nextLine());
        }

        int[] mangGop = new int[array1.length + array2.length];
        for (int i=0;i<mangGop.length;i++){//chưa rõ logic lắm
            if (i<array1.length){
                mangGop[i]=array1[i];
            }else {
                mangGop[i] = array2[i-array1.length];// chưa rõ logic lắm
            }
        }
        System.out.println("mảng sau khi gộp là");
        for (int i = 0; i < mangGop.length; i++) {
            System.out.printf("%d\t",mangGop[i]);

        }
        System.out.println("\n");

    }
}
