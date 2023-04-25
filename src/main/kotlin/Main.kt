import java.util.Queue

fun main(){
    var str = randomStr("alice")
    println(str)
    //
    multiple()
    //
    var current = CurrentAccount(3452676,"Osorio Juana",34555.90)
    current.depositAmount(30000.50)
    current.withdraw(3000.0)
    current.details()
    println(current.accountName)
    println(current.balance)
    println(current.accountNumber)
    //
    var savings = SavingsAccount(3452676,"Osorio Juan",890700.00)
    savings.withdraw(20000)
    println(savings.balance)
    //

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun randomStr(random:String){
    var random1 = random.first()
    var random2 = random.length
    var random3 = random.last()

    if (random.startsWith('a')|| random.startsWith('e')||random.startsWith('i')||random.startsWith('o')||random.startsWith('u')){
        return true
    }else
        return false
}
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun depositAmount(amount:Double){
        balance+=amount
        println(balance)
    }
    fun withdraw(amount:Double){
       balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
class SavingsAccount( accountNumber:Int, accountName:String, balance: Double):CurrentAccount(accountNumber,accountName,balance){
    fun withdraw(withdrawals:Int){
        if (withdrawals<4){
            println("Withdraw from another account")
            withdrawals++
        }
    }
}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiple(){
    for (n in 1..1000){
        if (n%6==0 && n%8==0){
            println("Bingo")
        }
    }
}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun pass(password:String){
        for (p in password){
            if (p in password 8..16)
        }

}