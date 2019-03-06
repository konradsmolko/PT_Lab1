/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

import java.io.File;
/**
 *
 * @author Vuks
 */
public abstract class DiskElement {
    protected File file;
    
    public DiskElement() { file = new File(""); }
    public DiskElement(File x) { file = x; }
    public DiskElement(String path) { file = new File(path); }
    
    protected void print(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        
        System.out.println(file.getName());
    }
    
    public void print() { print(0); }
    
    
}
