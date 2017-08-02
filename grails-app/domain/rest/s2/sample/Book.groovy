package rest.s2.sample

class Book {
    // 属性
    String name
    String author

    // 制約
    static constraints = {
        name blank: false
        author blank: false
    }
}
