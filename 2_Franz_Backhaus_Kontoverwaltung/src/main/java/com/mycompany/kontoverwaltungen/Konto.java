package com.mycompany.kontoverwaltungen;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Konto extends AbstractListModel{
    
    private ArrayList<KontoBenutzer> list;
    private int kontostand;
    private int waitingThreads;
    private JLabel moneyLabel;
    private JTextArea actions;

    public Konto(JLabel money, JTextArea actions) {
        list = new ArrayList<>();
        this.moneyLabel = money;
        this.actions = actions;
        this.waitingThreads = 0;
    }
    
    
    

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
