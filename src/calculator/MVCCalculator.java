/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import controller.CalculatorController;
import model.CalculatorModel;
import view.FrmCalculator;

/**
 *
 * @author EMA
 */
public class MVCCalculator {
    public static void main(String[] args) {
        FrmCalculator view = new FrmCalculator();
        CalculatorModel model = new CalculatorModel(0,0,0);
        CalculatorController controller = new CalculatorController(view, model);
        
        controller.setVisible(true);
    }
}
