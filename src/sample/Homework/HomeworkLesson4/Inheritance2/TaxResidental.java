package sample.Homework.HomeworkLesson4.Inheritance2;

public class TaxResidental extends TaxRealEstate {

    public TaxResidental(float taxK, float S, int subsidy) {
        super(taxK, S);
        if (subsidy > 0 && subsidy < 100 && tax > 0) tax -= (tax / 100) * subsidy;
    }
}
