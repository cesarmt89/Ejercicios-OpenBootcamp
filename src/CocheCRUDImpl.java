import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        System.out.println("Metodo save");
    }

    @Override
    public List<Coche> findAll() {
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Metodo Delete");
    }
}
