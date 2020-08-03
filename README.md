# Best practices for writing Dockerfiles -TH

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
* TC01 => 1 commit : set default of isEmpt(), isFull(), writeData(string):void, readData(): string
* TC02 => 1 commit
* TC03 => 1 commit
* TC04 => 1 commit
* TC05 => 1 commit

