#include <stdio.h>
#include <limits.h>

int max(int a, int b) {
    return (a > b) ? a : b;
}

int max_ribbon_pieces(int n, int a, int b, int c) {
    int dp[n + 1];
    for (int i = 0; i <= n; i++) {
        dp[i] = -1; //Khởi tạo tất cả các giá trị thành -1 (không thể đạt được)
    }
    dp[0] = 0; // Vỏ cơ sở: 0 miếng cho chiều dài 0

    for (int i = 1; i <= n; i++) {
        if (i >= a && dp[i - a] != -1) {
            dp[i] = max(dp[i], dp[i - a] + 1);
        }
        if (i >= b && dp[i - b] != -1) {
            dp[i] = max(dp[i], dp[i - b] + 1);
        }
        if (i >= c && dp[i - c] != -1) {
            dp[i] = max(dp[i], dp[i - c] + 1);
        }
    }

    return dp[n];
}

int main() {
    int n, a, b, c;
    scanf("%d %d %d %d", &n, &a, &b, &c);
    printf("%d\n", max_ribbon_pieces(n, a, b, c));
    return 0;
}