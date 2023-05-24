public class XYPoint {

    double x, y;
    String label;

    public XYPoint (double initX, double initY)
    {
        x = initX; y = initY;
        label = "";
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

    public void draw ()
    {
        DrawTool.drawPoint (x, y);
    }

    public void drawWithLabel ()
    {
        draw ();
        DrawTool.drawLabel (x-0.2, y-0.4, label);
    }
} // end of "XYPoint" class