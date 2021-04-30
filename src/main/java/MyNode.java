public class MyNode <K,V> {
    int hashcode;
    K key;
    V value;
    MyNode<?,?> nextNode;

    public MyNode(int hashcode, K key, V value, MyNode<?, ?> nextNode) {
        this.hashcode = hashcode;
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    public int getHashcode() {
        return hashcode;
    }

    public void setHashcode(int hashcode) {
        this.hashcode = hashcode;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyNode<?, ?> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode<?, ?> nextNode) {
        this.nextNode = nextNode;
    }
}
