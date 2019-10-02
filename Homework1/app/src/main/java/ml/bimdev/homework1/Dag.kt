package ml.bimdev.homework1

class Dag(var cleaningProgress: Int = 0, var alienPollutant: String?, var isDagOnLine: Boolean) : SpaceRobot {
    override fun fly() {
        println("DAG is flying")
    }

    override fun goToTheServiceCenter() {
        println("DAG is going to service center")
    }
}