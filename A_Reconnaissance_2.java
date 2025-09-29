import java.util.Scanner;

public class A_Reconnaissance_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ai = 0;
        int aj = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;// duyệt qua các kí tự liên tiếp để tìm 2 ptu liên tiếp tạo ra chênh lệch nhỏ nhất
        for(int i = 0; i < n - 1; i++){
            if(Math.abs(a[i] - a[i + 1]) < min){
                min = Math.abs(a[i] - a[i + 1]);
                ai = i;
                aj = i + 1;
            }
        }

        if(Math.abs(a[n - 1] - a[0]) < min){// lấy ptu cuỗi cùng và ptu đầu tiên là một vòng xoay trừ nhau xem có chênh lệch nhỏ nhất ko
            min = Math.abs(a[n - 1] - a[0]);
            ai = n - 1;
            aj = 0;
        }

        System.out.println((ai + 1) + " " + (aj + 1));
    }
}
