#include<stdio.h>
#include<math.h>
int main(){
	int  a, b, c, i = 1, sum = 0, sum1 = 0, tong, sum2 = 0;// day la bai em tu lam 100%
	int pass = 0, pass1 = 0, pass2 = 0, fail = 0, fail1 = 0, fail2 = 0;
	int passed, failed;
	float trungbinh ;
    printf("Enter the number of students ( >= 1 ): "), scanf("%d", &a);
	if( a >= 1) //so hoc sinh trong lop
	{
		baitoan:
		for( i ; i <= a; i++ )
		{
			printf("enter the score students %d ( 0 - 10): ", i), scanf("%d", &c);
			if( c < 0 || c > 10) //diem so cua hoc sinh
			goto check1;
			sum += c;
			if( c >= 5)
			pass++;
			else if( c < 5)
			fail++;
		}	
		goto tinhdiem;
		check1:	
			do
			{
				printf("invalid score. please try again");
				printf("\nenter the score students %d ( 0 - 10): ", i), scanf("%d", &c);
			}while( c < 0 || c > 10); //diem so cua hoc sinh
			sum2 += c;
			if( c >= 5)
			pass1++;
			else if( c < 5)
			fail1++;
       
		for( i++ ; i <= a; i++)
		{
			printf("enter the score students %d ( 0 - 10): ", i), scanf("%d", &c);
			if( c < 0 || c >10) //diem so cua hoc sinh
			goto check1;
			sum1 += c;
			if( c >= 5)
			pass2++;
			else if( c < 5)
			fail2++;
		}
		tinhdiem:
			printf("\nStatistics: ");
			tong = sum + sum1 + sum2;
			    printf("\nTotal score of the class: %d", tong);
			trungbinh = tong*1.00/a;
			    printf("\nAverage score of the class: %.2f", trungbinh);
			passed = pass + pass1 + pass2;
			    printf("\nNumber of students passed: %d", passed);
			failed = fail + fail1 + fail2;
			    printf("\nNumber of students failed: %d", failed);
	            
		
		
	}
	else if( a < 1) //so hoc sinh trong lop
	
	{
		    do
		{
			printf("invalid numbers of students. please try again.");
			printf("\nEnter the number of students ( >= 1 ): "), scanf("%d", &a);
		}while( a < 1);
		    goto baitoan;
			
	}
	return 0;
}