#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char st1[50],st2[50];
  cin>>st1;
  cin>>st2;
  int N=strcmp(st1,st2);
  if(N==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}