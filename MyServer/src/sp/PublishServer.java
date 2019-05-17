package sp;

import javax.xml.ws.Endpoint;

public class PublishServer {
	public static void main(String[] args) {
//		String address = "http://localhost/8005/telltime";
		Endpoint.publish("http://localhost/8005/tell",new TellTime());
		System.out.println("发布成功");
	}
}
