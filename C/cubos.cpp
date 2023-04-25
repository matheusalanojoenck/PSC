#include <iostream>
#include <math.h>

using namespace std;
int main() {
  cout << "Lado cubo 1: " << "\n";
  float l1 = 0; 
  cin >> l1;
  cout << "Lado cubo 2: " << "\n";
  float l2 = 0; 
  cin >> l2;

  float vol_1 = pow(3, l1);
  float vol_2 = pow(3, l2);
  float area_1 = 6 * pow(2,l1);
  float area_2 = 6 * pow(2,l2);

  cout << "Cubo 1 - Volume: " << vol_1 << " | Area: " << area_1 << "\n";
  cout << "Cubo 2 - Volume: " << vol_2 << " | Area: " << area_2 << "\n";

  if (vol_1 > vol_2){
    cout << "Cubo 1 é maior!\n";
  }else if(vol_2 > vol_1){
    cout << "Cubo 2 é maior!\n";
  }else{
    cout << "Os cubos tem o mesmo volume!\n";
  }

  return 0;
}