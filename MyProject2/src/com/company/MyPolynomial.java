package com.company;

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
        if(i==2)
            for (int j = count; j < max; j++) {
                coeffs3[j] = coeffs2[j];
            }
            return new MyPolynomial(coeffs3);
    }
     public MyPolynomial multiply(MyPolynomial right){
        double[] coeffs2=right.getCoeffs();
        double[] coeffs3=new double[this.getDegree()+right.getDegree()+1];
        for(int i=0;i<coeffs.length;i++){
            for (int j=0;j<coeffs2.length;j++)
                coeffs3[i+j]=coeffs3[i+j]+coeffs[i]*coeffs2[j];
        }
        return  new MyPolynomial(coeffs3);
     }

}
