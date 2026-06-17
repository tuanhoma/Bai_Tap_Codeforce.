#include <stdio.h>

void numbermang(long long n, long long *c) {
    long long oddCount = (n + 1) / 2;  // Số lượng số lẻ
    long long evenCount = n / 2;       // Số lượng số chẵn

    // Điền số lẻ vào mảng c
    for (long long i = 0; i < oddCount; i++) {
        c[i] = 2 * i + 1;
    }

    // Điền số chẵn vào mảng c
    for (long long i = 0; i < evenCount; i++) {
        c[oddCount + i] = 2 * (i + 1);//c[oddCount + i] dung de xep cac so chan dang sau
    }
}

int main() {
    long long n, m;
    scanf("%ld %ld", &n, &m);
    long long c[n];

    numbermang(n, c);

    // In ra phần tử thứ m (lưu ý m được nhập theo chỉ mục từ 1)
    printf("%ld\n", c[m - 1]);

    return 0;
}