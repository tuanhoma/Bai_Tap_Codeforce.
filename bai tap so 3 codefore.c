#include<stdio.h>
int main(){
	int n, m; //so bai toan
	int x = 0;
	int p, v, t;//ten cac nhan vat
	printf("nhap so bai toan n = "); scanf("%d", &n);
	for(m = 0; m < n; m++){
		printf("nhap nhan vat p, v, t:" ); scanf("%d %d %d", &p, &v, &t);
		if( p + v + t >= 2)
		x++;}
    
	printf("so bai la = %d", x);
	return 0;
}
	
    
