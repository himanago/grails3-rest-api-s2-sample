package rest.s2.sample

class Publisher {
    String name
    boolean enabled = true
    Date dateCreated
    Date lastUpdated

    static constraints = {
        name blank: false
        enabled()
        dateCreated()
        lastUpdated()
    }
}
