package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorcount;

    public Cottage(double area, int floorcount) {
        this.area = area;
        this.floorcount = floorcount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return String.valueOf(floorcount) + " этажный коттедж площадью " + String.valueOf(area) + " метров";
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() < another.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
