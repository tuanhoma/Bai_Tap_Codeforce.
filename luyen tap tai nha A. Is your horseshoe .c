#include <stdio.h>
#include <math.h>
#include <stdlib.h>                        //Chứa hàm qsort() dùng để sắp xếp mảng.
                                           // Hàm so sánh dùng cho qsort()
int cmpfunc(const void *a, const void *b) {//qsort() cần một hàm so sánh để sắp xếp mảng.
    return (*(int*)a - *(int*)b);          //Chuyển đổi con trỏ void* thành con trỏ int*.
                                           //Trả về *(int*)a - *(int*)b để sắp xếp theo thứ tự tăng dần.
                                  
                                           //sắp xếp các số từ bé đến lớn cho dễ tìm số lặp
}




int main(){
	int count = 0, count1 = 0, count2 = 0, count3 = 0;
	int a[4];
	for(int i = 0; i < 4; i++){
		scanf("%d", &a[i]);
	}
	qsort(a, 4, sizeof(int), cmpfunc);// void qsort(void *base, size_t nitems, size_t size, int (*compar)(const void *, const void *));
	for(int i = 1; i < 4; i++){       // ('base' Con trỏ tới mảng cần sắp xếp, 'nitems' Số phần tử trong mảng, 'size' Kích thước mỗi phần tử (dùng sizeof()), 'compar' Con trỏ tới hàm so sánh (cmpfunc));

			if(a[i] == a[i - 1])      // sắp xếp các số bé nhất và giống nhau đứng trc để dễ so sánh nếu giống nhau thì count + 1
			count++;
		}	

	int sum = count ;
	printf("%d", sum);
	return 0;
}