package org.andestech.learning.rfb19.g4;

public class B {
    double v1,v2,v3;
    String name;
    //...

    public B(){
        System.out.println("+++ ctor" + this);
        v1=v2=v3=1;
        name = "Супер класс!!";
    }

//    public B(){
//    }

    public void makeDiscount(double p)
    {
        if(p<0 || p>99) return;
        p /= 100;

        v1 *= 1-p; v2 *= 1-p; v3 *= 1-p;

    }


    public String getData(){
        return "v1=" + v1 + ", v2=" +v2 + ", v3=" + v3 + ".";
       // return v1+"";
    }

    public void printData()
    {
        //return;
        System.out.println(getData());
    }

}
