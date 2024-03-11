package user;

import address.IAddress;

import java.util.ArrayList;

public class User {
    private String name,surname,email,password,job;
    private int age;
    private ArrayList<IAddress> addressList;


    public User(String name,String surname,String email, String password,
                int age , ArrayList<IAddress> addressList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.addressList = addressList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public ArrayList<IAddress> getAddressList() {
        return addressList;
    }
}
