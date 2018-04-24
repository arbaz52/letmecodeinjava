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
public class DNode {
    public DNode next;
    public DNode prev;
    public int value;
    public DNode(int v){
        value = v;
    }
}
