package org.example;

import org.springframework.stereotype.Component;

@Component
public class car implements vehicle {
    public void drive(){
        System.out.println("i can drive car ");
    }
}
