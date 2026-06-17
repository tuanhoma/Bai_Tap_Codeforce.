#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
int main(){
	char visited[256] = {0};// khai báo mảng giống hệt như này để lưu các kí tự đã dc duyệt qua 1 lần và để lưu lại các kí tự xem có lặp kí tự ko để loại bỏ kí tự lặp
	int count = 0;
	char a[1001];
	gets(a);
	
	for(int i = 0; i < strlen(a); i++){
	 if (a[i] != '{' && a[i] != '}' && a[i] != ',' && a[i] != ' '){
	 	if(visited[a[i]] == 0){
	 	   visited[a[i]] = 1;
           count++;
	     }
	   }	
	}
	printf("%d", count);
	return 0;
}