public class Singleton {
    private static Singleton instance;

    public car value;

    private Singleton(car value) throws InterruptedException {
        try{
          Thread.sleep(1000);
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(car value) throws InterruptedException {
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }

}
