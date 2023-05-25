
public class GeometryExample4 {

    public static void main (String[] argv)
    {
		// Set up DrawTool
		DrawTool.setXYRange (0,10, 0,10);
		DrawTool.display ();

		// Point examples:
		XYPoint p = new XYPoint (3, 4);
		System.out.println (p);
		p.draw ();

		XYPoint q = new XYPoint (7,8,"B");
		System.out.println (q);
		q.drawWithLabel ();

		// Line
		XYLine L = new XYLine (p, q, "just a line");
		System.out.println (L);
		L.drawWithLabel ();

		// Two polygons.
		XYPolygon poly = new XYPolygon ("Square");
		poly.add ( new XYPoint(2,2) );
		poly.add ( new XYPoint(2,6) );
		poly.add ( new XYPoint(6,6) );
		poly.add ( new XYPoint(6,2) );
		poly.drawWithLabel ();

		XYPolygon poly2 = new XYPolygon ("Hexagon");
		poly2.add ( new XYPoint(9,7) );
		poly2.add ( new XYPoint(8,8.73) );
		poly2.add ( new XYPoint(6,8.73) );
		poly2.add ( new XYPoint(5,7) );
		poly2.add ( new XYPoint(6,5.27) );
		poly2.add ( new XYPoint(8,5.27) );
		poly.drawWithLabel ();
    }

}
