package thymeleaf_JPA_Mysql.develop_study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import thymeleaf_JPA_Mysql.develop_study.domain.Board;
import thymeleaf_JPA_Mysql.develop_study.domain.Member;
import thymeleaf_JPA_Mysql.develop_study.domain.Student;
import thymeleaf_JPA_Mysql.develop_study.domain.UserItem;

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
        Board board = new Board(1);

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
        Member member = new Member("ghwns6659", "zxc3226659");

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

    @Test
    public void testUserItem(){
        UserItem userItem1 = new UserItem();
        userItem1.setUserNo(1);
        userItem1.setItemId(100);
        userItem1.setDescription("usetItem1");

        UserItem userItem2 = new UserItem();
        userItem2.setUserNo(2);
        userItem2.setItemId(200);
        userItem2.setDescription("usetItem2");

        UserItem userItem3 = new UserItem();
        userItem3.setUserNo(3);
        userItem3.setItemId(300);
        userItem3.setDescription("usetItem3");

        Set<UserItem> userItemSet = new HashSet<UserItem>();

        userItemSet.add(userItem1);
        userItemSet.add(userItem2);
        userItemSet.add(userItem3);

        System.out.println("저장된 데이터 수 : " + userItemSet.size());

        Iterator<UserItem> itemIterator = userItemSet.iterator();
        while (itemIterator.hasNext()){
            System.out.println(itemIterator.next());
        }
    }

    @Test
    public void testStudent(){
        Student student1 = new Student();
        student1.setStudentNo(1);
        student1.setName("Alex");

        Student student2 = new Student();
        student2.setStudentNo(2);
        student2.setName("Evan");

        Set<Student> studentSet = new HashSet<Student>();

        studentSet.add(student1);
        studentSet.add(student2);

        System.out.println("저장된 데이터 수 : " + studentSet.size());

        Iterator<Student> studentIterator = studentSet.iterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }

    @Test
    public void testNoArgsConstructor2(){
        Member member = new Member("ghwns6659", "zxc3226659");
        // RequriedArgsConstructor 어노테이션으로 인해 @NoArgsConstructor 어노테이션과 같은 디폴트 생성자 생성 불가

        System.out.println(member);
    }

    @Test
    public void testRequriedArgsConstructor2(){
        Member member = new Member("userId1", "password1");

        System.out.println(member);
    }
}
