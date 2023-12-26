import java.util.List;

public class School {

    private List<Teacher> teacher;
    private List<Student> student;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        School.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        School.totalMoneySpent = totalMoneySpent;
    }

    public static void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

    public int updateTotalMoneySpent(int moneySpent){
       return totalMoneyEarned -= moneySpent;
    }

}
