/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author USER
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //velues going into the calculator//
        int value1 = 15;
        int value2 = 5;
        char operand = 'y';
        //end of values going into the calculator
        equalsTo eqn1;
        eqn1 = new equalsTo();
        System.out.println(eqn1.getValues(value1, value2, operand));
        
    }
    
}
