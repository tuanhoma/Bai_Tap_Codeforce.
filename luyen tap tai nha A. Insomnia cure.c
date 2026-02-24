#include <stdio.h>
#include <math.h>
int main(){
	int count = 0;
	int k, l, m, n;
	scanf("%d", &k); 
	scanf("%d", &l); 
	scanf("%d", &m); 
	scanf("%d", &n);
	int d;
	scanf("%d", &d);
	int a[d];
	for(int i = 0; i < d; i++){// dùng để gán giá trị từ 0 đến n vào mảng a[d];
		a[i] = i+1;
	}
	for(int i = 0; i < d; i++){
		if(a[i] % k == 0 || a[i] % l == 0 || a[i] % m  == 0 || a[i] % n == 0)// dùng để lọc các phần tử chia hết cho các số đã cho
		count++;
	}
	printf("%d", count);
	return 0;
	 
}
