class ObjA3 {

    int i;

    public ObjA3 ()
    {
        i = -1;
    }

    public ObjA3 (int data)
    {
        i = data;
    }
}

class ObjB3 extends ObjA3 {

    public ObjB3 (int data)
    {
        i = data;
    }
}

public class ConstructorExample2 {

    public static void main (String[] argv)
    {
        ObjB3 b = new ObjB3 (5);
    }
}