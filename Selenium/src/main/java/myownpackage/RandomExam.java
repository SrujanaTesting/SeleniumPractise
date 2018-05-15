package myownpackage;

public class RandomExam {

	public static void main(String[] args) {
int max=10;
int min=6;
int range=(max-min+1);
//System.out.println(range);
for(int i=0;i<=5;i++)
{

System.out.println((int)(Math.random()*range)+min);
}



	}

}

