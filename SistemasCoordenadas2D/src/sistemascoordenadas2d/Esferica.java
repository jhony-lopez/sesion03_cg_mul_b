package sistemascoordenadas2d;

public class Esferica {
    private double r;
    private double ang1;
    private double ang2;

    public Esferica(){
    }
    
    public Esferica(double r, double ang1, double ang2) {
        this.r = r;
        this.ang1 = ang1;
        this.ang2 = ang2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getAng1() {
        return ang1;
    }

    public void setAng1(double ang1) {
        this.ang1 = ang1;
    }

    public double getAng2() {
        return ang2;
    }

    public void setAng2(double ang2) {
        this.ang2 = ang2;
    }
    
    
    
}
