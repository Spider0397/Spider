package com.bikkadIT1.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
@Table(name="Stu_info")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int roll;
@Column(name="f_name")
	private String name;
@Column(name="Sub")
	private String subject;
@Transient
	private int mark;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + ", mark=" + mark + ", getRoll()="
				+ getRoll() + ", getName()=" + getName() + ", getSubject()=" + getSubject() + ", getMark()=" + getMark()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}