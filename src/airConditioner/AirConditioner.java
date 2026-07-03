package airConditioner;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 0;
    int count = 1;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean checkPowerStatus() {
        return isOn;
    }

    public boolean increaseTemperature() {
        return true;
    }

    public boolean decreaseTemperature() {
        return true;
    }

    public void setTemperature(int temperature){
        if(temperature < 16){
            this.temperature = 16;
        }
        if (temperature <= 16 && temperature >= 30){
            this.temperature = temperature;
        }
        if (temperature > 30){
            this.temperature = 30;
        }
       }

    public int getTemperature() {
        return this.temperature;
    }
    public void temperatureIncreaseToHigh() {
      setTemperature(count);
      count++;

    }

    public void temperatureDecreaseToLow() {
        setTemperature(count);
        count--;
    }
}
