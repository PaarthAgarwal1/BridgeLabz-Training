
class LegacyAPI {

    @Deprecated
    public void oldFeature(){
        System.out.println("This is a deprecated method.");
    }

    public void newFeature(){
        System.out.println("This is the new method to use.");
    }
}

public class DeprecatedUse {
    public static void main(String[] args) {
        LegacyAPI api=new LegacyAPI();
        api.oldFeature(); // Gives a warning
        api.newFeature();
    }
}
