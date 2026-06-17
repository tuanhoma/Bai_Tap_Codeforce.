#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>



int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
 int n, a[20], i;
 do{
 	scanf("%d", &n);
 }while(n < 0 || n >= 20);
 
 
 for(i = 0; i < n; i++){
 	scanf("%d", &a[i]);
 }
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
  int ok = 1;
  for(i = 0; i <= n/2; i++)
  if(a[i] != a[n - 1- i]){
  	ok = 0; break;
  }
  printf("%d", ok);  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
