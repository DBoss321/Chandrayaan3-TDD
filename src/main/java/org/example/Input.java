package org.example;

import java.util.Enumeration;
import java.util.Scanner;

public class Input {
    Scanner s = new Scanner(System.in);
    private char[] commands;
    private int inputs;

    Input(int inputs){
        this.inputs = inputs;
        commands = new char[inputs];
    }

    void setCommands(int index, char item){
        commands[index] = item;
    }
    char[] getCommands(){
        return commands;
    }

    void takeInput(){
        int count=0;
        while(count != inputs){
            String nextItem = s.next();
            setCommands(count,nextItem.charAt(0));
        }
    }
}
