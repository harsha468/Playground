#include<iostream>
int main()
{
  int a=0,b=1,fib=a+b;
  int N;
  std::cin>>N;
  for(int i=1;i<N;i++)
  {
    a=b;
    b=fib;
    fib=a+b;
  }
  std::cout<<"The term "<<N<<" in the fibonacci series is "<<a;
}