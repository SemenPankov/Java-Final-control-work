package org.example;

import java.util.*;

public class PhoneBook {
    // Хранит контакты в виде отображения (имя контакта -> объект контакта)
    private Map<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    /**
     * Добавляет новый контакт или обновляет существующий, добавляя новый номер телефона к контакту.
     *
     * @param name        имя контакта
     * @param phoneNumber номер телефона для добавления
     */
    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).addPhoneNumber(phoneNumber);
        } else {
            Contact contact = new Contact(name, phoneNumber);
            contacts.put(name, contact);
        }
    }

    /**
     * Удаляет контакт с указанным именем из телефонной книги.
     *
     * @param name имя контакта для удаления
     */
    public void removeContact(String name) {
        contacts.remove(name);
    }

    /**
     * Удаляет указанный номер телефона из контакта с указанным именем.
     *
     * @param name        имя контакта, у которого нужно удалить номер телефона
     * @param phoneNumber номер телефона для удаления
     */
    public void removePhoneNumber(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.get(name).removePhoneNumber(phoneNumber);
        }
    }

    /**
     * Выводит список контактов и их номеров телефонов на экран.
     */
    public void displayContacts() {
        List<Contact> sortedContacts = new ArrayList<>(contacts.values());
        sortedContacts.sort(Comparator.comparingInt(contact -> -contact.getPhoneNumbers().size()));
        for (Contact contact : sortedContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumbers());
        }
    }
}
