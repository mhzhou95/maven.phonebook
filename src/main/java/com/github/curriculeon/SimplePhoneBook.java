package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    List<Person> list = new ArrayList<>();

    public void add(String name, String phoneNumberToAdd) {
        Person person = new Person(name, phoneNumberToAdd);
        list.add(person);
    }

    public String get(String name) {
        for (int i = 0; i < list.size(); i++) {
            Person tempPerson = list.get(i);
            if(tempPerson.getName() == name){
                return tempPerson.getPhoneNumber();
            }
        }return "No contact found";
    }

    public Boolean hasEntry(String phoneNumber) {
        for (int i = 0; i < list.size(); i++) {
            Person tempPerson = list.get(i);
            if(tempPerson.getPhoneNumber() == phoneNumber){
                return true;
            }
        }return false;
    }

    public void remove(String name) {
        for (int i = 0; i < list.size(); i++) {
            Person tempPerson = list.get(i);
            if(tempPerson.getName() == name){
                list.remove(tempPerson);
                System.out.println(name + " removed");
            }
        }
    }

    public List<String> getAllContactNames() {
        List<String> contactNames = new ArrayList<>();
        for ( Person person : list
             ) {
            contactNames.add(person.getName());
        }
        return contactNames;
    }

    public String reverseLookup(String phoneNumber) {
        for (int i = 0; i < list.size(); i++) {
            Person tempPerson = list.get(i);
            if(tempPerson.getPhoneNumber() == phoneNumber){
                return tempPerson.getName();
            }
        }return "No contact found";
    }
}
