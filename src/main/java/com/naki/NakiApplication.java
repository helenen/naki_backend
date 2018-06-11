package com.naki;

import com.naki.Exercise.Exercise;
import com.naki.Cours.Cours;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.naki.Level.Level;
import org.springframework.ui.context.Theme;

@SpringBootApplication
@ComponentScan(basePackageClasses = Level.class)
@ComponentScan(basePackageClasses = Theme.class)
@ComponentScan(basePackageClasses = Cours.class)
@ComponentScan(basePackageClasses = Exercise.class)



public class NakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakiApplication.class, args);
	}
}
