sealed class Operator(val x: Long){
    abstract fun calculate(y: Long): Long

    class add(x: Long) : Operator(x) {
        override fun calculate(y: Long): Long {
            return x + y
        }
    }
    class sub(x: Long) : Operator(x) {
        override fun calculate(y: Long): Long {
            return x - y
        }
    }
    class multi(x: Long) : Operator(x) {
        override fun calculate(y: Long): Long {
            return x * y
        }
    }
    class div(x: Long) : Operator(x) {
        override fun calculate(y: Long): Long {
            return x / y
        }
    }

}