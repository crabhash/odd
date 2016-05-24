/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.project;

/**
 *
 * @author Abhash
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p = 0, c = 0;

        for (int i = 2; i <= 2; i++) {
            for (int j = 1; j <= 10; j=j+4) {
                if (j % 2 != 0) {
                    p = (i * j);
                    c += p;
                }
                
            }
            
        }
    System.out.println(c);
    }
    
}
