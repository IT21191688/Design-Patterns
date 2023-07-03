public class Initialize {

    public static void main(String[] args) {

        UsaWorkshop usaWorkshop=new UsaWorkshop(new Bmw());
        usaWorkshop.process();


        JapanWorkshop japanWorkshop=new JapanWorkshop(new Bmw());
        japanWorkshop.process();



    }
}
