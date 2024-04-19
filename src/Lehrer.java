public class Lehrer extends Person {
    private double gehalt;

    public Lehrer(String name, String gebDat, double gehalt){
        super(name, gebDat);
        this.gehalt = gehalt;
    }

    public double getGehalt(){
        return this.gehalt;
    }

    public void setGehalt(double gehalt){
        this.gehalt = gehalt;
    }

    public void ausgabe(){
        System.out.println(gehalt + " " + getName() + " " + getGebDat());
    }

    public int berechne(int x){
        return 200;
    }

    public int methode2(int x){
        return 2;
    }
}
