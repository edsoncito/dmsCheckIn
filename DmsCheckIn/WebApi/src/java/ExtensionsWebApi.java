import Controllers.CheckInController;
import http.Rest;

public class ExtensionsWebApi {

    public static void AddControllers() {
        Rest.addController(CheckInController.class);
        Rest.start(80);
    }
}
