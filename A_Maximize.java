import java.util.Scanner;

public class A_Maximize {


    // Hàm tính GCD (ước chung lớn nhất)
    public static int gcd(int a, int b){// hàm này là đệ quy
        if(b == 0) return a;
        return gcd(b, a % b);// đây là bước đệ quy
    }// nó sẽ đệ quy đến khi b == 0 và trả về a chính là x sau khi đệ quy chính là ước chung lớn nhất

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int max = 0;
            int result = 1;

            for(int y = 1; y < x; y++){
                int value = gcd(x, y) + y;
                if(value > max){
                    max = value;
                    result = y;
                }
            }

            System.out.println(result);
        }
    }
}
