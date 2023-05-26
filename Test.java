class ObjA435 {

    int x;

    public ObjA435 ()
    {
        x = 5; // It's good practice to initialize as many instance variables as possible inside the class.
    }

    public ObjA435 (int x)
    {
        this.x = x; // "this" points to the current object instance
    }

    public void printx ()
    {
        System.out.println ("This is x: " + x);
    }
} // end "ObjA435" class

class ObjB435 extends ObjA435 {

    String desc;

    // No-parameter constructor
    public ObjB435 ()
    {
        // Call to super() (the no-parameter const. in ObjA435) inserted by default
        // unless there is an explicity call to super, which we see below in public ObjB435 (int x, String desc)
        x = 10;
    }

    // A two-parameter constr.
    public ObjB435 (int x, String desc)
    {
        super (x); // Call to the one-parameter constr. in ObjA435
        this.desc = desc;
    }

    // Override printx() in ObjA435
    public void printx ()
    {
        super.printx (); // First, call the printx () in the superclass
        System.out.println (desc + ", value = " + x); // Next, statement in addition to (different from) printx() in the superclass
    }
} // end "ObjB435" class

// Test with a static object
public class Test {

    public static void main (String[] argv)
    {
        ObjB435 b = new ObjB435 (8, "lightyears");
        b.printx ();

        ObjA435 a = b;
        a.printx (); // I expect it to print the same as b.printx() above
    }
} // end "Test" class with main()