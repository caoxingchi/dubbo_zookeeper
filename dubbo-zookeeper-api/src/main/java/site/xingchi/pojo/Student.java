package site.xingchi.pojo;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Student {

    private BigInteger id;

    private String name;

    private Integer sex;

    private Integer age;
}
