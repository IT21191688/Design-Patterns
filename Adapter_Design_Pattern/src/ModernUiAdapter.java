public class ModernUiAdapter implements AppServer {


    private final ModernAppUI modernAppUI;

    public ModernUiAdapter(ModernAppUI modernAppUI){
        this.modernAppUI=modernAppUI;
    }
    @Override
    public void displayData(XMLData xmlData) {

        JsonData data=converter(xmlData);
        modernAppUI.displayData(data);


    }

    private JsonData converter(XMLData data){
        //bussiness Logic

        return new JsonData();
    }
}
