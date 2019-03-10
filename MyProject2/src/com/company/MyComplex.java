package com.company;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void serValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        boolean a = true;
        if (real == 0) {
            a = false;
        }
        return a;
    }

    public boolean isImaginary() {
        boolean a = true;
        if (imag == 0) {
            a = false;
        }
        return a;
    }

    public boolean equals(double real, double imag) {
        boolean a = false;
        if (this.real == real && this.imag == imag)
            a = true;
        return a;

    }

    public boolean equals(MyComplex comp) {
        boolean a = false;
        if (this.real == comp.getReal() && this.imag == comp.getImag())
            a = true;
        return a;

    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real = +right.getReal();
        this.imag = +right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real+right.getReal(),this.imag+right.getImag());
    }

    public MyComplex subtarct(MyComplex right) {
        this.real = this.real - right.getReal();
        this.imag = this.imag - right.getImag();
        return this;
    }

    public MyComplex subtarctNew(MyComplex right) {
        return new MyComplex(this.real-right.getReal(),this.imag-right.getImag());

    }

    public MyComplex multoply(MyComplex right) {
        this.real=real*right.getReal()-(imag*right.getImag());
        this.imag=real*right.getImag()+imag*right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        real=(real*right.getReal()+imag*right.getImag())/(right.getReal()*right.getReal()+right.getImag()*right.getImag());
        imag=(imag*right.getReal()-real*right.getImag())/(right.getReal()*right.getReal()+right.getImag()*right.getImag());
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real,-imag);
    }

}
