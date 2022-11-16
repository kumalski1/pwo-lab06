/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwolab.lab03.seq;

 import java.math.BigDecimal;

/**
 *
 * @author Michal
 * @version 1.0.0
 */
public class FibonacciGenerator extends Generator {

    /**
     * Klasa obliczajaca ciag fibonacciego, dziedziczaca po klasie Generator
     */
    public FibonacciGenerator() {
 current = new BigDecimal(0);
 f_1 = new BigDecimal(1);
 f_2 = new BigDecimal(0);
 }

    /**
     * metoda resetuje zmienne odpowiadajace za obliczanie kolejnych liczb ciagu fibonacciego
     */
    @Override
 public void reset() {
 super.reset();
 current = new BigDecimal(0);
 f_1 = new BigDecimal(1);
 f_2 = new BigDecimal(0);
 }

    /**
     *
     * @return zwraca nastepna liczbe ciagu fibonacciego
     */
    @Override
 public BigDecimal nextTerm() {

 if (lastIndex > 1) {
 current = f_1.add(f_2);
 f_2 = f_1;
 f_1 = current;
 } else if (lastIndex == 1) {
 current = new BigDecimal(1);
 } else {
 current = new BigDecimal(0);
 }

 lastIndex++;
 return current;
 }
 }