package practisejen;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {

	

		
		@Test(dataProvider = "bookTicketDataProvider")
		public void bookticket(String src, String dest ,String ticket) {
			System.out.println("source is "+src+" destination is "+dest+"  number of ticketds is "+ticket);
			
		}
		
		@DataProvider
		public Object[][] bookTicketDataProvider()
		{
			
			Object[][] objarr = new Object[3][3];
			objarr[0][0]="Bangalore";
			objarr[0][1]="Mysore";
			objarr[0][2]="10";
			
			objarr[1][0]="Bangalore";
			objarr[1][1]="goa";
			objarr[1][2]="10";
			
			objarr[2][0]="Mysore";
			objarr[2][1]="Kerela";
			objarr[2][2]="10";
			return objarr;
			

	}
	}

