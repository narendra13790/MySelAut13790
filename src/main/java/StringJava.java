
public class StringJava {

	public static void main(String[] args) 
	{
		// String constant pool
	
		String s1="Anshul";
		String s2="Anshul";
		
		System.out.println(s1==s2);// true
		// Heap
		String s3= new String("Anshul");
		String s4= new String("Anshul");
		
		System.out.println("s3==s4 : "+(s3==s4));//false , because == operator compares the memory reference/address
		
		// to compare the actual value we have to use equals method
		
		System.out.println("s3.equals(s4) : "+s3.equals(s4));
		
		
		// methods
		
		// 
		String s5= "Narendra Anshul";
		int length=s5.length();
		System.out.println("length"+ length);
		//  will return the character at specified index
		System.out.println(s5.charAt(4));
		
		//
		String s6="Anshul";
		String s7="Anshul";
		System.out.println(s6.compareTo(s7));
		
		
		// 
	            s5=s5.concat(" Agarwal");
	    System.out.println(s5);
	    
	    // if string matches the it will return true otherwise false
	    System.out.println(s5.contains("Agarwal"));
	    
	    //
	    System.out.println(s2.contentEquals(s1));
	    // return true if pattern matches otherwise false
	    System.out.println("s5.startsWith('Nare') : "+s5.startsWith("Nare"));
	    
	    
	    // sub string : extract partial string or sub set of string
	    
	    String str6="Anshul Agrawal is 26 yrs old";
	    
	    String ss= str6.substring(5);// it will print from 5th index to last index
	    System.out.println(ss);
	    
	    ss= str6.substring(0,6);// it will print from 0th(inclusive) index to 6th(exclusive) index
	    System.out.println(ss);
	    
	    int beginIndex=str6.indexOf('A');
	    int endIndex=str6.indexOf("al")+2;
	    
	   String sss= str6.substring(beginIndex, endIndex);
	   System.out.println(sss);
	    
	   System.out.println("str6.indexOf(\"old\") : "+str6.indexOf("old"));
	    
	   String s26= str6.substring(str6.indexOf('2'),str6.indexOf("old"));
	   
	   System.out.println(s26);
	   // regular expression
	   // remove digits
	   String removeDigits=str6.replaceAll("\\d+", " space ");
	   // to remove space 
	   String removeChars=str6.replaceAll("\\s+", " space ");
	   
	   System.out.println("removeChars : "+removeChars);
	   
	   String removeChars2=str6.replaceAll("[^0-9]", "");// it will replace the characters other than 0..9
	   
	   System.out.println("removeChars2 : "+removeChars2);
	   
	   String replaceDigits=str6.replace("[0-9]", "");// it will replace the characters  0..9
	   System.out.println("replaceDigits : "+replaceDigits);
	   
	   
	   // valueOf : it will convert any type of variables and object into string and will return string
	   // Synntax : String.valueOf(variable of any type)
	   
	   int i=10;
	   String str="10";
	   
	   System.out.println(str.equals(String.valueOf(i)));
	   
	   double d=1233.343;
	   String dStr=String.valueOf(d);
	   System.out.println(dStr);
	   
	   Double dbl= new Double(1233.56666);
	   
	   int value=  dbl.intValue();// 1233
	   // String will be converted in to double
	   double dblFromString =Double.valueOf("121333");
	   System.out.println(dblFromString);
	   
	   Integer iVar=new Integer(13);
	   
	   //
	   // print reverse string 
	   
	   
		
	}
}
