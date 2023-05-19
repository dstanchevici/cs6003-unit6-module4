class ObjA {

    int i;

    public void print ()
    {
        System.out.println ("ObjA: i=" + i);
    }
}

class ObjB extends ObjA {

    public void print ()
    {
        System.out.println ("ObjB: i=" + i);
    }
}

class ObjC extends ObjA {

    public void print ()
    {
        System.out.println ("ObjC: i=" + i);
    }
}

public class AnotherPolyExample {

    public static void main (String[] argv)
    {
        ObjA a = new ObjA ();
        a.i = 5;

        ObjB b = new ObjB ();
        b.i = 6;

        ObjC c = new ObjC ();
        c.i = 7;

        // Polymorphism
        ObjA x, y, z;
        x = a;
        y = b;
        z = c;

        x.print ();
        y.print ();
        z.print ();
    }
}