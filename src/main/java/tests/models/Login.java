package tests.models;

import com.opencsv.bean.CsvBindByName;

public class Login {
	
	public String sSN;
	@CsvBindByName(column = "Username", required = true)
	public String userName;
	@CsvBindByName(column = "Password", required = true)
	public String passWord;

}
