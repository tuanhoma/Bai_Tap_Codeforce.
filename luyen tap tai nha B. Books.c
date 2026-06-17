#include <stdio.h>
#include <math.h>
void nhap(int n, int a[]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}




// Hàm tìm số sách tối đa
int tim_sach_toi_da(int n, int a[], int t) {
    int max = 0;          // Số sách tối đa
    int tong = 0;         // Tổng thời gian đoạn hiện tại
    int left = 0;         // Chỉ số bắt đầu đoạn

    for (int right = 0; right < n; right++) {
        tong += a[right]; // Thêm sách vào đoạn
        
        // Nếu vượt quá thời gian, bỏ sách từ trái
        while (tong > t) {
            tong -= a[left];
            left++;
        }
        
        // Cập nhật kết quả nếu tìm thấy đoạn dài hơn
        if (right - left + 1 > max) {
            max = right - left + 1;
        }
    }
    return max;
}

int main() {
    int n, t;
    scanf("%d %d", &n, &t);
    int a[n];
    
    nhap(n, a);
    
    int ket_qua = max_sach(n, a, t);
    printf("%d", ket_qua);
    
    return 0;
}