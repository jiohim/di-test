package pl.jiohim.ditest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.jiohim.ditest.controllers.ConstructorInjectedContorller;
import pl.jiohim.ditest.controllers.MyController;
import pl.jiohim.ditest.controllers.PropertyInjectedController;
import pl.jiohim.ditest.controllers.SetterBasedController;

@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =   SpringApplication.run(DiTestApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);


		System.out.println("-------------Property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("-------------Setter");

		SetterBasedController setterBasedController =
				(SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());


		System.out.println("-------------Constructor");

	ConstructorInjectedContorller constructorInjectedContorller =
			(ConstructorInjectedContorller) ctx.getBean("constructorInjectedContorller");
		System.out.println(constructorInjectedContorller.getGreeting());
}

}
