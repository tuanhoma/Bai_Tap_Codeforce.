#include<stdio.h>
int main(){
	int n, k, i;
    scanf("%d %d", &n, &k);
	int a[n];
	for( i = 0; i < n; i++ ){
		printf("nhap so diem "), scanf("%d", &a[i]);
		}
		int diemk = a[k - 1];//diem cua nguoi thu k
		int count = 0;
	for( i = 0; i < n; i++ ){
		if(a[i] >= diemk && a[i] > 0 )
		count++;
		}
	printf("%d", count);
	return 0;

	}