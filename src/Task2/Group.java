package Task2;

public class Group {
    private String name;
    private Student[] students;
    private int count;

    public Group(String name, Student[] students, int count) {
        this.name = name;
        this.students = students;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
