package com.bikkadIT1.HibernateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
@Id 
private int no;
private String name;
private String PM;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPM() {
	return PM;
}
public void setPM(String pM) {
	PM = pM;
}
@Override
public String toString() {
	return "Country [no=" + no + ", name=" + name + ", PM=" + PM + "]";
}


}
