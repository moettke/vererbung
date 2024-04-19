public abstract class Person implements Vorschrift {
    private String name;
    private String gebDat;

    public Person(String name, String gebDat){
        this.name = name;
        this.gebDat = gebDat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGebDat() {
        return gebDat;
    }

    public void setGebDat(String gebDat) {
        this.gebDat = gebDat;
    }

    public String methode1(){
        return "Methode1";
    }



    // abstrakte Methode, hat keinen Rumpf, ist eine Vorschrift für die Kindklassen
   public abstract void ausgabe();

    public abstract int berechne(int x);
}
