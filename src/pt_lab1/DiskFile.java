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
public final class DiskFile extends DiskElement {
    //public DiskFile() { super(); what = 'P'; }
    public DiskFile(File x) { super(x); what = 'P'; }
    public DiskFile(String path) { super(path); what = 'P'; }

    @Override
    public int compareTo(DiskElement o) {
        if(o instanceof DiskDirectory) {
            return -1;
        } else {
            return (int) (this.file.length() - o.file.length());
        }
    }

    @Override
    public void swap() {
        
    }
}
