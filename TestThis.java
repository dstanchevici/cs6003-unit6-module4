class ObjA427 {

    int x;

    void selfExamine ()
    {
        System.out.println (this);
    }
}

public class TestThis {

    public static void main (String[] argv)
    {
        ObjA427 a = new ObjA427 ();
        System.out.println (a);
        a.selfExamine();
    }
}