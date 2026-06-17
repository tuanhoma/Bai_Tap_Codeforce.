#include <stdio.h>
#include <math.h>
void intput(int t, int rating){
	while(t > 0){
		scanf("%d", &rating);
		if(rating >= 1900)
		printf("Division 1\n");
		else if(rating >= 1600 && rating <= 1899)
		printf("Division 2\n");
		else if(rating >= 1400 && rating <= 1599)
		printf("Division 3\n");
		else if(rating <= 1399)
		printf("Division 4\n");
		t--;
	}
}





int main(){
	int t;
	scanf("%d", &t);
	int rating;
	
	//input
	intput(t, rating);
	return 0;
}