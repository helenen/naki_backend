package com.naki;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.naki.Level.Level;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.ui.context.Theme;

@SpringBootApplication
@ComponentScan(basePackageClasses = Level.class)
@ComponentScan(basePackageClasses = Theme.class)
public class NakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakiApplication.class, args);
	}
}
