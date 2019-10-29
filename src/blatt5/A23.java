package blatt5;

import java.util.Arrays;

import iotools.IOTools;

@SuppressWarnings("unused")
public class A23 {

	public static void main(String[] args) {

		int reader = IOTools.readInt();
		int n =0;
		while(n<2||n>10||(n%2==0)) {
			System.out.print("Bitte geben Sie ein Zahl n was größer 2, kleiner 10 und ungerade ist");
			
		}
		int[][] quadrat=new int[n][n];
		int zeile=n/2;
		int spalte =(n/2) +1;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				quadrat[i][j]=0;
			}
		}
		int i =1;
		while(i<=n*n){
			if(quadrat[zeile][spalte]==0) {
				quadrat[zeile][spalte]=i;
				i++;
				spalte++;
				zeile--;
				if(zeile<0) {
					zeile=n-1;
				}
				if(spalte==n) {
					spalte=0;
				}
			}else {
				zeile++;
				spalte++;
				if(zeile==n) {
					zeile=0;
				}
				if(spalte==n) {
					spalte=0;
				}
			}
		}
		for(int j=0;j<n;j++) {
			for (int b=0;b<n;b++) {
				System.out.print(quadrat[j][b]+" ");
			}
			System.out.println();
		}
	}

}


