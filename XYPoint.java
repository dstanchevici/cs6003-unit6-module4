public class XYPoint extends XYThing {

    double x, y;

    public XYPoint (double initX, double initY)
    {
        //x = initX; y = initY;
        //label = "";

        this (initX, initY, "");
    }

    public XYPoint (double initX, double initY, String initLabel)
    {
        x = initX; y = initY;
        label = initLabel;
    }

    public String toString ()
    {
        return "Point: (" + String.format("%4.2f",x) + ", " + String.format("%4.2f",y) + "): label=" + label;
    }

    public double distance (XYPoint other)
    {
        return Math.sqrt ( (x-other.x)*(x-other.x) + (y-other.y)*(y-other.y) );
    }

    // Overriding XYThing's draw()
    public void draw ()
    {
        DrawTool.drawPoint (x, y);
    }

    // Overriding XYThing's drawWithLabel()
    public void drawWithLabel ()
    {
        draw ();
        DrawTool.drawLabel (x-0.2, y-0.4, label);
    }

    public void computeBounds ()
    {
        // Bounds for a single point
        minX = maxX = x;
        minY = maxY = y;
    }
} // end of "XYPoint" class