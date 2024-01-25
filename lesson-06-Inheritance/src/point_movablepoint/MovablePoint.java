package point_movablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float YSpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = YSpeed;
    }

    public MovablePoint(float xSpeed, float YSpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = YSpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.ySpeed = YSpeed;
    }
    public  void setSpeed (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed (){
        return new float[] {xSpeed, ySpeed};

    }
    public MovablePoint move(){
        x = x + xSpeed;
        y = y + ySpeed;
        return this ;
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
