import java.util.Scanner;

public class A_Petr_and_Book {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[7];

        for(int i = 0; i < 7; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int i = 0;
        while(true){
            if(i == 7){// tạo thành một vòng tròn
                i = 0;
            }
            if(sum < n){
                sum += a[i];// cộng vào biến tổng
                i++;// index +1
            }
            if(sum >= n){// nều biến tổng vừa dc cộng ở trên thì in ra i, mà i đã dc + 1 thỏa mãn đề bài vì đề bài yêu cầu đi từ 1 mà mảng bắt đầ từ 0
                break;
            }
        }

        System.out.println(i);
    }
}
