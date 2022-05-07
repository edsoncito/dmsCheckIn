public class App {

    public static void main(String[] args) throws Exception{
        SharedKernel.Extensions.AddKernel();
        ExtensionsInfrastructure.AddInfraestructure();
        ExtensionsWebApi.AddControllers();
    }
}
