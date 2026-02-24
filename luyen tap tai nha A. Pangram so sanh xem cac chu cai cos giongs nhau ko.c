#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
int main(){
	int n;
	scanf("%d", &n);
	char a[n + 1];
	scanf("%s", a);
    int visited[256] = {0};  // Mảng đánh dấu các ký tự đã xuất hiện
    int count = 0;           // Đếm số lượng ký tự chữ cái duy nhất

    for (int i = 0; a[i] != '\0'; i++) {
        char current_char = tolower(a[i]);  // Chuyển đổi thành chữ thường
        if (current_char >= 'a' && current_char <= 'z') {  // Chỉ xét ký tự chữ cái
            if (visited[(int)current_char] == 0) {  // Nếu ký tự chưa xuất hiện
                visited[(int)current_char] = 1;     // Đánh dấu ký tự đã xuất hiện
                count++;                            // Tăng biến đếm
            }
        }
    }
	if(count == 26)
	printf("YES");
	else
	printf("NO");
	return 0;
}