package Task2;

public interface PeaksoftInterface {
    void getAllMentors(Mentor[] mentors);
    void getAllStudents(Student[] students);
    void searchByStudentName(String name, Student[] students);
    void searchByMentorEmail(String email, Mentor[] mentors);
    void sortByStudentName(Student[] students);
    void onlyMaleOrFemaleGenders(String gender, Student[] students);
}
