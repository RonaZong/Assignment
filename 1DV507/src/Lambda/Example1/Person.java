package Lambda.Example1;

import java.time.LocalDate;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE;
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAdress;

    public Person() {
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAdress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public void printPerson() {
        System.out.println();
    }
}




