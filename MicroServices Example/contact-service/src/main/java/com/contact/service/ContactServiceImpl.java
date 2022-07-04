package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L,"Shubham","7854122356",11L),
            new Contact(2L,"Dinesh","7856421356",12L),
            new Contact(3L,"Sar","7888552356",13L)
    );

    @Override
    public List<Contact> getContactList(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
