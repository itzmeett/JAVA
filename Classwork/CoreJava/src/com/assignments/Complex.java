package com.assignments;
import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex b) {
        return new Complex(this.real + b.real, this.imaginary + b.imaginary);
    }

    public Complex subtract(Complex b) {
        return new Complex(this.real - b.real, this.imaginary - b.imaginary);
    }

    public Complex multiply(Complex b) {
        double newReal = this.real * b.real - this.imaginary * b.imaginary;
        double newImaginary = this.real * b.imaginary + this.imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the real and imaginary parts of the first complex number: ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();

        System.out.print("Enter the real and imaginary parts of the second complex number: ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        scanner.close();
    }
}

