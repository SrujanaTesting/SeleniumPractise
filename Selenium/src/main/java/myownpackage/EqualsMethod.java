package myownpackage;

public class EqualsMethod {

	public static void main(String[] args) {
String s1="srujana";
String s2="srujana";
Integer i1=10;
Integer i2=10;
String s3=new String("srujana");
String s4=new String("srujana");
Integer i3=new Integer(10);
Integer i4=new Integer(10);
int x=9;
int y=9;
System.out.println(x==y);

System.out.println(s1==s2);
System.out.println(s3==s4);

System.out.println(i1==i2);
System.out.println(i3==i4);
	}

}
