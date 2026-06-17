#include <stdio.h>
#include <math.h>
void input(int n, int a[n]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}



// Hàm tính số lần phá kỷ lục
int tinh(int n, int a[n]) {
    if (n <= 1) return 0; // Nếu chỉ có 1 cuộc thi hoặc không có cuộc thi, trả về 0

    int max = a[0]; // Khởi tạo max với phần tử đầu tiên
    int min = a[0]; // Khởi tạo min với phần tử đầu tiên
    int count = 0;  // Đếm số lần phá kỷ lục

    for (int i = 1; i < n; i++) {// i bắt đầu từ 1 và < n để bỏ vị trí a[0] vì a[0] đã dc gán cho max và min và theo đề bài cũng ko tính từ 0
        if (a[i] > max) {
            max = a[i]; // Cập nhật max
            count++;    // Tăng biến đếm
        } else if (a[i] < min) {
            min = a[i]; // Cập nhật min
            count++;    // Tăng biến đếm
        }
    }

    return count;
}


int main(){
	int n;
	scanf("%d", &n);
	int a[n];
	
	//input
	input(n , a);
	
	//tinh
	int result = tinh(n, a);
	
	//hien thi
	printf("%d", result);
	return 0;
}