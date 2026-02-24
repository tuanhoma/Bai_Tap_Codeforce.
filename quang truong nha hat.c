#include<stdio.h>
int main(){
	int m, n, a;
	printf("nhap gia tri cua n = "), scanf("%d", &n);
	printf("nhap gia tri cua m = "), scanf("%d", &m);
	printf("nhap gia tri cua a = "), scanf("%d", &a);
	int tong;
	tong = ((n + a - 1)/a)*((m + a - 1)/a);
	printf("tong so da la %d", tong );
	return 0;
}