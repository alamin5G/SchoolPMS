import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello {
    public static void main(String[] args) {
        Teacher Alamin = new Teacher(1, "Alamin", 5000);
        Teacher Rabeya = new Teacher(2, "Rabeya", 2900);
        Teacher Arafat = new Teacher(3, "Arafat", 4500);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(Alamin);
        teacherList.add(Rabeya);
        teacherList.add(Arafat);


        Student rahim = new Student(1, "Rahim", 88);
        Student karim = new Student(2, "Karim", 93);
        Student jadi = new Student(3, "Jadu", 69);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(rahim);
        studentList.add(karim);
        studentList.add(jadi);


        System.out.println("-----------------Student Fees Section---------------");
        School abc = new School(teacherList, studentList);
        //Here getFirst() means first index from list = list(0)
        studentList.getFirst().payFees(8000);
        studentList.getFirst().getStudentStatus();
        studentList.get(1).payFees(9950);
        studentList.get(1).getStudentStatus();
        //School earned from fees
        System.out.println("School Earned: " + abc.getTotalMoneyEarned());

        System.out.println("---------------School Pay Salayr ________");
        teacherList.getFirst().setSalaryEarned(teacherList.getFirst().getSalary());
        teacherList.get(1).setSalaryEarned(teacherList.get(1).getSalary());
        int spent = Alamin.getSalary() + Rabeya.getSalary();
        System.out.println("School Spent for salary = "+ spent);
        System.out.println("School Remaining Balance is: " + abc.updateTotalMoneySpent(spent));
    }
}