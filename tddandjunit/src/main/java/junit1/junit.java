package junit1;

public class junit {
public String removeAChars(String str) {
    	
		if(str.length()<=2) {
    		return str.replaceAll("[aA]+", "");
    	}else {
    		String firstTwoChars = str.substring(0,2).replaceAll("[aA]+", "");
    		return firstTwoChars+str.substring(2);
    	}
    }
}
