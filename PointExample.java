public class PointExample {

    public static void main (String[] argv)
    {
        DrawTool.setXYRange (0,10, 0,10);
        DrawTool.display ();
        XYPoint p = new XYPoint (3, 4);
        System.out.println (p);
        p.draw ();

        XYPoint q = new XYPoint (7,8,"B");
        System.out.println (q);
        q.drawWithLabel ();

        System.out.println ("p to q distance: " + p.distance(q));
    }
}