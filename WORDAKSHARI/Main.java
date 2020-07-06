#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[50][50],c=0;
  for(int i=0;i<50;i++)
  {
    char s1[50];
    cin>>s1;
    if(strcmp(s1,"####")==0)
      break;
    strcpy(s[i],s1);
    c++;
  }
  cout<<s[0]<<"\n";
for(int i=1;i<c;i++)
{
  int N=strlen(s[i-1]);
    char n=s[i][0],m=s[i-1][N-1];
  if(n==m)
      cout<<s[i]<<"\n";
    else
      break;
}
}