#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
	srand(time(NULL));
	freopen("scores.txt","w",stdout);
	char letters[26];
	for(int i = 0;i<26;i++){
		letters[i] = char(i + 'a');
	}
	for(int i = 0;i<100;i++){
		string lname = "";
		string name = "";
		for(int i = 0;i<rand()%20+1;i++){
			lname+=letters[rand()%26];
			name+=letters[rand()%26];
		}
		cout<<lname<<" "<<name<<" "<<rand()%101<<endl;
	}
}