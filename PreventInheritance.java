final class ObjV {
}

class ObjW extends ObjV {
}

public class PreventInheritance {

    public static void main (String[] argv)
    {
        ObjW w = new ObjW ();
    }
}