#include <stdio.h>
#include <math.h>
#include <string.h>
void input(int t){
	while(t > 0){
		int n;
		scanf("%d", &n);
		getchar();
		char a[n];
		for(int i = 0; i < n; i++){
			scanf("%c", &a[i]);
		}

		if(n == 5){
		int countT = 0, counti = 0, countm = 0, countu = 0, countr = 0;
		  for(int i = 0; i < strlen(a); i++){
			if(a[i] == 'T'){
				countT++;
			}
			else if(a[i] == 'm'){
				countm++;
			}
			else if(a[i] == 'u'){
				countu++;
			}
			else if(a[i] == 'r'){
				countr++;
			}
			else if(a[i] == 'i'){
				counti++;
			}
		}
			if(countT == 1 && countm == 1 && countu == 1 && countr == 1 && counti == 1){
				printf("YES\n");
			}
			else{
				printf("NO\n");
			}
		}
		else{
			printf("NO\n");
		}
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