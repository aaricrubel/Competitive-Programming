#include <bits/stdc++.h>
using namespace std;
 
int main(){
        int n;
	cin>>n;
        if (n == 1) 
        cout<<"1\n";
        else if (n < 4) 
        cout<<"NO SOLUTION\n";
        else {
                for (int i = (n/2)+1; i <= n; i ++) {
                cout<<i<<" "<<(i-(n/2))<<" ";
		if(i==n){
		cout<<i;
		}
		}
        }
    }