package com.contactservive.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contactservive.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	private static List<Contact> list = new ArrayList<Contact>();
	static {
	list.add(new Contact(113,"shivani@gmail.com","Shivani",1123));
	list.add(new Contact(114,"shiv@gmail.com","Shiva",1124));
	list.add(new Contact(115,"wer@gmail.com","Shivangi",1125));
	list.add(new Contact(116,"yert@gmail.com","Shivanshu",1126));
	}

	@Override
	public List<Contact> getContactOfUser(int userId) {
		return list.stream().filter(contact->contact.getUserId()==(userId)).collect(Collectors.toList());
	}
	

}
