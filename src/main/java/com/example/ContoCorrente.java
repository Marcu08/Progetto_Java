package com.example;
public class ContoCorrente {
    private Double saldo;
    private String titolare;

    public ContoCorrente(String titolare, Double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Il saldo iniziale non può essere negativo");
        }

        this.titolare = titolare;
        this.saldo = saldo;
    }
    public void deposito(double importo){
        if(importo<=0){
            throw new IllegalArgumentException("Il saldo iniziale non può essere negativo");
        }
        else{
            this.saldo += importo;
        }
    }
    public void prelievo (double importo) throws SaldoInsufficienteException {
        if(importo<=0){
            throw new IllegalArgumentException("Il saldo iniziale non può essere negativo");
        }
        else if(importo > saldo){
            throw new SaldoInsufficienteException("Saldo non sufficiente per il prelievo")
        }
        else
            saldo -=importo;
    }
    public double getSaldo(){
        return saldo;
    }


}
