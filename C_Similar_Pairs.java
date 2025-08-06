import java.util.*;

public class C_Similar_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of the array
            int[] a = new int[n];

            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) even++;
                else odd++;
            }

            Arrays.sort(a);

            boolean hasAdjacentPair = false;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(a[i] - a[i + 1]) == 1) {
                    hasAdjacentPair = true;
                    break;
                }
            }

            if ((odd % 2 == 0 && even % 2 == 0) || hasAdjacentPair) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

