package com.german.androidlearning.Lesons20_40.UserInterface.recyclerview.RecyclerExample2;

import com.german.androidlearning.R;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String age;
    int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    private List<Person> persons;

    //Этот метод создает список ArrayList с тремя объектами Person.
    private void initializeData() {
        persons = new ArrayList();
        persons.add(new Person("Emma wilson", "23 years old", R.drawable.girl1));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.girl2));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.girl3));
    }
}