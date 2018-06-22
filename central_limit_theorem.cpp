//Central Limiting theorem
//Abhishek Anand
#include <cmath>
#include <vector>
#include <iostream>
#include <iomanip>
using namespace std;

double cdf(double x, double mean, double sd)
{
  double ans= 0.5 * (1 + erf((x - mean) / (sd * sqrt(2))));
  return ans;
}
double central_limiting_theorem(double x,double mean,double sd,double n)
{
  return cdf(x,n*mean,sqrt(n)*sd);
}

int main()
{
  double x,mean,sd,n;
  cin>>x>>n>>mean>>sd;
  std::cout << fixed << setprecision(4);
  std::cout<<central_limiting_theorem(x,mean,sd,n);
  return 0;
}
