
public class Rectencap {
    private double width;
    private double height;
    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double w) {
        width=w;
        if(width <0)
        throw new illegalArgumentException("entrer un nombre positif ");
        
    }
    public void setHeight(double h){
        height =h;
        illegalArgumentException e = new illegalArgumentException("entrer un nombre positif ");
    }
    public double area(){
        return width*height;

    }
    public static void main(String[] args){
        Rectencap rect = new Rectencap();
        Rectencap rect2 = new Rectencap();
        rect.setHeight(10.0);
        rect.setWidth(5.0);
        rect2.setHeight(13.0);
        rect2.setWidth(4.0);
        System.out.println("the area of the rectangle 1 is :"+rect.area());
        System.out.println("the area of the rectangle 2 is :"+rect2.area());
    }
}
