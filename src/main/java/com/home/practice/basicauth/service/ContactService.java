package com.home.practice.basicauth.service;

import com.home.practice.basicauth.pojo.Contact;

import java.util.List;


public interface ContactService {
    Contact getContactById(String id);
    void saveContact(Contact contact);
    void updateContact(String id, Contact contact);
    void deleteContact(String id);
    List<Contact> getContacts();
}
