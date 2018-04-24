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
public class SLSEGLinkedList implements LinkedList{
    public Node head;
    public SLSEGLinkedList(){
        head = null;
    }
    public void addAtStart(int v){
        Node n = new Node(v);
        if(head == null){
            head = n;
        }else{
            n.next = head;
            head = n;
        }
    }
    public void remove(){
        if(!empty()){
            head = head.next;
        }
    }
    public void remove(int v){
        Node n = head, l = head;
        while(n != null){
            if(n.value == v){
                break;
            }
            l = n;
            n = n.next;
            
        }
        if(n != null){
            l.next = n.next;
            if(n == head)
                head = l.next;
        }
    }
    public boolean empty(){
        return head == null;
    }
    public void display(){
        Node n = head;
        while(n != null){
            System.out.print(n.value + ", ");
            n = n.next;
        }
        System.out.println();
    }
}
