import UseCases.Command.CheckIn.CrearCheckInHandler;
import UseCases.Queries.GetCheckInByIdHandler;
import factories.CheckInFactory;
import factories.ICheckInFactory;
import extensions.IServiceCollection;
import mediator.IMediator;

public class Extensions {

//    public static void main(String[] args) {
//        IServiceCollection services = new IServiceCollection();
//        IMediator.registerHandler(CrearCheckInHandler.class);
//        services.AddTransient(ICheckInFactory.class, CheckInFactory.class);
//        services.AddTransient(IcheckInRepository.class, IcheckInRepository.class);
//    }

    public static void AddApplication() {
        //INFO:Usamos el IMediator del kernel en cambio del MediatR de Spring
        IMediator.registerHandler(GetCheckInByIdHandler.class);
        IMediator.registerHandler(CrearCheckInHandler.class);
        IServiceCollection.AddTransient(ICheckInFactory.class, CheckInFactory.class);
    }
}
