package Homework2Dop;

import java.nio.file.attribute.PosixFilePermission;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("POP45");
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Shovkovichna");
        address.setHouse("4");
        address.setApartment("44");

        System.out.println(address.show1());


    }
}
