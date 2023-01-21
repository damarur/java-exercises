package org.example.exercises.intermediate;

public class Inheritance {

    static class A {
        String s = "This is A";

        String getValue() {
            return s;
        }
    }

    static class B extends A {
        String s = "This is B";

        String getValue() {
            return s;
        }
    }

    public static void main(String[] args) {
        A a = new B();
        // TODO what is the result?
        System.out.println("Result -> " + a.getValue());
    }
}
