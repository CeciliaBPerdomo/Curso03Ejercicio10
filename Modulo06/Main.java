public class Main {
 public static void main(String[] args) {
    // CocheCRUD cocheCrud = new CocheCRUDImpl()
    cocheCrud cocheCrud = new cocheCRUDImpl();

    cocheCrud.save();
    cocheCrud.delete();
    cocheCrud.findAll();
 }   
}
