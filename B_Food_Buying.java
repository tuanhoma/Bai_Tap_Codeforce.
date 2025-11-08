import java.util.Scanner;

public class B_Food_Buying {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            //vì đề bài yêu cầu tính tổng tiền bằng số tiền ban đầu + với số tiền dc trả lại là ra tổng
            int result = n + (int)Math.floor((double)(n - 1) / 9);
            // n là tổng tiền tối đa ban đầu,
            // (int)Math.floor((double)(n - 1) / 9) là số tiền được hoàn lại 10%
            System.out.println(result);
        }
    }
}
