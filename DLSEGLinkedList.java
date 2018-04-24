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
public class DLSEGLinkedList implements LinkedList{
    public DNode head;
    public DLSEGLinkedList(){
        head = null;
    }
    public void addAtStart(int v) {
        DNode n = new DNode(v);
        if(head == null){
            head = n;
        }else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public boolean empty() {
        return head == null;
    }

    public void remove() {
        if(!empty()){
            head = head.next;
            if(head != null)
                head.prev = null;
        }
    }

    public void remove(int v) {
        DNode n = head;
        while(n != null){
            if(n.value == v)
                break;
            n = n.next;
        }
        if(n != null){
            if(n == head){
                remove();
            }else{
               if(n.prev != null)
                   n.prev.next = n.next;
               if(n.next != null)
                   n.next.prev = n.prev;
            }
        }
    }

    public void display() {
        DNode n = head;
        System.out.println("---------------------------");
        while(n != null){
            System.out.println(n.value + ", " + n.prev+", "+n+", "+n.next);
            n = n.next;
        }
        System.out.println();
    }
    
}
