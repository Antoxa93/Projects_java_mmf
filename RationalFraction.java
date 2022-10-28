package com.fraction;
public class RationalFraction extends Number {
    private int m;
    private int n;
    public RationalFraction(int m, int n){
        this.m = m;
        this.n = n;
    }

    public  RationalFraction add(RationalFraction other){
        return new RationalFraction(this.m * other.n + this.n * other.m, this.n * other.n);
    }

    public  RationalFraction sub(RationalFraction other){
        return new RationalFraction(this.m * other.n - this.n * other.m, this.n * other.n);
    }

    public  RationalFraction mul(RationalFraction other){
        return new RationalFraction(this.m * other.m, this.n * other.n);
    }

    public  RationalFraction div(RationalFraction other){
        return new RationalFraction(this.m * other.n, this.n * other.m);
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                m +
                "/" + n +
                '}';
    }

    @Override
    public int intValue() {
        return (int)m/n;
    }

    @Override
    public long longValue() {
        return (long)m/n;
    }

    @Override
    public float floatValue() {
        return (float)m/n;
    }

    @Override
    public double doubleValue() {
        return (double)m/n;
    }
}
