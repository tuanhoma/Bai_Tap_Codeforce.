#include<stdio.h>
#include<math.h>
int main(){
	int a, b;
	int count = 0;
	scanf("%d %d", &a, &b);
    for( a,b; a <= b; a = a * 3, b = b * 2)//neu muon a nhan 3 va b nhan 2 sau moi vong lap thi phai viet la a = a * 3, b = b * 2 hoac la a *= 3, b *= 2
    count++;
	printf("%d", count);
	return 0;
}