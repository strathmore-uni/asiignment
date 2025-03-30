//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Appliance fan = new Fan(); // Create object of Fan
            Appliance tv = new TV();   // Create object of TV

            // Call the turnOn() method for both objects
            fan.turnOn(); // Output: Fan is now on
            tv.turnOn();  // Output: TV is now on
        }
    }