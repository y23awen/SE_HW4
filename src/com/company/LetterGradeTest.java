package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterGradeTest {

    @Test
    public void T1() {
        char expected = 'X';
        char actual = LetterGrade.letterGrade(101);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T2() {
        char expected = 'A';
        char actual = LetterGrade.letterGrade(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T3() {
        char expected = 'A';
        char actual = LetterGrade.letterGrade(90);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T4() {
        char expected = 'B';
        char actual = LetterGrade.letterGrade(89);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T5() {
        char expected = 'B';
        char actual = LetterGrade.letterGrade(80);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T6() {
        char expected = 'C';
        char actual = LetterGrade.letterGrade(79);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T7() {
        char expected = 'C';
        char actual = LetterGrade.letterGrade(70);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T8() {
        char expected = 'D';
        char actual = LetterGrade.letterGrade(69);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T9() {
        char expected = 'D';
        char actual = LetterGrade.letterGrade(60);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T10() {
        char expected = 'F';
        char actual = LetterGrade.letterGrade(59);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T11() {
        char expected = 'F';
        char actual = LetterGrade.letterGrade(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void T12() {
        char expected = 'X';
        char actual = LetterGrade.letterGrade(-1);
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void T1() {
//        char expected = 'X';
//        char actual = LetterGrade.letterGrade(120);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void T2() {
//        char expected = 'A';
//        char actual = LetterGrade.letterGrade(95);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void T3() {
//        char expected = 'B';
//        char actual = LetterGrade.letterGrade(85);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void T4() {
//        char expected = 'C';
//        char actual = LetterGrade.letterGrade(75);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void T5() {
//        char expected = 'D';
//        char actual = LetterGrade.letterGrade(65);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void T6() {
//        char expected = 'F';
//        char actual = LetterGrade.letterGrade(35);
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void T7() {
//        char expected = 'X';
//        char actual = LetterGrade.letterGrade(-5);
//        Assert.assertEquals(expected, actual);
//    }


}