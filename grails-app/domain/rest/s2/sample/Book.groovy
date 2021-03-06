package rest.s2.sample

class Book {
    // 属性
    String name
    String author
    Publisher publisher
    boolean enabled = true
    Date dateCreated
    Date lastUpdated

    // 制約
    static constraints = {
        name blank: false
        author blank: false
        publisher()
        enabled()
        dateCreated()
        lastUpdated()
    }
}
