public class Inheritence {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MountainBike m = new MountainBike(1, 2, 3);
        m.MountainBike();
    }

}

class MotorBike {   // MotorBike
    protected int gear;
    protected int speed;

    public MotorBike(int startGear, int startSpeed) {
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

class MountainBike extends MotorBike {
    public int seatHeight;

    public MountainBike(int startGear, int startSpeed, int startSeatHeight) {
        super(startGear, startSpeed);
        seatHeight = startSeatHeight;
    }

    public void MountainBike() {
        System.out.println("Gear: " + gear);
        System.out.println("Speed: " + speed);
        System.out.println("Seat Height: " + seatHeight);
    }
}
