package com.Proyecto_EstructuraDatos;

/**
 *
 * @author jose
 */
public class NodoArbol {

    private int NumFactura;
    private NodoArbol HijoIzq;
    private NodoArbol HijoDer;

    public NodoArbol(int NumFactura) {
        this.NumFactura = NumFactura;
    }

    public int getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(int NumFactura) {
        this.NumFactura = NumFactura;
    }

    public NodoArbol getHijoIzq() {
        return HijoIzq;
    }

    public void setHijoIzq(NodoArbol HijoIzq) {
        this.HijoIzq = HijoIzq;
    }

    public NodoArbol getHijoDer() {
        return HijoDer;
    }

    public void setHijoDer(NodoArbol HijoDer) {
        this.HijoDer = HijoDer;
    }

}
