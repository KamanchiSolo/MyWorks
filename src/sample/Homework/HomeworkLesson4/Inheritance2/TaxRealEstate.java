package sample.Homework.HomeworkLesson4.Inheritance2;

public class TaxRealEstate {
    float tax;

    public TaxRealEstate(float taxK, float S) {
        if (taxK > 0 && S > 0) tax = taxK * S;
        else tax = 0;
    }

    @Override
    public String toString() {
        return String.valueOf((int) tax);
    }
}
