#include<stdio.h>
#include<math.h>
int main(){
	int n, k;
	int count = 0, count1 = 0;
	int tamp = n;
	scanf("%d %d", &n, &k);
	if( n >= 2 && n <= 1000000000 || k >= 1 && k <= 50)
	for(int i = 0; i < k; i++){
		if(n % 10 != 0)//sau khi n thuc hien phep tinh thi no se luu kq sau khi tinhs toan vaf lay ket qua do tro lai vong lap de tinh toan
		n -= 1;
		else
		n /= 10;
	}
	printf("%d", n);
	return 0;
}