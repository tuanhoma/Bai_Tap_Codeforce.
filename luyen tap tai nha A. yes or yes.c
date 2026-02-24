#include <stdio.h>
#include <string.h>
#include <ctype.h>

void input(char a[3], int t, char b[3]) {
    while (t > 0) {
        scanf("%3s", a); // Đọc tối đa 3 ký tự để tránh tràn bộ đệm

        // Chuyển đổi chuỗi nhập vào mảng thành chữ thường và lưu chuỗi đã chuyển đổi vào mảng
        for (int i = 0; i < 3; i++) {
            a[i] = tolower(a[i]);
        }
        //chuyển đổi kí tự nhập thành thường vào mảng trước rồi mới so sánh với chuỗi cho sẵn
        
        
        

        // So sánh chuỗi đã được đổi thành kí tự thường với chuỗi cho sẵn
        if (strcmp(a, b) == 0) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }

        t--; // Giảm giá trị của t để thoát khỏi vòng lặp
    }
}

int main() {
	// mảng cần kích thước là 4 để lưu trữ một chuỗi có 3 ký tự là do ký tự kết thúc chuỗi (\0)
	//nếu mảng ko đủ sẽ lỗi ra sai kết quả
    char b[4] = "yes"; // Chuỗi cho sẵn
    char a[4];         // Chuỗi nhập vào
    int t;

    scanf("%d", &t);

    // Gọi hàm input
    input(a, t, b);

    return 0;
}