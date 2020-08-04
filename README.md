# Circular buffer

1. Data structure ? (Internal)
* Array of String

2. Operations/Behavior/Methods ? user -> CB ?
* writeData(string):void
* readData(): string
* isFull(): boolean
* isEmpty(): boolean
* setSize(int): void

3. Internal process ?
* buffer size = 10 (default)
* read pointer = 0
* write pointer = 0

4. List of test cases
* TC01 => isEmpt() 
* TC02 => isFull() 
* TC03 => writeData(string):void, readData(): string
* TC04 => 1 commit
* TC05 => 1 commit

