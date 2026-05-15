/**
 * 학생의 기본 정보를 저장하는 클래스
 *
 * @author (2025320057 홍권찬)
 * @version (20260514)
 */
public class Student
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String name;
    private String studentId;
    private int grade;
    private String department;

    /**
     * Student 클래스의 객체 생성자
     */
    public Student(String name, String studentId, int grade, String department) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        this.department = department;
    }

    /**
     * 학생 학번을 반환하는 메소드
     *
     * @return    학생 힉번
     */
    public String getStId() {
        return studentId;
    }

    /**
     *  학생 이름을 반환하는 메소드
     *
     * @return    학생 이름
     */
    public String getName() {
        return name;
    }
}