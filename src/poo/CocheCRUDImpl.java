package poo;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Es el método \"save\"");
    }

    @Override
    public void findAll() {
        System.out.println("Es el método \"findAll\"");
    }

    @Override
    public void delete() {
        System.out.println("Es el método \"delete\"");
    }
}
