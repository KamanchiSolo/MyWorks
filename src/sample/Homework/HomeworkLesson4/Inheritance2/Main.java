package sample.Homework.HomeworkLesson4.Inheritance2;

public class Main {
    public static void main(String[] args) {

        //Некорректные
        TaxResidental taxResidental2 = new TaxResidental(100, 1, -20);
        TaxResidental taxResidental3 = new TaxResidental(100, 1, 110);
        TaxCommercial taxCommercial2 = new TaxCommercial(100, 1, -113);

        //Корректные
        TaxResidental taxResidental = new TaxResidental(100, 1, 0);
        TaxResidental taxResidental1 = new TaxResidental(100, 1, 20);
        TaxCommercial taxCommercial = new TaxCommercial(100, 1, 53);
        TaxCommercial taxCommercial1 = new TaxCommercial(100, 1, 101);
        TaxIndustrial taxIndustrial = new TaxIndustrial(100, 1);


        //Вывод
        //Некорректные
        System.out.println("Incorrect values: ");
        System.out.println("Tax Residential with subsidy -20: " + taxResidental2.toString());
        System.out.println("Tax Residential with subsidy 110: " + taxResidental3.toString());
        System.out.println("Tax Commercial with gain -113: " + taxCommercial1.toString() + "\n");

        //Корректные
        System.out.println("Tax Residental with subsidy 0: " + taxResidental.toString());
        System.out.println("Tax Residental with subsidy 20: " + taxResidental1.toString());
        System.out.println("Tax Commercial with subsidy 53: " + taxCommercial.toString());
        System.out.println("Tax Commercial with subsidy 101: " + taxCommercial1.toString());
        System.out.println("Tax Industrial: " + taxIndustrial.toString());

    }
}
