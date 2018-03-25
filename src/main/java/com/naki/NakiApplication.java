package com.naki;

import com.naki.Asset.Asset;
import com.naki.Asset.AssetRepository;
import com.naki.Cours.Cours;
import com.naki.Exercice.Exercice;
import com.naki.Lesson.Lesson;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.naki.Level.Level;
import org.springframework.ui.context.Theme;

@SpringBootApplication
@ComponentScan(basePackageClasses = Level.class)
@ComponentScan(basePackageClasses = Theme.class)
@ComponentScan(basePackageClasses = Cours.class)
@ComponentScan(basePackageClasses = Lesson.class)
@ComponentScan(basePackageClasses = Exercice.class)
@ComponentScan(basePackageClasses = Asset.class)
@ComponentScan(basePackageClasses = AssetRepository.class)

public class NakiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakiApplication.class, args);
	}
}
