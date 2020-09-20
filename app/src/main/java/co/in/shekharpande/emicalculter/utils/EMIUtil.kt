package co.`in`.shekharpande.emicalculter.utils

import co.`in`.shekharpande.emicalculter.bean.EMI

open class EMIUtil {
    private fun calcEmi(p: Double, r: Double, n: Double): Double {
        val R = r / 12 / 100
        return p * R * Math.pow(1 + R, n) / (Math.pow(1 + R, n) - 1)
    }

    fun calcEmiAllMonths(p: Double, r: Double, n: Double) :EMI {
        val emi :EMI
        val rate = r / 12 / 100
        var principal = p
        val emiAmt = calcEmi(principal, r, n)
        val totalInt = Math.round(emiAmt * n - p).toDouble()
        val totalAmt = Math.round(emiAmt * n).toDouble()
        println("***************************")
        println(" Principal-> $principal")
        println(" Rate of Interest-> $r")
        println(" Number of Months-> $n")
        println(" EMI -> " + Math.round(emiAmt))
        println(" Total Interest -> $totalInt")
        println(" Total Amount -> $totalAmt")
        println("***************************")
        var intPerMonth = Math.round(totalInt / n).toDouble()
        var i = 1.0
        while (i <= n) {
            intPerMonth = principal * rate
            principal = principal - (emiAmt - intPerMonth)
            println(" Month -> " + i.toInt())
            println(
                " Interest per month -> "
                        + Math.round(intPerMonth)
            )
            println(
                " Principal per month -> "
                        + Math.round(emiAmt - intPerMonth)
            )
            println(" Balance Principal -> " + Math.round(principal))
            println("***************************")
            i++
        }
        emi = EMI(p,r,n,emiAmt,totalInt,totalAmt)
        return emi
    }
}