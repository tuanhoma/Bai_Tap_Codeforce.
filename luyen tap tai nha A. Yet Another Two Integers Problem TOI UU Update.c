#include <stdio.h>
#include <stdlib.h>

void input(int t) {
    int a, b;
    while (t > 0) {
        scanf("%d %d", &a, &b);
        int diff = abs(a - b); // Tính hiệu số giữa a và b
        int count = 0;

        // Sử dụng phép chia để tính số bước
        count = diff / 10; // Mỗi bước có thể giảm 10 đơn vị
        if (diff % 10 != 0) {
            count++; // Nếu còn dư, cần thêm một bước nữa
        }

        printf("%d\n", count);
        t--;
    }
}

int main() {
    int t;
    scanf("%d", &t);

    // Gọi hàm xử lý
    input(t);

    return 0;
}