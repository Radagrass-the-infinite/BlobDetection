package Processing.Util;

import Processing.Blob;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;

public class Drawer {
    static Scalar drawColor = new Scalar(0,0,255);
    static int count = 0;
    public static void drawBlobs(Mat canvas, ArrayList<Blob> blobList){
        System.out.println("Blob List size " + blobList.size());
        for (Blob b : blobList){
            Imgproc.rectangle(canvas, b.getMinCorner(), b.getMaxCorner(), drawColor, 3);
//            System.out.println("Drawing a Blob, count " + count);
//            count++;
        }
    }
}
