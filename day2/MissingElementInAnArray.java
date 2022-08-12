package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
	int[] a= {1,7,4,3,2,7};
	int[] c=new int[6];
	for(int i=0; i<a.length; i++) {
	}
	 Arrays.sort(a);
	 for(int i=0; i<a.length; i++) {
		 System.out.println(a[i]);
	 }
	 System.out.println("---------------------");
	 for(int i=0; i<a.length; i++) {
		 System.out.println(c[i]);
	 }
	 System.out.println("---------------------");
	 for(int i=0; i<a.length; i++) {
		 if(c[i]==i)
		 {
		 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
		 }
	 }
	 
	 System.out.println("-------------------");
	 for(int i=0; i<a.length; i++) {
		 if(c[i]==1)
		 {
		 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
			 break;
		 }
	 }
}
}
