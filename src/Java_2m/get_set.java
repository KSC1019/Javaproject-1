package Java_2m;

class Car{
    //필드
    private int speed;
    private boolean stop;
    //생성자
    //메소드
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed<0){
            this.speed = 0;
            return;
        }else{
            this.speed = speed;
        }
    }
    public boolean isStop(){
        return stop;
    }
    public void setStop(boolean stop){
        this.stop = stop;
        this.speed = 0;
    }
}
public class get_set {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.setSpeed(30);

        System.out.println("현재 속도 : " + mycar.getSpeed());
        mycar.setSpeed(70);
        if(!mycar.isStop()){
            mycar.setStop(true);
        }
        System.out.println("현재 속도 : " + mycar.getSpeed());

    }
}
