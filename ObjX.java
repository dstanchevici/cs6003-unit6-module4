public class ObjX {

    int i;

    public ObjX (int data)
    {
        i = data;
    }

    public String toString ()
    {
        return "i=" + i;
    }

    public static void main (String[] argv)
    {
        ObjX x = new ObjX (5);
        System.out.println (x);
    }
}