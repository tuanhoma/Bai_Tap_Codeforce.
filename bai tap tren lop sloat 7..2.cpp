#include<stdio.h>
#include<math.h>
int main(){
	int n, i;
	float x, s3 = 1;
	printf("nhap gia tri cua n = "), scanf("%d", &n);
	printf("nhap gia tri cua x = "), scanf("%f", &x);
	if( n > 0){
	float sh = 1;
	for(i = 1; i<= n; i++){
		sh = sh*x/i;
		s3 = s3+sh;
	}
	printf("mau = %f", s3);
		}
		else
		printf("n <= !0");
		return 0;
	}
