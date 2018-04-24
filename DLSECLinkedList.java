/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letmecodeinjava;

/**
 *
 * @author doom
 * doubly linked single ended circular
 */
public class DLSECLinkedList implements LinkedList{
    public DNode head;
    public DLSECLinkedList(){
        head = null;
    }

    public void addAtStart(int v) {
        DNode n = new DNode(v);
        if(empty()){
            head = n;
            head.prev = head;
            head.next = head;
        }else{
            //finding the last element
            DNode l = head;
            do{
                l = l.next;
            }while(l.next != head);
            n.next = head;
            head.prev = n;
            head = n;
            head.prev = l;
            l.next = head;
        }
    }

    public boolean empty() {
        return head == null;
    }

    public void remove() {
        if(!empty()){
            if(head.next == head)
                head = null;
            else{
                //finding the last element
                DNode l = head;
                do{
                    l = l.next;
                }while(l.next != head);
                head = head.next;
                head.prev = l;
                l.next = head;
            }
        }
    }

    public void remove(int v) {
        if(!empty()){
            //finding the element
            DNode n = head;
            boolean found = false;
            do{
                if(n.value == v){
                    found = true;
                    break;
                }
                n = n.next;
            }while(n != head);
            if(found){
                System.out.println("Found!");
                if(n == head)
                    remove();
                else{
                    if(n.prev != null)
                        n.prev.next = n.next;
                    if(n.next != null)
                        n.next.prev = n.prev;
                }
                    
            }
        }
    }

    public void display() {
        if(!empty()){
            DNode n = head;
            System.out.println("---------------------");
            do{
                System.out.println(n+", "+n.value+", "+n.prev +", "+n.next);
                n = n.next;
            }while(n != head);
            System.out.println();
        }
    }
}
