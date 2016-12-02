package cc.unmi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("\n1:--------------------------------------------------------");
		new SpringApplicationBuilder(DemoApplication.class).profiles("String").build().run(args).close();

		System.out.println("\n2:--------------------------------------------------------");
		new SpringApplicationBuilder(DemoApplication.class).profiles("Number").build().run(args).close();

		try {
			System.out.println("\n3:--------------------------------------------------------");
			new SpringApplicationBuilder(DemoApplication.class).profiles("Both").build().run(args).close();
		} catch (Exception ex) {

			System.out.println("\n4:--------------------------------------------------------");
			new SpringApplicationBuilder(DemoApplication.class).profiles("None").build().run(args).close();
		}
	}
}
