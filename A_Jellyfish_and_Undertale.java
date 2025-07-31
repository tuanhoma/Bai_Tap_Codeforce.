import java.util.Scanner;

public class A_Jellyfish_and_Undertale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            int n = sc.nextInt();
            int[] c = new int[n];

            for(int i = 0; i < n; i++){
                c[i] = sc.nextInt();
            }

            long sum = 0;
            sum += b;// cộng vào biến tổng thời gian ban đầu của bom

            for(int i = 0; i < n; i++){
                if(c[i] >= a){// nếu như thời gian công cụ lơn hơn hoặc = với thời giới hạn thì cộng biến đó - 1 vào biến tổng, phải -1 bởi vì bom có thời gian bé nhất phải là 1 ko dc là 0 nên biến giới hạn phải trừ đi 1 coọng vào thì nó sẽ vừa tròn thời gian giới hạn
                    sum += a - 1;
                }else{// nếu < giới hạn cho phép thì cọngo thẳng vào biến sum vì nó bé hơn nên cộng thêm 1 sẽ luôn bé hơn hoặc bằng giói hạn cho phép
                    sum += c[i];
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
