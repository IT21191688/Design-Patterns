public class UsaWorkshop extends WorkShop{


    public UsaWorkshop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {

        engine.setSpeed(250);

    }

    @Override
    void setSpeed() {

        engine.setType("Usa");

    }
}
