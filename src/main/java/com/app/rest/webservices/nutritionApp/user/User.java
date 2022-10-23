package com.app.rest.webservices.nutritionApp.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "user_details")
//user_details (id,age,gender,height,name,weekly_training_frequency,weight)
public class User {

    protected User(){

    }

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String gender;
    private float height;
    private int age;
    private int weight;
    private int weeklyTrainingFrequency;

    public User(int id, String name, String gender, float height, int age, int weight, int weeklyTrainingFrequency) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.weeklyTrainingFrequency = weeklyTrainingFrequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeeklyTrainingFrequency() {
        return weeklyTrainingFrequency;
    }

    public void setWeeklyTrainingFrequency(int weeklyTrainingFrequency) {
        this.weeklyTrainingFrequency = weeklyTrainingFrequency;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                ", weeklyTrainingFrequency=" + weeklyTrainingFrequency +
                '}';
    }
}
