import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.logging.LogManager
import javax.print.DocFlavor

/*
        val formatter = DateTimeFormatter.ISO_LOCAL_TIME
        val time = { formatter.format(LocalDateTime.now()) }


        suspend fun getTime(): Double {
            println("Entering value : ${time()}")
            delay(3000)
            println("Closing value : ${time()}")
            return Math.random()
        }

        runBlocking {
                val num1 = async { getTime() }
                val num2 = async { getTime() }
                println("Num1 : $num1 , Num2 : $num2 , sum : ${num1.await() + num2.await()}")
            }

*/

fun main() {

    val person = Person()
    person.apply {
        name = "Natu"
        contactNumber = "9429957789"
        address = "Earth"
    }.also {
        writeCreationLog("Name : ${it.name} , Contact Number : ${it.contactNumber}, address : ${it.address}")
    }


}

fun writeCreationLog(str: String?) {
    println("Write Creation Log : $str")
}


/*
    ***** apply scope function *****
    *
    val developer = Developer()
    val devString = developer.apply {
        name = "Natavar"
        field = "Android Developer"
        experience = "4.5 Months"
    }.toString()

    println(devString)

    class Developer {
        var name: String? = null
        var field: String? = null
        var experience: String? = null
    }

 */

/*
        ***** with and apply example *****

            val person = Person()

            person.apply {
                name = "Natu"
                contactNumber = "9429957789"
                address = "Earth"
            }

            with(person){
               println("$name")
               println("$contactNumber")
               println("$address")
            }


 */


/*

    ******* run example **********


    getNullableLength(null)
    getNullableLength(" ")
    getNullableLength("Indialone")

    fun getNullableLength(ns : String?) {
    println("Printing \"$ns\" : ")
    ns?.trim()?.run {
       println("is Empty ? : ${isEmpty()}")
       println("given value : $ns")
    }
}


 */

/*
    ***** let example *****

        val test = "test".let {
            println(it)
            it.isEmpty()
        }

        println("is Empty : $test")

        printNonNull(null)
        printNonNull("my string")
        printBothNonNull("Hello" , "World")

            fun printBothNonNull(string1: String?, string2: String?) {
                println("Printing \"$string1\" & \"$string2\" :")

                string1?.let { firstString ->
                    print("\t")
                        string2?.let { secondString ->
                            println("\t")
                            println("$firstString & $secondString")
                        }
                    }
                }

        fun printNonNull(string: String?) {
            println("Printing \"$string\":")

            string?.let {
                print("\t")
                print(it)
            }
        }
 */


/*

    println("Person name : ${person.name}")
    person.apply {
        this.name = "Natu"
    }

    println("name ${person.name}")

    person.let {
        it.name = "Uru"
    }

    println("name ${person.name}")

    person.also {
        it.name = "Natu"
    }
    println("name : ${person.name}")

    val name = person.name?.let {
        println("name : $it")
    }

 */

/*
    map functionality

    val names = mutableListOf("Uru" , "Natu" , "Hardy","DonHardy")
    val finalResult = names.map { it.length }.filter { it > 5 }
    println(finalResult)
 */


//}
/*
private fun performLetOperation() {
    val person = Person().let {
        return@let "Name of the person ${it.name}"
    }
    println(person)
}

private fun performApplyOperation() {
    Person().apply {
        this.name = "Uru"
        this.contactNumber = "164141654"
        this.address = "49B Rajendra Colony , Mehsana Road , Visnager"
    }
}
*/
/*

    val states = arrayOf("Starting" , "Doing task 1" , "Doing task 2" , "Ending")
    repeat(3) {
        GlobalScope.launch {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                delay(5000)
            }
        }
    }

 */

/*
    repeat(3) {
        GlobalScope.launch {
            println("Hi from ${Thread.currentThread()}")
        }
    }
 */

/*

        var count = 0
        for (i in 1..50) {
            Thread {
                count++
                println("Thread : $i , count : $count ")
            }.start()
        }

 */

/*

    /*
        thread {
            println("New Thread is created : ${Thread.currentThread().name}")

            Thread.sleep(3000)

            println("New Thread is running :  ${Thread.currentThread().name}")

        }
     */



//    Thread.sleep(3000)

        runBlocking {

            println("Main program starts : ${Thread.currentThread().name}")

            GlobalScope.launch {
                println("New coroutine created ")

                myDelayTime(1000)

                println("New coroutine running ")
            }

            myDelayTime(3000)

            println("Main program starts : ${Thread.currentThread().name}")
        }

        suspend fun myDelayTime(time : Long) {
            delay(time)
        }

 */

/*

        * second example

        val states = arrayOf("Starting" , "Doing task 1" , "Doing task 2" , "Ending")

        repeat(3) {
            Thread {
                println("${Thread.currentThread().name} has started")
                for (i in states) {
                    println("${Thread.currentThread()} - $i")
                    Thread.sleep(1000)
                }
            }.start()
        }

        //another one
         val person = Person()

        person.apply {
           this.name = "Uru"
           this.contactNumber = "9429957789"
           this.address = "Earth"
        }

        person.run {
            this.name = "Natu"
        }

        println(person.name)

        val name = person.name?.let {
            println(it)
        }

 */