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
public class LucasGenerator extends FibonacciGenerator {

    /**
     * Klasa obliczajaca ciag lucasa, dziedziczy po klasie FibonacciGenerator
     */
    public LucasGenerator() {
 current = new BigDecimal(2);
 f_2 = new BigDecimal(2);
 }

    /**
     * resetuje zmienne odpowiadajace za obliczanie kolejnych liczb ciagu lucasa
     */
    @Override
 public void reset() {
 super.reset();
 current = new BigDecimal(2);
 f_2 = new BigDecimal(2);
 }

    /**
     *
     * @return zwraca nastepna liczbe ciagu lucasa
     */
    @Override
 public BigDecimal nextTerm() {
 if(lastIndex==0) {
 lastIndex++;
 return new BigDecimal(2);
 }
 return super.nextTerm();
 }
 }