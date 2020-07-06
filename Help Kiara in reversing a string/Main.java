#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int count=0,end,i;
cin.getline(str,100);
for (int i=strlen(str)-1; i>=0; i--)
{
      cout<<str[i];  
}
}