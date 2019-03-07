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
    
    //public DiskDirectory() { super(); what = 'K'; }
    
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
    
    public void swap() {
        children.forEach((x) -> {
            x.swap();
        });
        DiskElementComparator comp = new DiskElementComparator();
        Set<DiskElement> tmp = new TreeSet<>(comp);
        tmp.addAll(children);
        children = tmp;
    }
    
    @Override
    protected void print(int depth) {
        super.print(depth);
        
        children.forEach((x) -> {
            x.print(depth + 1);
        });
    };

    @Override
    public int compareTo(DiskElement o) {
        if(o instanceof DiskFile) {
            return 1;
        } else if(o instanceof DiskDirectory) {
            return compareTo((DiskDirectory) o);
        }
        return 0;
    }
    
    public int compareTo(DiskDirectory o) {
        return this.children.size() - o.children.size();
    }
}
