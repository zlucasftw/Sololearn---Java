package creating_classes_objects;

public class Main {
    public static void main(String[] args) {

        //create a Loading object with the same name
        Loading loading = new Loading();

        loading.LoadingMessage();
    }
}

class Loading {
    //complete the class, add LoadingMessage() method
    public void LoadingMessage() {
        System.out.println("Loading");
    }
}
