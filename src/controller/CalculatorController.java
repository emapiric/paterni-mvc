/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalculatorModel;
import view.FrmCalculator;

/**
 *
 * @author EMA
 */
public class CalculatorController {
    private FrmCalculator view;
    private CalculatorModel model;
    public CalculatorController(FrmCalculator view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        setValues();
        setListeners();
    }

    public void setVisible(boolean visible) {
        view.setVisible(visible);
    }

    private void setValues() {
        view.getFirstNumber().setText(String.valueOf(model.getFirstNumber()));
        view.getSecondNumber().setText(String.valueOf(model.getSecondNumber()));
        view.getResult().setText(String.valueOf(model.getResult()));
    }

    private void setListeners() {
        view.addCalculationMinusListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNumbers();
                model.minus();
                setValues();
            }
        });
        view.addCalculationPlusListener(new CalculationPlusListener());
    }

    class CalculationPlusListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setNumbers();
            model.plus();
            setValues();
        }
    }
    
    private void setNumbers() {
        int firstNumber = Integer.parseInt(view.getFirstNumber().getText().trim());
        int secondNumber = Integer.parseInt(view.getSecondNumber().getText().trim());
        model.setFirstNumber(firstNumber);
        model.setSecondNumber(secondNumber);
    }
    
}
