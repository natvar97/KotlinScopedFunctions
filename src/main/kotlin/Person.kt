import javax.print.DocFlavor

class Person() {
    var name : String? = null
    var contactNumber : String? = null
    var address : String? = null

    fun personDetails() : String {
        return "Name : $name ,\n Contact Number : $contactNumber \n , Address : $address"
    }

}
