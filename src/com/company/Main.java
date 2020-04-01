package com.company;

class Polynomial{

    private int first;
    private int second;
    private boolean sign;

    public Polynomial(int a, int b) // ex.3x + 2
    {
        first = a;
        if(b>0)
        {
            sign = true;
            second = b;
        }
        else
        {
            sign = false;
            second = b*-1;
        }
    }

    public void multiply(int mult) //2*(3x+2) -> 6x+4 __ -2*(3x+2) -> -6x-4
    {
        if(mult == 0) //if multiplied number is zero
        {
            first = 0;
            second = 0;
        }
        else if(mult>0) //if multiplied number is positive
        {
            second = mult * second;
            first = mult * first;
        }
        else //if multiplied number is negative
        {
            first = first * mult;
            if(sign = false)//second is negative
            {
                second = second * mult*-1;
            }
            else//second is positive
            {
                second = second * mult;
            }
        }
    }

    public String toString()
    {
        if(first == 0 && second == 0)
            return "0";
        else if(first == 0)
        {
            return second + "" ;
        }
        else if(second == 0)
        {
            return first + "";
        }
        else if(sign == false)
        {
            if (second < 0)
                return first + "x " + "+ " + (second * -1);
            else
                return first + "x " + "- " + second;
        }
        else
            return first + "x " + "+ " + second;
    }

}


public class Main {

    public static void main(String[] args) {

        Polynomial test = new Polynomial(3,2);
        System.out.println(test);
        test.multiply(-2);
        System.out.println(test);

    }
}
