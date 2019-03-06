/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

/**
 *
 * @author Vuks
 */
public class DiskFile extends DiskElement {
    protected void print(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        
        System.out.println(file.getName());
    }
}
