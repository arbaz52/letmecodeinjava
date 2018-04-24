/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letmecodeinjava;

/**
 *
 * @author doom
 */
public class SLSECLinkedList implements LinkedList {
    public Node head;
    public SLSECLinkedList(){
        head = null;
    }
    public void addAtStart(int v){
        Node n = new Node(v);
        if(head == null){
            head = n;
            head.next = head; //making list circular
        }else{
            //first finding the last element and connecting its end to the head
            Node b = head;
            do{
                b = b.next;
            }while(b.next != head);
            n.next = head;
            head = n;
            b.next = head;
        }
    }
    public void display(){
        if(!empty()){
            Node n = head;
            System.out.println("---------------------");
            do{
                System.out.println(n+", "+n.value+", "+n.next);
                n = n.next;
            }while(n != head);
            System.out.println();
        }
    }
    public void remove(){
        if(!empty()){
            //first finding the last element and connecting its end to the head
            Node b = head;
            do{
                b = b.next;
            }while(b.next != head);
            head = head.next;
            b.next = head;
        }
    }
    public void remove(int v){
        if(!empty()){
            boolean found = false;
            Node n = head, l = head;
            do{
                if(n.value == v){
                    found = true;
                    break;
                }
                l = n;
                n = n.next;
            }while(n != head);
            if(found){
                if(n == head && n.next == head){
                    //when there's only one element, which means that there is no tail or the head is the tail
                    head = null;
                }else if(n == head){
                    remove();
                }else{
                    l.next = n.next;
                }
            }
        }
    }
    public boolean empty(){
        return head == null;
    }
}
