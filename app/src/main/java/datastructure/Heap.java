package datastructure;

public class Heap {
    private int[] data;
    private int height;
    private int capacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.height = 0;
    }

    private int getParentNode(int pos) {
        return (pos - 1) / 2;
    }

    private int getLeftChildNode(int pos) {
        return (pos * 2) + 1;
    }

    private int getRightChildNode(int pos) {
        return (pos * 2) + 2;
    }

    private void swapNodes(int firstPos, int secPos) {
        int temp = data[firstPos];
        data[firstPos] = data[secPos];
        data[secPos] = temp;
    }

    public boolean isFull() {
        return height == capacity;
    }

    public void insert(int element) {
        if (isFull())
            throw new RuntimeException("Heap is full");

        data[height] = element;
        height++;

        int currentElement = height - 1;

        while (currentElement > 0 && data[currentElement] > data[getParentNode(currentElement)]) {
            swapNodes(currentElement, getParentNode(currentElement));
            currentElement = getParentNode(currentElement);
        }
    }

    public void heapify(int index) {
        int largestChild = index;
        int leftChild = getLeftChildNode(index);
        int rightChild = getRightChildNode(index);

        if (leftChild < height && data[leftChild] > data[largestChild]) {
            largestChild = leftChild;
        }

        if (rightChild < height && data[rightChild] > data[largestChild]) {
            largestChild = rightChild;
        }

        if (largestChild != index) {
            swapNodes(index, largestChild);
            heapify(largestChild);
        }
    }

    public void printHeap() {
        for (int i = 0; i < height; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        Heap maxHeap = new Heap(10);
        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(4);

        maxHeap.printHeap();
        maxHeap.heapify(2);
        maxHeap.printHeap();
    }
}
