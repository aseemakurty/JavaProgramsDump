public class Singleton {

    private Singleton(){

    }
    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getSingletonInstance(){
        return SingletonHelper.INSTANCE;
    }
}
