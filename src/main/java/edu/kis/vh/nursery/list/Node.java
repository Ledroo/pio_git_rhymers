package edu.kis.vh.nursery.list;

/**
 * Klasa Node reprezentuje jeden element w liście dwukierunkowej
 * Każdy element przechowuje wartość całkowitą oraz wskazuje na poprzedni i następny element listy
 */
public class Node
{
    /**
     * Wartość, którą przechowujemy w węźle
     */
    private final int value;

    /**
     * Odniesienie do poprzedniego węzła
     */
    private Node prev;
    /**
     * Odniesienie do następnego węzła
     */
    private Node next;

    /**
     * Konstruktor tworzy nowy węzeł i ustawia jego wartość
     * * @param i
     */
    public Node(int i) {
        value = i;
    }

    /**
     * getValue zwraca wartość zapisaną w tym węźle
     * @return value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * getPrev zwraca wskaźnik na poprzedni węzeł
     * @return prev
     */
    public Node getPrev()
    {
        return prev;
    }

    /**
     * setPrev ustawia poprzedni węzeł
     * * @param prev
     */

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    /**
     * getNext zwraca wskaźnik na następny węzeł
     * @return next
     */
    public Node getNext()
    {
        return next;
    }

    /**
     * setNext ustawia następny węzeł
     * @param next
     */
    public void setNext(Node next)
    {
        this.next = next;
    }
}
