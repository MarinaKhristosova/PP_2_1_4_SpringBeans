package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Timer {


    private Long nanoTime = System.nanoTime();

    @Autowired
    @Qualifier ("animalCage")
    public Long getTime() {
        return nanoTime;
    }
}
