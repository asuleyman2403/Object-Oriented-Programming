#include <iostream>
#include <cmath>
using namespace std;
int main(){
	string s = "asuleyman2403";
	unsigned long long hash = 0;
	for(int i = 0;i<s.size();i++){
		hash+=(int(s[i] - 'a' + 1 )*pow(31,i));
	}
	cout<<hash<<endl;



	return 0;
}