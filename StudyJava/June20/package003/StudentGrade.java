package June20.package003;

public class StudentGrade {
    public String ClassName = "4반";
    public String name;
    public String subject;
    public int grade;

    public StudentGrade() {
        System.out.println("아무것도 쓰이지 않았습니다.");
    }

    public StudentGrade(String input_name) {
        this.name = input_name;
    }

    public StudentGrade(String input_name, String input_subject, int input_grade) {
        this.name = input_name;
        this.subject = input_subject;
        this.grade = input_grade;
    }
}
