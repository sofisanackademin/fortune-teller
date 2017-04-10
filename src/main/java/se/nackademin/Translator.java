package se.nackademin;

public class Translator {

    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    
    private String[] adjektiv = {"stor","liten","stark","svag","mjuk","hård","snabb","vacker","ljus","mörk"};
    private String[] substantiv = {"en lönehöjning","en lönesänkning","en fotboja","en katt","en hund","ett hus","ett barn","ett elstängsel","en dator","ett golv"};
    private String[] verb = {"springa","ljuga","flyga","se","vara","äta","mäta","gå","röra","resa"};
    
    public String skapaSpådom() {
        return "Din framtid är "+adjektiv[a]+". Du borde sluta "+verb[b]+". Vi ser att du snart kommer att skaffa "+substantiv[c]+". Snart kommer du vilja "+verb[d]+", men då är det viktigt att du är "+adjektiv[e]+".";
    }
    
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }
}
