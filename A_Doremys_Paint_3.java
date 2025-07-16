import java.util.*;

public class A_Doremys_Paint_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            boolean found = false;

            do {
                int sum = a[0] + a[1];
                boolean ok = true;
                for(int i = 1; i < n - 1; i++) {
                    if(a[i] + a[i+1] != sum) {
                        ok = false;
                        break;
                    }
                }
                if(ok) {
                    found = true;
                    break;
                }
            } while(nextPermutation(a));

            System.out.println(found ? "YES" : "NO");
        }
        sc.close();
    }

    // Tạo hoán vị kế tiếp (giống std::next_permutation trong C++)
    static boolean nextPermutation(int[] a) {
        int i = a.length - 2;
        while(i >= 0 && a[i] >= a[i + 1]) i--;
        if(i < 0) return false;

        int j = a.length - 1;
        while(a[j] <= a[i]) j--;
        swap(a, i, j);
        reverse(a, i + 1, a.length - 1);
        return true;
    }

    static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }

    static void reverse(int[] a, int l, int r) {
        while(l < r) swap(a, l++, r--);
    }
}

