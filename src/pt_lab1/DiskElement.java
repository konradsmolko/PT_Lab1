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
    
    protected abstract void print(int depth);
    
    public void print() { print(0); };
    
    
}
