#include <stdio.h>
#include <string.h>
#include <ctype.h>
void mang(int n, int m){
	for(int i = 1, k = 1; i <= n; i++){
		if(i % 2 != 0){
		for(int j = 0; j < m; j++){
			printf("#");
		   }
		printf("\n");
	    }
	    else if (i % 2 == 0 && k % 2 != 0){
	    	for(int j = 0; j < m - 1; j++){
	    	printf(".");
		}
		    k++;
		    printf("#");
		    printf("\n");
		}
		
		else if(i % 2 == 0 && k % 2 == 0){
			printf("#");
			for(int j = 0; j < m - 1; j++){
				printf(".");
			}
			k++;
			printf("\n");
		}
	}
}






int main(){
	int n, m;
	scanf("%d %d", &n, &m);
    mang(n, m);
	return 0;
}