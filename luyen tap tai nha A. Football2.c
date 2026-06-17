#include <stdio.h>
#include <math.h>
#include <string.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    getchar(); // Đọc ký tự newline sau số n
    
    char team1[11] = {0}; // Tên đội 1
    char team2[11] = {0}; // Tên đội 2
    int count1 = 0, count2 = 0; // Số bàn thắng mỗi đội
    
    for (int i = 0; i < n; i++) {
        char current[11];
        //fgets(current, 11, stdin);
        //current[strcspn(current, "\n")] = '\0'; // Xóa ký tự newline
        
        scanf("%10s", current); // Đọc tối đa 10 ký tự, không đọc newline
        getchar(); // Đọc và bỏ qua ký tự newline sau mỗi tên đội
        
        if (team1[0] == '\0') { // Nếu chưa có đội 1
            strcpy(team1, current);
            count1++;
        } else if (strcmp(current, team1) == 0) { // Nếu trùng đội 1
            count1++;
        } else { // Nếu là đội 2
            if (team2[0] == '\0') { // Nếu chưa có đội 2
                strcpy(team2, current);
            }
            count2++;
        }
    }
    
    // In đội có nhiều bàn thắng hơn
    if (count1 > count2) {
        printf("%s\n", team1);
    } else {
        printf("%s\n", team2);
    }
    
    return 0;
}