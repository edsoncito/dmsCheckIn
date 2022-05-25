package EF.Contexts;

import db.DbContext;
import db.DbSet;

public abstract class IWriteDbContext extends DbContext {

    public IWriteDbContext(Class dbContextClass) {
        super(dbContextClass);
    }
    //public DbSet<Aeronave> Aeronave;
    //public DbSet<Asiento> Asiento;
    //public DbSet<Marca> Marca;
}

