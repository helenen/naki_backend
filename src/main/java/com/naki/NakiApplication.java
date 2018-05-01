package com.naki;

import com.naki.Exercice.Exercice;
import com.naki.Cours.Cours;
import com.naki.Lesson.Lesson;
import com.naki.Lesson.LessonRepository;
import com.naki.Lesson.LessonService;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.naki.Level.Level;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.context.Theme;

@SpringBootApplication
@ComponentScan(basePackageClasses = Level.class)
@ComponentScan(basePackageClasses = Theme.class)
@ComponentScan(basePackageClasses = Cours.class)
@ComponentScan(basePackageClasses = Lesson.class)
@ComponentScan(basePackageClasses = Exercice.class)
@ComponentScan(basePackageClasses = LessonService.class)
@ComponentScan(basePackageClasses =LessonRepository.class)


public class NakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakiApplication.class, args);
	}
}
