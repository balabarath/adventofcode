package `2022`

class AOCConstants {
    companion object {
        private const val RESOURCE_PATH = "./src/main/resources"

        fun filePath(name: String): String {
            return "$RESOURCE_PATH/$name";
        }
    }
}