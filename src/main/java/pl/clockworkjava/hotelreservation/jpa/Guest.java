package pl.clockworkjava.hotelreservation.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;

    public Guest() {

    }

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return this.id;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void getAge() {
        int x = this.age + 5;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}