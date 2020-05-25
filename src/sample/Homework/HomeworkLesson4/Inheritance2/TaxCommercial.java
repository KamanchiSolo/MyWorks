package sample.Homework.HomeworkLesson4.Inheritance2;

public class TaxCommercial extends TaxRealEstate {
    public TaxCommercial(float taxK, float S, float gain) {
        super(taxK, S);
        if (gain > 0 && gain < 100) tax = 0;
    }
}
