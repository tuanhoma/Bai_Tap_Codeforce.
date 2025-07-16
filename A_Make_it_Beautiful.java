import java.util.Scanner;

public class A_Make_it_Beautiful {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Check if all elements are the same
            // Nếu như tất cả phần tử trong mảng giống nhau
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                System.out.println("NO");
                continue;
            }

            // Sort array in decreasing order
            // Sắp xếp giảm dần
            sortDescending(a);

            // Try checking if this order is beautiful
            // Nếu như sau khi sắp xếp lớn đến nhỏ mảng thỏa mãn thì in ra
            if (isBeautiful(a)) {
                System.out.println("YES");
                printArray(a);
                continue;
            }

            // Try to fix by swapping elements
            // bước cuối đổi các phần tử trong mảng cho nho nhau để tránh tổng trc a[i] bằng hiện tại
            boolean found = false;
            for (int i = 1; i < n; i++) {
                swap(a, i, i - 1); // try swap with previous( đổi chỗ phần tử trong mảng)
                if (isBeautiful(a)) {
                    System.out.println("YES");
                    printArray(a);
                    found = true;
                    break;
                }
                swap(a, i, i - 1); // undo swap
            }

            if (!found) {
                System.out.println("NO");
            }
        }
    }

    static void sortDescending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    static boolean isBeautiful(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                return false;
            }
            sum += a[i];
        }
        return true;
    }

    static void printArray(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}