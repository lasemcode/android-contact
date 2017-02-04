package com.lasemcode.contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lasemcode on 04/02/17.
 */

public class Contact {

    public enum ContactTypes {
        family,friend
    }

    private int id;
    private String name;
    private String number;
    private ContactTypes contactType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactTypes getContactType() {
        return contactType;
    }

    public void setContactType(ContactTypes contactType) {
        this.contactType = contactType;
    }



    public static List<Contact> getContact(){
        List<Contact> contacts = new ArrayList<>();

        Contact c1 = new Contact();
        c1.setId(1);
        c1.setName("Rudi hermawan");
        c1.setNumber("0893382323843");
        c1.setContactType(ContactTypes.friend);
        contacts.add(c1);

        Contact c2 = new Contact();
        c2.setId(2);
        c2.setName("Ira Fatmawati");
        c2.setNumber("0878790232389");
        c2.setContactType(ContactTypes.friend);
        contacts.add(c2);

        Contact c3 = new Contact();
        c3.setId(3);
        c3.setName("Fatimah ratna");
        c3.setNumber("08823234989992");
        c3.setContactType(ContactTypes.friend);
        contacts.add(c3);

        Contact c4 = new Contact();
        c4.setId(4);
        c4.setName("Imam fauzi");
        c4.setNumber("0883298329888");
        c4.setContactType(ContactTypes.family);
        contacts.add(c4);

        Contact c5 = new Contact();
        c5.setId(5);
        c5.setName("Khusnul ni'mah");
        c5.setNumber("0831283787398");
        c5.setContactType(ContactTypes.friend);
        contacts.add(c5);

        Contact c6 = new Contact();
        c6.setId(6);
        c6.setName("Ina wati putri");
        c6.setNumber("087089232378");
        c6.setContactType(ContactTypes.friend);
        contacts.add(c6);

        Contact c7 = new Contact();
        c7.setId(7);
        c7.setName("Joko gunawan");
        c7.setNumber("089782388233");
        c7.setContactType(ContactTypes.friend);
        contacts.add(c7);

        return contacts;
    }


}
