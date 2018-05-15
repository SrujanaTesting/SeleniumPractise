package myownpackage;

public class ReverseEachWord {

	public static void main(String[] args) {
String s="Iam a good girl";
String[] words=s.split(" ");
String s1="";
for(String word:words)
{
	for(int i=word.length()-1;i>=0;i--)
	{
		s1=s1+word.charAt(i);
	}
	s1=s1+" ";
}
System.out.println("s1 is "+ s1);
s=s1;
System.out.println("s is "+s);
	}

}
