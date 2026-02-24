#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>



int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
  char a[4];
  for(int i = 0 ; i < 4; i++){
  	scanf("%c", &a[i]);
  	getchar();
  }
  
  for(int i = 0 ; i < 4 - 1; i++){
  	for(int j = 0; j < 4 - i - 1; j++){
  		char t = a[j];
  		if(a[j] > a[j + 1]){
  			a[j] = a[j + 1];
  		    a[j + 1] = t;
		  }
	  }
  }
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
 for(int i = 0; i < 4; i++){
 	printf("%c ", a[i]);
 }
 






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
