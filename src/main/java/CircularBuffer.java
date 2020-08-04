public class CircularBuffer {

    private int bufferSize = 10;
    private String[] buffer = new String[10];
    private int readPointer;
    private int writePointer;

    // Default constructure
    public CircularBuffer(){
        //this.buffer = new String[10];
        this(10);
    }

    // Overload constructure
    public CircularBuffer(int size){
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData(){
        return this.buffer[readPointer++];
    }
}
