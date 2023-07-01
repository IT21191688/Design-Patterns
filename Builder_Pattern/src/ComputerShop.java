public class ComputerShop {

    public static void main(String[] args) {


        //Wihout using Bulder We shuld add all the Details
        Computer samanC=new Computer("Lenovo",16,19,500);
        System.out.println(samanC);


        //Using builder we Should Not use all the Details we only need nessoory details and we can create Object
        System.out.println("Using Bulder Pattern");

        Computer kamalC=new ComputerBuilder().setBrand("Lenovo").setDiskSpace(23).setRam(15).getComputer();
        System.out.println(kamalC);


    }
}
