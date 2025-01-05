package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val  CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //1
        val que1 = Question(
            1,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            1,
            "Argentina", "Australia", "Africa", "Afghanistan"
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_australia,
            2,
            "Argentina", "Australia", "Africa", "Afghanistan"
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            4,
            "Venezuela", "Belize", "Benin", "Belgium"
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            2,
            "Belarus", "Brazil", "Bahamas", "Bogota"
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            3,
            "Dominica", "Dominican Republic", "Denmark", "Democratic Republic of Congo"
        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            1,
            "Fiji", "Fukuoka", "French", "Finland"
        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_india,
            2,
            "Ireland", "India", "Iceland", "Israel"
        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            4,
            "Kenya", "Korea", "Kazakhstan", "Kuwait"
        )
        questionsList.add(que8)

        //9
        val que9 = Question(
            9,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            3,
            "Australia", "Nicaragua", "New Zealand", "Tuvalu"
        )
        questionsList.add(que9)

        //10
        val que10 = Question(
            10,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_germany,
            2,
            "Greenland", "Germany", "Guatemala", "Greece"
        )
        questionsList.add(que10)
        return questionsList
    }
}