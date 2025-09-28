import java.util.Scanner;

public class A_Omkar_and_Completion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                System.out.print("1" + " ");// in ra đúng 1 số duy nhất sẽ thỏa mãn bài là 2 số bất kỳ trong mảng công lại != 1 số bất kì trong mảng
            }
            System.out.println();
        }
    }
}
