package EfficiencyTechniques.Recursion.NthCatalanNumbers;

public class Demo {
    public static void main(String[] args) {
        CatalanNumbers catalanNumbers = new CatalanNumbers();
        for(int i=0;i<10;i++){
            System.out.println(catalanNumbers.catalan(i) + " ");
        }
    }
}
