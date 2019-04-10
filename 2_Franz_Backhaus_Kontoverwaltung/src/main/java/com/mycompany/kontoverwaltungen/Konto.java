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
        this.moneyLabel = money;
        this.actions = actions;
    }
    
    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    
    }

    public void add(KontoBenutzer kontoBenutzer) {
        list.add(kontoBenutzer);
        this.fireContentsChanged(this, 0, list.size());
    }

}
