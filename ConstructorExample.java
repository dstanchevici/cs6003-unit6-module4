class ObjA2 {

    int i;

    public ObjA2 ()
    {
        i = -1;
    }

    public ObjA2 (int data)
    {
        i = data;
    }
}

class ObjB2 extends ObjA2 {

}

public class ConstructorExample {

    public static void main (String[] argv)
    {
        ObjB2 b = new ObjB2 (5);
    }
}