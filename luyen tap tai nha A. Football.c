#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
int main(){
	int count = 0, count1 = 0, so = 0, so1 = 0;
	char a[100];
	scanf("%s", a);
	for(int i = 0; i < strlen(a); i++){
		if( a[i] == '0'){
		count++;
		count1++;
		if(count >= 7){
		break;
		}
	}
		else{//dùng để trả số đếm về 0 nếu như số số đếm khác điều kiện IF trên
			int temp = count;
			count -= count1;
			count1 -= temp;
		}
		
	}
	if(count >= 7){
			printf("YES");
			goto end;
	}
	
	for(int i = 0; i < strlen(a); i++){
		if( a[i] == '1'){
		so++;
		so1++;
		if(so >= 7){
		break;
		}
	}
	
		else{//dùng để trả số đếm về 0 nếu như số số đếm khác điều kiện IF trên
			int temp1 = so;
				so -= so1;
		    so1 -= temp1;
		}
	}
	if(so >= 7){
		printf("YES");
	}
	else
	printf("NO");
	end:
	return 0;
}