#include <iostream>
using namespace std ;

int main (){
	int n=5 ;
	int tong =0 ;
	int tongchan =0 ;
	int tongle =0 ;
	for (int i=1 ; i<n ; i++){
		tong =tong +i ;
		if ( i%2==0){
			tongchan=tongchan + i ;
		}else {
			tongle=tongle+i ;
		}
	}
	cout <<"tong la :"<< tong ;
	cout << "\n tong chan la : "<< tongchan ;
	cout << "\n tong le la :" << tongle ;
}
