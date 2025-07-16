import java.util.Scanner;

public class A_Jzzhu_and_Children {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            // số lần cần xếp hàng để đủ kẹo
            b[i] = ((a[i] + m - 1) / m);// ((a[i] + m - 1) / m) <=> Ceil(b[i] / m) số lần cần để nhận kẹo dài nhất và đứng cuỗi hàng
            if(b[i] > max){
                max = b[i];// tìm đứa có số lần cần nhận kẹo cao nhất
            }
        }

        int result = 0;
        // do nguoc laij de tim dua tre can nhiefu keo nhat xep hang cuoi cung vì cần nhiều kẹo nên mất thời gian nhiều nhất xếp hàng cuối cùng
        // do ngược để tìm đứa vừa cần nhiều số lần nhận kẹo vừa đúng cuỗi hàng => đó là đứa trẻ cuỗi cùng
        for(int i = n - 1; i >= 0; i--){
            if(b[i] == max){
                result = i + 1;
                break;
            }
        }


        System.out.println(result);
    }
}
