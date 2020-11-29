import java.util.*;

public class Solution<Key extends Comparable<Key>, Value>  {
    Node root;
    int size;             

     class Node {
        Key key;           
        Value val;         
        Node left, right;  

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }
    public Solution(){
    	int size = 0; 
    	root=null;
    }

    public boolean isEmpty() {
        if(size == 0){
        	return true;
        }
        return false;
    }

    public int size() {
      return size;
    }

    public boolean contains(Key key) {
    	Node curNode = root;
       if(key == null){
       		throw new IllegalArgumentException("There is not key conatin in the root");
       }
       else{
       		while(curNode.key != key){
       			int cmp = key.compareTo(curNode.key);
       			if(cmp < 0){
       				curNode = curNode.left;
       			}
       			else{
       				curNode = curNode.right;
       			}
       		}
       		return true;
       }
    }


    public Value get(Key key) {
    	if(key == null){
	        throw new IllegalArgumentException("argument to get value() is null");
	    }
        Node curNode = root;
        while(curNode.key != key){
        	int cmp = key.compareTo(curNode.key);
        	if(cmp < 0){
        		curNode = curNode.left;
        	}
	        else if(cmp > 0){
	        	curNode = curNode.right;
	        }
        }
        if(curNode.key == key){
        	System.out.println(curNode.val);
        }
        return curNode.val;
    }

   public void put(Key key, Value val) {
        if (key == null){
            System.out.println("Key Cannot be Null!!!");
            return;
        }

        Node newest = new Node(key, val);

        if (root == null){
            root = newest;
            size++;
        }
        else{
            Node curNode = root;
            Node parent;
            while (true){
                parent = curNode;
                int cmp = key.compareTo(curNode.key);
                if (cmp<0){
                    curNode = curNode.left;
                    if (curNode==null){
                        parent.left = newest;
                        size++;
                        return;
                    }
                    else if(curNode.key == key){
                        curNode.val = val;
                        return;
                    }
                }
                else if (cmp>0){
                    curNode = curNode.right;
                    if (curNode==null){
                        parent.right = newest;
                        size++;
                        return;
                    }
                    else if (curNode.key == key){
                        curNode.val = val;
                        return;
                    }
                }
            }
        }
   }

    public Key min() {
       if(isEmpty()){
       	throw new NoSuchElementException("There is no element in the tree");
       }
       else{
       		Node curNode = root;
       		while(curNode.left != null){
       			curNode = curNode.left;
       		}
       		return curNode.key;
       }
    } 

    public Key max() { 
        if(isEmpty()){
       		throw new NoSuchElementException("There is no element in the tree");
       }
       else{
       		Node curNode = root;
       		while(curNode.right != null){
       			curNode = curNode.right;
       		}
       		return curNode.key;
       }
    } 

   
	public Key floor(Key key){
		if(isEmpty()){
			throw new NoSuchElementException("calls floor() with empty symbol table");
		}
		Node curNode = root;
		Node parent = null;
		while(curNode != null){
			parent = curNode;
			int cmp = key.compareTo(parent.key);
			if(key == null){
				throw new IllegalArgumentException("calls floor() with a null key");
			}
			if(cmp == 0){
				return parent.key;
			}
			if(cmp < 0){
				curNode = parent.left;
			}

			else if(cmp > 0){
				curNode = parent.right;
				int cm = key.compareTo(curNode.key);
				if(cm < 0 ){
					return parent.key;
				}
				else{
					curNode = parent.right;
				} 
			}
		}
		return parent.key;
	}
    public Key select(Key key){
		if(isEmpty()){
			throw new NoSuchElementException("calls floor() with empty symbol table");
		}
		Node curNode = root;
		Node parent = null;
		while(curNode != null){
			parent = curNode;
			int cmp = key.compareTo(parent.key);
			if(key == null){
				throw new IllegalArgumentException("calls floor() with a null key");
			}
			if(cmp > 0){
				curNode = parent.right;
			}
			
			else if(cmp < 0){
				curNode = parent.left;
				
				int cm = key.compareTo(parent.key);
				if(cm > 0 ){
					return curNode.key;
				}

				else{
					curNode = parent.left;
				} 
			}
		}
		return parent.key;
	}
    
    public void keys(Key lo, Key hi){
    	if(lo == null || hi == null){
        	throw new IllegalArgumentException("calls keys() with a null key");
        }
    	Node curNode = root;
    	Node parent;
        while(curNode != null) {
        	parent = curNode;
        	if(parent == null) { 
            	return; 
        	} 
        	int cmp = lo.compareTo(parent.key);
    		int cm = hi.compareTo(parent.key); 
            if (cmp < 0) { 
            	curNode = parent.left;
        	}
        	if (cmp <= 0 && cm >= 0) { 
            	System.out.print(parent.key + " "); 
        	} 
        	if (cm > 0) { 
            	curNode = parent.right;
        	}
        }
    }
    
    public static void main(String[] args) { 
        Solution <String, Integer> obj = new Solution <String, Integer>();
        obj.put("ABDUL",1);
        obj.get("ABDUL");
        obj.put("HRITHIK",2);
        obj.put("SAI",3);
        obj.put("SAMAL",6);
        obj.get("SAI");
        obj.put("TASHI",4);
        System.out.println(obj.size());
        System.out.println(obj.min());
        System.out.println(obj.floor("HRITHIK"));
        System.out.println(obj.floor("HAHA"));
        System.out.println(obj.select("HRITHIKH"));
        obj.keys("ABDUL","TASHI");
        System.out.println();
        obj.put("CHIMI",5);
        obj.put("SAMAL",4);
        obj.get("SAMAL");
        obj.put("NIMA",7);
        System.out.println(obj.size());
        obj.get("CHIMI");
        System.out.println(obj.floor("CHIMI"));
        obj.put("SONAM",8);
        obj.keys("ABDUL","TASHI");
    }
}