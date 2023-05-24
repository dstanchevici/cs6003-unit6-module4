
public class XYCircle extends XYThing {

    double x,y;                      // Coords of center
    double r;                        // Radius

    public XYCircle (double centerX, double centerY, double radius)
    {
        x = centerX;  y = centerY;
        r = radius;
    }

    public XYCircle (double centerX, double centerY, double radius, String label)
    {
        this (centerX, centerY, radius);
        this.label = label;
    }

    public String toString ()
    {
        return "Circle:[radius=" + r + " center:(" + x + "," + y + ")]";
    }

    public void draw ()
    {
        DrawTool.drawCircle (x, y, r);
    }

    public void drawWithLabel ()
    {
	draw ();
        // Compute mid point.
        DrawTool.drawLabel (x,y, label);
    }

    public void computeBounds ()
    {
        minX = x - r;
        maxX = x + r;
        minY = y - r;
        maxY = y + r;
    }

}
