import java.util.Arrays;

interface Enumeration {
    // Returns true if another element in the collection exists
    public boolean hasNext();
    
    // Returns the next element in the collection as an Object
    public Object getNext();
}

class NameCollection {
    String[] names;
    
    // The list of names is initialized from outside
    // and passed in as an array of strings
    NameCollection(String[] names) {
        this.names = names;
    }
    
    // getEnumeration should return an instance of a class that
    // implements the Enumeration interface where hasNext() and getNext()
    // correspond to data stored within the names array.
    Enumeration getEnumeration() {
        return new Enumeration() {
            private int index = 0;
            
            public boolean hasNext() {
                return index < names.length;
            }
            
            public Object getNext() {
                return names[index++];
            }
        };
    }
    
    public static void main(String[] args) {
        String[] sampleNames = {"John", "Jane", "Alice", "Bob"};
        NameCollection nameCollection = new NameCollection(sampleNames);
        Enumeration enumeration = nameCollection.getEnumeration();
        
        while (enumeration.hasNext()) {
            System.out.println(enumeration.getNext());
        }
    }
}