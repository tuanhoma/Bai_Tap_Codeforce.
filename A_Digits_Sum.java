
import java.util.Scanner;

public class A_Digits_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long count = 0;

            count = (n + 1) / 10;// vì nếu như số cuối là 9 + 1 nó sẽ lên 1 số to hơn và chia 10 sẽ ra số lượng số có 9 ở cuối vd: 29 + 1 = 30 / 10 = 3 số interestinng
                                 // còn nếu là các số < 9 thì thi + 1 nó sẽ ko dc làm tròn số to hơn và chia 10 thì số lượng số vẫn vậy vd: 34 + 1 = 35 / 10 = 3 số interesting

            System.out.println(count);
        }
    }
}
