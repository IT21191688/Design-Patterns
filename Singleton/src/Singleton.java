public class Singleton {


    //declate Singaleton objects must static
    private static Singleton singleton=null;

    //must private
    private Singleton(){}


    //must public and must static
    public static Singleton getInstance(){


        //once it not initialized if work
        if(singleton==null){

            singleton=new Singleton();

        }
        return singleton;
    }


}
