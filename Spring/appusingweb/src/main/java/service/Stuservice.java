package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentdao.Studao;
@Service
public class Stuservice {

	private Studao studao;

@Autowired
public void setStudao(Studao studao) {
	this.studao = studao;
}
public Stuservice() {
	super();
	// TODO Auto-generated constructor stub
}
	public void saveservice() {
		
		System.out.println("taking input from controller and send it to the dao layer");
	
		studao.savedao();
	}
	
}
