#include <stdio.h>
#include <math.h>

// Hàm tìm ước chung lớn nhất (GCD)
int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int a, b, c = 6;
    scanf("%d %d", &a, &b);
    
    int max_i = (a > b) ? a : b; // Tìm giá trị lớn nhất giữa a và b
    int numerator = 7 - max_i;   // Tử số (số kết quả thuận lợi)
    int denominator = c;         // Mẫu số (tổng số kết quả có thể)
    
    // Rút gọn phân số
    int common_divisor = gcd(numerator, denominator);
    int simplified_num = numerator / common_divisor;
    int simplified_den = denominator / common_divisor;
    
    printf("%d/%d", simplified_num, simplified_den);
    return 0;
}