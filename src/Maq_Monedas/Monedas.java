/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maq_Monedas;

import java.io.Serializable;

/**
 *
 * @author JoeL
 */
public class Monedas implements Serializable
{
    int valorMoneda;
    int stock;

    public Monedas()
    {
        this (0,0);
    }
    public Monedas(int valorMoneda, int stock) 
    {
        this.valorMoneda = valorMoneda;
        this.stock = stock;
    }

    public int getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(int valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
    
    
}
