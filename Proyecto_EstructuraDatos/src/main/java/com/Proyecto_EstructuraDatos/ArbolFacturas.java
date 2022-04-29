package com.Proyecto_EstructuraDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ArbolFacturas {

    private NodoArbol raiz;
    private int cantidadFacturas;

    public void insertaFactura(int value) {
        if (raiz == null) {
            raiz = new NodoArbol(value);
        } else {
            insertarFactura(raiz, value);
        }
    }

    public void insertarFactura(NodoArbol nodo, int value) {

        if (value < nodo.getNumFactura()) {
            if (nodo.getHijoIzq() == null) {
                nodo.setHijoIzq(new NodoArbol(value));
            } else {
                insertarFactura(nodo.getHijoIzq(), value);
            }
        } else {
            if (nodo.getHijoDer() == null) {
                nodo.setHijoDer(new NodoArbol(value));
            } else {
                insertarFactura(nodo.getHijoDer(), value);
            }
        }
    }

    //imprimir arbol
    public void imprimir() {
        if (raiz != null) {
            imprimirFactura(raiz);
        } else {
            JOptionPane.showMessageDialog(null, "No hay facturas");
        }

    }

    private void imprimirFactura(NodoArbol nodo) {

        if (nodo != null) {
            imprimirFactura(nodo.getHijoIzq());
            JOptionPane.showMessageDialog(null, "Numero de factura: " + nodo.getNumFactura());
            imprimirFactura(nodo.getHijoDer());
        }
    }

    //imprimir cantidad de facturas
    private void cantidadFactura(NodoArbol nodo, int nivel) {
        if (nodo != null) {
            cantidadFactura(nodo.getHijoIzq(), nivel + 1);
            if (nivel > cantidadFacturas) {
                cantidadFacturas = nivel;
            }
            cantidadFactura(nodo.getHijoDer(), nivel + 1);
        }

    }

    public int cantidadFactura() {
        cantidadFacturas = 1;
        cantidadFactura(raiz, 2);
        JOptionPane.showMessageDialog(null, "Cantidad de facturas: " + cantidadFacturas);
        return cantidadFacturas;

    }

    public void findFactura(int num) {
        if (raiz == null) {
            JOptionPane.showMessageDialog(null,"No hay facturas");
        } else {
            insertarFactura(raiz, num);
        }
    }

    private void findFactura(NodoArbol nodo, int num) {
 
        if (raiz.getNumFactura() == num) {
            JOptionPane.showMessageDialog(null,"Si existe");
        } 
        else if (raiz.getNumFactura() < num) {
            findFactura(raiz.getHijoDer(), num);
        } 
        else if (raiz.getNumFactura() > num) {
            findFactura(raiz.getHijoIzq(), num);
        }

    }

}
