package ml.bimdev.homework1

class Eve(var planet: String?, var isStorageFull: Boolean = false, var language: String) : SpaceRobot{
    override fun fly() {
        println("EVE is flying")
    }

    override fun goToTheServiceCenter() {
        println("EVE is going to service center")
    }

}