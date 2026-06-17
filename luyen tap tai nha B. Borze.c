#include <stdio.h>
#include <string.h>

int main() {
    char borze[201]; // Chuỗi Borze (tối đa 200 ký tự + ký tự kết thúc chuỗi '\0')
    scanf("%s", borze); // Nhập chuỗi Borze

    int i = 0;
    while (i < strlen(borze)) {
        if (borze[i] == '.') {
            printf("0"); // '.' tương ứng với 0
            i++;
        } else if (borze[i] == '-') {
            if (borze[i + 1] == '.') {
                printf("1"); // '-.' tương ứng với 1
                i += 2;
            } else if (borze[i + 1] == '-') {
                printf("2"); // '--' tương ứng với 2
                i += 2;
            }
        }
    }

    printf("\n"); // Xuống dòng sau khi in kết quả
    return 0;
}