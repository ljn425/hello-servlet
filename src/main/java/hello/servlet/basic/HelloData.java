package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class HelloData {
    private String username;
    private int age;
}
