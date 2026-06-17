#include <stdio.h>
#include <string.h>

void input(int t) {
    while(t > 0) {
        char a[101];
        char b[51] = {0};
        char c[51] = {0};
        
        // Đọc chuỗi an toàn
        if (fgets(a, 101, stdin) == NULL) {
            break;  // Xử lý lỗi đọc input
        }
        a[strcspn(a, "\n")] = '\0'; 
        
        int len = strlen(a);
        
        if(len % 2 == 0) {
            int half = len / 2;
            
            // Copy nửa đầu
            strncpy(b, a, half);
            b[half] = '\0';
            
            // Copy nửa sau
            strncpy(c, a + half, half);
            c[half] = '\0';
            
            // So sánh và in kết quả
            printf("%s\n", strcmp(b, c) == 0 ? "YES" : "NO");
        } else {
            printf("NO\n");
        }
        t--;
    }
}

int main() {
    int t;
    if (scanf("%d", &t) != 1) {
        return 1;  // Xử lý lỗi nhập
    }
    getchar();  // Xóa ký tự newline thừa
    
    input(t);
    
    return 0;
}