package com.lecture;



public class Main {
    final static short i = 2;
    public static int j = 0;
    public static void main(String [] args)
    {
        for (int k = 0; k < 3; k++)
        {
            switch (k)
            {
                case 2: System.out.print(" 0 ");
                case 1: System.out.print(" 1 ");
                case 0: System.out.print(" 2 ");
            }
        }
    }
    
}
