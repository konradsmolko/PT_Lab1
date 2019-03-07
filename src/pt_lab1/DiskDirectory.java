/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Vuks
 */
public final class DiskDirectory extends DiskElement {
    Set<DiskElement> children;
    
    public DiskDirectory() { super(); what = 'K'; }
    
    public DiskDirectory(String path) {
        super(path);
        what = 'K';
        children = new TreeSet<>();
        update();
    }
    
    public DiskDirectory(File x) {
        super(x);
        what = 'K';
        children = new TreeSet<>();
        update();
    }
    
    public void update() {
        children.clear();
        for(File x: file.listFiles()) {
            if(x.isDirectory())
                children.add(new DiskDirectory(x));
            else if(x.isFile())
                children.add(new DiskFile(x));
        }
    }
    
    @Override
    protected void print(int depth) {
        super.print(depth);
        
        children.forEach((x) -> {
            x.print(depth + 1);
        });
    };
}
