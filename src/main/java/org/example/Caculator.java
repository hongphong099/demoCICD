package org.example;

public class Caculator implements Icaculator {

    @Override
    public Integer sum(Integer a, Integer b) {
        return a/b; 
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return 0; 
    }
}
