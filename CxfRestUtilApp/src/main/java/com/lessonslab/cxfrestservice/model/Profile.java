package com.lessonslab.cxfrestservice.model;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Profile {
	
	private String profileName;
	private Long id;
	private String firstName;
	private String lastName;
	
	public Profile(String profileName, String firstName,
			String lastName) {
		super();
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

		
}
