package OOP.Properties.Inheritance;

public class BoxDensity extends BoxWeight{
    double density;

    BoxDensity () {

        this.density = -1;
    }

    public BoxDensity(double side, double weight, double density) {
        super(side, weight);
        this.density = density;
    }

    public BoxDensity(double l, double h, double w, double weight, double density) {
        super(l, h, w, weight);
        this.density = density;
    }
}
