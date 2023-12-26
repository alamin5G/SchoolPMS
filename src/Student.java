public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private  int feesTotal;



    /// constructor will called each time to create a new student
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid=0;
        this.feesTotal = 10000;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public void payFees(int fees){
        this.feesPaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int dueFees(){
        return feesTotal -= feesPaid ;
    }

    public void getStudentStatus(){
        System.out.println(this.getName() + " and his/her ID is " + this.getId() + " paid a total fees = " + this.getFeesPaid() + " and current a/c status is = " + this.dueFees());

    }
}
