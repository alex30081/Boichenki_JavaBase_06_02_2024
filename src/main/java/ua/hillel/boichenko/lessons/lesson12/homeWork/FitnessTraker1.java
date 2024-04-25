package main.java.ua.hillel.boichenko.lessons.lesson12.homeWork;

public class FitnessTraker1 {
    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    private String name;
    private int date;
    private int month;


    private int year;
    private String email;
    private String telephone;
    public String surname;
    public int weight;
    public int pressure;
    public int sumStep;

    public int getDate() {
        return date;
    }

    public int getSumStep() {
        return sumStep;
    }

    public int getPressure() {
        return pressure;
    }

    public int getWeight() {
        return weight;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;

    public FitnessTraker1(String name, String surname, int date, int month, int year, String email, String telephone,
                          int weight, int pressure, int sumStep) {
        this.age = (2024 - year);
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.month = month;
        this.year = year;
        this.email = email;
        this.telephone = telephone;
        this.weight = weight;
        this.pressure = pressure;
        this.sumStep = sumStep;
    }

    void printAccountInfo() {
        System.out.println("You name " + name + " you surname " + surname + " date of birth: " + date + "."
                + month + "." + year + " you are " + age + " years old " + "." + " you email: " + email +
                ", you telephone: "
                + telephone + "." + "\n" + "You Weight = " + weight + "," + " pressure = " + pressure
                + " sum step = " + sumStep);

    }
}
