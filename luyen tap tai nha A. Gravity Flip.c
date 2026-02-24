#include <stdio.h>
#include <math.h>
#include<stdlib.h>
int compare(const void *a, const void *b) {// const void *a và const void *b: Con trỏ kiểu void trỏ đến hai phần tử cần so sánh.
    return (*(int *)a - *(int *)b);    // Lấy giá trị của hai phần tử bằng cách dereference [sự phân tán] con trỏ. đó chính là *a, *b
                                       // Âm: Nếu a < b.
                                       // ép kiểu con trỏ *(int*)a 
                                       //Nếu a == b.

                                       //Dương: Nếu a > b.  
}


int main(){
	int n, min = 0;
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
	qsort(a, n, sizeof(int), compare);// qsort(mảng, số phần tử trong mảng, Kích thước của mỗi phần tử (kiểu int), hàm ở trên )
	for(int i = 0; i < n; i++){
		printf("%d ", a[i]);
	}
	return 0;
}

//vd: int arr[] = {3, 1, 4, 1, 5, 9, 2, 6, 5};
Khi qsort() gọi hàm compare, nó sẽ so sánh từng cặp phần tử trong mảng. Ví dụ:

So sánh 3 và 1: so sanh vị trí [0] và a[1] trước

*(int *)a = 3, *(int *)b = 1.

Kết quả: 3 - 1 = 2 (dương) → 3 > 1.

Kết luận: 1 sẽ đứng trước 3.

So sánh 4 và 1: tiếp theo so sánh vị trí a[2] và a[3]

*(int *)a = 4, *(int *)b = 1.

Kết quả: 4 - 1 = 3 (dương) → 4 > 1.

Kết luận: 1 sẽ đứng trước 4.

So sánh 3 và 4: cuối cùng so sánh a[1] và a[2] 

*(int *)a = 3, *(int *)b = 4.

Kết quả: 3 - 4 = -1 (âm) → 3 < 4.

Kết luận: 3 sẽ đứng trước 4.
sau đó lặp lại như ban đầu để sắp xếp số nhỏ nhất trc