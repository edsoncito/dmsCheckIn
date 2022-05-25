import EF.Contexts.IWriteDbContext;
import EF.Contexts.MongoDb.WriteDbContext;
import EF.Repository.CheckInRepository;
import EF.UnitOfWork;
import MomoryRepository.MemoryCheckInRepository;
import MomoryRepository.MemoryDataBase;
import Repositories.IUnitOfWork;
import Repositories.IcheckInRepository;
import extensions.IServiceCollection;

public class ExtensionsInfrastructure {

    public static void AddInfraestructure(){
//        Extensions.AddApplication();
//        IServiceCollection.AddSingleton(MemoryDataBase.class);
//        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
//        IServiceCollection.AddScoped(IcheckInRepository.class, MemoryCheckInRepository.class);

        Extensions.AddApplication();
        IServiceCollection.AddMediator();
        IServiceCollection.AddScoped(IWriteDbContext.class, WriteDbContext.class);
        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
        IServiceCollection.AddScoped(IcheckInRepository.class, CheckInRepository.class);
        //IServiceCollection.AddScoped(IAsientoRepository.class, AsientoRepository.class);
        //IServiceCollection.AddScoped(IMarcaRepository.class, MarcaRepository.class);
    }
}
