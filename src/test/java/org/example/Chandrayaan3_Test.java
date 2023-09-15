package org.example;

import org.junit.Assert;
import org.junit.Test;


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
        int expectedY = 1;
        c.move(command);
        Assert.assertEquals(c.getYCoordinate(),expectedY);
    }

    @Test
    public void moveBehind(){
        Chandrayaan3 c = new Chandrayaan3();
        char command = 'b';
        int expectedY = c.getYCoordinate() - 1;
        c.move(command);
        Assert.assertEquals(c.getYCoordinate(),expectedY);
    }

    @Test
    public void turnLeftOnce(){
        Chandrayaan3 c = new Chandrayaan3();
        char command = 'l';
        int expectedDirection = 3;
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
    public void turnLeftRight(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(0);
        char expectedDirection = 'N';
        c.turn('r');
        char actualDirection = c.turn('l');
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void movingInEast(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(1);
        char command = 'f';
        c.move(command);
        int expectedX = 1;
        int actualX = c.getXCoordinate();
        Assert.assertEquals(expectedX,actualX);
    }

    @Test
    public void movingInSouth(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(2);
        char command = 'f';
        c.move(command);
        int expectedY = -1;
        int actualY = c.getYCoordinate();
        Assert.assertEquals(expectedY,actualY);
    }

    @Test
    public void movingInWest(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setDirection(3);
        char command = 'f';
        c.move(command);
        int expectedX = -1;
        int actualX = c.getXCoordinate();
        Assert.assertEquals(expectedX,actualX);
    }

    @Test
    public void movingUp(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setUpDownDirection(2);
        char command = 'f';
        c.move(command);
        int expectedZ = 1;
        int actualZ = c.getZCoordinate();
        Assert.assertEquals(expectedZ,actualZ);
    }

    @Test
    public void movingDown(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setUpDownDirection(-2);
        char command = 'f';
        c.move(command);
        int expectedZ = -1;
        int actualZ = c.getZCoordinate();
        Assert.assertEquals(expectedZ,actualZ);
    }

    @Test
    public void turningUpAndLeft(){
        Chandrayaan3 c = new Chandrayaan3();
        c.turn('u');
        c.turn('l');
        int actualDirection = c.getDirection();
        int expectedDirection = 3;
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void turningUpLeftRight(){
        Chandrayaan3 c = new Chandrayaan3();
        c.turn('u');
        c.turn('l');
        c.turn('r');
        int actualDirection = c.getDirection();
        int expectedDirection = 0;
        Assert.assertEquals(expectedDirection,actualDirection);
    }

    @Test
    public void FRUBL(){
        Chandrayaan3 c = new Chandrayaan3();
        c.move('f');
        c.turn('r');
        c.turn('u');
        c.move('b');
        c.turn('l');
        Assert.assertEquals(0,c.getDirection());
        Assert.assertEquals(0,c.getXCoordinate());
        Assert.assertEquals(1,c.getYCoordinate());
        Assert.assertEquals(-1,c.getZCoordinate());
    }

    @Test
    public void FFFULR(){
        Chandrayaan3 c = new Chandrayaan3();
        c.move('f');
        c.move('f');
        c.move('f');
        c.turn('u');
        c.turn('l');
        c.turn('r');
        int currentDirection = c.getDirection();
        Assert.assertEquals(0,c.getXCoordinate());
        Assert.assertEquals(3,c.getYCoordinate());
        Assert.assertEquals(0,c.getZCoordinate());
        Assert.assertEquals(0,currentDirection);
    }

    @Test
    public void FULRDB(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setXCoordinate(-1);
        c.setYCoordinate(-1);
        c.setZCoordinate(-1);
        c.setDirection(2);

        c.move('f');
        c.turn('u');
        c.turn('l');
        c.turn('r');
        c.turn('d');
        c.move('b');

        Assert.assertEquals(-1,c.getXCoordinate());
        Assert.assertEquals(-1,c.getYCoordinate());
        Assert.assertEquals(-1,c.getZCoordinate());
        Assert.assertEquals(2,c.getDirection());
    }

    @Test
    public void FRU(){
        Chandrayaan3 c = new Chandrayaan3();
        c.move('f');
        c.turn('r');
        c.turn('u');

        Assert.assertEquals(0,c.getXCoordinate());
        Assert.assertEquals(1,c.getYCoordinate());
        Assert.assertEquals(0,c.getZCoordinate());
        Assert.assertEquals(2,c.getUpDownDirection());
    }

    @Test
    public void FRFULBD(){
        Chandrayaan3 c = new Chandrayaan3();
        c.setXCoordinate(3);
        c.setYCoordinate(-2);
        c.setZCoordinate(1);
        c.setDirection(1);

        c.move('f');
        c.turn('r');
        c.move('f');
        c.turn('u');
        c.turn('l');
        c.move('b');
        c.turn('d');

        Assert.assertEquals(3,c.getXCoordinate());
        Assert.assertEquals(-3,c.getYCoordinate());
        Assert.assertEquals(1,c.getZCoordinate());
        Assert.assertEquals(-2,c.getUpDownDirection());
    }
}
