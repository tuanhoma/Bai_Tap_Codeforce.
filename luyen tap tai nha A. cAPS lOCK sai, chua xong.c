#include<stdio.h>
#include<math.h>
#include<string.h>
#include<ctype.h>
//SAI CHUA LAM XONG
int main(){
	char a[101];
	scanf("%s", a);
	for(int i = 0; i < strlen(a); i++){
	if(a[0] >= 'a' && a[0] <= 'z' && a[i + 1] >= 'A' && a[i + 1] <= 'Z'){
	for(int i = 0; i < strlen(a); i++){
			a[0] = toupper(a[0]);
			a[i + 1] = tolower(a[i + 1]); 
			printf("%c", a[i]);
	    }
	    break;
    }
	
	else if(a[0] >= 'A' && a[0] <= 'Z' && a[i + 1] >= 'A' && a[i + 1] <= 'Z'){
	for(int i = 0; i < strlen(a); i++){
		a[i] = tolower(a[i]);
		printf("%c", a[i]);
	   }
	   break;
    }
	
	
	else if(a[0] >= 'a' && a[0] <= 'z'){
		a[0] = toupper(a[0]);
		printf("%c", a[0]);
		break;
	}
	
	else{
	for(int i = 0; i < strlen(a); i++){
		printf("%c", a[i]);
	   }
	   break;
    }
}
	return 0;
} 