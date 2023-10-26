public class MyArrayTest {
    public void main(String[] args) {

        Vehicle mycar = new Car();

        if(mycar instanceof Car){

        }
    }

    public interface Vehicle{

    }

    public class Car implements Vehicle{
        public Car() {
        }
    }
}
