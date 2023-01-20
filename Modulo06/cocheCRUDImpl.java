public class cocheCRUDImpl implements cocheCrud {

    @Override
    public void save() {
        System.out.println("Metodo guardar");
    }

    @Override
    public void delete() {
        System.out.println("Metodo borrar");   
    }

    @Override
    public void findAll() {
        System.out.println("Metodo buscar"); 
    }
    
}
