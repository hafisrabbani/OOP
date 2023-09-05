import java.lang.Math;
public class Lingkaran {
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getLuas() {
        return Math.PI * r * r;
    }

    public double getKeliling() {
        return 2 * Math.PI * r;
    }
}

