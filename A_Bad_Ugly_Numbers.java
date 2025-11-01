import java.util.Scanner;

public class A_Bad_Ugly_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            // nếu như in số 2 và một loạt số 3 có số lượng chữ số là n đằng sau thì luôn thỏa mãn 4 điều kiện của bài
            /*
            1, s > 0
            2, s có đúng n chữ số
            3, Không có chữ số nào trong s bằng 0
            4, s không chia hết cho bất kỳ chữ số nào của chính nó*/
            if(n == 1){// nếu số lượng chữ số là 1 thì luôn ko thỏa mãn
                System.out.println("-1");
            }else{
                System.out.print("2");
                for(int i = 2; i <= n; i++){
                    System.out.print("3");
                }
                System.out.println();
            }
        }
    }
}
