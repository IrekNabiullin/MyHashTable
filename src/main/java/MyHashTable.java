/*
Hashtable хранит пары ключ/значение в хеш-таблице.
Объект используется в качестве ключа, и объект в качестве значения,
Затем ключ хэшируется и полученный хеш-код используется в качестве индекса, по которому значение сохраняется в таблице.
 */


public class MyHashTable<K, V> {
    private int count = 0;
    private float loadFactor;
    private int capacity = 16;

    public MyHashTable(int capacity) {
        this.capacity = capacity;
    }

    public MyHashTable(float loadFactor, int capacity) {
        this.loadFactor = loadFactor;
        this.capacity = capacity;
    }

    public MyHashTable() {
        this.loadFactor = 0.75f;
        this.capacity = 16;
    }

    private MyNode[] myTable = new MyNode[capacity];

    public V put(K key, V value) {
        int hash = key.hashCode();
        if (value == null) {
            throw new NullPointerException();
        } else {
            System.out.println("count = " + count);
            if (count + 1 >= capacity * loadFactor) {
                resizeMyTable();
            }
            int index = hash % (capacity - 1);
            System.out.println("index = " + index);
            if (myTable[index] == null) {
                myTable[index] = new MyNode(hash, key, value, null);
                count++;
//                System.out.println("myTable[" + index + "].key.hashCode() = " + myTable[index].key.hashCode());
//                System.out.println("myTable.length = " + myTable.length);
//                for (int i = 0; i < myTable.length; i++) {
//                    if (myTable[i] != null) {
//                        System.out.println(myTable[i].getValue());
//                    } else System.out.println("null");
//                }
            } else {
                if (myTable[index].getValue().equals(value)) {
                    myTable[index].setValue(value);
                    return value;
                } else {
                    myTable[index].setNextNode(new MyNode<>(hash, key, value, null));
                    return null;
                }
            }
        }
        return null;
    }

    private void resizeMyTable() {
        System.out.println("resizeMeTable starting");
        int newCapacity = (int) (capacity * 1.5f + 1);
        System.out.println("newCapacity =  " + newCapacity);
        MyNode[] myNewTable = new MyNode[newCapacity];
        MyNode[] temporaryTable = myTable;

        System.out.println("myNewTable.length = " + myNewTable.length);
        System.out.println("temporaryTable.length = " + temporaryTable.length);
        System.out.println("myTable.length = " + myTable.length);

        for (int i = 0; i < capacity; i++) {
            System.out.println("temporaryTable[" + i + "] = " + temporaryTable[i]);
            if (temporaryTable[i] != null) {
                int newIndex = temporaryTable[i].getHashcode() % (newCapacity);
                System.out.println("newIndex = " + newIndex);
                myNewTable[newIndex] = temporaryTable[i];
                System.out.println("myNewTable[" + newIndex + "] = " + myNewTable[newIndex]);
                System.out.println("temporaryTable[" + i + "] = " + temporaryTable[i]);
            }
        }
        myTable = myNewTable;
        System.out.println("myTable.length = " + myTable.length);
        for (int i = 0; i < myTable.length; i++) {
            if (myTable[i] != null) {
                System.out.println(myTable[i].getValue());
            } else System.out.println("null");
        }
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return count;
    }
}
