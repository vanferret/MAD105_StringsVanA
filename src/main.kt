import kotlin.test.todo

fun main() {
    //Define our arrays of items and quantities
    val questions = arrayOf("What is the name of the warthog in Disney's The Lion King?",
                            "What is the name of the meerkat in Disney's The Lion King?",
                            "What type of animal is Rafiki in Disney's The Lion King?",
                            "What is the name of the king at the beginning of Disney's The Lion King?",
                            "What is the name of the king at the end of Disney's The Lion King?")
    val answers = arrayOf("Puumba","Timon","Baboon","Mufasa","Simba")
    //Create the array of arrays to hold them
    var mega = arrayOf<Array<String>>()

    // Let's tack the arrays onto the big boy
    mega += questions
    mega += answers

    // And to track the # of questions, and how many are correct
    val totalquestions = questions.size
    var totalcorrect = 0

    //loop the item count, and grab from the positions we know for item and quantity
    //This will be the one for listing them all out
    fun askquestion(qNum: Int) {
        //let's grab the question
        val askQ = mega[0][qNum - 1]
        val answer = mega[1][qNum - 1]

        println(askQ)
        val response = readLine()!!.toString()

        if (response.equals(answer, ignoreCase = true)){
            totalcorrect += 1
            println("Hooray! That response was correct!")
        } else {
            println("Boo... That response was incorrect.")
        }

    }

    // Start asking questions
    for (i in 1..totalquestions){
        askquestion(i)
    }

    //Report out the final result
    println("You got $totalcorrect out of $totalquestions correct!")

}