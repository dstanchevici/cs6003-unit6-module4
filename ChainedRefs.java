import java.util.*;

class ObjX2 {

    String name;

    public ObjX2(String s)
    {
	    name = s;
    }

    public void print ()
    {
	    System.out.println ("ObjX2: " + name);
    }

}

class ObjY {

    ObjX2 x;

    public ObjY (ObjX2 objx)
    {
	    x = objx;
    }

    public ObjX2 getX ()
    {
	    return x;
    }

}


class ObjZ {

    ObjY y;

    public ObjZ (ObjY objy)
    {
	    y = objy;
    }

    public ObjY getY ()
    {
	    return y;
    }

}


public class ChainedRefs {

    public static void main (String[] argv)
    {
        // Traditional instantiation:
        ObjX2 x = new ObjX2 ("Big X");
        ObjY y = new ObjY (x);

        // Traditional access:
        x = y.getX ();
        x.print ();

        // Using chaining to instantiate:
        y = new ObjY (new ObjX2 ("Lil' X"));

        // Using chaining to access:
        y.getX().print();

        // Another example:
        ArrayList<ObjY> yList = new ArrayList<ObjY> ();
        yList.add (y);
        yList.add (new ObjY (new ObjX2 ("X Jr.")));

        // Chained access:
        yList.get(1).getX().print();

        // My exercise code:
        ObjZ z = new ObjZ (y);
        z.getY().getX().print ();
    }

}
