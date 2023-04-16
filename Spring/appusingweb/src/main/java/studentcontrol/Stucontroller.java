package studentcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.Stuservice;
@Controller
public class Stucontroller {

	private Stuservice stuservice;

@Autowired
public void setStuservice(Stuservice stuservice) {
	this.stuservice = stuservice;
}

public Stucontroller() {
	super();
	// TODO Auto-generated constructor stub
	
}

	public void savecontroller() {
		
		System.out.println("taking input from UI and send it to the service layer");
		stuservice.saveservice();
		
	}
}
