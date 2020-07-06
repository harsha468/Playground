#include<iostream>
using namespace std;
int main()
{
	int N,i=0,c=0;
  cin>>N;
    for(i=1;i<=N;i++)
    {
      if(N%i==0)
        c++;
    }
    if(c==2)
      cout<<"Eligible";
    else
      cout<<"Not eligible";
}