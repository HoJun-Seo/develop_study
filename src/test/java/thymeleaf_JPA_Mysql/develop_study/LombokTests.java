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
    public void testRequiredArgsConstructor(){
        Board board = new Board("테스트 제목");

        System.out.println(board);
    }

    @Test
    public void testGetter(){
        Board board = new Board();

        System.out.println(board.getTitle());
    }

    @Test
    public void testSetter(){
        Board board = new Board();
        board.setTitle("게시판 제목");

        System.out.println(board.getTitle());
    }
}
