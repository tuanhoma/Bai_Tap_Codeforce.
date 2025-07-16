import java.util.Scanner;

public class A_Dont_Try_to_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String x = scanner.next();
            String s = scanner.next();
            int count = 0;
            boolean found = false;
            while (x.length() < 100) { // một số lớn tùy ý để tránh vòng lặp vô hạn
                if (x.contains(s)) {// đây là câu lệnh kiểm tra chuỗi s có chưa trong chuỗi x ko
                    found = true;
                    break;
                }
                x += x;// đây là phép cộng chuỗi cấp số nhân
                count++;
            }
            if (found) {// nếu found đúng thì in ra
                System.out.println(count);
            } else {// nếu như chạy hết vòng While thì sẽ có hai trường hợp
                if (x.contains(s)) {// kiểm tra sau khi chạy hết vòng while chuỗi (S0 có trong chuỗi x ko
                    System.out.println(count);
                } else {// nếu ko in ra -1
                    System.out.println(-1);
                }
                //phép quan trọng nhất bài x.contains(s) dùng để kiểm tra trong chuỗi x có chuỗi s ko
            }
        }
    }
}
