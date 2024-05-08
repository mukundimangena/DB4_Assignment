package DB4_Assignment;
import java.util.List;
/**
 * Simple hash table implementation using linear probing.
 *
 * @author Stephan Jamieson
 * @version 24/4/2015
 */
public class LPHashTable extends HashTable {

    /**
     * Create an LPHashTable with DEFAULT_SIZE table.
     */
    public LPHashTable() { super(); }

    /**
     * Create an LPHashTable with the given default size table.
     */
    public LPHashTable(final int size) { super(size); }

    /**
     * Find the index for entry: if entry is in the table, then returns its position;
     * if it is not in the table then returns the index of the first free slot.
     * Returns -1 if a slot is not found (such as when the table is full under LP).
     *
     */
    protected int findIndex(String key) {
		// Implement using linear probing
    //Return the index if it is in the table  
    //and if a free slot is not found we return -1 
    
      int index =  hashFunction(key);
      int empty = -1;

      for(String i : table){
        if(i==null){
          empty = 0;
          
          break;
        }
      }

      if(empty==-1){
        return -1;
      }


      //if the position where 
      if (table[index]==null && empty==0){
        index = index;
      }
      else if(table[index]!=null){
        while(table[index]!=null){
          index = (index+1);
          if(index > size()){
            index =0 ;
          }
              }
        }
    

          return index;

     }
}
