#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<stdlib.h>
#include<string.h>
int main(){
	char a[100];
	char b;
	int count = 0, count1 = 0;
	scanf("%s", a);
	for(int i = 0; i < strlen(a) ; i++){
	    a[strlen(a) - strlen(a) + i];
	for(int j = 0; j < strlen(a) ; j++){
		if(b == a[strlen(a) - strlen(a) + j]){
			count++;
		}
		a[strlen(a) - strlen(a) + j];//du
		if(	a[strlen(a) - strlen(a) + i] == a[strlen(a) - strlen(a) + j]){
			b = a[strlen(a) - strlen(a) + i];
			count1++;
		}
	}

}
    int tong = count - strlen(a);
    int tong1 = strlen(a) - tong;
    printf("%d", count);
    if( tong1 % 2 == 0 || count1 % 2 == 0)
    printf("CHAT WITH HER!");
    else
    printf("IGNORE HIM!");
	return 0;
}
