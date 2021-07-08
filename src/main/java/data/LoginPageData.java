package data;

public class LoginPageData {
	
	private static String number;
	private static String password;
	
	public LoginPageData(){
		ReadExcelFile file;
		try{
			file=new ReadExcelFile();
			Object[][] data=file.ReadDataInExcelFile("C:\\selenium\\xlfiles", "LoginData.xlsx", "sheet1");
			number=data[1][0].toString();
			password=data[1][1].toString();//to get String representation of an object
//			System.out.println(number);
//			System.out.println(password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getNum(){
		return number;
	}
	public String getpass(){
		return password;
	}

}
