package sessionissue328

class Book {

    String title

    static belongsTo = [author: Person]
    static constraints = {
    }
}
