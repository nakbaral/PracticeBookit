package com.cybertek.library.aaj;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;

public class Fakerr {
    public static void main(String[] args) {
        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.chuckNorris().fact());
        System.out.println(faker.ancient().hero());

    }
}
