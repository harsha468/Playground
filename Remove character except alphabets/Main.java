#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  cin>>str;
  char st1[50];
  for(int i=0;i<strlen(str);i++)
  {
    if((str[i]>='a' and str[i]<='z') or (str[i]>='A' and str[i]<='Z'))
    {
      cout<<str[i];
    }
  }
}