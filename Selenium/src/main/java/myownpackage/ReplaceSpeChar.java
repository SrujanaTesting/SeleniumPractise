package myownpackage;

 class ReplaceSpeChar {

	public ReplaceSpeChar() {
		System.out.println("Im constructor");
	}

	public static void main(String[] args) {
		ReplaceSpeChar ne=new ReplaceSpeChar();
		
Integer i=10;
System.out.println(i+10);
System.out.println(i.toString()+10);
String s="{Java}[+*(Selenium)";
		s=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
	}

}
