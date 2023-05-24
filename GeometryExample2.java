import java.util.*;

public class GeometryExample2 {

    public static void main (String[] argv)
    {
		// Make a few XYPoint instances:
		XYPoint p = new XYPoint (3, 4, "A");
		XYPoint q = new XYPoint (7,8,"B");

		// A line:
		XYLine L = new XYLine (p, q, "just a line");

		// A couple of polygons:
		XYPolygon poly = new XYPolygon ("Square");
		poly.add ( new XYPoint(2,2) );
		poly.add ( new XYPoint(2,6) );
		poly.add ( new XYPoint(6,6) );
		poly.add ( new XYPoint(6,2) );

		XYPolygon poly2 = new XYPolygon ("Hexagon");
		poly2.add ( new XYPoint(9,7) );
		poly2.add ( new XYPoint(8,8.73) );
		poly2.add ( new XYPoint(6,8.73) );
		poly2.add ( new XYPoint(5,7) );
		poly2.add ( new XYPoint(6,5.27) );
		poly2.add ( new XYPoint(8,5.27) );

		// Make an array list to hold the items
		ArrayList<XYThing> xyStuff = new ArrayList<>();
		xyStuff.add (p);
		xyStuff.add (q);
		xyStuff.add (L);
		xyStuff.add (poly);
		xyStuff.add (poly2);

		// Give all of them to the app
		XYGeometryApp.drawWithLabel (xyStuff);
    }

}
