import java.util.*;

public class GeometryExample3 {

    public static void main (String[] argv)
    {
		XYPoint p = new XYPoint (3, 4, "A");
		XYPoint q = new XYPoint (7,8,"B");
		XYLine L = new XYLine (p, q, "just a line");
		XYPolygon poly = new XYPolygon ("Square");
		poly.add ( new XYPoint(2,2) );
		poly.add ( new XYPoint(2,6) );
		poly.add ( new XYPoint(6,6) );
		poly.add ( new XYPoint(6,2) );

		// The new circle object, added to the earlier code.
		XYCircle c = new XYCircle (4, 3, 2, "Circle");
		System.out.println (c);

		ArrayList<XYThing> xyStuff = new ArrayList<>();
		xyStuff.add (p);
		xyStuff.add (q);
		xyStuff.add (L);
		xyStuff.add (poly);
		xyStuff.add (c);

		XYGeometryApp.drawWithLabel (xyStuff);
    }

}
