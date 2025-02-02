public class Q10_TowerOfHanoi {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==1)
        {
            return 1;
        }
        int count= towerOfHanoi(n-1, from, aux, to);
        count +=1;
        count+=towerOfHanoi(n-1,aux, to, from);
        return count;
    }
    public static void main(String[] args) {
        
        Q10_TowerOfHanoi tower = new Q10_TowerOfHanoi();
        int n=3;
        System.out.println("Total number of moves : "+tower.towerOfHanoi(n, 1, 3, 2));
    }
}
