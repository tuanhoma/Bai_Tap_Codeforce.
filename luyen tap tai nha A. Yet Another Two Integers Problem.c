#include <stdio.h>
#include <math.h>
void input(int t){
	int a, b;
	while(t > 0){
		scanf("%d %d", &a, &b);
		int n = 10;
		int count = 0;
		if(a < b){
			for(int i = 1; i > 0; i++){
				if(a == b)
				break;
				if(a + n <= b){
					a += n;
					count++;
				}
				else{
					n--;
				}
			}
	    }
			
			
		else if(a > b){
			for(int i = 1; i > 0; i++){
				if(a == b)
				break;
				if(a - n >= b){
					a -= n;
					count++;
				}
				else{
					n--;
				}
			}
		}
		
		
		printf("%d\n", count);
		t--;
	}
}





int main(){
	int t;
	scanf("%d", &t);
	
	//input
	input(t);
	
	return 0;
}