
package org.example.InnerClassesPackage;

public class MemberInnerClasses {
    public Car car;

    public MemberInnerClasses(String model, String brand) {
        this.car = new Car(model, brand);
    }

    public class Car {
        private String model;
        private String brand;
        private Engine engine;

        public Car(String model, String brand) {
            this.model = model;
            this.brand = brand;
            this.engine = new Engine();
        }

        public class Engine {
            private boolean isEngineOn = false;

            public void start() {
                if (isEngineOn) {
                    System.out.println(model + " is already started..");
                } else {
                    isEngineOn = true;
                    System.out.println(model + " is now started..");
                }
            }

            public void stop() {
                if (!isEngineOn) {
                    System.out.println(model + " is already stopped..");
                } else {
                    isEngineOn = false;
                    System.out.println(model + " is now stopped..");
                }
            }
        }

        public Engine getEngine() {
            return engine;
        }

        public void showDetails() {
            System.out.println("Car Model: " + model + ", Brand: " + brand);
        }
    }
}
