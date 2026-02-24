#include<stdio.h>
#include<math.h>
#include<stdlib.h>// thêm thư viện cho malloc
int main(){
	int n;
	scanf("%d", &n);
	double *a = (double *)malloc(n * sizeof(double));//khai báo mảng a và cấp phát bộ nhớ động cho mảng bằng malloc
	//malloc(size_t size) là hàm cấp phát bộ nhớ động trong C, lấy vào số byte cần cấp phát.
	//(double *) chuyển đổi nó thành con trỏ double *, tức là con trỏ đến một mảng số thực.
	if (a == NULL)
	printf("Lỗi cấp phát bộ nhớ");
	return 0;
    }

	for(int i = 0; i < n; i++){
		scanf("%lf", &a[i]);
	}
	double tong = 0;
	int count = 0;
	for(int i = 0; i < n; i++){
		tong += a[i];// tong tat ca cac phan tram cua nuoc cam va roi chia cho tong tat ca chai
		count++;
	}
	tong /= n;
	printf("%.12lf", tong);
	return 0;
}



//cách giải thứ 2
int main() {
    int n;
    scanf("%d", &n);

    // Kiểm tra nếu n <= 0 (tránh lỗi bộ nhớ)
    if (n <= 0) {
        printf("Số lượng phần tử không hợp lệ!\n");
        return 1;
    }

    // Cấp phát bộ nhớ động cho mảng
    double *a = (double *)malloc(n * sizeof(double));

    // Kiểm tra malloc có thành công không
    if (a == NULL) {
        printf("Lỗi cấp phát bộ nhớ!\n");
        return 1;
    }

    // Nhập các phần tử vào mảng
    for (int i = 0; i < n; i++) {
        scanf("%lf", &a[i]);
    }

    double tong = 0;
    
    // Tính tổng
    for (int i = 0; i < n; i++) {
        tong += a[i];
    }

    // Tính giá trị trung bình
    tong /= n;
    
    // In kết quả với 12 chữ số thập phân
    printf("%.12lf\n", tong);

    // Giải phóng bộ nhớ động
    free(a);

    return 0;
}