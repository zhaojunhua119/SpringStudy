import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

public class MyAppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		//Bean1 b1 = (Bean1) context.getBean("Bean1");
		Bean2 b2 = context.getBean(Bean2.class);
		b2.getProp1();
		
	}


}
@Configuration
class ConfigClass {
	@Bean
	@Lazy
	public Bean1 createBean1() {
		return new Bean1();
	}
	@Bean
	@Lazy
	public Bean2 createBean2() {
		int i = 0;
		i = i / i;
		return new Bean2();
	}
	
}

class Bean1 {
	public int prop1;
	public int getProp1() {
		return prop1;
	}
	public void setProp1(int prop1) {
		this.prop1 = prop1;
	}
	public int getProp2() {
		return prop2;
	}
	public void setProp2(int prop2) {
		this.prop2 = prop2;
	}
	public int prop2;
}
class Bean2 {
	public int prop1;
	public int getProp1() {
		return prop1;
	}
	public void setProp1(int prop1) {
		this.prop1 = prop1;
	}
	public int getProp2() {
		return prop2;
	}
	public void setProp2(int prop2) {
		this.prop2 = prop2;
	}
	public int prop2;
}