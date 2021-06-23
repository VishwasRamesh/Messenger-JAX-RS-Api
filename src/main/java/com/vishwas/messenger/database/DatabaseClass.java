package com.vishwas.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.vishwas.messenger.model.*;
import com.vishwas.playlist.model.Playlist;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	private static Map<Long, Playlist> playlists = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}

	public static Map<Long, Playlist> getPlaylists() {
		return playlists;
	}

}
