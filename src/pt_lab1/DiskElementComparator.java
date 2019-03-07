/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

import java.util.Comparator;

/**
 *
 * @author Vuks
 */
public class DiskElementComparator implements Comparator<DiskElement> {

    @Override
    public int compare(DiskElement o1, DiskElement o2) {
        if (o1 instanceof DiskDirectory && o2 instanceof DiskFile) {
            return -1;
        } else if (o1 instanceof DiskFile && o2 instanceof DiskDirectory) {
            return 1;
        }
        int ret = o1.file.getName().length() - o2.file.getName().length();
        if(ret != 0)
            return ret;
        else return o1.file.getName().compareTo(o2.file.getName());
    }
    
}
