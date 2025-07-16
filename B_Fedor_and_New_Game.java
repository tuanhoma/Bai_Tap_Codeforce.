import java.util.Scanner;
public class B_Fedor_and_New_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[m + 1];
        for(int i = 0; i < m + 1; i++){
            a[i] = sc.nextInt();
        }

        int fedor = a[m];
        int countFriends = 0;

        for (int i = 0; i < m; i++) {
            int diff = a[i] ^ fedor;  // // 1. XOR hai đội quân để tìm sự khác biệt và trả về 1 tại vị trí bit khác nhau
            int diffBits = Integer.bitCount(diff);  // 2, Đếm số bit 1 tại diff ở trên
            if (diffBits <= k) {
                countFriends++;
            }
        }

        System.out.println(countFriends);
    }
}
