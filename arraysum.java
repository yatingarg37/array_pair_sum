package assignments;

import java.util.Scanner;

public class pair_sum {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter size of 2st array");
		int n1=sc.nextInt();
		System.out.println("Enter X");
		int x= sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements of 1st Array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Elements of 2nd array");
		for(int j=0;j<n1;j++) {
			arr1[j]=sc.nextInt();
		}
		System.out.println("Pair :-");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]+arr1[j]==x) {
					System.out.println(arr[i]+" "+arr1[j]);
				}
			}
		}
	}
}
