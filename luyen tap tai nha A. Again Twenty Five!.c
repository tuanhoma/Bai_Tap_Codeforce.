#include <stdio.h>

//Hàm tính pow(a, b) % 100 để lấy 2 số cuối kết quả pow một cách hiệu quả
//a = 5, b = n, mod = 100
long long mod_pow(long long a, long long b, long long mod) {
    long long result = 1;
    a = a % mod;  // Đảm bảo a nhỏ hơn mod
    while (b > 0) {
                  // Nếu b lẻ, nhân kết quả với a
        if (b % 2 == 1) {
            result = (result * a) % mod;
        }
                  // Bình phương a và chia b cho 2
        a = (a * a) % mod;
        b = b / 2;
    }
    return result;
}

int main() {
    long long n;
    scanf("%lld", &n);

    // Tính 5^n % 100
    long long result = mod_pow(5, n, 100);

    // In ra 2 chữ số cuối cùng
    printf("%02lld\n", result);

    return 0;
}