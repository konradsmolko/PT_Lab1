/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
/**
 *
 * @author Vuks
 */
public abstract class DiskElement implements Comparable<DiskElement> {
    protected File file;
    protected char what;
    
    static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");// HH:mm:ss");
    
    //public DiskElement() { file = new File(""); } // ten konstr. nie ma sensu
    public DiskElement(File x) { file = x; }
    public DiskElement(String path) { file = new File(path); }
    
    protected void print(int depth) {
        String dep = "";
        for(int i = 0; i < depth; i++) {
            dep += ("-");
        }
        Date lastEdit = new Date(file.lastModified());
        String prnt = String.format("%s%-40s %c %s %d", dep, file.getName(),
                what, dateFormat.format(lastEdit), file.length());
        System.out.println(prnt);
    }
    
    public void print() { print(0); }
    public abstract void swap();
    
    @Override
    public abstract int compareTo(DiskElement o);
    
    
}
