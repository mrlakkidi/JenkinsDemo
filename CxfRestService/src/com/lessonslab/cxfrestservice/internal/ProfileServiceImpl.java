package com.lessonslab.cxfrestservice.internal;

import java.util.Map;

import javax.ws.rs.core.Response;

import com.lessonslab.cxfrestservice.ProfileService;
import com.lessonslab.cxfrestservice.dao.DatabaseClass;
import com.lessonslab.cxfrestservice.model.Profile;

public class ProfileServiceImpl implements ProfileService{
		private Map<String, Profile> profiles = DatabaseClass.getProfiles();
		
		@Override
		public Response getAllProfiles() {
			return Response.ok(profiles.values()).build();
		}
		
		@Override
		public Response getProfile(String profileName) {
			return Response.ok(profiles.get(profileName)).build();
		}
		
		@Override
		public Profile addProfile(String profileName, String firstName, String lastName) {
			
			Profile profile = new Profile(profileName, firstName, lastName);
			profile.setId(Long.valueOf(profiles.size()+1) );
			profiles.put(profile.getProfileName(), profile);
			return (Profile)profiles.get(profile.getProfileName());
		} 
		
		@Override
		public Response updateProfile(String profileName, Long id, String firstName, String lastName) {
			
			if(profiles.keySet().isEmpty()) {
				return null;
			}
			Profile profile = profiles.get(id);
			profile.setProfileName(profileName);
			profile.setLastName(firstName);
			profile.setLastName(lastName);
			return Response.ok(profile).build();
		}
		
		@Override
		public Profile removeProfile(String profileName) {
			return profiles.remove(profileName);
		}
	
}
