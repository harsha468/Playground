#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{ 
  int sum,c=0,N,r;
    N=n;
    while(n!=0)
    {
      n=n/10;
      c++;
    }
    n=N;
	while(n!=0)
    {
      r=n%10;
      sum=sum+power(r,c);
      n=n/10;  
    }
  if(sum==N)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}