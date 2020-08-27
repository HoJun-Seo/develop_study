package thymeleaf_JPA_Mysql.develop_study.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"userNo", "itemId"})
public class UserItem {

    private int userNo;
    private int itemId;

    private String itemName;
    private Integer price;
    private String description;
}
