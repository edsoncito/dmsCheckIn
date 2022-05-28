package EF;

import EF.Contexts.IWriteDbContext;
import EF.Contexts.MongoDb.WriteDbContext;
import Repositories.IUnitOfWork;
import core.DomainEvent;
import http.Exception.HttpException;
import mediator.Mediator;

import java.util.List;

public class UnitOfWork implements IUnitOfWork {

    private IWriteDbContext _context;
    private Mediator _mediator;

    public UnitOfWork(IWriteDbContext context, Mediator mediator) {
        _context = context;
        _mediator = mediator;
    }

    @Override
    public void commit() throws HttpException {
        List<DomainEvent> events = _context.getDomainEvents();
        for (DomainEvent domainEvent : events) {
            _mediator.notify(domainEvent);
        }
        _context.Commit();
    }
}
