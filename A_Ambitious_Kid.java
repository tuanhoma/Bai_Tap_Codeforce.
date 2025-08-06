import java.util.Scanner;

public class A_Ambitious_Kid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        int min = 100000000;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(Math.abs(a[i]) < min){
                min = Math.abs(a[i]);// tìm số gần với 0 nhất kể cả số âm
            }
        }

        System.out.println(min);
    }
}
