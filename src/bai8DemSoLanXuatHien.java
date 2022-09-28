import java.util.Scanner;

public class bai8DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi ký tự");
        String chuoi = scanner.nextLine();
        System.out.println("nhập vào 1 kí tự để check");
        char kiTu = scanner.nextLine().charAt(0);
        int count =0;
        for (int i=0;i<chuoi.length();i++){
            if (kiTu== chuoi.charAt(i)){
                count++;

            }
        }if (count==0){
            System.out.println("kí tự bạn nhập không có trong chuỗi");
        }else {
            System.out.println("kí tự bạn nhập có số lần lặp lại là  " + count);
        }
    }

}







