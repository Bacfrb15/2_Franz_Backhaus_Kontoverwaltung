/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kontoverwaltungen;

import java.util.Random;

/**
 *
 * @author franz
 */
public class KontoBenutzer implements Runnable{

    private String name;
    private Konto konto;

    public KontoBenutzer(String name ) {
        this.name = name;
    }
    
    @Override
    public void run() {
    
    }

    @Override
    public String toString() {
        return name;
    } 
}
