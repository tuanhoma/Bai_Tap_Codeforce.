#include <stdio.h>

// Hàm đếm số lượng bit 1 trong biểu diễn nhị phân của x
int min_bacteria(int x) {
    int count = 0;
    while (x > 0) {
        // Kiểm tra bit cuối cùng có phải là 1 không
        if (x & 1) {
            count++;
        }
        // Dịch phải x để kiểm tra bit tiếp theo
        x = x >> 1;
    }
    return count;
}

int main() {
    int x;
    // Đọc đầu vào
    scanf("%d", &x);
    // Tính và in ra kết quả
    printf("%d\n", min_bacteria(x));
    return 0;
}