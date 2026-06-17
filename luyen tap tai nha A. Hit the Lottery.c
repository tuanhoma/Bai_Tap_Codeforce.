#include<stdio.h>
#include<math.h>
int bank(int n){
	    int count = 0;
		while(n > 0){
		if(n > 100){
			n -= 100;
			    count++;
		}
		else if(n >= 20 && n < 100){
			n -= 20;
				count++;
		}
		else if(n >= 5 && n < 20){
			n -= 5;
				count++;
		}
		else if(n >= 1 && n < 5){
			n -= 1;	
				count++;
		}
		if(n == 0)
		break;
	}
	return count;
}


int main(){
	int n;
	scanf("%d", &n);
	
    int in = bank(n);
    
	printf("%d", in);
	return 0;
}