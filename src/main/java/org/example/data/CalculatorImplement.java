package org.example.data;

public class CalculatorImplement implements CalculatorRepository {
    @Override
    public float enterNumber1() {
        return 0;
    }

    @Override
    public float enterNumber2() {
        return 0;
    }

    @Override
    public float addNum(float a, float b) {
        return a+b;
    }

    @Override
    public float mulNum(float a, float b) {
        return a*b;
    }

    @Override
    public float subNum(float a, float b) {
        return a-b;
    }

    @Override
    public float divNum(float a, float b) {
        return a/b;
    }
}
