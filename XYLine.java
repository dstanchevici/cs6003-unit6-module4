public class XYLine extends XYThing {

    XYPoint start, end;

    public XYLine(XYPoint start, XYPoint end) {
        this.start = start;
        this.end = end;
        //label = ""; // Try commenting out b/c it's inherited from XYThing
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
} // end class