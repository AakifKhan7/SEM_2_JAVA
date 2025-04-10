package Chapter3;

public class PB102 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        t.start();
        try {
            
            

            Thread.sleep(1000);
            Thread.sleep(-1000);
        } catch (InterruptedException i) {
            System.out.println(i);
        }
        catch(IllegalArgumentException il) {
            System.out.println(il);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        t.interrupt(); 
    }
}
