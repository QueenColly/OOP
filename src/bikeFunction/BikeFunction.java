package bikeFunction;

public class BikeFunction {
   private boolean isOn;
   private int speed;
   private int gear;

    public boolean turnOn() {
        speed = 0;
        gear = 1;
        return isOn = true;
    }

    public boolean turnOff() {speed = 0;gear = 0;return isOn = false;}

    public boolean checkPowerStatus() {
        return isOn;
    }

    public void setGear() {

        if(speed > 0 && speed <= 20){
            gear = 1;
        }
        else if(speed > 20 && speed <= 30){
            gear = 2;
        }
        else if(speed > 30 && speed <= 40){
            gear = 3;
        }
        else if(speed > 40 ){
            gear = 4;
        }

    }

    public int getGear() {
        return gear;
    }
    public int getSpeed() {return speed;}

    public void accelerate() {
        if (!isOn) return;
        speed = speed + gear;
        setGear();

    }
        public void decelerate(){
            if(!isOn) return;
            speed =  speed - gear;
            if (speed < 0) {
                speed = 0;
            }
            setGear();
        }
}

