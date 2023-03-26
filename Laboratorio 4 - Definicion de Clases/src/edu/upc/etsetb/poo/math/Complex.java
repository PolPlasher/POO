/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.math;

import java.util.Scanner;

/**
 *
 * @author pol.lleida
 */
public class Complex {

    double real;
    double imaginary;

    public Complex(double r, double im) {
        this.real = r;
        this.imaginary = im;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getIm() {
        return this.imaginary;
    }

    public void setReal(double r) {
        this.real = r;
    }

    public void setIm(double im) {
        this.imaginary = im;
    }

    public Complex add(Complex c) {
        Complex complex = new Complex(this);
        complex.real += c.real;
        complex.imaginary += c.imaginary;
        return complex;
    }

    public Complex resta(Complex c) {
        Complex complex = new Complex(this);
        complex.real -= c.real;
        complex.imaginary -= c.imaginary;
        return complex;
    }

    public Complex mult(Complex c) {
        Complex complex = new Complex(this);
        complex.real *= c.real;
        complex.imaginary *= c.imaginary;
        return complex;
    }

    public Complex divide(Complex c) {
        Complex complex = new Complex(this);
        complex.real /= c.real;
        complex.imaginary /= c.imaginary;
        return complex;
    }

    public String toString() {
        String operador;
        if (this.imaginary >= 0) {
            operador = " + ";
        } else {
            operador = " ";
        }
        String string = this.real + operador + this.imaginary + "j";
        return string;
    }

    public double getModulo() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    public double getFase() {
        return Math.atan(this.imaginary / this.real);
    }

    public static void main(String[] args) {
        boolean exit = false;
        do {
            Scanner scanner = new Scanner(System.in);
            Complex complex1 = new Complex(0, 0);
            Complex complex2 = new Complex(0, 0);
            Complex resultado = new Complex(0, 0);
            System.out.print("Introduzca la operacion y los numeros complejos (f o F para salir): ");
            String string = scanner.nextLine();
            String[] splitString = string.split(" ");
            if ("f".equals(string) || "F".equals(string)) {
                exit = true;
                System.out.println("Programa detenido");
            }

            complex1.asignarComplex(splitString, complex1, complex2);
            resultado.operarComplex(splitString[0].charAt(0), complex1, complex2);
            if (!exit) {
                System.out.println("Resultado = " + resultado.real + ", " + resultado.imaginary);
            }
        } while (!exit);

    }

    //  Métodos propios
    public void asignarComplex(String[] args, Complex c1, Complex c2) {
        for (int i = 1; i < args.length; i++) {
            args[i] = args[i].substring(1, args[i].length() - 1);
            String[] complejo = args[i].split(",");
            if (i == 1) {
                c1.real = Double.parseDouble(complejo[0]);
                c1.imaginary = Double.parseDouble(complejo[1]);
            } else {
                c2.real = Double.parseDouble(complejo[0]);
                c2.imaginary = Double.parseDouble(complejo[1]);
            }
        }
    }

    public void operarComplex(char operando, Complex c1, Complex c2) {
        switch (operando) {
            case '+':
                this.real = c1.add(c2).real;
                this.imaginary = c1.add(c2).imaginary;
                break;
            case '-':
                this.real = c1.resta(c2).real;
                this.imaginary = c1.resta(c2).imaginary;
                break;
            case '*':
                this.real = c1.mult(c2).real;
                this.imaginary = c1.mult(c2).imaginary;
                break;
            case '/':
                this.real = c1.divide(c2).real;
                this.imaginary = c1.divide(c2).imaginary;
                break;
        }
    }
}
