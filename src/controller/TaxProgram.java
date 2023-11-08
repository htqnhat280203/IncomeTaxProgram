/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.TaxRepository;
import view.Menu;


/**
 *
 * @author DiepTCNN
 */
public class TaxProgram extends Menu<String>{
    static String[] mc = {"Income Tax Calculator", "Exit"};
    TaxRepository program;

    public TaxProgram() {
        super("\tINCOME TAX", mc);
        program = new TaxRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.addFamily();
                break;
            case 2:
                System.exit(0);
        }
    }
}
