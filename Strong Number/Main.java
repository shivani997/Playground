#include <stdio.h>
int main() {
	int n,sum=0;
  scanf("%d",&n);
  int temp=n;
  while(temp>0)
  {
    int r;
    r=temp%10;
    int f=1;
    for(int i=1;i<=r;i++)
    {
      f=f*i;
    }
    sum=sum+f;
    temp=temp/10;
  }
  if(n==sum)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}