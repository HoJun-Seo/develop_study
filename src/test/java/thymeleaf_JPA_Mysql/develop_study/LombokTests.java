package thymeleaf_JPA_Mysql.develop_study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import thymeleaf_JPA_Mysql.develop_study.domain.Board;


@SpringBootTest
public class LombokTests {
    @Test
    public void testNoArgsConstructor(){
        Board board = new Board();

        System.out.println(board);
    }

    @Test
    public void testRequriedArgsConstructor(){
        Board board = new Board("테스트 제목");

        System.out.println(board);
    }

}
