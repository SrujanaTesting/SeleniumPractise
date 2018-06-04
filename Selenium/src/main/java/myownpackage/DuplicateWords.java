package myownpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String s="Goodbye bye bye world world world xyz";
		ChromeDriver driver=new ChromeDriver();
		driver.switchTo().frame(0);
		        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		 
		        // Use compile(regex) if you want case sensitive.
		        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		        Matcher m = p.matcher(s);
		        while (m.find()) {
		            s = s.replaceAll(m.group(), m.group(1));
		        }
		 
		        System.out.println(s);
		    }
		}		
		/*Set<String> newSet=new LinkedHashSet<>();
		for(String word:words)
		{
			newSet.add(word);
		}
		for(String eachvalue:newSet)
		{
			s2=s2+eachvalue+" ";
		}
		
		System.out.println(s2);
		
	}

}*/
