package Domain;

import java.util.Objects;

public class Doctor extends Entity {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Doctor(int id, int grade, String name) {
        super(id);
        this.grade = grade;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id+
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
