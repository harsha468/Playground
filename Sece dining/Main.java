#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char S[10];
    int N;
    cin>>S;
    cin>>N;
    int i=1,j=2;
    char S1[10]="front";
    int k=strcmp(S1,S);
  if (k==0)
  {
    if(N==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(k!=0){
    if(N==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  } 
}