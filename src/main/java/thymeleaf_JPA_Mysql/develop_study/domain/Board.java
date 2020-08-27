package thymeleaf_JPA_Mysql.develop_study.domain;


import lombok.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "boardNo") // 자바의 equals 메서드와  hashCode() 메서드를 생성한다.
@ToString
public class Board{

    private int boardNo;
    @NonNull
    private String title;
    private String content;
    private String writer;

    private Date regDate;


}
