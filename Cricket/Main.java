#include<iostream>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
  int B,T,R,BB;
  cin>>B;
  cin>>T;
  cin>>R;
  cin>>BB;
  cout<<B/6<<"\n";
  float CR;
  CR=BB/6+((float)(BB%6)/10);
  cout<<CR<<"\n";
  cout<<round((R/CR)*10)/10<<"\n";
  float R1;
  R1=round(((float)T/(float)(B/6))*10)/10;
  cout<<R1<<"\n";
  float R2=(float)(T-R)/(float)(50-CR);
  if (round((R/CR)*10)/10>=R2)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}