#include<stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
int main(){
	char a[100];//khai bao la dang ky tu ð? có th? in ra ? d?ng kí t?
	char b[100];
	scanf("%s", a);
	scanf("%s", b);
	for( int i = 0; i < strlen(a); i++){
		a[i] = toupper(a[i]);//N?u k?_t? là ch? cái thý?ng (a-z), nó s? chuy?n thành ch? hoa (A-Z).
//N?u k?_t? không ph?i ch? thý?ng (ví d?: ch? hoa, s?, d?u câu), nó s? gi? nguyên.

    }
    for( int i = 0; i < strlen(b); i++){
		b[i] = toupper(b[i]);
    }
    
    int c = strcmp(a, b);//L?nh strcmp(a, b); trong C là m?t hàm dùng ð? so sánh hai chu?i k? t? theo th? t? t? ði?n (lexicographical order).
    if( c > 0)//strcmp(a, b) ? ngh?a a l?n hõn b, tr? v?  > 0 (dýõng)
              //strcmp(a,b) ? ngh?a a < b, tr? v?  < 0 (âm)
    printf("1\n");
    else if( c < 0)
    printf("\n-1");
    else
    printf("\n0");
	return 0;
}
