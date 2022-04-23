package util;


import org.springframework.scheduling.config.Task;

public interface Repository<T extends AggregateRoot<TId>, TId> {

    Task FindByIdAsync(TId id);

    Task CreateAsync(T obj);

}
