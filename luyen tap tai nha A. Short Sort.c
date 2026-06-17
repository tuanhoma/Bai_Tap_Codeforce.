#include <stdio.h>
#include <string.h>

int main() {
    int t;
    scanf("%d", &t);
    while (t > 0) {
        char a[4];
        scanf("%s", a);
        
        // Kiểm tra trực tiếp
        if (strcmp(a, "abc") == 0) {
            printf("YES\n");
        } 
        // Hoán đổi 2 ký tự đầu và kiểm tra
        else {
            char temp = a[0];
            a[0] = a[1];
            a[1] = temp;
            
            if (strcmp(a, "abc") == 0) {
                printf("YES\n");
            } 
            // Khôi phục lại chuỗi ban đầu và thử hoán đổi khác
            else {
                a[1] = a[0];  // Khôi phục a[1]
                a[0] = temp;   // Khôi phục a[0]
                
                // Hoán đổi a[0] và a[2]
                temp = a[0];
                a[0] = a[2];
                a[2] = temp;
                
                if (strcmp(a, "abc") == 0) {
                    printf("YES\n");
                } 
                // Khôi phục lại và thử hoán đổi a[1] và a[2]
                else {
                    a[2] = a[0];  // Khôi phục a[2]
                    a[0] = temp;  // Khôi phục a[0]
                    
                    // Hoán đổi a[1] và a[2]
                    temp = a[1];
                    a[1] = a[2];
                    a[2] = temp;
                    
                    if (strcmp(a, "abc") == 0) {
                        printf("YES\n");
                    } else {
                        printf("NO\n");
                    }
                }
            }
        }
        t--;
    }
    return 0;
}