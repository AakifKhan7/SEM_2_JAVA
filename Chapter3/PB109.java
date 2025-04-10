/* 
 * It is required to maintain and process the status of total 9 resources. The
status value is to be stored in an integer array of dimension 3x3. The valid
status of a resource can be one of the 2 followings:
free: indicated by integer value 0
occupied: indicated by integer value 1
inaccessible: indicated by integer value 2
Declare a class called ResourcesStatus, having data member called
statusRef, referring to a two dimensional array (3x3) of integers to be
used to refer to the above mentioned status values.
Define a member method called processStausCount that counts and
displays total number of free resources, total number of occupied
resources and total number of inaccessible resources. The exception to be
raised and handled if total number of occupied resources exceeds total
number of free resources.
The handler marks status of all inaccessible resources as free. Accept
initial status values from command line arguments and initialize the array.
Raise and handle user defined exception if invalid status value given

 */

package Chapter3;

class InvalidStatusException extends RuntimeException{
    InvalidStatusException(String message){
        super(message);
    }
}

class TooManyOccupiedException extends RuntimeException{
    TooManyOccupiedException(String message){
        super(message);
    }
}

public class PB109 {
    public static void main(String[] args) {
        ResourcesStatus rs = new ResourcesStatus();
        try{
            rs.initializeStatus(args);
            rs.processStausCount();
        }catch(InvalidStatusException ie){
            System.out.println(ie);
        }catch(TooManyOccupiedException te){
            System.out.println(te);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

class ResourcesStatus{
    int [][] statusRef = new int[3][3];

    public void initializeStatus(String[] args) throws InvalidStatusException {
        if (args.length != 9) {
            throw new InvalidStatusException("Exactly 9 status values required.");
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = Integer.parseInt(args[index++]);
                if (val < 0 || val > 2) {
                    throw new InvalidStatusException("Invalid status value: " + val);
                }
                statusRef[i][j] = val;
            }
        }
    }

    void processStausCount(){
        int free = 0;
        int occupied = 0;
        int inaccessible = 0;
        for(int i = 0; i < statusRef.length; i++){
            for(int j = 0; j < statusRef[i].length;j++){
                switch (statusRef[i][j]) {
                    case 0 -> free++;
                    case 1 -> occupied++;
                    case 2 -> inaccessible++;
                }

            }
        }
        if (occupied > free) {
            throw new TooManyOccupiedException("Occupied resources exceed free resources.");
        }

        System.out.println("Free: " + free);
        System.out.println("Occupied: " + occupied);
        System.out.println("Inaccessible: " + inaccessible);
    }

    public void handleInaccessible(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (statusRef[i][j] == 2) {
                    statusRef[i][j] = 0;
                }
            }
        }
    }
}
