package week1.day2;

public class Calculator {
public int addTwoNumbers (int a,int b,int c) {
	return a+b+c;
	}
public int subTwoNum (int a,int b,int c) {
return a-b-c;
}
public double mulTwoNum (double a,double b) {
	return a*b;
}
public float divTwoNum (float a,float b) {
	return a/b;
}
public class Mycalculator {
}
public static void main (String[] args) {
	Calculator obj=new Calculator();
	int add=obj.addTwoNumbers(2,2,2);
	System.out.println(add);
	int sub=obj.subTwoNum (2,2,2);
	System.out.println(sub);
	double mul=obj.subTwoNum (2,2,2);
	System.out.println(mul);
	float div=obj.divTwoNum (4.2f,2.2f);
	System.out.println(div);
	

}
}

