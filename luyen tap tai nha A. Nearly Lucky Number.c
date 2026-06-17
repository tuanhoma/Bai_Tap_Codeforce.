#include<stdio.h>
#include<math.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(){
	int n = 10000;
	int count = 0, count1 = 0;
	char a[n];
	scanf("%s", a);
	for( int i = 0; i < strlen(a); i++){
		if( a[i] == '4' || a[i] == '7'){//đề bài yêu cầu các số '4' và '7' là số may mắn 
			count++;//do đó ta có 1 biến đếm nếu số đó là số may mắn
		}
	}
	if(count == 7 || count == 4)//do có biến đếm ở trên ta so sang xem có bao nhiêu số may mắn trong chuỗi nếu như số lượng số may mắn trong chuỗi == số may mắn '4' và '7' thì in ra YES số đó là số may mắn
	printf("YES");
	else
	printf("NO");
	return 0;
}