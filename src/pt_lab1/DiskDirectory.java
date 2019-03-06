/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Vuks
 */
public class DiskDirectory extends DiskElement {
    Set<DiskElement> children;
    
    public DiskDirectory(String path) {
        children = new HashSet<>();
        file = new File(path);
    }
    
    protected void print(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        
        System.out.println(file.getName());
        
        children.forEach((x) -> {
            x.print(depth + 1);
        });
    };
}
