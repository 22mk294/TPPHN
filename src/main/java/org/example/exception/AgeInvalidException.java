package org.example.exception;

public class AgeInvalidException extends Exception {
     public AgeInvalidException(int age) {
         super("Age invalid: " + age);
     }
}
