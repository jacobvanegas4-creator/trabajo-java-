package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria() {
        this("Sin titular", 0.0);
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial < 0) ? 0 : saldoInicial;
    }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else if (cantidad > this.saldo) {
            System.out.println("Error: Fondos insuficientes.");
        }
    }
}