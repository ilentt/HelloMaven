package ilen;
import org.apache.commons.lang3.StringUtils;
public class CheckNumeric {

	public CheckNumeric() {
		// constructor
	}
	
	public boolean getCheckNumeric(String strText) {
		return StringUtils.isNumeric(strText);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strText1 = "01234";
		String strText2 = "0a1234";
		CheckNumeric check  = new CheckNumeric();
		
		System.out.println(strText1 + " is a numeric: " + check.getCheckNumeric(strText1));
		System.out.println(strText2 + " is a numeric: " + check.getCheckNumeric(strText2));
	}

}
