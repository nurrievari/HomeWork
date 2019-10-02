package ml.bimdev.homework1

class Walle(var backpackCapacity: Int = 10, var areTracksOn: Boolean, var homeCoordinats: Int?) : EarthRobot{
    override fun ride() {
        println("WALL.E is riding")
    }

    override fun findSpares() {
        println("WALL.E is looking for spares")
    }
}