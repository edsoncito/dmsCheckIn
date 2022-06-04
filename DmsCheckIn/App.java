public class App {
    public static void main(String[] args) throws Exception{
        utils.Extensions.AddKernel();
        ExtensionsInfrastructure.AddInfraestructure();
        ExtensionsWebApi.AddControllers();
    }
}
