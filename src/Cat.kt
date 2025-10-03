class Cat (val name: String, var age: Int, var weight: Int) {

    fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    fun eat(amount: Int) : Boolean {
        val tempWeight = weight + amount
        if (tempWeight <= 20) {
            weight = tempWeight
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}