/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.example.onlinebook;

public class OnlineBook {

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Welcome wc = new Welcome();
            wc.setLocationRelativeTo(null); // Center the JFrame on the screen
            wc.setVisible(true);
        }
    });
}
}
