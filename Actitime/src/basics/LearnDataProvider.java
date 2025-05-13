package basics;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] getData() {
	Object[][]data= {{"admin","manager"},
					{"admin1","manager1"},
					{"Dinga","Dingi"},
					{"username","password"}};
	return data;
	}
}
