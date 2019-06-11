#include <stdio.h>
int main() {
	int n,temp,f,l,sum;
  scanf("%d",&n);
  temp=n;
  l=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  f=n;
  sum=f+l;
  printf("%d",sum);
	return 0;
}