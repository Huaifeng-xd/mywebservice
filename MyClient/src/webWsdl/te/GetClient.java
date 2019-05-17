package webWsdl.te;

public class GetClient {
	public static void main(String[] args) {
		TellTimeService t1 = new TellTimeService();
		TellTime t2 = t1.getTellTimePort();
		t2.printTime();
	}
}
