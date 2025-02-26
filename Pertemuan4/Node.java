package Pertemuan4;

public class Node {
    private double data; // Ubah tipe data menjadi double
    private Node next;
    
    // Inisialisasi atribut node
    public Node(double data) { // Ubah parameter menjadi double
        this.data = data;
    }

    public double getData() { // Ubah tipe return menjadi double
        return data;
    }

    public void setData(double data) { // Ubah parameter menjadi double
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}