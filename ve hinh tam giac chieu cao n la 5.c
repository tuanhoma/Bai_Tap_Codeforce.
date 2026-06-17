#include <stdio.h>

int main() {
    int n = 10; // Chiều cao của tam giác
    int i, j;

    for (i = 1; i <= n; i++) {
        // In khoảng trắng để căn lề
        for (j = 1; j <= n - i; j++) {
            printf(" ");
        }
        // In dấu '*' để tạo hình tam giác
        for (j = 1; j <= 2 * i - 1; j++) {
            printf("*");
        }
        // Xuống dòng sau mỗi hàng
        printf("\n");
    }

    return 0;
}