import java.util.Scanner;
public class B_A_and_B_and_Compilation_Errors1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //input
        input(sc, n);
        sc.close();
    }

    public static void input(Scanner sc, int n) {
        long[] a = new long[n];
        long[] b = new long[n - 1];
        long[] c = new long[n - 2];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextLong();
        }

        for (int i = 0; i < n - 2; i++) {
            c[i] = sc.nextLong();
        }

        // Gán -1 nếu trùng nhau giữa a và c
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    a[i] = -1;
                    b[j] = -1;
                    break; // rất quan trọng: tránh trùng lặp nhiều lần
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(a[i] > -1){
                System.out.println(a[i]);
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if ((b[i] == c[j]) && (b[i] != -1)) {
                    b[i] = -1;
                    c[j] = -1;
                    break;// rất quan trọng: tránh trùng lặp nhiều lần
                }
            }
        }

        for(int i = 0; i < n - 1; i++){
            if(b[i] > -1){
                System.out.println(b[i]);
            }
        }
    }
} 