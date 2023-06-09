package JavaExpansionConcepts.NestedClasses;
/**
 * NON-STATIC INNER CLASS
 * Is a class within another class
 * Has no static keyword modifier
 * It has access to the enclosing (outer) class members
 * Because it's just a normal class member (bellonging the outer class), the outer class
 * must be instantiated before it can be used
 * 
 * Here is an example:
 */
class CPU {
    Double price;

    //nested class
    class Processor {
        //members of the nested class
        Double cores;
        String manufacturer;

        Double getCache() {
            return 4.3;
        }
    }

    //nested protected class
    protected class RAM {
        //members of the protected nested class
        Double memory;
        String manufacturer;

        Double getClockSpeed() {
            return 5.5;
        }
    }

    //a nested class can extend any other class, even the nested ones, just as normal
    class HardDisk extends CPU.RAM {
        //inherits the members of the RAM class
        //we can also override/ add our own properties to this child class as usual
        Double diskSize;
        void setDiskSize(double size) {
            this.diskSize = size;
        }
        Double getDiskSize() {
            return diskSize;
        }
    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
        //to use the inner classes, we need an instance of the outer class
        CPU cpu = new CPU();

        //create an object/ instance of the inner class Processor using the outer class
        CPU.Processor processor = cpu.new Processor(); //synatx is x.new InnerClass()
        System.out.println(processor.getClass());

        //create an instance of the nested class RAM using the outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor cache: " + processor.getCache());
        System.out.println("RAM clock speed: " + ram.getClockSpeed());

        //create an instance of the nested class HardDisk
        CPU.HardDisk hardDisk = cpu.new HardDisk();
        hardDisk.setDiskSize(3.4);
        System.out.println("Hard disk size: " + hardDisk.getDiskSize() + "Tbs");

        //using the Car class- example accessing outer class members using inner class
        Car car1 = new Car("Mazda", "8WD");

        //create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine type for 8WD: " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2Engine =  car2.new Engine();
        c2Engine.setEngine();
        System.out.println("Engine type for 4WD: " + c2Engine.getEngineType());
    }
}

//accessing members of outer class within inner class
class Car {
    String carName;
    String carType;

    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    //private method
    private String getCarName() {
        return this.carName;
    }

    //inner class
    class Engine {
        String engineType;
        void setEngine() {
            //accessing the carType property of car
            if(Car.this.carType.equals("4WD")) {
                //invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            } else {
                this.engineType = "Bigger";
            }
        }

        String getEngineType() {
            return this.engineType;
        }
    }
}
