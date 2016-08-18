package com.lessonslab.cxfrestservice.dao;

import java.util.HashMap;
import java.util.Map;

import com.lessonslab.cxfrestservice.model.Profile;

public class DatabaseClass {
		Profile profile1 = new Profile("Mahipal", "Mahi", "Lakkidi");
		private static Map<String, Profile> profiles = new HashMap<String, Profile>();
		
		public static Map<String, Profile> getProfiles() {
			return profiles;
		}		
		/*public static void getProfiles(Map<String, Profile> profiles) {
			profiles = profiles;
		}*/
	}
