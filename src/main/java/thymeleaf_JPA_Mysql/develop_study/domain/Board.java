package thymeleaf_JPA_Mysql.develop_study.domain;


import lombok.*;

import java.util.Date;

@Data // @ToString, @Getter, @Setter, @EqualsAndHashCode, @RequriedArgsConstructor 어노테이션을 합쳐놓은 어노테이션
//개별 어노테이션의 설정 값을 기본값으로 설정하게 되므로, 기본값이 아닌 값을 사용해야 할 때는 개별 어노테이션을 사용해야 한다.
@NoArgsConstructor // 본래 해당 어노테이션을 선언해주지 않아도 디폴트 생성자가 자동으로 생성되나,
// AllArgsConstructor 또는 RequiredArgsConstructor 에 의해 인자가 있는 생성자가 만들어지면 자동으로 디폴트 생성자가 만들어지지 않기 때문에
// NoArgsConstructor 어노테이션을 함께 선언해주어야 한다.
@RequiredArgsConstructor // @NonNull 이 적용된 필드값이나 final 로 선언된 필드 값만 인자로 받는 생성자를 생성한다.
// 생성자의 인자로 사용할 필드를 @NonNull 로 지정하고 @RequriedArgsConstructor 를 적용한다.
@AllArgsConstructor // 객체의 모든 필드 값을 인자로 받는 생성자를 생성한다.
//@Getter
//@Setter
//@EqualsAndHashCode(of = "boardNo") // 자바의 equals 메서드와  hashCode() 메서드를 생성한다.
//@ToString
//@Builder // @NoArgsConstructor 어노테이션을 적용하지 않아도 기본적으로 인자가 없는 생성자를 생성한다.
public class Board{

    @NonNull
    private int boardNo;

    private String title;
    private String content;
    private String writer;
    private Date regDate;

    // @RequriedArgsConstructor 에 의해 아래와 같은 생성자가 추가된다.
    /*public Board(int boardNo){
        super();
        this.boardNo = boardNo;
    }*/


}
