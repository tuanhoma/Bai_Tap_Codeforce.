#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n); // Đọc số lượng sự kiện

    int police = 0; // Số lượng cảnh sát hiện có sẵn
    int crime = 0;   // Số lượng tội phạm không được xử lý

    for (int i = 0; i < n; i++) {
        int event;
        scanf("%d", &event); // Đọc sự kiện hiện tại

        if (event == -1) {
            // Nếu là tội phạm
            if (police > 0) {
                // Nếu có cảnh sát rảnh, sử dụng một cảnh sát
                police--;
            } else {
                // Nếu không có cảnh sát rảnh, tăng số tội phạm không được xử lý
                crime++;
            }
        } else {
            // Nếu là tuyển dụng cảnh sát, cộng thêm vào số lượng cảnh sát hiện có
            police += event;
        }
    }

    // In kết quả
    printf("%d\n", crime);

    return 0;
}