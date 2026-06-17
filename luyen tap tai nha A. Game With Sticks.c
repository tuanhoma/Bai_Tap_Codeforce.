#include <stdio.h>
#include <math.h>
int main(){
	int n, m;
	scanf("%d %d", &n, &m);
	//xet điều kiện n và m là hàng ngang là n, hàng cột là nếu cái cái nào nhỏ hơn sẽ xét nó vào trường hợp
    if(n < m){// hàng nhỏ hơn cột
    	if(n % 2 == 1){
    		printf("Akshat\n");
		}
		else
		printf("Malvika\n");
	}
	
	
	else{// cột nhỏ hơn hàng
		if(m % 2 == 1){
			printf("Akshat\n");
		}
		else
		printf("Malvika\n");
	}
	return 0;
}