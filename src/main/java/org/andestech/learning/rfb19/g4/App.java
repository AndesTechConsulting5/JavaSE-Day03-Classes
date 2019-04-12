package org.andestech.learning.rfb19.g4;

import org.andestech.learning.rfb20.C;

class A{

    public static int v1, v2;

}

public class App
{
    public static void echoSt(char Ch, int N)
    {
        String out = ""; //
        for(int k =0; k<N; k++) out += Ch;  // not effective!
        System.out.println(out);
    }

    public void echoSt2(char Ch, int N)
    {
        String out = ""; //
        for(int k =0; k<N; k++) out += Ch;  // not effective!
        System.out.println(out);
    }

    public static void main( String[] args )
    {

        //1
        A.v1 = 123;

        //2
        B b1;
        b1 = new B();
        B b2 = new B();
        b2.v1 = 100;

        new B();
        new B();
        new B();

        B b3 = new B();
        b3.v1 = 20;

        System.out.println(Integer.toHexString(b2.hashCode()));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        echoSt('-',70);

        System.out.println("b2.v1=" + b2.v1);
        System.out.println("b3.v1=" + b3.v1);

        new App().echoSt2('+', 65);

        b2.makeDiscount(25);

        b2.printData();
        b3.printData();

        C c1 = new C();
        System.out.println(c1);



    }
}
