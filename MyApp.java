import java.util.Scanner;
/**
 * MyApp 클래스 : 학생 객체를 생성하고, 점수를 입력받아서 성적표를 출력한다.
 *
 * @author (2023485096 이순영)
 * @version (2026.05.15)
 */
public class MyApp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // 학생 객체 생성
            Student st1 = new Student("홍길동", "202401", 3, "컴퓨터공학");

            // 성적 입력 (학기 선택)
            System.out.print("학기를 입력하세요 (1 또는 2): ");
            int sem = sc.nextInt();
            Score score = new Score(st1, sem);
            score.inputScores();
            
            // 성적 계산
            score.calculateScores();

            // 성적표 출력
            score.printReport();

        } catch (Exception e) {
            System.out.println("오류가 발생했습니다: " + e.getMessage());
        }
    }
}