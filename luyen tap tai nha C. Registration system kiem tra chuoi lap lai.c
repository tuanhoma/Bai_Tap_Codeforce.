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
    int counts[MAX_STRINGS] = {0};        // Mảng để lưu số lần xuất hiện của từng chuỗi
    

    while (t--) {
        char a[MAX_LENGTH];
        scanf("%s", a); // Nhập chuỗi
        
        // Kiểm tra xem chuỗi đã tồn tại trong mảng chưa
        int isUnique = 1;
        int index = -1; // Vị trí của chuỗi trong mảng (nếu đã tồn tại)
        for (int i = 0; i < count; i++) {// biến count dùng để dò xem các chuỗi đã dc lưu vào mảng a chưa
            if (strcmp(strings[i], a) == 0) {
                isUnique = 0; // Chuỗi đã tồn tại
                index = i;    // Lưu vị trí của chuỗi
                break;
            }
        }
       
        if (isUnique) {
            // Nếu chuỗi chưa tồn tại, thêm vào mảng
            strcpy(strings[count], a);//strcpy là hàm sao chép chuỗi trong C. dung de luu chuoi vị trí test case chuỗi 0 vào vị trí 0 mảng a
            counts[count] = 0; // Số lần xuất hiện ban đầu là 0
            count++;
            printf("OK\n"); // In "ok" nếu chuỗi là duy nhất
        } else {
           // Nếu chuỗi đã tồn tại, tăng số lần xuất hiện và in tên mới
           counts[index]++;
           printf("%s%d\n", a, counts[index]);
        }
    }

    return 0;
}