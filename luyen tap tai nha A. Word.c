#include<stdio.h>
#include<math.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(){
	int count = 0, count1 = 0;
	char a[100];
	scanf("%s", a);
	for(int i = 0; i < strlen(a); i++){
		if(a[i] >= 'A' && a[i] <= 'Z'){
			count++;
		}
		else if(a[i] >= 'a' && a[i] <= 'z'){
			count1++;
		}
	}
	for(int i = 0; i < strlen(a); i++){
		if( count < count1 || count == count1){
	char hoa = tolower(a[i]);
	printf("%c", hoa);
	    }
	else if( count > count1){
		char thuong = toupper(a[i]);
		printf("%c", thuong);
	    }
	}
	return 0;	
}