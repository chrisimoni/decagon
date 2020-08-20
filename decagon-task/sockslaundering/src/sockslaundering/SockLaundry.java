package sockslaundering;

public class SockLaundry {
	 //Do not delete or edit this method, you can only modify the block
    public int getMaximumPairOfSocks(int noOfWashes, int[] cleanPile, int[] dirtyPile) {
        int pairs = 0;
        int range = 51;
        
        int[] clean = countOccurrence(range, cleanPile);
        int[] dirty = countOccurrence(range, dirtyPile);;
        
        for(int i = 0; i < range; i++)
        {
        	pairs += clean[i]/2;
            if(clean[i] % 2 != 0 && noOfWashes > 0 && dirty[i] > 0)
            {
            	pairs++;
                noOfWashes--;
                dirty[i]--;
            }
        }
        
        for(int i = 0; noOfWashes > 1 && i< range; i++)
        {
            if(dirty[i] >= 2)
            {
                dirty[i] = Math.min(dirty[i] / 2, noOfWashes / 2);
                pairs += dirty[i];
                noOfWashes -= 2 * dirty[i];
            }
        }      
        
        return pairs;
    }

    /**
     * You can create various helper methods
     * */
    
    private int[] countOccurrence(int range, int[] arr) {
    	int[] x = new int[range];
    	for(int i: arr) {
        	x[i]++;
        }
    	
		return x;
    	
    }
    
    
}
