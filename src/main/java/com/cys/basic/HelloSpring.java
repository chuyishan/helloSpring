package com.cys.basic;

/**
 * @author Alex
 * @date 2023/07/23
 */
public class HelloSpring {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}