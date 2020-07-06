#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[50], temp,st1[50];
    int i, j;
    cin>>str;
  cin>>st1;
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    int N;
  N=strcmp(str,st1);
if(N==0)   
  cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}
