package course2.lesson1_oop;

public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;
    Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    Human() {
        name = "Информация не указана";
        yearOfBirth = 0;
        town = "Информация не указана";
        jobTitle = "Информация не указана";
    };
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
