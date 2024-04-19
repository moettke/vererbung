public class Teilnehmer extends Person {
    private String beruf;

    public Teilnehmer(String name, String gebDat, String beruf){
        // Aufruf des Konstruktors der Oberklasse
        super(name, gebDat);
        this.beruf = beruf;
    }


    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public void ausgabe(){
        System.out.println(beruf + " " + getName() + " " + getGebDat());
    }

    public int berechne(int x){
        return 100;
    }

    public int methode2(int x){
        return 1;
    }
}
