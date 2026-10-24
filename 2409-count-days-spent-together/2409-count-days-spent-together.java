class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days={0,31,59,90,120,151,181,212,243,273,304,334,365};
        int maA=Integer.parseInt(arriveAlice.substring(0,2));
        int mlA=Integer.parseInt(leaveAlice.substring(0,2));
        int maB=Integer.parseInt(arriveBob.substring(0,2));
        int mlB=Integer.parseInt(leaveBob.substring(0,2));
        int aA=days[maA-1]+Integer.parseInt(arriveAlice.substring(3,5));
        int lA=days[mlA-1]+Integer.parseInt(leaveAlice.substring(3,5));
        int aB=days[maB-1]+Integer.parseInt(arriveBob.substring(3,5));
        int lB=days[mlB-1]+Integer.parseInt(leaveBob.substring(3,5));
        if(aB>=aA && aB<=lA) return Math.min(lA,lB)-aB+1;
        if(aA>=aB && aA<=lB) return Math.min(lB,lA)-aA+1;
        return 0;
    }
}