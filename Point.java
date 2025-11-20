public class Point {
    int x;
    int y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    //la redefinitio se trouve dans l'heritage
 public int getX(){
    return x;
 }
 public int getY(){
    return y;
 }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    void translate(int dx , int dy){
        x += dx;
        y += dy;
    }
    
    
    public void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(p2);
        System.out.println("Point 1 : (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Point 2 : (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("Point 3 : (" + p3.getX() + "," + p3.getY() + ")");
    }
    

    }    

