/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwolab.lab03.app;

import pwolab.lab03.utils.SequenceTools;

/**
 *
 * @author Michal
 * @version 1.0.0
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Metoda getArgs pobiera argumenty
     * @param args
     * @return
     */
    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) {
            return true;
        }
        return seqType != null && from >= 0 && to >= 0;

    }

    /**
     * Metoda writeSeq wywołuje sekwencje
     * @return
     */
    @Override
    protected boolean writeSeq() {
        System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
        return true;
    }

    /**
     * Metoda run uruchamia program
     * @param args
     */
    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }

        writeSeq();
    }

}
