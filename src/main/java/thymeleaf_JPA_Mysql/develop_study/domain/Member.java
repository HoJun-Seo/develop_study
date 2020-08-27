package thymeleaf_JPA_Mysql.develop_study.domain;

import lombok.*;

@RequiredArgsConstructor
@ToString(exclude = "userName")
public class Member {

    private final String userId;
    private final String password;
    private String userName;
}
