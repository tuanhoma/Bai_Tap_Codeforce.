#include <stdio.h>
#include <string.h>

int main() {
    char s[101]; // Chuỗi nhập vào có độ dài tối đa 100 ký tự
    scanf("%s", s);

    char hello[] = "hello";
    int index = 0; // Biến thứ tự để kiểm tra các ký tự của "hello"
    int length = strlen(s); // Độ dài chuỗi s

    for (int i = 0; i < length; i++) {
        if (s[i] == hello[index]) { // Nếu tìm thấy ký tự đúng theo thứ tự
            index++;
        }
        if (index == 5) { // Nếu đã tìm đủ "hello"
            printf("YES\n");
            return 0;
        }
    }

    printf("NO\n"); // Nếu không tìm đủ "hello"
    return 0;
}