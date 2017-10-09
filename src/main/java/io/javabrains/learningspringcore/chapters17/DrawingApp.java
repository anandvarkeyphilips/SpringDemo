package io.javabrains.learningspringcore.chapters17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapters17/spring.xml")) {

			/*Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();

			Circle circle = (Circle) context.getBean("circle");
			circle.draw();*/

			Shape shape = (Shape) context.getBean("circle");
			shape.draw();

		}
	}
}
