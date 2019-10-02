package ml.bimdev.homework1

class Auto(var captainName: String?, var isPlantOnTheShip: Boolean, var currentFloor: Int = 1) : SpaceRobot {
    override fun fly() {
        println("AUTO is flying")
    }

    override fun goToTheServiceCenter() {
        println("AUTO is going to service center")
    }
}