#include<stdio.h>
#include<math.h>
void selectionSort(int a[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int max = i;
        for (int j = i + 1; j < n; j++) {
            if (a[j] > a[max]) {  // Tìm phần tử lớn nhất
                max = j;
            }
        }
        // Hoán đổi phần tử lớn nhất về đầu mảng chưa sắp xếp
        int temp = a[i];//gắn giá trị a[i] vào biến nhớ tạm temp
        a[i] = a[max];//gan so to nhất vào địa chỉ đầu a[i]
        a[max] = temp;//đổi ví trị của a[i] vào vị trí của max vì biến nhớ tạm là temp
    }
}




int main(){
	int n, tong = 0, tong1 = 0, count = 0;
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
		tong += a[i];
	}
	tong /= 2;
	selectionSort(a, n);
    for(int i = 0; i < n; i++){
    	if(tong1 <= tong){
    	tong1 += a[i];
    	count++;
		}
		else if(tong1 > tong)
		break;
    	
	}
	printf("%d", count);
	return 0;
}