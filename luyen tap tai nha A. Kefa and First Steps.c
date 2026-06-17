#include <stdio.h>
#include <math.h>
int main(){
	int n;
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
	
	int count = 1;
	int max = 1; để dãy mặc định lớn nhất luôn là 1
	//Duyệt mảng từ i = 0 đến i < n - 1, Tránh truy cập ngoài phạm vi mảng khi i = n - 1 sẽ bị lỗi
	for(int i= 0; i < n - 1; i++){
		if(a[i] <= a[i + 1]){
		count++;
		}
		else
		count = 1;
		if(max < count)// cập nhật max chuỗi dài nhất ở dưới
		   max = count;
	}
	printf("%d", max);
	return 0;
}