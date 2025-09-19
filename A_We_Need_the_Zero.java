import java.util.Scanner;

public class A_We_Need_the_Zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[]a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int result = 0;
            boolean found = false;
            for(int i = 0; i <= Math.pow(2, 8); i++){
                int sum = a[0] ^ i;// đặt sum làm b[i] = a[i] XỎR i đầu tiên
                for(int j = 1; j < n; j++){// duyệt qua để Xor với tất cả ptu trong mảng
                    int tmp = a[j] ^ i;
                    sum ^= tmp;
                }
                if(sum == 0){// nếu sau khi XOR với tất cả ptu trong mảng xong mà xor == 0 thì break; in ra i khiến sum xor với tất cả ptu trong mảng == 0
                    found = true;
                    result = i;
                    break;
                }
            }

            if(found){// nếu như tìm dc i khiến cho xor tất cả ptu trong mảng ra == 0 thù in giá trị i đó
                System.out.println(result);
            }else{// nếu ko tìm dc thì in - 1
                System.out.println("-1");
            }
        }
    }
}
