package frameworkRelatedQns;

public class DataProvider {

	@DataProvider (name = "Login Creds")
    public Object[][] dpMethod(){
	 return new Object[][] {{UserName}, {Password}};
    }
	
   @Test (dataProvider = "data-provider")
   public void myTest (String UserName, String Pasword) {
       System.out.println(UserName + Pasword);
   }

}
