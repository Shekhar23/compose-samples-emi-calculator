package co.`in`.shekharpande.emicalculter.bean

data class EMI(
    var principal: Double,
    var rate: Double,
    var numberOfEmi: Double,
    var amountOfEMI: Double,
    var amountOfTotalInterest: Double,
    var total: Double
)