import java.util.*;
public class matrixSum{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		if(r==c){
		
		int a[][]= new int[r][c];
		int b[][]= new int[r][c];
		int sum[][]= new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				b[i][j]= sc.nextInt();
			}
		}
		int res=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				sum[i][j]= a[i][j]+b[i][j];
				res+= sum[i][j];
				System.out.print(sum[i][j]+" "); 
			}
			System.out.println();
		}
		System.out.println("Total sum is: "+res);
		}
		else{
			System.out.println("Matrix should be of same row and columns");
		}
	}
}