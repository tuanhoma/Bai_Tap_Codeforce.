import java.util.Scanner;
public class A_The_number_of_positions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        // nghĩa là có n trường hợp
        // mỗi trường hợp cần kiểm tra xem (i >= a && i <= b)
        // sau n trường hợp đứng ta có thể biết được có bao nhiêu vị trí đứng hợp lệ trong n vị trí đứng thỏa mãn
        // vì đề bài yêu cầu tìm" số vị trí khác nhau có thể dứng chứ ko phải 1 vị trí
        for(int i = 1; i <= n; i++){
            if(i >= a && i <= b){
                count++;
            }
        }
        System.out.println(count);
    }
}
