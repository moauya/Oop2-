/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_facade;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Facade {

    Scanner read = new Scanner(System.in);

    private Subsystem1 subsys1 = new Subsystem1();
    private Subsystem2 subsys2 = new Subsystem2();

    public void operate() {
        System.out.println("Face is coordinatin the subsystem");
        subsys1.Operation1();
        subsys2.Operation2();
    }
}
