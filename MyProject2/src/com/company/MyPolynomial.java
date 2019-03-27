package com.company;

import java.lang.reflect.Array;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double[] getCoeffs() {
        return coeffs;
    }


    public double evalute(double x) {
        double a = 0;
        for (int i = coeffs.length - 1; i > 0; i--) {
            a = a + Math.pow(x, i) * coeffs[i];
        }
        a = a + coeffs[0];
        return a;
    }

    @Override
    public String toString() {
        String a = "";
        for (int i = coeffs.length - 1; i > 0; i--) {
            a = a + coeffs[i] + "x^" + i + " + ";
        }
        a = a + coeffs[0];
        return a;
    }

    public MyPolynomial add(MyPolynomial right) {
        int count, max;
        double[] coeffs2 = right.getCoeffs();

        int i;

        if (coeffs.length < coeffs2.length) {
            count = coeffs.length;
            max = coeffs2.length;
            i = 2;
        } else {
            count = coeffs2.length;
            max = coeffs.length;
            i = 1;
        }
        double[] coeffs3 = new double[max];
        for (int j = 0; j < count; j++) {
            coeffs3[j] = coeffs2[j] + coeffs[j];
        }
        if (i == 1)
            for (int j = count; j < max; j++) {
                coeffs3[j] = coeffs[j];
            }
        if (i == 2)
            for (int j = count; j < max; j++) {
                coeffs3[j] = coeffs2[j];
            }
        return new MyPolynomial(coeffs3);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] coeffs2 = right.getCoeffs();
        double[] coeffs3 = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < coeffs2.length; j++)
                coeffs3[i + j] = coeffs3[i + j] + coeffs[i] * coeffs2[j];
        }
        return new MyPolynomial(coeffs3);
    }

    @Override
    public int hashCode() {
        int result = 17;
        for (int i = 0; i < coeffs.length; i++) {
            result =31 * result + (int) (Double.doubleToLongBits(coeffs[i]) ^ (Double.doubleToLongBits(coeffs[i]) >>> 32));
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj.getClass()!= this.getClass()) return false;
        MyPolynomial pol=(MyPolynomial) obj;
        double[] arr=pol.getCoeffs();
        boolean flag=true;
        for (int i=0;i<coeffs.length;i++)
            if(coeffs[i]!=arr[i])
                flag=false;

        return flag;
    }
}
