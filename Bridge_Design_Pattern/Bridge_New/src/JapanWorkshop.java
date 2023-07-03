public class JapanWorkshop extends WorkShop{

    public JapanWorkshop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {

        engine.setSpeed(300);

    }

    @Override
    void setSpeed() {

        engine.setType("Japan");

    }
}
