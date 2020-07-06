#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thurs,fri,sat,total;
  cin>>sun;
  cin>>mon;
  cin>>tue;
  cin>>wed;
  cin>>thurs;
  cin>>fri;
  cin>>sat;
  if(mon<=8)
    total+=mon*100;
  else
    total+=mon*100+(mon-8)*15;
  if(tue<=8)
    total+=tue*100;
  else
    total+=tue*100+(tue-8)*15;
  if(wed<=8)
    total+=wed*100;
  else
    total+=wed*100+(wed-8)*15;
  if(thurs<=8)
    total+=thurs*100;
  else
    total+=thurs*100+(thurs-8)*15;
  if(fri<=8)
    total+=fri*100;
  else
    total+=fri*100+(fri-8)*15;
  total+=sun*150;
  total+=sat*125 ; 
  cout<<total;
}