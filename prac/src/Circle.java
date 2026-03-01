public class Circle {
    private Point p;
    private float radius;

    public Circle(int x, int y ,int radius) {
        this.p= new Point(x,y);
        this.radius=radius;      
    }

    public void display() {
        System.out.println("x: "+this.p.getX()+" y: "+this.p.getY()+" radius: "+this.radius);
    }

    public void move(int dx,int dy){
        this.p.setX(this.p.getX()+dx);
        this.p.setY(this.p.getY()+dy);
    }

    public void move(int dx){
        this.p.setX(this.p.getX()+dx);
    }


}
