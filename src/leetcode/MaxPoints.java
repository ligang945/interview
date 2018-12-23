package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxPoints {
    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 0);
        Point pointC = new Point(-5, 3);
        Point[] points = {pointA, pointB, pointC};
        System.out.println(maxPoints(points));
    }

    public static int maxPoints(Point[] points) {
        if (points.length < 2) {
            return points.length;
        }
        HashMap<Double, java.util.concurrent.atomic.AtomicInteger> kn = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Point A = points[i];
                Point B = points[j];
                if (A.x == B.x && A.y == B.y) {
                    if (kn.isEmpty())
                        kn.put(-1.0, new java.util.concurrent.atomic.AtomicInteger(1));
                    else
                        kn.values().forEach(java.util.concurrent.atomic.AtomicInteger::getAndIncrement);
                    continue;
                }
                Double k = -1D;
                if (A.x != B.x) {
                    k = 1.0 * (A.y - B.y) / (A.x - B.x);
                    if (k == -0.0) {
                        k = 0.0;
                    }
                }
                if (kn.containsKey(k)) {
                    kn.get(k).getAndIncrement();
                } else {
                    kn.put(k, new java.util.concurrent.atomic.AtomicInteger(1));
                }
            }
        }

        int maxV = -2;
        for (Map.Entry<Double, java.util.concurrent.atomic.AtomicInteger> entry : kn.entrySet()) {
            if (entry.getValue().get() > maxV) {
                maxV = entry.getValue().get();
            }
        }

        return (int) (Math.sqrt(8 * maxV + 1) + 1) / 2;
    }
}

