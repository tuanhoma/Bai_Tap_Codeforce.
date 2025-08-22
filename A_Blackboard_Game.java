import java.util.Scanner;

public class A_Blackboard_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int count_0 = 0;
            int count_1 = 0;
            int count_2 = 0;
            int count_3 = 0;

            for(int i = 0; i < n; i++){// đếm các số lượng số dư 0, 1, 2, 3
                if(i % 4 == 0){
                    count_0++;
                }

                if(i % 4 == 1){
                    count_1++;
                }

                if(i % 4 == 2){
                    count_2++;
                }

                if(i % 4 == 3){
                    count_3++;
                }
            }

            int maxPlay = Math.min(count_0, count_3) + Math.min(count_1, count_2);// Số lượt chơi tối đa là lấy min của dư giữa (0 và 3) và dư giữa (1 và 2) tổng dư min của (0, 3) và (1, 2) cộng lại với nhau sẽ ra số lượt chơi tối đa
            int result = 2 * maxPlay;// Tổng số phần tử bị xóa = 2 × số lượt chơi tối đa, vì mối lượt đi sẽ xóa 2 ptu

            if(result < n){// Nếu result < n ⇒ còn dư số lẻ, Alice sẽ thua (vì cô ấy đi trước và sẽ kẹt lại).
                System.out.println("Alice");
            }else{// Nếu result == n ⇒ tất cả số đều ghép được hết, tức là lượt cuối cùng Bob đi, và lượt sau Alice không còn gì để đi ⇒ Bob thua, Alice thắng.
                System.out.println("Bob");
            }
        }
    }
}
