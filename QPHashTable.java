package DB4_Assignment;
/**
 * Simple hash table implementation using quadratic probing.
 *
 * @author Stephan Jamieson
 * @version 24/4/2015
 */
public class QPHashTable  extends HashTable {


    /**
     * Create an QPHashTable with DEFAULT_SIZE table.
     */
    public QPHashTable() { super(); }

    /**
     * Create an QPHashTable with the given default size table.
     */
    public QPHashTable(final int size) { super(size); }

    /**
     * Find the index for entry: if entry is in the table, then returns its position;
     * if it is not in the table then returns the index of the first free slot.
     * Returns -1 if a slot is not found (such as when the table is full under LP).
     *
     */
    protected int findIndex(String key) {
		// Implement using quadratic probing.
    
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
        index = (index*index)/size();
        if(index > size()){
          index =0 ;
        }
            }
      }
  

        return index;

   }
    }

