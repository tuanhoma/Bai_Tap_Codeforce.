import java.util.Scanner;

public class B_The_Cake_Is_a_Lie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int column = m - 1;// đầu tiên là đi ở hàng 1 và đến số cột cần thiết m - 1 là số tiền cần đi đến cột m
            int row = (n - 1) * m;// tiêps theo số tiền cần đi đến hàng đó là số tiền ở cột hiện tại sau khi đã khi chuyển nhân với số bước đi đến hnagf cần thiết
            int result = column + row;

            if(result - k == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
