package ch12.problem.p5;

public class Student {

    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student student) {
            return this.studentNum.equals(student.getStudentNum());
        }

        return false;
    }
}
