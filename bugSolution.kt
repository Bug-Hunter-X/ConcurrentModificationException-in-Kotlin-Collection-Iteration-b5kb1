```kotlin
fun main() {
    val arrayList = arrayListOf(1, 2, 3, 4, 5)

    // Safe methods to modify the list while iterating:
    val safeList1 = arrayList.toMutableList() //create a copy and iterate over it
    for (item in safeList1) {
        if (item % 2 == 0) {
            safeList1.remove(item)
        }
    }
    println("Safe Method 1: " + safeList1) 

    val safeList2 = arrayList.filter { it % 2 != 0 } //create a new list with filtered elements
    println("Safe Method 2: " + safeList2)
    
    val safeList3 = arrayListOf<Int>() //create a new list and add only odd elements
    for (item in arrayList) {
        if (item % 2 != 0) {
            safeList3.add(item)
        }
    }
    println("Safe Method 3: " + safeList3)
    
    //Using removeIf which is thread safe
    val mutableList = arrayList.toMutableList()
    mutableList.removeIf { it % 2 == 0 }
    println("Safe Method 4: " + mutableList) 
}
```