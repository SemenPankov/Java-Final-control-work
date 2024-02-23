package org.example;

import java.util.List;
import java.util.ArrayList;

/**
 * Представляет контакт в телефонной книге.
 */
public class Contact {
    private String name; // Имя контакта
    private List<String> phoneNumbers; // Список телефонных номеров, связанных с контактом

    /**
     * Создает новый контакт с указанным именем и номером телефона.
     *
     * @param name        Имя контакта
     * @param phoneNumber Номер телефона контакта
     */
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.phoneNumbers.add(phoneNumber);
    }

    /**
     * Возвращает имя контакта.
     *
     * @return Имя контакта
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает список телефонных номеров, связанных с контактом.
     *
     * @return Список телефонных номеров, связанных с контактом
     */
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Добавляет телефонный номер к контакту.
     *
     * @param phoneNumber Телефонный номер для добавления
     */
    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    /**
     * Удаляет телефонный номер из контакта.
     *
     * @param Телефонный номер для удаления
     */
    public void removePhoneNumber(String phoneNumber) {
        phoneNumbers.remove(phoneNumber);
    }
}
