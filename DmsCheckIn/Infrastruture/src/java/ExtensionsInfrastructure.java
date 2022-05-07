import EF.UnitOfWork;
import MomoryRepository.MemoryCheckInRepository;
import MomoryRepository.MemoryDataBase;
import Repositories.IUnitOfWork;
import Repositories.IcheckInRepository;
import SharedKernel.extensions.IServiceCollection;

public class ExtensionsInfrastructure {

    public static void AddInfraestructure(){
        Extensions.AddApplication();
        IServiceCollection.AddSingleton(MemoryDataBase.class);
        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
        IServiceCollection.AddScoped(IcheckInRepository.class, MemoryCheckInRepository.class);

    }
}
