package JavaStepByStep;

public class Main {

    public static void main(String[] args) {
	    //Declare an Array with type Point
        Point[] points;
        //Initialize the array
        points=new Point[4];
        //Create an object to each component to the array
        for(int i=0;i<points.length;i++){
            points[i] = new Point();
        }
        /*points[1].x = 1;
        points[1].y = 0.3;*/
        for(int i=0;i<points.length;i++){
            points[i].x = i;
            points[i].y = 0.3*i*i;
        }
        for(Point p:points)
            System.out.printf("X is %.2f "+"And Y is %.2f"+"\n",p.x,p.y);
    }
}
