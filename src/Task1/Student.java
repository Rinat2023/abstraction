package Task1;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter EducationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        EducationCenter = educationCenter;
    }

    public String getName() {
        return name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return EducationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        EducationCenter = educationCenter;
    }
}
