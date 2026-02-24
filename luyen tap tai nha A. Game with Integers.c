#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);
    
    while (t > 0) {
        int n;
        scanf("%d", &n);
        
        if (n % 3 != 0) {
            printf("First\n");
        } else {
            printf("Second\n");
        }
        t--;
    }
    
    return 0;
}