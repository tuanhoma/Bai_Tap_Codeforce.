import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Div_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        int tmp = 11;
        while(tmp < 999){
            if(tmp % 7 == 0){
                list.add(tmp);
            }
            tmp++;
        }

        while(t-- > 0){
            int n = sc.nextInt();
            int result = 0;

            if(n % 7 == 0){
                System.out.println(n);
            }else{
                for(int a : list){
                    if(a > n){
                        result = a;
                        break;
                    }
                }
                System.out.println(result);
            }
        }
    }
}
