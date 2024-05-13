
public class HarmonikOrtalama {

    public static double harmonicAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1 / arr[i];
        }
        return arr.length / sum;
    }

    public static void main(String[] args) {
        double[] list = {5, 10, 15, 20, 25};
        double hAvg = harmonicAverage(list);
        System.out.println("Dizideki sayıların harmonik ortalaması: " + hAvg);
    }
}
