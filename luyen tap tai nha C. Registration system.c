#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

#define MAX_STRINGS 1000 // Số lượng chuỗi tối đa có thể lưu
#define MAX_LENGTH 100   // Độ dài tối đa của mỗi chuỗi


int main(){
	int t, j = 1;
	scanf("%d", &t);

	char strings[MAX_STRINGS][MAX_LENGTH]; // Mảng để lưu trữ các chuỗi
    int count = 0; // Số lượng chuỗi đã lưu

    while (t--) {
        char a[MAX_LENGTH];
        scanf("%s", a); // Nhập chuỗi
        
        // Kiểm tra xem chuỗi đã tồn tại trong mảng chưa
        int isUnique = 1;
        for (int i = 0; i < count; i++) {
            if (strcmp(strings[i], a) == 0) {
                isUnique = 0; // Chuỗi đã tồn tại
                break;
            }
        }
        int j = 1;
        if (isUnique) {
            // Nếu chuỗi chưa tồn tại, thêm vào mảng
            strcpy(strings[count], a);
            count++;
            printf("ok\n"); // In "ok" nếu chuỗi là duy nhất
        } else {
            // Nếu chuỗi đã tồn tại, in chuỗi kèm số thứ tự
            printf("%s%d\n", a, j);
            j++;
        }
    }

    return 0;
}