package sessionissue328

class Person {
    String name

    static hasMany = [books: Book]
    static constraints = {
    }
}
