import java.util.Scanner;

public class A_Phone_Desktop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int tmp = x + (y * 4);

            int count = 0;
            while(true){
                if(tmp <= 0 && y <= 0){// điều kiện tmp và y phải <= 0 thì mới break, vì 1 màn hình count chỉ chứa dc 2 y, nên nêú như tmp <= 0 nhưng vẫn còn dư y thì chưa dc break;
                    break;
                }else{
                    tmp -= 15;// từ đi tất cả tmp - 15
                    y -= 2;// mỗi lần y chỉ dc trừ đi 2
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
