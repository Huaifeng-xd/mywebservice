package sp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;
@WebService
public class TellTime  {
	@WebMethod
	public void printTime() {
		System.out.println("time:"+new Date());
	}
	
}
