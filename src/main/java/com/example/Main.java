package com.example;

public class Main {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Mario Rossi", 100.0);
        System.out.println("Saldo iniziale: " + conto.getSaldo());

        try{
            conto.prelievo(150.0);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try{
            conto.deposito(50.0);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } System.out.println("Deposito riuscito. Saldo attuale: " + conto.getSaldo());
    }
}