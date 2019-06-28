class Variables {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var a: String = "initial"
            println(a)
            val b: Int = 1
            val c = 3

            // Null Safety
            var neverNull: String = "This can't be null"
            //neverNull = null

            var nullable: String? = "You can keep a null here"
            nullable = null

            var inferredNonNull = "The compiler assumes non-null"
            //inferredNonNull = null

            fun strLength(notNull: String): Int {
                return notNull.length
            }

            strLength(neverNull)
            //strLength(nullable)

            // Working with Nulls
            println(describeString(null))

        }

        fun describeString(maybeString: String?): String {
            if (maybeString != null && maybeString.length > 0) {
                return "String of length ${maybeString.length}"
            } else {
                return "Empty or null string"
            }
        }

    }
}
