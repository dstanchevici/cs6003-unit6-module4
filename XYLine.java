public class XYLine extends XYThing {

    XYPoint start, end;

    public XYLine(XYPoint start, XYPoint end) {
        this.start = start;
        this.end = end;
        label = "";
    }

    public XYLine(XYPoint start, XYPoint end, String label) {
        this.start = start;
        this.end = end;
        this.label = label; // this.label refers to label in (is inheretied from) XYThing
    }

    public String toString() {
        return "Line: [" + start + " to " + end + "]";
    }

    // Overriding draw() in XYThing
    public void draw() {
        start.draw(); // This draw is from XYPoint.
        end.draw(); // This draw is from XYPoint.
        DrawTool.drawLine(start.x, start.y, end.x, end.y);
    }

    // Overriding drawWithLabel() in XYThing
    public void drawWithLabel() {
        draw(); // This is the draw() here in XYLine
        // Draw label at midpoint
        DrawTool.drawLabel((start.x + end.x)/2, (start.y + end.y)/2, label);
    }

    public void computeBounds ()
    {
        minX = (start.x <= end.x)? start.x: end.x;
        maxX = (start.x > end.x)? start.x: end.x;
        minY = (start.y <= end.y)? start.y: end.y;
        maxY = (start.y > end.y)? start.y: end.y;

    }
} // end class