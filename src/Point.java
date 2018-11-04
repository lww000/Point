import static java.lang.Math.abs;
import static java.lang.StrictMath.sqrt;


public abstract class Point {


    //实例变量
    private int x; // position in x
    private int y; // position in y
    private int grayscale;//[0, 255] from black to white

    //用set和get方法
  public int getX(){
      return x;
  }
  public void setX(int x){
      this.x=x;
  }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public int getGrayscale(){
        return grayscale;
    }
    public void setGrayscale(int grayscale){
        this.grayscale=grayscale;
    }



    //构造方法
    public Point(int x,int y,int grayscale){
    this.x= x; // position in x
    this.y= y; // position in y
    this.grayscale= grayscale; }
    /*
     * Return the euclidean distance between this point
     * and another point p
     * @param p another point
     * @return the euclidean distance
     */


    //实例方法
    public abstract double getDistance() ;
    /*{
        double distance = sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        return distance;
    }*/

    /*
     * Return the difference in grayscale 灰色点 between this point
     * and another point p
     * @param p another point
     * @return the grayscale difference灰度差
     */
    public abstract int grayscaleDiff();
    /*{
        int grayscaleDifferent = abs(p1.grayscale - p2.grayscale);
        return  grayscaleDifferent;
    }*/


}

