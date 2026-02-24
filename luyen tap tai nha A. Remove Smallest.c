#include <stdio.h>
#include <math.h>
void input(int t) {
    while (t > 0) {
        int n;
        scanf("%d", &n);
        int a[n];
        for (int i = 0; i < n; i++) {
            scanf("%d", &a[i]);
        }

        // Sắp xếp mảng
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Kiểm tra và xử lý mảng
        int count = n;
        for (int i = 0; i < n - 1; i++) {
            if (abs(a[i] - a[i + 1]) <= 1) {//abs la gia tri tuyet doi absolute
                a[i] = 0; // Đánh dấu phần tử nhỏ hơn để loại bỏ
                count--; // bien dem cac ki tu con lại trong mang sau khi da loai bo
            }
        }

        // Kiểm tra xem có thể giảm mảng xuống còn một phần tử không
        if (count <= 1) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }

        t--;
    }
}



int main(){
	int t;
	scanf("%d", &t);
	
	//inputt
	input(t);
	return 0;
}