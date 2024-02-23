package org.example;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBookMenu menu = new PhoneBookMenu(phoneBook);
        menu.displayMenu();
    }
}
