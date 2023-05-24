import java.util.*;

public class XYPolygon extends XYThing {

    // points represent the polygon's vertices (corners). (Why not call them vertices, though?)
    ArrayList<XYPoint> points = new ArrayList<>();

    public XYPolygon (String label)
    {
        this.label = label; // this.label is from XYThing
    }

    // To add points/vertices one at a time
    public void add (XYPoint p)
    {
        points.add (p);
    }

    public String toString ()
    {
        return "Polygon: #sides=" + points.size() + " label=" + label;
    }

    public void draw ()
    {
        if (points.size() < 3) {
            System.out.println ("ERROR in XYPolygon.draw(): The polygon has to have at least three vertices.");
            return;
        }

        for (int i=0; i<points.size()-1; i++) {
            XYPoint point = points.get (i);
            XYPoint nextPoint = points.get (i+1);
            DrawTool.drawLine (point.x,point.y, nextPoint.x,nextPoint.y);
        }
        XYPoint first = points.get (0);
        XYPoint last = points.get ( points.size()-1 );
        DrawTool.drawLine (first.x,first.y, last.x,last.y);
    }

    public void drawWithLabel ()
    {
        draw ();

        // Draw label near first point
        XYPoint p = points.get (0);
        DrawTool.drawLabel (p.x-0.2, p.y-0.4, label);
    }
} // end class