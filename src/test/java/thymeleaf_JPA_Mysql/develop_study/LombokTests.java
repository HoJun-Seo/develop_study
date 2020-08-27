package thymeleaf_JPA_Mysql.develop_study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import thymeleaf_JPA_Mysql.develop_study.domain.Board;
import thymeleaf_JPA_Mysql.develop_study.domain.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


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

    @Test
    public void testToString(){
        Board board = new Board();

        System.out.println(board);
    }

    @Test
    public void testToStringExclude(){
        Member member = new Member();

        System.out.println(member);
    }

    @Test
    public void testBoard(){
        Board board1 = new Board();
        board1.setBoardNo(1);
        board1.setTitle("title1");

        Board board2 = new Board();
        board2.setBoardNo(2);
        board2.setTitle("title2");

        Board board3 = new Board();
        board3.setBoardNo(3);
        board3.setTitle("title3");

        Set<Board> boardSet = new HashSet<Board>();
        boardSet.add(board1);
        boardSet.add(board2);
        boardSet.add(board3);

        System.out.println("저장된 데이터 수 : " + boardSet.size());

        Iterator<Board> boardIterator = boardSet.iterator();
        while (boardIterator.hasNext()){
            System.out.println(boardIterator.next());
        }
    }
}
