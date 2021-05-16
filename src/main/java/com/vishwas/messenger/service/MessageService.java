package com.vishwas.messenger.service;

import java.util.List;
import java.util.ArrayList;

import com.vishwas.messenger.model.Message;;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello Vishwas", "Vishwas");
		Message m2 = new Message(1L, "Hello","Aish");
		List<Message> list= new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;		
	}

}
