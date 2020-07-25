package {{cookiecutter.package}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.main_app_class}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.main_app_class}}Application.class, args);
	}

}
