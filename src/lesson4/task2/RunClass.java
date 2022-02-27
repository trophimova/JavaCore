package lesson4.task2;

public class RunClass {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("111","Ivanov");
        phoneBook.add("222","Petrov");
        phoneBook.add("333","Sidorov");
        phoneBook.add("444","Ivanov");
        phoneBook.add("555","Petrov");
        phoneBook.add("666","Ivanov");
        phoneBook.add("777","Ivanenko");

        System.out.println(phoneBook.getPhoneByFIO("Ivanov"));
        System.out.println(phoneBook.getPhoneByFIO("Ivanenko"));
    }
}
