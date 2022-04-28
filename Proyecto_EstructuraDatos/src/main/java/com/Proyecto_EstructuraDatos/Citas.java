package com.Proyecto_EstructuraDatos;

import javax.swing.JOptionPane;

/**
 * *****COLAS***** Sacar citas por orden de llegada
 */
public class Citas {

    private NodoCitas head;
    private NodoCitas tail;

    public Citas() {
        head = null;
        tail = null;
    }

    //Agregar datos a la fila
    public void insertarCitas(int dato) {
        NodoCitas newNode = new NodoCitas();
        newNode.setValue(dato);
        newNode.setNext(null);
        if (head == null & tail == null) {
            head = newNode;
            tail = newNode;
        }
        else if (newNode == head || newNode == tail) {
            System.out.println("Ya se encuentra una cita a esa hora, favor ingresar una hora mayor.");
        }
        tail.setNext(newNode);
        tail = tail.getNext();
        //System.out.println("Se agrego una cita a las: " + tail.getValue());
        JOptionPane.showMessageDialog(null, "Se agrego una cita a las: "+tail.getValue());
    }

    //Verifica si esta llena
    public boolean isEmptyCitas() {
        boolean cola = false;
        if (head == null & tail == null) {
            cola = true;
            JOptionPane.showMessageDialog(null, "No hay citas el dia de hoy.");
        } else {
            JOptionPane.showMessageDialog(null, "Hay citas el dia de hoy.");
            cola = false;
        }
        return cola;
    }

    //Cuenta los elementos en la lista
    public void cuentaCitas() {
        int resultado = 0;
        NodoCitas nodo = this.head;
        if (head == null & tail == null) {
            JOptionPane.showMessageDialog(null, "No hay citas el dia de hoy.");
        }
        while (nodo != null) {
            resultado++;
            nodo = nodo.getNext();
        }
        JOptionPane.showMessageDialog(null, "El dia de hoy hay: "+resultado);
    }

    //Extraer datos
    public void deleteCita() {
        JOptionPane.showMessageDialog(null, "Se elimina la cita de las: "+head.getValue());
        head = head.getNext();
        JOptionPane.showMessageDialog(null, "La proxima cita es a las: "+head.getValue());
    }

    //imprimir lista de citas
    public void listaCitas() {
        NodoCitas nodo = this.head;
        if (head == null & tail == null) {
            JOptionPane.showMessageDialog(null, "No hay citas el dia de hoy.");
        }
        while (nodo != null) {
            JOptionPane.showMessageDialog(null, "Citas de hoy: "+nodo.getValue());
            nodo = nodo.getNext();
        }
    }
}
