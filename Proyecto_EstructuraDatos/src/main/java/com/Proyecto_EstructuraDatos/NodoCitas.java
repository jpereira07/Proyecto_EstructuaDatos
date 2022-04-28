package com.Proyecto_EstructuraDatos;

/**
 *
 * @author jose
 */
public class NodoCitas {
    
    private NodoCitas next;
    private int value;

    public NodoCitas() {
        this.next = null;
        this.value = 0;
    }

    public NodoCitas getNext() {
        return next;
    }

    public void setNext(NodoCitas next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
     
    
    
    
    
}
