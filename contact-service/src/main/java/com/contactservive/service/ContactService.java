package com.contactservive.service;

import java.util.List;

import com.contactservive.entity.Contact;

public interface ContactService {
	public List<Contact> getContactOfUser(int userId);

}
