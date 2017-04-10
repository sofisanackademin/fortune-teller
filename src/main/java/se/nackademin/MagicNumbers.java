package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        int mellanslagPosition = 0;
        int mellanslagRäknare = 0;
        int aVärde = 0;
        while(mellanslagPosition>=0) {
            mellanslagPosition = name.indexOf(' ', mellanslagPosition);
            if(mellanslagPosition>=0) {
                mellanslagRäknare++;
                mellanslagPosition++;
            }
        }
        
        aVärde = mellanslagRäknare + 1 + age;
    
        while(aVärde>=10) {
            aVärde = aVärde - 7;
        }
        
        return aVärde;
    }

    public int calculateB() {
        int bVärde = location.length();
        
        bVärde = bVärde + income;
        
        while(bVärde>=10) {
            bVärde = bVärde - 7;
        }
        
        return bVärde;
    }

    public int calculateC() {
        //TODO: calculate C
        return 0;
    }

    public int calculateD() {
        //TODO: calculate D
        return 0;
    }

    public int calculateE() {
        //TODO: calculate E
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
