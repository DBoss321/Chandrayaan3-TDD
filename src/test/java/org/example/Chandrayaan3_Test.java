package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.IllegalCharsetNameException;


public class Chandrayaan3_Test {

    @Test
    public void findXCoordinateZero() {
        Chandrayaan3 c = new Chandrayaan3();
        int actualX = c.getXCoordinate();
        int expectedX = 0;
        Assert.assertEquals(actualX, expectedX);
    }

    @Test
    public void findXCoordinateNonZero() {
        Chandrayaan3 c = new Chandrayaan3();
        c.setXCoordinate(1);
        int actualX = c.getXCoordinate();
        int expectedX = 1;
        Assert.assertEquals(actualX, expectedX);
    }

    @Test
    public void findYCoordinateZero() {
        Chandrayaan3 c = new Chandrayaan3();
        int actualY = c.getYCoordinate();
        int expectedY = 0;
        Assert.assertEquals(actualY, expectedY);
    }

    @Test
    public void findYCoordinateNonZero() {
        Chandrayaan3 c = new Chandrayaan3();
        c.setYCoordinate(1);
        int actualY = c.getYCoordinate();
        int expectedY = 1;
        Assert.assertEquals(actualY, expectedY);
    }

    @Test
    public void findZCoordinateZero() {
        Chandrayaan3 c = new Chandrayaan3();
        int actualZ = c.getZCoordinate();
        int expectedZ = 0;
        Assert.assertEquals(actualZ, expectedZ);
    }

    @Test
    public void findZCoordinateNonZero() {
        Chandrayaan3 c = new Chandrayaan3();
        c.setZCoordinate(1);
        int actualZ = c.getZCoordinate();
        int expectedZ = 1;
        Assert.assertEquals(actualZ, expectedZ);
    }

    @Test
    public void findDirectionZero() {
        Chandrayaan3 c = new Chandrayaan3();
        int actualDirection = c.getDirection();
        int expectedDirection = 0;
        Assert.assertEquals(actualDirection, expectedDirection);
    }

    @Test
    public void findDirectionNonZero() {
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection('N');
        int actualDirection = c.getDirection();
        int expectedDirection = 'N';
        Assert.assertEquals(actualDirection, expectedDirection);
    }

    @Test
    public void moveAhead(){
        Chandrayaan3 c = new Chandrayaan3();
        char command = 'f';
        int expectedX = c.getXCoordinate() + 1;
        c.move(command);
        Assert.assertEquals(c.getXCoordinate(),expectedX);
    }

    @Test
    public void moveBehind(){
        Chandrayaan3 c = new Chandrayaan3();
        char command = 'b';
        int expectedX = c.getXCoordinate() - 1;
        c.move(command);
        Assert.assertEquals(c.getXCoordinate(),expectedX);
    }

    @Test
    public void turnLeftOnce(){
        Chandrayaan3 c = new Chandrayaan3();
        char command = 'l';
        char expectedDirection = 'W';
        c.turn(command);
        Assert.assertEquals(c.getDirection(),expectedDirection);
    }

    @Test
    public void turnLeftTwice(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'l';
        char expectedDirection = 'S';
        c.turn(command);
        char actualDirection = c.turn(command);
        Assert.assertEquals(actualDirection,expectedDirection);
    }

    @Test
    public void turnLeftThrice(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'l';
        char expectedDirection = 'E';
        c.turn(command);
        c.turn(command);
        char actualDirection = c.turn(command);
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void turnRightOnce(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'r';
        char expectedDirection = 'E';
        char actualDirection = c.turn(command);
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void turnRightTwice(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'r';
        char expectedDirection = 'S';
        c.turn(command);
        char actualDirection = c.turn(command);
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void turnRightThrice(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'r';
        char expectedDirection = 'W';
        c.turn(command);
        c.turn(command);
        char actualDirection = c.turn(command);
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void turnUp(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'u';
        char actualDirection = c.turn(command);
        char expectedDirection = 'U';
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void turnDown(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 'd';
        char actualDirection = c.turn(command);
        char expectedDirection = 'D';
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test(expected = NullPointerException.class)
    public void invalidTurn(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char command = 't';
        char actualDirection = c.turn(command);
        char expectedDirection = 'U';
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void moveAccordingToDirection(){
        Chandrayaan3 c = new Chandrayaan3();

    }
}
