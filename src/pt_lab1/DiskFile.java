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
    public DiskFile() { super(); }
    public DiskFile(File x) { super(x); }
    public DiskFile(String path) { super(path); }
}
