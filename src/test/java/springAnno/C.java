package springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: 曾睿
 * @Date: 2020/9/29 20:10
 */
@Component
public class C {

    @Autowired
    private Car car;

    public void g(){
        car.getId();
    }

}
