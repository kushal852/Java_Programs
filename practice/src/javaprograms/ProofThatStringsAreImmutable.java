package javaprograms;

public class ProofThatStringsAreImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s1 = "JAVA";
		 
	     String s2 = "JAVA";
	 
	     System.out.println(s1 == s2);         //Output : true
	 
	     s1 = s1 + "J2EE";
	 
	     System.out.println(s1 == s2);         //Output : false
	     /*
	      *  Before modifications they are pointing to same object. 
	      *  Once we tried to change the content of the object using ‘s1’, a new object is created in the pool with “JAVAJ2EE” as it’s content and it’s reference is assigned to s1. 
	      *  If the strings are mutable, both s1 and s2 should point to same object even after modification. 
	      *  That never happened here. That proves the string objects are immutable in java.
	      * 
	      * 
	      * */

	}

}
