#include<stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
int main(){
	char a[101];
	char b[40] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
	scanf("%s", a);
	int luu = strlen(a);
	for( int i = 0; i < luu; i++){
		for( int j = 0; j < 40; j++){
		    if(a[i] == b[j]){//neu nhu ki tu a[i] == ki tu b[j] thi in ra ki tu a[i]
		    	if(a[i] >= 'A' && a[i] <= 'Z'){//phuong phap de cho viet hoa thanh viet thuong
		    	    a[i] += 32;
		    	    printf(".%c", a[i]);
		    	break;
				}
				else{
				    printf(".%c", a[i]);
				}
		    }				
		}
	}
	return 0;
}