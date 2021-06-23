package com.vishwas.playlist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vishwas.messenger.database.DatabaseClass;
import com.vishwas.playlist.model.Playlist;

public class PlaylistService {
	private Map<Long, Playlist> playlists = DatabaseClass.getPlaylists();
	
	public PlaylistService() {
		playlists.put(1L, new Playlist("MJ", "Beatit"));
		playlists.put(2L, new Playlist("MJ", "Dangerous"));
	}
	
	public List<Playlist> getAllSongListInPlaylist(){
		return new ArrayList<Playlist>(playlists.values());
	}
}


//private Map<Long, Message> messages = DatabaseClass.getMessages();
//
//public MessageService() {
//	messages.put(1L, new Message(1L, "Hello Vishwas", "Vishwas"));
//	messages.put(2L, new Message(2L, "Hello John!", "John"));
//}
//
//public List<Message> getAllMessages(){
//	return new ArrayList<Message>(messages.values());		
//}
//
//public List<Message> getAllMessagesForYear(int year){
//	List<Message> msgForYear = new ArrayList<>(); 
//	Calendar cal = Calendar.getInstance();
//	for(Message message : messages.values()) {
//		cal.setTime(message.getcreated());
//		if(cal.get(Calendar.YEAR)==year) {
//			msgForYear.add(message);
//		}
//	}
//	return msgForYear;
//	
//}