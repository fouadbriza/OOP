public class Point {
    private int x;
    private int y;
    static int numPoints;

    public Point (int x, int y) {
        this.x=x;
        this.y=y;
        numPoints+=1;
    }
    
    public int getX () {
        return(this.x);
    }

    public int getY () {
        return(this.y);
    }

    public void setX(int x) {
        this.x=x;
    }

    public void setY(int y) {
        this.y=y;
    }

    public void move(int dx,int dy) {
        this.x=x+dx;
        this.y=y+dy;
    }

    public void move(int dx) {
        this.x=x+dx;
    }

    public void display() {
        System.out.println("x: "+this.x + "y: "+this.y);
    }
}