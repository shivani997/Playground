#include<stdio.h>
int digits(int n)
{
  int sum=0;
  while(n!=0)
  {
    sum=sum+(n%10);
    n=n/10;
  }
  if(sum>=10)
    digits(sum);
  else
    return sum;
}
int main()
{
  int n,sum;
  scanf("%d",&n);
  sum=digits(n);
  printf("%d",sum);
  return 0;
}
    
  
  