#include<stdio.h>
#include<math.h>
int main(){
	int tong = 0;
	int nhan;
	int k, n, w;
	scanf("%d %d %d", &k, &n, &w);
	for( int i = 1; i <= w; i++){
		tong += (i * k);
	}
	nhan = n - tong;
	if( nhan < 0)
	printf("%d", nhan * (-1));
	else
	printf("0");
	return 0;
}