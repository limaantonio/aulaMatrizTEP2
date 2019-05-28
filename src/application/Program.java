package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int n, m, x;

		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();

		int mat[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<m; i++){
		for(int j=0; j<n; j++){
			System.out.printf("%d ",mat[i][j]);
		}
		System.out.println();
		}
		x = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(x == mat[i][j]) {
					System.out.printf("Position %d , %d:\n",i,j);
						if(j != 0) {
							System.out.printf("Left: %d\n",mat[i][j-1]);
						}
						if(i != 0) {
							System.out.printf("Up: %d\n",mat[i-1][j]);
						}
						if(j != n-1) {
							System.out.printf("Rigth: %d\n",mat[i][j+1]);
						}
						if(i != m-1) {
							System.out.printf("Down: %d\n",mat[i+1][j]);
						}
				}
			}
		}
	}
}
