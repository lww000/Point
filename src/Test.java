import static java.lang.System.out;

/*
 * exercise 1-2
 */
public class Test {

    public static void main(String[] args) {
        // Uncomment the code below when finished

		Point p1 = new PointGrey(10, 50, 100);
		Point p2 = new PointGrey(100, 50, 255);
		//Point p3 = new PointColor(50, 50, 255, 0, 0);
		//Point p4 = new PointColor(150, 20, 0, 0, 255);

		Point[] plist = {p1, p2};

		System.out.println("The euclidean distance between p4 and p1,p2,p3 are:");
		for(Point p: plist) {
			//System.out.println(p4.getDistance(p));
            System.out.println(PointGrey.getDistance(p1,p2));//make getDistance static??
		}

		System.out.println("The grayscale difference between p4 and p1,p2,p3 are:");
		for(Point p: plist) {
			//out.println(p4.grayscaleDiff(p));
            System.out.println(PointGrey.grayscaleDiff(p1,p2));
		}

    }//无法从静态上下文中引用非静态方法？？？？

}

