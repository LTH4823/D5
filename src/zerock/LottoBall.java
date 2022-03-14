package zerock;

public class LottoBall {

    private int num;

    public LottoBall(int num) {
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    public boolean greater(LottoBall otherBall){

        if(this.num < otherBall.num){
            otherBall.num += 100;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LottoBall{" +
                "num=" + num +
                '}';
    }
}
