#include<stdio.h>
#include<math.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(){
      int n, count = 0;
      char a[51];
      scanf("%d", &n);
      	scanf("%s", a);
      for( int i = 0, j = 1; i < n; i++, j++){
      	if(a[strlen(a) - strlen(a) + i] == a[strlen(a) - strlen(a) + j])
      	count++;
	  }
	  printf("%d", count);
	  return 0;
}