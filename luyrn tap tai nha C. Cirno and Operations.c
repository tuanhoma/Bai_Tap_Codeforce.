#include <stdio.h>
#include <math.h>
int main(){
	int b;
	int t;
	scanf("%d", &t);
    int a;
    int c[b];
    for( a = 0; a < t; a++){
    	scanf("%d", &b);
    	for(int i = 0; i < b; i++){
    		scanf("%d", &c[i]);
		}
	}
	for( a = 0; a < t; a++ ){
		int tamp = b;
		first:
		for(int i = 0, j = 0; i < b, j < b; i++, j++){
		    c[i] = c[i + 1] - c[i];
		    if(tamp = 1 ){
		    	printf("%d", c);
		    	break;
			}
		}
		if(tamp > 1){
		tamp -= 1;
		goto first;
	    }
	}
	return 0;
}