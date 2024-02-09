package deep17;

public class NoOfDiceRollsWthTargerSumWthCustomNoFaces {
    public static void main(String[] args) {
        dice("",4,8);
    }
    static void dice(String processed , int target,int face){
        if(target==0){
            System.out.println(processed);
            return;
        }
        for(int i=1;i<=face && i<=target;i++){
            dice(processed+i,target-i,face);
        }
    }
}
