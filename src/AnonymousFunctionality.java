import com.sun.org.glassfish.gmbal.ManagedObject;

public class AnonymousFunctionality {

    public interface Mobile{
        void call();
    }

    public static class ChakriMobile implements Mobile{
        @Override
        public void call(){
            System.out.println("Chakri Mobile");
        }
    }

    public static void main(String args[]){
        Mobile chakriMobile = new ChakriMobile();
        chakriMobile.call();
        (new Mobile() {
            @Override
            public void call() {
                System.out.print("Ananya Mobile");
            }
        }).call();
    }
}
