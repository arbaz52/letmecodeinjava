/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letmecodeinjava;

/**
 *
 * @author doom
 * singly linked double ended grounded
 */
public class SLDEGLinkedList implements LinkedList{
    public Node head;
    public Node tail;
    public SLDEGLinkedList(){
        head = null; tail = null;
    }

    public void addAtStart(int v) {
        Node n = new Node(v);
        if(empty()){
            head = n;
            tail = n;
        }else{
            n.next = head;
            head = n;
        }
    }

    public boolean empty() {
        return head == null;
    }

    public void remove() {
        if(!empty()){
            if(head == tail){
                head = null; tail = null;
            }else{
                head = head.next;
            }
        }
        
    }

    public void remove(int v) {
        if(!empty()){
            Node n = head, l = head;
            while(n != null){
                if(n.value == v)
                    break;
                l = n;
                n = n.next;
            }
            if(n != null){
                if(n == head)
                    remove();
                else if(n == tail){
                    tail = l;
                    tail.next = null;
                }else {
                    l.next = n.next;
                }
                    
            }
        }
    }

    public void display() {
        Node n = head;
        System.out.println("--------------------");
        while(n != null){
            System.out.println(n +", "+ n.value + ", " + n.next);
            n = n.next;
        }
        System.out.println();
    }
    
}
