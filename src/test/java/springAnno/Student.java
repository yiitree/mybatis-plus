package springAnno;

import org.springframework.context.annotation.Bean;

/**
 * @Author: 曾睿
 * @Date: 2020/9/29 20:10
 */
//@Component
public class Student {

    private String name;

    /**
     * 做使用在方法上
     * @return
     */
    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("zs");
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
