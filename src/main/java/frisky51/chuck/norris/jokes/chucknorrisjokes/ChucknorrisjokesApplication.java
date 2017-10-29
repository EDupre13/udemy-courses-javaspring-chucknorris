package frisky51.chuck.norris.jokes.chucknorrisjokes;

import frisky51.chuck.norris.jokes.chucknorrisjokes.examplebeans.FakeDataSourse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChucknorrisjokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisjokesApplication.class, args);
	}
}
