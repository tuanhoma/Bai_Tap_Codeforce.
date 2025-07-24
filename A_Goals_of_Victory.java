import java.util.Scanner;

public class A_Goals_of_Victory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n - 1];
            int count_am = 0;
            int count_duong = 0;

            for(int i = 0; i < n - 1; i++){
                a[i] = sc.nextInt();
                if(a[i] < 0){
                    count_am += a[i];// tổng điểm của các đội thắng
                }else{
                    count_duong += a[i];// tổng điểm các đội thua
                }
            }

            int sum = count_am + count_duong;// số điểm của dội bị mất
            if(sum <= 0){// nếu điểm của đội bị mất nó là âm thì chuyển lại thành dương vì nếu âm thì điểm của đội đó phải dương vì đó là số điểm đội đó thắng dc
                System.out.println(Math.abs(sum));
            }else{// nếu điểm của đội đó dương thì chuyển lại thành âm, điều đó có nghĩa là đó là tổng điểm thua của đội đó
                System.out.println("-" + sum);
            }
        }
        sc.close();
    }
}
