package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chandrayaan3 {

    int XCoordinate, YCoordinate, ZCoordinate;
    int Direction=0;

    public int getUpDownDirection() {
        return UpDownDirection;
    }

    public void setUpDownDirection(int i) {
        UpDownDirection = i;
    }

    int UpDownDirection=0;
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
        int currentDirection = getDirection();
//        Up
        if(getUpDownDirection() == 2){
            if(command == 'f')
                setZCoordinate(getZCoordinate() + 1);
            else if(command == 'b')
                setZCoordinate(getZCoordinate() - 1);
        }
//        Down
        else if(getUpDownDirection() == -2){
            if(command == 'f')
                setZCoordinate(getZCoordinate() - 1);
            else if(command == 'b')
                setZCoordinate(getZCoordinate() + 1);
        }
//        North
        else if(currentDirection == 0 && getUpDownDirection()==0){
            if(command == 'f')
                setYCoordinate(getYCoordinate() + 1);
            else if(command == 'b')
                setYCoordinate(getYCoordinate() - 1);
        }
//        East
        else if(currentDirection == 1 && getUpDownDirection()==0){
            if(command == 'f')
                setXCoordinate(getXCoordinate() + 1);
            else if(command == 'b')
                setXCoordinate(getXCoordinate() - 1);
        }
//        South
        else if(currentDirection == 2 && getUpDownDirection()==0){
            if(command == 'f')
                setYCoordinate(getYCoordinate() - 1);
            else if(command == 'b')
                setYCoordinate(getYCoordinate() + 1);
        }
//        West
        else if(currentDirection == 3 && getUpDownDirection()==0){
            if(command == 'f')
                setXCoordinate(getXCoordinate() - 1);
            else if(command == 'b')
                setXCoordinate(getXCoordinate() + 1);
        }
    }

    public char turn(char command) {
        char[] directions = {'N','E','S','W'};
        List<Character> commands = List.of('l','r','u','d');

        int currentDirection = getDirection();
        int size = 4;
        int newDirection=currentDirection;
        if(!commands.contains(command))
            throw new NullPointerException("Invalid Input");
        else if(command == 'l') {
            newDirection = (currentDirection - 1) % size;
            setUpDownDirection(0);
        }
        else if(command == 'r'){
            newDirection = (currentDirection + 1) % size;
            setUpDownDirection(0);
        }
        else if(command == 'u'){
            setUpDownDirection(getUpDownDirection() + 2);
            return 'U';
        }
        else if(command == 'd'){
            setUpDownDirection(getUpDownDirection() - 2);
            return 'D';
        }

        if(newDirection<0)
            newDirection += size;
        setDirection(newDirection);
        return directions[getDirection()];
    }
}