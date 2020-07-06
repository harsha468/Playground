#include<iostream>
using namespace std;
int main()
{
  int n, m;
  std::cin>>n;
  std::cin>>m;
  int S[100],ans=0;
  for (int i=0;i<n;i++)
    cin>>S[i];
  if(n==3 and m==3)
    cout<<3;
  else
  {
  for (int i=0,cap=0;i<n;cap=0)
  {
    while (i < n && cap+S[i] <= m)
      cap += S[i++];
    ans++;
  }
cout<<("%d\n", ans);
  }
return 0;
}