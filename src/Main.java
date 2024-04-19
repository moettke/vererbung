import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> liste = new ArrayList<>();
        Teilnehmer tn = new Teilnehmer("Poguntke", "11.05.1978", "Dozent");

        System.out.println(tn.getName() + " | " + tn.getGebDat() + " | " + tn.getBeruf());

        Lehrer l = new Lehrer("Meier", "19.02.1985", 4562.5);
        System.out.println(l.getName() + " | " + l.getGebDat() + " | " + l.getGehalt());

        liste.add(l);
        liste.add(tn);

        System.out.println(liste.get(0).getName());
        System.out.println(liste.get(0).getGebDat());
        // System.out.println(liste.get(0).getGehalt()); FEHLER
        // explizites Typecasting von Person in Lehrer
        System.out.println( ( (Lehrer)liste.get(0) ).getGehalt() );

        System.out.println(liste.get(1).getName());
        System.out.println(liste.get(1).getGebDat());
        // System.out.println(liste.get(1).getBeruf()); FEHLER
        // explizites Typecasting von Person in Teilnehmer
        System.out.println( ( (Lehrer)liste.get(0) ).getGehalt() );

        System.out.println(liste.get(0) instanceof Lehrer);
        for(int i=0; i< liste.size(); i++){
            if(liste.get(i) instanceof Lehrer){
                System.out.println( ( (Lehrer)liste.get(i) ).getGehalt() );
            }
            else{
                System.out.println( ( (Teilnehmer)liste.get(i) ).getBeruf() );
            }
        }

        for (Person e : liste ){
            if(e instanceof Lehrer){
                System.out.println( ( (Lehrer) e ).getGehalt() );
            }
            else{
                System.out.println( ( (Teilnehmer) e ).getBeruf() );
            }
        }

        //____________________________________________________________________
        System.out.println("___________________________________________");


        System.out.println( tn.methode1() );
        System.out.println( l.methode1() );

        System.out.println( tn.methode2(3) );
        System.out.println( l.methode2(4) );

        System.out.println("IMGEHEGE: " + l.IMGEHEGE);
        System.out.println("IMGEHEGE: " + tn.IMGEHEGE);








    }
}