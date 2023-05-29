package tTestPackage;

public class SegregateAlphaNumbersAndSplChars {

	public static void main(String[] args) {
			
		String st ="a2B*C5?d";  //aBCd 25 *?
		
		String alphaChar="";
		String SplChar="";
		String NumChar="";
		
		char[] ch = st.toCharArray();
		
		for(int i=0; i<st.length(); i++)
		{

		if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
		{
			alphaChar =alphaChar+ ch[i];
		}
		else if(ch[i]>='0' && ch[i]<='9')
		{
			NumChar =NumChar+ch[i];
		}
		else 
		{
			SplChar =SplChar+ch[i];
		}
		}
		System.out.println(alphaChar+" "+NumChar+" "+SplChar);
		
		
	}

}
