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
public class TribonacciGenerator extends
 FibonacciGenerator {

    /**
     * Klasa obliczajaca ciag tribonacciego, dziedziczy po klasie FibonacciGenerator
     */
    public TribonacciGenerator() {
 f_3 = new BigDecimal(0);
 }

    /**
     * resetuje zmienne odpowiadajace za obliczanie kolejnych liczb ciagu tribonacciego
     */
    @Override
 public void reset() {
 super.reset();
 f_3 = new BigDecimal(0);
 }

    /**
     * 
     * @return zwraca nastepna liczbe ciagu tribonacciego
     */
    @Override
 public BigDecimal nextTerm() {
 if (lastIndex > 2) {
 current = f_1.add(f_2).add(f_3);
 f_3 = f_2;
 f_2 = f_1;
 f_1 = current;
 }
 else if (lastIndex == 2) { current = new BigDecimal(1); }
 else { current = new BigDecimal(0); }
 lastIndex++;
 return current;
 }
 }