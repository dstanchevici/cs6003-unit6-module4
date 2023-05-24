class ObjA4 {

    int i;


    public ObjA4 (int data)
    {
        i = data;
    }
}

class ObjB4 extends ObjA4 {

    public ObjB4 (int data)
    {
        i = data;
    }
}

public class ConstructorExample3 {

    public static void main (String[] argv)
    {
        ObjB4 b = new ObjB4 (5);
    }
}