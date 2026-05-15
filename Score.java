import java.util.*;
/**
 * Score 클래스 : 각각의 과묵의 점수를 입력받고, 총점과 성적을 계산한다.
 *
 * @author (2023485096 이순영)
 * @version (2026.05.15)
 */
public class Score
{
    private Student student; 
    private int semester;
    private String[] subjects;
    private double[][] scores;
    private double[] totals;

    /**
     * Score 클래스의 객체 생성자
     */
    public Score(Student student, int semester) {
        this.student = student;
        this.semester = semester;
        if (semester == 1) {
            subjects = new String[]{"소프트웨어공학개론", "프로그래밍응용1", "소프트웨어품질관리"};
        } else {
            subjects = new String[]{"소프트웨어분석설계", "프로그래밍응용2"};
        }
        scores = new double[subjects.length][5];
        totals = new double[subjects.length];
    }

    /**
     * 메소드 설명 - 각각의 과목의 점수를 입력받는 메소드
     *
     * @param  없음
     * @return    없음
     */
    public void inputScores() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("[" + subjects[i] + "] 점수 입력 (출석, 중간, 기말, 과제, 실습):");
            for (int j = 0; j < 5; j++) {
                try {
                    scores[i][j] = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("숫자만 입력 가능합니다. 다시 입력하세요.");
                    sc.next(); 
                    j--;
                }
            }
        }
    }

    /**
     * 메소드 설명 - 입력받은 점수를 과목별로 총점을 계산하는 메소드
     *
     * @param  없음  
     * @return    없음
     */
    public void calculateScores() {
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < 5; j++) {
                totals[i] += scores[i][j];
            }
        }
    }

    /**
     * 메소드 설명 - 계산된 총점을 보고 성적을 계산하는 메소드
     *
     * @param  총점
     * @return    총점에 해당되는 성적
     */
    public String getGrade(double total) {
        if (total >= 81) {
            return "A";
        } 
        else if (total >= 45) {
            return "B";
        } 
        else if (total >= 30) {
            return "C";
        } 
        else if (total >= 15) {
            return "D";
        } 
        else {
            return "F";
        }
    }

    /**
     * 메소드 설명 - 성적표를 출력하는 메소드
     *
     * @param  없음
     * @return    없음
     */
    public void printReport() {
        System.out.println("--- 성적표 (" + student.getName() + ") ---");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + totals[i] + "(" +  (getGrade(totals[i])) + ")");
        }
    }
}