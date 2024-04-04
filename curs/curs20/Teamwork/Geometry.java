package curs.curs20.Teamwork;

public class Geometry {
    private double areaFinal;
     double area(double radius){
        areaFinal=Math.PI*Math.pow(radius,2);
        return areaFinal;
    }
      double area(double base,int height){
        areaFinal=base*height/2;
        return areaFinal;
    }
    double area(double breadth, double lenght){
         areaFinal=breadth*lenght;
        return areaFinal;
    }
}
