package com.example;

public class SaldoInsufficienteException extends Exception{
    public SaldoInsufficienteException(String messaggio) {
        super(messaggio);
    }
}
