package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chandrayaan3 {

    int XCoordinate, YCoordinate, ZCoordinate;
    int Direction=0;

    public static void main(String[] args) {

    }


    public int getXCoordinate() {
        return XCoordinate;
    }
    public void setXCoordinate(int i) {
        XCoordinate = i;
    }
    public int getYCoordinate() {
        return YCoordinate;
    }
    public void setYCoordinate(int i) {
        YCoordinate = i;
    }
    public int getZCoordinate() {
        return ZCoordinate;
    }
    public void setZCoordinate(int i) {
        ZCoordinate = i;
    }
    public int getDirection() {
        return Direction;
    }
    public void setDirection(int n) {
        Direction=n;
    }

    public void move(char command) {
        if(command == 'f')
            setXCoordinate(getXCoordinate() + 1);
        else if(command == 'b')
            setXCoordinate(getXCoordinate() - 1);
    }

    public char turn(char command) {
        char[] directions = {'N','E','S','W'};
        List<Character> commands = List.of('f','b','l','r','u','d');

        int currentDirection = getDirection();
        int size = 4;
        int newDirection=currentDirection;
        if(!commands.contains(command))
            throw new NullPointerException("Invalid Input");
        else if(command == 'l') {
            newDirection = (currentDirection - 1) % size;
        }
        else if(command == 'r'){
            newDirection = (currentDirection + 1) % size;
        }
        else if(command == 'u'){
            return 'U';
        }
        else if(command == 'd'){
            return 'D';
        }

        if(newDirection<0)
            newDirection += size;
        setDirection(newDirection);
        return directions[getDirection()];
    }
}