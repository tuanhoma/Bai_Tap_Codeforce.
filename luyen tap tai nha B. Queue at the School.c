#include <stdio.h>
#include <math.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
int main(){
	int n, t;
	scanf("%d %d", &n, &t);
	char a[n];
	scanf("%s", a);
	for( int time = 0; time < t; time++ ){//t la so lan lui cua b
		for(int i = 0; i < n ; i++){
			if((a[i] == 'B') && (a[i + 1] == 'G')){//neu nhu a[1] == 'b' va a[1 + 1] == 'G' thi doi cho
				int temp = a[i];//tao nen bien tam
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i++;
			}
		}
	}
	printf("%s", a);

	return 0;
}