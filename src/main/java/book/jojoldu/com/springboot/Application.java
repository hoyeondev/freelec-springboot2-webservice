package book.jojoldu.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 스프링부트의 자동 설정, 스프링 brean  읽기와 생성을 모두 자동으로 한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}