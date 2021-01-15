package springAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 曾睿
 * @Date: 2020/9/29 20:17
 */
@Configuration
public class Client {
    @Bean
    public Driver driver() {
        Driver driver = new Driver();
        driver.setId(1);
        driver.setName("driver");
        driver.setCar(car());
        return driver;
    }
    @Bean(name = "cccc")
    public Car car() {
        Car car = new Car();
        car.setId(1);
        car.setName("car");
        return car;
    }
}

class TestMain {

    public static void main(String[] args) {
        // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(Client.class);

        // 获取bean
        Driver driver = (Driver) context.getBean("driver");

        // 获取bean
        Car car = (Car) context.getBean("cccc");

        boolean result = driver.getCar() == car;
        System.out.println(result ? "同一个car" : "不同的car");

    }

}
