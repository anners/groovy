//beer.groovy
println "Welcome to Anners Brew"
println "On tap we have:"

//list of beers
def taplist = [ipa:5.00, lager:4.50, esb:5.50, dunkel:5.00, stout:4.75]
taplist.each { k, v -> println "${k}" }

def beer = System.console().readLine("What would you like to drink? ")

if ( taplist.containsKey(beer) ) {
//print price
	println "Here is your $beer"
	println ("You owe me $" +  taplist["${beer}"])
} else {
//make taplist print a method
	println "Sorry we don't have your beer"
} 


