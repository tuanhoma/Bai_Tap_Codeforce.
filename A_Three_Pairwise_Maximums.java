import java.util.*;

public class A_Three_Pairwise_Maximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            Arrays.sort(arr);  // sắp xếp tăng dần

            if(arr[1] == arr[2]) {
                System.out.println("YES");
                System.out.println(arr[0] + " " + arr[0] + " " + arr[2]);
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}