import static java.lang.Math.abs;
import static java.lang.StrictMath.sqrt;

   public class PointGrey extends Point {

    //再定义几个实例变量，会冗杂，他会继承超类的实例变量
   //private int greyscale; [0, 255] from black to white

    // TODO: add a constructor for PointGrey
    public PointGrey(int x, int y, int grayscale) {
        super(x,y,grayscale);
    }

     @Override
       public double getDistance() {
           return 0;
       }

       @Override
       public int grayscaleDiff() {
           return 0;
       }

       //变量方法

    public  static double getDistance(Point p1, Point p2) {
        double distance = sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
        return distance;
    }


    public  static int grayscaleDiff(Point p1, Point p2) {
        // TODO: fill this function up
        int grayscaleDifferent = abs(p1.getGrayscale() - p2.getGrayscale());
        return  grayscaleDifferent;

    }

}

/*有两个问题：第一，究竟 子类如何对抽象父类的抽象方法进行重写
第二，究竟子类如何访问父类中的私有域
 */
