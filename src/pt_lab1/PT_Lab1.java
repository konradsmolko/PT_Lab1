/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_lab1;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Vuks
 */
public class PT_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String path;
        File rootFile;
        System.out.println("Enter a valid path to a directory:");
        
        while(true) {
            path = reader.nextLine();
            rootFile = new File(path);
            if(rootFile.exists() && rootFile.isDirectory())
                break;
            else
                System.out.println("Invalid path. Try again.");
        }
        
        DiskDirectory root = new DiskDirectory(rootFile);
        
        //root.print();
        root.swap();
        root.print();
    }
    
}
